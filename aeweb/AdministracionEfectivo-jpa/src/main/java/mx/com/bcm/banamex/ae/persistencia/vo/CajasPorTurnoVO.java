/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CajasPorTurnoVO implements Serializable{
	
	private int cajaIdn;
	private int statcajaIdn;
	private String cajaxturnoStatus;
	private String turnoDescr;
	private int turnoId;
	
	
	/**
	 * @return the cajaIdn
	 */
	public int getCajaIdn() {
		return cajaIdn;
	}
	/**
	 * @param cajaIdn the cajaIdn to set
	 */
	public void setCajaIdn(int cajaIdn) {
		this.cajaIdn = cajaIdn;
	}
	/**
	 * @return the statcajaIdn
	 */
	public int getStatcajaIdn() {
		return statcajaIdn;
	}
	/**
	 * @param statcajaIdn the statcajaIdn to set
	 */
	public void setStatcajaIdn(int statcajaIdn) {
		this.statcajaIdn = statcajaIdn;
	}
	/**
	 * @return the cajaxturnoStatus
	 */
	public String getCajaxturnoStatus() {
		return cajaxturnoStatus;
	}
	/**
	 * @param cajaxturnoStatus the cajaxturnoStatus to set
	 */
	public void setCajaxturnoStatus(String cajaxturnoStatus) {
		this.cajaxturnoStatus = cajaxturnoStatus;
	}
	/**
	 * @return the turnoDescr
	 */
	public String getTurnoDescr() {
		return turnoDescr;
	}
	/**
	 * @param turnoDescr the turnoDescr to set
	 */
	public void setTurnoDescr(String turnoDescr) {
		this.turnoDescr = turnoDescr;
	}
	/**
	 * @return the turnoId
	 */
	public int getTurnoId() {
		return turnoId;
	}
	/**
	 * @param turnoId the turnoId to set
	 */
	public void setTurnoId(int turnoId) {
		this.turnoId = turnoId;
	}
	
	
	

}
