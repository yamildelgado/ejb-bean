/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class CriterioAgrupadorAeWebVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Short agrupadorIdn;
	/**
	 * @return the agrupadorIdn
	 */
	public Short getAgrupadorIdn() {
		return agrupadorIdn;
	}
	/**
	 * @param agrupadorIdn the agrupadorIdn to set
	 */
	public void setAgrupadorIdn(Short agrupadorIdn) {
		this.agrupadorIdn = agrupadorIdn;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
