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
@Table(name = "TIPO_ENTIDAD")
@NamedQueries({
    @NamedQuery(name = "TipoEntidad.findAll", query = "SELECT t FROM TipoEntidad t"),
    @NamedQuery(name = "TipoEntidad.findByTentidadIdn", query = "SELECT t FROM TipoEntidad t WHERE t.tentidadIdn = :tentidadIdn"),
    @NamedQuery(name = "TipoEntidad.findByTentidadDescrip", query = "SELECT t FROM TipoEntidad t WHERE t.tentidadDescrip = :tentidadDescrip")})
public class TipoEntidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TENTIDAD_IDN")
    private Short tentidadIdn;
    @Column(name = "TENTIDAD_DESCRIP")
    private String tentidadDescrip;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoEntidad")
    private List<TipoDeOperacion> tipoDeOperacionList;

    public TipoEntidad() {
    }

    public TipoEntidad(Short tentidadIdn) {
        this.tentidadIdn = tentidadIdn;
    }

    public Short getTentidadIdn() {
        return tentidadIdn;
    }

    public void setTentidadIdn(Short tentidadIdn) {
        this.tentidadIdn = tentidadIdn;
    }

    public String getTentidadDescrip() {
        return tentidadDescrip;
    }

    public void setTentidadDescrip(String tentidadDescrip) {
        this.tentidadDescrip = tentidadDescrip;
    }

    public List<TipoDeOperacion> getTipoDeOperacionList() {
        return tipoDeOperacionList;
    }

    public void setTipoDeOperacionList(List<TipoDeOperacion> tipoDeOperacionList) {
        this.tipoDeOperacionList = tipoDeOperacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tentidadIdn != null ? tentidadIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEntidad)) {
            return false;
        }
        TipoEntidad other = (TipoEntidad) object;
        if ((this.tentidadIdn == null && other.tentidadIdn != null) || (this.tentidadIdn != null && !this.tentidadIdn.equals(other.tentidadIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TipoEntidad[tentidadIdn=" + tentidadIdn + "]";
    }

}
