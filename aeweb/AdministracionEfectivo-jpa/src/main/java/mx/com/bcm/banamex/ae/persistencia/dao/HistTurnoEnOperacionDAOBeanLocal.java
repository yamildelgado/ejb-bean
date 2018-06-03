/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;


/**
 * @author ING. SIST. COMP. OMAR ARTURO LÓPEZ RODRIGUEZ
 *
 */
@Local
public interface HistTurnoEnOperacionDAOBeanLocal extends Dao<HistTurnoEnOperacion>{

	public abstract List<HistTurnoEnOperacion> consultarHistTurnoEnOperacion(String turnoId);
	public List<HistTurnoEnOperacion> obtenerHist(int turnoIdn) throws EfectivoAplicacionDAOException;
	public HistTurnoEnOperacion obtenerhora()throws EfectivoAplicacionDAOException;
}
