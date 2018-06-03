package mx.com.bcm.banamex.ae.apliacion.web.controller.captura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CajasPorTurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;



@SuppressWarnings("serial")
@ManagedBean(name="cajaTurnoGridMB")
@ViewScoped
public class AsignarCajasTurnoGridMB implements Serializable{
	
	@EJB private CapturaFacade capturaFacade;
	private List<CajaVO> tiposdeCajaRec;
	private List<CajaVO> tiposdeCajaVer;
	private List<CajaVO> tiposdeCajaAt;
	private List<CajaVO> tiposdeCajaOt;
	private List<CajaVO> cajasSeleccionadas;
	private List<CajaVO> cajas;
	private List<SubBovedaVO> listaSubBovedaVo;
	private List<TurnoVO> listaTurnoVO;
	private List<TurnoVO> turnosSeleccionados;
	private MensajeAewebVO mensaje;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(){
		
		try {
			
			tiposdeCajaVer = new ArrayList<CajaVO>();
			tiposdeCajaRec = new ArrayList<CajaVO>();
			tiposdeCajaAt = new ArrayList<CajaVO>();
			tiposdeCajaOt = new ArrayList<CajaVO>();
			listaTurnoVO = new ArrayList<TurnoVO>();
			cajas = new ArrayList<CajaVO>();
			
			TurnoVO turno = new TurnoVO();
			turno.setTurDescripcion("NOCTURNO");
			turno.setTurHoraInicio(new Date().toString());
			turno.setTurHoraFin(new Date().toString());
			turno.setTurStatus("ABIERTA");
			listaTurnoVO.add(turno);
			turno = new TurnoVO();
			turno.setTurDescripcion("VESPERTINO");
			turno.setTurHoraInicio(new Date().toString());
			turno.setTurHoraFin(new Date().toString());
			turno.setTurStatus("CERRADA");
			listaTurnoVO.add(turno);
			
			CajaVO caja = new CajaVO();
			List<CajasPorTurnoVO> listaCajasPorTurno = new ArrayList<CajasPorTurnoVO>();
			CajasPorTurnoVO cajasPorTurno = new CajasPorTurnoVO();
			cajasPorTurno.setTurnoDescr("Nocutrno");
			listaCajasPorTurno.add(cajasPorTurno);
			cajasPorTurno = new CajasPorTurnoVO();
			cajasPorTurno.setTurnoDescr("Vespertino");
			listaCajasPorTurno.add(cajasPorTurno);
			caja.setCajaIdn((short) 1);
			caja.setAewebcatgralDescripcion("RECEPTORA");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaRec.add(caja);
			caja = new CajaVO();
			caja.setCajaIdn((short) 2);
			caja.setAewebcatgralDescripcion("RECEPTORA");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaRec.add(caja);
			
			caja = new CajaVO();
			caja.setCajaIdn((short) 3);
			caja.setAewebcatgralDescripcion("VERIFICADORA");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaVer.add(caja);
			caja = new CajaVO();
			caja.setCajaIdn((short) 4);
			caja.setAewebcatgralDescripcion("PICO");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaVer.add(caja);
			
			caja = new CajaVO();
			caja.setCajaIdn((short) 5);
			caja.setAewebcatgralDescripcion("ATENCION A CLIENTES");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaAt.add(caja);
			caja = new CajaVO();
			caja.setCajaIdn((short) 6);
			caja.setAewebcatgralDescripcion("ATENCION A CLIENTES");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaAt.add(caja);
			
			caja = new CajaVO();
			caja.setCajaIdn((short) 7);
			caja.setAewebcatgralDescripcion("OTRAS");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaOt.add(caja);
			caja = new CajaVO();
			caja.setCajaIdn((short) 8);
			caja.setAewebcatgralDescripcion("OTRAS");
			caja.setCajasTurno(listaCajasPorTurno);
			tiposdeCajaOt.add(caja);
			
			/*listaTurnoVO = capturaFacade.getAsginarTurnosBOBeanLocal().consultaTurnoSubBoveda(1);
			cajas =  capturaFacade.getAsginarTurnosBOBeanLocal().consultaCajaPorSubBoveda(1);
			
			for(CajaVO cajaVO : cajas){
				if(cajaVO.getAewebcatgralIdn() == UtileriaHelper.VERIFICADORA_MONEDAS || cajaVO.getAewebcatgralIdn() == UtileriaHelper.VERIFICADORA_BILLETES || cajaVO.getAewebcatgralIdn() == UtileriaHelper.PICO_BILLETES
						|| cajaVO.getAewebcatgralIdn() == UtileriaHelper.PICO_MONEA){
					tiposdeCajaVer.add(cajaVO);
				}
				if(cajaVO.getAewebcatgralIdn() == UtileriaHelper.RECEPTORA){
					tiposdeCajaRec.add(cajaVO);
				}
				if(cajaVO.getAewebcatgralIdn() == UtileriaHelper.ATENCION_CLIENTES){
					tiposdeCajaAt.add(cajaVO);
				}
				if(cajaVO.getAewebcatgralIdn() == UtileriaHelper.OTROS ){
					tiposdeCajaOt.add(cajaVO);
				}
			}*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public String aplicarCambios()  throws EfectivoAplicacionBOException{
		
		//asignarListas();
		//capturaFacade.getAsginarTurnosBOBeanLocal().instertarTurnos(cajasSeleccionadas, turnosSeleccionados);
		//init();
		return null;
	}
	
	
	public void asignarListas(){
		
		turnosSeleccionados = new ArrayList<TurnoVO>();
		cajasSeleccionadas = new ArrayList<CajaVO>();
		
		for(TurnoVO turno: listaTurnoVO){
			if(turno.isSeleccionar()){
				turnosSeleccionados.add(turno);
			}
		}
		
		for(CajaVO caja: tiposdeCajaVer){
			System.out.println(caja.getSeleccion());
			if(caja.getSeleccion().equals(UtileriaHelper.AGREGAR) || caja.getSeleccion().equals(UtileriaHelper.QUITAR)){
				
				cajasSeleccionadas.add(caja);
			}
		}
		
		for(CajaVO caja: tiposdeCajaAt){
			if(caja.getSeleccion().equals(UtileriaHelper.AGREGAR) || caja.getSeleccion().equals(UtileriaHelper.QUITAR)){
				cajasSeleccionadas.add(caja);
			}
		}
		
		for(CajaVO caja: tiposdeCajaOt){
			if(caja.getSeleccion().equals(UtileriaHelper.AGREGAR) || caja.getSeleccion().equals(UtileriaHelper.QUITAR)){
				cajasSeleccionadas.add(caja);
			}
		}
		
		for(CajaVO caja: tiposdeCajaRec){
			if(caja.getSeleccion().equals(UtileriaHelper.AGREGAR) || caja.getSeleccion().equals(UtileriaHelper.QUITAR)){
				cajasSeleccionadas.add(caja);
			}
		}
		
	}
	
	/**
	 * @return the listaSubBovedaVo
	 */
	public List<SubBovedaVO> getListaSubBovedaVo() {
		return listaSubBovedaVo;
	}

	/**
	 * @param listaSubBovedaVo the listaSubBovedaVo to set
	 */
	public void setListaSubBovedaVo(List<SubBovedaVO> listaSubBovedaVo) {
		this.listaSubBovedaVo = listaSubBovedaVo;
	}

	/**
	 * @return the listaTurnoVO
	 */
	public List<TurnoVO> getListaTurnoVO() {
		return listaTurnoVO;
	}

	/**
	 * @param listaTurnoVO the listaTurnoVO to set
	 */
	public void setListaTurnoVO(List<TurnoVO> listaTurnoVO) {
		this.listaTurnoVO = listaTurnoVO;
	}

	/**
	 * @return the tiposdeCajaRec
	 */
	public List<CajaVO> getTiposdeCajaRec() {
		return tiposdeCajaRec;
	}

	/**
	 * @param tiposdeCajaRec the tiposdeCajaRec to set
	 */
	public void setTiposdeCajaRec(List<CajaVO> tiposdeCajaRec) {
		this.tiposdeCajaRec = tiposdeCajaRec;
	}

	/**
	 * @return the tiposdeCajaVer
	 */
	public List<CajaVO> getTiposdeCajaVer() {
		return tiposdeCajaVer;
	}

	/**
	 * @param tiposdeCajaVer the tiposdeCajaVer to set
	 */
	public void setTiposdeCajaVer(List<CajaVO> tiposdeCajaVer) {
		this.tiposdeCajaVer = tiposdeCajaVer;
	}

	/**
	 * @return the tiposdeCajaAt
	 */
	public List<CajaVO> getTiposdeCajaAt() {
		return tiposdeCajaAt;
	}

	/**
	 * @param tiposdeCajaAt the tiposdeCajaAt to set
	 */
	public void setTiposdeCajaAt(List<CajaVO> tiposdeCajaAt) {
		this.tiposdeCajaAt = tiposdeCajaAt;
	}

	/**
	 * @return the tiposdeCajaOt
	 */
	public List<CajaVO> getTiposdeCajaOt() {
		return tiposdeCajaOt;
	}

	/**
	 * @param tiposdeCajaOt the tiposdeCajaOt to set
	 */
	public void setTiposdeCajaOt(List<CajaVO> tiposdeCajaOt) {
		this.tiposdeCajaOt = tiposdeCajaOt;
	}

	
	

		
	
}
