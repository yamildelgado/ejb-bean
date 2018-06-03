/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import mx.com.bcm.banamex.ae.persistencia.modelo.*;



/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
public class ConcentracionSucursalesVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 protected DetalleInterfaceProcesadoraPK detalleInterfaceProcesadorasPK;
	  
	    private Short atmIdn;	    
	    private Short detprocTipoRegistro;	    
	    private Short detprocIdentificadorMovto;	  
	    private Short detprocEtvTraslado;	    
	    private Short detprocSirhCpaeSirhOrigen;	    
	    private Short detprocSirhDestinoIdAtm;	   
	    private Long detprocFolioS018;	    
	    private Long detprocInstruccionEtv;	    
	    private Long detprocPreparacionEtv;	    
	    private Long detprocEntregaATraslado;	    
	    private Long detprocEntregaFORetrnoEtv;	    
	    private Long detprocCopmisoEntrgUsrio;	    
	    private String detprocNumDeComprobante;	    
	    private Short detprocDivisa;   	   
	    private String detprocImpteDeposDotacion;	    
	    private BigDecimal detprocBpv500;	    
	    private BigDecimal detprocBpv200;	    
	    private BigDecimal detprocBpv100;	    
	    private BigDecimal detprocBpv50;
	    private BigDecimal detprocBpv20;	    
	    private BigDecimal detprocBca1000;	    
	    private BigDecimal detprocBca500;	    
	    private BigDecimal detprocBca200;	    
	    private BigDecimal detprocBca100;	    
	    private BigDecimal detprocBca50;	    
	    private BigDecimal detprocBca20;	    
	    private BigDecimal detprocMca100;	    
	    private BigDecimal detprocMca20;	    
	    private BigDecimal detprocMca10;	    
	    private BigDecimal detprocMca5;	    
	    private BigDecimal detprocMca2;	    
	    private BigDecimal detprocMca1;	    
	    private BigDecimal detprocMca50Centavos;	    
	    private BigDecimal detprocMca20Centavos;	    
	    private BigDecimal detprocMca10Centavos;	    
	    private BigDecimal detprocMca05Centavos;	    
	    private BigDecimal detprocMca01Centavos;	   
	    private BigDecimal detprocBea1;	   
	    private BigDecimal detprocBea2;	    
	    private BigDecimal detprocBea5;
	    private BigDecimal detprocBea10;	    
	    private BigDecimal detprocBea20;	    
	    private BigDecimal detprocBea100;	    
	    private BigDecimal detprocMea01Centavos;	    
	    private BigDecimal detprocMea05Centavos;	    
	    private BigDecimal detprocMea10Centavos;	    
	    private BigDecimal detprocMea25Centavos;	   
	    private BigDecimal detprocMea50Centavos;
	    private BigDecimal detprocMea1;	  
	    private TipoMovimiento tipoMovimiento;	   
	    private Banco bancoIdn;
	    
		public DetalleInterfaceProcesadoraPK getDetalleInterfaceProcesadorasPK() {
			return detalleInterfaceProcesadorasPK;
		}

		public void setDetalleInterfaceProcesadorasPK(
				DetalleInterfaceProcesadoraPK detalleInterfaceProcesadorasPK) {
			this.detalleInterfaceProcesadorasPK = detalleInterfaceProcesadorasPK;
		}

		public Short getAtmIdn() {
			return atmIdn;
		}

		public void setAtmIdn(Short atmIdn) {
			this.atmIdn = atmIdn;
		}

		public Short getDetprocTipoRegistro() {
			return detprocTipoRegistro;
		}

		public void setDetprocTipoRegistro(Short detprocTipoRegistro) {
			this.detprocTipoRegistro = detprocTipoRegistro;
		}

		public Short getDetprocIdentificadorMovto() {
			return detprocIdentificadorMovto;
		}

		public void setDetprocIdentificadorMovto(Short detprocIdentificadorMovto) {
			this.detprocIdentificadorMovto = detprocIdentificadorMovto;
		}

		public Short getDetprocEtvTraslado() {
			return detprocEtvTraslado;
		}

		public void setDetprocEtvTraslado(Short detprocEtvTraslado) {
			this.detprocEtvTraslado = detprocEtvTraslado;
		}

		public Short getDetprocSirhCpaeSirhOrigen() {
			return detprocSirhCpaeSirhOrigen;
		}

		public void setDetprocSirhCpaeSirhOrigen(Short detprocSirhCpaeSirhOrigen) {
			this.detprocSirhCpaeSirhOrigen = detprocSirhCpaeSirhOrigen;
		}

		public Short getDetprocSirhDestinoIdAtm() {
			return detprocSirhDestinoIdAtm;
		}

		public void setDetprocSirhDestinoIdAtm(Short detprocSirhDestinoIdAtm) {
			this.detprocSirhDestinoIdAtm = detprocSirhDestinoIdAtm;
		}

		public Long getDetprocFolioS018() {
			return detprocFolioS018;
		}

		public void setDetprocFolioS018(Long detprocFolioS018) {
			this.detprocFolioS018 = detprocFolioS018;
		}

		public Long getDetprocInstruccionEtv() {
			return detprocInstruccionEtv;
		}

		public void setDetprocInstruccionEtv(Long detprocInstruccionEtv) {
			this.detprocInstruccionEtv = detprocInstruccionEtv;
		}

		public Long getDetprocPreparacionEtv() {
			return detprocPreparacionEtv;
		}

		public void setDetprocPreparacionEtv(Long detprocPreparacionEtv) {
			this.detprocPreparacionEtv = detprocPreparacionEtv;
		}

		public Long getDetprocEntregaATraslado() {
			return detprocEntregaATraslado;
		}

		public void setDetprocEntregaATraslado(Long detprocEntregaATraslado) {
			this.detprocEntregaATraslado = detprocEntregaATraslado;
		}

		public Long getDetprocEntregaFORetrnoEtv() {
			return detprocEntregaFORetrnoEtv;
		}

		public void setDetprocEntregaFORetrnoEtv(Long detprocEntregaFORetrnoEtv) {
			this.detprocEntregaFORetrnoEtv = detprocEntregaFORetrnoEtv;
		}

		public Long getDetprocCopmisoEntrgUsrio() {
			return detprocCopmisoEntrgUsrio;
		}

		public void setDetprocCopmisoEntrgUsrio(Long detprocCopmisoEntrgUsrio) {
			this.detprocCopmisoEntrgUsrio = detprocCopmisoEntrgUsrio;
		}

		public String getDetprocNumDeComprobante() {
			return detprocNumDeComprobante;
		}

		public void setDetprocNumDeComprobante(String detprocNumDeComprobante) {
			this.detprocNumDeComprobante = detprocNumDeComprobante;
		}

		public Short getDetprocDivisa() {
			return detprocDivisa;
		}

		public void setDetprocDivisa(Short detprocDivisa) {
			this.detprocDivisa = detprocDivisa;
		}

		public String getDetprocImpteDeposDotacion() {
			return detprocImpteDeposDotacion;
		}

		public void setDetprocImpteDeposDotacion(String detprocImpteDeposDotacion) {
			this.detprocImpteDeposDotacion = detprocImpteDeposDotacion;
		}

		public BigDecimal getDetprocBpv500() {
			return detprocBpv500;
		}

		public void setDetprocBpv500(BigDecimal detprocBpv500) {
			this.detprocBpv500 = detprocBpv500;
		}

		public BigDecimal getDetprocBpv200() {
			return detprocBpv200;
		}

		public void setDetprocBpv200(BigDecimal detprocBpv200) {
			this.detprocBpv200 = detprocBpv200;
		}

		public BigDecimal getDetprocBpv100() {
			return detprocBpv100;
		}

		public void setDetprocBpv100(BigDecimal detprocBpv100) {
			this.detprocBpv100 = detprocBpv100;
		}

		public BigDecimal getDetprocBpv50() {
			return detprocBpv50;
		}

		public void setDetprocBpv50(BigDecimal detprocBpv50) {
			this.detprocBpv50 = detprocBpv50;
		}

		public BigDecimal getDetprocBpv20() {
			return detprocBpv20;
		}

		public void setDetprocBpv20(BigDecimal detprocBpv20) {
			this.detprocBpv20 = detprocBpv20;
		}

		public BigDecimal getDetprocBca1000() {
			return detprocBca1000;
		}

		public void setDetprocBca1000(BigDecimal detprocBca1000) {
			this.detprocBca1000 = detprocBca1000;
		}

		public BigDecimal getDetprocBca500() {
			return detprocBca500;
		}

		public void setDetprocBca500(BigDecimal detprocBca500) {
			this.detprocBca500 = detprocBca500;
		}

		public BigDecimal getDetprocBca200() {
			return detprocBca200;
		}

		public void setDetprocBca200(BigDecimal detprocBca200) {
			this.detprocBca200 = detprocBca200;
		}

		public BigDecimal getDetprocBca100() {
			return detprocBca100;
		}

		public void setDetprocBca100(BigDecimal detprocBca100) {
			this.detprocBca100 = detprocBca100;
		}

		public BigDecimal getDetprocBca50() {
			return detprocBca50;
		}

		public void setDetprocBca50(BigDecimal detprocBca50) {
			this.detprocBca50 = detprocBca50;
		}

		public BigDecimal getDetprocBca20() {
			return detprocBca20;
		}

		public void setDetprocBca20(BigDecimal detprocBca20) {
			this.detprocBca20 = detprocBca20;
		}

		public BigDecimal getDetprocMca100() {
			return detprocMca100;
		}

		public void setDetprocMca100(BigDecimal detprocMca100) {
			this.detprocMca100 = detprocMca100;
		}

		public BigDecimal getDetprocMca20() {
			return detprocMca20;
		}

		public void setDetprocMca20(BigDecimal detprocMca20) {
			this.detprocMca20 = detprocMca20;
		}

		public BigDecimal getDetprocMca10() {
			return detprocMca10;
		}

		public void setDetprocMca10(BigDecimal detprocMca10) {
			this.detprocMca10 = detprocMca10;
		}

		public BigDecimal getDetprocMca5() {
			return detprocMca5;
		}

		public void setDetprocMca5(BigDecimal detprocMca5) {
			this.detprocMca5 = detprocMca5;
		}

		public BigDecimal getDetprocMca2() {
			return detprocMca2;
		}

		public void setDetprocMca2(BigDecimal detprocMca2) {
			this.detprocMca2 = detprocMca2;
		}

		public BigDecimal getDetprocMca1() {
			return detprocMca1;
		}

		public void setDetprocMca1(BigDecimal detprocMca1) {
			this.detprocMca1 = detprocMca1;
		}

		public BigDecimal getDetprocMca50Centavos() {
			return detprocMca50Centavos;
		}

		public void setDetprocMca50Centavos(BigDecimal detprocMca50Centavos) {
			this.detprocMca50Centavos = detprocMca50Centavos;
		}

		public BigDecimal getDetprocMca20Centavos() {
			return detprocMca20Centavos;
		}

		public void setDetprocMca20Centavos(BigDecimal detprocMca20Centavos) {
			this.detprocMca20Centavos = detprocMca20Centavos;
		}

		public BigDecimal getDetprocMca10Centavos() {
			return detprocMca10Centavos;
		}

		public void setDetprocMca10Centavos(BigDecimal detprocMca10Centavos) {
			this.detprocMca10Centavos = detprocMca10Centavos;
		}

		public BigDecimal getDetprocMca05Centavos() {
			return detprocMca05Centavos;
		}

		public void setDetprocMca05Centavos(BigDecimal detprocMca05Centavos) {
			this.detprocMca05Centavos = detprocMca05Centavos;
		}

		public BigDecimal getDetprocMca01Centavos() {
			return detprocMca01Centavos;
		}

		public void setDetprocMca01Centavos(BigDecimal detprocMca01Centavos) {
			this.detprocMca01Centavos = detprocMca01Centavos;
		}

		public BigDecimal getDetprocBea1() {
			return detprocBea1;
		}

		public void setDetprocBea1(BigDecimal detprocBea1) {
			this.detprocBea1 = detprocBea1;
		}

		public BigDecimal getDetprocBea2() {
			return detprocBea2;
		}

		public void setDetprocBea2(BigDecimal detprocBea2) {
			this.detprocBea2 = detprocBea2;
		}

		public BigDecimal getDetprocBea5() {
			return detprocBea5;
		}

		public void setDetprocBea5(BigDecimal detprocBea5) {
			this.detprocBea5 = detprocBea5;
		}

		public BigDecimal getDetprocBea10() {
			return detprocBea10;
		}

		public void setDetprocBea10(BigDecimal detprocBea10) {
			this.detprocBea10 = detprocBea10;
		}

		public BigDecimal getDetprocBea20() {
			return detprocBea20;
		}

		public void setDetprocBea20(BigDecimal detprocBea20) {
			this.detprocBea20 = detprocBea20;
		}

		public BigDecimal getDetprocBea100() {
			return detprocBea100;
		}

		public void setDetprocBea100(BigDecimal detprocBea100) {
			this.detprocBea100 = detprocBea100;
		}

		public BigDecimal getDetprocMea01Centavos() {
			return detprocMea01Centavos;
		}

		public void setDetprocMea01Centavos(BigDecimal detprocMea01Centavos) {
			this.detprocMea01Centavos = detprocMea01Centavos;
		}

		public BigDecimal getDetprocMea05Centavos() {
			return detprocMea05Centavos;
		}

		public void setDetprocMea05Centavos(BigDecimal detprocMea05Centavos) {
			this.detprocMea05Centavos = detprocMea05Centavos;
		}

		public BigDecimal getDetprocMea10Centavos() {
			return detprocMea10Centavos;
		}

		public void setDetprocMea10Centavos(BigDecimal detprocMea10Centavos) {
			this.detprocMea10Centavos = detprocMea10Centavos;
		}

		public BigDecimal getDetprocMea25Centavos() {
			return detprocMea25Centavos;
		}

		public void setDetprocMea25Centavos(BigDecimal detprocMea25Centavos) {
			this.detprocMea25Centavos = detprocMea25Centavos;
		}

		public BigDecimal getDetprocMea50Centavos() {
			return detprocMea50Centavos;
		}

		public void setDetprocMea50Centavos(BigDecimal detprocMea50Centavos) {
			this.detprocMea50Centavos = detprocMea50Centavos;
		}

		public BigDecimal getDetprocMea1() {
			return detprocMea1;
		}

		public void setDetprocMea1(BigDecimal detprocMea1) {
			this.detprocMea1 = detprocMea1;
		}

		public TipoMovimiento getTipoMovimiento() {
			return tipoMovimiento;
		}

		public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
			this.tipoMovimiento = tipoMovimiento;
		}

		public Banco getBancoIdn() {
			return bancoIdn;
		}

		public void setBancoIdn(Banco bancoIdn) {
			this.bancoIdn = bancoIdn;
		}
	    
	    
	    
	

}
