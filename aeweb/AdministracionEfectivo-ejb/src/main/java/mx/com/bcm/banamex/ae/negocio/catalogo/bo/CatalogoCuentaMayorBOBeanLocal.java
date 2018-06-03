 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaMayorVO;




/**
 * @author ABRAHAM DANIEL DIAZ KIM
 *
 */@Local
public  interface CatalogoCuentaMayorBOBeanLocal {
 
	
	/**
	 * @return List<CuentasMayorVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<CuentaMayorVO> consultaCuentaMayor() throws EfectivoAplicacionBOException;
	
    /**
     * @param cuentaMayorVO
     * @throws EfectivoAplicacionBOException
     */
    public abstract void editCuentaMayor(CuentaMayorVO cuentaMayorVO) throws EfectivoAplicacionBOException;
    
    /**
     * @param idturno
     * @return
     * @throws EfectivoAplicacionBOException
     */
    public CuentaMayorVO consultaCuentaMayorPorId(short idturno) throws EfectivoAplicacionBOException;
    
    
	
	
	
	
}
