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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;


/**
 * @author JESÚS AGUILAR LÓPEZ 
 *
 */

@Stateless
public class CatalogoTurnoDAOImplBeanLocal extends GlobalJpaDaoBean<Turno> implements
		CatalogoTurnoDAOBeanLocal {
	
	@PersistenceContext
	private EntityManager em;
   
           public  CatalogoTurnoDAOImplBeanLocal(){
        	   super();
           }

    @SuppressWarnings("unchecked")
	@Override
	public List<Turno> buscarTurnoPorSubBoveda(int subBovedaid) {
    	StringBuilder query = new StringBuilder();
    	query.append("SELECT t FROM Turno t WHERE t.subBoveda.subBovedaPK.subbovedaIdn = :subBovedasPK");
    	Query criteria = em.createQuery(query.toString(), Turno.class);
		criteria.setParameter("subBovedasPK", subBovedaid);
		    
		    
		return criteria.getResultList();
	}
    
    @Override
	public void insertarTurnos(List<Turno> listaTurno) {
		
		for(Turno turno : listaTurno){
			
		}
		
	}
           

}
