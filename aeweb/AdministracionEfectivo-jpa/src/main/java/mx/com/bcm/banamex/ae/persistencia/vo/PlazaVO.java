/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;



/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO 
 *
 */
public class PlazaVO implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private Long plazaIdn;
	 private String plazaNombre;
	 private String bajaLogica;
	 
	
	/**
	 * @return the plazaIdn
	 */
	public Long getPlazaIdn() {
		return plazaIdn;
	}
	/** 
	 * @param plazaIdn the plazaIdn to set
	 */
	public void setPlazaIdn(Long plazaIdn) {
		this.plazaIdn = plazaIdn;
	}
	/**
	 * @return the plazaNombre
	 */
	public String getPlazaNombre() {
		return plazaNombre;
	}
	/**
	 * @param plazaNombre the plazaNombre to set
	 */
	public void setPlazaNombre(String plazaNombre) {
		this.plazaNombre = plazaNombre;
	}
	public String getBajaLogica() {
		return bajaLogica;
	}
	public void setBajaLogica(String bajaLogica) {
		this.bajaLogica = bajaLogica;
	}

	
	 
	 
}
