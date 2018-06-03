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
import java.math.BigInteger;

/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class EtvVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    

    
    private BigInteger idnSubboveda;
    private Short etvIdn;
    private String etvNombreCorto;
    private String etvCalle;
    private String etvColonia;
    private Integer etvCp;
    private String etvDeleg;
    private Short etvTipoServico;
    private String etvBajaLogica;
    private Short idEstadoRepublica;
    private String etvNombreLargo;
	private String etvContacto;

	public String getEtvContacto() {
		return etvContacto;
	}

	public void setEtvContacto(String etvContacto) {
		this.etvContacto = etvContacto;
	}

	public String getEtvNombreCorto() {
		return etvNombreCorto;
	}

	public void setEtvNombreCorto(String etvNombreCorto) {
		this.etvNombreCorto = etvNombreCorto;
	}

	public String getEtvNombreLargo() {
		return etvNombreLargo;
	}

	public void setEtvNombreLargo(String etvNombreLargo) {
		this.etvNombreLargo = etvNombreLargo;
	}
	public Short getEtvIdn() {
		return etvIdn;
	}
	public void setEtvIdn(Short etvIdn) {
		this.etvIdn = etvIdn;
	}
	public BigInteger getIdnSubboveda() {
		return idnSubboveda;
	}
	public void setIdnSubboveda(BigInteger idnSubboveda) {
		this.idnSubboveda = idnSubboveda;
	}
	public String getEtvCalle() {
		return etvCalle;
	}
	public void setEtvCalle(String etvCalle) {
		this.etvCalle = etvCalle;
	}
	public String getEtvColonia() {
		return etvColonia;
	}
	public void setEtvColonia(String etvColonia) {
		this.etvColonia = etvColonia;
	}
	public Integer getEtvCp() {
		return etvCp;
	}
	public void setEtvCp(Integer etvCp) {
		this.etvCp = etvCp;
	}
	public String getEtvDeleg() {
		return etvDeleg;
	}
	public void setEtvDeleg(String etvDeleg) {
		this.etvDeleg = etvDeleg;
	}

	public Short getEtvTipoServico() {
		return etvTipoServico;
	}
	public void setEtvTipoServico(Short etvTipoServico) {
		this.etvTipoServico = etvTipoServico;
	}
	public String getEtvBajaLogica() {
		return etvBajaLogica;
	}
	public void setEtvBajaLogica(String etvBajaLogica) {
		this.etvBajaLogica = etvBajaLogica;
	}
	public Short getIdEstadoRepublica() {
		return idEstadoRepublica;
	}
	public void setIdEstadoRepublica(Short idEstadoRepublica) {
		this.idEstadoRepublica = idEstadoRepublica;
	}
	
	@Override
	public String toString() {
		return "EtvVO [etvIdn=" + etvIdn 
				+ ", idnSubboveda=" + idnSubboveda 
				+ ", etvNombreCorto=\'" + etvNombreCorto 
				+ ", etvNombreLargo=\'" + etvNombreLargo 
				+ "\', etvCalle=\'" + etvCalle
				+ "\', etvColonia=\'" + etvColonia 
				+ "\', etvCp=" + etvCp
				+ ", etvDeleg=\'" + etvDeleg 
				+ "\', etvContacto=\'" + etvContacto
				+ "\', etvTipoServico=" + etvTipoServico 
				+ ", etvBajaLogica=\'" + etvBajaLogica 
				+ "\', idEstadoRepublica=" + idEstadoRepublica	+ "]";
	}
   
}