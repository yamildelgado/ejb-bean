/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaCuentaVO;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Local
public interface CatalogoCuentaDAOBeanLocal extends Dao<Cuenta> {
  
	/**
	 * @param cuentaPK
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Cuenta> consultaCuentaPorid(CuentaPK cuentaPK) throws EfectivoAplicacionDAOException;
	/**
	 * @param criteriaCuentaVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Cuenta> consultaCuentaParametrizada(CriteriaCuentaVO criteriaCuentaVO) throws EfectivoAplicacionDAOException;
	/**
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Cuenta> consultaCuenta()throws EfectivoAplicacionDAOException;
	
	
} 
