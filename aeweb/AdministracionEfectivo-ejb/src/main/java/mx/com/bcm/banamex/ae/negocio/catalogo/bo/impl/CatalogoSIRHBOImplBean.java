/** Todos los Derechos Reservados 2013 BCM.
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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoSIRHBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.SIRHAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSIRHDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Estructura;
import mx.com.bcm.banamex.ae.persistencia.vo.EstructuraVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@Stateless
public class CatalogoSIRHBOImplBean implements CatalogoSIRHBOBeanLocal{
	
	@EJB private CatalogoSIRHDAOBeanLocal sirhDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	
	@Override
	public List<EstructuraVO> consultaEstructura() throws EfectivoAplicacionBOException {
		
		
		 List<EstructuraVO> listaEstructuraVO=new ArrayList<EstructuraVO>();
		 List<Estructura> listaEstructura = this.sirhDAO.findAll();
		 for(Estructura elemento:listaEstructura){
			 EstructuraVO estructuraVO=SIRHAssambler.getEstructuraVO(elemento);
			 listaEstructuraVO.add(estructuraVO);
		 }
		
		return listaEstructuraVO;
	}


	@Override
	public List<EstructuraVO> consultaSirhPorBoveda(EstructuraVO estructuraVO)	throws EfectivoAplicacionBOException {
		List<EstructuraVO> listaEstructuraVO=new ArrayList<EstructuraVO>();
		 
		 List<Estructura> listaEstructura=new ArrayList<Estructura>();
		try {
			listaEstructura= this.sirhDAO.consultaSirhPorBoveda(estructuraVO);
			 for(Estructura elemento:listaEstructura){
				 EstructuraVO sirhVO=SIRHAssambler.getEstructuraVO(elemento);
				listaEstructuraVO.add(sirhVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaEstructuraVO;
	}


}
