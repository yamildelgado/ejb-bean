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
public class DivisaIdNombreDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "DIVISA_NOM_CORTO") 
	private String divisaNombreCorto;
	
	@Id
	@Column(name = "DIVISA_ID")
	private Short divisa_Id;
	/**
	 * @return the divisaNombreCorto
	 */
	public String getDivisaNombreCorto() {
		return divisaNombreCorto;
	}
	/**
	 * @param divisaNombreCorto the divisaNombreCorto to set
	 */
	public void setDivisaNombreCorto(String divisaNombreCorto) {
		this.divisaNombreCorto = divisaNombreCorto;
	}
	/**
	 * @return the divisa_Id
	 */
	public Short getDivisa_Id() {
		return divisa_Id;
	}
	/**
	 * @param divisa_Id the divisa_Id to set
	 */
	public void setDivisa_Id(Short divisa_Id) {
		this.divisa_Id = divisa_Id;
	}

}
