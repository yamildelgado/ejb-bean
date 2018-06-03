/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CajaDeTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurno;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Stateless
public class CajaDeTurnoDAOImplBeanLocal extends GlobalJpaDaoBean<CajasDeTurno> implements CajaDeTurnoDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<CajasDeTurno> buscarCajasDeTurnoPorCaja(int cajaId){
		StringBuilder query=new StringBuilder();
		query.append(" SELECT c FROM CajasDeTurno c ");
		query.append(" JOIN FETCH c.turno ");
		query.append(" WHERE c.caja.cajaIdn = :cajaIdn"); 
		query.append(" and c.cajaxturnoBajaLogica = :status"); 
		Query criteria = em.createQuery(query.toString(), CajasDeTurno.class);
		criteria.setParameter("cajaIdn", cajaId);
		criteria.setParameter("status", UtileriaHelper.ABIERTA);
	
	    return criteria.getResultList();
	}
	
	
	public CajasDeTurno buscarCajasDeTurnoPorCajaYTurno(short cajaId, String turnoId){
		StringBuilder query=new StringBuilder();
		query.append(" SELECT c FROM CajasDeTurno c ");
		query.append(" WHERE c.caja.cajaIdn = :cajaIdn"); 
		query.append(" and c.turno.turnoId = :turnoIdn"); 
		Query criteria = em.createQuery(query.toString(), CajasDeTurno.class);
		criteria.setParameter("cajaIdn", cajaId);
		criteria.setParameter("turnoIdn", turnoId.toString());
		
		CajasDeTurno cajasDeTurno = new CajasDeTurno();
		List<CajasDeTurno> listaCajasDeTurno = criteria.getResultList();
		if(!listaCajasDeTurno.isEmpty()){
			cajasDeTurno = listaCajasDeTurno.get(0);
		}else{
			
			return null;
		}
		
	    return cajasDeTurno;
	}
	

}
