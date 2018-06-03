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
public class DetalleTransferenciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRANS_IDN")
    private int transIdn;
    @Basic(optional = false)
    @Column(name = "DETALLTRANS_IDN")
    private short detalltransIdn;

    public DetalleTransferenciaPK() {
    }

    public DetalleTransferenciaPK(int transIdn, short detalltransIdn) {
        this.transIdn = transIdn;
        this.detalltransIdn = detalltransIdn;
    }

    public int getTransIdn() {
        return transIdn;
    }

    public void setTransIdn(int transIdn) {
        this.transIdn = transIdn;
    }

    public short getDetalltransIdn() {
        return detalltransIdn;
    }

    public void setDetalltransIdn(short detalltransIdn) {
        this.detalltransIdn = detalltransIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) transIdn;
        hash += (int) detalltransIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTransferenciaPK)) {
            return false;
        }
        DetalleTransferenciaPK other = (DetalleTransferenciaPK) object;
        if (this.transIdn != other.transIdn) {
            return false;
        }
        if (this.detalltransIdn != other.detalltransIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleTransferenciaPK[transIdn=" + transIdn + ", detalltransIdn=" + detalltransIdn + "]";
    }

}
