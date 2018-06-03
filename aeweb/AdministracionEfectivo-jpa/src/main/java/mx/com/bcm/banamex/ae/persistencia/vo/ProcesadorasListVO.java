/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
public class ProcesadorasListVO {
	private Short etvIdn;
	//private String etvNombreCorto;
	private String etvNombreLargo;
	private Integer cpaesEstructuraSirhIdn;
	private String sirhNombre;
	private String cadenaFormato;
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
	 * @return the cpaesEstructuraSirhIdn
	 */
	public Integer getCpaesEstructuraSirhIdn() {
		return cpaesEstructuraSirhIdn;
	}
	/**
	 * @param cpaesEstructuraSirhIdn the cpaesEstructuraSirhIdn to set
	 */
	public void setCpaesEstructuraSirhIdn(Integer cpaesEstructuraSirhIdn) {
		this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
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
	public String getCadenaFormato() {
		return cadenaFormato;
	}
	public void setCadenaFormato(String cadenaFormato) {
		this.cadenaFormato = cadenaFormato;
	}

}
