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
import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */


public class UnidadDeNegocioVO implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	   private String bajaLogica;
	    private String  calle;
	    private String calleNum;
	    private String  ciaTraslado;
	    private String colonia;
	    private String cp;
	    private Integer cveCshPolicy;
	    private String deleg;
	    private String deposito;
	    private BigDecimal difsPermitidas;
	    private String dotacion;
	    private String entregaFichas;
	    private Short estado;
	    private String fecAltaDep;
	    private String fecAltaDot;
	    private String fecCancel;
	    private String fecVenc;
	    private String  horaRecepcion;
	    private Integer horarioRecepcion;
	    private List<CuentaVO> listaCuenta;
	    private Short nivDificultad;
	    private String nombre;
	    private String  nombreCliente;
	    private String numContrato;
	    private String  rfc;
	    private Integer sirhIdn;
	    private String status;
	    private  String sucEntregaFichas;
	    private Short sucursalFicha;
	    private String  tel1;
	    private String  tel2;
	    private String tipoInstrumento;
	    private Short tipProcBill;
	    private BigDecimal  tipProcMon;
	    protected UnidadDeNegocioPK unidadDeNegocioPK;
		
	    private Integer cpaesEstructuraSirhIdn;
	    /**
		 * @return the bajaLogica
		 */
	    
	    
		public String getBajaLogica() {
			return bajaLogica;
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
		 * @return the calle
		 */
		public String getCalle() {
			return calle;
		}
		/**
		 * @return the calleNum
		 */
		public String getCalleNum() {
			return calleNum;
		}
		/**
		 * @return the ciaTraslado
		 */
		public String getCiaTraslado() {
			return ciaTraslado;
		}
		/**
		 * @return the colonia
		 */
		public String getColonia() {
			return colonia;
		}
		/**
		 * @return the cp
		 */
		public String getCp() {
			return cp;
		}
		/**
		 * @return the cveCshPolicy
		 */
		public Integer getCveCshPolicy() {
			return cveCshPolicy;
		}
		/**
		 * @return the deleg
		 */
		public String getDeleg() {
			return deleg;
		}
		/**
		 * @return the deposito
		 */
		public String getDeposito() {
			return deposito;
		}
		/**
		 * @return the difsPermitidas
		 */
		public BigDecimal getDifsPermitidas() {
			return difsPermitidas;
		}
		/**
		 * @return the dotacion
		 */
		public String getDotacion() {
			return dotacion;
		}
		/**
		 * @return the entregaFichas
		 */
		public String getEntregaFichas() {
			return entregaFichas;
		}
		/**
		 * @return the entregarFichas
		 */
		
		/**
		 * @return the estado
		 */
		public Short getEstado() {
			return estado;
		}
		/**
		 * @return the fecAltaDep
		 */
		public String getFecAltaDep() {
			return fecAltaDep;
		}
		/**
		 * @return the fecAltaDot
		 */
		public String getFecAltaDot() {
			return fecAltaDot;
		}
		/**
		 * @return the fecCancel
		 */
		public String getFecCancel() {
			return fecCancel;
		}
		/**
		 * @return the fecVenc
		 */
		public String getFecVenc() {
			return fecVenc;
		}
		/**
		 * @return the horaRecepcion
		 */
		public String getHoraRecepcion() {
			return horaRecepcion;
		}
		/**
		 * @return the horarioRecepcion
		 */
		public Integer getHorarioRecepcion() {
			return horarioRecepcion;
		}
		/**
		 * @return the listaCuenta
		 */
		public List<CuentaVO> getListaCuenta() {
			return listaCuenta;
		}
		/**
		 * @return the nivDificultad
		 */
		public Short getNivDificultad() {
			return nivDificultad;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @return the nombreCliente
		 */
		public String getNombreCliente() {
			return nombreCliente;
		}
		/**
		 * @return the numContrato
		 */
		public String getNumContrato() {
			return numContrato;
		}
		/**
		 * @return the rfc
		 */
		public String getRfc() {
			return rfc;
		}
		/**
		 * @return the sirhIdn
		 */
		public Integer getSirhIdn() {
			return sirhIdn;
		}
		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}
		/**
		 * @return the sucEntregaFichas
		 */
		public  String getSucEntregaFichas() {
			return sucEntregaFichas;
		}
		/**
		 * @return the sucursalFicha
		 */
		public Short getSucursalFicha() {
			return sucursalFicha;
		}
		/**
		 * @return the tel1
		 */
		public String getTel1() {
			return tel1;
		}
		/**
		 * @return the tel2
		 */
		public String getTel2() {
			return tel2;
		}
		/**
		 * @return the tipoInstrumento
		 */
		public String getTipoInstrumento() {
			return tipoInstrumento;
		}
		/**
		 * @return the tipProcBill
		 */
		public Short getTipProcBill() {
			return tipProcBill;
		}
		/**
		 * @return the tipProcMon
		 */
		public BigDecimal getTipProcMon() {
			return tipProcMon;
		}
		/**
		 * @return the unidadDeNegocioPK
		 */
		public UnidadDeNegocioPK getUnidadDeNegocioPK() {
			return unidadDeNegocioPK;
		}
		/**
		 * @param bajaLogica the bajaLogica to set
		 */
		public void setBajaLogica(String bajaLogica) {
			this.bajaLogica = bajaLogica;
		}
		/**
		 * @param calle the calle to set
		 */
		public void setCalle(String calle) {
			this.calle = calle;
		}
		/**
		 * @param calleNum the calleNum to set
		 */
		public void setCalleNum(String calleNum) {
			this.calleNum = calleNum;
		}
		/**
		 * @param ciaTraslado the ciaTraslado to set
		 */
		public void setCiaTraslado(String ciaTraslado) {
			this.ciaTraslado = ciaTraslado;
		}
		/**
		 * @param colonia the colonia to set
		 */
		public void setColonia(String colonia) {
			this.colonia = colonia;
		}
		/**
		 * @param cp the cp to set
		 */
		public void setCp(String cp) {
			this.cp = cp;
		}
		/**
		 * @param cveCshPolicy the cveCshPolicy to set
		 */
		public void setCveCshPolicy(Integer cveCshPolicy) {
			this.cveCshPolicy = cveCshPolicy;
		}
		/**
		 * @param deleg the deleg to set
		 */
		public void setDeleg(String deleg) {
			this.deleg = deleg;
		}
		/**
		 * @param deposito the deposito to set
		 */
		public void setDeposito(String deposito) {
			this.deposito = deposito;
		}
		/**
		 * @param difsPermitidas the difsPermitidas to set
		 */
		public void setDifsPermitidas(BigDecimal difsPermitidas) {
			this.difsPermitidas = difsPermitidas;
		}
		/**
		 * @param dotacion the dotacion to set
		 */
		public void setDotacion(String dotacion) {
			this.dotacion = dotacion;
		}
		/**
		 * @param entregaFichas the entregaFichas to set
		 */
		public void setEntregaFichas(String entregaFichas) {
			this.entregaFichas = entregaFichas;
		}
		
		
		/**
		 * @param estado the estado to set
		 */
		public void setEstado(Short estado) {
			this.estado = estado;
		}
		/**
		 * @param fecAltaDep the fecAltaDep to set
		 */
		public void setFecAltaDep(String fecAltaDep) {
			this.fecAltaDep = fecAltaDep;
		}
		/**
		 * @param fecAltaDot the fecAltaDot to set
		 */
		public void setFecAltaDot(String fecAltaDot) {
			this.fecAltaDot = fecAltaDot;
		}
		/**
		 * @param fecCancel the fecCancel to set
		 */
		public void setFecCancel(String fecCancel) {
			this.fecCancel = fecCancel;
		}
		/**
		 * @param fecVenc the fecVenc to set
		 */
		public void setFecVenc(String fecVenc) {
			this.fecVenc = fecVenc;
		}
		/**
		 * @param horaRecepcion the horaRecepcion to set
		 */
		public void setHoraRecepcion(String horaRecepcion) {
			this.horaRecepcion = horaRecepcion;
		}
		/**
		 * @param horarioRecepcion the horarioRecepcion to set
		 */
		public void setHorarioRecepcion(Integer horarioRecepcion) {
			this.horarioRecepcion = horarioRecepcion;
		}
		/**
		 * @param listaCuenta the listaCuenta to set
		 */
		public void setListaCuenta(List<CuentaVO> listaCuenta) {
			this.listaCuenta = listaCuenta;
		}
		/**
		 * @param nivDificultad the nivDificultad to set
		 */
		public void setNivDificultad(Short nivDificultad) {
			this.nivDificultad = nivDificultad;
		}
		
		
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @param nombreCliente the nombreCliente to set
		 */
		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}
		/**
		 * @param numContrato the numContrato to set
		 */
		public void setNumContrato(String numContrato) {
			this.numContrato = numContrato;
		}
		/**
		 * @param rfc the rfc to set
		 */
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}
		/**
		 * @param sirhIdn the sirhIdn to set
		 */
		public void setSirhIdn(Integer sirhIdn) {
			this.sirhIdn = sirhIdn;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}
		/**
		 * @param sucEntregaFichas the sucEntregaFichas to set
		 */
		public void setSucEntregaFichas( String sucEntregaFichas) {
			this.sucEntregaFichas = sucEntregaFichas;
		}
		/**
		 * @param sucursalFicha the sucursalFicha to set
		 */
		public void setSucursalFicha(Short sucursalFicha) {
			this.sucursalFicha = sucursalFicha;
		}
		/**
		 * @param tel1 the tel1 to set
		 */
		public void setTel1(String tel1) {
			this.tel1 = tel1;
		}
		/**
		 * @param tel2 the tel2 to set
		 */
		public void setTel2(String tel2) {
			this.tel2 = tel2;
		}
		/**
		 * @param tipoInstrumento the tipoInstrumento to set
		 */
		public void setTipoInstrumento(String tipoInstrumento) {
			this.tipoInstrumento = tipoInstrumento;
		}
		/**
		 * @param tipProcBill the tipProcBill to set
		 */
		public void setTipProcBill(Short tipProcBill) {
			this.tipProcBill = tipProcBill;
		}
		/**
		 * @param tipProcMon the tipProcMon to set
		 */
		public void setTipProcMon(BigDecimal tipProcMon) {
			this.tipProcMon = tipProcMon;
		}
		/**
		 * @param unidadDeNegocioPK the unidadDeNegocioPK to set
		 */
		public void setUnidadDeNegocioPK(UnidadDeNegocioPK unidadDeNegocioPK) {
			this.unidadDeNegocioPK = unidadDeNegocioPK;
		} 
	    
		
		
		
		
	    
	    
}
