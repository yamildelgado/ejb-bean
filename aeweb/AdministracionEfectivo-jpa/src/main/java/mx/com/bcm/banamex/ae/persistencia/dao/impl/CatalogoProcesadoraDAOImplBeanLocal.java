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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoProcesadoraDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioProcesadoraVO;


/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
@Stateless
public class CatalogoProcesadoraDAOImplBeanLocal extends GlobalJpaDaoBean<Procesadora> implements
		CatalogoProcesadoraDAOBeanLocal {

	
	
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	
	@Override
	public List<Procesadora> findBySirhIdnProcesadora(
			CriterioProcesadoraVO criterioProcesadoraVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Procesadora.findByCpaesEstructuraSirhIdn");
		query	.setParameter("cpaesEstructuraSirhIdn",criterioProcesadoraVO.getProcesadoraSirhId());
		List<Procesadora> listaProcesadora=query.getResultList();
		return listaProcesadora;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoProcesadoraDAOBeanLocal#findByEtvIdnProcesadora(com.mx.bcm.banamex.ea.persistencia.vo.CriterioProcesadoraVO)
	 */
	@Override
	public List<Procesadora> findByEtvIdnProcesadora(
			CriterioProcesadoraVO criterioProcesadoraVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Procesadora.findByEtvIdn");
		query	.setParameter("etvIdn",criterioProcesadoraVO.getProcesadoraEtvId());
		List<Procesadora> listaProcesadora=query.getResultList();
		return listaProcesadora;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoProcesadoraDAOBeanLocal#findByEtvIdnAndSirhIdnProcesadora(com.mx.bcm.banamex.ea.persistencia.vo.CriterioProcesadoraVO)
	 */
	
	@Override
	public List<Procesadora> findByEtvIdnAndSirhIdnProcesadora(
			CriterioProcesadoraVO criterioProcesadoraVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Procesadora.findByEtvIdnAndCpaesEstructuraSirhIdn");
		query	.setParameter("etvIdn",criterioProcesadoraVO.getProcesadoraEtvId());
		query	.setParameter("cpaesEstructuraSirhIdn",criterioProcesadoraVO.getProcesadoraSirhId());
		List<Procesadora> listaProcesadora=query.getResultList();
		return listaProcesadora;
	}

	public List<Procesadora> buscarProcesadoraSirh(){
		StringBuilder query= new StringBuilder();
		query.append("SELECT p FROM Procesadora ");
		query.append("JOIN FETCH p.cpaes, JOIN FECTH p.etvs" );

		Query criteria = em.createQuery(query.toString(), Procesadora.class);
		return criteria.getResultList();
		
	}

}