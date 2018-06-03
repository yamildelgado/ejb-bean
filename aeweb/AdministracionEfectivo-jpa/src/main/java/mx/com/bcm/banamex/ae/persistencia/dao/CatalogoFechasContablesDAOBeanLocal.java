/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;



import java.util.Date;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;



/**
 * @author:  Marco Antonio Abitia G.
 *  @author: ING . SIST. COMP OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */

@Local
public interface CatalogoFechasContablesDAOBeanLocal extends Dao<FechaContable> {
	
	public abstract FechaContable consultaFechaContablePorid(Date fecha)throws EfectivoAplicacionDAOException;
	
	public abstract FechaContable obtenerFechaContableActiva()throws EfectivoAplicacionDAOException;
	
}
