/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class ComprobanteVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String compbteId;//id comprobante
	private short etvIdn;
	
	private Date verifnFecHrIni;//campos de verificacion
	private short cajaIdn;
	
	private int cpaesEstructuraSirhIdn;//unidadnegocio
	private String cntrtoNum;
	private short unegId;
	
	private short tipoperIdn;//tipo de operacion
	private short tentidadIdn;
	
	private Date recepFecHrIni;//recepcion
	private short recepcajaIdn;
	
	private Integer loteIdn;// lote
	
	private short agrupadorIdn;//aeweb general
	private short aewebcatgralIdn;
	
	private Date compbteFecHrVerificacion;
	private Date compbteFecAsign;
	private BigDecimal compbteImpteTot;
	private Short compbteNumEnvases;
	private Short compbteReasignado;
	private Short compbteNivelDificultad;
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the compbteId
	 */
	public String getCompbteId() {
		return compbteId;
	}
	/**
	 * @param compbteId the compbteId to set
	 */
	public void setCompbteId(String compbteId) {
		this.compbteId = compbteId;
	}
	/**
	 * @return the etvIdn
	 */
	public short getEtvIdn() {
		return etvIdn;
	}
	/**
	 * @param etvIdn the etvIdn to set
	 */
	public void setEtvIdn(short etvIdn) {
		this.etvIdn = etvIdn;
	}
	/**
	 * @return the verifnFecHrIni
	 */
	public Date getVerifnFecHrIni() {
		return verifnFecHrIni;
	}
	/**
	 * @param verifnFecHrIni the verifnFecHrIni to set
	 */
	public void setVerifnFecHrIni(Date verifnFecHrIni) {
		this.verifnFecHrIni = verifnFecHrIni;
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
	 * @return the cpaesEstructuraSirhIdn
	 */
	public int getCpaesEstructuraSirhIdn() {
		return cpaesEstructuraSirhIdn;
	}
	/**
	 * @param cpaesEstructuraSirhIdn the cpaesEstructuraSirhIdn to set
	 */
	public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
		this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
	}
	/**
	 * @return the cntrtoNum
	 */
	public String getCntrtoNum() {
		return cntrtoNum;
	}
	/**
	 * @param cntrtoNum the cntrtoNum to set
	 */
	public void setCntrtoNum(String cntrtoNum) {
		this.cntrtoNum = cntrtoNum;
	}
	/**
	 * @return the unegId
	 */
	public short getUnegId() {
		return unegId;
	}
	/**
	 * @param unegId the unegId to set
	 */
	public void setUnegId(short unegId) {
		this.unegId = unegId;
	}
	/**
	 * @return the tipoperIdn
	 */
	public short getTipoperIdn() {
		return tipoperIdn;
	}
	/**
	 * @param tipoperIdn the tipoperIdn to set
	 */
	public void setTipoperIdn(short tipoperIdn) {
		this.tipoperIdn = tipoperIdn;
	}
	/**
	 * @return the tentidadIdn
	 */
	public short getTentidadIdn() {
		return tentidadIdn;
	}
	/**
	 * @param tentidadIdn the tentidadIdn to set
	 */
	public void setTentidadIdn(short tentidadIdn) {
		this.tentidadIdn = tentidadIdn;
	}
	/**
	 * @return the recepFecHrIni
	 */
	public Date getRecepFecHrIni() {
		return recepFecHrIni;
	}
	/**
	 * @param recepFecHrIni the recepFecHrIni to set
	 */
	public void setRecepFecHrIni(Date recepFecHrIni) {
		this.recepFecHrIni = recepFecHrIni;
	}
	/**
	 * @return the recepcajaIdn
	 */
	public short getRecepcajaIdn() {
		return recepcajaIdn;
	}
	/**
	 * @param recepcajaIdn the recepcajaIdn to set
	 */
	public void setRecepcajaIdn(short recepcajaIdn) {
		this.recepcajaIdn = recepcajaIdn;
	}
	/**
	 * @return the loteIdn
	 */
	public Integer getLoteIdn() {
		return loteIdn;
	}
	/**
	 * @param loteIdn the loteIdn to set
	 */
	public void setLoteIdn(Integer loteIdn) {
		this.loteIdn = loteIdn;
	}
	/**
	 * @return the agrupadorIdn
	 */
	public short getAgrupadorIdn() {
		return agrupadorIdn;
	}
	/**
	 * @param agrupadorIdn the agrupadorIdn to set
	 */
	public void setAgrupadorIdn(short agrupadorIdn) {
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
	 * @return the compbteFecHrVerificacion
	 */
	public Date getCompbteFecHrVerificacion() {
		return compbteFecHrVerificacion;
	}
	/**
	 * @param compbteFecHrVerificacion the compbteFecHrVerificacion to set
	 */
	public void setCompbteFecHrVerificacion(Date compbteFecHrVerificacion) {
		this.compbteFecHrVerificacion = compbteFecHrVerificacion;
	}
	/**
	 * @return the compbteFecAsign
	 */
	public Date getCompbteFecAsign() {
		return compbteFecAsign;
	}
	/**
	 * @param compbteFecAsign the compbteFecAsign to set
	 */
	public void setCompbteFecAsign(Date compbteFecAsign) {
		this.compbteFecAsign = compbteFecAsign;
	}
	/**
	 * @return the compbteImpteTot
	 */
	public BigDecimal getCompbteImpteTot() {
		return compbteImpteTot;
	}
	/**
	 * @param compbteImpteTot the compbteImpteTot to set
	 */
	public void setCompbteImpteTot(BigDecimal compbteImpteTot) {
		this.compbteImpteTot = compbteImpteTot;
	}
	/**
	 * @return the compbteNumEnvases
	 */
	public Short getCompbteNumEnvases() {
		return compbteNumEnvases;
	}
	/**
	 * @param compbteNumEnvases the compbteNumEnvases to set
	 */
	public void setCompbteNumEnvases(Short compbteNumEnvases) {
		this.compbteNumEnvases = compbteNumEnvases;
	}
	/**
	 * @return the compbteReasignado
	 */
	public Short getCompbteReasignado() {
		return compbteReasignado;
	}
	/**
	 * @param compbteReasignado the compbteReasignado to set
	 */
	public void setCompbteReasignado(Short compbteReasignado) {
		this.compbteReasignado = compbteReasignado;
	}
	/**
	 * @return the compbteNivelDificultad
	 */
	public Short getCompbteNivelDificultad() {
		return compbteNivelDificultad;
	}
	/**
	 * @param compbteNivelDificultad the compbteNivelDificultad to set
	 */
	public void setCompbteNivelDificultad(Short compbteNivelDificultad) {
		this.compbteNivelDificultad = compbteNivelDificultad;
	}
	
	
	

}
