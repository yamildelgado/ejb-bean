/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
public class EtvIdnNombreVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String etvNombreLargo;
	private Short etvIdn;
	/**
	 * @return the etvNombreLargo
	 */
	public String getEtvNombreLargo() {
		return etvNombreLargo;
	}
	/**
	 * @param etvNombreLargo the etvNombreLargo to set
	 */
	public void setEtvNombreLargo(String etvNombreLargo) {
		this.etvNombreLargo = etvNombreLargo;
	}
	/**
	 * @return the etvIdn
	 */
	public Short getEtvIdn() {
		return etvIdn;
	}
	/**
	 * @param etvIdn the etvIdn to set
	 */
	public void setEtvIdn(Short etvIdn) {
		this.etvIdn = etvIdn;
	}

}
