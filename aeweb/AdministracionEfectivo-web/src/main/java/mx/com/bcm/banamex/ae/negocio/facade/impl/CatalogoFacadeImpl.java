package mx.com.bcm.banamex.ae.negocio.facade.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.captura.bo.RecepcionEfectivoBOBeanLocal;
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
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;

/**
 * 
 * @author YAMIL OMAR DELGADO GONZALEZ
 * @author ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 * @author JESUS CARBAJL MONTES
 * 
 */


@Stateless
public  class   CatalogoFacadeImpl implements CatalogoFacade{
	
	@EJB private CatalogoAtmBOBeanLocal atmBO;
	@EJB private CatalogoBancoBOBeanLocal bancoBO;
    @EJB private CatalogoMensajeAewebBOBeanLocal catalogMensajeBO;
	@EJB private CatalogoContratoBOBeanLocal contratoBO;
	@EJB private CatalogoCpaeBOBeanLocal cpaeBO;
	@EJB private CatalogoCuentaBOBeanLocal cuentaBO;
	@EJB private CatalogoDenominacionesDivisaBOBeanLocal denominacionesDivisaBO;
	@EJB private CatalogoDivisaBOBeanLocal divisaBO;
	@EJB private CatalogoEmpleadoBOBeanLocal empleadoBO;
    @EJB private CatalogoEtvBOBeanLocal etvBO;
	@EJB private CatalogoFechasContablesBOBeanLocal fechasContablesBO;
    @EJB private CatalogoModuloSistemaBOBeanLocal moduloSistemaBO;
    @EJB private CatalogoPlazaBOBeanLocal plazaBO;
    @EJB private CatalogoSIRHBOBeanLocal sirhBO;
    @EJB private CatalogoSubBovedaBOBeanLocal subBovedaBO;
    @EJB private CatalogoTurnoBOBeanLocal turnoBO;
    @EJB private CatalogoUnidadNegocioBOBeanLocal unidadNegocioBO;
    @EJB private CatalogoCajaBOBeanLocal cajaBO;
    @EJB private CatalogoProcesadoraBOBeanLocal procesadoraBO;
    @EJB private CatalogoCuentaMayorBOBeanLocal cuentaMayorBO;
    @EJB private CatalogoDiasInhabilesBOBeanLocal diasInhabilesBO;
    @EJB private ConsultasyReportesProcesadoraBOBeanLocal consultayReportesProcesadoraBO;
    @EJB private TipoDeOperacionBOBeanLocal tipoOperacionBO;
    @EJB private TipoMovimientoBOBeanLocal tipoMovimientoBO;
    
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoAtmBO()
	 */
	@Override
	public CatalogoAtmBOBeanLocal getCatalogoAtmBO() {
		
		return this.atmBO;
	}
	
	
	
	
	@Override
	public CatalogoCajaBOBeanLocal getCatalogoCajaBO(){
		return this.cajaBO;
	}
		


	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoBancoBO()
	 */
	@Override
	public CatalogoBancoBOBeanLocal getCatalogoBancoBO() {
		return this.bancoBO;
	}


	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoCpaeBO()
	 */
	@Override
	public CatalogoCpaeBOBeanLocal getCatalogoCpaeBO() {
		
		return this.cpaeBO;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoCuentaBO()
	 */
	@Override
	public CatalogoCuentaBOBeanLocal getCatalogoCuentaBO() {
		return this.cuentaBO;
	}


	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoDenominaDivisaBO()
	 */
	@Override
	public CatalogoDenominacionesDivisaBOBeanLocal getCatalogoDenominaDivisaBO(){
		return this.denominacionesDivisaBO;
	}
	
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoDivisaBO()
	 */
	@Override
	public CatalogoDivisaBOBeanLocal getCatalogoDivisaBO() {
		
		return this.divisaBO;
	}

	
	
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoEmpleadoBO()
	 */
	@Override
	public CatalogoEmpleadoBOBeanLocal getCatalogoEmpleadoBO() {
		
		return this.empleadoBO;
	}




	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoEtvBO()
	 */
	@Override
	public CatalogoEtvBOBeanLocal getCatalogoEtvBO() {
	return  this.etvBO;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoFechasContablesBO()
	 */
	@Override
	public CatalogoFechasContablesBOBeanLocal getCatalogoFechasContablesBO() {
		return this.fechasContablesBO;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoModuloSistemaBO()
	 */
	@Override
	public CatalogoModuloSistemaBOBeanLocal getCatalogoModuloSistemaBO() {
		return this.moduloSistemaBO;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoPlazaBO()
	 */
	@Override
	public CatalogoPlazaBOBeanLocal getCatalogoPlazaBO() {
		return this.plazaBO;
	}
	
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoSIRHBO()
	 */
	@Override
	public CatalogoSIRHBOBeanLocal getCatalogoSIRHBO() {
		return this.sirhBO;
	}	


	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoSubBovedaBO()
	 */
	@Override
	public CatalogoSubBovedaBOBeanLocal getCatalogoSubBovedaBO() {
		return this.subBovedaBO;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoTurnoBO()
	 */
	@Override
	public CatalogoTurnoBOBeanLocal getCatalogoTurnoBO(){
		
		return this.turnoBO;
		
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getCatalogoUnidadNegocioBO()
	 */
	@Override
	public CatalogoUnidadNegocioBOBeanLocal getCatalogoUnidadNegocioBO() {
	   return this.unidadNegocioBO;
	}



	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.negocio.facade.CatalogoFacade#getContratoBO()
	 */
	@Override
	public CatalogoContratoBOBeanLocal getContratoBO() {
	
	   return this.contratoBO;
    }

	@Override
	public CatalogoMensajeAewebBOBeanLocal getCatalogoMensajeAewebBO() {
		return this.catalogMensajeBO;
	}


	@Override
	public CatalogoProcesadoraBOBeanLocal getCatalogoProcesadoraBO() {
		return this.procesadoraBO;
	}
	/**
	 * @return the diasInhabilesBO
	 */
	@Override
	public CatalogoDiasInhabilesBOBeanLocal getCatalogoDiasInhabilesBO(){
		return this.diasInhabilesBO;
	}


	/**
	 * @return the cuentaMayorBO
	 */
	@Override
	public CatalogoCuentaMayorBOBeanLocal getCuentaMayorBO() {
		return cuentaMayorBO;
	}		

	/**
	 * @return the cuentaMayorBO
	 */
	@Override
	public ConsultasyReportesProcesadoraBOBeanLocal getConsultayReportesProcesadoraBO() {
		return this.consultayReportesProcesadoraBO;
	}		

	/**
	 * @return the TipoDeOperacionBOBeanLocal
	 */
	@Override
	public TipoDeOperacionBOBeanLocal getTipoOperacionProcesadoraBO() {
		return this.tipoOperacionBO;
	}
	/**
	 * @return the TipoMovimientoBOBeanLocal
	 */
	@Override
	public TipoMovimientoBOBeanLocal getTipoMovimientoProcesadorasBO() {
		return this.tipoMovimientoBO;
	}
	
}