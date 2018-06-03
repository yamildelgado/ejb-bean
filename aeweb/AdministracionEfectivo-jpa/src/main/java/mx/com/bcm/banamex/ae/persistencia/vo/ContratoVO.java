/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class ContratoVO implements Serializable{
	
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    
	 private String num;
	   
	    private String tipoInstrumento;
	   
	    private String fecAltaDeposito;
	   
	    private String fecAltaDotacion;
	  
	    private String fecVencContrato;
	   
	    private String fecCancCte;
	    
	    private String rfc;
	   
	    private String nombreCte;
	  
	    private String calleNum;
	   
	    private String colonia;
	   
	    private Integer cp;
	   
	    private Long tel1;
	  
	    private Long tel2;
	    
	    private Integer cveCshPolicy;
	  
	    
	    private BigDecimal impCshPolicy;
	    
	    private Short manejoProcPrevFich;
	  
	    private Short status;
	    
	    private Short tipoProcBill;
	   
	    private Short tipoProcMon;
	   
	    private BigDecimal difPermitida;
	   
	    private String bajaLogica;

		/**
		 * @return the num
		 */
		public String getNum() {
			return num;
		}

		/**
		 * @param num the num to set
		 */
		public void setNum(String num) {
			this.num = num;
		}

		/**
		 * @return the tipoInstrumento
		 */
		public String getTipoInstrumento() {
			return tipoInstrumento;
		}

		/**
		 * @param tipoInstrumento the tipoInstrumento to set
		 */
		public void setTipoInstrumento(String tipoInstrumento) {
			this.tipoInstrumento = tipoInstrumento;
		}

		/**
		 * @return the fecAltaDeposito
		 */
		public String getFecAltaDeposito() {
			return fecAltaDeposito;
		}

		/**
		 * @param fecAltaDeposito the fecAltaDeposito to set
		 */
		public void setFecAltaDeposito(String fecAltaDeposito) {
			this.fecAltaDeposito = fecAltaDeposito;
		}

		/**
		 * @return the fecAltaDotacion
		 */
		public String getFecAltaDotacion() {
			return fecAltaDotacion;
		}

		/**
		 * @param fecAltaDotacion the fecAltaDotacion to set
		 */
		public void setFecAltaDotacion(String fecAltaDotacion) {
			this.fecAltaDotacion = fecAltaDotacion;
		}

		/**
		 * @return the fecVencContrato
		 */
		public String getFecVencContrato() {
			return fecVencContrato;
		}

		/**
		 * @param fecVencContrato the fecVencContrato to set
		 */
		public void setFecVencContrato(String fecVencContrato) {
			this.fecVencContrato = fecVencContrato;
		}

		/**
		 * @return the fecCancCte
		 */
		public String getFecCancCte() {
			return fecCancCte;
		}

		/**
		 * @param fecCancCte the fecCancCte to set
		 */
		public void setFecCancCte(String fecCancCte) {
			this.fecCancCte = fecCancCte;
		}

		/**
		 * @return the rfc
		 */
		public String getRfc() {
			return rfc;
		}

		/**
		 * @param rfc the rfc to set
		 */
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

		/**
		 * @return the nombreCte
		 */
		public String getNombreCte() {
			return nombreCte;
		}

		/**
		 * @param nombreCte the nombreCte to set
		 */
		public void setNombreCte(String nombreCte) {
			this.nombreCte = nombreCte;
		}

		/**
		 * @return the calleNum
		 */
		public String getCalleNum() {
			return calleNum;
		}

		/**
		 * @param calleNum the calleNum to set
		 */
		public void setCalleNum(String calleNum) {
			this.calleNum = calleNum;
		}

		/**
		 * @return the colonia
		 */
		public String getColonia() {
			return colonia;
		}

		/**
		 * @param colonia the colonia to set
		 */
		public void setColonia(String colonia) {
			this.colonia = colonia;
		}

		/**
		 * @return the cp
		 */
		public Integer getCp() {
			return cp;
		}

		/**
		 * @param cp the cp to set
		 */
		public void setCp(Integer cp) {
			this.cp = cp;
		}

		/**
		 * @return the tel1
		 */
		public Long getTel1() {
			return tel1;
		}

		/**
		 * @param tel1 the tel1 to set
		 */
		public void setTel1(Long tel1) {
			this.tel1 = tel1;
		}

		/**
		 * @return the tel2
		 */
		public Long getTel2() {
			return tel2;
		}

		/**
		 * @param tel2 the tel2 to set
		 */
		public void setTel2(Long tel2) {
			this.tel2 = tel2;
		}

		/**
		 * @return the cveCshPolicy
		 */
		public Integer getCveCshPolicy() {
			return cveCshPolicy;
		}

		/**
		 * @param cveCshPolicy the cveCshPolicy to set
		 */
		public void setCveCshPolicy(Integer cveCshPolicy) {
			this.cveCshPolicy = cveCshPolicy;
		}

		/**
		 * @return the impCshPolicy
		 */
		public BigDecimal getImpCshPolicy() {
			return impCshPolicy;
		}

		/**
		 * @param impCshPolicy the impCshPolicy to set
		 */
		public void setImpCshPolicy(BigDecimal impCshPolicy) {
			this.impCshPolicy = impCshPolicy;
		}

		/**
		 * @return the manejoProcPrevFich
		 */
		public Short getManejoProcPrevFich() {
			return manejoProcPrevFich;
		}

		/**
		 * @param manejoProcPrevFich the manejoProcPrevFich to set
		 */
		public void setManejoProcPrevFich(Short manejoProcPrevFich) {
			this.manejoProcPrevFich = manejoProcPrevFich;
		}

		/**
		 * @return the status
		 */
		public Short getStatus() {
			return status;
		}

		/**
		 * @param status the status to set
		 */
		public void setStatus(Short status) {
			this.status = status;
		}

		/**
		 * @return the tipoProcBill
		 */
		public Short getTipoProcBill() {
			return tipoProcBill;
		}

		/**
		 * @param tipoProcBill the tipoProcBill to set
		 */
		public void setTipoProcBill(Short tipoProcBill) {
			this.tipoProcBill = tipoProcBill;
		}

		/**
		 * @return the tipoProcMon
		 */
		public Short getTipoProcMon() {
			return tipoProcMon;
		}

		/**
		 * @param tipoProcMon the tipoProcMon to set
		 */
		public void setTipoProcMon(Short tipoProcMon) {
			this.tipoProcMon = tipoProcMon;
		}

		/**
		 * @return the difPermitida
		 */
		public BigDecimal getDifPermitida() {
			return difPermitida;
		}

		/**
		 * @param difPermitida the difPermitida to set
		 */
		public void setDifPermitida(BigDecimal difPermitida) {
			this.difPermitida = difPermitida;
		}

		/**
		 * @return the bajaLogica
		 */
		public String getBajaLogica() {
			return bajaLogica;
		}

		/**
		 * @param bajaLogica the bajaLogica to set
		 */
		public void setBajaLogica(String bajaLogica) {
			this.bajaLogica = bajaLogica;
		}
		
	    
	    
	    
	    
}
