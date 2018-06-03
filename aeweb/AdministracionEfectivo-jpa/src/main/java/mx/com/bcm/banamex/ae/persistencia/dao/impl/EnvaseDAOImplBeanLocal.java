/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.com.bcm.banamex.ae.persistencia.dao.EnvaseDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Envase;
import mx.com.bcm.banamex.ae.persistencia.vo.EnvaseVO;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;



/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class EnvaseDAOImplBeanLocal extends GlobalJpaDaoBean<Envase> implements EnvaseDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void altaEnvase(EnvaseVO envaseVO)
	{
		
	}
	

}
