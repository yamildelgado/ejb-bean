/*  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.facade.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.captura.bo.AsginarTurnosBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.AuditoriaOperacionProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.CambioDeLaFechaContableBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.InicioFinTurnoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.RecepcionEfectivoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.SolicitudDotacionBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;

/**
 * @author JESUS CARBAJAL MONTES
 * @author ING.SIST.COMP OMAR ARTURO LOPEZ RODRIGUEZ
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO 
 */
@Stateless
public class CapturaFacadeImpl implements CapturaFacade{
	
	
	@EJB private RecepcionEfectivoBOBeanLocal recepcionEfectivoBO;
	@EJB private InicioFinTurnoBOBeanLocal inicioFinTurnoBO;
	@EJB private AuditoriaOperacionProcesadoraBOBeanLocal auditoriaOpProce;
	@EJB private AsginarTurnosBOBeanLocal asginarTurnosBOBeanLocal;
	@EJB private SolicitudDotacionBOBeanLocal solicitudDotacionBOBeanLocal;
	@EJB private CambioDeLaFechaContableBOBeanLocal cambioDeLaFechaContableBOBeanLocal;
	/**
	 * @return the RecepcionEfectivoBOBeanLocal
	 */
	@Override
	public RecepcionEfectivoBOBeanLocal getRecepcionEfectivoBOBeanLocal()
	{
		return this.recepcionEfectivoBO;
	}
	/**
	 * @return the InicioFinTurnoBOBeanLocal
	 */

	@Override
	public InicioFinTurnoBOBeanLocal getInicioFinTurnoBOBeanLocal() {
		
		return this.inicioFinTurnoBO;
	}
	@Override
	public AuditoriaOperacionProcesadoraBOBeanLocal getAuditoriaOperacionProcesadoraBOBeanLocal() {
		
		return this.auditoriaOpProce;
	}
	@Override
	public AsginarTurnosBOBeanLocal getAsginarTurnosBOBeanLocal() {
		
		return this.asginarTurnosBOBeanLocal;
	}
	@Override
	public SolicitudDotacionBOBeanLocal getSolicitudDotacionBOBeanLocal() {
		return this.solicitudDotacionBOBeanLocal;
	}
	@Override
	public CambioDeLaFechaContableBOBeanLocal getCambioDeLaFechaContableBOBeanLocal(){
		return this.cambioDeLaFechaContableBOBeanLocal;
	}
}
