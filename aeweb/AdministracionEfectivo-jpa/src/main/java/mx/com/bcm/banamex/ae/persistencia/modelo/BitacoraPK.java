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
public class BitacoraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BITAC_CPAE")
    private short bitacCpae;
    @Basic(optional = false)
    @Column(name = "BITAC_IDN")
    private long bitacIdn;

    public BitacoraPK() {
    }

    public BitacoraPK(short bitacCpae, long bitacIdn) {
        this.bitacCpae = bitacCpae;
        this.bitacIdn = bitacIdn;
    }

    public short getBitacCpae() {
        return bitacCpae;
    }

    public void setBitacCpae(short bitacCpae) {
        this.bitacCpae = bitacCpae;
    }

    public long getBitacIdn() {
        return bitacIdn;
    }

    public void setBitacIdn(long bitacIdn) {
        this.bitacIdn = bitacIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bitacCpae;
        hash += (int) bitacIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraPK)) {
            return false;
        }
        BitacoraPK other = (BitacoraPK) object;
        if (this.bitacCpae != other.bitacCpae) {
            return false;
        }
        if (this.bitacIdn != other.bitacIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.BitacoraPK[bitacCpae=" + bitacCpae + ", bitacIdn=" + bitacIdn + "]";
    }

}
