/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *   
 *   
 *   
 *   
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import net.sf.jasperreports.engine.JRException;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author INGRET AGUILAR VELAZQUEZ
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="cajaGridMB")
@RequestScoped
@ViewScoped
//@SessionScoped
public class CajaGridMB implements Serializable {
	
	private static final long serialVersionUID= 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<CajaVO> listaCaja;
	private CriterioCajaVO criterioCajaVO;
	UtileriaHelper params;
	private MensajeAewebVO mensajeError;
	private GlobalReportAbstract reportCaja;
//--------------------------------------------------
@PostConstruct
	public void init(){ 
		this.cajaVO = new CajaVO();
		criterioCajaVO = new CriterioCajaVO();
		
		try {
			List<CajaVO> lista_resultado = this.catalogoFacade.getCatalogoCajaBO().consultaCajaFiltros(this.criterioCajaVO);
			this.listaCaja = lista_resultado;
		} catch (EfectivoAplicacionBOException e) {
			try{mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CAJA_FILTRO.getValue());
					}catch (EfectivoAplicacionBOException e1){
				e1.printStackTrace();
			}
			ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		}
	}
//---------------------------------------------------

	public void PruebaAdd() throws EfectivoAplicacionBOException{
		cajaVO.setCajaBajaLogica("A");
		this.catalogoFacade.getCatalogoCajaBO().agregarCaja(this.cajaVO);

		mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.ALTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
	
		
	}
//----------------------------------------------------------------
	public String ConsultaEditCajas() throws EfectivoAplicacionBOException{
		
		String cajaId= UtileriaHelper.getParam("cajaIdn");
		String sub= UtileriaHelper.getParam("subbovedaIdn");
		
		this.criterioCajaVO.setCajaIdn(Short.parseShort(cajaId));
		this.criterioCajaVO.setSubbovedaIdn(Short.parseShort(sub));

		this.listaCaja = this.catalogoFacade.getCatalogoCajaBO()
				.consultaCajaFiltros(criterioCajaVO);
	
		this.cajaVO = this.listaCaja.get(0);
		criterioCajaVO = new CriterioCajaVO();
		
		return "cajaEdit";
	}
//--------------------------------------------------------------
public void editCajas() throws EfectivoAplicacionBOException {
		this.catalogoFacade.getCatalogoCajaBO().editCaja(cajaVO);
	}
//------------------------------------------------------------------------------
	public void consultaCajaFiltrosMB()
			throws EfectivoAplicacionBOException {
		
		
			this.criterioCajaVO.setCajaIdn(this.criterioCajaVO.getCajaIdn() == 0 ? null : this.criterioCajaVO.getCajaIdn());
		this.criterioCajaVO.setSubbovedaIdn(this.criterioCajaVO.getSubbovedaIdn() == 0 ? null : this.criterioCajaVO.getSubbovedaIdn());
		this.criterioCajaVO.setTipocajaId(this.criterioCajaVO.getTipocajaId()== 0 ? null : this.criterioCajaVO.getTipocajaId());
		if(this.criterioCajaVO.getCajaIpAddress().equals("")|| UtileriaHelper.ipAddress(this.criterioCajaVO.getCajaIpAddress())){
				List<CajaVO> lista_resultado = this.catalogoFacade.getCatalogoCajaBO().consultaCajaFiltros(this.criterioCajaVO);
		this.listaCaja = lista_resultado;
		criterioCajaVO = new CriterioCajaVO();
			if(this.listaCaja.size() == 0){
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CAJA_FILTRO.getValue());
			 ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
	}else{
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		}
		}
		else{
			mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.IPADDRESS.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
		}
		}
	
//------------------------------------------------------------------------------
	public String BtoLista() throws EfectivoAplicacionBOException{
		return "cajaList";
	}
//------------------------------------------------------------------------------
	public String BtoAgregarCaja() throws EfectivoAplicacionBOException{
	
		return "cajaAdd";
	}
//--------------------------------------------------------------------------------
public void editCaja(ActionEvent event) throws EfectivoAplicacionBOException {
		try{
			
		this.catalogoFacade.getCatalogoCajaBO().editCaja(cajaVO);
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
			
		}
		catch(EfectivoAplicacionBOException e) {
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CAJA_FILTRO.getValue());
			 ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
		}
	}
//------------------------------------------------------------------------------
	/**
	 * @return the listaCaja
	 */
	public List<CajaVO> getListaCaja() {
		return listaCaja;
	}
	private void setListaCaja(List<CajaVO> listaCaja){
		this.listaCaja = listaCaja;
	}
	private CajaVO cajaVO;
	/**
	 * @return the cajaVO
	 */
	public CajaVO getCajaVO() {
		return cajaVO;
	}
	/**
	 * @param cajaVO the cajaVO to set
	 */
	public void setCajaVO(CajaVO cajaVO) {
		this.cajaVO = cajaVO;
	}
	/**
	 * @return the criterioCajaVO
	 */
	public CriterioCajaVO getCriterioCajaVO() {
		return criterioCajaVO;
	}
	/**
	 * @param criterioCajaVO the criterioCajaVO to set
	 */
	public void setCriterioCajaVO(CriterioCajaVO criterioCajaVO) {
		this.criterioCajaVO = criterioCajaVO;
	}
	
	//-------------------------------------------------------------------------
	public void generarRepore() throws JRException, IOException{
		
		reportCaja = new  GlobalReportAbstract();
		
		//reportCaja.prepararReporte(listaCaja,"Cajas.jasper");
		this.reportCaja.PDF("ReporteCatCaja");
		
		
	}
}