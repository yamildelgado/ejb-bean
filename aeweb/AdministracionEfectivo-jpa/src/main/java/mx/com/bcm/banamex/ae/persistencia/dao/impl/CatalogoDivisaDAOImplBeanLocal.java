/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;




/**
 * @author OCA,OCJP,OCJA,OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 *
 */

@Stateless
public class CatalogoDivisaDAOImplBeanLocal extends GlobalJpaDaoBean<Divisa> 
implements CatalogoDivisaDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;




	@SuppressWarnings("unchecked")
	@Override
	public List<Divisa> consultaDivisaPorNum(DivisaVO divisaVO)
	        throws EfectivoAplicacionDAOException {
		
		
		StringBuilder queryBuilder = new StringBuilder();
		String queryFormateado = UtileriaHelper.getFiltroDeAtributos(divisaVO.toString(), OperadorLogicoType.AND, 'd');
		if (queryFormateado.equals(UtileriaHelper.VACIO)) {
			queryBuilder = new StringBuilder();
			queryFormateado = new String();
			return findAll();
		}
		queryBuilder.append(" SELECT d FROM Divisa d ");
		queryBuilder.append(" WHERE " + queryFormateado);
		Query criteria = em.createQuery(queryBuilder.toString(), Divisa.class);
		queryBuilder = new StringBuilder();
		return criteria.getResultList();
		
	}







	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoDivisaDAOBeanLocal#consultaEmpleadoPorParametros(com.mx.bcm.banamex.ea.persistencia.vo.DivisaVO)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Divisa> consultaDivisaPorParametros(DivisaVO divisaVO)
			throws EfectivoAplicacionDAOException {
		
			StringBuilder query = new StringBuilder();
			
			String queryFormateado = UtileriaHelper.getFiltroDeAtributos(divisaVO.toString(), OperadorLogicoType.AND, 'd');
			if (queryFormateado.equals(UtileriaHelper.VACIO)) {
				query = new StringBuilder();
				queryFormateado = new String();
				return findAll();
			}
			query.append(" SELECT d FROM Divisa d  ");
			query.append(" WHERE " + queryFormateado);
			query.append("ORDER BY d.divisaId ASC, d.divisaNomLargo ASC");
			
			Query criteria = em.createQuery(query.toString(), Divisa.class);
			query = new StringBuilder();
			
			return criteria.getResultList();
		
	}




	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoDivisaDAOBeanLocal#consultaDivisa()
	 */
	@Override
	public Divisa consultaDivisa(Integer idDivisa) throws EfectivoAplicacionDAOException {
		
		StringBuilder query=new StringBuilder();
		query.append(" SELECT d FROM Divisa d ");
		query.append(" JOIN FETCH  d.denominacionDeDivisaList ");
		query.append(" WHERE d.divisaId=:idDivisa");
		
		TypedQuery<Divisa> typeQuery = this.em.createQuery(query.toString(), Divisa.class);
		typeQuery.setParameter("idDivisa", idDivisa);
		return (Divisa) typeQuery.getSingleResult();
		
	}












	/* (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal#consultaDivisa(java.lang.Short)
	 */
	@Override
	public Divisa consultaDivisa(Short idDivisa){
		StringBuilder query=new StringBuilder();
		query.append(" SELECT d FROM Divisa d ");
		query.append(" JOIN FETCH  d.denominacionDeDivisaList ");
		query.append(" WHERE d.divisaId=:idDivisa");
		
		TypedQuery<Divisa> typeQuery = this.em.createQuery(query.toString(), Divisa.class);
		typeQuery.setParameter("idDivisa", idDivisa);
	return (Divisa) typeQuery.getSingleResult();
	}
	


	

	
}
