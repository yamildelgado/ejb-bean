/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "DETALLE_DE_DIVISA_POR_ENVASE")
@NamedQueries({
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findAll", query = "SELECT d FROM DetalleDeDivisaPorEnvase d"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByCompbteId", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.detalleDeDivisaPorEnvasePK.compbteId = :compbteId"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByEnvcNumPlomo", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.detalleDeDivisaPorEnvasePK.envcNumPlomo = :envcNumPlomo"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByTdetalleIdn", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.detalleDeDivisaPorEnvasePK.tdetalleIdn = :tdetalleIdn"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByTdetalleTipoMoneda", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.tdetalleTipoMoneda = :tdetalleTipoMoneda"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByTdetalleDenominacion", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.tdetalleDenominacion = :tdetalleDenominacion"),
    @NamedQuery(name = "DetalleDeDivisaPorEnvase.findByTdetalleCantidad", query = "SELECT d FROM DetalleDeDivisaPorEnvase d WHERE d.tdetalleCantidad = :tdetalleCantidad")})
public class DetalleDeDivisaPorEnvase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleDeDivisaPorEnvasePK detalleDeDivisaPorEnvasePK;
    @Column(name = "TDETALLE_TIPO_MONEDA")
    private Character tdetalleTipoMoneda;
    @Column(name = "TDETALLE_DENOMINACION")
    private Double tdetalleDenominacion;
    @Column(name = "TDETALLE_CANTIDAD")
    private Short tdetalleCantidad;
    @JoinColumn(name = "DIVISA_ID", referencedColumnName = "DIVISA_ID")
    @ManyToOne
    private Divisa divisaId;
    @JoinColumns({
        @JoinColumn(name = "ENVC_NUM_PLOMO", referencedColumnName = "ENVC_NUM_PLOMO", insertable = false, updatable = false),
        @JoinColumn(name = "COMPBTE_ID", referencedColumnName = "COMPBTE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Envase envase;

    public DetalleDeDivisaPorEnvase() {
    }

    public DetalleDeDivisaPorEnvase(DetalleDeDivisaPorEnvasePK detalleDeDivisaPorEnvasePK) {
        this.detalleDeDivisaPorEnvasePK = detalleDeDivisaPorEnvasePK;
    }

    public DetalleDeDivisaPorEnvase(String compbteId, String envcNumPlomo, short tdetalleIdn) {
        this.detalleDeDivisaPorEnvasePK = new DetalleDeDivisaPorEnvasePK(compbteId, envcNumPlomo, tdetalleIdn);
    }

    public DetalleDeDivisaPorEnvasePK getDetalleDeDivisaPorEnvasePK() {
        return detalleDeDivisaPorEnvasePK;
    }

    public void setDetalleDeDivisaPorEnvasePK(DetalleDeDivisaPorEnvasePK detalleDeDivisaPorEnvasePK) {
        this.detalleDeDivisaPorEnvasePK = detalleDeDivisaPorEnvasePK;
    }

    public Character getTdetalleTipoMoneda() {
        return tdetalleTipoMoneda;
    }

    public void setTdetalleTipoMoneda(Character tdetalleTipoMoneda) {
        this.tdetalleTipoMoneda = tdetalleTipoMoneda;
    }

    public Double getTdetalleDenominacion() {
        return tdetalleDenominacion;
    }

    public void setTdetalleDenominacion(Double tdetalleDenominacion) {
        this.tdetalleDenominacion = tdetalleDenominacion;
    }

    public Short getTdetalleCantidad() {
        return tdetalleCantidad;
    }

    public void setTdetalleCantidad(Short tdetalleCantidad) {
        this.tdetalleCantidad = tdetalleCantidad;
    }

    public Divisa getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(Divisa divisaId) {
        this.divisaId = divisaId;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleDeDivisaPorEnvasePK != null ? detalleDeDivisaPorEnvasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDeDivisaPorEnvase)) {
            return false;
        }
        DetalleDeDivisaPorEnvase other = (DetalleDeDivisaPorEnvase) object;
        if ((this.detalleDeDivisaPorEnvasePK == null && other.detalleDeDivisaPorEnvasePK != null) || (this.detalleDeDivisaPorEnvasePK != null && !this.detalleDeDivisaPorEnvasePK.equals(other.detalleDeDivisaPorEnvasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDeDivisaPorEnvase[detalleDeDivisaPorEnvasePK=" + detalleDeDivisaPorEnvasePK + "]";
    }

}
