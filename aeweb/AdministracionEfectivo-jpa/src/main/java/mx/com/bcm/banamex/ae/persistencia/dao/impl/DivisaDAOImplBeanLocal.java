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
import mx.com.bcm.banamex.ae.persistencia.dao.DivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.DivisaDTO;


/**
 * @author OCE-WCD JESÚS CARBAJL MONTES
 *
 */
@Stateless
public class DivisaDAOImplBeanLocal extends GlobalJpaDaoBean<DivisaDTO> implements DivisaDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DivisaDTO> consultaDivisaIdNombre()
	{
		Query query = this.em.createNamedQuery("Divisa.findDivisaIdAndNonbre");
		List<DivisaDTO> listDivisaDTO=new ArrayList<DivisaDTO>();
		List<Object[]> listaObject=query.getResultList();
		for(int index=0;index<listaObject.size();index++){
			  Object[] current=listaObject.get(index);
			  DivisaDTO objDivisa=new DivisaDTO();
			  objDivisa.setDivisa_Id((Short) current[0]);
			  objDivisa.setDivisaNombreCorto(current[1].toString());
			  listDivisaDTO.add(objDivisa);
		}
		
		return listDivisaDTO;
	}

}
