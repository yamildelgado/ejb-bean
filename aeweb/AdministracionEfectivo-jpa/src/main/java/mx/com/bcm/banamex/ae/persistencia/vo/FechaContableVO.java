/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Jesús Carbajal Montes
 *
 */
public class FechaContableVO implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date    fecContId;
	private String feccontStatus;
	 
	/**
	 * @return the feccontStatus
	 */
	public String getFeccontStatus() {
		return feccontStatus;
	}

	/**
	 * @param feccontStatus the feccontStatus to set
	 */
	public void setFeccontStatus(String feccontStatus) {
		this.feccontStatus = feccontStatus;
	}

	/**
	 * @return the fecContId
	 */
	public Date getFecContId() {
		return fecContId;
	}
	
	/**
	 * @param fecContId the fecContId to set
	 */
	public void setFecContId(Date fecContId) {
		this.fecContId = fecContId;
	}
	

	 	 
}