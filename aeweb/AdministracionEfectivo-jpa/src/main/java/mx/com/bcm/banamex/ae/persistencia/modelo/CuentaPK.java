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
public class CuentaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private int cpaesEstructuraSirhIdn;
    @Basic(optional = false)
    @Column(name = "CNTRTO_NUM")
    private String cntrtoNum;
    @Basic(optional = false)
    @Column(name = "UNEG_ID")
    private short unegId;
    @Basic(optional = false)
    @Column(name = "CTA_SUCURSAL_ID")
    private short ctaSucursalId;
    @Basic(optional = false)
    @Column(name = "CTA_CUENTA")
    private long ctaCuenta;

    public CuentaPK() {
    }

    public CuentaPK(int cpaesEstructuraSirhIdn, String cntrtoNum, short unegId, short ctaSucursalId, long ctaCuenta) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
        this.cntrtoNum = cntrtoNum;
        this.unegId = unegId;
        this.ctaSucursalId = ctaSucursalId;
        this.ctaCuenta = ctaCuenta;
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

    public short getCtaSucursalId() {
        return ctaSucursalId;
    }

    public void setCtaSucursalId(short ctaSucursalId) {
        this.ctaSucursalId = ctaSucursalId;
    }

    public long getCtaCuenta() {
        return ctaCuenta;
    }

    public void setCtaCuenta(long ctaCuenta) {
        this.ctaCuenta = ctaCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cpaesEstructuraSirhIdn;
        hash += (cntrtoNum != null ? cntrtoNum.hashCode() : 0);
        hash += (int) unegId;
        hash += (int) ctaSucursalId;
        hash += (int) ctaCuenta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaPK)) {
            return false;
        }
        CuentaPK other = (CuentaPK) object;
        if (this.cpaesEstructuraSirhIdn != other.cpaesEstructuraSirhIdn) {
            return false;
        }
        if ((this.cntrtoNum == null && other.cntrtoNum != null) || (this.cntrtoNum != null && !this.cntrtoNum.equals(other.cntrtoNum))) {
            return false;
        }
        if (this.unegId != other.unegId) {
            return false;
        }
        if (this.ctaSucursalId != other.ctaSucursalId) {
            return false;
        }
        if (this.ctaCuenta != other.ctaCuenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + ", cntrtoNum=" + cntrtoNum + ", unegId=" + unegId + ", ctaSucursalId=" + ctaSucursalId + ", ctaCuenta=" + ctaCuenta + "]";
    }

}
