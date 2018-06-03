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
import javax.persistence.TypedQuery;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDenominacionesDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioDenominacionDivisaVO;


/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
@Stateless
public class CatalogoDenominacionesDivisaDAOImplBeanLocal extends GlobalJpaDaoBean<DenominacionDeDivisa> 
                                          implements CatalogoDenominacionesDivisaDAOBeanLocal {	

    @PersistenceContext
	private EntityManager em;
   
    public  CatalogoDenominacionesDivisaDAOImplBeanLocal(){
       super();
    }
    

    @SuppressWarnings("unchecked")
    @Override
	public List<DenominacionDeDivisa> consultaDenominacionesPorDivisaId(CriterioDenominacionDivisaVO critDenomiDivisas) throws EfectivoAplicacionDAOException {
     		  
       	List<DenominacionDeDivisa> listaDenomDivisa = new ArrayList<DenominacionDeDivisa>();
       	Query query = em.createNamedQuery("DenominacionDeDivisa.findByDivisaId" );
        query.setParameter("divisaId", critDenomiDivisas.getSeleccionDivisa());
        listaDenomDivisa = query.getResultList();
        return listaDenomDivisa ;
    } 
    @Override
    public List<DenominacionDeDivisa> consultaDenominacionById(Short idDivisa)throws EfectivoAplicacionDAOException {
   
    	 StringBuilder query=new StringBuilder();
    	 query.append("  SELECT d FROM DenominacionDeDivisa d ");
    	 query.append("  WHERE d.denominacionDeDivisaPK.divisaId = :divisaId ");
    	 query.append(" AND d.denomNombreDenominacion IN('BCA,'MCA') order by u.denomNombreDenominacion");
    	 TypedQuery<DenominacionDeDivisa> typeQuery = em.createQuery(query.toString(), DenominacionDeDivisa.class);
    	 typeQuery.setParameter("divisaId", idDivisa);
    	 return typeQuery.getResultList();
    	
    	
    	
    }
}
