package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.captura.bo.AsginarTurnosBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CajaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.SubBovedaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.TurnoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.AsignarTurnosDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CajaDeTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurno;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurnoPK;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;


@Stateless
public class AsginarTurnosBOImplBeanLocal implements AsginarTurnosBOBeanLocal{
	
	@EJB private AsignarTurnosDAOBeanLocal asignarTurnosDAO;
	@EJB private CatalogoTurnoDAOBeanLocal catalogoTurnoDAOBeanLocal;
	@EJB private CatalogoCajaDAOBeanLocal catalogoCajaDAOBeanLocal;
	@EJB private CajaDeTurnoDAOBeanLocal cajaDeTurnoDAOBeanLocal;

	@Override
	public List<SubBovedaVO> consultaSubovedaCPAE() throws EfectivoAplicacionBOException {
		List<SubBovedaVO> listaSubovedas = new ArrayList<SubBovedaVO>();
		
		for(SubBoveda sub: asignarTurnosDAO.buscarBobedasPorCPAE(4060)){
			SubBovedaVO subBovedaVO = new SubBovedaVO();
			subBovedaVO = SubBovedaAssambler.getSubBovedaVO(sub);
			listaSubovedas.add(subBovedaVO);
		}
			
		return listaSubovedas;
	}

	@Override
	public List<TurnoVO> consultaTurnoSubBoveda(int subBovedaId) throws EfectivoAplicacionBOException {
		List<TurnoVO> listaTurnos = new ArrayList<TurnoVO>();
		
		for(Turno turno: catalogoTurnoDAOBeanLocal.buscarTurnoPorSubBoveda(subBovedaId)){
			TurnoVO turnoVO = new TurnoVO();
			turnoVO = TurnoAssambler.getTurnoVO(turno);
			listaTurnos.add(turnoVO);
		}
		return listaTurnos;
	}

	@Override
	public List<CajaVO> consultaCajaPorSubBoveda(int subBovedaId) throws EfectivoAplicacionBOException {
		List<CajaVO> listaCajas = new ArrayList<CajaVO>();
		
		try {
			for(Caja caja: catalogoCajaDAOBeanLocal.buscarCajasPorSubBoveda(subBovedaId)){
				CajaVO cajaVO = new CajaVO();
				List<CajasDeTurno> cajasDeTurnos = cajaDeTurnoDAOBeanLocal.buscarCajasDeTurnoPorCaja(caja.getCajaIdn());
				cajaVO = CajaAssambler.getCajaVOTipoCaja(caja,cajasDeTurnos);
				
				listaCajas.add(cajaVO);
			}
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCajas;
	}

	@Override
	public void instertarTurnos(List<CajaVO> cajasSeleccionadas,List<TurnoVO> turnosSeleccionados) {
		
		for(CajaVO cajaVO: cajasSeleccionadas){
			if(cajaVO.getSeleccion().equals(UtileriaHelper.AGREGAR)){
				
				Caja caja = new Caja();
				caja = catalogoCajaDAOBeanLocal.findById(cajaVO.getCajaIdn());
				
				for(TurnoVO turnoVO : turnosSeleccionados){
					CajasDeTurno agregarTurno = new CajasDeTurno();
					Turno turnos = new Turno();
					turnos = catalogoTurnoDAOBeanLocal.findById(turnoVO.getTurnoId());
					agregarTurno.setCajasDeTurnoPK(new CajasDeTurnoPK(caja.getCajaIdn(), turnos.getTurnoId()));
					agregarTurno.setTurno(turnos);
					
					agregarTurno.setCaja(caja);
					agregarTurno.setCajaxturnoBajaLogica(UtileriaHelper.ABIERTA);
					try {
						CajasDeTurno actualizarTurno = new CajasDeTurno();
						actualizarTurno = cajaDeTurnoDAOBeanLocal.buscarCajasDeTurnoPorCajaYTurno(cajaVO.getCajaIdn(), turnoVO.getTurnoId());
						if(actualizarTurno != null){
							actualizarTurno.setCajaxturnoBajaLogica(UtileriaHelper.ABIERTA);
							cajaDeTurnoDAOBeanLocal.merge(actualizarTurno);
						}else{
							cajaDeTurnoDAOBeanLocal.persist(agregarTurno);
						}
						
					} catch (EfectivoAplicacionDAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}else if(cajaVO.getSeleccion().equals(UtileriaHelper.QUITAR)){
				CajasDeTurno turnoQuitar = new CajasDeTurno();
			
				for (TurnoVO turnoVO : turnosSeleccionados){
					
					try {
						turnoQuitar = cajaDeTurnoDAOBeanLocal.buscarCajasDeTurnoPorCajaYTurno(cajaVO.getCajaIdn(), turnoVO.getTurnoId());
						if(turnoQuitar != null){
							
							turnoQuitar.setCajaxturnoBajaLogica(UtileriaHelper.CERRADA);
							cajaDeTurnoDAOBeanLocal.merge(turnoQuitar);
						}
					} catch (EfectivoAplicacionDAOException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
	}
	
	

}
