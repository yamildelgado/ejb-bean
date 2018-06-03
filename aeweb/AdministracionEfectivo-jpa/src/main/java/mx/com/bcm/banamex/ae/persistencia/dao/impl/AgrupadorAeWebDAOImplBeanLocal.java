/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.AgrupadorAeWebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.AgrupadorAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAgrupadorAeWebVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class AgrupadorAeWebDAOImplBeanLocal extends GlobalJpaDaoBean<AgrupadorAeweb> implements AgrupadorAeWebDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AgrupadorAeweb obtieneAgrupadorAeWeb(CriterioAgrupadorAeWebVO criterioAgrupadorVO)
	{
		Query query=this.em.createNamedQuery("AgrupadorAeweb.findByAgrupadorIdn");
		query.setParameter("agrupadorIdn", criterioAgrupadorVO.getAgrupadorIdn());
		return (AgrupadorAeweb) query.getResultList();
	}
	

}
