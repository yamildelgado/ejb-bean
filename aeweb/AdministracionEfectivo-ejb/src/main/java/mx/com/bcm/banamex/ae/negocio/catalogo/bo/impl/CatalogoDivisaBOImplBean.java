 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDivisaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.DivisaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;


/**
 * @author JUAN MANUEL HERNANDEZ NAVARRO
 *
 */

public @Stateless class CatalogoDivisaBOImplBean implements CatalogoDivisaBOBeanLocal {

	
	@EJB private CatalogoDivisaDAOBeanLocal divisaDAO;

	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<DivisaVO> consultDivisas() throws EfectivoAplicacionBOException {
		List<DivisaVO> listaDivisaVO=new ArrayList<DivisaVO>();
		 List<Divisa> listaDivisa = this.divisaDAO.findAll();
		 for(Divisa elemento:listaDivisa){
			 DivisaVO divisaVO=DivisaAssambler.getDivisaVO(elemento);
			 listaDivisaVO.add(divisaVO);
		 }
	   
		return listaDivisaVO;
		//return null;
	}

	



	@Override
	public List<DivisaVO> consultaDivisasPorNum(DivisaVO divisaVO)
			throws EfectivoAplicacionBOException {
		List<DivisaVO> listaDivisaVO=new ArrayList<DivisaVO>();
		 
		 List<Divisa> listaDivisa=new ArrayList<Divisa>();
		try {
			listaDivisa= this.divisaDAO.consultaDivisaPorNum(divisaVO);
			
			 for(Divisa elemento:listaDivisa){
				 DivisaVO divVO=DivisaAssambler.getDivisaVO(elemento);
				 listaDivisaVO.add(divVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaDivisaVO;
		
	}

	@Override
	public List<DivisaVO> consultaDivisasPorParametros(DivisaVO divisaVO)
			throws EfectivoAplicacionBOException {
		List<DivisaVO> listaDivisaVO=new ArrayList<DivisaVO>();
		 
		 List<Divisa> listaDivisa=new ArrayList<Divisa>();
		try {
			listaDivisa= this.divisaDAO.consultaDivisaPorParametros(divisaVO);
			 for(Divisa elemento:listaDivisa){
				 DivisaVO divVO=DivisaAssambler.getDivisaVO(elemento);
				 listaDivisaVO.add(divVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaDivisaVO;
	}
	

	

}
