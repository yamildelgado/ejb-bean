/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;
import mx.com.bcm.banamex.ae.persistencia.modelo.*;


/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
public class ProcesadoraVO extends ReporteAbstract implements Serializable {
	 
	  
	private static final long serialVersionUID = 1L;

		private Integer procesadoraSirhId;	  
	    private Short procesadoraEtvId;	   
	    private String frecBusqueda;
	    private String procesadoraIntelar;
	    private ProcesadoraPK procesadoraPK;
	    private String procesadoraBajaLogica;
	    private String nombreSirh;
	    private String etvNombre;
	    
	    private String procesadoraCpae;
	   
	    
	       

		

	    public ProcesadoraVO() {
	       
	    }
	    public ProcesadoraVO(ProcesadoraPK procesadoraPK) {
	        this.procesadoraPK = procesadoraPK;
	    }
	    public ProcesadoraVO( Short etvIdn,Integer cpaesEstructuraSirhIdn) {
	        this.procesadoraPK = new ProcesadoraPK(cpaesEstructuraSirhIdn, etvIdn);
	    }
		
		
		public Integer getProcesadoraSirhId() {
			return procesadoraSirhId;
		}
		public void setProcesadoraSirhId(Integer procesadoraSirhId) {
			this.procesadoraSirhId = procesadoraSirhId;
		}
		/**
		 * @return the procesadoraEtvId
		 */
		public Short getProcesadoraEtvId() {
			return procesadoraEtvId;
		}
		/**
		 * @param procesadoraEtvId the procesadoraEtvId to set
		 */
		public void setProcesadoraEtvId(Short procesadoraEtvId) {
			this.procesadoraEtvId = procesadoraEtvId;
		}
		
		/**
		 * @return the frecBusqueda
		 */
		public String getFrecBusqueda() {
			return frecBusqueda;
		}
		/**
		 * @param frecBusqueda the frecBusqueda to set
		 */
		public void setFrecBusqueda(String frecBusqueda) {
			this.frecBusqueda = frecBusqueda;
		}
		/**
		 * @return the procesadoraIntelar
		 */
		public String getProcesadoraIntelar() {
			return procesadoraIntelar;
		}
		/**
		 * @param procesadoraIntelar the procesadoraIntelar to set
		 */
		public void setProcesadoraIntelar(String procesadoraIntelar) {
			this.procesadoraIntelar = procesadoraIntelar;
		}
		/**
		 * @return the procesadoraPK
		 */
		public ProcesadoraPK getProcesadoraPK() {
			return procesadoraPK;
		}
		/**
		 * @param procesadoraPK the procesadoraPK to set
		 */
		public void setProcesadoraPK(ProcesadoraPK procesadoraPK) {
			this.procesadoraPK = procesadoraPK;
		}
		
		/**
		 * @return the procesadoraBajaLogica
		 */
		public String getProcesadoraBajaLogica() {
			return procesadoraBajaLogica;
		}
		/**
		 * @param procesadoraBajaLogica the procesadoraBajaLogica to set
		 */
		public void setProcesadoraBajaLogica(String procesadoraBajaLogica) {
			this.procesadoraBajaLogica = procesadoraBajaLogica;
		}
		/**
		 * @return the nombreSirh
		 */
		public String getNombreSirh() {
			return nombreSirh;
		}
		/**
		 * @param nombreSirh the nombreSirh to set
		 */
		public void setNombreSirh(String nombreSirh) {
			this.nombreSirh = nombreSirh;
		}
		/**
		 * @return the etvNombre
		 */
		public String getEtvNombre() {
			return etvNombre;
		}
		/**
		 * @param etvNombre the etvNombre to set
		 */
		public void setEtvNombre(String etvNombre) {
			this.etvNombre = etvNombre;
		}
		/**
		 * @return the procesadoraCpae
		 */
		public String getProcesadoraCpae() {
			return procesadoraCpae;
		}
		/**
		 * @param procesadoraCpae the procesadoraCpae to set
		 */
		public void setProcesadoraCpae(String procesadoraCpae) {
			this.procesadoraCpae = procesadoraCpae;
		}

		
		

		

		

	
	
	    
}
