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
public class CriterioRecepcionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short cajaIdn;
	private Date recepFecHrIni;
	private short etvIdn;
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
	 * @return the recepFecHrIni
	 */
	public Date getRecepFecHrIni() {
		return recepFecHrIni;
	}
	/**
	 * @param recepFecHrIni the recepFecHrIni to set
	 */
	public void setRecepFecHrIni(Date recepFecHrIni) {
		this.recepFecHrIni = recepFecHrIni;
	}
	/**
	 * @return the etvIdn
	 */
	public short getEtvIdn() {
		return etvIdn;
	}
	/**
	 * @param etvIdn the etvIdn to set
	 */
	public void setEtvIdn(short etvIdn) {
		this.etvIdn = etvIdn;
	}
	

}
