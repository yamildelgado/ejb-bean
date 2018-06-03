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

import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;

/**
 * @author atinajero ABRAAHAM ALFONSO TINAJERO SÁNCHEZ
 * 
 */

@Stateless
public class CatalogoSubBovedaDAOImplBeanLocal extends	GlobalJpaDaoBean<SubBoveda> implements CatalogoSubBovedaDAOBeanLocal {
	@PersistenceContext
	  private EntityManager em;
	public CatalogoSubBovedaDAOImplBeanLocal() {
		super();
	}

	

	/* (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal#obtenerFechaContableActiva()
	 */
	@Override
	public SubBoveda obtenerSubBoveda(short subBovedaIdn)	throws EfectivoAplicacionDAOException {
		// TODO Auto-generated method stub
		
		SubBoveda subBoveda=null;	Query query=this.em.createNamedQuery("SubBoveda.findBySubbovedaIdn", SubBoveda.class);
  		query.setParameter("subbovedaIdn",subBovedaIdn);
  		query.setMaxResults(1);
  		subBoveda=(SubBoveda) query.getSingleResult();
  		return subBoveda;
		
	}



	
	@Override
	public List<SubBoveda> obtenerSubBovedas() throws EfectivoAplicacionDAOException {
		
		StringBuilder query=new StringBuilder();
		query.append(" SELECT s FROM SubBoveda s ");
		query.append(" JOIN FETCH s.cpae JOIN FETCH s.turnoList");
		Query criteria = em.createQuery(query.toString(),SubBoveda.class);
		
		return criteria.getResultList();
	}
	
	
	
	
	
}
