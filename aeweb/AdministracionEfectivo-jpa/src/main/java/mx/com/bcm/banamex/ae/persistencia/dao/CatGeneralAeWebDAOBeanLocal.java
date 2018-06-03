/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCatGeneralAewebVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface CatGeneralAeWebDAOBeanLocal extends Dao<CatGeneralAeweb>{

	/**
	 * @param criterioCATGeneral
	 * @return
	 */
	public abstract CatGeneralAeweb obtieneCatGeneralAeweb(CriterioCatGeneralAewebVO criterioCATGeneral);

}
