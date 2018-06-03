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
public class DetalleInterfaceProcesadoraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DETPROC_DETALLPROC_IDN")
    private int detprocDetallprocIdn;
    @Basic(optional = false)
    @Column(name = "TIPOMOV_IDN")
    private short tipomovIdn;
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
    @Column(name = "HD_INTERPROC_FEC_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hdInterprocFecContable;

    public DetalleInterfaceProcesadoraPK() {
    }

    public DetalleInterfaceProcesadoraPK(int detprocDetallprocIdn, short tipomovIdn, int estructraSirh, short etvIdn, short hdInterprocNumCorte, Date hdInterprocFecContable) {
        this.detprocDetallprocIdn = detprocDetallprocIdn;
        this.tipomovIdn = tipomovIdn;
        this.estructraSirh = estructraSirh;
        this.etvIdn = etvIdn;
        this.hdInterprocNumCorte = hdInterprocNumCorte;
        this.hdInterprocFecContable = hdInterprocFecContable;
    }

    public int getDetprocDetallprocIdn() {
        return detprocDetallprocIdn;
    }

    public void setDetprocDetallprocIdn(int detprocDetallprocIdn) {
        this.detprocDetallprocIdn = detprocDetallprocIdn;
    }

    public short getTipomovIdn() {
        return tipomovIdn;
    }

    public void setTipomovIdn(short tipomovIdn) {
        this.tipomovIdn = tipomovIdn;
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

    public Date getHdInterprocFecContable() {
        return hdInterprocFecContable;
    }

    public void setHdInterprocFecContable(Date hdInterprocFecContable) {
        this.hdInterprocFecContable = hdInterprocFecContable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) detprocDetallprocIdn;
        hash += (int) tipomovIdn;
        hash += (int) estructraSirh;
        hash += (int) etvIdn;
        hash += (int) hdInterprocNumCorte;
        hash += (hdInterprocFecContable != null ? hdInterprocFecContable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleInterfaceProcesadoraPK)) {
            return false;
        }
        DetalleInterfaceProcesadoraPK other = (DetalleInterfaceProcesadoraPK) object;
        if (this.detprocDetallprocIdn != other.detprocDetallprocIdn) {
            return false;
        }
        if (this.tipomovIdn != other.tipomovIdn) {
            return false;
        }
        if (this.estructraSirh != other.estructraSirh) {
            return false;
        }
        if (this.etvIdn != other.etvIdn) {
            return false;
        }
        if (this.hdInterprocNumCorte != other.hdInterprocNumCorte) {
            return false;
        }
        if ((this.hdInterprocFecContable == null && other.hdInterprocFecContable != null) || (this.hdInterprocFecContable != null && !this.hdInterprocFecContable.equals(other.hdInterprocFecContable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadoraPK[detprocDetallprocIdn=" + detprocDetallprocIdn + ", tipomovIdn=" + tipomovIdn + ", estructraSirh=" + estructraSirh + ", etvIdn=" + etvIdn + ", hdInterprocNumCorte=" + hdInterprocNumCorte + ", hdInterprocFecContable=" + hdInterprocFecContable + "]";
    }

}
