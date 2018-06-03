/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DETALLE_DE_MOVIMIENTO_S018")
@NamedQueries({
    @NamedQuery(name = "DetalleDeMovimientoS018.findAll", query = "SELECT d FROM DetalleDeMovimientoS018 d"),
    @NamedQuery(name = "DetalleDeMovimientoS018.findByTdetmovs018Id", query = "SELECT d FROM DetalleDeMovimientoS018 d WHERE d.tdetmovs018Id = :tdetmovs018Id"),
    @NamedQuery(name = "DetalleDeMovimientoS018.findByTdetmovs018TipoMoneda", query = "SELECT d FROM DetalleDeMovimientoS018 d WHERE d.tdetmovs018TipoMoneda = :tdetmovs018TipoMoneda"),
    @NamedQuery(name = "DetalleDeMovimientoS018.findByTdetmovs018Denominacion", query = "SELECT d FROM DetalleDeMovimientoS018 d WHERE d.tdetmovs018Denominacion = :tdetmovs018Denominacion"),
    @NamedQuery(name = "DetalleDeMovimientoS018.findByTdetmovs018Cantidad", query = "SELECT d FROM DetalleDeMovimientoS018 d WHERE d.tdetmovs018Cantidad = :tdetmovs018Cantidad")})
public class DetalleDeMovimientoS018 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TDETMOVS018_ID")
    private Integer tdetmovs018Id;
    @Column(name = "TDETMOVS018_TIPO_MONEDA")
    private Character tdetmovs018TipoMoneda;
    @Column(name = "TDETMOVS018_DENOMINACION")
    private BigDecimal tdetmovs018Denominacion;
    @Column(name = "TDETMOVS018_CANTIDAD")
    private Short tdetmovs018Cantidad;
    @JoinColumns({
        @JoinColumn(name = "DENOM_DIVISA_ID", referencedColumnName = "DIVISA_ID"),
        @JoinColumn(name = "DENOM_TIPO_BILL_MON", referencedColumnName = "DENOM_TIPO_BILL_MON"),
        @JoinColumn(name = "DENOM_DENOMINACION", referencedColumnName = "DENOM_DENOMINACION")})
    @ManyToOne(optional = false)
    private DenominacionDeDivisa denominacionDeDivisa;
    @JoinColumns({
        @JoinColumn(name = "MOVS018_ID", referencedColumnName = "MOVS018_ID"),
        @JoinColumn(name = "COMPBTE_ID", referencedColumnName = "COMPBTE_ID")})
    @ManyToOne
    private MovimientosS018 movimientosS018;

    public DetalleDeMovimientoS018() {
    }

    public DetalleDeMovimientoS018(Integer tdetmovs018Id) {
        this.tdetmovs018Id = tdetmovs018Id;
    }

    public Integer getTdetmovs018Id() {
        return tdetmovs018Id;
    }

    public void setTdetmovs018Id(Integer tdetmovs018Id) {
        this.tdetmovs018Id = tdetmovs018Id;
    }

    public Character getTdetmovs018TipoMoneda() {
        return tdetmovs018TipoMoneda;
    }

    public void setTdetmovs018TipoMoneda(Character tdetmovs018TipoMoneda) {
        this.tdetmovs018TipoMoneda = tdetmovs018TipoMoneda;
    }

    public BigDecimal getTdetmovs018Denominacion() {
        return tdetmovs018Denominacion;
    }

    public void setTdetmovs018Denominacion(BigDecimal tdetmovs018Denominacion) {
        this.tdetmovs018Denominacion = tdetmovs018Denominacion;
    }

    public Short getTdetmovs018Cantidad() {
        return tdetmovs018Cantidad;
    }

    public void setTdetmovs018Cantidad(Short tdetmovs018Cantidad) {
        this.tdetmovs018Cantidad = tdetmovs018Cantidad;
    }

    public DenominacionDeDivisa getDenominacionDeDivisa() {
        return denominacionDeDivisa;
    }

    public void setDenominacionDeDivisa(DenominacionDeDivisa denominacionDeDivisa) {
        this.denominacionDeDivisa = denominacionDeDivisa;
    }

    public MovimientosS018 getMovimientosS018() {
        return movimientosS018;
    }

    public void setMovimientosS018(MovimientosS018 movimientosS018) {
        this.movimientosS018 = movimientosS018;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdetmovs018Id != null ? tdetmovs018Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDeMovimientoS018)) {
            return false;
        }
        DetalleDeMovimientoS018 other = (DetalleDeMovimientoS018) object;
        if ((this.tdetmovs018Id == null && other.tdetmovs018Id != null) || (this.tdetmovs018Id != null && !this.tdetmovs018Id.equals(other.tdetmovs018Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDeMovimientoS018[tdetmovs018Id=" + tdetmovs018Id + "]";
    }

}
