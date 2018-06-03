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
public class CajaHabilitadaPorTurnoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_IDN")
    private short cajaIdn;
    @Basic(optional = false)
    @Column(name = "CAJAHAB_FEC_HR_HABILITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cajahabFecHrHabilita;

    public CajaHabilitadaPorTurnoPK() {
    }

    public CajaHabilitadaPorTurnoPK(short cajaIdn, Date cajahabFecHrHabilita) {
        this.cajaIdn = cajaIdn;
        this.cajahabFecHrHabilita = cajahabFecHrHabilita;
    }

    public short getCajaIdn() {
        return cajaIdn;
    }

    public void setCajaIdn(short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public Date getCajahabFecHrHabilita() {
        return cajahabFecHrHabilita;
    }

    public void setCajahabFecHrHabilita(Date cajahabFecHrHabilita) {
        this.cajahabFecHrHabilita = cajahabFecHrHabilita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cajaIdn;
        hash += (cajahabFecHrHabilita != null ? cajahabFecHrHabilita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajaHabilitadaPorTurnoPK)) {
            return false;
        }
        CajaHabilitadaPorTurnoPK other = (CajaHabilitadaPorTurnoPK) object;
        if (this.cajaIdn != other.cajaIdn) {
            return false;
        }
        if ((this.cajahabFecHrHabilita == null && other.cajahabFecHrHabilita != null) || (this.cajahabFecHrHabilita != null && !this.cajahabFecHrHabilita.equals(other.cajahabFecHrHabilita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurnoPK[cajaIdn=" + cajaIdn + ", cajahabFecHrHabilita=" + cajahabFecHrHabilita + "]";
    }

}
