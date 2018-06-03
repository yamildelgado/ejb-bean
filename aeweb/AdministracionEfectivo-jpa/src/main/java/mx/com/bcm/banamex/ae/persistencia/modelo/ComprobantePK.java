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
public class ComprobantePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPBTE_ID")
    private String compbteId;
    @Basic(optional = false)
    @Column(name = "ETV_IDN")
    private short etvIdn;

    public ComprobantePK() {
    }

    public ComprobantePK(String compbteId, short etvIdn) {
        this.compbteId = compbteId;
        this.etvIdn = etvIdn;
    }

    public String getCompbteId() {
        return compbteId;
    }

    public void setCompbteId(String compbteId) {
        this.compbteId = compbteId;
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
        hash += (compbteId != null ? compbteId.hashCode() : 0);
        hash += (int) etvIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprobantePK)) {
            return false;
        }
        ComprobantePK other = (ComprobantePK) object;
        if ((this.compbteId == null && other.compbteId != null) || (this.compbteId != null && !this.compbteId.equals(other.compbteId))) {
            return false;
        }
        if (this.etvIdn != other.etvIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.ComprobantePK[compbteId=" + compbteId + ", etvIdn=" + etvIdn + "]";
    }

}
