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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoPlazaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Plaza;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioPlazaVO;


/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */

@Stateless
public class CatalogoPlazaDAOImplBeanLocal extends GlobalJpaDaoBean<Plaza> implements
		CatalogoPlazaDAOBeanLocal {
   
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Plaza> findByIdnPlaza(CriterioPlazaVO criterioPlazaVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Plazas.findByPlazaIdn");
		query	.setParameter("plazaIdn",criterioPlazaVO.getPlazaIdn());
		query  .setParameter("plazaBajaLogica", criterioPlazaVO.getBajaLogica());
		List<Plaza> listaPlazas=query.getResultList();
		return listaPlazas;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Plaza> findByNombrePlaza(CriterioPlazaVO criterioPlazaVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Plazas.findByPlazaNombre");
		query	.setParameter("plazaNombre",criterioPlazaVO.getPlazaNombre());
		query  .setParameter("plazaBajaLogica", criterioPlazaVO.getBajaLogica());
		List<Plaza> listaPlaza=query.getResultList();
		return listaPlaza;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Plaza> findByAllPlaza() {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("Plazas.findAll");		
		query  .setParameter("plazaBajaLogica", "A");
		List<Plaza> listaPlaza=query.getResultList();
		return listaPlaza;
	}


}
