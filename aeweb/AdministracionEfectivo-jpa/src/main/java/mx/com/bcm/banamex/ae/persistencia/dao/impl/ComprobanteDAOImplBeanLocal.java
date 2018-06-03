/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.dao.ComprobanteDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Comprobante;
import mx.com.bcm.banamex.ae.persistencia.vo.ComprobanteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioComprobanteVO;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class ComprobanteDAOImplBeanLocal extends GlobalJpaDaoBean<Comprobante> implements ComprobanteDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Comprobante obtieneComprobante(CriterioComprobanteVO criterioComprobanteVO)
	{
		Query query=this.em.createNamedQuery("SELECT c FROM Comprobante c WHERE c.comprobantePK.compbteId = :compbteId AND c.comprobantePK.etvIdn = :etvIdn");
		query.setParameter("comprobantePK.compbteId", criterioComprobanteVO.getCompbteId());
		query.setParameter("comprobantePK.etvIdn", criterioComprobanteVO.getEtvIdn());
		return (Comprobante) query.getResultList();
	}
}
