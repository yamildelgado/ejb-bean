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
public class UnidadDeNegocioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private int cpaesEstructuraSirhIdn;
    @Basic(optional = false)
    @Column(name = "CNTRTO_NUM")
    private String cntrtoNum;
    @Basic(optional = false)
    @Column(name = "UNEG_ID")
    private short unegId;

    public UnidadDeNegocioPK() {
    }

    public UnidadDeNegocioPK(int cpaesEstructuraSirhIdn, String cntrtoNum, short unegId) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
        this.cntrtoNum = cntrtoNum;
        this.unegId = unegId;
    }

    public int getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public String getCntrtoNum() {
        return cntrtoNum;
    }

    public void setCntrtoNum(String cntrtoNum) {
        this.cntrtoNum = cntrtoNum;
    }

    public short getUnegId() {
        return unegId;
    }

    public void setUnegId(short unegId) {
        this.unegId = unegId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpaesEstructuraSirhIdn;
        hash += (cntrtoNum != null ? cntrtoNum.hashCode() : 0);
        hash += (int) unegId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadDeNegocioPK)) {
            return false;
        }
        UnidadDeNegocioPK other = (UnidadDeNegocioPK) object;
        if (this.cpaesEstructuraSirhIdn != other.cpaesEstructuraSirhIdn) {
            return false;
        }
        if ((this.cntrtoNum == null && other.cntrtoNum != null) || (this.cntrtoNum != null && !this.cntrtoNum.equals(other.cntrtoNum))) {
            return false;
        }
        if (this.unegId != other.unegId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + ", cntrtoNum=" + cntrtoNum + ", unegId=" + unegId + "]";
    }

}
