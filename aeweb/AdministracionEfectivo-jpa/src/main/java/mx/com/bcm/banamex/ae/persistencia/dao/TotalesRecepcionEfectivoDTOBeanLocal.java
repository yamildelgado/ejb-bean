/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.TotalesRecepcionEfectivoDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface TotalesRecepcionEfectivoDTOBeanLocal extends Dao<TotalesRecepcionEfectivoDTO>{

	/**
	 * @return objTotalesRecepcionEfectivoDTO
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract TotalesRecepcionEfectivoDTO consultaTotales() throws EfectivoAplicacionDAOException;

}
