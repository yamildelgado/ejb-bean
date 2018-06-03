/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "COMPROBANTE")
@NamedQueries({
    @NamedQuery(name = "Comprobante.findAll", query = "SELECT c FROM Comprobante c"),
    @NamedQuery(name = "Comprobante.findByCompbteId", query = "SELECT c FROM Comprobante c WHERE c.comprobantePK.compbteId = :compbteId"),
    @NamedQuery(name = "Comprobante.findByEtvIdn", query = "SELECT c FROM Comprobante c WHERE c.comprobantePK.etvIdn = :etvIdn"),
    @NamedQuery(name = "Comprobante.findByCompbteFecHrVerificacion", query = "SELECT c FROM Comprobante c WHERE c.compbteFecHrVerificacion = :compbteFecHrVerificacion"),
    @NamedQuery(name = "Comprobante.findByCompbteFecAsign", query = "SELECT c FROM Comprobante c WHERE c.compbteFecAsign = :compbteFecAsign"),
    @NamedQuery(name = "Comprobante.findByCompbteImpteTot", query = "SELECT c FROM Comprobante c WHERE c.compbteImpteTot = :compbteImpteTot"),
    @NamedQuery(name = "Comprobante.findByCompbteNumEnvases", query = "SELECT c FROM Comprobante c WHERE c.compbteNumEnvases = :compbteNumEnvases"),
    @NamedQuery(name = "Comprobante.findByCompbteReasignado", query = "SELECT c FROM Comprobante c WHERE c.compbteReasignado = :compbteReasignado"),
    @NamedQuery(name = "Comprobante.findByCompbteNivelDificultad", query = "SELECT c FROM Comprobante c WHERE c.compbteNivelDificultad = :compbteNivelDificultad")})
public class Comprobante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprobantePK comprobantePK;
    @Column(name = "COMPBTE_FEC_HR_VERIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compbteFecHrVerificacion;
    @Column(name = "COMPBTE_FEC_ASIGN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compbteFecAsign;
    @Column(name = "COMPBTE_IMPTE_TOT")
    private BigDecimal compbteImpteTot;
    @Column(name = "COMPBTE_NUM_ENVASES")
    private Short compbteNumEnvases;
    @Column(name = "COMPBTE_REASIGNADO")
    private Short compbteReasignado;
    @Column(name = "COMPBTE_NIVEL_DIFICULTAD")
    private Short compbteNivelDificultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobante")
    private List<Envase> envaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobante")
    private List<Diferencia> diferenciaList;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "LOTE_IDN", referencedColumnName = "LOTE_IDN")
    @ManyToOne
    private Lote loteIdn;
    @JoinColumns({
        @JoinColumn(name = "RECEP_FEC_HR_INI", referencedColumnName = "RECEP_FEC_HR_INI"),
        @JoinColumn(name = "RECEP_CAJA_IDN", referencedColumnName = "CAJA_IDN"),
        @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Recepcion recepcion;
    @JoinColumns({
        @JoinColumn(name = "TIPOPER_IDN", referencedColumnName = "TIPOPER_IDN"),
        @JoinColumn(name = "TENTIDAD_IDN", referencedColumnName = "TENTIDAD_IDN")})
    @ManyToOne
    private TipoDeOperacion tipoDeOperacion;
    @JoinColumns({
        @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN"),
        @JoinColumn(name = "CNTRTO_NUM", referencedColumnName = "CNTRTO_NUM"),
        @JoinColumn(name = "UNEG_ID", referencedColumnName = "UNEG_ID")})
    @ManyToOne(optional = false)
    private UnidadDeNegocio unidadDeNegocio;
    @JoinColumns({
        @JoinColumn(name = "VERIFN_CAJA_IDN", referencedColumnName = "CAJA_IDN"),
        @JoinColumn(name = "VERIFN_FEC_HR_INI", referencedColumnName = "VERIFN_FEC_HR_INI")})
    @ManyToOne(optional = false)
    private Verificacion verificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobante")
    private List<MovimientosS018> movimientosS018List;

    public Comprobante() {
    }

    public Comprobante(ComprobantePK comprobantePK) {
        this.comprobantePK = comprobantePK;
    }

    public Comprobante(String compbteId, short etvIdn) {
        this.comprobantePK = new ComprobantePK(compbteId, etvIdn);
    }

    public ComprobantePK getComprobantePK() {
        return comprobantePK;
    }

    public void setComprobantePK(ComprobantePK comprobantePK) {
        this.comprobantePK = comprobantePK;
    }

    public Date getCompbteFecHrVerificacion() {
        return compbteFecHrVerificacion;
    }

    public void setCompbteFecHrVerificacion(Date compbteFecHrVerificacion) {
        this.compbteFecHrVerificacion = compbteFecHrVerificacion;
    }

    public Date getCompbteFecAsign() {
        return compbteFecAsign;
    }

    public void setCompbteFecAsign(Date compbteFecAsign) {
        this.compbteFecAsign = compbteFecAsign;
    }

    public BigDecimal getCompbteImpteTot() {
        return compbteImpteTot;
    }

    public void setCompbteImpteTot(BigDecimal compbteImpteTot) {
        this.compbteImpteTot = compbteImpteTot;
    }

    public Short getCompbteNumEnvases() {
        return compbteNumEnvases;
    }

    public void setCompbteNumEnvases(Short compbteNumEnvases) {
        this.compbteNumEnvases = compbteNumEnvases;
    }

    public Short getCompbteReasignado() {
        return compbteReasignado;
    }

    public void setCompbteReasignado(Short compbteReasignado) {
        this.compbteReasignado = compbteReasignado;
    }

    public Short getCompbteNivelDificultad() {
        return compbteNivelDificultad;
    }

    public void setCompbteNivelDificultad(Short compbteNivelDificultad) {
        this.compbteNivelDificultad = compbteNivelDificultad;
    }

    public List<Envase> getEnvaseList() {
        return envaseList;
    }

    public void setEnvaseList(List<Envase> envaseList) {
        this.envaseList = envaseList;
    }

    public List<Diferencia> getDiferenciaList() {
        return diferenciaList;
    }

    public void setDiferenciaList(List<Diferencia> diferenciaList) {
        this.diferenciaList = diferenciaList;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public Lote getLoteIdn() {
        return loteIdn;
    }

    public void setLoteIdn(Lote loteIdn) {
        this.loteIdn = loteIdn;
    }

    public Recepcion getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(Recepcion recepcion) {
        this.recepcion = recepcion;
    }

    public TipoDeOperacion getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(TipoDeOperacion tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

    public UnidadDeNegocio getUnidadDeNegocio() {
        return unidadDeNegocio;
    }

    public void setUnidadDeNegocio(UnidadDeNegocio unidadDeNegocio) {
        this.unidadDeNegocio = unidadDeNegocio;
    }

    public Verificacion getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(Verificacion verificacion) {
        this.verificacion = verificacion;
    }

    public List<MovimientosS018> getMovimientosS018List() {
        return movimientosS018List;
    }

    public void setMovimientosS018List(List<MovimientosS018> movimientosS018List) {
        this.movimientosS018List = movimientosS018List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comprobantePK != null ? comprobantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprobante)) {
            return false;
        }
        Comprobante other = (Comprobante) object;
        if ((this.comprobantePK == null && other.comprobantePK != null) || (this.comprobantePK != null && !this.comprobantePK.equals(other.comprobantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Comprobante[comprobantePK=" + comprobantePK + "]";
    }

}
