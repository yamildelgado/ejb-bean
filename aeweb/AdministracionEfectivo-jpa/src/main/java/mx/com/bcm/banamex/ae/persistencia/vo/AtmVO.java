/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;



/**
 * @author OCE-WCD OMAR ARTURO LOPEZ RODRIGUEZ
 * 
 */
public class AtmVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    private Short atmIdn;
	    private Short atmNumCtaUnicaAsoc;	    
	    private String atmTipoOficina;	    
	    private String atmTipoInmueble;	    
	    private String atmDescripcion;	    
	    private String atmDescripcionAbrev;	    
	    private Short atmSirhAsignado;	    
	    private Short atmStatus;	   
	    private String atmBajaLogica;	 
	    private Short etvsIdn;	    
	    private Integer CpaesEstructurasirhIdn;
		/**
		 * @return the atmIdn
		 */
		public Short getAtmIdn() {
			return atmIdn;
		}
		/**
		 * @param atmIdn the atmIdn to set
		 */
		public void setAtmIdn(Short atmIdn) {
			this.atmIdn = atmIdn;
		}
		/**
		 * @return the atmNumCtaUnicaAsoc
		 */
		public Short getAtmNumCtaUnicaAsoc() {
			return atmNumCtaUnicaAsoc;
		}
		/**
		 * @param atmNumCtaUnicaAsoc the atmNumCtaUnicaAsoc to set
		 */
		public void setAtmNumCtaUnicaAsoc(Short atmNumCtaUnicaAsoc) {
			this.atmNumCtaUnicaAsoc = atmNumCtaUnicaAsoc;
		}
		/**
		 * @return the atmTipoOficina
		 */
		public String getAtmTipoOficina() {
			return atmTipoOficina;
		}
		/**
		 * @param atmTipoOficina the atmTipoOficina to set
		 */
		public void setAtmTipoOficina(String atmTipoOficina) {
			this.atmTipoOficina = atmTipoOficina;
		}
		/**
		 * @return the atmTipoInmueble
		 */
		public String getAtmTipoInmueble() {
			return atmTipoInmueble;
		}
		/**
		 * @param atmTipoInmueble the atmTipoInmueble to set
		 */
		public void setAtmTipoInmueble(String atmTipoInmueble) {
			this.atmTipoInmueble = atmTipoInmueble;
		}
		/**
		 * @return the atmDescripcion
		 */
		public String getAtmDescripcion() {
			return atmDescripcion;
		}
		/**
		 * @param atmDescripcion the atmDescripcion to set
		 */
		public void setAtmDescripcion(String atmDescripcion) {
			this.atmDescripcion = atmDescripcion;
		}
		/**
		 * @return the atmDescripcionAbrev
		 */
		public String getAtmDescripcionAbrev() {
			return atmDescripcionAbrev;
		}
		/**
		 * @param atmDescripcionAbrev the atmDescripcionAbrev to set
		 */
		public void setAtmDescripcionAbrev(String atmDescripcionAbrev) {
			this.atmDescripcionAbrev = atmDescripcionAbrev;
		}
		/**
		 * @return the atmSirhAsignado
		 */
		public Short getAtmSirhAsignado() {
			return atmSirhAsignado;
		}
		/**
		 * @param atmSirhAsignado the atmSirhAsignado to set
		 */
		public void setAtmSirhAsignado(Short atmSirhAsignado) {
			this.atmSirhAsignado = atmSirhAsignado;
		}
		/**
		 * @return the atmStatus
		 */
		public Short getAtmStatus() {
			return atmStatus;
		}
		/**
		 * @param atmStatus the atmStatus to set
		 */
		public void setAtmStatus(Short atmStatus) {
			this.atmStatus = atmStatus;
		}
		/**
		 * @return the atmBajaLogica
		 */
		public String getAtmBajaLogica() {
			return atmBajaLogica;
		}
		/**
		 * @param atmBajaLogica the atmBajaLogica to set
		 */
		public void setAtmBajaLogica(String atmBajaLogica) {
			this.atmBajaLogica = atmBajaLogica;
		}
		/**
		 * @return the etvsIdn
		 */
		public Short getEtvsIdn() {
			return etvsIdn;
		}
		/**
		 * @param etvsIdn the etvsIdn to set
		 */
		public void setEtvsIdn(Short etvsIdn) {
			this.etvsIdn = etvsIdn;
		}
		/**
		 * @return the sirhIdn
		 */
		public Integer getCpaesEstructuraSirhIdn() {
			return CpaesEstructurasirhIdn;
		}
		/**
		 * @param sirhIdn the sirhIdn to set
		 */
		public void setCpaesEstructuraSirhIdn(Integer CpaesEstructurasirhIdn) {
			this.CpaesEstructurasirhIdn = CpaesEstructurasirhIdn;
		}
		
	    
}
