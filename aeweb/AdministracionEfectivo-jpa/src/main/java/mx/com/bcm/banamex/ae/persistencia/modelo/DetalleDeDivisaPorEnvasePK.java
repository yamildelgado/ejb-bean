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
public class DetalleDeDivisaPorEnvasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPBTE_ID")
    private String compbteId;
    @Basic(optional = false)
    @Column(name = "ENVC_NUM_PLOMO")
    private String envcNumPlomo;
    @Basic(optional = false)
    @Column(name = "TDETALLE_IDN")
    private short tdetalleIdn;

    public DetalleDeDivisaPorEnvasePK() {
    }

    public DetalleDeDivisaPorEnvasePK(String compbteId, String envcNumPlomo, short tdetalleIdn) {
        this.compbteId = compbteId;
        this.envcNumPlomo = envcNumPlomo;
        this.tdetalleIdn = tdetalleIdn;
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

    public short getTdetalleIdn() {
        return tdetalleIdn;
    }

    public void setTdetalleIdn(short tdetalleIdn) {
        this.tdetalleIdn = tdetalleIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compbteId != null ? compbteId.hashCode() : 0);
        hash += (envcNumPlomo != null ? envcNumPlomo.hashCode() : 0);
        hash += (int) tdetalleIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDeDivisaPorEnvasePK)) {
            return false;
        }
        DetalleDeDivisaPorEnvasePK other = (DetalleDeDivisaPorEnvasePK) object;
        if ((this.compbteId == null && other.compbteId != null) || (this.compbteId != null && !this.compbteId.equals(other.compbteId))) {
            return false;
        }
        if ((this.envcNumPlomo == null && other.envcNumPlomo != null) || (this.envcNumPlomo != null && !this.envcNumPlomo.equals(other.envcNumPlomo))) {
            return false;
        }
        if (this.tdetalleIdn != other.tdetalleIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDeDivisaPorEnvasePK[compbteId=" + compbteId + ", envcNumPlomo=" + envcNumPlomo + ", tdetalleIdn=" + tdetalleIdn + "]";
    }

}
