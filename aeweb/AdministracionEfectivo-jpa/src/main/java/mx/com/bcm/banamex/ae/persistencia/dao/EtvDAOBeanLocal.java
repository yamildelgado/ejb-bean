/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.EtvDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface EtvDAOBeanLocal extends Dao<EtvDTO>{
	
	public abstract List<EtvDTO> consultaEtvIdnNombre() throws EfectivoAplicacionDAOException;
}
