/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.Envase;
import mx.com.bcm.banamex.ae.persistencia.vo.EnvaseVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface EnvaseDAOBeanLocal extends Dao<Envase>{

	/**
	 * @param envaseVO
	 */
	public abstract void altaEnvase(EnvaseVO envaseVO);

}
