/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "TIPO_MOVIMIENTO")
@NamedQueries({
    @NamedQuery(name = "TipoMovimiento.findAll", query = "SELECT t FROM TipoMovimiento t"),
    @NamedQuery(name = "TipoMovimiento.findByTipomovIdn", query = "SELECT t FROM TipoMovimiento t WHERE t.tipomovIdn = :tipomovIdn"),
    @NamedQuery(name = "TipoMovimiento.findByTipomovDescripcion", query = "SELECT t FROM TipoMovimiento t WHERE t.tipomovDescripcion = :tipomovDescripcion")})
public class TipoMovimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIPOMOV_IDN")
    private Short tipomovIdn;
    @Column(name = "TIPOMOV_DESCRIPCION")
    private String tipomovDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMovimiento")
    private List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList;

    public TipoMovimiento() {
    }

    public TipoMovimiento(Short tipomovIdn) {
        this.tipomovIdn = tipomovIdn;
    }

    public Short getTipomovIdn() {
        return tipomovIdn;
    }

    public void setTipomovIdn(Short tipomovIdn) {
        this.tipomovIdn = tipomovIdn;
    }

    public String getTipomovDescripcion() {
        return tipomovDescripcion;
    }

    public void setTipomovDescripcion(String tipomovDescripcion) {
        this.tipomovDescripcion = tipomovDescripcion;
    }

    public List<DetalleInterfaceProcesadora> getDetalleInterfaceProcesadoraList() {
        return detalleInterfaceProcesadoraList;
    }

    public void setDetalleInterfaceProcesadoraList(List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList) {
        this.detalleInterfaceProcesadoraList = detalleInterfaceProcesadoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipomovIdn != null ? tipomovIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMovimiento)) {
            return false;
        }
        TipoMovimiento other = (TipoMovimiento) object;
        if ((this.tipomovIdn == null && other.tipomovIdn != null) || (this.tipomovIdn != null && !this.tipomovIdn.equals(other.tipomovIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TipoMovimiento[tipomovIdn=" + tipomovIdn + "]";
    }

}
