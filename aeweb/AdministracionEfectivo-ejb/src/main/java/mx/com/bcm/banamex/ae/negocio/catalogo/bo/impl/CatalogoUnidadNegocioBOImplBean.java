/** 
 *  Todos los Derechos Reservados 2013 BCM.
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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEstaticosBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoUnidadNegocioBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.constantes.CatalogoEstaticos;
import mx.com.bcm.banamex.ae.persistencia.assambler.CuentaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.UnidadDeNegocioAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EstaticosVO;
import mx.com.bcm.banamex.ae.persistencia.vo.UnidadDeNegocioVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */


@Stateless
public class CatalogoUnidadNegocioBOImplBean implements
		CatalogoUnidadNegocioBOBeanLocal {

	@EJB
	private CatalogoCuentaDAOBeanLocal cuentaDAO;
	@EJB
	private CatalogoUnidadDeNegocioDAOBeanLocal unidadDAO;
	
	@EJB 
	private CatalogoEstaticosBOBeanLocal catalogoEstaticoBO;

	
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public UnidadDeNegocioVO consultaContratosUnidadNegocio(String contrato,String sirh,String unidNegocio) throws EfectivoAplicacionBOException{
		List<CuentaVO> listaCuentaVO = new ArrayList<CuentaVO>();
		List<Cuenta> listaCuenta=null;
		UnidadDeNegocioPK unidadDeNegocioPK=new UnidadDeNegocioPK();
		CuentaPK CuentaPK=new CuentaPK();
		unidadDeNegocioPK.setCntrtoNum(contrato);
		unidadDeNegocioPK.setCpaesEstructuraSirhIdn(Integer.parseInt(sirh));
		unidadDeNegocioPK.setUnegId(Short.parseShort(unidNegocio));
		CuentaPK.setUnegId(unidadDeNegocioPK.getUnegId());
		
		UnidadDeNegocioVO unidadNegocioVO = null;
		UnidadDeNegocio unidadNegocio=null;
		try {
			unidadNegocio =  this.unidadDAO.consultaUnidadNegocioPk(unidadDeNegocioPK);
		} catch (EfectivoAplicacionDAOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		 listaCuenta = this.cuentaDAO.consultaCuentaPorid(CuentaPK);
		} catch (EfectivoAplicacionDAOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		for (Cuenta elemento : listaCuenta) {
			CuentaVO cuentaVO = CuentaAssambler.getCuentaVODetalle(elemento);
			String descripcion=CatalogoEstaticos.getTipoCuenta().get("0"+elemento.getCtaTipoCuenta());
			cuentaVO.setTipoCuenta(descripcion);
			listaCuentaVO.add(cuentaVO);
		}
		unidadNegocioVO = UnidadDeNegocioAssambler.getUnidadDeNegocioVODetalle(unidadNegocio);
		
		if(unidadNegocio!=null && unidadNegocio.getUnegTipoInstrumento()!=null){
			 
			
			 
			EstaticosVO catalogoEstatico=null;
			try {
				catalogoEstatico = this.catalogoEstaticoBO.consultaPorTipoInstrumento(unidadNegocio.getUnegTipoInstrumento());
			} catch (EfectivoAplicacionBOException e) {
				
			}
			
			unidadNegocioVO.setTipoInstrumento(catalogoEstatico.getDesc());
		 }

		
		unidadNegocioVO.setListaCuenta(listaCuentaVO);
		return unidadNegocioVO;
	}

	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<UnidadDeNegocioVO> consultaUnidadNegocio() {
		
	
		List<UnidadDeNegocioVO> listaUnidadVO = new ArrayList<UnidadDeNegocioVO>();
		List<UnidadDeNegocio> listaUnidad = this.unidadDAO.findAll();
		listaUnidadVO =convierteUnidadNegocioToUnidadNegocioVO(listaUnidad);
		return listaUnidadVO;
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<UnidadDeNegocioVO> consultaContratosUnidadNegocioPorCriterio(CriteriaUnidadNegocioVO criterioUnidadVO) throws EfectivoAplicacionBOException {
		List<UnidadDeNegocioVO> listaUnidadVO = null;
		List<UnidadDeNegocio> listaUnidad=null;
		try {
			listaUnidad = this.unidadDAO.consultaUnidadCriteriosDinamicos(criterioUnidadVO);
		} catch (EfectivoAplicacionDAOException e1) {
			
			e1.printStackTrace();
		}
		listaUnidadVO =convierteUnidadNegocioToUnidadNegocioVO(listaUnidad);
	   return listaUnidadVO;
	}
	
	
	
	
	/** 
	 * Metodo que permite convertir de una lista de unidad de negocio 
	 * a una unidad de negocio Value Object
	 * @param listaUnidad
	 * @return
	 */
	private   List<UnidadDeNegocioVO>  convierteUnidadNegocioToUnidadNegocioVO(List<UnidadDeNegocio> listaUnidad){
		List<UnidadDeNegocioVO> listaUnidadVO = new ArrayList<UnidadDeNegocioVO>();
		 for (UnidadDeNegocio elemento : listaUnidad) {
				UnidadDeNegocioVO unidadVO = UnidadDeNegocioAssambler.getUnidadDeNegocioVO(elemento);
				
				 if(elemento!=null && elemento.getUnegTipoInstrumento()!=null){
					 
						
					 
						EstaticosVO catalogoEstatico=null;
						try {
							catalogoEstatico = this.catalogoEstaticoBO.consultaPorTipoInstrumento(elemento.getUnegTipoInstrumento());
						} catch (EfectivoAplicacionBOException e) {
							e.printStackTrace();
						}
						
						unidadVO.setTipoInstrumento(catalogoEstatico.getDesc());
					 }
				listaUnidadVO.add(unidadVO);

			}
		 return listaUnidadVO;
	}
	
	
}
