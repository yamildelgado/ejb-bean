/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisaPK;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDotacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;


/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public class DenominacionesDivisaVO implements Serializable {
	
	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
		private String denomNombreDenominacion;	    
	    private Short denomCirculacion;
	    private String denomBajaLogica;	   
	    private Short divisaId;
		private String denomTipoBillMon;	    
	    /**
	 * @return the denomTipoBillMon
	 */
	public String getDenomTipoBillMon() {
		return denomTipoBillMon;
	}
	/**
	 * @param denomTipoBillMon the denomTipoBillMon to set
	 */
	public void setDenomTipoBillMon(String denomTipoBillMon) {
		this.denomTipoBillMon = denomTipoBillMon;
	}
		
			/**
			 * @return the denomNombreDenominacion
			 */
			public String getDenomNombreDenominacion() {
				return denomNombreDenominacion;
			}
			/**
			 * @param denomNombreDenominacion the denomNombreDenominacion to set
			 */
			public void setDenomNombreDenominacion(String denomNombreDenominacion) {
				this.denomNombreDenominacion = denomNombreDenominacion;
			}
			/**
			 * @return the denomCirculacion
			 */
			public Short getDenomCirculacion() {
				return denomCirculacion;
			}
			/**
			 * @param denomCirculacion the denomCirculacion to set
			 */
			public void setDenomCirculacion(Short denomCirculacion) {
				this.denomCirculacion = denomCirculacion;
			}
			/**
			 * @return the denomBajaLogica
			 */
			public String getDenomBajaLogica() {
				return denomBajaLogica;
			}
			/**
			 * @param denomBajaLogica the denomBajaLogica to set
			 */
			public void setDenomBajaLogica(String denomBajaLogica) {
				this.denomBajaLogica = denomBajaLogica;
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
	        
	
	 
	  
	    
	  
	


}
