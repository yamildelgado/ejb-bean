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
public class RecepcionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_IDN")
    private short cajaIdn;
    @Basic(optional = false)
    @Column(name = "RECEP_FEC_HR_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recepFecHrIni;
    @Basic(optional = false)
    @Column(name = "ETV_IDN")
    private short etvIdn;

    public RecepcionPK() {
    }

    public RecepcionPK(short cajaIdn, Date recepFecHrIni, short etvIdn) {
        this.cajaIdn = cajaIdn;
        this.recepFecHrIni = recepFecHrIni;
        this.etvIdn = etvIdn;
    }

    public short getCajaIdn() {
        return cajaIdn;
    }

    public void setCajaIdn(short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public Date getRecepFecHrIni() {
        return recepFecHrIni;
    }

    public void setRecepFecHrIni(Date recepFecHrIni) {
        this.recepFecHrIni = recepFecHrIni;
    }

    public short getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(short etvIdn) {
        this.etvIdn = etvIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cajaIdn;
        hash += (recepFecHrIni != null ? recepFecHrIni.hashCode() : 0);
        hash += (int) etvIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecepcionPK)) {
            return false;
        }
        RecepcionPK other = (RecepcionPK) object;
        if (this.cajaIdn != other.cajaIdn) {
            return false;
        }
        if ((this.recepFecHrIni == null && other.recepFecHrIni != null) || (this.recepFecHrIni != null && !this.recepFecHrIni.equals(other.recepFecHrIni))) {
            return false;
        }
        if (this.etvIdn != other.etvIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.RecepcionPK[cajaIdn=" + cajaIdn + ", recepFecHrIni=" + recepFecHrIni + ", etvIdn=" + etvIdn + "]";
    }

}
