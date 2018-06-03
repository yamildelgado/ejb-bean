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
import mx.com.bcm.banamex.ae.persistencia.dao.HistTurnoEnOperacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;


/**
 * @author ING. SIST. COMP. OMAR ARTURO LÓPEZ RODRIGUEZ
 *
 */
@Stateless
public class HistTurnoEnOperacionDAOImplBeanLocal extends GlobalJpaDaoBean<HistTurnoEnOperacion> implements
HistTurnoEnOperacionDAOBeanLocal{
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HistTurnoEnOperacion> consultarHistTurnoEnOperacion( String turnoId){
		StringBuilder query = new StringBuilder();
		query.append("SELECT h FROM HistTurnoEnOperacion h WHERE h.histTurnoEnOperacionPK.turnoId = :turnoId AND h.histStatus = :histStatus");
		
		Query criteria = this.em.createQuery(query.toString(),HistTurnoEnOperacion.class);
		criteria.setParameter("turnoId", turnoId);
		criteria.setParameter("histStatus", "01");
		
		return criteria.getResultList();
		
	}
 public List<HistTurnoEnOperacion> obtenerHist(int turnoIdn) throws EfectivoAplicacionDAOException{
		
	 Query query=this.em.createNamedQuery("HistTurnoEnOperacion.findByTurnoId", HistTurnoEnOperacion.class);
	 query.setParameter("turnoId",String.valueOf(turnoIdn));
		
	 return query.getResultList();
 }
	
 public HistTurnoEnOperacion obtenerhora()throws EfectivoAplicacionDAOException{
	 HistTurnoEnOperacion hora = new HistTurnoEnOperacion();
	 StringBuilder query = new StringBuilder();
		query.append("SELECT h FROM HistTurnoEnOperacion h order by h.histTurnoEnOperacionPK.histFecHorIni desc");
		
		Query criteria = this.em.createQuery(query.toString(),HistTurnoEnOperacion.class);
		hora = (HistTurnoEnOperacion) criteria.getResultList().get(0);
		return hora;
 }
 
}

