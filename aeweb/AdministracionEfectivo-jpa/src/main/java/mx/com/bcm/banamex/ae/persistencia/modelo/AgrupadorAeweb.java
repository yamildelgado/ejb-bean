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
@Table(name = "AGRUPADOR_AEWEB")
@NamedQueries({
    @NamedQuery(name = "AgrupadorAeweb.findAll", query = "SELECT a FROM AgrupadorAeweb a"),
    @NamedQuery(name = "AgrupadorAeweb.findByAgrupadorIdn", query = "SELECT a FROM AgrupadorAeweb a WHERE a.agrupadorIdn = :agrupadorIdn"),
    @NamedQuery(name = "AgrupadorAeweb.findByAgrupadorDescripcion", query = "SELECT a FROM AgrupadorAeweb a WHERE a.agrupadorDescripcion = :agrupadorDescripcion")})
public class AgrupadorAeweb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGRUPADOR_IDN")
    private Short agrupadorIdn;
    @Column(name = "AGRUPADOR_DESCRIPCION")
    private String agrupadorDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agrupadorAeweb")
    private List<CatGeneralAeweb> catGeneralAewebList;

    public AgrupadorAeweb() {
    }

    public AgrupadorAeweb(Short agrupadorIdn) {
        this.agrupadorIdn = agrupadorIdn;
    }

    public Short getAgrupadorIdn() {
        return agrupadorIdn;
    }

    public void setAgrupadorIdn(Short agrupadorIdn) {
        this.agrupadorIdn = agrupadorIdn;
    }

    public String getAgrupadorDescripcion() {
        return agrupadorDescripcion;
    }

    public void setAgrupadorDescripcion(String agrupadorDescripcion) {
        this.agrupadorDescripcion = agrupadorDescripcion;
    }

    public List<CatGeneralAeweb> getCatGeneralAewebList() {
        return catGeneralAewebList;
    }

    public void setCatGeneralAewebList(List<CatGeneralAeweb> catGeneralAewebList) {
        this.catGeneralAewebList = catGeneralAewebList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agrupadorIdn != null ? agrupadorIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgrupadorAeweb)) {
            return false;
        }
        AgrupadorAeweb other = (AgrupadorAeweb) object;
        if ((this.agrupadorIdn == null && other.agrupadorIdn != null) || (this.agrupadorIdn != null && !this.agrupadorIdn.equals(other.agrupadorIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.AgrupadorAeweb[agrupadorIdn=" + agrupadorIdn + "]";
    }

}
