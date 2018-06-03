package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;



import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;
import net.sf.jasperreports.engine.JRException;



/**
 * @author JESÚS AGUILAR LÓPEZ 
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="turnoGridMB")
@RequestScoped



public class TurnoGridMB implements Serializable {

	
	
	private TurnoVO turnoVO; 
	
	
	
	
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<TurnoVO> listaTurno;
	private GlobalReportAbstract reportTurno;
	private MensajeAewebVO mensajeError;
	
	@PostConstruct
	public void init(){ 
		try {
			this.turnoVO=new TurnoVO();
			this.listaTurno=this.catalogoFacade.getCatalogoTurnoBO().consultaTurnos();
			//turnoVO= this.catalogoFacade.getCatalogoTurnoBO().consultaTurnoPorId(turnoVO);
		}catch (EfectivoAplicacionBOException e){
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
	
		
	
	}
	
	
	public void consultaTurnos() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoTurnoBO().consultaTurnos();
		
	}

	public List<TurnoVO> getListaTurno() {
		return listaTurno;
	}

	public void setListaTurno(List<TurnoVO> listaTurno) {
		this.listaTurno = listaTurno;
	}
	
	public void agregarTurno(ActionEvent event)throws EfectivoAplicacionBOException, Exception {
		
		if(this.turnoVO.getSubvobeda().isEmpty() ||
				this.turnoVO.getTurBajaLogica().isEmpty() ||
				this.turnoVO.getTurDescripcion().isEmpty() ||
				this.turnoVO.getTurHoraFin().isEmpty() ||
				this.turnoVO.getTurHoraInicio().isEmpty() ||
				this.turnoVO.getTurnoId().isEmpty() ||
				this.turnoVO.getTurStatus().isEmpty())
		{

			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ERROR_ALTA_CATALOGO.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			
		}else{

			if(this.catalogoFacade.getCatalogoTurnoBO().agregarTurno(this.turnoVO) == false){
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ERROR_ALTA_CATALOGO.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());

			}else{
				init();
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ALTA_CATALOGO.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());

	
			}
		}
		
	}
	public String obtenerTurno ( ){
	FacesContext facesContext = FacesContext.getCurrentInstance(); 
	Map<String, String> params = facesContext.getExternalContext().getRequestParameterMap();
	 String parametroObtenido =  params.get("idTurno");
	 return parametroObtenido;
	
	}
	
	
	public String consultaTurnoPorId()throws EfectivoAplicacionBOException {
	  // this.turnoVO.setTurIdTurno(obtenerTurno());
        //|||if (turnoVO.getTurnoId() !=null){ 		   

		//|||turnoVO = (TurnoVO) this.catalogoFacade.getCatalogoTurnoBO().consultaTurnos();
	
		
	//	 DateFormat df = new SimpleDateFormat(" HH:mm");
	//	 horai = df.format(turnoVO.getTurHoraInicio());
	//     horaf = df.format(turnoVO.getTurHoraFin());
		 
	//	this.horaIni = turnoVO.getTurHoraInicio();
	  
	//	this.idturno = turnoVO.getTurIdTurno();
	//    this.descripcion = turnoVO.getTurDescripcion();
	//  this.status = turnoVO.getTurStatus();
		
		
	  // }
    	return "turnosEdit";
		
	}
	
	
	public void editarTurno(ActionEvent event)throws EfectivoAplicacionBOException{
	    	
		if(this.turnoVO.getSubvobeda().isEmpty() ||
				this.turnoVO.getTurBajaLogica().isEmpty() ||
				this.turnoVO.getTurDescripcion().isEmpty() ||
				this.turnoVO.getTurHoraFin().isEmpty() ||
				this.turnoVO.getTurHoraInicio().isEmpty() ||
				this.turnoVO.getTurnoId().isEmpty() ||
				this.turnoVO.getTurStatus().isEmpty())
		{
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ERROR_ALTA_CATALOGO.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			
		}else{
			if(this.catalogoFacade.getCatalogoTurnoBO().editTurno(this.turnoVO) == false){
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ERROR_ALTA_CATALOGO.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());

			}else{
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ALTA_CATALOGO.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());

			}
		}
	
		
	}

	public TurnoVO getTurnoVO() {
		return turnoVO;
	}

	public void setTurnoVO(TurnoVO turnoVO) {
		this.turnoVO = turnoVO;
	}
	
	// limpiar campos en pantalla 
	
	public void refresh() {
	    FacesContext context = FacesContext.getCurrentInstance();
	    Application application = context.getApplication();
	    ViewHandler viewHandler = application.getViewHandler();
	    UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
	    context.setViewRoot(viewRoot);
	    context.renderResponse(); 
	     
	 }

	public String regresar(){
		turnoVO = new TurnoVO();
		return "turnosList"; 
	}
			
			
	public void generarRepore() throws JRException, IOException{
		
		reportTurno = new GlobalReportAbstract();
		reportTurno.prepararReporte(listaTurno,"turnos.jasper");
		this.reportTurno.PDF("ReporteCatTurno");
		
	}

	
	
	

	


}
