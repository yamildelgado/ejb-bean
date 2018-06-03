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
public class EnvasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPBTE_ID")
    private String compbteId;
    @Basic(optional = false)
    @Column(name = "ENVC_NUM_PLOMO")
    private String envcNumPlomo;

    public EnvasePK() {
    }

    public EnvasePK(String compbteId, String envcNumPlomo) {
        this.compbteId = compbteId;
        this.envcNumPlomo = envcNumPlomo;
    }

    public String getCompbteId() {
        return compbteId;
    }

    public void setCompbteId(String compbteId) {
        this.compbteId = compbteId;
    }

    public String getEnvcNumPlomo() {
        return envcNumPlomo;
    }

    public void setEnvcNumPlomo(String envcNumPlomo) {
        this.envcNumPlomo = envcNumPlomo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compbteId != null ? compbteId.hashCode() : 0);
        hash += (envcNumPlomo != null ? envcNumPlomo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnvasePK)) {
            return false;
        }
        EnvasePK other = (EnvasePK) object;
        if ((this.compbteId == null && other.compbteId != null) || (this.compbteId != null && !this.compbteId.equals(other.compbteId))) {
            return false;
        }
        if ((this.envcNumPlomo == null && other.envcNumPlomo != null) || (this.envcNumPlomo != null && !this.envcNumPlomo.equals(other.envcNumPlomo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.EnvasePK[compbteId=" + compbteId + ", envcNumPlomo=" + envcNumPlomo + "]";
    }

}
