package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;

import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.AtmVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAtmVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;




@ManagedBean(name="atmGridMB")
@ViewScoped
public class AtmGridMB implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB private CatalogoFacade catalogoFacade;
	  private List<AtmVO> listaAtm;
	  private CriterioAtmVO criterioAtmVO;
	  private MensajeAewebVO mensaje;
	  private String fecha ;
	  
	
	     
	
	@PostConstruct
	public void init(){
		criterioAtmVO = new CriterioAtmVO();
		
		
	}
	
	public void consultaAtm() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoAtmBO().consultAtms();
		
	}
	
	public void consultaAtmPorId(ActionEvent event)  throws EfectivoAplicacionBOException{
		/*
		this.listaAtm = new ArrayList<AtmVO>();
		this.listaAtm = this.catalogoFacade.getCatalogoAtmBO().consultAtmPorIdAtms(this.criterioAtmVO);
		if(this.listaAtm.isEmpty()){
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(
					CodigoMensajeType.CONSULTA_VACIA.getValue());
			ErrorMessageHelper.addErrorMessage(mensaje.getMensajeDescripcion());
			
		}
		else{
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(
					CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO
					.getValue());
			ErrorMessageHelper.addSuccessMessage(mensaje.getMensajeDescripcion());
			
		}
		criterioAtmVO = new CriterioAtmVO();*/
	}

	
	
	public List<AtmVO> getListaAtm() {
		AtmVO objetoUno = new AtmVO();
		AtmVO objetoDos = new AtmVO();
		AtmVO objetoTres = new AtmVO();
		AtmVO objetoCuatro = new AtmVO();
		this.listaAtm = new ArrayList<AtmVO>();
		
		objetoUno.setAtmIdn((short)2120);
		objetoUno.setAtmSirhAsignado((short)90);
		objetoUno.setAtmNumCtaUnicaAsoc((short) 90);
		objetoUno.setAtmTipoOficina("E");
		objetoUno.setAtmTipoInmueble( "2" );
		objetoUno.setAtmDescripcion("SAMS ANIMAS");
		this.listaAtm.add(objetoUno);
		
		objetoDos.setAtmIdn((short)2340);
		objetoDos.setAtmSirhAsignado((short)90);
		objetoDos.setAtmNumCtaUnicaAsoc((short) 90);
		objetoDos.setAtmTipoOficina("E");
		objetoDos.setAtmTipoInmueble( "2" );
		objetoDos.setAtmDescripcion("WALMART CUMBRES");
		this.listaAtm.add(objetoDos);
		
		objetoTres.setAtmIdn((short)2678);
		objetoTres.setAtmSirhAsignado((short)90);
		objetoTres.setAtmNumCtaUnicaAsoc((short) 90);
		objetoTres.setAtmTipoOficina("E");
		objetoTres.setAtmTipoInmueble( "2" );
		objetoTres.setAtmDescripcion("SORIANA AEROPUERTO");
		this.listaAtm.add(objetoTres);
		
		objetoCuatro.setAtmIdn((short)2777);
		objetoCuatro.setAtmSirhAsignado((short)90);
		objetoCuatro.setAtmNumCtaUnicaAsoc((short) 90);
		objetoCuatro.setAtmTipoOficina("E");
		objetoCuatro.setAtmTipoInmueble( "2" );
		objetoCuatro.setAtmDescripcion("HOTELES MISION 1");
		this.listaAtm.add(objetoCuatro);
		
		
		
		return listaAtm;
	}

	public void setListaAtm(List<AtmVO> listaAtm) {
		this.listaAtm = listaAtm;
	}

	/**
	 * @return the criterioAtmVO
	 */
	public CriterioAtmVO getCriterioAtmVO() {
		return criterioAtmVO;
	}

	/**
	 * @param criterioAtmVO the criterioAtmVO to set
	 */
	public void setCriterioAtmVO(CriterioAtmVO criterioAtmVO) {
		this.criterioAtmVO = criterioAtmVO;
	}

	public String getFecha() {
		
		Calendar c = new GregorianCalendar(); 
		   
		   String dia, mes, annio;
		   
		   dia = Integer.toString(c.get(Calendar.DATE));
		   mes = Integer.toString(c.get(Calendar.MONTH));
		   annio = Integer.toString(c.get(Calendar.YEAR));
		   
		   int hora, minutos, segundos;
		   hora =c.get(Calendar.HOUR_OF_DAY);
		   minutos = c.get(Calendar.MINUTE);
		   segundos = c.get(Calendar.SECOND);
		   
		   fecha = obtenerDiaSemana()+" "+ dia + "/" + mes +"/" + annio +"   Hora " +hora +":"+minutos;
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	private String  obtenerDiaSemana(){
	      String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
	        Date hoy=new Date();
	      int numeroDia=0;
	      Calendar cal= Calendar.getInstance();
	      cal.setTime(hoy);
	      numeroDia=cal.get(Calendar.DAY_OF_WEEK);
	      return  new String(dias[numeroDia - 1]);
	    }
	

	

}
