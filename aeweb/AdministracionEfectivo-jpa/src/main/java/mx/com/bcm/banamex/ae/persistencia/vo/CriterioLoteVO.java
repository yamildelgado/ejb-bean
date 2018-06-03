/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class CriterioLoteVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loteIdn;
	/**
	 * @return the loteIdn
	 */
	public Integer getLoteIdn() {
		return loteIdn;
	}
	/**
	 * @param loteIdn the loteIdn to set
	 */
	public void setLoteIdn(Integer loteIdn) {
		this.loteIdn = loteIdn;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
