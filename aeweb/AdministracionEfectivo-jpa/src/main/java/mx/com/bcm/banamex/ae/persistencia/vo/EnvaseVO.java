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
public class EnvaseVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String compbteId;//comprobantepk
    private String envcNumPlomo;
	
    // comprobante
    private short etvIdn;
    
    private short agrupadorIdn;//agrupador
    private short aewebcatgralIdn;
    
	private Date envcFecContable;
	private Date envcFecTermino;
	private BigDecimal envcImpteDifMn;
	private BigDecimal envcImpteDifMe;
	private Short envcNumDocsSbc;
	private Date envcFecAsign;
	private Short envcReasign;
	private Short envcNumParciales;
	private Short envcExcedGrapa;
	private Short envcExcedMaxImpte;
	private Short envcMezclaConcep;
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
	 * @return the envcNumPlomo
	 */
	public String getEnvcNumPlomo() {
		return envcNumPlomo;
	}
	/**
	 * @param envcNumPlomo the envcNumPlomo to set
	 */
	public void setEnvcNumPlomo(String envcNumPlomo) {
		this.envcNumPlomo = envcNumPlomo;
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
	 * @return the envcFecContable
	 */
	public Date getEnvcFecContable() {
		return envcFecContable;
	}
	/**
	 * @param envcFecContable the envcFecContable to set
	 */
	public void setEnvcFecContable(Date envcFecContable) {
		this.envcFecContable = envcFecContable;
	}
	/**
	 * @return the envcFecTermino
	 */
	public Date getEnvcFecTermino() {
		return envcFecTermino;
	}
	/**
	 * @param envcFecTermino the envcFecTermino to set
	 */
	public void setEnvcFecTermino(Date envcFecTermino) {
		this.envcFecTermino = envcFecTermino;
	}
	/**
	 * @return the envcImpteDifMn
	 */
	public BigDecimal getEnvcImpteDifMn() {
		return envcImpteDifMn;
	}
	/**
	 * @param envcImpteDifMn the envcImpteDifMn to set
	 */
	public void setEnvcImpteDifMn(BigDecimal envcImpteDifMn) {
		this.envcImpteDifMn = envcImpteDifMn;
	}
	/**
	 * @return the envcImpteDifMe
	 */
	public BigDecimal getEnvcImpteDifMe() {
		return envcImpteDifMe;
	}
	/**
	 * @param envcImpteDifMe the envcImpteDifMe to set
	 */
	public void setEnvcImpteDifMe(BigDecimal envcImpteDifMe) {
		this.envcImpteDifMe = envcImpteDifMe;
	}
	/**
	 * @return the envcNumDocsSbc
	 */
	public Short getEnvcNumDocsSbc() {
		return envcNumDocsSbc;
	}
	/**
	 * @param envcNumDocsSbc the envcNumDocsSbc to set
	 */
	public void setEnvcNumDocsSbc(Short envcNumDocsSbc) {
		this.envcNumDocsSbc = envcNumDocsSbc;
	}
	/**
	 * @return the envcFecAsign
	 */
	public Date getEnvcFecAsign() {
		return envcFecAsign;
	}
	/**
	 * @param envcFecAsign the envcFecAsign to set
	 */
	public void setEnvcFecAsign(Date envcFecAsign) {
		this.envcFecAsign = envcFecAsign;
	}
	/**
	 * @return the envcReasign
	 */
	public Short getEnvcReasign() {
		return envcReasign;
	}
	/**
	 * @param envcReasign the envcReasign to set
	 */
	public void setEnvcReasign(Short envcReasign) {
		this.envcReasign = envcReasign;
	}
	/**
	 * @return the envcNumParciales
	 */
	public Short getEnvcNumParciales() {
		return envcNumParciales;
	}
	/**
	 * @param envcNumParciales the envcNumParciales to set
	 */
	public void setEnvcNumParciales(Short envcNumParciales) {
		this.envcNumParciales = envcNumParciales;
	}
	/**
	 * @return the envcExcedGrapa
	 */
	public Short getEnvcExcedGrapa() {
		return envcExcedGrapa;
	}
	/**
	 * @param envcExcedGrapa the envcExcedGrapa to set
	 */
	public void setEnvcExcedGrapa(Short envcExcedGrapa) {
		this.envcExcedGrapa = envcExcedGrapa;
	}
	/**
	 * @return the envcExcedMaxImpte
	 */
	public Short getEnvcExcedMaxImpte() {
		return envcExcedMaxImpte;
	}
	/**
	 * @param envcExcedMaxImpte the envcExcedMaxImpte to set
	 */
	public void setEnvcExcedMaxImpte(Short envcExcedMaxImpte) {
		this.envcExcedMaxImpte = envcExcedMaxImpte;
	}
	/**
	 * @return the envcMezclaConcep
	 */
	public Short getEnvcMezclaConcep() {
		return envcMezclaConcep;
	}
	/**
	 * @param envcMezclaConcep the envcMezclaConcep to set
	 */
	public void setEnvcMezclaConcep(Short envcMezclaConcep) {
		this.envcMezclaConcep = envcMezclaConcep;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
