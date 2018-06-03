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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoContratoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEstaticosBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoContratoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Contrato;
import mx.com.bcm.banamex.ae.persistencia.vo.ContratoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EstaticosVO;


import static mx.com.bcm.banamex.ae.persistencia.assambler.ContratoAssambler.getContratoVO;
import static mx.com.bcm.banamex.ae.persistencia.assambler.ContratoAssambler.getContratoVODetalle;


/**
 *  CatalogoContratoBOImplBean:
 *   Esta clase   controla toda la logica de negocio 
 *   del caso de uso Contrato,consulta de contratos,por identificador y detalle de un contrato.
 * 
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */

public @Stateless class CatalogoContratoBOImplBean implements CatalogoContratoBOBeanLocal {

	
	@EJB
	private CatalogoContratoDAOBeanLocal contratoDAO;
	@EJB 
	private CatalogoEstaticosBOBeanLocal catalogoEstaticoBO;
	private List<ContratoVO> listaContratoVO;
	
	/**
	 * Metodo que consultar la lista de contratos registrados en la base de
	 * datos AE-WEB,usa un DAO como auxiliar para acceder a la base de datos .
	 * 
	 * @see mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoContratoBOBeanLocal#consultaContrato()
	 */

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<ContratoVO> consultaContrato()
			throws EfectivoAplicacionBOException {
		this.listaContratoVO = new ArrayList<ContratoVO>();
		ContratoVO contratoVO = null;
		List<Contrato> listaContrato = this.contratoDAO.findAll();
		for (Contrato elemento : listaContrato) {

			contratoVO = getContratoVO(elemento);
			 if(elemento!=null && elemento.getCntrtoTipoInstrumento()!=null){
				 
				
				 
				EstaticosVO catalogoEstatico = this.catalogoEstaticoBO.consultaPorTipoInstrumento(elemento.getCntrtoTipoInstrumento());
				
				contratoVO.setTipoInstrumento(catalogoEstatico.getDesc());
			 }
			listaContratoVO.add(contratoVO);

		}
		listaContrato = new ArrayList<Contrato>();
		return listaContratoVO;
	}
	
	/**
	 *  Metodo que consulta una lista de contratos ,pasando como parametro 
	 *  la lista de parametros o criterios de busqueda ,para posteriormente
	 *  se devuelva una lista .
	 * (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoContratoBOBeanLocal#consultaContratoPorId(mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO)
	 */
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<ContratoVO> consultaContratoPorId(
			CriterioContratoVO criterioContratoVO)
			throws EfectivoAplicacionBOException {
		ContratoVO contratoVO = null;
		this.listaContratoVO = new ArrayList<ContratoVO>();

		if (criterioContratoVO.getNumContrato() != null) {
			try {
				Contrato contrato = this.contratoDAO
						.getContratoPorId(criterioContratoVO);
				contratoVO = getContratoVO(contrato);
				if(contrato!=null && contrato.getCntrtoTipoInstrumento()!=null){
					EstaticosVO catalogoEstatico = this.catalogoEstaticoBO.consultaPorTipoInstrumento(contrato.getCntrtoTipoInstrumento());
					contratoVO.setTipoInstrumento(catalogoEstatico.getDesc());
				 }
				listaContratoVO.add(contratoVO);
			} catch (EfectivoAplicacionDAOException e) {

				throw new EfectivoAplicacionBOException(
						"Ocurrio un error ,favor de revisar el log ");
			}
		} else {
			listaContratoVO = consultaContrato();
		}
		return listaContratoVO;
	}
/**
 *   Este metodo  devuelve el detalle del contrato que fue previamente 
 *   seleccionado,CriterioContrato posee la informacion del identificador del 
 *   contrato , trayendo consigo todo el detalle del contrato,devuelve un 
 *   objeto Contrato VO. 
 * (non-Javadoc)
 * @see mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoContratoBOBeanLocal#consultaContratoPorNumeroContrato(mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO)
 */
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public ContratoVO consultaContratoPorNumeroContrato(
			CriterioContratoVO criterioContratoVO)
			throws EfectivoAplicacionBOException {
		ContratoVO contratoVO = null;

		try {
			Contrato contrato = this.contratoDAO.getContratoPorId(criterioContratoVO);
			contratoVO = getContratoVODetalle(contrato);
			if(contrato!=null && contrato.getCntrtoTipoInstrumento()!=null){
				EstaticosVO catalogoEstatico = this.catalogoEstaticoBO.consultaPorTipoInstrumento(contrato.getCntrtoTipoInstrumento());
				contratoVO.setTipoInstrumento(catalogoEstatico.getDesc());
			 }
		} catch (EfectivoAplicacionDAOException e) {

			throw new EfectivoAplicacionBOException(
					"Ocurrio un error ,favor de revisar el log ");
		}
		return contratoVO;
	}

}
