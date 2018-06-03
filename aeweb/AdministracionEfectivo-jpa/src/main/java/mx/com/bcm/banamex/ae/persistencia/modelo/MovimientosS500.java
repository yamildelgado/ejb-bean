/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "MOVIMIENTOS_S500")
@NamedQueries({
    @NamedQuery(name = "MovimientosS500.findAll", query = "SELECT m FROM MovimientosS500 m"),
    @NamedQuery(name = "MovimientosS500.findByMovs500Idn", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500Idn = :movs500Idn"),
    @NamedQuery(name = "MovimientosS500.findByCompbteId", query = "SELECT m FROM MovimientosS500 m WHERE m.compbteId = :compbteId"),
    @NamedQuery(name = "MovimientosS500.findByEnvcNumPlomo", query = "SELECT m FROM MovimientosS500 m WHERE m.envcNumPlomo = :envcNumPlomo"),
    @NamedQuery(name = "MovimientosS500.findByMovs500FecApliMov", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500FecApliMov = :movs500FecApliMov"),
    @NamedQuery(name = "MovimientosS500.findByMovs500FecContable", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500FecContable = :movs500FecContable"),
    @NamedQuery(name = "MovimientosS500.findByMovs500NumAutorizacion", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500NumAutorizacion = :movs500NumAutorizacion"),
    @NamedQuery(name = "MovimientosS500.findByMovs500ImpTotAp", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500ImpTotAp = :movs500ImpTotAp"),
    @NamedQuery(name = "MovimientosS500.findByMovs500BandaMagnetica", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500BandaMagnetica = :movs500BandaMagnetica"),
    @NamedQuery(name = "MovimientosS500.findByMovs500ErrDesc", query = "SELECT m FROM MovimientosS500 m WHERE m.movs500ErrDesc = :movs500ErrDesc")})
public class MovimientosS500 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOVS500_IDN")
    private Integer movs500Idn;
    @Basic(optional = false)
    @Column(name = "COMPBTE_ID")
    private String compbteId;
    @Basic(optional = false)
    @Column(name = "ENVC_NUM_PLOMO")
    private String envcNumPlomo;
    @Basic(optional = false)
    @Column(name = "MOVS500_FEC_APLI_MOV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs500FecApliMov;
    @Column(name = "MOVS500_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date movs500FecContable;
    @Column(name = "MOVS500_NUM_AUTORIZACION")
    private Integer movs500NumAutorizacion;
    @Column(name = "MOVS500_IMP_TOT_AP")
    private BigDecimal movs500ImpTotAp;
    @Column(name = "MOVS500_BANDA_MAGNETICA")
    private BigInteger movs500BandaMagnetica;
    @Column(name = "MOVS500_ERR_DESC")
    private String movs500ErrDesc;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "FICHA_IDN", referencedColumnName = "FICHA_IDN")
    @ManyToOne(optional = false)
    private FichaDeposito fichaIdn;
    @JoinColumn(name = "SOLICITUD_IDN", referencedColumnName = "SOLICITUD_IDN")
    @ManyToOne(optional = false)
    private SolicitudDotacion solicitudIdn;
    @JoinColumn(name = "ERR_ID", referencedColumnName = "ERR_ID")
    @ManyToOne
    private TipoDeError errId;

    public MovimientosS500() {
    }

    public MovimientosS500(Integer movs500Idn) {
        this.movs500Idn = movs500Idn;
    }

    public MovimientosS500(Integer movs500Idn, String compbteId, String envcNumPlomo, Date movs500FecApliMov) {
        this.movs500Idn = movs500Idn;
        this.compbteId = compbteId;
        this.envcNumPlomo = envcNumPlomo;
        this.movs500FecApliMov = movs500FecApliMov;
    }

    public Integer getMovs500Idn() {
        return movs500Idn;
    }

    public void setMovs500Idn(Integer movs500Idn) {
        this.movs500Idn = movs500Idn;
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

    public Date getMovs500FecApliMov() {
        return movs500FecApliMov;
    }

    public void setMovs500FecApliMov(Date movs500FecApliMov) {
        this.movs500FecApliMov = movs500FecApliMov;
    }

    public Date getMovs500FecContable() {
        return movs500FecContable;
    }

    public void setMovs500FecContable(Date movs500FecContable) {
        this.movs500FecContable = movs500FecContable;
    }

    public Integer getMovs500NumAutorizacion() {
        return movs500NumAutorizacion;
    }

    public void setMovs500NumAutorizacion(Integer movs500NumAutorizacion) {
        this.movs500NumAutorizacion = movs500NumAutorizacion;
    }

    public BigDecimal getMovs500ImpTotAp() {
        return movs500ImpTotAp;
    }

    public void setMovs500ImpTotAp(BigDecimal movs500ImpTotAp) {
        this.movs500ImpTotAp = movs500ImpTotAp;
    }

    public BigInteger getMovs500BandaMagnetica() {
        return movs500BandaMagnetica;
    }

    public void setMovs500BandaMagnetica(BigInteger movs500BandaMagnetica) {
        this.movs500BandaMagnetica = movs500BandaMagnetica;
    }

    public String getMovs500ErrDesc() {
        return movs500ErrDesc;
    }

    public void setMovs500ErrDesc(String movs500ErrDesc) {
        this.movs500ErrDesc = movs500ErrDesc;
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
        hash += (movs500Idn != null ? movs500Idn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosS500)) {
            return false;
        }
        MovimientosS500 other = (MovimientosS500) object;
        if ((this.movs500Idn == null && other.movs500Idn != null) || (this.movs500Idn != null && !this.movs500Idn.equals(other.movs500Idn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.MovimientosS500[movs500Idn=" + movs500Idn + "]";
    }

}
