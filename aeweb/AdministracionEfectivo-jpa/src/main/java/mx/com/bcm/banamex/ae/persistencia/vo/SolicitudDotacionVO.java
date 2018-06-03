/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;


/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */


public class SolicitudDotacionVO extends ReporteAbstract implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	    private Integer cpaesEstructuraSirhIdn;
	    private String cntrtoNum;
	    private Short unegId;
	    private Short etvIdn;
	    private String etvNombreLargo;
	    private Short ctaSucursalId;
	    private Long ctaCuenta;
	    private Short divisaId;
	    private String divisaNomCorto;
	    private String divisaNomLargo;
	    private String unegNombre;
	    
	    
	    
	    /**
		 * @return the unegNombre
		 */
		public String getUnegNombre() {
			return unegNombre;
		}
		/**
		 * @param unegNombre the unegNombre to set
		 */
		public void setUnegNombre(String unegNombre) {
			this.unegNombre = unegNombre;
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
		 * @return the ctaSucursalId
		 */
		public Short getCtaSucursalId() {
			return ctaSucursalId;
		}
		/**
		 * @param ctaSucursalId the ctaSucursalId to set
		 */
		public void setCtaSucursalId(Short ctaSucursalId) {
			this.ctaSucursalId = ctaSucursalId;
		}
		/**
		 * @return the ctaCuenta
		 */
		public Long getCtaCuenta() {
			return ctaCuenta;
		}
		/**
		 * @param ctaCuenta the ctaCuenta to set
		 */
		public void setCtaCuenta(Long ctaCuenta) {
			this.ctaCuenta = ctaCuenta;
		}
		/**
		 * @return the divisaId
		 */
		public Short getDivisaId() {
			return divisaId;
		}
		/**
		 * @param divisaId the divisaId to set
		 */
		public void setDivisaId(Short divisaId) {
			this.divisaId = divisaId;
		}
		/**
		 * @return the divisaNomCorto
		 */
		public String getDivisaNomCorto() {
			return divisaNomCorto;
		}
		/**
		 * @param divisaNomCorto the divisaNomCorto to set
		 */
		public void setDivisaNomCorto(String divisaNomCorto) {
			this.divisaNomCorto = divisaNomCorto;
		}
		/**
		 * @return the divisaNomLargo
		 */
		public String getDivisaNomLargo() {
			return divisaNomLargo;
		}
		/**
		 * @param divisaNomLargo the divisaNomLargo to set
		 */
		public void setDivisaNomLargo(String divisaNomLargo) {
			this.divisaNomLargo = divisaNomLargo;
		}
	    
	    
	    
	
}
