/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.EtvIdnNombreDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface EtvIdnNombreDTODAOBeanLocal extends Dao<EtvIdnNombreDTO>{
	
	public abstract List<EtvIdnNombreDTO> consultaEtvIdnNombre() throws EfectivoAplicacionDAOException;
}
