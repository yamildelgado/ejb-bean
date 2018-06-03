/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface OperacionProcesadoraDTODAOBeanLocal extends Dao<OperacionProcesadoraDTO>{
	/**
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract List<OperacionProcesadoraDTO> consultaReporProcesadoraEtvSirh() throws EfectivoAplicacionDAOException;

}
