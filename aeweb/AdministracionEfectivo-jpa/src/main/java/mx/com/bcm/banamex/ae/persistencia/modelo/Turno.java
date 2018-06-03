/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "TURNO")
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t"),
    @NamedQuery(name = "Turno.findByTurnoId", query = "SELECT t FROM Turno t WHERE t.turnoId = :turnoId"),
    @NamedQuery(name = "Turno.findByTurnoDescrip", query = "SELECT t FROM Turno t WHERE t.turnoDescrip = :turnoDescrip"),
    @NamedQuery(name = "Turno.findByTurnoHorIni", query = "SELECT t FROM Turno t WHERE t.turnoHorIni = :turnoHorIni"),
    @NamedQuery(name = "Turno.findByTurnoHorFin", query = "SELECT t FROM Turno t WHERE t.turnoHorFin = :turnoHorFin"),
    @NamedQuery(name = "Turno.findByTurnoStatus", query = "SELECT t FROM Turno t WHERE t.turnoStatus = :turnoStatus"),
    @NamedQuery(name = "Turno.findByTurnoBajaLogica", query = "SELECT t FROM Turno t WHERE t.turnoBajaLogica = :turnoBajaLogica")})
public class Turno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TURNO_ID")
    private String turnoId;
    @Column(name = "TURNO_DESCRIP")
    private String turnoDescrip;
    @Column(name = "TURNO_HOR_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date turnoHorIni;
    @Column(name = "TURNO_HOR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date turnoHorFin;
    @Column(name = "TURNO_STATUS")
    private String turnoStatus;
    @Column(name = "TURNO_BAJA_LOGICA")
    private String turnoBajaLogica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turno")
    private List<HistTurnoEnOperacion> histTurnoEnOperacionList;
    @JoinColumns({
        @JoinColumn(name = "SUBBOVEDA_IDN", referencedColumnName = "SUBBOVEDA_IDN"),
        @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN")})
    @ManyToOne(optional = false)
    private SubBoveda subBoveda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turno")
    private List<CajasDeTurno> cajasDeTurnoList;

    public Turno() {
    }

    public Turno(String turnoId) {
        this.turnoId = turnoId;
    }

    public String getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(String turnoId) {
        this.turnoId = turnoId;
    }

    public String getTurnoDescrip() {
        return turnoDescrip;
    }

    public void setTurnoDescrip(String turnoDescrip) {
        this.turnoDescrip = turnoDescrip;
    }

    public Date getTurnoHorIni() {
        return turnoHorIni;
    }

    public void setTurnoHorIni(Date turnoHorIni) {
        this.turnoHorIni = turnoHorIni;
    }

    public Date getTurnoHorFin() {
        return turnoHorFin;
    }

    public void setTurnoHorFin(Date turnoHorFin) {
        this.turnoHorFin = turnoHorFin;
    }

    public String getTurnoStatus() {
        return turnoStatus;
    }

    public void setTurnoStatus(String turnoStatus) {
        this.turnoStatus = turnoStatus;
    }

    public String getTurnoBajaLogica() {
        return turnoBajaLogica;
    }

    public void setTurnoBajaLogica(String turnoBajaLogica) {
        this.turnoBajaLogica = turnoBajaLogica;
    }

    public List<HistTurnoEnOperacion> getHistTurnoEnOperacionList() {
        return histTurnoEnOperacionList;
    }

    public void setHistTurnoEnOperacionList(List<HistTurnoEnOperacion> histTurnoEnOperacionList) {
        this.histTurnoEnOperacionList = histTurnoEnOperacionList;
    }

    public SubBoveda getSubBoveda() {
        return subBoveda;
    }

    public void setSubBoveda(SubBoveda subBoveda) {
        this.subBoveda = subBoveda;
    }

    public List<CajasDeTurno> getCajasDeTurnoList() {
        return cajasDeTurnoList;
    }

    public void setCajasDeTurnoList(List<CajasDeTurno> cajasDeTurnoList) {
        this.cajasDeTurnoList = cajasDeTurnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnoId != null ? turnoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.turnoId == null && other.turnoId != null) || (this.turnoId != null && !this.turnoId.equals(other.turnoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Turno[turnoId=" + turnoId + "]";
    }

}
