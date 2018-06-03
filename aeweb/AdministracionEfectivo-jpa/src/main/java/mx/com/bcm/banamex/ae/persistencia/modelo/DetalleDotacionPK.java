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
public class DetalleDotacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SOLICITUD_IDN")
    private long solicitudIdn;
    @Basic(optional = false)
    @Column(name = "DETLLDENOM_IDN")
    private short detlldenomIdn;

    public DetalleDotacionPK() {
    }

    public DetalleDotacionPK(long solicitudIdn, short detlldenomIdn) {
        this.solicitudIdn = solicitudIdn;
        this.detlldenomIdn = detlldenomIdn;
    }

    public long getSolicitudIdn() {
        return solicitudIdn;
    }

    public void setSolicitudIdn(long solicitudIdn) {
        this.solicitudIdn = solicitudIdn;
    }

    public short getDetlldenomIdn() {
        return detlldenomIdn;
    }

    public void setDetlldenomIdn(short detlldenomIdn) {
        this.detlldenomIdn = detlldenomIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) solicitudIdn;
        hash += (int) detlldenomIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDotacionPK)) {
            return false;
        }
        DetalleDotacionPK other = (DetalleDotacionPK) object;
        if (this.solicitudIdn != other.solicitudIdn) {
            return false;
        }
        if (this.detlldenomIdn != other.detlldenomIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDotacionPK[solicitudIdn=" + solicitudIdn + ", detlldenomIdn=" + detlldenomIdn + "]";
    }

}
