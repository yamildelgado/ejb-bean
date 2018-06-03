/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "DENOMINACION_DE_DIVISA")
@NamedQueries({
    @NamedQuery(name = "DenominacionDeDivisa.findAll", query = "SELECT d FROM DenominacionDeDivisa d"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDivisaId", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denominacionDeDivisaPK.divisaId = :divisaId"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDenomTipoBillMon", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denominacionDeDivisaPK.denomTipoBillMon = :denomTipoBillMon"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDenomDenominacion", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denominacionDeDivisaPK.denomDenominacion = :denomDenominacion"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDenomNombreDenominacion", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denomNombreDenominacion = :denomNombreDenominacion"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDenomCirculacion", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denomCirculacion = :denomCirculacion"),
    @NamedQuery(name = "DenominacionDeDivisa.findByDenomBajaLogica", query = "SELECT d FROM DenominacionDeDivisa d WHERE d.denomBajaLogica = :denomBajaLogica")})
public class DenominacionDeDivisa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DenominacionDeDivisaPK denominacionDeDivisaPK;
    @Column(name = "DENOM_NOMBRE_DENOMINACION")
    private String denomNombreDenominacion;
    @Column(name = "DENOM_CIRCULACION")
    private Short denomCirculacion;
    @Column(name = "DENOM_BAJA_LOGICA")
    private String denomBajaLogica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "denominacionDeDivisa")
    private List<DetalleDotacion> detalleDotacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "denominacionDeDivisa")
    private List<DetalleDeMovimientoS018> detalleDeMovimientoS018List;
    @JoinColumn(name = "DIVISA_ID", referencedColumnName = "DIVISA_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Divisa divisa;

    public DenominacionDeDivisa() {
    }

    public DenominacionDeDivisa(DenominacionDeDivisaPK denominacionDeDivisaPK) {
        this.denominacionDeDivisaPK = denominacionDeDivisaPK;
    }

    public DenominacionDeDivisa(short divisaId, String denomTipoBillMon, BigDecimal denomDenominacion) {
        this.denominacionDeDivisaPK = new DenominacionDeDivisaPK(divisaId, denomTipoBillMon, denomDenominacion);
    }

    public DenominacionDeDivisaPK getDenominacionDeDivisaPK() {
        return denominacionDeDivisaPK;
    }

    public void setDenominacionDeDivisaPK(DenominacionDeDivisaPK denominacionDeDivisaPK) {
        this.denominacionDeDivisaPK = denominacionDeDivisaPK;
    }

    public String getDenomNombreDenominacion() {
        return denomNombreDenominacion;
    }

    public void setDenomNombreDenominacion(String denomNombreDenominacion) {
        this.denomNombreDenominacion = denomNombreDenominacion;
    }

    public Short getDenomCirculacion() {
        return denomCirculacion;
    }

    public void setDenomCirculacion(Short denomCirculacion) {
        this.denomCirculacion = denomCirculacion;
    }

    public String getDenomBajaLogica() {
        return denomBajaLogica;
    }

    public void setDenomBajaLogica(String denomBajaLogica) {
        this.denomBajaLogica = denomBajaLogica;
    }

    public List<DetalleDotacion> getDetalleDotacionList() {
        return detalleDotacionList;
    }

    public void setDetalleDotacionList(List<DetalleDotacion> detalleDotacionList) {
        this.detalleDotacionList = detalleDotacionList;
    }

    public List<DetalleDeMovimientoS018> getDetalleDeMovimientoS018List() {
        return detalleDeMovimientoS018List;
    }

    public void setDetalleDeMovimientoS018List(List<DetalleDeMovimientoS018> detalleDeMovimientoS018List) {
        this.detalleDeMovimientoS018List = detalleDeMovimientoS018List;
    }

    public Divisa getDivisa() {
        return divisa;
    }

    public void setDivisa(Divisa divisa) {
        this.divisa = divisa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (denominacionDeDivisaPK != null ? denominacionDeDivisaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DenominacionDeDivisa)) {
            return false;
        }
        DenominacionDeDivisa other = (DenominacionDeDivisa) object;
        if ((this.denominacionDeDivisaPK == null && other.denominacionDeDivisaPK != null) || (this.denominacionDeDivisaPK != null && !this.denominacionDeDivisaPK.equals(other.denominacionDeDivisaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa[denominacionDeDivisaPK=" + denominacionDeDivisaPK + "]";
    }

}
