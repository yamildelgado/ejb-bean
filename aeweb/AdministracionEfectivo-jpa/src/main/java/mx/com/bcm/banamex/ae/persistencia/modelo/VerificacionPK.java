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
public class VerificacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_IDN")
    private short cajaIdn;
    @Basic(optional = false)
    @Column(name = "VERIFN_FEC_HR_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date verifnFecHrIni;

    public VerificacionPK() {
    }

    public VerificacionPK(short cajaIdn, Date verifnFecHrIni) {
        this.cajaIdn = cajaIdn;
        this.verifnFecHrIni = verifnFecHrIni;
    }

    public short getCajaIdn() {
        return cajaIdn;
    }

    public void setCajaIdn(short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public Date getVerifnFecHrIni() {
        return verifnFecHrIni;
    }

    public void setVerifnFecHrIni(Date verifnFecHrIni) {
        this.verifnFecHrIni = verifnFecHrIni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cajaIdn;
        hash += (verifnFecHrIni != null ? verifnFecHrIni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VerificacionPK)) {
            return false;
        }
        VerificacionPK other = (VerificacionPK) object;
        if (this.cajaIdn != other.cajaIdn) {
            return false;
        }
        if ((this.verifnFecHrIni == null && other.verifnFecHrIni != null) || (this.verifnFecHrIni != null && !this.verifnFecHrIni.equals(other.verifnFecHrIni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.VerificacionPK[cajaIdn=" + cajaIdn + ", verifnFecHrIni=" + verifnFecHrIni + "]";
    }

}
