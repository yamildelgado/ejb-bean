/**
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaCuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.GeneralVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ Describe : La clase muestra un ejemplo
 *         claro de como consumir servicios y concatena el valor de una cadena.
 */
@ManagedBean(name = "cuentaGridMB")
@RequestScoped
public class CuentaGridMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Servicio MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private CatalogoFacade catalogoFacade;
	private CuentaVO cuentaVO;
	private GeneralVO generalVO;
	private List<CuentaVO> listaCuenta;
	private CriteriaCuentaVO criteriaCuentaVO;
	private MensajeAewebVO mensajeError;
	
	
	public CuentaGridMB() {
		this.cuentaVO=new CuentaVO();
		this.listaCuenta=new ArrayList<CuentaVO>();
		
	}

	public String consultaCuenta(ActionEvent event) throws EfectivoAplicacionBOException {

		
		
		this.listaCuenta = this.catalogoFacade.getCatalogoCuentaBO().consultaParametrizada(this.criteriaCuentaVO);
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		return "cuentaUnidadNegocioList";
	}

	public String consultaVerCuenta() {

		try {
			
			String sirhid=UtileriaHelper.getParam("sirhid").trim();
			String cuenta=UtileriaHelper.getParam("cuenta").trim();
			String sucursalId=UtileriaHelper.getParam("sucursalId").trim();
			
			this.criteriaCuentaVO=new CriteriaCuentaVO();
			this.criteriaCuentaVO.setCntrtoNum(UtileriaHelper.getParam("numeroContrato").trim());
			this.criteriaCuentaVO.setCpaesEstructuraSirhIdn(Integer.parseInt(sirhid));
			this.criteriaCuentaVO.setCtaCuenta(Long.parseLong(cuenta));
			this.criteriaCuentaVO.setCtaSucursalId(Short.parseShort(sucursalId));
			this.criteriaCuentaVO.setUnegId(Short.parseShort(sucursalId));
			this.cuentaVO = this.catalogoFacade.getCatalogoCuentaBO().consultaCuentaPorId(this.criteriaCuentaVO);
        
			setCuentaVO(this.cuentaVO);
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.criteriaCuentaVO=new CriteriaCuentaVO();
		}
		return "cuentasUnidadNegocioEdit";

	}

	public CuentaVO getCuentaVO() {
		return cuentaVO;
	}

	/**
	 * @return the generalVO
	 */
	public GeneralVO getGeneralVO() {
		return generalVO;
	}

	/**
	 * @return the listaCuenta
	 */
	public List<CuentaVO> getListaCuenta() {
		return listaCuenta;
	}

	@PostConstruct
	public void init() {
		try {
			this.criteriaCuentaVO=new CriteriaCuentaVO();
			this.listaCuenta = this.catalogoFacade.getCatalogoCuentaBO().consultaCuentas();
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setCuentaVO(CuentaVO cuentaVO) {
		this.cuentaVO = cuentaVO;
	}

	/**
	 * @param generalVO
	 *            the generalVO to set
	 */
	public void setGeneralVO(GeneralVO generalVO) {
		this.generalVO = generalVO;
	}

	/**
	 * @param listaCuenta
	 *            the listaCuenta to set
	 */
	public void setListaCuenta(List<CuentaVO> listaCuenta) {
		this.listaCuenta = listaCuenta;
	}

	/**
	 * @return the criteriaCuentaVO
	 */
	public CriteriaCuentaVO getCriteriaCuentaVO() {
		return criteriaCuentaVO;
	}

	/**
	 * @param criteriaCuentaVO the criteriaCuentaVO to set
	 */
	public void setCriteriaCuentaVO(CriteriaCuentaVO criteriaCuentaVO) {
		this.criteriaCuentaVO = criteriaCuentaVO;
	}
	
	

}
