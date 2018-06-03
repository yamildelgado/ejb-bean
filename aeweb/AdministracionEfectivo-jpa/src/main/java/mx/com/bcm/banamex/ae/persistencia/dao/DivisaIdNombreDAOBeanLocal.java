/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.DivisaIdNombreDTO;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface DivisaIdNombreDAOBeanLocal extends Dao<DivisaIdNombreDTO>{

	/**
	 * @return
	 */
	public abstract List<DivisaIdNombreDTO> consultaDivisaIdNombre();

}
