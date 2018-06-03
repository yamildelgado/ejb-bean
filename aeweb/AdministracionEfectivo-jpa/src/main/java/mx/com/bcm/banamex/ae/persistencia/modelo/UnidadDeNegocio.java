/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "UNIDAD_DE_NEGOCIO")
@NamedQueries({
    @NamedQuery(name = "UnidadDeNegocio.findAll", query = "SELECT u FROM UnidadDeNegocio u"),
    @NamedQuery(name = "UnidadDeNegocio.findByCpaesEstructuraSirhIdn", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unidadDeNegocioPK.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "UnidadDeNegocio.findByCntrtoNum", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unidadDeNegocioPK.cntrtoNum = :cntrtoNum"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegId", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unidadDeNegocioPK.unegId = :unegId"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegTipoInstrumento", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegTipoInstrumento = :unegTipoInstrumento"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegNombre", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegNombre = :unegNombre"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegCalleNum", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegCalleNum = :unegCalleNum"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegColonia", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegColonia = :unegColonia"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegDeleg", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegDeleg = :unegDeleg"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegCp", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegCp = :unegCp"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegEstado", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegEstado = :unegEstado"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegNivDificultad", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegNivDificultad = :unegNivDificultad"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegHorarioRecepcion", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegHorarioRecepcion = :unegHorarioRecepcion"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegSucEntregaFichas", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegSucEntregaFichas = :unegSucEntregaFichas"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegEntregaFichas", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegEntregaFichas = :unegEntregaFichas"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegStatus", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegStatus = :unegStatus"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegBajaLogica", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegBajaLogica = :unegBajaLogica"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegFecUltActualUnidad", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegFecUltActualUnidad = :unegFecUltActualUnidad"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegFecUltActualContrato", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegFecUltActualContrato = :unegFecUltActualContrato"),
    @NamedQuery(name = "UnidadDeNegocio.findByUnegFecUltActualCuentas", query = "SELECT u FROM UnidadDeNegocio u WHERE u.unegFecUltActualCuentas = :unegFecUltActualCuentas")})
public class UnidadDeNegocio implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnidadDeNegocioPK unidadDeNegocioPK;
    @Column(name = "UNEG_TIPO_INSTRUMENTO")
    private Short unegTipoInstrumento;
    @Column(name = "UNEG_NOMBRE")
    private String unegNombre;
    @Column(name = "UNEG_CALLE_NUM")
    private String unegCalleNum;
    @Column(name = "UNEG_COLONIA")
    private String unegColonia;
    @Column(name = "UNEG_DELEG")
    private String unegDeleg;
    @Column(name = "UNEG_CP")
    private Integer unegCp;
    @Column(name = "UNEG_ESTADO")
    private Short unegEstado;
    @Column(name = "UNEG_NIV_DIFICULTAD")
    private Short unegNivDificultad;
    @Column(name = "UNEG_HORARIO_RECEPCION")
    private Integer unegHorarioRecepcion;
    @Column(name = "UNEG_SUC_ENTREGA_FICHAS")
    private Short unegSucEntregaFichas;
    @Column(name = "UNEG_ENTREGA_FICHAS")
    private String unegEntregaFichas;
    @Column(name = "UNEG_STATUS")
    private Short unegStatus;
    @Column(name = "UNEG_BAJA_LOGICA")
    private String unegBajaLogica;
    @Column(name = "UNEG_FEC_ULT_ACTUAL_UNIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unegFecUltActualUnidad;
    @Column(name = "UNEG_FEC_ULT_ACTUAL_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unegFecUltActualContrato;
    @Column(name = "UNEG_FEC_ULT_ACTUAL_CUENTAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unegFecUltActualCuentas;
    @JoinColumn(name = "CNTRTO_NUM", referencedColumnName = "CNTRTO_NUM", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contrato contrato;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cpae cpae;
    @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")
    @ManyToOne
    private Etv etvIdn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadDeNegocio")
    private List<Comprobante> comprobanteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadDeNegocio")
    private List<SolicitudDotacion> solicitudDotacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadDeNegocio")
    private List<Cuenta> cuentaList;

    public UnidadDeNegocio() {
    }

    public UnidadDeNegocio(UnidadDeNegocioPK unidadDeNegocioPK) {
        this.unidadDeNegocioPK = unidadDeNegocioPK;
    }

    public UnidadDeNegocio(int cpaesEstructuraSirhIdn, String cntrtoNum, short unegId) {
        this.unidadDeNegocioPK = new UnidadDeNegocioPK(cpaesEstructuraSirhIdn, cntrtoNum, unegId);
    }

    public UnidadDeNegocioPK getUnidadDeNegocioPK() {
        return unidadDeNegocioPK;
    }

    public void setUnidadDeNegocioPK(UnidadDeNegocioPK unidadDeNegocioPK) {
        this.unidadDeNegocioPK = unidadDeNegocioPK;
    }

    public Short getUnegTipoInstrumento() {
        return unegTipoInstrumento;
    }

    public void setUnegTipoInstrumento(Short unegTipoInstrumento) {
        this.unegTipoInstrumento = unegTipoInstrumento;
    }

    public String getUnegNombre() {
        return unegNombre;
    }

    public void setUnegNombre(String unegNombre) {
        this.unegNombre = unegNombre;
    }

    public String getUnegCalleNum() {
        return unegCalleNum;
    }

    public void setUnegCalleNum(String unegCalleNum) {
        this.unegCalleNum = unegCalleNum;
    }

    public String getUnegColonia() {
        return unegColonia;
    }

    public void setUnegColonia(String unegColonia) {
        this.unegColonia = unegColonia;
    }

    public String getUnegDeleg() {
        return unegDeleg;
    }

    public void setUnegDeleg(String unegDeleg) {
        this.unegDeleg = unegDeleg;
    }

    public Integer getUnegCp() {
        return unegCp;
    }

    public void setUnegCp(Integer unegCp) {
        this.unegCp = unegCp;
    }

    public Short getUnegEstado() {
        return unegEstado;
    }

    public void setUnegEstado(Short unegEstado) {
        this.unegEstado = unegEstado;
    }

    public Short getUnegNivDificultad() {
        return unegNivDificultad;
    }

    public void setUnegNivDificultad(Short unegNivDificultad) {
        this.unegNivDificultad = unegNivDificultad;
    }

    public Integer getUnegHorarioRecepcion() {
        return unegHorarioRecepcion;
    }

    public void setUnegHorarioRecepcion(Integer unegHorarioRecepcion) {
        this.unegHorarioRecepcion = unegHorarioRecepcion;
    }

    public Short getUnegSucEntregaFichas() {
        return unegSucEntregaFichas;
    }

    public void setUnegSucEntregaFichas(Short unegSucEntregaFichas) {
        this.unegSucEntregaFichas = unegSucEntregaFichas;
    }

    public String getUnegEntregaFichas() {
        return unegEntregaFichas;
    }

    public void setUnegEntregaFichas(String unegEntregaFichas) {
        this.unegEntregaFichas = unegEntregaFichas;
    }

    public Short getUnegStatus() {
        return unegStatus;
    }

    public void setUnegStatus(Short unegStatus) {
        this.unegStatus = unegStatus;
    }

    public String getUnegBajaLogica() {
        return unegBajaLogica;
    }

    public void setUnegBajaLogica(String unegBajaLogica) {
        this.unegBajaLogica = unegBajaLogica;
    }

    public Date getUnegFecUltActualUnidad() {
        return unegFecUltActualUnidad;
    }

    public void setUnegFecUltActualUnidad(Date unegFecUltActualUnidad) {
        this.unegFecUltActualUnidad = unegFecUltActualUnidad;
    }

    public Date getUnegFecUltActualContrato() {
        return unegFecUltActualContrato;
    }

    public void setUnegFecUltActualContrato(Date unegFecUltActualContrato) {
        this.unegFecUltActualContrato = unegFecUltActualContrato;
    }

    public Date getUnegFecUltActualCuentas() {
        return unegFecUltActualCuentas;
    }

    public void setUnegFecUltActualCuentas(Date unegFecUltActualCuentas) {
        this.unegFecUltActualCuentas = unegFecUltActualCuentas;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Cpae getCpae() {
        return cpae;
    }

    public void setCpae(Cpae cpae) {
        this.cpae = cpae;
    }

    public Etv getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(Etv etvIdn) {
        this.etvIdn = etvIdn;
    }

    public List<Comprobante> getComprobanteList() {
        return comprobanteList;
    }

    public void setComprobanteList(List<Comprobante> comprobanteList) {
        this.comprobanteList = comprobanteList;
    }

    public List<SolicitudDotacion> getSolicitudDotacionList() {
        return solicitudDotacionList;
    }

    public void setSolicitudDotacionList(List<SolicitudDotacion> solicitudDotacionList) {
        this.solicitudDotacionList = solicitudDotacionList;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unidadDeNegocioPK != null ? unidadDeNegocioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadDeNegocio)) {
            return false;
        }
        UnidadDeNegocio other = (UnidadDeNegocio) object;
        if ((this.unidadDeNegocioPK == null && other.unidadDeNegocioPK != null) || (this.unidadDeNegocioPK != null && !this.unidadDeNegocioPK.equals(other.unidadDeNegocioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio[unidadDeNegocioPK=" + unidadDeNegocioPK + "]";
    }

}
