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
@Table(name = "ENVASE")
@NamedQueries({
    @NamedQuery(name = "Envase.findAll", query = "SELECT e FROM Envase e"),
    @NamedQuery(name = "Envase.findByCompbteId", query = "SELECT e FROM Envase e WHERE e.envasePK.compbteId = :compbteId"),
    @NamedQuery(name = "Envase.findByEnvcNumPlomo", query = "SELECT e FROM Envase e WHERE e.envasePK.envcNumPlomo = :envcNumPlomo"),
    @NamedQuery(name = "Envase.findByEnvcFecContable", query = "SELECT e FROM Envase e WHERE e.envcFecContable = :envcFecContable"),
    @NamedQuery(name = "Envase.findByEnvcFecTermino", query = "SELECT e FROM Envase e WHERE e.envcFecTermino = :envcFecTermino"),
    @NamedQuery(name = "Envase.findByEnvcImpteDifMn", query = "SELECT e FROM Envase e WHERE e.envcImpteDifMn = :envcImpteDifMn"),
    @NamedQuery(name = "Envase.findByEnvcImpteDifMe", query = "SELECT e FROM Envase e WHERE e.envcImpteDifMe = :envcImpteDifMe"),
    @NamedQuery(name = "Envase.findByEnvcNumDocsSbc", query = "SELECT e FROM Envase e WHERE e.envcNumDocsSbc = :envcNumDocsSbc"),
    @NamedQuery(name = "Envase.findByEnvcFecAsign", query = "SELECT e FROM Envase e WHERE e.envcFecAsign = :envcFecAsign"),
    @NamedQuery(name = "Envase.findByEnvcReasign", query = "SELECT e FROM Envase e WHERE e.envcReasign = :envcReasign"),
    @NamedQuery(name = "Envase.findByEnvcNumParciales", query = "SELECT e FROM Envase e WHERE e.envcNumParciales = :envcNumParciales"),
    @NamedQuery(name = "Envase.findByEnvcExcedGrapa", query = "SELECT e FROM Envase e WHERE e.envcExcedGrapa = :envcExcedGrapa"),
    @NamedQuery(name = "Envase.findByEnvcExcedMaxImpte", query = "SELECT e FROM Envase e WHERE e.envcExcedMaxImpte = :envcExcedMaxImpte"),
    @NamedQuery(name = "Envase.findByEnvcMezclaConcep", query = "SELECT e FROM Envase e WHERE e.envcMezclaConcep = :envcMezclaConcep"),
    @NamedQuery(name = "Envase.findByImporteDoctosSbc", query = "SELECT e FROM Envase e WHERE e.importeDoctosSbc = :importeDoctosSbc")})
public class Envase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnvasePK envasePK;
    @Column(name = "ENVC_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date envcFecContable;
    @Column(name = "ENVC_FEC_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date envcFecTermino;
    @Column(name = "ENVC_IMPTE_DIF_MN")
    private BigDecimal envcImpteDifMn;
    @Column(name = "ENVC_IMPTE_DIF_ME")
    private BigDecimal envcImpteDifMe;
    @Column(name = "ENVC_NUM_DOCS_SBC")
    private Short envcNumDocsSbc;
    @Column(name = "ENVC_FEC_ASIGN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date envcFecAsign;
    @Column(name = "ENVC_REASIGN")
    private Short envcReasign;
    @Column(name = "ENVC_NUM_PARCIALES")
    private Short envcNumParciales;
    @Column(name = "ENVC_EXCED_GRAPA")
    private Short envcExcedGrapa;
    @Column(name = "ENVC_EXCED_MAX_IMPTE")
    private Short envcExcedMaxImpte;
    @Column(name = "ENVC_MEZCLA_CONCEP")
    private Short envcMezclaConcep;
    @Column(name = "IMPORTE_DOCTOS_SBC")
    private BigDecimal importeDoctosSbc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envase")
    private List<DetalleDeDivisaPorEnvase> detalleDeDivisaPorEnvaseList;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumns({
        @JoinColumn(name = "COMPBTE_ID", referencedColumnName = "COMPBTE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")})
    @ManyToOne(optional = false)
    private Comprobante comprobante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envase")
    private List<FichaDeposito> fichaDepositoList;

    public Envase() {
    }

    public Envase(EnvasePK envasePK) {
        this.envasePK = envasePK;
    }

    public Envase(String compbteId, String envcNumPlomo) {
        this.envasePK = new EnvasePK(compbteId, envcNumPlomo);
    }

    public EnvasePK getEnvasePK() {
        return envasePK;
    }

    public void setEnvasePK(EnvasePK envasePK) {
        this.envasePK = envasePK;
    }

    public Date getEnvcFecContable() {
        return envcFecContable;
    }

    public void setEnvcFecContable(Date envcFecContable) {
        this.envcFecContable = envcFecContable;
    }

    public Date getEnvcFecTermino() {
        return envcFecTermino;
    }

    public void setEnvcFecTermino(Date envcFecTermino) {
        this.envcFecTermino = envcFecTermino;
    }

    public BigDecimal getEnvcImpteDifMn() {
        return envcImpteDifMn;
    }

    public void setEnvcImpteDifMn(BigDecimal envcImpteDifMn) {
        this.envcImpteDifMn = envcImpteDifMn;
    }

    public BigDecimal getEnvcImpteDifMe() {
        return envcImpteDifMe;
    }

    public void setEnvcImpteDifMe(BigDecimal envcImpteDifMe) {
        this.envcImpteDifMe = envcImpteDifMe;
    }

    public Short getEnvcNumDocsSbc() {
        return envcNumDocsSbc;
    }

    public void setEnvcNumDocsSbc(Short envcNumDocsSbc) {
        this.envcNumDocsSbc = envcNumDocsSbc;
    }

    public Date getEnvcFecAsign() {
        return envcFecAsign;
    }

    public void setEnvcFecAsign(Date envcFecAsign) {
        this.envcFecAsign = envcFecAsign;
    }

    public Short getEnvcReasign() {
        return envcReasign;
    }

    public void setEnvcReasign(Short envcReasign) {
        this.envcReasign = envcReasign;
    }

    public Short getEnvcNumParciales() {
        return envcNumParciales;
    }

    public void setEnvcNumParciales(Short envcNumParciales) {
        this.envcNumParciales = envcNumParciales;
    }

    public Short getEnvcExcedGrapa() {
        return envcExcedGrapa;
    }

    public void setEnvcExcedGrapa(Short envcExcedGrapa) {
        this.envcExcedGrapa = envcExcedGrapa;
    }

    public Short getEnvcExcedMaxImpte() {
        return envcExcedMaxImpte;
    }

    public void setEnvcExcedMaxImpte(Short envcExcedMaxImpte) {
        this.envcExcedMaxImpte = envcExcedMaxImpte;
    }

    public Short getEnvcMezclaConcep() {
        return envcMezclaConcep;
    }

    public void setEnvcMezclaConcep(Short envcMezclaConcep) {
        this.envcMezclaConcep = envcMezclaConcep;
    }

    public BigDecimal getImporteDoctosSbc() {
        return importeDoctosSbc;
    }

    public void setImporteDoctosSbc(BigDecimal importeDoctosSbc) {
        this.importeDoctosSbc = importeDoctosSbc;
    }

    public List<DetalleDeDivisaPorEnvase> getDetalleDeDivisaPorEnvaseList() {
        return detalleDeDivisaPorEnvaseList;
    }

    public void setDetalleDeDivisaPorEnvaseList(List<DetalleDeDivisaPorEnvase> detalleDeDivisaPorEnvaseList) {
        this.detalleDeDivisaPorEnvaseList = detalleDeDivisaPorEnvaseList;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public List<FichaDeposito> getFichaDepositoList() {
        return fichaDepositoList;
    }

    public void setFichaDepositoList(List<FichaDeposito> fichaDepositoList) {
        this.fichaDepositoList = fichaDepositoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (envasePK != null ? envasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envase)) {
            return false;
        }
        Envase other = (Envase) object;
        if ((this.envasePK == null && other.envasePK != null) || (this.envasePK != null && !this.envasePK.equals(other.envasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Envase[envasePK=" + envasePK + "]";
    }

}
