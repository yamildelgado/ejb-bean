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
import mx.com.bcm.banamex.ae.persistencia.constantes.CatalogoErrorType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoMensajeAewebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Stateless
public class CatalogoMensajeAewebDAOImplBean extends GlobalJpaDaoBean<CatMensajesAeweb> implements CatalogoMensajeAewebDAOBeanLocal {

	
	@PersistenceContext
	private EntityManager em;

	
	@Override
	public List<CatMensajesAeweb> consultaCatalogoMensjaePorListaDeId( List<Integer> listaCodigoMensaje) throws EfectivoAplicacionDAOException {
		Query query=null;
	    if(listaCodigoMensaje==null || listaCodigoMensaje.isEmpty()){
	    	
	        query= em.createNamedQuery("CatalogoMensajesAeweb.findByMensajeCodigo", CatMensajesAeweb.class);    	
	    	query.setParameter("mensajeCodigo",CatalogoErrorType.VALOR_NULO.getValue());
	    	CatMensajesAeweb mensaje=( CatMensajesAeweb)query.getSingleResult();	    	
	    	throw new  EfectivoAplicacionDAOException(mensaje.getMensajeDescripcion());
		}
	       
	    return query.getResultList();
	    
		
	}

	

}
