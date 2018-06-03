/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jcarbajal
 */
@Embeddable
public class CajasDeTurnoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_IDN")
    private short cajaIdn;
    @Basic(optional = false)
    @Column(name = "TURNO_ID")
    private String turnoId;

    public CajasDeTurnoPK() {
    }

    public CajasDeTurnoPK(short cajaIdn, String turnoId) {
        this.cajaIdn = cajaIdn;
        this.turnoId = turnoId;
    }

    public short getCajaIdn() {
        return cajaIdn;
    }

    public void setCajaIdn(short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public String getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(String turnoId) {
        this.turnoId = turnoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cajaIdn;
        hash += (turnoId != null ? turnoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajasDeTurnoPK)) {
            return false;
        }
        CajasDeTurnoPK other = (CajasDeTurnoPK) object;
        if (this.cajaIdn != other.cajaIdn) {
            return false;
        }
        if ((this.turnoId == null && other.turnoId != null) || (this.turnoId != null && !this.turnoId.equals(other.turnoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurnoPK[cajaIdn=" + cajaIdn + ", turnoId=" + turnoId + "]";
    }

}
