/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "MOVIMIENTOS_S711")
@NamedQueries({
    @NamedQuery(name = "MovimientosS711.findAll", query = "SELECT m FROM MovimientosS711 m"),
    @NamedQuery(name = "MovimientosS711.findByMovs711Idn", query = "SELECT m FROM MovimientosS711 m WHERE m.movs711Idn = :movs711Idn"),
    @NamedQuery(name = "MovimientosS711.findByCompbteId", query = "SELECT m FROM MovimientosS711 m WHERE m.compbteId = :compbteId"),
    @NamedQuery(name = "MovimientosS711.findByEnvcNumPlomo", query = "SELECT m FROM MovimientosS711 m WHERE m.envcNumPlomo = :envcNumPlomo"),
    @NamedQuery(name = "MovimientosS711.findByMovs711FecApliMov", query = "SELECT m FROM MovimientosS711 m WHERE m.movs711FecApliMov = :movs711FecApliMov"),
    @NamedQuery(name = "MovimientosS711.findByMovs711FecContable", query = "SELECT m FROM MovimientosS711 m WHERE m.movs711FecContable = :movs711FecContable"),
    @NamedQuery(name = "MovimientosS711.findByMovs711NumAutornSbc", query = "SELECT m FROM MovimientosS711 m WHERE m.movs711NumAutornSbc = :movs711NumAutornSbc"),
    @NamedQuery(name = "MovimientosS711.findByMovs711ImpTotAp", query = "SELECT m FROM MovimientosS711 m WHERE m.movs711ImpTotAp = :movs711ImpTotAp")})
public class MovimientosS711 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOVS711_IDN")
    private Integer movs711Idn;
    @Column(name = "COMPBTE_ID")
    private String compbteId;
    @Column(name = "ENVC_NUM_PLOMO")
    private String envcNumPlomo;
    @Basic(optional = false)
    @Column(name = "MOVS711_FEC_APLI_MOV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs711FecApliMov;
    @Column(name = "MOVS711_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs711FecContable;
    @Column(name = "MOVS711_NUM_AUTORN_SBC")
    private Integer movs711NumAutornSbc;
    @Column(name = "MOVS711_IMP_TOT_AP")
    private BigDecimal movs711ImpTotAp;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "FICHA_IDN", referencedColumnName = "FICHA_IDN")
    @ManyToOne
    private FichaDeposito fichaIdn;
    @JoinColumn(name = "ERR_ID", referencedColumnName = "ERR_ID")
    @ManyToOne(optional = false)
    private TipoDeError errId;

    public MovimientosS711() {
    }

    public MovimientosS711(Integer movs711Idn) {
        this.movs711Idn = movs711Idn;
    }

    public MovimientosS711(Integer movs711Idn, Date movs711FecApliMov) {
        this.movs711Idn = movs711Idn;
        this.movs711FecApliMov = movs711FecApliMov;
    }

    public Integer getMovs711Idn() {
        return movs711Idn;
    }

    public void setMovs711Idn(Integer movs711Idn) {
        this.movs711Idn = movs711Idn;
    }

    public String getCompbteId() {
        return compbteId;
    }

    public void setCompbteId(String compbteId) {
        this.compbteId = compbteId;
    }

    public String getEnvcNumPlomo() {
        return envcNumPlomo;
    }

    public void setEnvcNumPlomo(String envcNumPlomo) {
        this.envcNumPlomo = envcNumPlomo;
    }

    public Date getMovs711FecApliMov() {
        return movs711FecApliMov;
    }

    public void setMovs711FecApliMov(Date movs711FecApliMov) {
        this.movs711FecApliMov = movs711FecApliMov;
    }

    public Date getMovs711FecContable() {
        return movs711FecContable;
    }

    public void setMovs711FecContable(Date movs711FecContable) {
        this.movs711FecContable = movs711FecContable;
    }

    public Integer getMovs711NumAutornSbc() {
        return movs711NumAutornSbc;
    }

    public void setMovs711NumAutornSbc(Integer movs711NumAutornSbc) {
        this.movs711NumAutornSbc = movs711NumAutornSbc;
    }

    public BigDecimal getMovs711ImpTotAp() {
        return movs711ImpTotAp;
    }

    public void setMovs711ImpTotAp(BigDecimal movs711ImpTotAp) {
        this.movs711ImpTotAp = movs711ImpTotAp;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public FichaDeposito getFichaIdn() {
        return fichaIdn;
    }

    public void setFichaIdn(FichaDeposito fichaIdn) {
        this.fichaIdn = fichaIdn;
    }

    public TipoDeError getErrId() {
        return errId;
    }

    public void setErrId(TipoDeError errId) {
        this.errId = errId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movs711Idn != null ? movs711Idn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosS711)) {
            return false;
        }
        MovimientosS711 other = (MovimientosS711) object;
        if ((this.movs711Idn == null && other.movs711Idn != null) || (this.movs711Idn != null && !this.movs711Idn.equals(other.movs711Idn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.MovimientosS711[movs711Idn=" + movs711Idn + "]";
    }

}
