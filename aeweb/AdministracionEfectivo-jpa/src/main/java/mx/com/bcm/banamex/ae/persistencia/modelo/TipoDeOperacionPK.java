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
public class TipoDeOperacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPOPER_IDN")
    private short tipoperIdn;
    @Basic(optional = false)
    @Column(name = "TENTIDAD_IDN")
    private short tentidadIdn;

    public TipoDeOperacionPK() {
    }

    public TipoDeOperacionPK(short tipoperIdn, short tentidadIdn) {
        this.tipoperIdn = tipoperIdn;
        this.tentidadIdn = tentidadIdn;
    }

    public short getTipoperIdn() {
        return tipoperIdn;
    }

    public void setTipoperIdn(short tipoperIdn) {
        this.tipoperIdn = tipoperIdn;
    }

    public short getTentidadIdn() {
        return tentidadIdn;
    }

    public void setTentidadIdn(short tentidadIdn) {
        this.tentidadIdn = tentidadIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipoperIdn;
        hash += (int) tentidadIdn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeOperacionPK)) {
            return false;
        }
        TipoDeOperacionPK other = (TipoDeOperacionPK) object;
        if (this.tipoperIdn != other.tipoperIdn) {
            return false;
        }
        if (this.tentidadIdn != other.tentidadIdn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeOperacionPK[tipoperIdn=" + tipoperIdn + ", tentidadIdn=" + tentidadIdn + "]";
    }

}
