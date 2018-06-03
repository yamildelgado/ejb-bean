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
public class CortePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CORTE_IDN_CORTE")
    private int corteIdnCorte;
    @Basic(optional = false)
    @Column(name = "CORTE_FEC_HR_CORTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date corteFecHrCorte;

    public CortePK() {
    }

    public CortePK(int corteIdnCorte, Date corteFecHrCorte) {
        this.corteIdnCorte = corteIdnCorte;
        this.corteFecHrCorte = corteFecHrCorte;
    }

    public int getCorteIdnCorte() {
        return corteIdnCorte;
    }

    public void setCorteIdnCorte(int corteIdnCorte) {
        this.corteIdnCorte = corteIdnCorte;
    }

    public Date getCorteFecHrCorte() {
        return corteFecHrCorte;
    }

    public void setCorteFecHrCorte(Date corteFecHrCorte) {
        this.corteFecHrCorte = corteFecHrCorte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) corteIdnCorte;
        hash += (corteFecHrCorte != null ? corteFecHrCorte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CortePK)) {
            return false;
        }
        CortePK other = (CortePK) object;
        if (this.corteIdnCorte != other.corteIdnCorte) {
            return false;
        }
        if ((this.corteFecHrCorte == null && other.corteFecHrCorte != null) || (this.corteFecHrCorte != null && !this.corteFecHrCorte.equals(other.corteFecHrCorte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CortePK[corteIdnCorte=" + corteIdnCorte + ", corteFecHrCorte=" + corteFecHrCorte + "]";
    }

}
