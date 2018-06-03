/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.dao.RecepcionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioRecepcionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class RecepcionDAOImplBeanLocal extends GlobalJpaDaoBean<Recepcion> implements RecepcionDAOBeanLocal{

	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void altarecepcion(RecepcionVO recepcionVO)
	{
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Recepcion obtieneRecepcion(CriterioRecepcionVO criterioRecepcionVO)
	{
		StringBuilder query= new StringBuilder();
		query.append("SELECT r FROM Recepcion r ");
		query.append("WHERE r.recepcionPK.cajaIdn = :cajaIdn AND ");
		query.append("r.recepcionPK.recepFecHrIni = :recepFecHrIni AND ");
		query.append("r.recepcionPK.etvIdn = :etvIdn");
		Query queryC=this.em.createNamedQuery(query.toString());
		queryC.setParameter("recepcionPK.cajaIdn", criterioRecepcionVO.getCajaIdn());
		queryC.setParameter("recepcionPK.recepFecHrIni", criterioRecepcionVO.getRecepFecHrIni());
		queryC.setParameter("recepcionPK.etvIdn", criterioRecepcionVO.getEtvIdn());
		
		return (Recepcion) queryC.getResultList();
		
	}
}
