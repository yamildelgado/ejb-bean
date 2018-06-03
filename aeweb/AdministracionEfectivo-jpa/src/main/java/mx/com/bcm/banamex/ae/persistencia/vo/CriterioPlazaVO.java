/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author VELAZQUEZ DIEZ BARROSO MARIO ALBERTO
 *
 */
public class CriterioPlazaVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long plazaIdn;
	private String plazaNombre;
	private String bajaLogica;
	
	
	public Long getPlazaIdn() {
		return plazaIdn;
	}
	public void setPlazaIdn(Long plazaIdn) {
		this.plazaIdn = plazaIdn;
	}
	/**
	 * @return the bajaLogica
	 */
	public String getBajaLogica() {
		return bajaLogica;
	}
	/**
	 * @param bajaLogica the bajaLogica to set
	 */
	public void setBajaLogica(String bajaLogica) {
		this.bajaLogica = bajaLogica;
	}
	public String getPlazaNombre() {
		return plazaNombre;
	}
	public void setPlazaNombre(String plazaNombre) {
		this.plazaNombre = plazaNombre;
	}
	
	

	

}
