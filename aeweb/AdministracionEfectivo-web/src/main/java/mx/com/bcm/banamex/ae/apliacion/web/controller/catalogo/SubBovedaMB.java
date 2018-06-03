/*  Todos los Derechos Reservados 2013 BCM.
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
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;


/**
 * @author ABRAHAM ALFONSO TINAJERO SÁNCHEZ Describe : La clase muestra un
 *         ejemplo claro de como consumir servicios y concatena el valor de una
 *         cadena.
 */
@ManagedBean(name = "subBovedaMB")
@RequestScoped
public class SubBovedaMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private SubBovedaVO subBovedaVO;

	/**
	 * @return the cajaVO
	 */
	public SubBovedaVO getSubBovedaVO() {
		return subBovedaVO;
	}

	/**
	 * @param cajaVO
	 *            the cajaVO to set
	 */
	public void setSubBovedaVO(SubBovedaVO subBovedaVO) {
		this.subBovedaVO = subBovedaVO;
	}

}
