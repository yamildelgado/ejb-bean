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
public class CabceraInterfProcdoraTotlsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ESTRUCTRA_SIRH")
    private int estructraSirh;
    @Basic(optional = false)
    @Column(name = "ETV_IDN")
    private short etvIdn;
    @Basic(optional = false)
    @Column(name = "HD_INTERPROC_NUM_CORTE")
    private short hdInterprocNumCorte;
    @Basic(optional = false)
    @Column(name = "HD_INTERPROC_FEC_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hdInterprocFecReal;
    @Basic(optional = false)
    @Column(name = "HD_INTERPROC_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hdInterprocFecContable;
    @Basic(optional = false)
    @Column(name = "HD_INTERPROC_HR_CORTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hdInterprocHrCorte;

    public CabceraInterfProcdoraTotlsPK() {
    }

    public CabceraInterfProcdoraTotlsPK(int estructraSirh, short etvIdn, short hdInterprocNumCorte, Date hdInterprocFecReal, Date hdInterprocFecContable, Date hdInterprocHrCorte) {
        this.estructraSirh = estructraSirh;
        this.etvIdn = etvIdn;
        this.hdInterprocNumCorte = hdInterprocNumCorte;
        this.hdInterprocFecReal = hdInterprocFecReal;
        this.hdInterprocFecContable = hdInterprocFecContable;
        this.hdInterprocHrCorte = hdInterprocHrCorte;
    }

    public int getEstructraSirh() {
        return estructraSirh;
    }

    public void setEstructraSirh(int estructraSirh) {
        this.estructraSirh = estructraSirh;
    }

    public short getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(short etvIdn) {
        this.etvIdn = etvIdn;
    }

    public short getHdInterprocNumCorte() {
        return hdInterprocNumCorte;
    }

    public void setHdInterprocNumCorte(short hdInterprocNumCorte) {
        this.hdInterprocNumCorte = hdInterprocNumCorte;
    }

    public Date getHdInterprocFecReal() {
        return hdInterprocFecReal;
    }

    public void setHdInterprocFecReal(Date hdInterprocFecReal) {
        this.hdInterprocFecReal = hdInterprocFecReal;
    }

    public Date getHdInterprocFecContable() {
        return hdInterprocFecContable;
    }

    public void setHdInterprocFecContable(Date hdInterprocFecContable) {
        this.hdInterprocFecContable = hdInterprocFecContable;
    }

    public Date getHdInterprocHrCorte() {
        return hdInterprocHrCorte;
    }

    public void setHdInterprocHrCorte(Date hdInterprocHrCorte) {
        this.hdInterprocHrCorte = hdInterprocHrCorte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) estructraSirh;
        hash += (int) etvIdn;
        hash += (int) hdInterprocNumCorte;
        hash += (hdInterprocFecReal != null ? hdInterprocFecReal.hashCode() : 0);
        hash += (hdInterprocFecContable != null ? hdInterprocFecContable.hashCode() : 0);
        hash += (hdInterprocHrCorte != null ? hdInterprocHrCorte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabceraInterfProcdoraTotlsPK)) {
            return false;
        }
        CabceraInterfProcdoraTotlsPK other = (CabceraInterfProcdoraTotlsPK) object;
        if (this.estructraSirh != other.estructraSirh) {
            return false;
        }
        if (this.etvIdn != other.etvIdn) {
            return false;
        }
        if (this.hdInterprocNumCorte != other.hdInterprocNumCorte) {
            return false;
        }
        if ((this.hdInterprocFecReal == null && other.hdInterprocFecReal != null) || (this.hdInterprocFecReal != null && !this.hdInterprocFecReal.equals(other.hdInterprocFecReal))) {
            return false;
        }
        if ((this.hdInterprocFecContable == null && other.hdInterprocFecContable != null) || (this.hdInterprocFecContable != null && !this.hdInterprocFecContable.equals(other.hdInterprocFecContable))) {
            return false;
        }
        if ((this.hdInterprocHrCorte == null && other.hdInterprocHrCorte != null) || (this.hdInterprocHrCorte != null && !this.hdInterprocHrCorte.equals(other.hdInterprocHrCorte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CabceraInterfProcdoraTotlsPK[estructraSirh=" + estructraSirh + ", etvIdn=" + etvIdn + ", hdInterprocNumCorte=" + hdInterprocNumCorte + ", hdInterprocFecReal=" + hdInterprocFecReal + ", hdInterprocFecContable=" + hdInterprocFecContable + ", hdInterprocHrCorte=" + hdInterprocHrCorte + "]";
    }

}
