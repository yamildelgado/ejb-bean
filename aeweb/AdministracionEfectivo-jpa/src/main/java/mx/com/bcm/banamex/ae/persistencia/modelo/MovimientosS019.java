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
@Table(name = "MOVIMIENTOS_S019")
@NamedQueries({
    @NamedQuery(name = "MovimientosS019.findAll", query = "SELECT m FROM MovimientosS019 m"),
    @NamedQuery(name = "MovimientosS019.findByMovs019Idn", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019Idn = :movs019Idn"),
    @NamedQuery(name = "MovimientosS019.findByMovs019FecApliMov", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019FecApliMov = :movs019FecApliMov"),
    @NamedQuery(name = "MovimientosS019.findByMovs019FecContable", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019FecContable = :movs019FecContable"),
    @NamedQuery(name = "MovimientosS019.findByMovs019Turno", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019Turno = :movs019Turno"),
    @NamedQuery(name = "MovimientosS019.findByMovs019NumAutorizacion", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019NumAutorizacion = :movs019NumAutorizacion"),
    @NamedQuery(name = "MovimientosS019.findByMovs019ImpteTotAp", query = "SELECT m FROM MovimientosS019 m WHERE m.movs019ImpteTotAp = :movs019ImpteTotAp")})
public class MovimientosS019 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOVS019_IDN")
    private Integer movs019Idn;
    @Basic(optional = false)
    @Column(name = "MOVS019_FEC_APLI_MOV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs019FecApliMov;
    @Column(name = "MOVS019_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs019FecContable;
    @Column(name = "MOVS019_TURNO")
    private String movs019Turno;
    @Column(name = "MOVS019_NUM_AUTORIZACION")
    private Integer movs019NumAutorizacion;
    @Column(name = "MOVS019_IMPTE_TOT_AP")
    private BigDecimal movs019ImpteTotAp;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "ERR_ID", referencedColumnName = "ERR_ID")
    @ManyToOne
    private TipoDeError errId;

    public MovimientosS019() {
    }

    public MovimientosS019(Integer movs019Idn) {
        this.movs019Idn = movs019Idn;
    }

    public MovimientosS019(Integer movs019Idn, Date movs019FecApliMov) {
        this.movs019Idn = movs019Idn;
        this.movs019FecApliMov = movs019FecApliMov;
    }

    public Integer getMovs019Idn() {
        return movs019Idn;
    }

    public void setMovs019Idn(Integer movs019Idn) {
        this.movs019Idn = movs019Idn;
    }

    public Date getMovs019FecApliMov() {
        return movs019FecApliMov;
    }

    public void setMovs019FecApliMov(Date movs019FecApliMov) {
        this.movs019FecApliMov = movs019FecApliMov;
    }

    public Date getMovs019FecContable() {
        return movs019FecContable;
    }

    public void setMovs019FecContable(Date movs019FecContable) {
        this.movs019FecContable = movs019FecContable;
    }

    public String getMovs019Turno() {
        return movs019Turno;
    }

    public void setMovs019Turno(String movs019Turno) {
        this.movs019Turno = movs019Turno;
    }

    public Integer getMovs019NumAutorizacion() {
        return movs019NumAutorizacion;
    }

    public void setMovs019NumAutorizacion(Integer movs019NumAutorizacion) {
        this.movs019NumAutorizacion = movs019NumAutorizacion;
    }

    public BigDecimal getMovs019ImpteTotAp() {
        return movs019ImpteTotAp;
    }

    public void setMovs019ImpteTotAp(BigDecimal movs019ImpteTotAp) {
        this.movs019ImpteTotAp = movs019ImpteTotAp;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
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
        hash += (movs019Idn != null ? movs019Idn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosS019)) {
            return false;
        }
        MovimientosS019 other = (MovimientosS019) object;
        if ((this.movs019Idn == null && other.movs019Idn != null) || (this.movs019Idn != null && !this.movs019Idn.equals(other.movs019Idn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.MovimientosS019[movs019Idn=" + movs019Idn + "]";
    }

}
