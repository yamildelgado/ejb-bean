package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.captura.bo.InicioFinTurnoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CajaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.FechaContableAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.HistTurnoEnOperacionAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.TurnoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoFechasContablesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.HistTurnoEnOperacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.HistTurnoEnOperacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;
/*
 * @author: ING . SIST. COMP OMAR ARTURO LOPEZ RODRIGUEZ
 */


public @Stateless class InicioFinTurnoBOImplBeanLocal implements InicioFinTurnoBOBeanLocal  {

	@EJB private CatalogoTurnoDAOBeanLocal turnoDAO;
	@EJB private HistTurnoEnOperacionDAOBeanLocal histTurnoDAO;
	@EJB private CatalogoFechasContablesDAOBeanLocal fechaContable;
	@EJB private CatalogoTurnoDAOBeanLocal turno;
	@EJB private CatalogoSubBovedaDAOBeanLocal subBovedaDAO;
	@EJB private CatalogoCajaDAOBeanLocal cajaDAO;
	
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<TurnoVO> obtenerTurnorPorSubBoveda(int subBoveda) {
		// TODO Auto-generated method stub
		List<Turno> listaTurno = new ArrayList<Turno>();
		List<TurnoVO> listaTurnoVO = new ArrayList<TurnoVO>();
		
		listaTurno = this.turnoDAO.buscarTurnoPorSubBoveda(subBoveda);
		 for(Turno elemento : listaTurno){
			 TurnoVO turnoVO = TurnoAssambler.getTurnoIniFinTurnoVO(elemento);
			 listaTurnoVO.add(turnoVO);
		 }			
		
		
		
		return listaTurnoVO;
	}
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<HistTurnoEnOperacionVO> obtenerHistTurnoEnOperacion(TurnoVO turnoVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		List<HistTurnoEnOperacion> listaHistTurno = new ArrayList<HistTurnoEnOperacion>();
		List<HistTurnoEnOperacionVO> listaHistTurnoVO = new ArrayList<HistTurnoEnOperacionVO>();
		
		listaHistTurno = this.histTurnoDAO.consultarHistTurnoEnOperacion(turnoVO.getTurnoId());
		 for(HistTurnoEnOperacion elemento : listaHistTurno){
			 HistTurnoEnOperacionVO histTurnoVO = HistTurnoEnOperacionAssambler.getHistTurnoEnOperacionVO(elemento);
			 histTurnoVO.setDescripcionTurno(turnoVO.getTurDescripcion());
			 listaHistTurnoVO.add(histTurnoVO);
		 }			
		
		
		
		return listaHistTurnoVO;
	
	}
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<HistTurnoEnOperacionVO> obtnerHistTurno(List<TurnoVO> listaTurnoVO) throws EfectivoAplicacionBOException {
		List<HistTurnoEnOperacionVO> listHistTurnoAuxVO = new ArrayList<HistTurnoEnOperacionVO>();
		List<HistTurnoEnOperacionVO> listHistTurnoAux2VO = new ArrayList<HistTurnoEnOperacionVO>();

		for (TurnoVO elemento : listaTurnoVO) {

			listHistTurnoAuxVO = this.obtenerHistTurnoEnOperacion(elemento);

			
			for (HistTurnoEnOperacionVO elemento2 : listHistTurnoAuxVO) {
				listHistTurnoAux2VO.add(elemento2);
			}
			

		}
		return listHistTurnoAux2VO;

	}
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public FechaContableVO obtenerFechaContableActual()	throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException {
		FechaContable fechaContable = new FechaContable();
		FechaContableVO fechaContableVO = new FechaContableVO();
					fechaContable = this.fechaContable.obtenerFechaContableActiva();
					fechaContableVO = FechaContableAssambler.getFechaContableVO(fechaContable);
					
		
		return fechaContableVO;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void addHistTurnoEnOperacion(HistTurnoEnOperacionVO histTurnoEnOperacionVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		HistTurnoEnOperacion histTurnoEnOperacion = HistTurnoEnOperacionAssambler.getHistTurnoEnOperacion(histTurnoEnOperacionVO);
				
		try {
			histTurnoEnOperacion.setFeccontIdn(this.fechaContable.obtenerFechaContableActiva());
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		histTurnoEnOperacion.setTurno(this.turno.findById(histTurnoEnOperacionVO.getTurnoId()));
		
		this.histTurnoDAO.persist(histTurnoEnOperacion);
			
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editHistTurnoEnOperacion(HistTurnoEnOperacionVO histTurnoEnOperacionVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		HistTurnoEnOperacion histTurnoEnOperacion = HistTurnoEnOperacionAssambler.getHistTurnoEnOperacion(histTurnoEnOperacionVO);
				
		histTurnoEnOperacion.setFeccontIdn(this.fechaContable.findById(DateFormateHelper.getFechaDate(histTurnoEnOperacionVO.getFeccontIdn())));
		histTurnoEnOperacion.setTurno(this.turno.findById(histTurnoEnOperacionVO.getTurnoId()));
		
		this.histTurnoDAO.merge(histTurnoEnOperacion);
			
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editTurno(TurnoVO turnoVO , Short subBovedaId) throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException {
		// TODO Auto-generated method stub
		
		Turno turno = TurnoAssambler.getTurno(turnoVO);
		turno.setSubBoveda(this.subBovedaDAO.obtenerSubBoveda(subBovedaId ) );
				
		
		this.turnoDAO.merge(turno);
			
	}
	@Override
	public List<CajaVO> getCajasPorTurnoVO(String turnoId) throws EfectivoAplicacionBOException,
			EfectivoAplicacionDAOException {
		// TODO Auto-generated method stub
		List<CajaVO> listaCajasVO = new ArrayList<CajaVO>();
		List<Caja> listaCajas = new ArrayList<Caja>();
		listaCajas = this.cajaDAO.buscarCajasPorTurno(turnoId);
		for(Caja elemento : listaCajas){
			CajaVO cajaVO = CajaAssambler.getCajaVOPorTurno(elemento);
			listaCajasVO.add(cajaVO);
		}
				
		
		
		return listaCajasVO;
		
		
		
	}
	
	

}
