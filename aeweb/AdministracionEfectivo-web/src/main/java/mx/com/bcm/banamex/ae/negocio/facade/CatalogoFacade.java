package mx.com.bcm.banamex.ae.negocio.facade;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoAtmBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoBancoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCajaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoContratoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCpaeBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCuentaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCuentaMayorBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDenominacionesDivisaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDiasInhabilesBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDivisaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEmpleadoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEtvBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoFechasContablesBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoMensajeAewebBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoModuloSistemaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoPlazaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoSIRHBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoSubBovedaBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoTurnoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoUnidadNegocioBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.ConsultasyReportesProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.TipoDeOperacionBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.catalogo.bo.TipoMovimientoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;

/**
 * @author CARLOS MONTIEL GUTIÉRREZ
 * @author YAMIL OMAR DELGADO GONZALEZ
 * @author ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 * @author ABRAHAM DANIEL DIAZ KIM
 * @author JUAN MANUEL HERNANDEZ NAVARRO
 * @author DAVID FERNANDO RUIZ MARTINEZ
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 * @author EDER ISRAEL VAZQUEZ REYES
 * @author JESUS CARBAJAL MONTES
 * @author INGRET AGUILAR VELAZQUEZ
 * @author MARIO ALBERTO VELAZQUEZ MARIO ALBERTO
 */
@Local
public interface CatalogoFacade {

	/**
	 * @return CatalogoAtmBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoAtmBOBeanLocal getCatalogoAtmBO();

	/**
	 * @return CatalogoBancoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoBancoBOBeanLocal getCatalogoBancoBO();

	/**
	 * r
	 * 
	 * @return CatalogoCajaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoCajaBOBeanLocal getCatalogoCajaBO();

	public abstract CatalogoProcesadoraBOBeanLocal getCatalogoProcesadoraBO();

	/**
	 * @return CatalogoCpaeBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoCpaeBOBeanLocal getCatalogoCpaeBO();

	/**
	 * @returnCatalogoCuentaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoCuentaBOBeanLocal getCatalogoCuentaBO();

	/**
	 * @return CatalogoDenominacionesBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoDenominacionesDivisaBOBeanLocal getCatalogoDenominaDivisaBO();

	/**
	 * @return CatalogoDivisaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoDivisaBOBeanLocal getCatalogoDivisaBO();

	/**
	 * @return CatalogoEmpleadoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoEmpleadoBOBeanLocal getCatalogoEmpleadoBO();

	/**
	 * @return CatalogoEtvBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoEtvBOBeanLocal getCatalogoEtvBO();

	/**
	 * @return CatalogoFechasContablesBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoFechasContablesBOBeanLocal getCatalogoFechasContablesBO();

	/**
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoMensajeAewebBOBeanLocal getCatalogoMensajeAewebBO();

	/**
	 * @return CatalogoModuloSistemaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoModuloSistemaBOBeanLocal getCatalogoModuloSistemaBO();

	/**
	 * @return CatalogoPlazaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoPlazaBOBeanLocal getCatalogoPlazaBO();

	/**
	 * @return CatalogoSIRHBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoSIRHBOBeanLocal getCatalogoSIRHBO();

	/**
	 * @return CatalogoSubBovedaBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoSubBovedaBOBeanLocal getCatalogoSubBovedaBO();

	/**
	 * @throws EfectivoAplicacionBOException
	 * @return CatalogoTurnoBOBeanLocal
	 */
	public abstract CatalogoTurnoBOBeanLocal getCatalogoTurnoBO();

	/**
	 * @return CatalogoUnidadNegocioBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoUnidadNegocioBOBeanLocal getCatalogoUnidadNegocioBO();

	/**
	 * @return CatalogoContratoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoContratoBOBeanLocal getContratoBO();

	public abstract CatalogoCuentaMayorBOBeanLocal getCuentaMayorBO();

	/**
	 * @return CatalogoDiasInhabilesBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CatalogoDiasInhabilesBOBeanLocal getCatalogoDiasInhabilesBO();

	/**
	 * @return ConsultasyReportesProcesadoraBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract ConsultasyReportesProcesadoraBOBeanLocal getConsultayReportesProcesadoraBO();

	/**
	 * @return TipoDeOperacionBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract TipoDeOperacionBOBeanLocal getTipoOperacionProcesadoraBO();

	/**
	 * @return TipoMoviemientoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract TipoMovimientoBOBeanLocal getTipoMovimientoProcesadorasBO();
}
