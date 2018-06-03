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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCuentaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEstaticosBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CuentaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaCuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EstaticosVO;


/**
 * CatalogoContratoBOImplBean: Esta clase controla toda la logica de negocio del
 * caso de uso Cuenta,consulta de contratos,por identificador y detalle de una
 * Cuenta.
 * 
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */

public @Stateless
class CatalogoCuentaBOImplBean implements CatalogoCuentaBOBeanLocal {

	@EJB
	private CatalogoCuentaDAOBeanLocal cuentaDAO;
	@EJB
	private CatalogoDivisaDAOBeanLocal divisaDAO;
	@EJB
	private CatalogoEstaticosBOBeanLocal estaticoBO;
	private List<CuentaVO> listaCuentaVO;

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<CuentaVO> consultaCuentas()
			throws EfectivoAplicacionBOException {
		this.listaCuentaVO = new ArrayList<CuentaVO>();
		List<Cuenta> listaCuenta = null;
		try {
			listaCuenta = this.cuentaDAO.consultaCuenta();
		} catch (EfectivoAplicacionDAOException e) {

			e.printStackTrace();
		}
		for (Cuenta elemento : listaCuenta) {
			CuentaVO cuentaVO = CuentaAssambler.getCuentaVO(elemento);
			EstaticosVO tipoInstumento = this.estaticoBO
					.consultaPorTipoInstrumento(elemento
							.getCtaTipoInstrumento());
			cuentaVO.setTipoInstrumento(tipoInstumento.getDesc());

			listaCuentaVO.add(cuentaVO);
		}
		return listaCuentaVO;
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public CuentaVO consultaCuentaPorId(CriteriaCuentaVO criterioCuentaVO)
			throws EfectivoAplicacionBOException {
		CuentaVO cuentaVo = new CuentaVO();
		CuentaPK cuentasPK = new CuentaPK();
		cuentasPK.setCntrtoNum(criterioCuentaVO.getCntrtoNum());
		cuentasPK.setCpaesEstructuraSirhIdn(criterioCuentaVO
				.getCpaesEstructuraSirhIdn());
		cuentasPK.setCtaCuenta(criterioCuentaVO.getCtaCuenta());
		cuentasPK.setCtaSucursalId(criterioCuentaVO.getCtaSucursalId());
		cuentasPK.setUnegId(criterioCuentaVO.getUnegId());
		Cuenta elemento = this.cuentaDAO.findById(cuentasPK);
		cuentaVo = CuentaAssambler.getCuentaVODetalle(elemento);
		EstaticosVO tipoInstumento = this.estaticoBO
				.consultaPorTipoInstrumento(elemento.getCtaTipoInstrumento());
		cuentaVo.setTipoInstrumento(tipoInstumento.getDesc());
		cuentaVo.setReferencia1Tipo(this.estaticoBO
				.consultaPorTipoReferenciaCuenta(
						elemento.getCtaReferencia1Tipo()).getDesc());
		cuentaVo.setReferencia2Tipo(this.estaticoBO
				.consultaPorTipoReferenciaCuenta(
						elemento.getCtaReferencia2Tipo()).getDesc());
		cuentaVo.setReferencia3Tipo(this.estaticoBO
				.consultaPorTipoReferenciaCuenta(
						elemento.getCtaReferencia3Tipo()).getDesc());
		cuentaVo.setReferencia4Tipo(this.estaticoBO
				.consultaPorTipoReferenciaCuenta(
						elemento.getCtaReferencia4Tipo()).getDesc());
		return cuentaVo;

	}
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<CuentaVO> consultaParametrizada(
			CriteriaCuentaVO criteriaCuentaVO)
			throws EfectivoAplicacionBOException {

		this.listaCuentaVO = new ArrayList<CuentaVO>();
		List<Cuenta> listaCuenta = null;
		if (criteriaCuentaVO.getUnegId() == 0)
			criteriaCuentaVO.setUnegId(null);

		if (criteriaCuentaVO.getCpaesEstructuraSirhIdn() == 0)
			criteriaCuentaVO.setCpaesEstructuraSirhIdn(null);
		try {
			listaCuenta = this.cuentaDAO
					.consultaCuentaParametrizada(criteriaCuentaVO);
		} catch (EfectivoAplicacionDAOException e) {
			//
			e.printStackTrace();
		}
		for (Cuenta elemento : listaCuenta) {
			CuentaVO cuentaVO = CuentaAssambler.getCuentaVO(elemento);
			listaCuentaVO.add(cuentaVO);
		}
		listaCuenta = new ArrayList<Cuenta>();
		return listaCuentaVO;

	}

}
