/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;
import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;


/**
 * @author ABRAHAM DANIEL DIAZ KIM
 * 
 */
	public class CuentaMayorVO extends ReporteAbstract implements Serializable{
		
		
	private static final long serialVersionUID = 1L;
			private Short conceptoId;
		    private String conceptoDescripcion;
		    private Short conceptoXdivisa;
		    private Short conceptoDoctoEfectivo;
		    private Short conceptoBillMon;
		    private Short conceptoXtipoctto;
		    private Short conceptoReferencia;
		    private Short conceptoS018;
		    private String BajaLogica;
			/**
			 * @return the conceptoId
			 */
			public Short getConceptoId() {
				return conceptoId;
			}
			/**
			 * @param conceptoId the conceptoId to set
			 */
			public void setConceptoId(Short conceptoId) {
				this.conceptoId = conceptoId;
			}
			/**
			 * @return the conceptoDescripcion
			 */
			public String getConceptoDescripcion() {
				return conceptoDescripcion;
			}
			/**
			 * @param conceptoDescripcion the conceptoDescripcion to set
			 */
			public void setConceptoDescripcion(String conceptoDescripcion) {
				this.conceptoDescripcion = conceptoDescripcion;
			}
			/**
			 * @return the conceptoXdivisa
			 */
			public Short getConceptoXdivisa() {
				return conceptoXdivisa;
			}
			/**
			 * @param conceptoXdivisa the conceptoXdivisa to set
			 */
			public void setConceptoXdivisa(Short conceptoXdivisa) {
				this.conceptoXdivisa = conceptoXdivisa;
			}
			/**
			 * @return the conceptoDoctoEfectivo
			 */
			public Short getConceptoDoctoEfectivo() {
				return conceptoDoctoEfectivo;
			}
			/**
			 * @param conceptoDoctoEfectivo the conceptoDoctoEfectivo to set
			 */
			public void setConceptoDoctoEfectivo(Short conceptoDoctoEfectivo) {
				this.conceptoDoctoEfectivo = conceptoDoctoEfectivo;
			}
			/**
			 * @return the conceptoBillMon
			 */
			public Short getConceptoBillMon() {
				return conceptoBillMon;
			}
			/**
			 * @param conceptoBillMon the conceptoBillMon to set
			 */
			public void setConceptoBillMon(Short conceptoBillMon) {
				this.conceptoBillMon = conceptoBillMon;
			}
			/**
			 * @return the conceptoXtipoctto
			 */
			public Short getConceptoXtipoctto() {
				return conceptoXtipoctto;
			}
			/**
			 * @param conceptoXtipoctto the conceptoXtipoctto to set
			 */
			public void setConceptoXtipoctto(Short conceptoXtipoctto) {
				this.conceptoXtipoctto = conceptoXtipoctto;
			}
			/**
			 * @return the conceptoReferencia
			 */
			public Short getConceptoReferencia() {
				return conceptoReferencia;
			}
			/**
			 * @param conceptoReferencia the conceptoReferencia to set
			 */
			public void setConceptoReferencia(Short conceptoReferencia) {
				this.conceptoReferencia = conceptoReferencia;
			}
			/**
			 * @return the conceptoS018
			 */
			public Short getConceptoS018() {
				return conceptoS018;
			}
			/**
			 * @param conceptoS018 the conceptoS018 to set
			 */
			public void setConceptoS018(Short conceptoS018) {
				this.conceptoS018 = conceptoS018;
			}
			/**
			 * @return the bajaLogica
			 */
			/**
			 * @return the bajaLogica
			 */
			public String getBajaLogica() {
				return BajaLogica;
			}
			/**
			 * @param bajaLogica the bajaLogica to set
			 */
			public void setBajaLogica(String bajaLogica) {
				BajaLogica = bajaLogica;
			}
		
	
	}
		    
		    
		    