/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Entity
public class EtvIdnNombreDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "ETV_NOMBRE_LARGO") //cambiar por nombre corto si y solo si se requiere
	private String etvNombreLargo;
	@Id
	@Column(name = "ETV_IDN")
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
