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
import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
@Stateless
public class CatalogoUnidadNegocioDAOImpBeanLocal extends GlobalJpaDaoBean<UnidadDeNegocio> implements CatalogoUnidadDeNegocioDAOBeanLocal {

	
	
	@PersistenceContext
	private EntityManager em;

	

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal#consultaUnidadNegocioById(java.lang.Short)
	 */
	@Override
	public UnidadDeNegocio consultaUnidadNegocioById(Short idUnidadNegocio)
			throws EfectivoAplicacionDAOException {
		
		Query query=this.em.createNamedQuery("UnidadDeNegocio.findByUnegId", UnidadDeNegocio.class);
		query.setParameter("unegId", idUnidadNegocio);
		return (UnidadDeNegocio) query.getSingleResult();
		
		
	}



	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal#consultaUnidadCriteriosDinamicos(com.mx.bcm.banamex.ea.persistencia.vo.CriteriaUnidadNegocioVO)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UnidadDeNegocio> consultaUnidadCriteriosDinamicos(
			CriteriaUnidadNegocioVO criterioVO)throws EfectivoAplicacionDAOException {
		StringBuilder query = new StringBuilder();
		//criterioVO.setUnidadNegocio(criterioVO.getUnidadNegocio()==0?null:criterioVO.getUnidadNegocio());
		//criterioVO.setSh(criterioVO.getSh()==0?null:criterioVO.getSh());
		
	
		String queryFormateado = UtileriaHelper.getFiltroDeAtributos(criterioVO.toString(), OperadorLogicoType.AND, 'u');
		if (queryFormateado.equals(UtileriaHelper.VACIO)) {
			query = new StringBuilder();
			queryFormateado = new String();
			return findAll();
		}
		
		
		
		query.append(" SELECT u FROM UnidadDeNegocio u ");
		query.append(" WHERE " + queryFormateado);
		
		Query criteria = em.createQuery(query.toString(), UnidadDeNegocio.class);
		query = new StringBuilder();
		
		return criteria.getResultList();
	}



	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal#consultaUnidadNegocioPk(com.mx.bcm.banamex.ea.persistencia.modelo.UnidadDeNegocioPK)
	 */ 
	@Override
	public UnidadDeNegocio consultaUnidadNegocioPk(UnidadDeNegocioPK unidadPK) throws EfectivoAplicacionDAOException {
			   
		StringBuilder query=new StringBuilder();
		query.append(" SELECT u FROM UnidadDeNegocio u ");
		query.append(" JOIN FETCH u.contrato  JOIN FETCH u.cpaes  ");
	    query.append(" WHERE u.unidadDeNegocioPK.cpaesEstructuraSirhIdn = :sirhIdn AND "); 
	    query.append(" u.unidadDeNegocioPK.cntrtoNum=:contratoNum            AND    "); 
	    query.append(" u.unidadDeNegocioPK.unegId = :unegId ");
	    Query criteria = em.createQuery(query.toString(), UnidadDeNegocio.class);
	    criteria.setParameter("unegId", unidadPK.getUnegId());
	    criteria.setParameter("contratoNum", unidadPK.getCntrtoNum());
	    criteria.setParameter("sirhIdn", unidadPK.getCpaesEstructuraSirhIdn());
	    criteria.setMaxResults(1);
	    return (UnidadDeNegocio) criteria.getSingleResult();
		
	}






	/* (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal#consultaUnidadNegocioDinamico(mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO)
	 */
	@Override
	public UnidadDeNegocio consultaUnidadNegocioDinamico(
			CriteriaUnidadNegocioVO criterioVO)
			throws EfectivoAplicacionDAOException {
		StringBuilder query = new StringBuilder();
		//criterioVO.setUnidadNegocio(criterioVO.getUnegId()!=null !!()==0?null:criterioVO.getUnidadNegocio());
		//criterioVO.setSh(criterioVO.getSh()==0?null:criterioVO.getSh());
		
		String queryFormateado = UtileriaHelper.getFiltroDeAtributos(criterioVO.toString(), OperadorLogicoType.AND, 'u');
		query.append(" SELECT u FROM UnidadDeNegocio u ");
		query.append(" WHERE " + queryFormateado);
		
		Query criteria = em.createQuery(query.toString(), UnidadDeNegocio.class);
		criteria.setMaxResults(1);
		query = new StringBuilder();
		if(criteria.getSingleResult()!=null){
			return (UnidadDeNegocio) criteria.getSingleResult();
		}
		
		return null;
	}

	
	

}
