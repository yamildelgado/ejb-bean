/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
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
@Table(name = "MOVIMIENTOS_S018")
@NamedQueries({
    @NamedQuery(name = "MovimientosS018.findAll", query = "SELECT m FROM MovimientosS018 m"),
    @NamedQuery(name = "MovimientosS018.findByMovs018Id", query = "SELECT m FROM MovimientosS018 m WHERE m.movimientosS018PK.movs018Id = :movs018Id"),
    @NamedQuery(name = "MovimientosS018.findByCompbteId", query = "SELECT m FROM MovimientosS018 m WHERE m.movimientosS018PK.compbteId = :compbteId"),
    @NamedQuery(name = "MovimientosS018.findByMovs018FecContable", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018FecContable = :movs018FecContable"),
    @NamedQuery(name = "MovimientosS018.findByMovs018FecAplica", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018FecAplica = :movs018FecAplica"),
    @NamedQuery(name = "MovimientosS018.findByMovs018ImpteTotal", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018ImpteTotal = :movs018ImpteTotal"),
    @NamedQuery(name = "MovimientosS018.findByMovs018SirhEnvio", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018SirhEnvio = :movs018SirhEnvio"),
    @NamedQuery(name = "MovimientosS018.findByMovs018Tipopera", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018Tipopera = :movs018Tipopera"),
    @NamedQuery(name = "MovimientosS018.findByMovs018Status", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018Status = :movs018Status"),
    @NamedQuery(name = "MovimientosS018.findByMovs018ErrDesc", query = "SELECT m FROM MovimientosS018 m WHERE m.movs018ErrDesc = :movs018ErrDesc")})
public class MovimientosS018 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimientosS018PK movimientosS018PK;
    @Column(name = "MOVS018_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs018FecContable;
    @Column(name = "MOVS018_FEC_APLICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs018FecAplica;
    @Column(name = "MOVS018_IMPTE_TOTAL")
    private Double movs018ImpteTotal;
    @Column(name = "MOVS018_SIRH_ENVIO")
    private Short movs018SirhEnvio;
    @Column(name = "MOVS018_TIPOPERA")
    private BigInteger movs018Tipopera;
    @Column(name = "MOVS018_STATUS")
    private Short movs018Status;
    @Column(name = "MOVS018_ERR_DESC")
    private String movs018ErrDesc;
    @OneToMany(mappedBy = "movimientosS018")
    private List<DetalleDeMovimientoS018> detalleDeMovimientoS018List;
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
    @JoinColumn(name = "SOLICITUD_IDN", referencedColumnName = "SOLICITUD_IDN")
    @ManyToOne(optional = false)
    private SolicitudDotacion solicitudIdn;
    @JoinColumn(name = "ERR_ID", referencedColumnName = "ERR_ID")
    @ManyToOne
    private TipoDeError errId;

    public MovimientosS018() {
    }

    public MovimientosS018(MovimientosS018PK movimientosS018PK) {
        this.movimientosS018PK = movimientosS018PK;
    }

    public MovimientosS018(int movs018Id, String compbteId) {
        this.movimientosS018PK = new MovimientosS018PK(movs018Id, compbteId);
    }

    public MovimientosS018PK getMovimientosS018PK() {
        return movimientosS018PK;
    }

    public void setMovimientosS018PK(MovimientosS018PK movimientosS018PK) {
        this.movimientosS018PK = movimientosS018PK;
    }

    public Date getMovs018FecContable() {
        return movs018FecContable;
    }

    public void setMovs018FecContable(Date movs018FecContable) {
        this.movs018FecContable = movs018FecContable;
    }

    public Date getMovs018FecAplica() {
        return movs018FecAplica;
    }

    public void setMovs018FecAplica(Date movs018FecAplica) {
        this.movs018FecAplica = movs018FecAplica;
    }

    public Double getMovs018ImpteTotal() {
        return movs018ImpteTotal;
    }

    public void setMovs018ImpteTotal(Double movs018ImpteTotal) {
        this.movs018ImpteTotal = movs018ImpteTotal;
    }

    public Short getMovs018SirhEnvio() {
        return movs018SirhEnvio;
    }

    public void setMovs018SirhEnvio(Short movs018SirhEnvio) {
        this.movs018SirhEnvio = movs018SirhEnvio;
    }

    public BigInteger getMovs018Tipopera() {
        return movs018Tipopera;
    }

    public void setMovs018Tipopera(BigInteger movs018Tipopera) {
        this.movs018Tipopera = movs018Tipopera;
    }

    public Short getMovs018Status() {
        return movs018Status;
    }

    public void setMovs018Status(Short movs018Status) {
        this.movs018Status = movs018Status;
    }

    public String getMovs018ErrDesc() {
        return movs018ErrDesc;
    }

    public void setMovs018ErrDesc(String movs018ErrDesc) {
        this.movs018ErrDesc = movs018ErrDesc;
    }

    public List<DetalleDeMovimientoS018> getDetalleDeMovimientoS018List() {
        return detalleDeMovimientoS018List;
    }

    public void setDetalleDeMovimientoS018List(List<DetalleDeMovimientoS018> detalleDeMovimientoS018List) {
        this.detalleDeMovimientoS018List = detalleDeMovimientoS018List;
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

    public SolicitudDotacion getSolicitudIdn() {
        return solicitudIdn;
    }

    public void setSolicitudIdn(SolicitudDotacion solicitudIdn) {
        this.solicitudIdn = solicitudIdn;
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
        hash += (movimientosS018PK != null ? movimientosS018PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosS018)) {
            return false;
        }
        MovimientosS018 other = (MovimientosS018) object;
        if ((this.movimientosS018PK == null && other.movimientosS018PK != null) || (this.movimientosS018PK != null && !this.movimientosS018PK.equals(other.movimientosS018PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.MovimientosS018[movimientosS018PK=" + movimientosS018PK + "]";
    }

}
