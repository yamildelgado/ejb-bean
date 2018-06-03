/* 
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.facade;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.negocio.captura.bo.AsginarTurnosBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.AuditoriaOperacionProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.CambioDeLaFechaContableBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.InicioFinTurnoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.RecepcionEfectivoBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.SolicitudDotacionBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;


/**
 * @author JESUS CARBAJAL MONTES
 * @author ING.SIST.COMP OMAR ARTURO LOPEZ RODRIGUEZ
 * @author BECARIO.YAMIL OMAR DELGADO GONZALEZ
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 */
@Local
public interface CapturaFacade {
	/**
	 * @return RecepcionEfectivoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract RecepcionEfectivoBOBeanLocal getRecepcionEfectivoBOBeanLocal();
	
	/**
	 * @return R InicioFinTurnoBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract InicioFinTurnoBOBeanLocal getInicioFinTurnoBOBeanLocal();
	
	/**
	 * @return
	 */
	public abstract AuditoriaOperacionProcesadoraBOBeanLocal getAuditoriaOperacionProcesadoraBOBeanLocal();
	
	/**
	 * @return
	 */
	public abstract AsginarTurnosBOBeanLocal getAsginarTurnosBOBeanLocal();
	/**
	 * @return
	 */
	public abstract SolicitudDotacionBOBeanLocal getSolicitudDotacionBOBeanLocal();
	/**
	 * @return  CambioDeLaFechaContableBOBeanLocal
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract CambioDeLaFechaContableBOBeanLocal getCambioDeLaFechaContableBOBeanLocal();
}
