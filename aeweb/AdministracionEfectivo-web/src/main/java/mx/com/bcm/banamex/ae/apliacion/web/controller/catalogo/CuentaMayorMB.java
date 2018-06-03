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
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaMayorVO;



/**
 * @author ABRAHAM DANIEL DIAZ KIM
 *  
 * 
 */
@ManagedBean(name="CuentaMayorMB")
@RequestScoped

public class CuentaMayorMB implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@EJB private CatalogoFacade catalogoFacade;
	private CuentaMayorVO cuentaMayorVO;
	
    public CuentaMayorMB(){
		cuentaMayorVO = new CuentaMayorVO();
	}
	
	
	public void consultaCuentaMayor() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCuentaMayorBO().consultaCuentaMayor();
		
	}

	
	public CuentaMayorVO consultaTurnoPorId(short idCuemay) throws EfectivoAplicacionBOException {
		cuentaMayorVO = this.catalogoFacade.getCuentaMayorBO().consultaCuentaMayorPorId(idCuemay);
		return cuentaMayorVO;
		
	}
	
	public CuentaMayorVO getCuentaMayorVO() {
		
		if(cuentaMayorVO==null){
			
			this.cuentaMayorVO = new CuentaMayorVO();
		}
		
		return cuentaMayorVO;
	}

	public void setCuentaMayorVO(CuentaMayorVO cuentaMayorVO) {
		this.cuentaMayorVO = cuentaMayorVO;
	}

	
	
	

}
