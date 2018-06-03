/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.AsignarTurnosDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Stateless
public class AsignarTurnosDAOImplBeanLocal extends GlobalJpaDaoBean<SubBoveda> implements AsignarTurnosDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<SubBoveda> buscarBobedasPorCPAE(int cpaePk) {
		    
	    Query criteria = this.em.createNamedQuery("SubBovedas.findByCpaesEstructuraSirhIdn");
	    criteria.setParameter("cpaesEstructuraSirhIdn", cpaePk);
	    
	    
	    return criteria.getResultList();
	    
	}

}
