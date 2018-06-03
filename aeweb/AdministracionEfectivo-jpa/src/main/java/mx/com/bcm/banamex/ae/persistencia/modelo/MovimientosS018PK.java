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
public class MovimientosS018PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MOVS018_ID")
    private int movs018Id;
    @Basic(optional = false)
    @Column(name = "COMPBTE_ID")
    private String compbteId;

    public MovimientosS018PK() {
    }

    public MovimientosS018PK(int movs018Id, String compbteId) {
        this.movs018Id = movs018Id;
        this.compbteId = compbteId;
    }

    public int getMovs018Id() {
        return movs018Id;
    }

    public void setMovs018Id(int movs018Id) {
        this.movs018Id = movs018Id;
    }

    public String getCompbteId() {
        return compbteId;
    }

    public void setCompbteId(String compbteId) {
        this.compbteId = compbteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) movs018Id;
        hash += (compbteId != null ? compbteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosS018PK)) {
            return false;
        }
        MovimientosS018PK other = (MovimientosS018PK) object;
        if (this.movs018Id != other.movs018Id) {
            return false;
        }
        if ((this.compbteId == null && other.compbteId != null) || (this.compbteId != null && !this.compbteId.equals(other.compbteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.MovimientosS018PK[movs018Id=" + movs018Id + ", compbteId=" + compbteId + "]";
    }

}
