/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurno;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public interface CajaDeTurnoDAOBeanLocal extends Dao<CajasDeTurno> {
	
	public List<CajasDeTurno> buscarCajasDeTurnoPorCaja(int cajaId) throws EfectivoAplicacionDAOException;
	
	public CajasDeTurno buscarCajasDeTurnoPorCajaYTurno(short cajaId, String turnoId) throws EfectivoAplicacionDAOException;

}
