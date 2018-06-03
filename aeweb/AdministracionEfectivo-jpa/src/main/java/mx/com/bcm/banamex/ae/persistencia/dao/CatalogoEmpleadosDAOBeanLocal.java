/** Todos los Derechos Reservados 2013 BCM.
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
import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaHabilitadaPorTurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;

/**
 * @author OCE-WCD DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@Local
public interface CatalogoEmpleadosDAOBeanLocal extends Dao<Empleado>{
	
	/**
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Empleado> consultaEmpleado() throws EfectivoAplicacionDAOException ;
	
	/**
	 * @param empleadoVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Empleado> consultaEmpleadoPorParametros(EmpleadoVO empleadoVO)	throws EfectivoAplicacionDAOException;
	
	public List<Empleado> consultaEmpleadoNomina(CambioDeLaFechaContableVO cambioDeLaFechaContableVO) throws EfectivoAplicacionDAOException;
	
	/**
	 * @param CajaHabilitadaPorTurnoVO
	 * @return Empleado
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract Empleado  obtenerEmpleadoPorNomina(CajaHabilitadaPorTurnoVO cajaHabilitadaPorTurnoVO)throws EfectivoAplicacionDAOException;
}