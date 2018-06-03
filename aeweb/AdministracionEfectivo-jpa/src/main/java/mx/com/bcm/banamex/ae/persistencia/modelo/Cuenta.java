/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "CUENTA")
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findByCpaesEstructuraSirhIdn", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "Cuenta.findByCntrtoNum", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.cntrtoNum = :cntrtoNum"),
    @NamedQuery(name = "Cuenta.findByUnegId", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.unegId = :unegId"),
    @NamedQuery(name = "Cuenta.findByCtaSucursalId", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.ctaSucursalId = :ctaSucursalId"),
    @NamedQuery(name = "Cuenta.findByCtaCuenta", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.ctaCuenta = :ctaCuenta"),
    @NamedQuery(name = "Cuenta.findByCtaTipoInstrumento", query = "SELECT c FROM Cuenta c WHERE c.ctaTipoInstrumento = :ctaTipoInstrumento"),
    @NamedQuery(name = "Cuenta.findByCtaIndicadorAsociado", query = "SELECT c FROM Cuenta c WHERE c.ctaIndicadorAsociado = :ctaIndicadorAsociado"),
    @NamedQuery(name = "Cuenta.findByCtaTipoUsoCuenta", query = "SELECT c FROM Cuenta c WHERE c.ctaTipoUsoCuenta = :ctaTipoUsoCuenta"),
    @NamedQuery(name = "Cuenta.findByCtaTipoCuenta", query = "SELECT c FROM Cuenta c WHERE c.ctaTipoCuenta = :ctaTipoCuenta"),
    @NamedQuery(name = "Cuenta.findByCtaClaveOperativaDePagos", query = "SELECT c FROM Cuenta c WHERE c.ctaClaveOperativaDePagos = :ctaClaveOperativaDePagos"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia1Tipo", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia1Tipo = :ctaReferencia1Tipo"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia2Tipo", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia2Tipo = :ctaReferencia2Tipo"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia3Tipo", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia3Tipo = :ctaReferencia3Tipo"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia4Tipo", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia4Tipo = :ctaReferencia4Tipo"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia1Mascara", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia1Mascara = :ctaReferencia1Mascara"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia2Mascara", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia2Mascara = :ctaReferencia2Mascara"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia3Mascara", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia3Mascara = :ctaReferencia3Mascara"),
    @NamedQuery(name = "Cuenta.findByCtaReferencia4Mascara", query = "SELECT c FROM Cuenta c WHERE c.ctaReferencia4Mascara = :ctaReferencia4Mascara"),
    @NamedQuery(name = "Cuenta.findByCtaBajaLogica", query = "SELECT c FROM Cuenta c WHERE c.ctaBajaLogica = :ctaBajaLogica")})
public class Cuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentaPK cuentaPK;
    @Column(name = "CTA_TIPO_INSTRUMENTO")
    private Short ctaTipoInstrumento;
    @Column(name = "CTA_INDICADOR_ASOCIADO")
    private Short ctaIndicadorAsociado;
    @Column(name = "CTA_TIPO_USO_CUENTA")
    private Short ctaTipoUsoCuenta;
    @Column(name = "CTA_TIPO_CUENTA")
    private Short ctaTipoCuenta;
    @Column(name = "CTA_CLAVE_OPERATIVA_DE_PAGOS")
    private String ctaClaveOperativaDePagos;
    @Column(name = "CTA_REFERENCIA_1_TIPO")
    private Short ctaReferencia1Tipo;
    @Column(name = "CTA_REFERENCIA_2_TIPO")
    private Short ctaReferencia2Tipo;
    @Column(name = "CTA_REFERENCIA_3_TIPO")
    private Short ctaReferencia3Tipo;
    @Column(name = "CTA_REFERENCIA_4_TIPO")
    private Short ctaReferencia4Tipo;
    @Column(name = "CTA_REFERENCIA_1_MASCARA")
    private String ctaReferencia1Mascara;
    @Column(name = "CTA_REFERENCIA_2_MASCARA")
    private String ctaReferencia2Mascara;
    @Column(name = "CTA_REFERENCIA_3_MASCARA")
    private String ctaReferencia3Mascara;
    @Column(name = "CTA_REFERENCIA_4_MASCARA")
    private String ctaReferencia4Mascara;
    @Column(name = "CTA_BAJA_LOGICA")
    private String ctaBajaLogica;
    @JoinColumn(name = "DIVISA_ID", referencedColumnName = "DIVISA_ID")
    @ManyToOne
    private Divisa divisaId;
    @JoinColumns({
        @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN", insertable = false, updatable = false),
        @JoinColumn(name = "CNTRTO_NUM", referencedColumnName = "CNTRTO_NUM", insertable = false, updatable = false),
        @JoinColumn(name = "UNEG_ID", referencedColumnName = "UNEG_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private UnidadDeNegocio unidadDeNegocio;

    public Cuenta() {
    }

    public Cuenta(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public Cuenta(int cpaesEstructuraSirhIdn, String cntrtoNum, short unegId, short ctaSucursalId, long ctaCuenta) {
        this.cuentaPK = new CuentaPK(cpaesEstructuraSirhIdn, cntrtoNum, unegId, ctaSucursalId, ctaCuenta);
    }

    public CuentaPK getCuentaPK() {
        return cuentaPK;
    }

    public void setCuentaPK(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public Short getCtaTipoInstrumento() {
        return ctaTipoInstrumento;
    }

    public void setCtaTipoInstrumento(Short ctaTipoInstrumento) {
        this.ctaTipoInstrumento = ctaTipoInstrumento;
    }

    public Short getCtaIndicadorAsociado() {
        return ctaIndicadorAsociado;
    }

    public void setCtaIndicadorAsociado(Short ctaIndicadorAsociado) {
        this.ctaIndicadorAsociado = ctaIndicadorAsociado;
    }

    public Short getCtaTipoUsoCuenta() {
        return ctaTipoUsoCuenta;
    }

    public void setCtaTipoUsoCuenta(Short ctaTipoUsoCuenta) {
        this.ctaTipoUsoCuenta = ctaTipoUsoCuenta;
    }

    public Short getCtaTipoCuenta() {
        return ctaTipoCuenta;
    }

    public void setCtaTipoCuenta(Short ctaTipoCuenta) {
        this.ctaTipoCuenta = ctaTipoCuenta;
    }

    public String getCtaClaveOperativaDePagos() {
        return ctaClaveOperativaDePagos;
    }

    public void setCtaClaveOperativaDePagos(String ctaClaveOperativaDePagos) {
        this.ctaClaveOperativaDePagos = ctaClaveOperativaDePagos;
    }

    public Short getCtaReferencia1Tipo() {
        return ctaReferencia1Tipo;
    }

    public void setCtaReferencia1Tipo(Short ctaReferencia1Tipo) {
        this.ctaReferencia1Tipo = ctaReferencia1Tipo;
    }

    public Short getCtaReferencia2Tipo() {
        return ctaReferencia2Tipo;
    }

    public void setCtaReferencia2Tipo(Short ctaReferencia2Tipo) {
        this.ctaReferencia2Tipo = ctaReferencia2Tipo;
    }

    public Short getCtaReferencia3Tipo() {
        return ctaReferencia3Tipo;
    }

    public void setCtaReferencia3Tipo(Short ctaReferencia3Tipo) {
        this.ctaReferencia3Tipo = ctaReferencia3Tipo;
    }

    public Short getCtaReferencia4Tipo() {
        return ctaReferencia4Tipo;
    }

    public void setCtaReferencia4Tipo(Short ctaReferencia4Tipo) {
        this.ctaReferencia4Tipo = ctaReferencia4Tipo;
    }

    public String getCtaReferencia1Mascara() {
        return ctaReferencia1Mascara;
    }

    public void setCtaReferencia1Mascara(String ctaReferencia1Mascara) {
        this.ctaReferencia1Mascara = ctaReferencia1Mascara;
    }

    public String getCtaReferencia2Mascara() {
        return ctaReferencia2Mascara;
    }

    public void setCtaReferencia2Mascara(String ctaReferencia2Mascara) {
        this.ctaReferencia2Mascara = ctaReferencia2Mascara;
    }

    public String getCtaReferencia3Mascara() {
        return ctaReferencia3Mascara;
    }

    public void setCtaReferencia3Mascara(String ctaReferencia3Mascara) {
        this.ctaReferencia3Mascara = ctaReferencia3Mascara;
    }

    public String getCtaReferencia4Mascara() {
        return ctaReferencia4Mascara;
    }

    public void setCtaReferencia4Mascara(String ctaReferencia4Mascara) {
        this.ctaReferencia4Mascara = ctaReferencia4Mascara;
    }

    public String getCtaBajaLogica() {
        return ctaBajaLogica;
    }

    public void setCtaBajaLogica(String ctaBajaLogica) {
        this.ctaBajaLogica = ctaBajaLogica;
    }

    public Divisa getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(Divisa divisaId) {
        this.divisaId = divisaId;
    }

    public UnidadDeNegocio getUnidadDeNegocio() {
        return unidadDeNegocio;
    }

    public void setUnidadDeNegocio(UnidadDeNegocio unidadDeNegocio) {
        this.unidadDeNegocio = unidadDeNegocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentaPK != null ? cuentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.cuentaPK == null && other.cuentaPK != null) || (this.cuentaPK != null && !this.cuentaPK.equals(other.cuentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta[cuentaPK=" + cuentaPK + "]";
    }

}
