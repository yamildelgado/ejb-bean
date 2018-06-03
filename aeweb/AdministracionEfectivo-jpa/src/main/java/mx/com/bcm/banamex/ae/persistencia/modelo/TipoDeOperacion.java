/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
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
@Table(name = "TIPO_DE_OPERACION")
@NamedQueries({
    @NamedQuery(name = "TipoDeOperacion.findAll", query = "SELECT t FROM TipoDeOperacion t"),
    @NamedQuery(name = "TipoDeOperacion.findByTipoperIdn", query = "SELECT t FROM TipoDeOperacion t WHERE t.tipoDeOperacionPK.tipoperIdn = :tipoperIdn"),
    @NamedQuery(name = "TipoDeOperacion.findByTentidadIdn", query = "SELECT t FROM TipoDeOperacion t WHERE t.tipoDeOperacionPK.tentidadIdn = :tentidadIdn"),
    @NamedQuery(name = "TipoDeOperacion.findByTipoperDescrip", query = "SELECT t FROM TipoDeOperacion t WHERE t.tipoperDescrip = :tipoperDescrip")})
public class TipoDeOperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipoDeOperacionPK tipoDeOperacionPK;
    @Column(name = "TIPOPER_DESCRIP")
    private String tipoperDescrip;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDeOperacion")
    private List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList;
    @OneToMany(mappedBy = "tipoDeOperacion")
    private List<Comprobante> comprobanteList;
    @JoinColumn(name = "TENTIDAD_IDN", referencedColumnName = "TENTIDAD_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoEntidad tipoEntidad;

    public TipoDeOperacion() {
    }

    public TipoDeOperacion(TipoDeOperacionPK tipoDeOperacionPK) {
        this.tipoDeOperacionPK = tipoDeOperacionPK;
    }

    public TipoDeOperacion(short tipoperIdn, short tentidadIdn) {
        this.tipoDeOperacionPK = new TipoDeOperacionPK(tipoperIdn, tentidadIdn);
    }

    public TipoDeOperacionPK getTipoDeOperacionPK() {
        return tipoDeOperacionPK;
    }

    public void setTipoDeOperacionPK(TipoDeOperacionPK tipoDeOperacionPK) {
        this.tipoDeOperacionPK = tipoDeOperacionPK;
    }

    public String getTipoperDescrip() {
        return tipoperDescrip;
    }

    public void setTipoperDescrip(String tipoperDescrip) {
        this.tipoperDescrip = tipoperDescrip;
    }

    public List<DetalleInterfaceProcesadora> getDetalleInterfaceProcesadoraList() {
        return detalleInterfaceProcesadoraList;
    }

    public void setDetalleInterfaceProcesadoraList(List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList) {
        this.detalleInterfaceProcesadoraList = detalleInterfaceProcesadoraList;
    }

    public List<Comprobante> getComprobanteList() {
        return comprobanteList;
    }

    public void setComprobanteList(List<Comprobante> comprobanteList) {
        this.comprobanteList = comprobanteList;
    }

    public TipoEntidad getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(TipoEntidad tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDeOperacionPK != null ? tipoDeOperacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeOperacion)) {
            return false;
        }
        TipoDeOperacion other = (TipoDeOperacion) object;
        if ((this.tipoDeOperacionPK == null && other.tipoDeOperacionPK != null) || (this.tipoDeOperacionPK != null && !this.tipoDeOperacionPK.equals(other.tipoDeOperacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeOperacion[tipoDeOperacionPK=" + tipoDeOperacionPK + "]";
    }

}
