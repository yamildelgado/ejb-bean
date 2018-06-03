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
@Table(name = "HIST_TURNO_EN_OPERACION")
@NamedQueries({
    @NamedQuery(name = "HistTurnoEnOperacion.findAll", query = "SELECT h FROM HistTurnoEnOperacion h"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByTurnoId", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histTurnoEnOperacionPK.turnoId = :turnoId"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistFecHorIni", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histTurnoEnOperacionPK.histFecHorIni = :histFecHorIni"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistFecContInicial", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histFecContInicial = :histFecContInicial"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistFecHorFin", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histFecHorFin = :histFecHorFin"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistCambioFecCont", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histCambioFecCont = :histCambioFecCont"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistStatus", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histStatus = :histStatus"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistNominaIniciaTurno", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histNominaIniciaTurno = :histNominaIniciaTurno"),
    @NamedQuery(name = "HistTurnoEnOperacion.findByHistNominaTerminaTurno", query = "SELECT h FROM HistTurnoEnOperacion h WHERE h.histNominaTerminaTurno = :histNominaTerminaTurno")})
public class HistTurnoEnOperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistTurnoEnOperacionPK histTurnoEnOperacionPK;
    @Column(name = "HIST_FEC_CONT_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date histFecContInicial;
    @Column(name = "HIST_FEC_HOR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date histFecHorFin;
    @Column(name = "HIST_CAMBIO_FEC_CONT")
    private String histCambioFecCont;
    @Column(name = "HIST_STATUS")
    private String histStatus;
    @Column(name = "HIST_NOMINA_INICIA_TURNO")
    private Integer histNominaIniciaTurno;
    @Column(name = "HIST_NOMINA_TERMINA_TURNO")
    private Integer histNominaTerminaTurno;
    @JoinColumn(name = "FECCONT_IDN", referencedColumnName = "FECCONT_IDN")
    @ManyToOne
    private FechaContable feccontIdn;
    @JoinColumn(name = "TURNO_ID", referencedColumnName = "TURNO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Turno turno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "histTurnoEnOperacion")
    private List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList;
    @OneToMany(mappedBy = "histTurnoEnOperacion")
    private List<SolicitudDotacion> solicitudDotacionList;

    public HistTurnoEnOperacion() {
    }

    public HistTurnoEnOperacion(HistTurnoEnOperacionPK histTurnoEnOperacionPK) {
        this.histTurnoEnOperacionPK = histTurnoEnOperacionPK;
    }

    public HistTurnoEnOperacion(String turnoId, Date histFecHorIni) {
        this.histTurnoEnOperacionPK = new HistTurnoEnOperacionPK(turnoId, histFecHorIni);
    }

    public HistTurnoEnOperacionPK getHistTurnoEnOperacionPK() {
        return histTurnoEnOperacionPK;
    }

    public void setHistTurnoEnOperacionPK(HistTurnoEnOperacionPK histTurnoEnOperacionPK) {
        this.histTurnoEnOperacionPK = histTurnoEnOperacionPK;
    }

    public Date getHistFecContInicial() {
        return histFecContInicial;
    }

    public void setHistFecContInicial(Date histFecContInicial) {
        this.histFecContInicial = histFecContInicial;
    }

    public Date getHistFecHorFin() {
        return histFecHorFin;
    }

    public void setHistFecHorFin(Date histFecHorFin) {
        this.histFecHorFin = histFecHorFin;
    }

    public String getHistCambioFecCont() {
        return histCambioFecCont;
    }

    public void setHistCambioFecCont(String histCambioFecCont) {
        this.histCambioFecCont = histCambioFecCont;
    }

    public String getHistStatus() {
        return histStatus;
    }

    public void setHistStatus(String histStatus) {
        this.histStatus = histStatus;
    }

    public Integer getHistNominaIniciaTurno() {
        return histNominaIniciaTurno;
    }

    public void setHistNominaIniciaTurno(Integer histNominaIniciaTurno) {
        this.histNominaIniciaTurno = histNominaIniciaTurno;
    }

    public Integer getHistNominaTerminaTurno() {
        return histNominaTerminaTurno;
    }

    public void setHistNominaTerminaTurno(Integer histNominaTerminaTurno) {
        this.histNominaTerminaTurno = histNominaTerminaTurno;
    }

    public FechaContable getFeccontIdn() {
        return feccontIdn;
    }

    public void setFeccontIdn(FechaContable feccontIdn) {
        this.feccontIdn = feccontIdn;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<CajaHabilitadaPorTurno> getCajaHabilitadaPorTurnoList() {
        return cajaHabilitadaPorTurnoList;
    }

    public void setCajaHabilitadaPorTurnoList(List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList) {
        this.cajaHabilitadaPorTurnoList = cajaHabilitadaPorTurnoList;
    }

    public List<SolicitudDotacion> getSolicitudDotacionList() {
        return solicitudDotacionList;
    }

    public void setSolicitudDotacionList(List<SolicitudDotacion> solicitudDotacionList) {
        this.solicitudDotacionList = solicitudDotacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (histTurnoEnOperacionPK != null ? histTurnoEnOperacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistTurnoEnOperacion)) {
            return false;
        }
        HistTurnoEnOperacion other = (HistTurnoEnOperacion) object;
        if ((this.histTurnoEnOperacionPK == null && other.histTurnoEnOperacionPK != null) || (this.histTurnoEnOperacionPK != null && !this.histTurnoEnOperacionPK.equals(other.histTurnoEnOperacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion[histTurnoEnOperacionPK=" + histTurnoEnOperacionPK + "]";
    }

}
