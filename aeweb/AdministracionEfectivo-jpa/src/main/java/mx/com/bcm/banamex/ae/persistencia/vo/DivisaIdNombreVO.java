/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
public class DivisaIdNombreVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short divisaId;
	private String divisaNomLargo;
	/**
	 * @return the divisaId
	 */
	public Short getDivisaId() {
		return divisaId;
	}
	/**
	 * @param divisaId the divisaId to set
	 */
	public void setDivisaId(Short divisaId) {
		this.divisaId = divisaId;
	}
	/**
	 * @return the divisaNomLargo
	 */
	public String getDivisaNomLargo() {
		return divisaNomLargo;
	}
	/**
	 * @param divisaNomLargo the divisaNomLargo to set
	 */
	public void setDivisaNomLargo(String divisaNomLargo) {
		this.divisaNomLargo = divisaNomLargo;
	}

}
