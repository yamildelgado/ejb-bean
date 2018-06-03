/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jcarbajal
 */
@Embeddable
public class DenominacionDeDivisaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DIVISA_ID")
    private short divisaId;
    @Basic(optional = false)
    @Column(name = "DENOM_TIPO_BILL_MON")
    private String denomTipoBillMon;
    @Basic(optional = false)
    @Column(name = "DENOM_DENOMINACION")
    private BigDecimal denomDenominacion;

    public DenominacionDeDivisaPK() {
    }

    public DenominacionDeDivisaPK(short divisaId, String denomTipoBillMon, BigDecimal denomDenominacion) {
        this.divisaId = divisaId;
        this.denomTipoBillMon = denomTipoBillMon;
        this.denomDenominacion = denomDenominacion;
    }

    public short getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(short divisaId) {
        this.divisaId = divisaId;
    }

    public String getDenomTipoBillMon() {
        return denomTipoBillMon;
    }

    public void setDenomTipoBillMon(String denomTipoBillMon) {
        this.denomTipoBillMon = denomTipoBillMon;
    }

    public BigDecimal getDenomDenominacion() {
        return denomDenominacion;
    }

    public void setDenomDenominacion(BigDecimal denomDenominacion) {
        this.denomDenominacion = denomDenominacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) divisaId;
        hash += (denomTipoBillMon != null ? denomTipoBillMon.hashCode() : 0);
        hash += (denomDenominacion != null ? denomDenominacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DenominacionDeDivisaPK)) {
            return false;
        }
        DenominacionDeDivisaPK other = (DenominacionDeDivisaPK) object;
        if (this.divisaId != other.divisaId) {
            return false;
        }
        if ((this.denomTipoBillMon == null && other.denomTipoBillMon != null) || (this.denomTipoBillMon != null && !this.denomTipoBillMon.equals(other.denomTipoBillMon))) {
            return false;
        }
        if ((this.denomDenominacion == null && other.denomDenominacion != null) || (this.denomDenominacion != null && !this.denomDenominacion.equals(other.denomDenominacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisaPK[divisaId=" + divisaId + ", denomTipoBillMon=" + denomTipoBillMon + ", denomDenominacion=" + denomDenominacion + "]";
    }

}
