 /**
  *  Todos los Derechos Reservados 2013 BCM.
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
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaCuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;





/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public  interface CatalogoCuentaBOBeanLocal {
 
	
	
	/**
	 * @return List<CuentaVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<CuentaVO> consultaCuentas() throws EfectivoAplicacionBOException;
	/**
	 * @param cuentaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CuentaVO consultaCuentaPorId(CriteriaCuentaVO criterioCuentaVO) throws EfectivoAplicacionBOException;
	/**
	 * @param generalVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<CuentaVO> consultaParametrizada(CriteriaCuentaVO criterioCuenta) throws EfectivoAplicacionBOException;
	
}
