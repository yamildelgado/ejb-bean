/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class LoteVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loteIdn;
	private String loteStatus;
	private Long loteCajaId;
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
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
	 * @return the loteStatus
	 */
	public String getLoteStatus() {
		return loteStatus;
	}
	/**
	 * @param loteStatus the loteStatus to set
	 */
	public void setLoteStatus(String loteStatus) {
		this.loteStatus = loteStatus;
	}
	/**
	 * @return the loteCajaId
	 */
	public Long getLoteCajaId() {
		return loteCajaId;
	}
	/**
	 * @param loteCajaId the loteCajaId to set
	 */
	public void setLoteCajaId(Long loteCajaId) {
		this.loteCajaId = loteCajaId;
	}

	
}
