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
import mx.com.bcm.banamex.ae.persistencia.dao.EtvDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.EtvDTO;



/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class EtvDAOImplBeanLocal extends GlobalJpaDaoBean<EtvDTO> implements EtvDAOBeanLocal{

	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EtvDTO> consultaEtvIdnNombre()
	{
		Query query1=this.em.createNamedQuery("Etv.findEtvidandNom");
		List<EtvDTO> listEtvsDTO=new ArrayList<EtvDTO>();
		List<Object[]> listaObject=query1.getResultList();
		for(int index=0;index<listaObject.size();index++){
			  Object[] current=listaObject.get(index);
			  EtvDTO obj=new EtvDTO();
			  obj.setEtvIdn(Short.parseShort(current[0].toString()));
			  obj.setEtvNombreLargo(current[1].toString());
			  listEtvsDTO.add(obj);
		}
		
		return listEtvsDTO;
		
	}

}
