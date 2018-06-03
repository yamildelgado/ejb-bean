/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

public class GeneralVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short contrato;
	private Short cpae;
	private Short unidadNegocio;
	/**
	 * @return the contrato
	 */
	public Short getContrato() {
		return contrato;
	}
	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(Short contrato) {
		this.contrato = contrato;
	}
	/**
	 * @return the cpae
	 */
	public Short getCpae() {
		return cpae;
	}
	/**
	 * @param cpae the cpae to set
	 */
	public void setCpae(Short cpae) {
		this.cpae = cpae;
	}
	/**
	 * @return the unidadNegocio
	 */
	public Short getUnidadNegocio() {
		return unidadNegocio;
	}
	/**
	 * @param unidadNegocio the unidadNegocio to set
	 */
	public void setUnidadNegocio(Short unidadNegocio) {
		this.unidadNegocio = unidadNegocio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeneralVO [cuentasPK.unegId=" + contrato + ", ctaCpaeId=" + cpae
				+ ", ctaUnidadnegocioId=" + unidadNegocio + "]";
	}
	
	
	

}
