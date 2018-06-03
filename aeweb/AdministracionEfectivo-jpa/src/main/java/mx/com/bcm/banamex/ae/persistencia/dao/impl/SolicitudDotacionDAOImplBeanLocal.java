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
import mx.com.bcm.banamex.ae.persistencia.dao.SolicitudDotacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Stateless
public class SolicitudDotacionDAOImplBeanLocal extends GlobalJpaDaoBean<UnidadDeNegocio> implements SolicitudDotacionDAOBeanLocal {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UnidadDeNegocio> consultaUnidadDeNegocio(CriteriaUnidadNegocioVO criteriaUnidadNegocioVO)
			throws EfectivoAplicacionDAOException {
		
		Query query= this.em.createNamedQuery("UnidadDeNegocio.findByCpaesEstructuraSirhIdn");
		query	.setParameter("cpaesEstructuraSirhIdn",criteriaUnidadNegocioVO.getCpaesEstructuraSirhIdn());
		List<UnidadDeNegocio> listaUN=query.getResultList();
		return listaUN;
				
	}

}
