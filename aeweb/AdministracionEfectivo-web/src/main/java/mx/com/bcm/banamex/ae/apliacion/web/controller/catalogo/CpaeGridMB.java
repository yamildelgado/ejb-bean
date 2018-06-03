/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import net.sf.jasperreports.engine.JRException;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CpaeVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;



/**
 * @author Vázquez Reyes Eder Israel
 * 
 */
@ManagedBean(name="cpaeGridMB")
@ViewScoped
public class CpaeGridMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private CatalogoFacade catalogoFacade;
	private CpaeVO listaCpae;
	private List<CpaeVO> listCpae;
	private MensajeAewebVO mensajeError;
	private GlobalReportAbstract reportCpaes;
	Integer session = 4;
	
	
	@PostConstruct
	public void init(){
		
		 try {
		this.listaCpae=this.catalogoFacade.getCatalogoCpaeBO().consultaCpaes(session);		
		 	}
		 catch (EfectivoAplicacionBOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		try {
			mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		} catch (EfectivoAplicacionBOException e1) {
			
			e1.printStackTrace();
		}
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
	
		 										}
					}
	
	/**
	 * @return the listaCpae
	 */
	
	public CpaeVO getListaCpae() {
		return listaCpae;
	}

	/**
	 * @param listaCpae the listaCpae to set
	 */
	
	public void setListaCpae(CpaeVO listaCpae) {
		this.listaCpae = listaCpae;
	}
	public void generarReportes() throws JRException, IOException{
		reportCpaes = new  GlobalReportAbstract();
		listCpae = new ArrayList<CpaeVO>();
		listCpae.add(listaCpae);
		reportCpaes.prepararReporte(listCpae ,"Cpaes.jasper");
		reportCpaes.PDF("ReportesCatCpae");
		
	
	}
	
	
	
	
	
	
	
	public void addCpaes(ActionEvent event)throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoCpaeBO().addCpaes(listaCpae);	
				
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ALTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		
	
	}
	
	
	public void editCpaes(ActionEvent event)throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoCpaeBO().editCpaes(listaCpae);	
	
		 mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ACTUALIZACION_CATALOGO.getValue());
		 ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
	
		
	
	}

	public List<CpaeVO> getListCpae() {
		return listCpae;
	}

	public void setListCpae(List<CpaeVO> listCpae) {
		this.listCpae = listCpae;
	}
}
