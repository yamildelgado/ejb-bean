/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.AgrupadorAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAgrupadorAeWebVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface AgrupadorAeWebDAOBeanLocal  extends Dao<AgrupadorAeweb>{

	/**
	 * @param criterioAgrupadorVO
	 * @return 
	 */
	public abstract AgrupadorAeweb obtieneAgrupadorAeWeb(CriterioAgrupadorAeWebVO criterioAgrupadorVO);
	

}
