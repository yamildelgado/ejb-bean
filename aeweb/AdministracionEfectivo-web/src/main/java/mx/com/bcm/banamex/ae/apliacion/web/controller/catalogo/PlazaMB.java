package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.PlazaVO;

/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="plazaMB")
@RequestScoped

public class PlazaMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private PlazaVO plazaVO;
	
	
	public PlazaMB(){
		plazaVO=new PlazaVO();
	}
	
	public void consultaPlaza() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoPlazaBO().consultaPlaza();
		
	}

	/**
	 * @return the plazaVO
	 */
	public PlazaVO getPlazaVO() {
		return plazaVO;
	}

	/**
	 * @param plazaVO the plazaVO to set
	 */
	public void setPlazaVO(PlazaVO plazaVO) {
		this.plazaVO = plazaVO;
	}
	
}
