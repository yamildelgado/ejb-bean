/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Embeddable
public class TransferenciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRANS_IDN")
    private int transIdn;
    @Basic(optional = false)
    @Column(name = "TRANS_FEC_HR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transFecHr;

    public TransferenciaPK() {
    }

    public TransferenciaPK(int transIdn, Date transFecHr) {
        this.transIdn = transIdn;
        this.transFecHr = transFecHr;
    }

    public int getTransIdn() {
        return transIdn;
    }

    public void setTransIdn(int transIdn) {
        this.transIdn = transIdn;
    }

    public Date getTransFecHr() {
        return transFecHr;
    }

    public void setTransFecHr(Date transFecHr) {
        this.transFecHr = transFecHr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) transIdn;
        hash += (transFecHr != null ? transFecHr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransferenciaPK)) {
            return false;
        }
        TransferenciaPK other = (TransferenciaPK) object;
        if (this.transIdn != other.transIdn) {
            return false;
        }
        if ((this.transFecHr == null && other.transFecHr != null) || (this.transFecHr != null && !this.transFecHr.equals(other.transFecHr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TransferenciaPK[transIdn=" + transIdn + ", transFecHr=" + transFecHr + "]";
    }

}
