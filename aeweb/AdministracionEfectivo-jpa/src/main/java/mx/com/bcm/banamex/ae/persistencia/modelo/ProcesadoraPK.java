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
public class ProcesadoraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private int cpaesEstructuraSirhIdn;
    @Basic(optional = false)
    @Column(name = "ETV_IDN")
    private short etvIdn;

    public ProcesadoraPK() {
    }

    public ProcesadoraPK(int cpaesEstructuraSirhIdn, short etvIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
        this.etvIdn = etvIdn;
    }

    public int getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public short getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(short etvIdn) {
        this.etvIdn = etvIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpaesEstructuraSirhIdn;
        hash += (int) etvIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcesadoraPK)) {
            return false;
        }
        ProcesadoraPK other = (ProcesadoraPK) object;
        if (this.cpaesEstructuraSirhIdn != other.cpaesEstructuraSirhIdn) {
            return false;
        }
        if (this.etvIdn != other.etvIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.ProcesadoraPK[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + ", etvIdn=" + etvIdn + "]";
    }

}
