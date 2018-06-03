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
import mx.com.bcm.banamex.ae.persistencia.dao.TotalesRecepcionEfectivoDTOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.TotalesRecepcionEfectivoDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES 
 *
 */
@Stateless
public class TotalesRecepcionEfectivoDTODAOImplBeanLocal extends GlobalJpaDaoBean<TotalesRecepcionEfectivoDTO> implements TotalesRecepcionEfectivoDTOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public TotalesRecepcionEfectivoDTO consultaTotales() throws EfectivoAplicacionDAOException{
		TotalesRecepcionEfectivoDTO obj=new TotalesRecepcionEfectivoDTO();
		
		StringBuilder queryString=new StringBuilder();
		queryString.append(" SELECT COUNT(COMPBTE_ID) "
				+ "FROM COMPROBANTES "
				+ "WHERE ");
	   
		Query query = this.em.createNativeQuery(queryString.toString());
		List<Object[]> listaObject=query.getResultList();
		Object[] current=listaObject.get(0);
		
		queryString.delete(-1,queryString.length());
		
		obj.setNumerocomprobantes((Integer) current[0]);
		
		return obj;
	}
}


