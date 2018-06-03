/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaVO;


/**
 * @author  INGRET AGUILAR VELAZQUEZ
 *
 */
@Stateless
public class CatalogoCajaDAOImplBeanLocal extends GlobalJpaDaoBean<Caja> 
implements CatalogoCajaDAOBeanLocal {

		@PersistenceContext
		private EntityManager em;
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Caja> consultaCajaFiltros(CriterioCajaVO cCajaVO)throws EfectivoAplicacionDAOException{
			
			StringBuilder queryBuilder = new StringBuilder();
			String queryFormateado  = UtileriaHelper.getFiltroDeAtributos(cCajaVO.toString(), OperadorLogicoType.AND, 'c');
			
			if(queryFormateado.equals(UtileriaHelper.VACIO)){
				queryBuilder = new StringBuilder();
				queryFormateado = new String();
				return findAll();
			}
			
			
			queryBuilder.append(" SELECT c FROM Cajas c ");
			queryBuilder.append(" WHERE " + queryFormateado);
			Query criteria = em.createQuery(queryBuilder.toString(), Caja.class);
			queryBuilder = new StringBuilder();
			
			return criteria.getResultList();
			
		}

		/* (non-Javadoc)
		 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoCajaDAOBeanLocal#buscarCajasPorSubBoveda(int)
		 */
		@Override
		public List<Caja> buscarCajasPorSubBoveda(int subBovedaid) throws EfectivoAplicacionDAOException {

			StringBuilder query=new StringBuilder();
			query.append(" SELECT c FROM Caja c ");
			query.append(" JOIN FETCH c.catGeneralAeweb ");
		    query.append(" WHERE c.subBoveda.subBovedaPK.subbovedaIdn = :subBovedaIdn"); 
		    Query criteria = em.createQuery(query.toString(), Caja.class);
		    criteria.setParameter("subBovedaIdn", subBovedaid);

		    return criteria.getResultList();
		}
		
		/* (non-Javadoc)
		 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoCajaDAOBeanLocal#buscarCajasPorSubBoveda(int)
		 */
		@Override
		public List<Caja> buscarCajasPorTurno(String turnoId) throws EfectivoAplicacionDAOException {

			StringBuilder query=new StringBuilder();
			query.append(" SELECT c FROM Caja c, CajasDeTurno ct ");
			query.append(" JOIN FETCH c.catGeneralAeweb ");
			
			 query.append(" WHERE ct.cajasDeTurnoPK.turnoId = :turnoId"); 
		    Query criteria = em.createQuery(query.toString(), Caja.class);
		    criteria.setParameter("turnoId", turnoId);

		    return criteria.getResultList();
		}


}
