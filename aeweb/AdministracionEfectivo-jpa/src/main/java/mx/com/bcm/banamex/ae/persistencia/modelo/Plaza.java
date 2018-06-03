/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "PLAZA")
@NamedQueries({
    @NamedQuery(name = "Plaza.findAll", query = "SELECT p FROM Plaza p"),
    @NamedQuery(name = "Plaza.findByPlazaIdn", query = "SELECT p FROM Plaza p WHERE p.plazaIdn = :plazaIdn"),
    @NamedQuery(name = "Plaza.findByPlazaNombre", query = "SELECT p FROM Plaza p WHERE p.plazaNombre = :plazaNombre"),
    @NamedQuery(name = "Plaza.findByPlazaBajaLogica", query = "SELECT p FROM Plaza p WHERE p.plazaBajaLogica = :plazaBajaLogica")})
public class Plaza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLAZA_IDN")
    private Long plazaIdn;
    @Column(name = "PLAZA_NOMBRE")
    private String plazaNombre;
    @Column(name = "PLAZA_BAJA_LOGICA")
    private String plazaBajaLogica;
    @ManyToMany(mappedBy = "plazaList")
    private List<Etv> etvList;
    @OneToMany(mappedBy = "plazaIdn")
    private List<SubBoveda> subBovedaList;

    public Plaza() {
    }

    public Plaza(Long plazaIdn) {
        this.plazaIdn = plazaIdn;
    }

    public Long getPlazaIdn() {
        return plazaIdn;
    }

    public void setPlazaIdn(Long plazaIdn) {
        this.plazaIdn = plazaIdn;
    }

    public String getPlazaNombre() {
        return plazaNombre;
    }

    public void setPlazaNombre(String plazaNombre) {
        this.plazaNombre = plazaNombre;
    }

    public String getPlazaBajaLogica() {
        return plazaBajaLogica;
    }

    public void setPlazaBajaLogica(String plazaBajaLogica) {
        this.plazaBajaLogica = plazaBajaLogica;
    }

    public List<Etv> getEtvList() {
        return etvList;
    }

    public void setEtvList(List<Etv> etvList) {
        this.etvList = etvList;
    }

    public List<SubBoveda> getSubBovedaList() {
        return subBovedaList;
    }

    public void setSubBovedaList(List<SubBoveda> subBovedaList) {
        this.subBovedaList = subBovedaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plazaIdn != null ? plazaIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plaza)) {
            return false;
        }
        Plaza other = (Plaza) object;
        if ((this.plazaIdn == null && other.plazaIdn != null) || (this.plazaIdn != null && !this.plazaIdn.equals(other.plazaIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Plaza[plazaIdn=" + plazaIdn + "]";
    }

}
