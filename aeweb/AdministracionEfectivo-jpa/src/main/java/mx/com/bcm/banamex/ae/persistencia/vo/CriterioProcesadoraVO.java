/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author CARLOS MONTIEL 
 *
 */
public class CriterioProcesadoraVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer procesadoraSirhId;
	  
    private Short procesadoraEtvId;

	

	

	/**
	 * @return the procesadoraEtvId
	 */
	public Short getProcesadoraEtvId() {
		return procesadoraEtvId;
	}

	/**
	 * @param procesadoraEtvId the procesadoraEtvId to set
	 */
	public void setProcesadoraEtvId(Short procesadoraEtvId) {
		this.procesadoraEtvId = procesadoraEtvId;
	}

	/**
	 * @return the procesadoraSirhId
	 */
	public Integer getProcesadoraSirhId() {
		return procesadoraSirhId;
	}

	/**
	 * @param procesadoraSirhId the procesadoraSirhId to set
	 */
	public void setProcesadoraSirhId(Integer procesadoraSirhId) {
		this.procesadoraSirhId = procesadoraSirhId;
	}
    
    
   

}
