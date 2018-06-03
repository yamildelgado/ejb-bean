/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.util.*;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import net.sf.jasperreports.engine.JRException;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaMayorVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;







/**
 * @author ABRAHAM DANIEL DIAZ KIM
 *  
 * 
 */
@ManagedBean(name="cuentaMayorGridMB")
@RequestScoped
 
public class CuentaMayorGridMB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CuentaMayorVO cuentaMayorVO;
	private GlobalReportAbstract reportCuentasMayor;
	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	@EJB 
	private CatalogoFacade catalogoFacade;
	private List<CuentaMayorVO> listaCuentaMayor;
	private MensajeAewebVO mensajeSistema;
	
	
	@PostConstruct
	public void init(){
		 try {
			this.cuentaMayorVO=new CuentaMayorVO();
			
			this.consultaCuentaMayor();
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	/**
	 * @return the listaCuentaMayor
	 */
	public List<CuentaMayorVO> getListaCuentaMayor() {
		return listaCuentaMayor;
	}

	/**
	 * @param listaCuentaMayor the listaBanco to set
	 */
	public void setListaCuentaMayor(List<CuentaMayorVO> listaCuentaMayor) {
		this.listaCuentaMayor = listaCuentaMayor;
	}


	public String obtenerCuentaMayor ( ){
	FacesContext facesContext = FacesContext.getCurrentInstance(); 
	Map<String, String> params = facesContext.getExternalContext().getRequestParameterMap();
	 String parametroObtenido =  params.get("conceptoId");
	 return parametroObtenido;
	
	}
	
	public void consultaCuentaMayor() throws EfectivoAplicacionBOException{
		this.listaCuentaMayor=this.catalogoFacade.getCuentaMayorBO().consultaCuentaMayor();
		
	}
	
	public void consultaCuentaMayorEdit() throws EfectivoAplicacionBOException {
		
		this.catalogoFacade.getCuentaMayorBO().editCuentaMayor(this.cuentaMayorVO);
		
		
	}
	
	public String consultaCuentaMayorPorId()throws EfectivoAplicacionBOException {
		if (cuentaMayorVO.getConceptoId() !=null){ 		    
			  
			cuentaMayorVO = this.catalogoFacade.getCuentaMayorBO().consultaCuentaMayorPorId(cuentaMayorVO.getConceptoId());
			
		}
    	return "cuentaMayorEdit";	
	}

	
	
	public void editarCuentaMayor(ActionEvent event)throws EfectivoAplicacionBOException{
		try{		
				this.catalogoFacade.getCuentaMayorBO().editCuentaMayor(this.cuentaMayorVO);	
				this.consultaCuentaMayor();
				
				mensajeSistema = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.ACTUALIZACION_CATALOGO.getValue());
				ErrorMessageHelper.addSuccessMessage(mensajeSistema
						.getMensajeDescripcion());
		}catch(EfectivoAplicacionBOException e){
			mensajeSistema = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.DATO_INCORRECTO.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeSistema
					.getMensajeDescripcion());
			
			
		}		
							
	}
	

	public CuentaMayorVO getcuentaMayorVO() {
		return cuentaMayorVO;
	}

	public void setcuentaMayorVO(CuentaMayorVO cuentaMayorVO) {
		this.cuentaMayorVO = cuentaMayorVO;
	}
	
	
	public void refresh() {
		
		FacesContext context = FacesContext.getCurrentInstance();
	    Application application = context.getApplication();
	    ViewHandler viewHandler = application.getViewHandler();
	    UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
	    context.setViewRoot(viewRoot);
	    context.renderResponse();
	    
	   
	 }

	public void generarRepore() throws JRException, IOException, EfectivoAplicacionBOException{
		
		reportCuentasMayor = new  GlobalReportAbstract();
		
		reportCuentasMayor.prepararReporte(listaCuentaMayor,"CuentasDeMayor.jasper");
		this.reportCuentasMayor.PDF("ReporteCatCuentasMayor");
		
		mensajeSistema = this.catalogoFacade.getCatalogoMensajeAewebBO()
				.consultaCatalogoMensajePorCodigo(
						CodigoMensajeType.REPORTE_GENERADO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeSistema
				.getMensajeDescripcion());
		
		
	}
	
	
}