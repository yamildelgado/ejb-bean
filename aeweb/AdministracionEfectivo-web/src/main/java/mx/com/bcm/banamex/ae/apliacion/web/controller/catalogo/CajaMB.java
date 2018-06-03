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
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="cajaMB")
@RequestScoped
public class CajaMB implements Serializable {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private CajaVO cajaVO;
	
	
	public CajaMB(){
		cajaVO=new CajaVO();
	}

//3
	public void consultCajas() throws EfectivoAplicacionBOException{
		}
	
	public void ConsultaEditCajas () throws  EfectivoAplicacionBOException{
		}
	
	public void findByIpAddressCajaIdnTipoCaja(String cajaIpAddress, short cajaIdn, short cajaTipoDeCaja) throws EfectivoAplicacionBOException{
			//this.catalogoFacade.getCatalogoCajaBO();
	}

	public void addCaja(CajaVO cajaVO) throws EfectivoAplicacionBOException{
		
	}
	public void formatoIp(CajaVO cajaVO) throws EfectivoAplicacionBOException{
		
	}
		
	
	
	
}
