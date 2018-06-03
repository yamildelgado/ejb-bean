/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Embeddable
public class HistTurnoEnOperacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TURNO_ID")
    private String turnoId;
    @Basic(optional = false)
    @Column(name = "HIST_FEC_HOR_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date histFecHorIni;

    public HistTurnoEnOperacionPK() {
    }

    public HistTurnoEnOperacionPK(String turnoId, Date histFecHorIni) {
        this.turnoId = turnoId;
        this.histFecHorIni = histFecHorIni;
    }

    public String getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(String turnoId) {
        this.turnoId = turnoId;
    }

    public Date getHistFecHorIni() {
        return histFecHorIni;
    }

    public void setHistFecHorIni(Date histFecHorIni) {
        this.histFecHorIni = histFecHorIni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnoId != null ? turnoId.hashCode() : 0);
        hash += (histFecHorIni != null ? histFecHorIni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistTurnoEnOperacionPK)) {
            return false;
        }
        HistTurnoEnOperacionPK other = (HistTurnoEnOperacionPK) object;
        if ((this.turnoId == null && other.turnoId != null) || (this.turnoId != null && !this.turnoId.equals(other.turnoId))) {
            return false;
        }
        if ((this.histFecHorIni == null && other.histFecHorIni != null) || (this.histFecHorIni != null && !this.histFecHorIni.equals(other.histFecHorIni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacionPK[turnoId=" + turnoId + ", histFecHorIni=" + histFecHorIni + "]";
    }

}
