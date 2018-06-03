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
public class SubBovedaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private int cpaesEstructuraSirhIdn;
    @Basic(optional = false)
    @Column(name = "SUBBOVEDA_IDN")
    private short subbovedaIdn;

    public SubBovedaPK() {
    }

    public SubBovedaPK(int cpaesEstructuraSirhIdn, short subbovedaIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
        this.subbovedaIdn = subbovedaIdn;
    }

    public int getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public short getSubbovedaIdn() {
        return subbovedaIdn;
    }

    public void setSubbovedaIdn(short subbovedaIdn) {
        this.subbovedaIdn = subbovedaIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpaesEstructuraSirhIdn;
        hash += (int) subbovedaIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubBovedaPK)) {
            return false;
        }
        SubBovedaPK other = (SubBovedaPK) object;
        if (this.cpaesEstructuraSirhIdn != other.cpaesEstructuraSirhIdn) {
            return false;
        }
        if (this.subbovedaIdn != other.subbovedaIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.SubBovedaPK[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + ", subbovedaIdn=" + subbovedaIdn + "]";
    }

}
