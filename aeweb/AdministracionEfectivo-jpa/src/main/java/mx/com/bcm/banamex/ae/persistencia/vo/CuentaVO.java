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

import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public class CuentaVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String divisaMonedaId;
	private Short indicadorAsociado;
	private String tipoInstrumento;

	private Short idCuentaAsociado;

	private short cpaeId;

	private long contratoId;

	private short unidadnegocioId;

	private String tipoServicioCuenta;

	private Short usoCuenta;

	private String tipoCuenta;

	private String usoCuenta1;

	private String claveOperativaDePagos;

	private String referencia1Tipo;

	private String referencia1Mascara;

	private String referencia2Tipo;

	private String referencia2Mascara;

	private String  referencia3Tipo;

	private String referencia3Mascara;

	private String  referencia4Tipo;

	private String referencia4Mascara;
	private String fechaAltaCuenta;
	
    private CuentaPK cuentaPK;
   
    private String bajaLogica;
	

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

	/**
	 * @return the idCuentaAsociado
	 */
	public Short getIdCuentaAsociado() {
		return idCuentaAsociado;
	}

	/**
	 * @param idCuentaAsociado the idCuentaAsociado to set
	 */
	public void setIdCuentaAsociado(Short idCuentaAsociado) {
		this.idCuentaAsociado = idCuentaAsociado;
	}

	/**
	 * @return the cpaeId
	 */
	public short getCpaeId() {
		return cpaeId;
	}

	/**
	 * @param cpaeId the cpaeId to set
	 */
	public void setCpaeId(short cpaeId) {
		this.cpaeId = cpaeId;
	}

	/**
	 * @return the contratoId
	 */
	public long getContratoId() {
		return contratoId;
	}

	/**
	 * @param contratoId the contratoId to set
	 */
	public void setContratoId(long contratoId) {
		this.contratoId = contratoId;
	}

	/**
	 * @return the unidadnegocioId
	 */
	public short getUnidadnegocioId() {
		return unidadnegocioId;
	}

	/**
	 * @param unidadnegocioId the unidadnegocioId to set
	 */
	public void setUnidadnegocioId(short unidadnegocioId) {
		this.unidadnegocioId = unidadnegocioId;
	}

	/**
	 * @return the tipoServicioCuenta
	 */
	public String getTipoServicioCuenta() {
		return tipoServicioCuenta;
	}

	/**
	 * @param tipoServicioCuenta the tipoServicioCuenta to set
	 */
	public void setTipoServicioCuenta(String tipoServicioCuenta) {
		this.tipoServicioCuenta = tipoServicioCuenta;
	}

	/**
	 * @return the usoCuenta
	 */
	public Short getUsoCuenta() {
		return usoCuenta;
	}

	/**
	 * @param usoCuenta the usoCuenta to set
	 */
	public void setUsoCuenta(Short usoCuenta) {
		this.usoCuenta = usoCuenta;
	}

	/**
	 * @return the tipoCuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}

	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	/**
	 * @return the usoCuenta1
	 */
	public String getUsoCuenta1() {
		return usoCuenta1;
	}

	/**
	 * @param usoCuenta1 the usoCuenta1 to set
	 */
	public void setUsoCuenta1(String usoCuenta1) {
		this.usoCuenta1 = usoCuenta1;
	}

	/**
	 * @return the claveOperativaDePagos
	 */
	public String getClaveOperativaDePagos() {
		return claveOperativaDePagos;
	}

	/**
	 * @param claveOperativaDePagos the claveOperativaDePagos to set
	 */
	public void setClaveOperativaDePagos(String claveOperativaDePagos) {
		this.claveOperativaDePagos = claveOperativaDePagos;
	}

	

	/**
	 * @return the referencia1Mascara
	 */
	public String getReferencia1Mascara() {
		return referencia1Mascara;
	}

	/**
	 * @param referencia1Mascara the referencia1Mascara to set
	 */
	public void setReferencia1Mascara(String referencia1Mascara) {
		this.referencia1Mascara = referencia1Mascara;
	}

	

	/**
	 * @return the referencia2Mascara
	 */
	public String getReferencia2Mascara() {
		return referencia2Mascara;
	}

	/**
	 * @param referencia2Mascara the referencia2Mascara to set
	 */
	public void setReferencia2Mascara(String referencia2Mascara) {
		this.referencia2Mascara = referencia2Mascara;
	}

	

	/**
	 * @return the referencia3Mascara
	 */
	public String getReferencia3Mascara() {
		return referencia3Mascara;
	}

	/**
	 * @param referencia3Mascara the referencia3Mascara to set
	 */
	public void setReferencia3Mascara(String referencia3Mascara) {
		this.referencia3Mascara = referencia3Mascara;
	}

	

	/**
	 * @return the referencia4Mascara
	 */
	public String getReferencia4Mascara() {
		return referencia4Mascara;
	}

	/**
	 * @param referencia4Mascara the referencia4Mascara to set
	 */
	public void setReferencia4Mascara(String referencia4Mascara) {
		this.referencia4Mascara = referencia4Mascara;
	}

	/**
	 * @return the fechaAltaCuenta
	 */
	public String getFechaAltaCuenta() {
		return fechaAltaCuenta;
	}

	/**
	 * @param fechaAltaCuenta the fechaAltaCuenta to set
	 */
	public void setFechaAltaCuenta(String fechaAltaCuenta) {
		this.fechaAltaCuenta = fechaAltaCuenta;
	}

	/**
	 * @return the cuentaPK
	 */
	public CuentaPK getCuentaPK() {
		return cuentaPK;
	}

	/**
	 * @param cuentaPK the cuentaPK to set
	 */
	public void setCuentaPK(CuentaPK cuentaPK) {
		this.cuentaPK = cuentaPK;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the divisaMonedaId
	 */
	public String getDivisaMonedaId() {
		return divisaMonedaId;
	}

	/**
	 * @param divisaMonedaId the divisaMonedaId to set
	 */
	public void setDivisaMonedaId(String divisaMonedaId) {
		this.divisaMonedaId = divisaMonedaId;
	}

	

	

	

	/**
	 * @return the indicadorAsociado
	 */
	public Short getIndicadorAsociado() {
		return indicadorAsociado;
	}

	/**
	 * @param indicadorAsociado the indicadorAsociado to set
	 */
	public void setIndicadorAsociado(Short indicadorAsociado) {
		this.indicadorAsociado = indicadorAsociado;
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
	 * @return the referencia1Tipo
	 */
	public String getReferencia1Tipo() {
		return referencia1Tipo;
	}

	/**
	 * @param referencia1Tipo the referencia1Tipo to set
	 */
	public void setReferencia1Tipo(String referencia1Tipo) {
		this.referencia1Tipo = referencia1Tipo;
	}

	/**
	 * @return the referencia2Tipo
	 */
	public String getReferencia2Tipo() {
		return referencia2Tipo;
	}

	/**
	 * @param referencia2Tipo the referencia2Tipo to set
	 */
	public void setReferencia2Tipo(String referencia2Tipo) {
		this.referencia2Tipo = referencia2Tipo;
	}

	/**
	 * @return the referencia3Tipo
	 */
	public String getReferencia3Tipo() {
		return referencia3Tipo;
	}

	/**
	 * @param referencia3Tipo the referencia3Tipo to set
	 */
	public void setReferencia3Tipo(String referencia3Tipo) {
		this.referencia3Tipo = referencia3Tipo;
	}

	/**
	 * @return the referencia4Tipo
	 */
	public String getReferencia4Tipo() {
		return referencia4Tipo;
	}

	/**
	 * @param referencia4Tipo the referencia4Tipo to set
	 */
	public void setReferencia4Tipo(String referencia4Tipo) {
		this.referencia4Tipo = referencia4Tipo;
	}

	
	
}
