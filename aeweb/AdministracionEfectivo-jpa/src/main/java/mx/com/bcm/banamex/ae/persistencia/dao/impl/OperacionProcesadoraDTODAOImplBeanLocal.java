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
import mx.com.bcm.banamex.ae.persistencia.dao.OperacionProcesadoraDTODAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
@Stateless
public class OperacionProcesadoraDTODAOImplBeanLocal extends GlobalJpaDaoBean<OperacionProcesadoraDTO> implements OperacionProcesadoraDTODAOBeanLocal {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<OperacionProcesadoraDTO> consultaReporProcesadoraEtvSirh() throws EfectivoAplicacionDAOException {
		StringBuilder queryString=new StringBuilder();
		queryString.append(" SELECT DISTINCT "
						+ " d.ESTRUCTRA_SIRH AS ESTRUCTRA_SIRH ,c.SIRH_NOMBRE AS SIRH_NOMBRE, "
						+ " d.ETV_IDN AS ETV_IDN,e.ETV_NOMBRE_LARGO AS ETV_NOMBRE_LARGO"
						+ " FROM DETALLE_INTERFACE_PROCESADORAS d "
						+ " JOIN  ETVS e ON  d.ETV_IDN=e.ETV_IDN "
						+ " JOIN CPAES c ON d.ESTRUCTRA_SIRH=c.CPAES_ESTRUCTURA_SIRH_IDN  ");
		//
		Query query = this.em.createNativeQuery(queryString.toString());
		List<OperacionProcesadoraDTO> listOperProcDTO=new ArrayList<OperacionProcesadoraDTO>();
		List<Object[]> listaObject=query.getResultList();
		for(int index=0;index<listaObject.size();index++){
			  Object[] current=listaObject.get(index);
			  OperacionProcesadoraDTO obj=new OperacionProcesadoraDTO();
			  obj.setEstructraSirh(Integer.parseInt(current[0].toString()));
			  System.out.println(obj.getEstructraSirh());
			  obj.setSirhNombre(    current[1].toString());
			  System.out.println(obj.getSirhNombre());
			  obj.setEtvIdn(Short.parseShort(current[2].toString()));
			  System.out.println(obj.getEtvIdn());
			  obj.setEtvNombreLargo(current[3].toString());
			  System.out.println(obj.getEtvNombreLargo());
			  listOperProcDTO.add(obj);
					
		}
		
		return listOperProcDTO;
	}
	public List<OperacionProcesadoraDTO> consultaReportes() throws EfectivoAplicacionDAOException {
		
	 return null;
	}
}
