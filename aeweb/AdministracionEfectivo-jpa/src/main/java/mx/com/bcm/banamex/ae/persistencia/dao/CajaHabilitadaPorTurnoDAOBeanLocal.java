/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;

import mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurno;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaHabilitadaPorTurnoVO;

/**
 * @author JESÚS CARBAJL MONTES
 *
 */
@Local
public interface CajaHabilitadaPorTurnoDAOBeanLocal extends Dao<CajaHabilitadaPorTurno>{

	/**
	 * @param criterioCajaTurnoVO
	 * @return
	 */
	public abstract CajaHabilitadaPorTurno obtieneCajaPorId(CriterioCajaHabilitadaPorTurnoVO criterioCajaTurnoVO);

}
