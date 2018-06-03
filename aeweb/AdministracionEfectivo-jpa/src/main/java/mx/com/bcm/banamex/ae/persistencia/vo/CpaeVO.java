/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;




/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class CpaeVO extends ReporteAbstract implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	 private Integer cpaesEstructuraSirhIdn;
	    private String sirhNombre;
	    private Short sirhHorContable;
	    private Short sirhNumCompLote;
	    private Short sirhNumCompAsignaXCajero;
	    private BigDecimal sirhMontMinDifImprActa;
	    private Short sirhNumCopiasActas;
	    private Short sirhHorEnvaseCritico;
	    private BigDecimal sirhLimPiso;
		
	    
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
		 * @return the sirhNombre
		 */
		public String getSirhNombre() {
			return sirhNombre;
		}
		/**
		 * @param sirhNombre the sirhNombre to set
		 */
		public void setSirhNombre(String sirhNombre) {
			this.sirhNombre = sirhNombre;
		}
		/**
		 * @return the sirhHorContable
		 */
		public Short getSirhHorContable() {
			return sirhHorContable;
		}
		/**
		 * @param sirhHorContable the sirhHorContable to set
		 */
		public void setSirhHorContable(Short sirhHorContable) {
			this.sirhHorContable = sirhHorContable;
		}
		/**
		 * @return the sirhNumCompLote
		 */
		public Short getSirhNumCompLote() {
			return sirhNumCompLote;
		}
		/**
		 * @param sirhNumCompLote the sirhNumCompLote to set
		 */
		public void setSirhNumCompLote(Short sirhNumCompLote) {
			this.sirhNumCompLote = sirhNumCompLote;
		}
		/**
		 * @return the sirhNumCompAsignaXCajero
		 */
		public Short getSirhNumCompAsignaXCajero() {
			return sirhNumCompAsignaXCajero;
		}
		/**
		 * @param sirhNumCompAsignaXCajero the sirhNumCompAsignaXCajero to set
		 */
		public void setSirhNumCompAsignaXCajero(Short sirhNumCompAsignaXCajero) {
			this.sirhNumCompAsignaXCajero = sirhNumCompAsignaXCajero;
		}
		/**
		 * @return the sirhMontMinDifImprActa
		 */
		public BigDecimal getSirhMontMinDifImprActa() {
			return sirhMontMinDifImprActa;
		}
		/**
		 * @param sirhMontMinDifImprActa the sirhMontMinDifImprActa to set
		 */
		public void setSirhMontMinDifImprActa(BigDecimal sirhMontMinDifImprActa) {
			this.sirhMontMinDifImprActa = sirhMontMinDifImprActa;
		}
		
		
		/**
		 * @return the sirhNumCopiasActas
		 */
		public Short getSirhNumCopiasActas() {
			return sirhNumCopiasActas;
		}
		/**
		 * @param sirhNumCopiasActas the sirhNumCopiasActas to set
		 */
		public void setSirhNumCopiasActas(Short sirhNumCopiasActas) {
			this.sirhNumCopiasActas = sirhNumCopiasActas;
		}
		/**
		 * @return the sirhHorEnvaseCritico
		 */
		public Short getSirhHorEnvaseCritico() {
			return sirhHorEnvaseCritico;
		}
		/**
		 * @param sirhHorEnvaseCritico the sirhHorEnvaseCritico to set
		 */
		public void setSirhHorEnvaseCritico(Short sirhHorEnvaseCritico) {
			this.sirhHorEnvaseCritico = sirhHorEnvaseCritico;
		}
		/**
		 * @return the sirhLimPiso
		 */
		public BigDecimal getSirhLimPiso() {
			return sirhLimPiso;
		}
		/**
		 * @param sirhLimPiso the sirhLimPiso to set
		 */
		public void setSirhLimPiso(BigDecimal sirhLimPiso) {
			this.sirhLimPiso = sirhLimPiso;
		}
	   

}
