/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.dao.CajaHabilitadaPorTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurno;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaHabilitadaPorTurnoVO;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class CajaHabilitadaPorTurnoDAOImplBeanLocal extends GlobalJpaDaoBean<CajaHabilitadaPorTurno> implements CajaHabilitadaPorTurnoDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public CajaHabilitadaPorTurno obtieneCajaPorId(CriterioCajaHabilitadaPorTurnoVO criterioCajaTurnoVO)
	{
		StringBuilder query= new StringBuilder();
		query.append("SELECT c FROM CajaHabilitadaPorTurno c");
		query.append("WHERE c.cajaHabilitadaPorTurnoPK.cajaIdn = :cajaIdn ");
		query.append("c.cajaHabilitadaPorTurnoPK.cajahabFecHrHabilita = :cajahabFecHrHabilita");
		
		Query criteria = em.createQuery(query.toString(),CajaHabilitadaPorTurno.class); 
		criteria.setParameter("cajaIdn", criterioCajaTurnoVO.getCajaIdn());
		criteria.setParameter("cajahabFecHrHabilita", criterioCajaTurnoVO.getCajahabFecHrHabilita());
		
		return (CajaHabilitadaPorTurno) criteria.getResultList();
	}

}
