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
@Table(name = "DETALLE_DOTACION")
@NamedQueries({
    @NamedQuery(name = "DetalleDotacion.findAll", query = "SELECT d FROM DetalleDotacion d"),
    @NamedQuery(name = "DetalleDotacion.findBySolicitudIdn", query = "SELECT d FROM DetalleDotacion d WHERE d.detalleDotacionPK.solicitudIdn = :solicitudIdn"),
    @NamedQuery(name = "DetalleDotacion.findByDetlldenomIdn", query = "SELECT d FROM DetalleDotacion d WHERE d.detalleDotacionPK.detlldenomIdn = :detlldenomIdn"),
    @NamedQuery(name = "DetalleDotacion.findByCantidad", query = "SELECT d FROM DetalleDotacion d WHERE d.cantidad = :cantidad")})
public class DetalleDotacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleDotacionPK detalleDotacionPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumns({
        @JoinColumn(name = "DIVISA_ID", referencedColumnName = "DIVISA_ID"),
        @JoinColumn(name = "DENOM_TIPO_BILL_MON", referencedColumnName = "DENOM_TIPO_BILL_MON"),
        @JoinColumn(name = "DENOM_DENOMINACION", referencedColumnName = "DENOM_DENOMINACION")})
    @ManyToOne(optional = false)
    private DenominacionDeDivisa denominacionDeDivisa;
    @JoinColumn(name = "SOLICITUD_IDN", referencedColumnName = "SOLICITUD_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SolicitudDotacion solicitudDotacion;

    public DetalleDotacion() {
    }

    public DetalleDotacion(DetalleDotacionPK detalleDotacionPK) {
        this.detalleDotacionPK = detalleDotacionPK;
    }

    public DetalleDotacion(long solicitudIdn, short detlldenomIdn) {
        this.detalleDotacionPK = new DetalleDotacionPK(solicitudIdn, detlldenomIdn);
    }

    public DetalleDotacionPK getDetalleDotacionPK() {
        return detalleDotacionPK;
    }

    public void setDetalleDotacionPK(DetalleDotacionPK detalleDotacionPK) {
        this.detalleDotacionPK = detalleDotacionPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public DenominacionDeDivisa getDenominacionDeDivisa() {
        return denominacionDeDivisa;
    }

    public void setDenominacionDeDivisa(DenominacionDeDivisa denominacionDeDivisa) {
        this.denominacionDeDivisa = denominacionDeDivisa;
    }

    public SolicitudDotacion getSolicitudDotacion() {
        return solicitudDotacion;
    }

    public void setSolicitudDotacion(SolicitudDotacion solicitudDotacion) {
        this.solicitudDotacion = solicitudDotacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleDotacionPK != null ? detalleDotacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDotacion)) {
            return false;
        }
        DetalleDotacion other = (DetalleDotacion) object;
        if ((this.detalleDotacionPK == null && other.detalleDotacionPK != null) || (this.detalleDotacionPK != null && !this.detalleDotacionPK.equals(other.detalleDotacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDotacion[detalleDotacionPK=" + detalleDotacionPK + "]";
    }

}
