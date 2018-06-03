/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class CriterioCajaHabilitadaPorTurnoVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short cajaIdn;
	private Date cajahabFecHrHabilita;
	
	/**
	 * @return the cajaIdn
	 */
	public short getCajaIdn() {
		return cajaIdn;
	}
	/**
	 * @param cajaIdn the cajaIdn to set
	 */
	public void setCajaIdn(short cajaIdn) {
		this.cajaIdn = cajaIdn;
	}
	/**
	 * @return the cajahabFecHrHabilita
	 */
	public Date getCajahabFecHrHabilita() {
		return cajahabFecHrHabilita;
	}
	/**
	 * @param cajahabFecHrHabilita the cajahabFecHrHabilita to set
	 */
	public void setCajahabFecHrHabilita(Date cajahabFecHrHabilita) {
		this.cajahabFecHrHabilita = cajahabFecHrHabilita;
	}

}
