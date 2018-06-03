/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioRecepcionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface RecepcionDAOBeanLocal extends Dao<Recepcion>{
	
	/**
	 * @param recepcionVO
	 */
	public abstract void altarecepcion(RecepcionVO recepcionVO);

	/**
	 * @param criterioRecepcionVO
	 * @return
	 */
	public abstract Recepcion obtieneRecepcion(CriterioRecepcionVO criterioRecepcionVO);

}
