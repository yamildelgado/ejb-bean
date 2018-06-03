/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;



/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO 
 *
 */
public class CambioDeLaFechaContableVO extends ReporteAbstract implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	 private String histStatus;
	 private String histCambFecCont;
	 private Date fecContIdn;
	 private String turnoDes;
	 private String fecContStatus;
	 private Date dFestivo;
	 private Short eventoIdn;
	 private Integer bitacHistIdn;
	 private Date bitacFec;
	 private Date histFecContIni;
	 private String turnoStatus;
	 private String cambioStatus;
	 private Date hora;
	 private Integer sirhIdnCpae;
	 private String sirhNombreCpae;
	 private Short subboveda;
	 private String statusCamb;
	 private String cadena;
	 private Integer empNomina;
	 private String empNomb;
	 private String cadenaEmp;
	 private Date horafin;
	 
	public String getHistStatus() {
		return histStatus;
	}
	public void setHistStatus(String histStatus) {
		this.histStatus = histStatus;
	}
	public String getHistCambFecCont() {
		return histCambFecCont;
	}
	public void setHistCambFecCont(String histCambFecCont) {
		this.histCambFecCont = histCambFecCont;
	}

	public Date getdFestivo() {
		return dFestivo;
	}
	public void setdFestivo(Date dFestivo) {
		this.dFestivo = dFestivo;
	}
	public Short getEventoIdn() {
		return eventoIdn;
	}
	public void setEventoIdn(Short eventoIdn) {
		this.eventoIdn = eventoIdn;
	}
	public Integer getBitacHistIdn() {
		return bitacHistIdn;
	}
	public void setBitacHistIdn(Integer bitacHistIdn) {
		this.bitacHistIdn = bitacHistIdn;
	}
	public Date getBitacFec() {
		return bitacFec;
	}
	public void setBitacFec(Date bitacFec) {
		this.bitacFec = bitacFec;
	}
	public Date getHistFecContIni() {
		return histFecContIni;
	}
	public void setHistFecContIni(Date histFecContIni) {
		this.histFecContIni = histFecContIni;
	}
	public Date getFecContIdn() {
		return fecContIdn;
	}
	public void setFecContIdn(Date fecContIdn) {
		this.fecContIdn = fecContIdn;
	}

	public String getFecContStatus() {
		return fecContStatus;
	}
	public void setFecContStatus(String fecContStatus) {
		this.fecContStatus = fecContStatus;
	}
	public String getTurnoStatus() {
		return turnoStatus;
	}
	public void setTurnoStatus(String turnoStatus) {
		this.turnoStatus = turnoStatus;
	}
	public String getCambioStatus() {
		return cambioStatus;
	}
	public void setCambioStatus(String cambioStatus) {
		this.cambioStatus = cambioStatus;
	}
	
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Integer getSirhIdnCpae() {
		return sirhIdnCpae;
	}
	public void setSirhIdnCpae(Integer sirhIdnCpae) {
		this.sirhIdnCpae = sirhIdnCpae;
	}
	public String getSirhNombreCpae() {
		return sirhNombreCpae;
	}
	public void setSirhNombreCpae(String sirhNombreCpae) {
		this.sirhNombreCpae = sirhNombreCpae;
	}
	
	public String getStatusCamb() {
		return statusCamb;
	}
	public void setStatusCamb(String statusCamb) {
		this.statusCamb = statusCamb;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	public Short getSubboveda() {
		return subboveda;
	}
	public void setSubboveda(Short subboveda) {
		this.subboveda = subboveda;
	}
	public String getTurnoDes() {
		return turnoDes;
	}
	public void setTurnoDes(String turnoDes) {
		this.turnoDes = turnoDes;
	}
	
	
	public String getEmpNomb() {
		return empNomb;
	}
	public void setEmpNomb(String empNomb) {
		this.empNomb = empNomb;
	}
	public Integer getEmpNomina() {
		return empNomina;
	}
	public void setEmpNomina(Integer empNomina) {
		this.empNomina = empNomina;
	}
	public String getCadenaEmp() {
		return cadenaEmp;
	}
	public void setCadenaEmp(String cadenaEmp) {
		this.cadenaEmp = cadenaEmp;
	}
	public Date getHorafin() {
		return horafin;
	}
	public void setHorafin(Date horafin) {
		this.horafin = horafin;
	}
	
	 
	

	 
}
