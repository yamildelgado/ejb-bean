package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;


/**
 * @author:  OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
 
@ManagedBean(name="denomDivisaMB")
@ViewScoped
public class DenominacionesDivisaMB implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;    
	
	@PostConstruct
	public void init(){
		
	}	
	
	
}