/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.GeneralVO;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ Describe : La clase muestra un ejemplo
 *         claro de como consumir servicios y concatena el valor de una cadena.
 */
@ManagedBean(name = "cuentaUnidadNegocioGridMB")
@RequestScoped
public class CuentaUnidadNegocioGridMB implements Serializable {

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

	public String consultaCuenta(ActionEvent event)
			throws EfectivoAplicacionBOException {

		//this.listaCuenta = this.catalogoFacade.getCatalogoCuentaBO().consultaParametrizada(this.generalVO);

		return "cuentaUnidadNegocioList";
	}

	public String consultaVerUnidadNegocioCuentaPorId() {

		
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
			this.generalVO = new GeneralVO();
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

}
