/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion;
import mx.com.bcm.banamex.ae.persistencia.modelo.Verificacion;

/**
 * @author ING. SIST. COMP. OMAR ARTURO LOPEZ RODRIGUEZ
 * 
 */
public class CajaHabilitadaPorTurnoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Short cajahabCompbtesPendientes;

	private String cajahabFecHrDeshabilitada;

	private short cajaIdn;

	private String cajahabFecHrHabilita;
	private Integer nominaEmpleado;
	
	private Short agrupadorIdn;
	private short aewebcatgralIdn;
	private String status;
	
	private String aewebcatgralDescripcion;

	/**
	 * @return the cajahabCompbtesPendientes
	 */
	public Short getCajahabCompbtesPendientes() {
		return cajahabCompbtesPendientes;
	}

	/**
	 * @param cajahabCompbtesPendientes the cajahabCompbtesPendientes to set
	 */
	public void setCajahabCompbtesPendientes(Short cajahabCompbtesPendientes) {
		this.cajahabCompbtesPendientes = cajahabCompbtesPendientes;
	}

	/**
	 * @return the cajahabFecHrDeshabilitada
	 */
	public String getCajahabFecHrDeshabilitada() {
		return cajahabFecHrDeshabilitada;
	}

	/**
	 * @param cajahabFecHrDeshabilitada the cajahabFecHrDeshabilitada to set
	 */
	public void setCajahabFecHrDeshabilitada(String cajahabFecHrDeshabilitada) {
		this.cajahabFecHrDeshabilitada = cajahabFecHrDeshabilitada;
	}

	

	/**
	 * @return the cajaIdn
	 */
	public short getCajaIdn() {
		return cajaIdn;
	}

	/**
	 * @param cajaIdn the cajaIdn to set
	 */
	public void setCajaIdn(short cajaIdn) {
		this.cajaIdn = cajaIdn;
	}

	/**
	 * @return the cajahabFecHrHabilita
	 */
	public String getCajahabFecHrHabilita() {
		return cajahabFecHrHabilita;
	}

	/**
	 * @param cajahabFecHrHabilita the cajahabFecHrHabilita to set
	 */
	public void setCajahabFecHrHabilita(String cajahabFecHrHabilita) {
		this.cajahabFecHrHabilita = cajahabFecHrHabilita;
	}

	/**
	 * @return the agrupadorIdn
	 */
	public Short getAgrupadorIdn() {
		return agrupadorIdn;
	}

	/**
	 * @param agrupadorIdn the agrupadorIdn to set
	 */
	public void setAgrupadorIdn(Short agrupadorIdn) {
		this.agrupadorIdn = agrupadorIdn;
	}

	/**
	 * @return the aewebcatgralIdn
	 */
	public short getAewebcatgralIdn() {
		return aewebcatgralIdn;
	}

	/**
	 * @param aewebcatgralIdn the aewebcatgralIdn to set
	 */
	public void setAewebcatgralIdn(short aewebcatgralIdn) {
		this.aewebcatgralIdn = aewebcatgralIdn;
	}

	/**
	 * @return the nominaEmpleado
	 */
	public Integer getNominaEmpleado() {
		return nominaEmpleado;
	}

	/**
	 * @param nominaEmpleado the nominaEmpleado to set
	 */
	public void setNominaEmpleado(Integer nominaEmpleado) {
		this.nominaEmpleado = nominaEmpleado;
	}

	/**
	 * @return the aewebcatgralDescripcion
	 */
	public String getAewebcatgralDescripcion() {
		return aewebcatgralDescripcion;
	}

	/**
	 * @param aewebcatgralDescripcion the aewebcatgralDescripcion to set
	 */
	public void setAewebcatgralDescripcion(String aewebcatgralDescripcion) {
		this.aewebcatgralDescripcion = aewebcatgralDescripcion;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	

}
