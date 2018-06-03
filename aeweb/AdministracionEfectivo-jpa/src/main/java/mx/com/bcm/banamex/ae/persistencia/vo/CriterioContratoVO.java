/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CriterioContratoVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numContrato;

	/**
	 * @param numContrato the numContrato to set
	 */
	public void setNumContrato(String numContrato) {
		this.numContrato = numContrato;
	}
	
	/**
	 * @return the numContrato
	 */
	public String getNumContrato() {
		return numContrato;
	}
	
	
	
	

}
