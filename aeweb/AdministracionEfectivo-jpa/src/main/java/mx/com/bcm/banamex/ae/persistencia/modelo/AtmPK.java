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
public class AtmPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private int cpaesEstructuraSirhIdn;
    @Basic(optional = false)
    @Column(name = "ATM_IDN")
    private short atmIdn;

    public AtmPK() {
    }

    public AtmPK(int cpaesEstructuraSirhIdn, short atmIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
        this.atmIdn = atmIdn;
    }

    public int getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public short getAtmIdn() {
        return atmIdn;
    }

    public void setAtmIdn(short atmIdn) {
        this.atmIdn = atmIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpaesEstructuraSirhIdn;
        hash += (int) atmIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtmPK)) {
            return false;
        }
        AtmPK other = (AtmPK) object;
        if (this.cpaesEstructuraSirhIdn != other.cpaesEstructuraSirhIdn) {
            return false;
        }
        if (this.atmIdn != other.atmIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.AtmPK[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + ", atmIdn=" + atmIdn + "]";
    }

}
