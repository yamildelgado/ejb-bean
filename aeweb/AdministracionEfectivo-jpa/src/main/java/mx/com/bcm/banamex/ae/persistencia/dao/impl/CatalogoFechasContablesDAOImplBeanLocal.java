/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoFechasContablesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;



/**
 * @author:  Marco Antonio Abitia G.
 * @author: ING . SIST. COMP OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */

@Stateless
public class CatalogoFechasContablesDAOImplBeanLocal extends GlobalJpaDaoBean<FechaContable> implements CatalogoFechasContablesDAOBeanLocal {
   

	  @PersistenceContext
	  private EntityManager em;
	  
	  @Override
   	  public FechaContable consultaFechaContablePorid(Date fechReal) throws EfectivoAplicacionDAOException {
   		FechaContable fechasContables=null;
  		Query query=this.em.createNamedQuery("Contrato.findByFeccontIdn", FechaContable.class);
  		query.setParameter("cntrtoNum", fechReal);
  		query.setMaxResults(1);
  		fechasContables=(FechaContable) query.getSingleResult();
  		return fechasContables;
   	  }



	/* (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoFechasContablesDAOBeanLocal#obtenerFechaContableActiva()
	 */
	@Override
	public FechaContable obtenerFechaContableActiva()
			throws EfectivoAplicacionDAOException {
		// TODO Auto-generated method stub
		
		FechaContable fechasContables=null;
  		Query query=this.em.createNamedQuery("FechaContable.findByFeccontStatus", FechaContable.class);
  		query.setParameter("feccontStatus", "01");
  		query.setMaxResults(1);
  		fechasContables=(FechaContable) query.getSingleResult();
  		return fechasContables;
	}  

}