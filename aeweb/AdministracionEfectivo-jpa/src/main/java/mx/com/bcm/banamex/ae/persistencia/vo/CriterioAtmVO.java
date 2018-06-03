/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CriterioAtmVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short atmIdn;
	private String bajaLogica;
	
	
	public Short getAtmIdn() {
		return atmIdn;
	}
	public void setAtmIdn(Short atmIdn) {
		this.atmIdn = atmIdn;
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
	
	

	

}
