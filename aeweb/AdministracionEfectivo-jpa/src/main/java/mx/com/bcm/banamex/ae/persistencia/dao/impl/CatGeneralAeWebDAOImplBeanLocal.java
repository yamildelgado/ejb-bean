/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatGeneralAeWebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCatGeneralAewebVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class CatGeneralAeWebDAOImplBeanLocal extends GlobalJpaDaoBean<CatGeneralAeweb> implements CatGeneralAeWebDAOBeanLocal{
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public CatGeneralAeweb obtieneCatGeneralAeweb(CriterioCatGeneralAewebVO criterioCatGeneral)
	{
		
		Query query=this.em.createNamedQuery("SELECT c FROM CatGeneralAeweb c WHERE c.catGeneralAewebPK.agrupadorIdn = :agrupadorIdn AND c.catGeneralAewebPK.aewebcatgralIdn = :aewebcatgralIdn");
		query.setParameter("catGeneralAewebPK.agrupadorIdn", criterioCatGeneral.getAgrupadorIdn());
		query.setParameter("catGeneralAewebPK.aewebcatgralIdn", criterioCatGeneral.getAewebcatgralIdn());
		
		return (CatGeneralAeweb) query.getResultList();
	}

}
