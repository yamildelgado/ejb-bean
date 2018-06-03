package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDenominacionesDivisaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.DivisaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDenominacionesDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioDenominacionDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DenominacionesDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;


import static mx.com.bcm.banamex.ae.persistencia.assambler.DenominacionesDivisaAssambler.getDenominacionesVO;


/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */


@Stateless
public class CatalogoDenominacionesDivisaBOImplBean implements CatalogoDenominacionesDivisaBOBeanLocal {
	
	@EJB private CatalogoDenominacionesDivisaDAOBeanLocal denominaDivisasDAO;
	@EJB private CatalogoDivisaDAOBeanLocal divisaDAO;
		
	
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
		public List<DenominacionesDivisaVO> consultaDenomDivisaPorIdDivisa(CriterioDenominacionDivisaVO criterioDenomDivisaVO) 
		{		// TODO Auto-generated method stub
    	
    	List<DenominacionDeDivisa> listaDenominaciones = new ArrayList<DenominacionDeDivisa>();
    	List<DenominacionesDivisaVO> listDenominacionesVO = new ArrayList<DenominacionesDivisaVO>();
    	
    	
    	    	
    	     try {
				listaDenominaciones = denominaDivisasDAO.consultaDenominacionesPorDivisaId(criterioDenomDivisaVO);
				for (DenominacionDeDivisa elemento : listaDenominaciones){
	    	    	 DenominacionesDivisaVO denominacionesVO = getDenominacionesVO(elemento);
	    	    	 listDenominacionesVO.add(denominacionesVO);
	    	     }		
    	     
    	     
    	     } catch (EfectivoAplicacionDAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	     
    	    
    	
    	
    	return listDenominacionesVO;
    	
		
	}


	@Override
	public List<DivisaVO> consultaDivisas()
			throws EfectivoAplicacionBOException {
		List<DivisaVO> listaDivisasVO=new ArrayList<DivisaVO>();
		 List<Divisa> listaDivisas = this.divisaDAO.findAll();
		 for(Divisa elemento:listaDivisas){
			 DivisaVO divisaVO=DivisaAssambler.getDivisaVO(elemento);
			 
			 listaDivisasVO.add(divisaVO);
		 }
	   
		return listaDivisasVO;
		
	}
}












