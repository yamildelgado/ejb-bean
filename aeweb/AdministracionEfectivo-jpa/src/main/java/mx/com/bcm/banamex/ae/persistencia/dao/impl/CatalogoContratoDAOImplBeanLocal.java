/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoContratoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Contrato;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Stateless
public class CatalogoContratoDAOImplBeanLocal extends GlobalJpaDaoBean<Contrato> implements CatalogoContratoDAOBeanLocal {

	@PersistenceContext
	private EntityManager em;

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoContratoDAOBeanLocal#getContratoPorId(com.mx.bcm.banamex.ea.persistencia.vo.CriterioContratoVO)
	 */
	@Override
	public Contrato getContratoPorId(CriterioContratoVO contratoVO)throws EfectivoAplicacionDAOException {
	    Contrato contrato=null;
		Query query=this.em.createNamedQuery("Contrato.findByCntrtoNum", Contrato.class);
		query.setParameter("cntrtoNum",  contratoVO.getNumContrato());
		query.setMaxResults(1);
		contrato=(Contrato) query.getSingleResult();
		return contrato;
	}

	
	

	

	

}
