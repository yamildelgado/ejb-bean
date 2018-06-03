/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.FieldResult;
import javax.persistence.EntityResult;
import javax.persistence.Transient;



/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */

@SqlResultSetMapping(name= "consulta",
		  entities={
		    @EntityResult(
		      entityClass=OperacionProcesadoraDTO.class,
		      fields={
		    	 @FieldResult(name="estructraSirh", column="ESTRUCTRA_SIRH" ),
		    	 @FieldResult(name="sirhNombre", column="SIRH_NOMBRE"),
		         @FieldResult(name="etvIdn", column="ETV_IDN"),
		        @FieldResult(name="etvNombreLargo", column="ETV_NOMBRE_LARGO")})
		    }	)
@Entity
public class OperacionProcesadoraDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ESTRUCTRA_SIRH") 
	private int estructraSirh;
	@Column(name = "ETV_NOMBRE_LARGO")
	private String etvNombreLargo;
	@Id
	@Column(name = "ETV_IDN")
	private Short etvIdn;
	@Column(name = "SIRH_NOMBRE")
	private String sirhNombre;
	@Transient
	private String cadenaFormato;
	/**
	 * @return the cadenaFormato
	 */
	public String getCadenaFormato() {
		return cadenaFormato;
	}
	/**
	 * @param cadenaFormato the cadenaFormato to set
	 */
	public void setCadenaFormato(String cadenaFormato) {
		this.cadenaFormato = cadenaFormato;
	}
	/**
	 * @return the estructraSirh
	 */
	public int getEstructraSirh() {
		return estructraSirh;
	}
	/**
	 * @param estructraSirh the estructraSirh to set
	 */
	public void setEstructraSirh(int estructraSirh) {
		this.estructraSirh = estructraSirh;
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
	 * @return the sirhNombre
	 */
	public String getSirhNombre() {
		return sirhNombre;
	}
	/**
	 * @param sirhNombre the sirhNombre to set
	 */
	public void setSirhNombre(String sirhNombre) {
		this.sirhNombre = sirhNombre;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
