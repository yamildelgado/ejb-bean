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
public class CatGeneralAewebPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGRUPADOR_IDN")
    private short agrupadorIdn;
    @Basic(optional = false)
    @Column(name = "AEWEBCATGRAL_IDN")
    private short aewebcatgralIdn;

    public CatGeneralAewebPK() {
    }

    public CatGeneralAewebPK(short agrupadorIdn, short aewebcatgralIdn) {
        this.agrupadorIdn = agrupadorIdn;
        this.aewebcatgralIdn = aewebcatgralIdn;
    }

    public short getAgrupadorIdn() {
        return agrupadorIdn;
    }

    public void setAgrupadorIdn(short agrupadorIdn) {
        this.agrupadorIdn = agrupadorIdn;
    }

    public short getAewebcatgralIdn() {
        return aewebcatgralIdn;
    }

    public void setAewebcatgralIdn(short aewebcatgralIdn) {
        this.aewebcatgralIdn = aewebcatgralIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) agrupadorIdn;
        hash += (int) aewebcatgralIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatGeneralAewebPK)) {
            return false;
        }
        CatGeneralAewebPK other = (CatGeneralAewebPK) object;
        if (this.agrupadorIdn != other.agrupadorIdn) {
            return false;
        }
        if (this.aewebcatgralIdn != other.aewebcatgralIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAewebPK[agrupadorIdn=" + agrupadorIdn + ", aewebcatgralIdn=" + aewebcatgralIdn + "]";
    }

}
