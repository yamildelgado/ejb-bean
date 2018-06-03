/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class CriterioEmpleadoVO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer empNomina;
    private Short empPerfil;
    private String empNombre;
    private String empPaterno;
    private String empMaterno;
    private String empBajaLogica;
	
    public Integer getEmpNomina() {
		return empNomina;
	}
	public void setEmpNomina(Integer empNomina) {
		this.empNomina = empNomina;
	}
	public Short getEmpPerfil() {
		return empPerfil;
	}
	public void setEmpPerfil(Short empPerfil) {
		this.empPerfil = empPerfil;
	}
	public String getEmpNombre() {
		return empNombre;
	}
	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}
	public String getEmpPaterno() {
		return empPaterno;
	}
	public void setEmpPaterno(String empPaterno) {
		this.empPaterno = empPaterno;
	}
	public String getEmpMaterno() {
		return empMaterno;
	}
	public void setEmpMaterno(String empMaterno) {
		this.empMaterno = empMaterno;
	}
	public String getEmpBajaLogica() {
		return empBajaLogica;
	}
	public void setEmpBajaLogica(String empBajaLogica) {
		this.empBajaLogica = empBajaLogica;
	}
}
