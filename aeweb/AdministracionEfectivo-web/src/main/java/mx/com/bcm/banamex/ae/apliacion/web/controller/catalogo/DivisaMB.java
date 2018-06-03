package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;


/**
 * @author oca JUAN MANUEL HERNANDEZ NAVARRO
 * 
 */
@ManagedBean(name="divisaMB")
@RequestScoped
public class DivisaMB implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private DivisaVO divisaVO;
	
	
	public DivisaMB(){
		divisaVO=new DivisaVO();
	}
	
	public void consultaDivisa() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoDivisaBO().consultDivisas();
		
	}

	/**
	 * @return the divisasVO
	 */
	public DivisaVO getDivisaVO() {
		return divisaVO;
	}

	/**
	 * @param divisasVO the divisasVO to set
	 */
	public void setDivisaVO(DivisaVO divisasVO) {
		this.divisaVO = divisasVO;
	}
	
	

}
