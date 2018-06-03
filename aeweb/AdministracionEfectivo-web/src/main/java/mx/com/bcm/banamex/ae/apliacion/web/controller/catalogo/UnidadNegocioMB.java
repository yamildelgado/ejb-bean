/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.vo.UnidadDeNegocioVO;


@ManagedBean(name="unidadNegocioMB")
@RequestScoped
public class UnidadNegocioMB implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UnidadDeNegocioVO unidadNegocioVO;

	@EJB	private CatalogoFacade catalogoFacade;
	
	
	
	
	





	/**
	 * @return the unidadNegocioVO
	 */
	public UnidadDeNegocioVO getUnidadNegocioVO() {
		return unidadNegocioVO;
	}





	/**
	 * @param unidadNegocioVO the unidadNegocioVO to set
	 */
	public void setUnidadNegocioVO(UnidadDeNegocioVO unidadNegocioVO) {
		this.unidadNegocioVO = unidadNegocioVO;
	}
	
	

}
