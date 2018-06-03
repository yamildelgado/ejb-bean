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
public class DetalleDeCortePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CORTE_IDN")
    private int corteIdn;
    @Basic(optional = false)
    @Column(name = "DET_CORTE_IDN")
    private short detCorteIdn;

    public DetalleDeCortePK() {
    }

    public DetalleDeCortePK(int corteIdn, short detCorteIdn) {
        this.corteIdn = corteIdn;
        this.detCorteIdn = detCorteIdn;
    }

    public int getCorteIdn() {
        return corteIdn;
    }

    public void setCorteIdn(int corteIdn) {
        this.corteIdn = corteIdn;
    }

    public short getDetCorteIdn() {
        return detCorteIdn;
    }

    public void setDetCorteIdn(short detCorteIdn) {
        this.detCorteIdn = detCorteIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) corteIdn;
        hash += (int) detCorteIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDeCortePK)) {
            return false;
        }
        DetalleDeCortePK other = (DetalleDeCortePK) object;
        if (this.corteIdn != other.corteIdn) {
            return false;
        }
        if (this.detCorteIdn != other.detCorteIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDeCortePK[corteIdn=" + corteIdn + ", detCorteIdn=" + detCorteIdn + "]";
    }

}
