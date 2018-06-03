/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JESSÚS CARBAJAL MONTES
 *
 */
public class RecepcionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private short cajaIdn;
	private Date recepFecHrIni;
	private short etvIdn;
	
	private Date cajahabFecHrHabilita;
	private Short unegId;
	private Integer cpaesEstructuraSirhIdn;
	private String cntrtoNum;
	private String recepNumCamionetv;
	private Date recepFecHrFin;
	private Short recepEnvases;
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
	 * @return the cajahabFecHrHabilita
	 */
	public Date getCajahabFecHrHabilita() {
		return cajahabFecHrHabilita;
	}
	/**
	 * @param cajahabFecHrHabilita the cajahabFecHrHabilita to set
	 */
	public void setCajahabFecHrHabilita(Date cajahabFecHrHabilita) {
		this.cajahabFecHrHabilita = cajahabFecHrHabilita;
	}
	/**
	 * @return the unegId
	 */
	public Short getUnegId() {
		return unegId;
	}
	/**
	 * @param unegId the unegId to set
	 */
	public void setUnegId(Short unegId) {
		this.unegId = unegId;
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
	 * @return the recepNumCamionetv
	 */
	public String getRecepNumCamionetv() {
		return recepNumCamionetv;
	}
	/**
	 * @param recepNumCamionetv the recepNumCamionetv to set
	 */
	public void setRecepNumCamionetv(String recepNumCamionetv) {
		this.recepNumCamionetv = recepNumCamionetv;
	}
	/**
	 * @return the recepFecHrFin
	 */
	public Date getRecepFecHrFin() {
		return recepFecHrFin;
	}
	/**
	 * @param recepFecHrFin the recepFecHrFin to set
	 */
	public void setRecepFecHrFin(Date recepFecHrFin) {
		this.recepFecHrFin = recepFecHrFin;
	}
	/**
	 * @return the recepEnvases
	 */
	public Short getRecepEnvases() {
		return recepEnvases;
	}
	/**
	 * @param recepEnvases the recepEnvases to set
	 */
	public void setRecepEnvases(Short recepEnvases) {
		this.recepEnvases = recepEnvases;
	}

}
