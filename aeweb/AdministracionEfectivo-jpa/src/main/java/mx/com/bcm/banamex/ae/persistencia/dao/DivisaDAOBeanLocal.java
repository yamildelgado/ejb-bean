/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.DivisaDTO;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface DivisaDAOBeanLocal extends Dao<DivisaDTO>{

	/**
	 * @return
	 */
	public abstract List<DivisaDTO> consultaDivisaIdNombre();

}
