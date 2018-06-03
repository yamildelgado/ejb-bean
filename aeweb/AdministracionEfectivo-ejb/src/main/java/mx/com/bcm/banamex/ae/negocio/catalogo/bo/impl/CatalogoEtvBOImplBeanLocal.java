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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEtvBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.EtvAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEtvDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Etv;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */


@Stateless
public class CatalogoEtvBOImplBeanLocal implements CatalogoEtvBOBeanLocal{

	@EJB private CatalogoEtvDAOBeanLocal etvDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	
	@Override
	public List<EtvVO> consultaEtv() throws EfectivoAplicacionBOException {
		
		List<EtvVO> listaEtvVO=new ArrayList<EtvVO>();
		 List<Etv> listaEtv = this.etvDAO.findAll();
		 for(Etv elemento:listaEtv){
			 EtvVO etvVO=EtvAssambler.getEtvVO(elemento);
			 listaEtvVO.add(etvVO);
		 }
		return listaEtvVO;
	}

	
	@Override
	public List<EtvVO> consultaEtvPorParametros(EtvVO etvVO) throws EfectivoAplicacionBOException{
		
		List<EtvVO> listaEtvVO=new ArrayList<EtvVO>();
		 
		 List<Etv> listaEtv=new ArrayList<Etv>();
		try {
			listaEtv= this.etvDAO.consultaEtvPorParametros(etvVO);
			
			 for(Etv elemento:listaEtv){
				 EtvVO etvParVO=EtvAssambler.getEtvVO(elemento);
				 listaEtvVO.add(etvParVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaEtvVO;
	}
}
