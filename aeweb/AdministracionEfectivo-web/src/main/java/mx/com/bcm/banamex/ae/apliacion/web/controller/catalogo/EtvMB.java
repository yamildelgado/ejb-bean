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

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@ManagedBean(name="EtvMB")

@ViewScoped
public class EtvMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private EtvVO etvVO;
	
	@PostConstruct
	public void consultaEtv() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoEtvBO().consultaEtv();//.getCatalogoSIRHBO().consultOficina();
		
	}

	public EtvVO getEtvVO() {
		return etvVO;
	}

	public void setEtvVO(EtvVO etvVO) {
		this.etvVO = etvVO;
	}
	
	
}