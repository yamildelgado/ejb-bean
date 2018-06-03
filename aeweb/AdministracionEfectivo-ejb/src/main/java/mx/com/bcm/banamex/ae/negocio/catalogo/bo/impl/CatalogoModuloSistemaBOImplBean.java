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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoModuloSistemaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.ModuloSistemaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoModuloSistemaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.ModulosSistemaAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@Stateless
public class CatalogoModuloSistemaBOImplBean  implements CatalogoModuloSistemaBOBeanLocal {
	
	@EJB private CatalogoModuloSistemaDAOBeanLocal moduloSistemaDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	
	@Override
	public List<ModuloSistemaVO> consultaModulosPorParametros(ModuloSistemaVO moduloSistemaVO)
			throws EfectivoAplicacionBOException {
		List<ModuloSistemaVO> listaModuloVO=new ArrayList<ModuloSistemaVO>();
		List<ModulosSistemaAeweb> listaModulo=new ArrayList<ModulosSistemaAeweb>();
		try {
			listaModulo= this.moduloSistemaDAO.consultaModulosPorParametros(moduloSistemaVO);
			
			 for(ModulosSistemaAeweb elemento:listaModulo){
				 ModuloSistemaVO ModuloVO=ModuloSistemaAssambler.getModuloSistemaVO(elemento);
				 listaModuloVO.add(ModuloVO);
			 }
			} catch (EfectivoAplicacionDAOException e) {
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
			}
		return listaModuloVO;
	}
	
	@Override
	public List<ModuloSistemaVO> consultaModulos()
			throws EfectivoAplicacionBOException {
		List<ModuloSistemaVO> listaModuloVO=new ArrayList<ModuloSistemaVO>();
		List<ModulosSistemaAeweb> listaModulo=new ArrayList<ModulosSistemaAeweb>();
		listaModulo= this.moduloSistemaDAO.findAll();
		
		 for(ModulosSistemaAeweb elemento:listaModulo){
			 ModuloSistemaVO ModuloVO=ModuloSistemaAssambler.getModuloSistemaVO(elemento);
			 listaModuloVO.add(ModuloVO);
		 }
		return listaModuloVO;
	}
}

