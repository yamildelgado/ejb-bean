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
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 *
 */


public class DivisaVO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short divisaNumeroID;
	private String nombreCorto;
	private String nombreLargo;
	private String abreviatura;
	
	/**
	 * @return the divisaNumeroID
	 */
	public Short getDivisaNumeroID() {
		return divisaNumeroID;
	}
	/**
	 * @param divisaNumeroID the divisaNumeroID to set
	 */
	public void setDivisaNumeroID(Short divisaNumeroID) {
		this.divisaNumeroID = divisaNumeroID;
	}
	
	
	/**
	 * @return the nombreCorto
	 */
	public String getNombreCorto() {
		return nombreCorto;
	}
	/**
	 * @param nombreCorto the nombreCorto to set
	 */
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	
	
	/**
	 * @return the abreviatura
	 */
	public String getAbreviatura() {
		return abreviatura;
	}
	/**
	 * @param abreviatura the abreviatura to set
	 */
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	
	/**
	 * @return the nombreLargo
	 */
	public String getNombreLargo() {
		return nombreLargo;
	}
	/**
	 * @param nombreLargo the nombreLargo to set
	 */
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	@Override
	public String toString() {
		return "DivisaVO [divisaId=" + divisaNumeroID 
				+ ", divisaAbreviatura=\'"	  + abreviatura 
				+ "\', divisaNomLargo=\'" + nombreLargo + "\']";
	}

}
