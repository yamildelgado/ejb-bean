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

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;



/**
 * @author JESUS CARBAJAL MONTES
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="diasInhabilesMB")
@RequestScoped
public class DiasInhabilesMB implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	/**
	 * @return the catalogoFacade
	 */
	public CatalogoFacade getCatalogoFacade() {
		return catalogoFacade;
	}
	/**
	 * @param catalogoFacade the catalogoFacade to set
	 */
	public void setCatalogoFacade(CatalogoFacade catalogoFacade) {
		this.catalogoFacade = catalogoFacade;
	}

}
