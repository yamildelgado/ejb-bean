/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;
import mx.com.bcm.banamex.ae.persistencia.modelo.CabceraInterfProcdoraTotls;

/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class ConsultasyReportesProcesadoraVO  extends ReporteAbstract implements Serializable{
	private static final long serialVersionUID = 1L;
		private short atmIdn;
	    private Short detprocTipoRegistro;
	    private Short detprocIdentificadorMovto;
	    private Short detprocEtvTraslado;
	    private Integer detprocSirhCpaeSirhOrigen;
	    private Integer detprocSirhDestinoIdAtm;
	    private Long detprocFolioS018;
	    private Long detprocRecoleccion;
	    private Long detprocRecepcionEnEtv;
	    private Long detprocVerificacion;
	    private Long detprocAcreditacionEnBnmx;
	    private Long detprocInstruccionEtv;
	    private Long detprocPreparacionEtv;
	    private Long detprocEntregaATraslado;
	    private Short detprocEntregaFORetrnoEtv;
	    private Long detprocCopmisoEntrgUsrio;
	    private String detprocNumDeComprobante;
	    private BigDecimal detprocDiceContener;
	    private Short detprocNumUneg;
	    private Long detprocContratoEfectivo;
	    private Long detprocUnegSefEnvase;
	    private String detprocGloblParclContendor;
	    private Short detprocPenalizacion1;
	    private Short detprocPenalizacion2;
	    private Short detprocPenalizacion3;
	    private Short detprocPenalizacion4;
	    private Short detprocDivisa;
	    private Long detprocNumCliente;
	    private Long detprocFolioDeposDolares;
	    private Long detprocUnegPemex;
	    private Short detprocSuc;
	    private Integer detprocCuenta;
	    private BigDecimal detprocImpteDeposDotacion;
	    private Long detprocRefNumerica1;
	    private String detprocReferenciaAlf2;
	    private String detprocReferencia3;
	    private String detprocReferencia4;
	    private Integer detprocComprobServSef;
	    private Short detprocTipoBill1;
	    private BigDecimal detprocDenominacion1;
	    private BigDecimal detprocImpte1;
	    private Short detprocTipoBill2;
	    private BigDecimal detprocDenominacion2;
	    private BigDecimal detprocImpte2;
	    private Short detprocTipoBill3;
	    private BigDecimal detprocDenominacion3;
	    private BigDecimal detprocImpte3;
	    private Short detprocTipoBill4;
	    private BigDecimal detprocDenominacion4;
	    private BigDecimal detprocImpte4;
	    private Short detprocTipoBill5;
	    private BigDecimal detprocDenominacion5;
	    private BigDecimal detprocImpte5;
	    private Short detprocTipoBill6;
	    private BigDecimal detprocDenominacion6;
	    private BigDecimal detprocImpte6;
	    private Short detprocTipoBill7;
	    private BigDecimal detprocDenominacion7;
	    private BigDecimal detprocImpte7;
	    private Short detprocTipoBill8;
	    private BigDecimal detprocDenominacion8;
	    private BigDecimal detprocImpte8;
	    private Short detprocTipoBill9;
	    private BigDecimal detprocDenominacion9;
	    private BigDecimal detprocImpte9;
	    private Short detprocTipoBill10;
	    private BigDecimal detprocDenominacion10;
	    private BigDecimal detprocImpte10;
	    private Short detprocTipoBill11;
	    private BigDecimal detprocDenominacion11;
	    private BigDecimal detprocImpte11;
	    private Short detprocTipoBill12;
	    private BigDecimal detprocDenominacion12;
	    private BigDecimal detprocImpte12;
	    private Short detprocTipoBill13;
	    private BigDecimal detprocDenominacion13;
	    private BigDecimal detprocImpte13;
	    private Short detprocTipoBill14;
	    private BigDecimal detprocDenominacion14;
	    private BigDecimal detprocImpte14;
	    private Short detprocTipoBill15;
	    private BigDecimal detprocDenominacion15;
	    private BigDecimal detprocImpte15;
	    private Short detprocTipoBill16;
	    private BigDecimal detprocDenominacion16;
	    private BigDecimal detprocImpte16;
	    private Short detprocTipoBill17;
	    private BigDecimal detprocDenominacion17;
	    private BigDecimal detprocImpte17;
	    private Short detprocTipoBill18;
	    private BigDecimal detprocDenominacion18;
	    private BigDecimal detprocImpte18;
	    private Short detprocTipoBill19;
	    private BigDecimal detprocDenominacion19;
	    private BigDecimal detprocImpte19;
	    private Short detprocTipoBill20;
	    private BigDecimal detprocDenominacion20;
	    private BigDecimal detprocImpte20;
	    private Short detprocTipoBill21;
	    private BigDecimal detprocDenominacion21;
	    private BigDecimal detprocImpte21;
	    private Short detprocTipoBill22;
	    private BigDecimal detprocDenominacion22;
	    private BigDecimal detprocImpte22;
	    private Short detprocTipoBill23;
	    private BigDecimal detprocDenominacion23;
	    private BigDecimal detprocImpte23;
	    private BigDecimal detprocImpteCargoCheque;
	    private Short detprocBanco;
	    private Short detprocLineacapCodSeguridad;
	    private Integer detprocLineacapRutaTransito;
	    private Long detprocLineacapNumCuenta;
	    private Integer detprocLineacapNumCheque;
	    private Integer detprocFecHrRetencion;
	    private Short detprocCausaRetencion;
	    private BigDecimal detprocImpteDiferencia;
	    private String detprocFaltanteSobrante;
	    private Short detprocSuccargoAbonoDif;
	    private Integer detprocCntacargoAbonodif;
	    private Long detprocReferenciaNumerica;
	    private String detprocReferenciaAlf;
	    private String detprocReferencia31;
	    private String detprocReferencia41;
	    private Short detprocNumParcDif;
	    private Integer detprocDenominacionBpf;
	    private String detprocSerieBpf;
	    private String detprocFolioBpf;
	    private String detprocNombreCajeroEtv;
	    private Integer detprocFecBpf;
	    private Integer detprocFolioSam;
	    private Short detprocEfectivoIntegrCaja;
	    private Short detprocTransmisionS500;
	    private Short tipoMovimiento;
	    private Short tipoDeOperacion;
	    private CabceraInterfProcdoraTotls cabceraInterfProcdoraTotls;
	    private Short bancoIdn;
	    
		
	    private int detprocDetallprocIdn;
	    private short tipomovIdn;
	    private Integer estructraSirh;
	    private short etvIdn;
	    private short hdInterprocNumCorte;
	    private Date hdInterprocFecContable;
	    
		/**
		 * @return the atmIdn
		 */
		public short getAtmIdn() {
			return atmIdn;
		}
		/**
		 * @param atmIdn the atmIdn to set
		 */
		public void setAtmIdn(short atmIdn) {
			this.atmIdn = atmIdn;
		}
		/**
		 * @return the detprocTipoRegistro
		 */
		public Short getDetprocTipoRegistro() {
			return detprocTipoRegistro;
		}
		/**
		 * @param detprocTipoRegistro the detprocTipoRegistro to set
		 */
		public void setDetprocTipoRegistro(Short detprocTipoRegistro) {
			this.detprocTipoRegistro = detprocTipoRegistro;
		}
		/**
		 * @return the detprocIdentificadorMovto
		 */
		public Short getDetprocIdentificadorMovto() {
			return detprocIdentificadorMovto;
		}
		/**
		 * @param detprocIdentificadorMovto the detprocIdentificadorMovto to set
		 */
		public void setDetprocIdentificadorMovto(Short detprocIdentificadorMovto) {
			this.detprocIdentificadorMovto = detprocIdentificadorMovto;
		}
		/**
		 * @return the detprocEtvTraslado
		 */
		public Short getDetprocEtvTraslado() {
			return detprocEtvTraslado;
		}
		/**
		 * @param detprocEtvTraslado the detprocEtvTraslado to set
		 */
		public void setDetprocEtvTraslado(Short detprocEtvTraslado) {
			this.detprocEtvTraslado = detprocEtvTraslado;
		}
		/**
		 * @return the detprocSirhCpaeSirhOrigen
		 */
		public Integer getDetprocSirhCpaeSirhOrigen() {
			return detprocSirhCpaeSirhOrigen;
		}
		/**
		 * @param detprocSirhCpaeSirhOrigen the detprocSirhCpaeSirhOrigen to set
		 */
		public void setDetprocSirhCpaeSirhOrigen(Integer detprocSirhCpaeSirhOrigen) {
			this.detprocSirhCpaeSirhOrigen = detprocSirhCpaeSirhOrigen;
		}
		/**
		 * @return the detprocSirhDestinoIdAtm
		 */
		public Integer getDetprocSirhDestinoIdAtm() {
			return detprocSirhDestinoIdAtm;
		}
		/**
		 * @param detprocSirhDestinoIdAtm the detprocSirhDestinoIdAtm to set
		 */
		public void setDetprocSirhDestinoIdAtm(Integer detprocSirhDestinoIdAtm) {
			this.detprocSirhDestinoIdAtm = detprocSirhDestinoIdAtm;
		}
		/**
		 * @return the detprocFolioS018
		 */
		public Long getDetprocFolioS018() {
			return detprocFolioS018;
		}
		/**
		 * @param detprocFolioS018 the detprocFolioS018 to set
		 */
		public void setDetprocFolioS018(Long detprocFolioS018) {
			this.detprocFolioS018 = detprocFolioS018;
		}
		/**
		 * @return the detprocRecoleccion
		 */
		public Long getDetprocRecoleccion() {
			return detprocRecoleccion;
		}
		/**
		 * @param detprocRecoleccion the detprocRecoleccion to set
		 */
		public void setDetprocRecoleccion(Long detprocRecoleccion) {
			this.detprocRecoleccion = detprocRecoleccion;
		}
		/**
		 * @return the detprocRecepcionEnEtv
		 */
		public Long getDetprocRecepcionEnEtv() {
			return detprocRecepcionEnEtv;
		}
		/**
		 * @param detprocRecepcionEnEtv the detprocRecepcionEnEtv to set
		 */
		public void setDetprocRecepcionEnEtv(Long detprocRecepcionEnEtv) {
			this.detprocRecepcionEnEtv = detprocRecepcionEnEtv;
		}
		/**
		 * @return the detprocVerificacion
		 */
		public Long getDetprocVerificacion() {
			return detprocVerificacion;
		}
		/**
		 * @param detprocVerificacion the detprocVerificacion to set
		 */
		public void setDetprocVerificacion(Long detprocVerificacion) {
			this.detprocVerificacion = detprocVerificacion;
		}
		/**
		 * @return the detprocAcreditacionEnBnmx
		 */
		public Long getDetprocAcreditacionEnBnmx() {
			return detprocAcreditacionEnBnmx;
		}
		/**
		 * @param detprocAcreditacionEnBnmx the detprocAcreditacionEnBnmx to set
		 */
		public void setDetprocAcreditacionEnBnmx(Long detprocAcreditacionEnBnmx) {
			this.detprocAcreditacionEnBnmx = detprocAcreditacionEnBnmx;
		}
		/**
		 * @return the detprocInstruccionEtv
		 */
		public Long getDetprocInstruccionEtv() {
			return detprocInstruccionEtv;
		}
		/**
		 * @param detprocInstruccionEtv the detprocInstruccionEtv to set
		 */
		public void setDetprocInstruccionEtv(Long detprocInstruccionEtv) {
			this.detprocInstruccionEtv = detprocInstruccionEtv;
		}
		/**
		 * @return the detprocPreparacionEtv
		 */
		public Long getDetprocPreparacionEtv() {
			return detprocPreparacionEtv;
		}
		/**
		 * @param detprocPreparacionEtv the detprocPreparacionEtv to set
		 */
		public void setDetprocPreparacionEtv(Long detprocPreparacionEtv) {
			this.detprocPreparacionEtv = detprocPreparacionEtv;
		}
		/**
		 * @return the detprocEntregaATraslado
		 */
		public Long getDetprocEntregaATraslado() {
			return detprocEntregaATraslado;
		}
		/**
		 * @param detprocEntregaATraslado the detprocEntregaATraslado to set
		 */
		public void setDetprocEntregaATraslado(Long detprocEntregaATraslado) {
			this.detprocEntregaATraslado = detprocEntregaATraslado;
		}
		/**
		 * @return the detprocEntregaFORetrnoEtv
		 */
		public Short getDetprocEntregaFORetrnoEtv() {
			return detprocEntregaFORetrnoEtv;
		}
		/**
		 * @param detprocEntregaFORetrnoEtv the detprocEntregaFORetrnoEtv to set
		 */
		public void setDetprocEntregaFORetrnoEtv(Short detprocEntregaFORetrnoEtv) {
			this.detprocEntregaFORetrnoEtv = detprocEntregaFORetrnoEtv;
		}
		/**
		 * @return the detprocCopmisoEntrgUsrio
		 */
		public Long getDetprocCopmisoEntrgUsrio() {
			return detprocCopmisoEntrgUsrio;
		}
		/**
		 * @param detprocCopmisoEntrgUsrio the detprocCopmisoEntrgUsrio to set
		 */
		public void setDetprocCopmisoEntrgUsrio(Long detprocCopmisoEntrgUsrio) {
			this.detprocCopmisoEntrgUsrio = detprocCopmisoEntrgUsrio;
		}
		/**
		 * @return the detprocNumDeComprobante
		 */
		public String getDetprocNumDeComprobante() {
			return detprocNumDeComprobante;
		}
		/**
		 * @param detprocNumDeComprobante the detprocNumDeComprobante to set
		 */
		public void setDetprocNumDeComprobante(String detprocNumDeComprobante) {
			this.detprocNumDeComprobante = detprocNumDeComprobante;
		}
		/**
		 * @return the detprocDiceContener
		 */
		public BigDecimal getDetprocDiceContener() {
			return detprocDiceContener;
		}
		/**
		 * @param detprocDiceContener the detprocDiceContener to set
		 */
		public void setDetprocDiceContener(BigDecimal detprocDiceContener) {
			this.detprocDiceContener = detprocDiceContener;
		}
		/**
		 * @return the detprocNumUneg
		 */
		public Short getDetprocNumUneg() {
			return detprocNumUneg;
		}
		/**
		 * @param detprocNumUneg the detprocNumUneg to set
		 */
		public void setDetprocNumUneg(Short detprocNumUneg) {
			this.detprocNumUneg = detprocNumUneg;
		}
		/**
		 * @return the detprocContratoEfectivo
		 */
		public Long getDetprocContratoEfectivo() {
			return detprocContratoEfectivo;
		}
		/**
		 * @param detprocContratoEfectivo the detprocContratoEfectivo to set
		 */
		public void setDetprocContratoEfectivo(Long detprocContratoEfectivo) {
			this.detprocContratoEfectivo = detprocContratoEfectivo;
		}
		/**
		 * @return the detprocUnegSefEnvase
		 */
		public Long getDetprocUnegSefEnvase() {
			return detprocUnegSefEnvase;
		}
		/**
		 * @param detprocUnegSefEnvase the detprocUnegSefEnvase to set
		 */
		public void setDetprocUnegSefEnvase(Long detprocUnegSefEnvase) {
			this.detprocUnegSefEnvase = detprocUnegSefEnvase;
		}
		/**
		 * @return the detprocGloblParclContendor
		 */
		public String getDetprocGloblParclContendor() {
			return detprocGloblParclContendor;
		}
		/**
		 * @param detprocGloblParclContendor the detprocGloblParclContendor to set
		 */
		public void setDetprocGloblParclContendor(String detprocGloblParclContendor) {
			this.detprocGloblParclContendor = detprocGloblParclContendor;
		}
		/**
		 * @return the detprocPenalizacion1
		 */
		public Short getDetprocPenalizacion1() {
			return detprocPenalizacion1;
		}
		/**
		 * @param detprocPenalizacion1 the detprocPenalizacion1 to set
		 */
		public void setDetprocPenalizacion1(Short detprocPenalizacion1) {
			this.detprocPenalizacion1 = detprocPenalizacion1;
		}
		/**
		 * @return the detprocPenalizacion2
		 */
		public Short getDetprocPenalizacion2() {
			return detprocPenalizacion2;
		}
		/**
		 * @param detprocPenalizacion2 the detprocPenalizacion2 to set
		 */
		public void setDetprocPenalizacion2(Short detprocPenalizacion2) {
			this.detprocPenalizacion2 = detprocPenalizacion2;
		}
		/**
		 * @return the detprocPenalizacion3
		 */
		public Short getDetprocPenalizacion3() {
			return detprocPenalizacion3;
		}
		/**
		 * @param detprocPenalizacion3 the detprocPenalizacion3 to set
		 */
		public void setDetprocPenalizacion3(Short detprocPenalizacion3) {
			this.detprocPenalizacion3 = detprocPenalizacion3;
		}
		/**
		 * @return the detprocPenalizacion4
		 */
		public Short getDetprocPenalizacion4() {
			return detprocPenalizacion4;
		}
		/**
		 * @param detprocPenalizacion4 the detprocPenalizacion4 to set
		 */
		public void setDetprocPenalizacion4(Short detprocPenalizacion4) {
			this.detprocPenalizacion4 = detprocPenalizacion4;
		}
		/**
		 * @return the detprocDivisa
		 */
		public Short getDetprocDivisa() {
			return detprocDivisa;
		}
		/**
		 * @param detprocDivisa the detprocDivisa to set
		 */
		public void setDetprocDivisa(Short detprocDivisa) {
			this.detprocDivisa = detprocDivisa;
		}
		/**
		 * @return the detprocNumCliente
		 */
		public Long getDetprocNumCliente() {
			return detprocNumCliente;
		}
		/**
		 * @param detprocNumCliente the detprocNumCliente to set
		 */
		public void setDetprocNumCliente(Long detprocNumCliente) {
			this.detprocNumCliente = detprocNumCliente;
		}
		/**
		 * @return the detprocFolioDeposDolares
		 */
		public Long getDetprocFolioDeposDolares() {
			return detprocFolioDeposDolares;
		}
		/**
		 * @param detprocFolioDeposDolares the detprocFolioDeposDolares to set
		 */
		public void setDetprocFolioDeposDolares(Long detprocFolioDeposDolares) {
			this.detprocFolioDeposDolares = detprocFolioDeposDolares;
		}
		/**
		 * @return the detprocUnegPemex
		 */
		public Long getDetprocUnegPemex() {
			return detprocUnegPemex;
		}
		/**
		 * @param detprocUnegPemex the detprocUnegPemex to set
		 */
		public void setDetprocUnegPemex(Long detprocUnegPemex) {
			this.detprocUnegPemex = detprocUnegPemex;
		}
		/**
		 * @return the detprocSuc
		 */
		public Short getDetprocSuc() {
			return detprocSuc;
		}
		/**
		 * @param detprocSuc the detprocSuc to set
		 */
		public void setDetprocSuc(Short detprocSuc) {
			this.detprocSuc = detprocSuc;
		}
		/**
		 * @return the detprocCuenta
		 */
		public Integer getDetprocCuenta() {
			return detprocCuenta;
		}
		/**
		 * @param detprocCuenta the detprocCuenta to set
		 */
		public void setDetprocCuenta(Integer detprocCuenta) {
			this.detprocCuenta = detprocCuenta;
		}
		/**
		 * @return the detprocImpteDeposDotacion
		 */
		public BigDecimal getDetprocImpteDeposDotacion() {
			return detprocImpteDeposDotacion;
		}
		/**
		 * @param detprocImpteDeposDotacion the detprocImpteDeposDotacion to set
		 */
		public void setDetprocImpteDeposDotacion(BigDecimal detprocImpteDeposDotacion) {
			this.detprocImpteDeposDotacion = detprocImpteDeposDotacion;
		}
		/**
		 * @return the detprocRefNumerica1
		 */
		public Long getDetprocRefNumerica1() {
			return detprocRefNumerica1;
		}
		/**
		 * @param detprocRefNumerica1 the detprocRefNumerica1 to set
		 */
		public void setDetprocRefNumerica1(Long detprocRefNumerica1) {
			this.detprocRefNumerica1 = detprocRefNumerica1;
		}
		/**
		 * @return the detprocReferenciaAlf2
		 */
		public String getDetprocReferenciaAlf2() {
			return detprocReferenciaAlf2;
		}
		/**
		 * @param detprocReferenciaAlf2 the detprocReferenciaAlf2 to set
		 */
		public void setDetprocReferenciaAlf2(String detprocReferenciaAlf2) {
			this.detprocReferenciaAlf2 = detprocReferenciaAlf2;
		}
		/**
		 * @return the detprocReferencia3
		 */
		public String getDetprocReferencia3() {
			return detprocReferencia3;
		}
		/**
		 * @param detprocReferencia3 the detprocReferencia3 to set
		 */
		public void setDetprocReferencia3(String detprocReferencia3) {
			this.detprocReferencia3 = detprocReferencia3;
		}
		/**
		 * @return the detprocReferencia4
		 */
		public String getDetprocReferencia4() {
			return detprocReferencia4;
		}
		/**
		 * @param detprocReferencia4 the detprocReferencia4 to set
		 */
		public void setDetprocReferencia4(String detprocReferencia4) {
			this.detprocReferencia4 = detprocReferencia4;
		}
		/**
		 * @return the detprocComprobServSef
		 */
		public Integer getDetprocComprobServSef() {
			return detprocComprobServSef;
		}
		/**
		 * @param detprocComprobServSef the detprocComprobServSef to set
		 */
		public void setDetprocComprobServSef(Integer detprocComprobServSef) {
			this.detprocComprobServSef = detprocComprobServSef;
		}
		/**
		 * @return the detprocTipoBill1
		 */
		public Short getDetprocTipoBill1() {
			return detprocTipoBill1;
		}
		/**
		 * @param detprocTipoBill1 the detprocTipoBill1 to set
		 */
		public void setDetprocTipoBill1(Short detprocTipoBill1) {
			this.detprocTipoBill1 = detprocTipoBill1;
		}
		/**
		 * @return the detprocDenominacion1
		 */
		public BigDecimal getDetprocDenominacion1() {
			return detprocDenominacion1;
		}
		/**
		 * @param detprocDenominacion1 the detprocDenominacion1 to set
		 */
		public void setDetprocDenominacion1(BigDecimal detprocDenominacion1) {
			this.detprocDenominacion1 = detprocDenominacion1;
		}
		/**
		 * @return the detprocImpte1
		 */
		public BigDecimal getDetprocImpte1() {
			return detprocImpte1;
		}
		/**
		 * @param detprocImpte1 the detprocImpte1 to set
		 */
		public void setDetprocImpte1(BigDecimal detprocImpte1) {
			this.detprocImpte1 = detprocImpte1;
		}
		/**
		 * @return the detprocTipoBill2
		 */
		public Short getDetprocTipoBill2() {
			return detprocTipoBill2;
		}
		/**
		 * @param detprocTipoBill2 the detprocTipoBill2 to set
		 */
		public void setDetprocTipoBill2(Short detprocTipoBill2) {
			this.detprocTipoBill2 = detprocTipoBill2;
		}
		/**
		 * @return the detprocDenominacion2
		 */
		public BigDecimal getDetprocDenominacion2() {
			return detprocDenominacion2;
		}
		/**
		 * @param detprocDenominacion2 the detprocDenominacion2 to set
		 */
		public void setDetprocDenominacion2(BigDecimal detprocDenominacion2) {
			this.detprocDenominacion2 = detprocDenominacion2;
		}
		/**
		 * @return the detprocImpte2
		 */
		public BigDecimal getDetprocImpte2() {
			return detprocImpte2;
		}
		/**
		 * @param detprocImpte2 the detprocImpte2 to set
		 */
		public void setDetprocImpte2(BigDecimal detprocImpte2) {
			this.detprocImpte2 = detprocImpte2;
		}
		/**
		 * @return the detprocTipoBill3
		 */
		public Short getDetprocTipoBill3() {
			return detprocTipoBill3;
		}
		/**
		 * @param detprocTipoBill3 the detprocTipoBill3 to set
		 */
		public void setDetprocTipoBill3(Short detprocTipoBill3) {
			this.detprocTipoBill3 = detprocTipoBill3;
		}
		/**
		 * @return the detprocDenominacion3
		 */
		public BigDecimal getDetprocDenominacion3() {
			return detprocDenominacion3;
		}
		/**
		 * @param detprocDenominacion3 the detprocDenominacion3 to set
		 */
		public void setDetprocDenominacion3(BigDecimal detprocDenominacion3) {
			this.detprocDenominacion3 = detprocDenominacion3;
		}
		/**
		 * @return the detprocImpte3
		 */
		public BigDecimal getDetprocImpte3() {
			return detprocImpte3;
		}
		/**
		 * @param detprocImpte3 the detprocImpte3 to set
		 */
		public void setDetprocImpte3(BigDecimal detprocImpte3) {
			this.detprocImpte3 = detprocImpte3;
		}
		/**
		 * @return the detprocTipoBill4
		 */
		public Short getDetprocTipoBill4() {
			return detprocTipoBill4;
		}
		/**
		 * @param detprocTipoBill4 the detprocTipoBill4 to set
		 */
		public void setDetprocTipoBill4(Short detprocTipoBill4) {
			this.detprocTipoBill4 = detprocTipoBill4;
		}
		/**
		 * @return the detprocDenominacion4
		 */
		public BigDecimal getDetprocDenominacion4() {
			return detprocDenominacion4;
		}
		/**
		 * @param detprocDenominacion4 the detprocDenominacion4 to set
		 */
		public void setDetprocDenominacion4(BigDecimal detprocDenominacion4) {
			this.detprocDenominacion4 = detprocDenominacion4;
		}
		/**
		 * @return the detprocImpte4
		 */
		public BigDecimal getDetprocImpte4() {
			return detprocImpte4;
		}
		/**
		 * @param detprocImpte4 the detprocImpte4 to set
		 */
		public void setDetprocImpte4(BigDecimal detprocImpte4) {
			this.detprocImpte4 = detprocImpte4;
		}
		/**
		 * @return the detprocTipoBill5
		 */
		public Short getDetprocTipoBill5() {
			return detprocTipoBill5;
		}
		/**
		 * @param detprocTipoBill5 the detprocTipoBill5 to set
		 */
		public void setDetprocTipoBill5(Short detprocTipoBill5) {
			this.detprocTipoBill5 = detprocTipoBill5;
		}
		/**
		 * @return the detprocDenominacion5
		 */
		public BigDecimal getDetprocDenominacion5() {
			return detprocDenominacion5;
		}
		/**
		 * @param detprocDenominacion5 the detprocDenominacion5 to set
		 */
		public void setDetprocDenominacion5(BigDecimal detprocDenominacion5) {
			this.detprocDenominacion5 = detprocDenominacion5;
		}
		/**
		 * @return the detprocImpte5
		 */
		public BigDecimal getDetprocImpte5() {
			return detprocImpte5;
		}
		/**
		 * @param detprocImpte5 the detprocImpte5 to set
		 */
		public void setDetprocImpte5(BigDecimal detprocImpte5) {
			this.detprocImpte5 = detprocImpte5;
		}
		/**
		 * @return the detprocTipoBill6
		 */
		public Short getDetprocTipoBill6() {
			return detprocTipoBill6;
		}
		/**
		 * @param detprocTipoBill6 the detprocTipoBill6 to set
		 */
		public void setDetprocTipoBill6(Short detprocTipoBill6) {
			this.detprocTipoBill6 = detprocTipoBill6;
		}
		/**
		 * @return the detprocDenominacion6
		 */
		public BigDecimal getDetprocDenominacion6() {
			return detprocDenominacion6;
		}
		/**
		 * @param detprocDenominacion6 the detprocDenominacion6 to set
		 */
		public void setDetprocDenominacion6(BigDecimal detprocDenominacion6) {
			this.detprocDenominacion6 = detprocDenominacion6;
		}
		/**
		 * @return the detprocImpte6
		 */
		public BigDecimal getDetprocImpte6() {
			return detprocImpte6;
		}
		/**
		 * @param detprocImpte6 the detprocImpte6 to set
		 */
		public void setDetprocImpte6(BigDecimal detprocImpte6) {
			this.detprocImpte6 = detprocImpte6;
		}
		/**
		 * @return the detprocTipoBill7
		 */
		public Short getDetprocTipoBill7() {
			return detprocTipoBill7;
		}
		/**
		 * @param detprocTipoBill7 the detprocTipoBill7 to set
		 */
		public void setDetprocTipoBill7(Short detprocTipoBill7) {
			this.detprocTipoBill7 = detprocTipoBill7;
		}
		/**
		 * @return the detprocDenominacion7
		 */
		public BigDecimal getDetprocDenominacion7() {
			return detprocDenominacion7;
		}
		/**
		 * @param detprocDenominacion7 the detprocDenominacion7 to set
		 */
		public void setDetprocDenominacion7(BigDecimal detprocDenominacion7) {
			this.detprocDenominacion7 = detprocDenominacion7;
		}
		/**
		 * @return the detprocImpte7
		 */
		public BigDecimal getDetprocImpte7() {
			return detprocImpte7;
		}
		/**
		 * @param detprocImpte7 the detprocImpte7 to set
		 */
		public void setDetprocImpte7(BigDecimal detprocImpte7) {
			this.detprocImpte7 = detprocImpte7;
		}
		/**
		 * @return the detprocTipoBill8
		 */
		public Short getDetprocTipoBill8() {
			return detprocTipoBill8;
		}
		/**
		 * @param detprocTipoBill8 the detprocTipoBill8 to set
		 */
		public void setDetprocTipoBill8(Short detprocTipoBill8) {
			this.detprocTipoBill8 = detprocTipoBill8;
		}
		/**
		 * @return the detprocDenominacion8
		 */
		public BigDecimal getDetprocDenominacion8() {
			return detprocDenominacion8;
		}
		/**
		 * @param detprocDenominacion8 the detprocDenominacion8 to set
		 */
		public void setDetprocDenominacion8(BigDecimal detprocDenominacion8) {
			this.detprocDenominacion8 = detprocDenominacion8;
		}
		/**
		 * @return the detprocImpte8
		 */
		public BigDecimal getDetprocImpte8() {
			return detprocImpte8;
		}
		/**
		 * @param detprocImpte8 the detprocImpte8 to set
		 */
		public void setDetprocImpte8(BigDecimal detprocImpte8) {
			this.detprocImpte8 = detprocImpte8;
		}
		/**
		 * @return the detprocTipoBill9
		 */
		public Short getDetprocTipoBill9() {
			return detprocTipoBill9;
		}
		/**
		 * @param detprocTipoBill9 the detprocTipoBill9 to set
		 */
		public void setDetprocTipoBill9(Short detprocTipoBill9) {
			this.detprocTipoBill9 = detprocTipoBill9;
		}
		/**
		 * @return the detprocDenominacion9
		 */
		public BigDecimal getDetprocDenominacion9() {
			return detprocDenominacion9;
		}
		/**
		 * @param detprocDenominacion9 the detprocDenominacion9 to set
		 */
		public void setDetprocDenominacion9(BigDecimal detprocDenominacion9) {
			this.detprocDenominacion9 = detprocDenominacion9;
		}
		/**
		 * @return the detprocImpte9
		 */
		public BigDecimal getDetprocImpte9() {
			return detprocImpte9;
		}
		/**
		 * @param detprocImpte9 the detprocImpte9 to set
		 */
		public void setDetprocImpte9(BigDecimal detprocImpte9) {
			this.detprocImpte9 = detprocImpte9;
		}
		/**
		 * @return the detprocTipoBill10
		 */
		public Short getDetprocTipoBill10() {
			return detprocTipoBill10;
		}
		/**
		 * @param detprocTipoBill10 the detprocTipoBill10 to set
		 */
		public void setDetprocTipoBill10(Short detprocTipoBill10) {
			this.detprocTipoBill10 = detprocTipoBill10;
		}
		/**
		 * @return the detprocDenominacion10
		 */
		public BigDecimal getDetprocDenominacion10() {
			return detprocDenominacion10;
		}
		/**
		 * @param detprocDenominacion10 the detprocDenominacion10 to set
		 */
		public void setDetprocDenominacion10(BigDecimal detprocDenominacion10) {
			this.detprocDenominacion10 = detprocDenominacion10;
		}
		/**
		 * @return the detprocImpte10
		 */
		public BigDecimal getDetprocImpte10() {
			return detprocImpte10;
		}
		/**
		 * @param detprocImpte10 the detprocImpte10 to set
		 */
		public void setDetprocImpte10(BigDecimal detprocImpte10) {
			this.detprocImpte10 = detprocImpte10;
		}
		/**
		 * @return the detprocTipoBill11
		 */
		public Short getDetprocTipoBill11() {
			return detprocTipoBill11;
		}
		/**
		 * @param detprocTipoBill11 the detprocTipoBill11 to set
		 */
		public void setDetprocTipoBill11(Short detprocTipoBill11) {
			this.detprocTipoBill11 = detprocTipoBill11;
		}
		/**
		 * @return the detprocDenominacion11
		 */
		public BigDecimal getDetprocDenominacion11() {
			return detprocDenominacion11;
		}
		/**
		 * @param detprocDenominacion11 the detprocDenominacion11 to set
		 */
		public void setDetprocDenominacion11(BigDecimal detprocDenominacion11) {
			this.detprocDenominacion11 = detprocDenominacion11;
		}
		/**
		 * @return the detprocImpte11
		 */
		public BigDecimal getDetprocImpte11() {
			return detprocImpte11;
		}
		/**
		 * @param detprocImpte11 the detprocImpte11 to set
		 */
		public void setDetprocImpte11(BigDecimal detprocImpte11) {
			this.detprocImpte11 = detprocImpte11;
		}
		/**
		 * @return the detprocTipoBill12
		 */
		public Short getDetprocTipoBill12() {
			return detprocTipoBill12;
		}
		/**
		 * @param detprocTipoBill12 the detprocTipoBill12 to set
		 */
		public void setDetprocTipoBill12(Short detprocTipoBill12) {
			this.detprocTipoBill12 = detprocTipoBill12;
		}
		/**
		 * @return the detprocDenominacion12
		 */
		public BigDecimal getDetprocDenominacion12() {
			return detprocDenominacion12;
		}
		/**
		 * @param detprocDenominacion12 the detprocDenominacion12 to set
		 */
		public void setDetprocDenominacion12(BigDecimal detprocDenominacion12) {
			this.detprocDenominacion12 = detprocDenominacion12;
		}
		/**
		 * @return the detprocImpte12
		 */
		public BigDecimal getDetprocImpte12() {
			return detprocImpte12;
		}
		/**
		 * @param detprocImpte12 the detprocImpte12 to set
		 */
		public void setDetprocImpte12(BigDecimal detprocImpte12) {
			this.detprocImpte12 = detprocImpte12;
		}
		/**
		 * @return the detprocTipoBill13
		 */
		public Short getDetprocTipoBill13() {
			return detprocTipoBill13;
		}
		/**
		 * @param detprocTipoBill13 the detprocTipoBill13 to set
		 */
		public void setDetprocTipoBill13(Short detprocTipoBill13) {
			this.detprocTipoBill13 = detprocTipoBill13;
		}
		/**
		 * @return the detprocDenominacion13
		 */
		public BigDecimal getDetprocDenominacion13() {
			return detprocDenominacion13;
		}
		/**
		 * @param detprocDenominacion13 the detprocDenominacion13 to set
		 */
		public void setDetprocDenominacion13(BigDecimal detprocDenominacion13) {
			this.detprocDenominacion13 = detprocDenominacion13;
		}
		/**
		 * @return the detprocImpte13
		 */
		public BigDecimal getDetprocImpte13() {
			return detprocImpte13;
		}
		/**
		 * @param detprocImpte13 the detprocImpte13 to set
		 */
		public void setDetprocImpte13(BigDecimal detprocImpte13) {
			this.detprocImpte13 = detprocImpte13;
		}
		/**
		 * @return the detprocTipoBill14
		 */
		public Short getDetprocTipoBill14() {
			return detprocTipoBill14;
		}
		/**
		 * @param detprocTipoBill14 the detprocTipoBill14 to set
		 */
		public void setDetprocTipoBill14(Short detprocTipoBill14) {
			this.detprocTipoBill14 = detprocTipoBill14;
		}
		/**
		 * @return the detprocDenominacion14
		 */
		public BigDecimal getDetprocDenominacion14() {
			return detprocDenominacion14;
		}
		/**
		 * @param detprocDenominacion14 the detprocDenominacion14 to set
		 */
		public void setDetprocDenominacion14(BigDecimal detprocDenominacion14) {
			this.detprocDenominacion14 = detprocDenominacion14;
		}
		/**
		 * @return the detprocImpte14
		 */
		public BigDecimal getDetprocImpte14() {
			return detprocImpte14;
		}
		/**
		 * @param detprocImpte14 the detprocImpte14 to set
		 */
		public void setDetprocImpte14(BigDecimal detprocImpte14) {
			this.detprocImpte14 = detprocImpte14;
		}
		/**
		 * @return the detprocTipoBill15
		 */
		public Short getDetprocTipoBill15() {
			return detprocTipoBill15;
		}
		/**
		 * @param detprocTipoBill15 the detprocTipoBill15 to set
		 */
		public void setDetprocTipoBill15(Short detprocTipoBill15) {
			this.detprocTipoBill15 = detprocTipoBill15;
		}
		/**
		 * @return the detprocDenominacion15
		 */
		public BigDecimal getDetprocDenominacion15() {
			return detprocDenominacion15;
		}
		/**
		 * @param detprocDenominacion15 the detprocDenominacion15 to set
		 */
		public void setDetprocDenominacion15(BigDecimal detprocDenominacion15) {
			this.detprocDenominacion15 = detprocDenominacion15;
		}
		/**
		 * @return the detprocImpte15
		 */
		public BigDecimal getDetprocImpte15() {
			return detprocImpte15;
		}
		/**
		 * @param detprocImpte15 the detprocImpte15 to set
		 */
		public void setDetprocImpte15(BigDecimal detprocImpte15) {
			this.detprocImpte15 = detprocImpte15;
		}
		/**
		 * @return the detprocTipoBill16
		 */
		public Short getDetprocTipoBill16() {
			return detprocTipoBill16;
		}
		/**
		 * @param detprocTipoBill16 the detprocTipoBill16 to set
		 */
		public void setDetprocTipoBill16(Short detprocTipoBill16) {
			this.detprocTipoBill16 = detprocTipoBill16;
		}
		/**
		 * @return the detprocDenominacion16
		 */
		public BigDecimal getDetprocDenominacion16() {
			return detprocDenominacion16;
		}
		/**
		 * @param detprocDenominacion16 the detprocDenominacion16 to set
		 */
		public void setDetprocDenominacion16(BigDecimal detprocDenominacion16) {
			this.detprocDenominacion16 = detprocDenominacion16;
		}
		/**
		 * @return the detprocImpte16
		 */
		public BigDecimal getDetprocImpte16() {
			return detprocImpte16;
		}
		/**
		 * @param detprocImpte16 the detprocImpte16 to set
		 */
		public void setDetprocImpte16(BigDecimal detprocImpte16) {
			this.detprocImpte16 = detprocImpte16;
		}
		/**
		 * @return the detprocTipoBill17
		 */
		public Short getDetprocTipoBill17() {
			return detprocTipoBill17;
		}
		/**
		 * @param detprocTipoBill17 the detprocTipoBill17 to set
		 */
		public void setDetprocTipoBill17(Short detprocTipoBill17) {
			this.detprocTipoBill17 = detprocTipoBill17;
		}
		/**
		 * @return the detprocDenominacion17
		 */
		public BigDecimal getDetprocDenominacion17() {
			return detprocDenominacion17;
		}
		/**
		 * @param detprocDenominacion17 the detprocDenominacion17 to set
		 */
		public void setDetprocDenominacion17(BigDecimal detprocDenominacion17) {
			this.detprocDenominacion17 = detprocDenominacion17;
		}
		/**
		 * @return the detprocImpte17
		 */
		public BigDecimal getDetprocImpte17() {
			return detprocImpte17;
		}
		/**
		 * @param detprocImpte17 the detprocImpte17 to set
		 */
		public void setDetprocImpte17(BigDecimal detprocImpte17) {
			this.detprocImpte17 = detprocImpte17;
		}
		/**
		 * @return the detprocTipoBill18
		 */
		public Short getDetprocTipoBill18() {
			return detprocTipoBill18;
		}
		/**
		 * @param detprocTipoBill18 the detprocTipoBill18 to set
		 */
		public void setDetprocTipoBill18(Short detprocTipoBill18) {
			this.detprocTipoBill18 = detprocTipoBill18;
		}
		/**
		 * @return the detprocDenominacion18
		 */
		public BigDecimal getDetprocDenominacion18() {
			return detprocDenominacion18;
		}
		/**
		 * @param detprocDenominacion18 the detprocDenominacion18 to set
		 */
		public void setDetprocDenominacion18(BigDecimal detprocDenominacion18) {
			this.detprocDenominacion18 = detprocDenominacion18;
		}
		/**
		 * @return the detprocImpte18
		 */
		public BigDecimal getDetprocImpte18() {
			return detprocImpte18;
		}
		/**
		 * @param detprocImpte18 the detprocImpte18 to set
		 */
		public void setDetprocImpte18(BigDecimal detprocImpte18) {
			this.detprocImpte18 = detprocImpte18;
		}
		/**
		 * @return the detprocTipoBill19
		 */
		public Short getDetprocTipoBill19() {
			return detprocTipoBill19;
		}
		/**
		 * @param detprocTipoBill19 the detprocTipoBill19 to set
		 */
		public void setDetprocTipoBill19(Short detprocTipoBill19) {
			this.detprocTipoBill19 = detprocTipoBill19;
		}
		/**
		 * @return the detprocDenominacion19
		 */
		public BigDecimal getDetprocDenominacion19() {
			return detprocDenominacion19;
		}
		/**
		 * @param detprocDenominacion19 the detprocDenominacion19 to set
		 */
		public void setDetprocDenominacion19(BigDecimal detprocDenominacion19) {
			this.detprocDenominacion19 = detprocDenominacion19;
		}
		/**
		 * @return the detprocImpte19
		 */
		public BigDecimal getDetprocImpte19() {
			return detprocImpte19;
		}
		/**
		 * @param detprocImpte19 the detprocImpte19 to set
		 */
		public void setDetprocImpte19(BigDecimal detprocImpte19) {
			this.detprocImpte19 = detprocImpte19;
		}
		/**
		 * @return the detprocTipoBill20
		 */
		public Short getDetprocTipoBill20() {
			return detprocTipoBill20;
		}
		/**
		 * @param detprocTipoBill20 the detprocTipoBill20 to set
		 */
		public void setDetprocTipoBill20(Short detprocTipoBill20) {
			this.detprocTipoBill20 = detprocTipoBill20;
		}
		/**
		 * @return the detprocDenominacion20
		 */
		public BigDecimal getDetprocDenominacion20() {
			return detprocDenominacion20;
		}
		/**
		 * @param detprocDenominacion20 the detprocDenominacion20 to set
		 */
		public void setDetprocDenominacion20(BigDecimal detprocDenominacion20) {
			this.detprocDenominacion20 = detprocDenominacion20;
		}
		/**
		 * @return the detprocImpte20
		 */
		public BigDecimal getDetprocImpte20() {
			return detprocImpte20;
		}
		/**
		 * @param detprocImpte20 the detprocImpte20 to set
		 */
		public void setDetprocImpte20(BigDecimal detprocImpte20) {
			this.detprocImpte20 = detprocImpte20;
		}
		/**
		 * @return the detprocTipoBill21
		 */
		public Short getDetprocTipoBill21() {
			return detprocTipoBill21;
		}
		/**
		 * @param detprocTipoBill21 the detprocTipoBill21 to set
		 */
		public void setDetprocTipoBill21(Short detprocTipoBill21) {
			this.detprocTipoBill21 = detprocTipoBill21;
		}
		/**
		 * @return the detprocDenominacion21
		 */
		public BigDecimal getDetprocDenominacion21() {
			return detprocDenominacion21;
		}
		/**
		 * @param detprocDenominacion21 the detprocDenominacion21 to set
		 */
		public void setDetprocDenominacion21(BigDecimal detprocDenominacion21) {
			this.detprocDenominacion21 = detprocDenominacion21;
		}
		/**
		 * @return the detprocImpte21
		 */
		public BigDecimal getDetprocImpte21() {
			return detprocImpte21;
		}
		/**
		 * @param detprocImpte21 the detprocImpte21 to set
		 */
		public void setDetprocImpte21(BigDecimal detprocImpte21) {
			this.detprocImpte21 = detprocImpte21;
		}
		/**
		 * @return the detprocTipoBill22
		 */
		public Short getDetprocTipoBill22() {
			return detprocTipoBill22;
		}
		/**
		 * @param detprocTipoBill22 the detprocTipoBill22 to set
		 */
		public void setDetprocTipoBill22(Short detprocTipoBill22) {
			this.detprocTipoBill22 = detprocTipoBill22;
		}
		/**
		 * @return the detprocDenominacion22
		 */
		public BigDecimal getDetprocDenominacion22() {
			return detprocDenominacion22;
		}
		/**
		 * @param detprocDenominacion22 the detprocDenominacion22 to set
		 */
		public void setDetprocDenominacion22(BigDecimal detprocDenominacion22) {
			this.detprocDenominacion22 = detprocDenominacion22;
		}
		/**
		 * @return the detprocImpte22
		 */
		public BigDecimal getDetprocImpte22() {
			return detprocImpte22;
		}
		/**
		 * @param detprocImpte22 the detprocImpte22 to set
		 */
		public void setDetprocImpte22(BigDecimal detprocImpte22) {
			this.detprocImpte22 = detprocImpte22;
		}
		/**
		 * @return the detprocTipoBill23
		 */
		public Short getDetprocTipoBill23() {
			return detprocTipoBill23;
		}
		/**
		 * @param detprocTipoBill23 the detprocTipoBill23 to set
		 */
		public void setDetprocTipoBill23(Short detprocTipoBill23) {
			this.detprocTipoBill23 = detprocTipoBill23;
		}
		/**
		 * @return the detprocDenominacion23
		 */
		public BigDecimal getDetprocDenominacion23() {
			return detprocDenominacion23;
		}
		/**
		 * @param detprocDenominacion23 the detprocDenominacion23 to set
		 */
		public void setDetprocDenominacion23(BigDecimal detprocDenominacion23) {
			this.detprocDenominacion23 = detprocDenominacion23;
		}
		/**
		 * @return the detprocImpte23
		 */
		public BigDecimal getDetprocImpte23() {
			return detprocImpte23;
		}
		/**
		 * @param detprocImpte23 the detprocImpte23 to set
		 */
		public void setDetprocImpte23(BigDecimal detprocImpte23) {
			this.detprocImpte23 = detprocImpte23;
		}
		/**
		 * @return the detprocImpteCargoCheque
		 */
		public BigDecimal getDetprocImpteCargoCheque() {
			return detprocImpteCargoCheque;
		}
		/**
		 * @param detprocImpteCargoCheque the detprocImpteCargoCheque to set
		 */
		public void setDetprocImpteCargoCheque(BigDecimal detprocImpteCargoCheque) {
			this.detprocImpteCargoCheque = detprocImpteCargoCheque;
		}
		/**
		 * @return the detprocBanco
		 */
		public Short getDetprocBanco() {
			return detprocBanco;
		}
		/**
		 * @param detprocBanco the detprocBanco to set
		 */
		public void setDetprocBanco(Short detprocBanco) {
			this.detprocBanco = detprocBanco;
		}
		/**
		 * @return the detprocLineacapCodSeguridad
		 */
		public Short getDetprocLineacapCodSeguridad() {
			return detprocLineacapCodSeguridad;
		}
		/**
		 * @param detprocLineacapCodSeguridad the detprocLineacapCodSeguridad to set
		 */
		public void setDetprocLineacapCodSeguridad(Short detprocLineacapCodSeguridad) {
			this.detprocLineacapCodSeguridad = detprocLineacapCodSeguridad;
		}
		/**
		 * @return the detprocLineacapRutaTransito
		 */
		public Integer getDetprocLineacapRutaTransito() {
			return detprocLineacapRutaTransito;
		}
		/**
		 * @param detprocLineacapRutaTransito the detprocLineacapRutaTransito to set
		 */
		public void setDetprocLineacapRutaTransito(Integer detprocLineacapRutaTransito) {
			this.detprocLineacapRutaTransito = detprocLineacapRutaTransito;
		}
		/**
		 * @return the detprocLineacapNumCuenta
		 */
		public Long getDetprocLineacapNumCuenta() {
			return detprocLineacapNumCuenta;
		}
		/**
		 * @param detprocLineacapNumCuenta the detprocLineacapNumCuenta to set
		 */
		public void setDetprocLineacapNumCuenta(Long detprocLineacapNumCuenta) {
			this.detprocLineacapNumCuenta = detprocLineacapNumCuenta;
		}
		/**
		 * @return the detprocLineacapNumCheque
		 */
		public Integer getDetprocLineacapNumCheque() {
			return detprocLineacapNumCheque;
		}
		/**
		 * @param detprocLineacapNumCheque the detprocLineacapNumCheque to set
		 */
		public void setDetprocLineacapNumCheque(Integer detprocLineacapNumCheque) {
			this.detprocLineacapNumCheque = detprocLineacapNumCheque;
		}
		/**
		 * @return the detprocFecHrRetencion
		 */
		public Integer getDetprocFecHrRetencion() {
			return detprocFecHrRetencion;
		}
		/**
		 * @param detprocFecHrRetencion the detprocFecHrRetencion to set
		 */
		public void setDetprocFecHrRetencion(Integer detprocFecHrRetencion) {
			this.detprocFecHrRetencion = detprocFecHrRetencion;
		}
		/**
		 * @return the detprocCausaRetencion
		 */
		public Short getDetprocCausaRetencion() {
			return detprocCausaRetencion;
		}
		/**
		 * @param detprocCausaRetencion the detprocCausaRetencion to set
		 */
		public void setDetprocCausaRetencion(Short detprocCausaRetencion) {
			this.detprocCausaRetencion = detprocCausaRetencion;
		}
		/**
		 * @return the detprocImpteDiferencia
		 */
		public BigDecimal getDetprocImpteDiferencia() {
			return detprocImpteDiferencia;
		}
		/**
		 * @param detprocImpteDiferencia the detprocImpteDiferencia to set
		 */
		public void setDetprocImpteDiferencia(BigDecimal detprocImpteDiferencia) {
			this.detprocImpteDiferencia = detprocImpteDiferencia;
		}
		/**
		 * @return the detprocFaltanteSobrante
		 */
		public String getDetprocFaltanteSobrante() {
			return detprocFaltanteSobrante;
		}
		/**
		 * @param detprocFaltanteSobrante the detprocFaltanteSobrante to set
		 */
		public void setDetprocFaltanteSobrante(String detprocFaltanteSobrante) {
			this.detprocFaltanteSobrante = detprocFaltanteSobrante;
		}
		/**
		 * @return the detprocSuccargoAbonoDif
		 */
		public Short getDetprocSuccargoAbonoDif() {
			return detprocSuccargoAbonoDif;
		}
		/**
		 * @param detprocSuccargoAbonoDif the detprocSuccargoAbonoDif to set
		 */
		public void setDetprocSuccargoAbonoDif(Short detprocSuccargoAbonoDif) {
			this.detprocSuccargoAbonoDif = detprocSuccargoAbonoDif;
		}
		/**
		 * @return the detprocCntacargoAbonodif
		 */
		public Integer getDetprocCntacargoAbonodif() {
			return detprocCntacargoAbonodif;
		}
		/**
		 * @param detprocCntacargoAbonodif the detprocCntacargoAbonodif to set
		 */
		public void setDetprocCntacargoAbonodif(Integer detprocCntacargoAbonodif) {
			this.detprocCntacargoAbonodif = detprocCntacargoAbonodif;
		}
		/**
		 * @return the detprocReferenciaNumerica
		 */
		public Long getDetprocReferenciaNumerica() {
			return detprocReferenciaNumerica;
		}
		/**
		 * @param detprocReferenciaNumerica the detprocReferenciaNumerica to set
		 */
		public void setDetprocReferenciaNumerica(Long detprocReferenciaNumerica) {
			this.detprocReferenciaNumerica = detprocReferenciaNumerica;
		}
		/**
		 * @return the detprocReferenciaAlf
		 */
		public String getDetprocReferenciaAlf() {
			return detprocReferenciaAlf;
		}
		/**
		 * @param detprocReferenciaAlf the detprocReferenciaAlf to set
		 */
		public void setDetprocReferenciaAlf(String detprocReferenciaAlf) {
			this.detprocReferenciaAlf = detprocReferenciaAlf;
		}
		/**
		 * @return the detprocReferencia31
		 */
		public String getDetprocReferencia31() {
			return detprocReferencia31;
		}
		/**
		 * @param detprocReferencia31 the detprocReferencia31 to set
		 */
		public void setDetprocReferencia31(String detprocReferencia31) {
			this.detprocReferencia31 = detprocReferencia31;
		}
		/**
		 * @return the detprocReferencia41
		 */
		public String getDetprocReferencia41() {
			return detprocReferencia41;
		}
		/**
		 * @param detprocReferencia41 the detprocReferencia41 to set
		 */
		public void setDetprocReferencia41(String detprocReferencia41) {
			this.detprocReferencia41 = detprocReferencia41;
		}
		/**
		 * @return the detprocNumParcDif
		 */
		public Short getDetprocNumParcDif() {
			return detprocNumParcDif;
		}
		/**
		 * @param detprocNumParcDif the detprocNumParcDif to set
		 */
		public void setDetprocNumParcDif(Short detprocNumParcDif) {
			this.detprocNumParcDif = detprocNumParcDif;
		}
		/**
		 * @return the detprocDenominacionBpf
		 */
		public Integer getDetprocDenominacionBpf() {
			return detprocDenominacionBpf;
		}
		/**
		 * @param detprocDenominacionBpf the detprocDenominacionBpf to set
		 */
		public void setDetprocDenominacionBpf(Integer detprocDenominacionBpf) {
			this.detprocDenominacionBpf = detprocDenominacionBpf;
		}
		/**
		 * @return the detprocSerieBpf
		 */
		public String getDetprocSerieBpf() {
			return detprocSerieBpf;
		}
		/**
		 * @param detprocSerieBpf the detprocSerieBpf to set
		 */
		public void setDetprocSerieBpf(String detprocSerieBpf) {
			this.detprocSerieBpf = detprocSerieBpf;
		}
		/**
		 * @return the detprocFolioBpf
		 */
		public String getDetprocFolioBpf() {
			return detprocFolioBpf;
		}
		/**
		 * @param detprocFolioBpf the detprocFolioBpf to set
		 */
		public void setDetprocFolioBpf(String detprocFolioBpf) {
			this.detprocFolioBpf = detprocFolioBpf;
		}
		/**
		 * @return the detprocNombreCajeroEtv
		 */
		public String getDetprocNombreCajeroEtv() {
			return detprocNombreCajeroEtv;
		}
		/**
		 * @param detprocNombreCajeroEtv the detprocNombreCajeroEtv to set
		 */
		public void setDetprocNombreCajeroEtv(String detprocNombreCajeroEtv) {
			this.detprocNombreCajeroEtv = detprocNombreCajeroEtv;
		}
		/**
		 * @return the detprocFecBpf
		 */
		public Integer getDetprocFecBpf() {
			return detprocFecBpf;
		}
		/**
		 * @param detprocFecBpf the detprocFecBpf to set
		 */
		public void setDetprocFecBpf(Integer detprocFecBpf) {
			this.detprocFecBpf = detprocFecBpf;
		}
		/**
		 * @return the detprocFolioSam
		 */
		public Integer getDetprocFolioSam() {
			return detprocFolioSam;
		}
		/**
		 * @param detprocFolioSam the detprocFolioSam to set
		 */
		public void setDetprocFolioSam(Integer detprocFolioSam) {
			this.detprocFolioSam = detprocFolioSam;
		}
		/**
		 * @return the detprocEfectivoIntegrCaja
		 */
		public Short getDetprocEfectivoIntegrCaja() {
			return detprocEfectivoIntegrCaja;
		}
		/**
		 * @param detprocEfectivoIntegrCaja the detprocEfectivoIntegrCaja to set
		 */
		public void setDetprocEfectivoIntegrCaja(Short detprocEfectivoIntegrCaja) {
			this.detprocEfectivoIntegrCaja = detprocEfectivoIntegrCaja;
		}
		/**
		 * @return the detprocTransmisionS500
		 */
		public Short getDetprocTransmisionS500() {
			return detprocTransmisionS500;
		}
		/**
		 * @param detprocTransmisionS500 the detprocTransmisionS500 to set
		 */
		public void setDetprocTransmisionS500(Short detprocTransmisionS500) {
			this.detprocTransmisionS500 = detprocTransmisionS500;
		}
		/**
		 * @return the tipoMovimiento
		 */
		public Short getTipoMovimiento() {
			return tipoMovimiento;
		}
		/**
		 * @param tipoMovimiento the tipoMovimiento to set
		 */
		public void setTipoMovimiento(Short tipoMovimiento) {
			this.tipoMovimiento = tipoMovimiento;
		}
		/**
		 * @return the tipoDeOperacion
		 */
		public Short getTipoDeOperacion() {
			return tipoDeOperacion;
		}
		/**
		 * @param tipoDeOperacion the tipoDeOperacion to set
		 */
		public void setTipoDeOperacion(Short tipoDeOperacion) {
			this.tipoDeOperacion = tipoDeOperacion;
		}
		/**
		 * @return the cabceraInterfProcdoraTotls
		 */
		public CabceraInterfProcdoraTotls getCabceraInterfProcdoraTotls() {
			return cabceraInterfProcdoraTotls;
		}
		/**
		 * @param cabceraInterfProcdoraTotls the cabceraInterfProcdoraTotls to set
		 */
		public void setCabceraInterfProcdoraTotls(
				CabceraInterfProcdoraTotls cabceraInterfProcdoraTotls) {
			this.cabceraInterfProcdoraTotls = cabceraInterfProcdoraTotls;
		}
		/**
		 * @return the bancoIdn
		 */
		public Short getBancoIdn() {
			return bancoIdn;
		}
		/**
		 * @param bancoIdn the bancoIdn to set
		 */
		public void setBancoIdn(Short bancoIdn) {
			this.bancoIdn = bancoIdn;
		}
		/**
		 * @return the detprocDetallprocIdn
		 */
		public int getDetprocDetallprocIdn() {
			return detprocDetallprocIdn;
		}
		/**
		 * @param detprocDetallprocIdn the detprocDetallprocIdn to set
		 */
		public void setDetprocDetallprocIdn(int detprocDetallprocIdn) {
			this.detprocDetallprocIdn = detprocDetallprocIdn;
		}
		/**
		 * @return the tipomovIdn
		 */
		public short getTipomovIdn() {
			return tipomovIdn;
		}
		/**
		 * @param tipomovIdn the tipomovIdn to set
		 */
		public void setTipomovIdn(short tipomovIdn) {
			this.tipomovIdn = tipomovIdn;
		}
		/**
		 * @return the estructraSirh
		 */
		public int getEstructraSirh() {
			return estructraSirh;
		}
		/**
		 * @param estructraSirh the estructraSirh to set
		 */
		public void setEstructraSirh(int estructraSirh) {
			this.estructraSirh = estructraSirh;
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
		 * @return the hdInterprocNumCorte
		 */
		public short getHdInterprocNumCorte() {
			return hdInterprocNumCorte;
		}
		/**
		 * @param hdInterprocNumCorte the hdInterprocNumCorte to set
		 */
		public void setHdInterprocNumCorte(short hdInterprocNumCorte) {
			this.hdInterprocNumCorte = hdInterprocNumCorte;
		}
		/**
		 * @return the hdInterprocFecContable
		 */
		public Date getHdInterprocFecContable() {
			return hdInterprocFecContable;
		}
		/**
		 * @param hdInterprocFecContable the hdInterprocFecContable to set
		 */
		public void setHdInterprocFecContable(Date hdInterprocFecContable) {
			this.hdInterprocFecContable = hdInterprocFecContable;
		}
	    
}

