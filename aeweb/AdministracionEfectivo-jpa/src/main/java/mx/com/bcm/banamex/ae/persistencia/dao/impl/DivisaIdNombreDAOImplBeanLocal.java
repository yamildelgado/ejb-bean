/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.DivisaIdNombreDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.DivisaIdNombreDTO;


/**
 * @author OCE-WCD JESÚS CARBAJL MONTES
 *
 */
@Stateless
public class DivisaIdNombreDAOImplBeanLocal extends GlobalJpaDaoBean<DivisaIdNombreDTO> implements DivisaIdNombreDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DivisaIdNombreDTO> consultaDivisaIdNombre()
	{
		Query query = this.em.createNamedQuery("Divisa.findDivisaIdAndNonbre");
		List<DivisaIdNombreDTO> listDivisaDTO=new ArrayList<DivisaIdNombreDTO>();
		List<Object[]> listaObject=query.getResultList();
		for(int index=0;index<listaObject.size();index++){
			  Object[] current=listaObject.get(index);
			  DivisaIdNombreDTO objDivisa=new DivisaIdNombreDTO();
			  objDivisa.setDivisa_Id((Short) current[0]);
			  objDivisa.setDivisaNombreCorto(current[1].toString());
		}
		
		return listDivisaDTO;
	}

}
