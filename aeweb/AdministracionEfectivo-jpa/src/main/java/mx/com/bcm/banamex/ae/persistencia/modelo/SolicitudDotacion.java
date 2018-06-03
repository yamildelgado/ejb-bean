/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "SOLICITUD_DOTACION")
@NamedQueries({
    @NamedQuery(name = "SolicitudDotacion.findAll", query = "SELECT s FROM SolicitudDotacion s"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudIdn", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudIdn = :solicitudIdn"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudSirhRecibe", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudSirhRecibe = :solicitudSirhRecibe"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudSucursal", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudSucursal = :solicitudSucursal"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudCuenta", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudCuenta = :solicitudCuenta"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudMotivo", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudMotivo = :solicitudMotivo"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudImpte", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudImpte = :solicitudImpte"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudStatus", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudStatus = :solicitudStatus"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudFechaSolicita", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudFechaSolicita = :solicitudFechaSolicita"),
    @NamedQuery(name = "SolicitudDotacion.findBySolicitudFechaEntrega", query = "SELECT s FROM SolicitudDotacion s WHERE s.solicitudFechaEntrega = :solicitudFechaEntrega")})
public class SolicitudDotacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SOLICITUD_IDN")
    private Long solicitudIdn;
    @Column(name = "SOLICITUD_SIRH_RECIBE")
    private Short solicitudSirhRecibe;
    @Column(name = "SOLICITUD_SUCURSAL")
    private Character solicitudSucursal;
    @Column(name = "SOLICITUD_CUENTA")
    private Character solicitudCuenta;
    @Column(name = "SOLICITUD_MOTIVO")
    private Character solicitudMotivo;
    @Column(name = "SOLICITUD_IMPTE")
    private BigDecimal solicitudImpte;
    @Column(name = "SOLICITUD_STATUS")
    private Short solicitudStatus;
    @Column(name = "SOLICITUD_FECHA_SOLICITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date solicitudFechaSolicita;
    @Column(name = "SOLICITUD_FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date solicitudFechaEntrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudDotacion")
    private List<DetalleDotacion> detalleDotacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudIdn")
    private List<MovimientosS500> movimientosS500List;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitudDotacion")
    private ComprobanteDeDotacion comprobanteDeDotacion;
    @JoinColumns({
        @JoinColumn(name = "GRALAEWEB_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "GRALAEWEB_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumns({
        @JoinColumn(name = "GRALAEWEB_STS_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "GRALAEWEB_AGRUP_STS_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb1;
    @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")
    @ManyToOne
    private Etv etvIdn;
    @JoinColumns({
        @JoinColumn(name = "HIST_FEC_HR_INI", referencedColumnName = "HIST_FEC_HOR_INI"),
        @JoinColumn(name = "TURNO_ID", referencedColumnName = "TURNO_ID")})
    @ManyToOne
    private HistTurnoEnOperacion histTurnoEnOperacion;
    @JoinColumns({
        @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN"),
        @JoinColumn(name = "CNTRTO_NUM", referencedColumnName = "CNTRTO_NUM"),
        @JoinColumn(name = "UNEG_ID", referencedColumnName = "UNEG_ID")})
    @ManyToOne(optional = false)
    private UnidadDeNegocio unidadDeNegocio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudIdn")
    private List<MovimientosS018> movimientosS018List;

    public SolicitudDotacion() {
    }

    public SolicitudDotacion(Long solicitudIdn) {
        this.solicitudIdn = solicitudIdn;
    }

    public Long getSolicitudIdn() {
        return solicitudIdn;
    }

    public void setSolicitudIdn(Long solicitudIdn) {
        this.solicitudIdn = solicitudIdn;
    }

    public Short getSolicitudSirhRecibe() {
        return solicitudSirhRecibe;
    }

    public void setSolicitudSirhRecibe(Short solicitudSirhRecibe) {
        this.solicitudSirhRecibe = solicitudSirhRecibe;
    }

    public Character getSolicitudSucursal() {
        return solicitudSucursal;
    }

    public void setSolicitudSucursal(Character solicitudSucursal) {
        this.solicitudSucursal = solicitudSucursal;
    }

    public Character getSolicitudCuenta() {
        return solicitudCuenta;
    }

    public void setSolicitudCuenta(Character solicitudCuenta) {
        this.solicitudCuenta = solicitudCuenta;
    }

    public Character getSolicitudMotivo() {
        return solicitudMotivo;
    }

    public void setSolicitudMotivo(Character solicitudMotivo) {
        this.solicitudMotivo = solicitudMotivo;
    }

    public BigDecimal getSolicitudImpte() {
        return solicitudImpte;
    }

    public void setSolicitudImpte(BigDecimal solicitudImpte) {
        this.solicitudImpte = solicitudImpte;
    }

    public Short getSolicitudStatus() {
        return solicitudStatus;
    }

    public void setSolicitudStatus(Short solicitudStatus) {
        this.solicitudStatus = solicitudStatus;
    }

    public Date getSolicitudFechaSolicita() {
        return solicitudFechaSolicita;
    }

    public void setSolicitudFechaSolicita(Date solicitudFechaSolicita) {
        this.solicitudFechaSolicita = solicitudFechaSolicita;
    }

    public Date getSolicitudFechaEntrega() {
        return solicitudFechaEntrega;
    }

    public void setSolicitudFechaEntrega(Date solicitudFechaEntrega) {
        this.solicitudFechaEntrega = solicitudFechaEntrega;
    }

    public List<DetalleDotacion> getDetalleDotacionList() {
        return detalleDotacionList;
    }

    public void setDetalleDotacionList(List<DetalleDotacion> detalleDotacionList) {
        this.detalleDotacionList = detalleDotacionList;
    }

    public List<MovimientosS500> getMovimientosS500List() {
        return movimientosS500List;
    }

    public void setMovimientosS500List(List<MovimientosS500> movimientosS500List) {
        this.movimientosS500List = movimientosS500List;
    }

    public ComprobanteDeDotacion getComprobanteDeDotacion() {
        return comprobanteDeDotacion;
    }

    public void setComprobanteDeDotacion(ComprobanteDeDotacion comprobanteDeDotacion) {
        this.comprobanteDeDotacion = comprobanteDeDotacion;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public CatGeneralAeweb getCatGeneralAeweb1() {
        return catGeneralAeweb1;
    }

    public void setCatGeneralAeweb1(CatGeneralAeweb catGeneralAeweb1) {
        this.catGeneralAeweb1 = catGeneralAeweb1;
    }

    public Etv getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(Etv etvIdn) {
        this.etvIdn = etvIdn;
    }

    public HistTurnoEnOperacion getHistTurnoEnOperacion() {
        return histTurnoEnOperacion;
    }

    public void setHistTurnoEnOperacion(HistTurnoEnOperacion histTurnoEnOperacion) {
        this.histTurnoEnOperacion = histTurnoEnOperacion;
    }

    public UnidadDeNegocio getUnidadDeNegocio() {
        return unidadDeNegocio;
    }

    public void setUnidadDeNegocio(UnidadDeNegocio unidadDeNegocio) {
        this.unidadDeNegocio = unidadDeNegocio;
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
        hash += (solicitudIdn != null ? solicitudIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudDotacion)) {
            return false;
        }
        SolicitudDotacion other = (SolicitudDotacion) object;
        if ((this.solicitudIdn == null && other.solicitudIdn != null) || (this.solicitudIdn != null && !this.solicitudIdn.equals(other.solicitudIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.SolicitudDotacion[solicitudIdn=" + solicitudIdn + "]";
    }

}
