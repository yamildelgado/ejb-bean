/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;


/**
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 *
 */
public class MensajeAewebVO implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mensajeCodigo;
	 private String mensajeNombre;
     private String mensajeDescripcion;
     private String mensajeBajaLogica;
	/**
	 * @return the mensajeCodigo
	 */
	public Integer getMensajeCodigo() {
		return mensajeCodigo;
	}
	/**
	 * @param mensajeCodigo the mensajeCodigo to set
	 */
	public void setMensajeCodigo(Integer mensajeCodigo) {
		this.mensajeCodigo = mensajeCodigo;
	}
	/**
	 * @return the mensajeNombre
	 */
	public String getMensajeNombre() {
		return mensajeNombre;
	}
	/**
	 * @param mensajeNombre the mensajeNombre to set
	 */
	public void setMensajeNombre(String mensajeNombre) {
		this.mensajeNombre = mensajeNombre;
	}
	/**
	 * @return the mensajeDescripcion
	 */
	public String getMensajeDescripcion() {
		return mensajeDescripcion;
	}
	/**
	 * @param mensajeDescripcion the mensajeDescripcion to set
	 */
	public void setMensajeDescripcion(String mensajeDescripcion) {
		this.mensajeDescripcion = mensajeDescripcion;
	}
	/**
	 * @return the mensajeBajaLogica
	 */
	public String getMensajeBajaLogica() {
		return mensajeBajaLogica;
	}
	/**
	 * @param mensajeBajaLogica the mensajeBajaLogica to set
	 */
	public void setMensajeBajaLogica(String mensajeBajaLogica) {
		this.mensajeBajaLogica = mensajeBajaLogica;
	}
	
	@Override
	public String toString() {
		return "MensajeAewebVO [mensajeCodigo=" + mensajeCodigo
				+ ", mensajeNombre=" + mensajeNombre + ", mensajeDescripcion="
				+ mensajeDescripcion + ", mensajeBajaLogica="
				+ mensajeBajaLogica + "]";
	}
     
 }
