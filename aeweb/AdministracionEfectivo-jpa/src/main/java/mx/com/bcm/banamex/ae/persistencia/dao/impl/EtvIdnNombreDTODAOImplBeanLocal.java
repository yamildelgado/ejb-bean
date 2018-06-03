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
import mx.com.bcm.banamex.ae.persistencia.dao.EtvIdnNombreDTODAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.EtvIdnNombreDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class EtvIdnNombreDTODAOImplBeanLocal extends GlobalJpaDaoBean<EtvIdnNombreDTO> implements EtvIdnNombreDTODAOBeanLocal{

	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EtvIdnNombreDTO> consultaEtvIdnNombre()
	{
		StringBuilder queryString=new StringBuilder();
		queryString.append("SELECT DISTINCT " +
				"e.ETV_IDN AS ETV_IDN," +
				"e.ETV_NOMBRE_LARGO AS ETV_NOMBRE_LARGO " +
				"FROM ETVS e ");
		Query query = this.em.createNativeQuery(queryString.toString());
		List<EtvIdnNombreDTO> listEtvsDTO=new ArrayList<EtvIdnNombreDTO>();
		List<Object[]> listaObject=query.getResultList();
		for(int index=0;index<listaObject.size();index++){
			  Object[] current=listaObject.get(index);
			  EtvIdnNombreDTO obj=new EtvIdnNombreDTO();
			  obj.setEtvIdn(Short.parseShort(current[0].toString()));
			  obj.setEtvNombreLargo(current[1].toString());
			  listEtvsDTO.add(obj);
		}
		
		return listEtvsDTO;
		
	}

}
