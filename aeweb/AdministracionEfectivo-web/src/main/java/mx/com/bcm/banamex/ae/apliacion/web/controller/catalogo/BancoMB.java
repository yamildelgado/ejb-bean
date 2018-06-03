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
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.BancoVO;


/**
 * @author JESUS CARBAJAL MONTES
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="bancoMB")
@RequestScoped
public class BancoMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private BancoVO bancoVO;
	
	
	public BancoMB(){
		bancoVO=new BancoVO();
	}
	
	public void consultaBanco() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoBancoBO().consultBancos();
		
	}

	/**
	 * @return the bancoVO
	 */
	public BancoVO getBancoVO() {
		return bancoVO;
	}

	/**
	 * @param bancoVO the bancoVO to set
	 */
	public void setBancoVO(BancoVO bancoVO) {
		this.bancoVO = bancoVO;
	}

}
