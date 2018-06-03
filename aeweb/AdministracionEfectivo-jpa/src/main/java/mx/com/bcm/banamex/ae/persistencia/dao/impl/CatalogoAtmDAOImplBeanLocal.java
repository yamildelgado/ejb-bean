/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoAtmDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAtmVO;



/**
 * @author ING. SIS. COMP OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
@Stateless
public class CatalogoAtmDAOImplBeanLocal  extends GlobalJpaDaoBean<Atm> implements
CatalogoAtmDAOBeanLocal{
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Atm> findByIdnAtm(CriterioAtmVO criterioAtmVO) {
		// TODO Auto-generated method stub
		StringBuilder query = new StringBuilder();
		query.append("SELECT a FROM Atm a WHERE a.atmPK.atmIdn = :atmIdn AND  a.atmBajaLogica = :atmBajaLogica");
		
		Query criteria= this.em.createQuery(query.toString(),Atm.class);
		criteria	.setParameter("atmIdn",criterioAtmVO.getAtmIdn());
		criteria  .setParameter("atmBajaLogica", criterioAtmVO.getBajaLogica());
		List<Atm> listaAtms=criteria.getResultList();
		return listaAtms;
			}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Atm> findByAllAtm() {
		// TODO Auto-generated method stub 
		StringBuilder query = new StringBuilder();
		query.append("SELECT a FROM Atm a  WHERE a.atmBajaLogica = :atmBajaLogica");
		
		Query criteria= this.em.createQuery(query.toString(),Atm.class);		
		criteria  .setParameter("atmBajaLogica", "01");
		List<Atm> listaAtms=criteria.getResultList();
		return listaAtms;
	}

}
