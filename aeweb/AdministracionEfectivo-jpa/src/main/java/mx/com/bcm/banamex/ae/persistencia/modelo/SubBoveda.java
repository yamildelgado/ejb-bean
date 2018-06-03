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
import javax.persistence.JoinColumns;
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
@Table(name = "SUB_BOVEDA")
@NamedQueries({
    @NamedQuery(name = "SubBoveda.findAll", query = "SELECT s FROM SubBoveda s"),
    @NamedQuery(name = "SubBoveda.findByCpaesEstructuraSirhIdn", query = "SELECT s FROM SubBoveda s WHERE s.subBovedaPK.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaIdn", query = "SELECT s FROM SubBoveda s WHERE s.subBovedaPK.subbovedaIdn = :subbovedaIdn"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaDescripcion", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaDescripcion = :subbovedaDescripcion"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaCalleNum", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaCalleNum = :subbovedaCalleNum"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaColonia", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaColonia = :subbovedaColonia"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaPoblacion", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaPoblacion = :subbovedaPoblacion"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaCp", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaCp = :subbovedaCp"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaEdo", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaEdo = :subbovedaEdo"),
    @NamedQuery(name = "SubBoveda.findBySubbovedaBajaLogica", query = "SELECT s FROM SubBoveda s WHERE s.subbovedaBajaLogica = :subbovedaBajaLogica")})
public class SubBoveda implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubBovedaPK subBovedaPK;
    @Column(name = "SUBBOVEDA_DESCRIPCION")
    private String subbovedaDescripcion;
    @Column(name = "SUBBOVEDA_CALLE_NUM")
    private String subbovedaCalleNum;
    @Column(name = "SUBBOVEDA_COLONIA")
    private String subbovedaColonia;
    @Column(name = "SUBBOVEDA_POBLACION")
    private String subbovedaPoblacion;
    @Column(name = "SUBBOVEDA_CP")
    private String subbovedaCp;
    @Column(name = "SUBBOVEDA_EDO")
    private String subbovedaEdo;
    @Column(name = "SUBBOVEDA_BAJA_LOGICA")
    private String subbovedaBajaLogica;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cpae cpae;
    @JoinColumn(name = "PLAZA_IDN", referencedColumnName = "PLAZA_IDN")
    @ManyToOne
    private Plaza plazaIdn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subBoveda")
    private List<Caja> cajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subBoveda")
    private List<Turno> turnoList;

    public SubBoveda() {
    }

    public SubBoveda(SubBovedaPK subBovedaPK) {
        this.subBovedaPK = subBovedaPK;
    }

    public SubBoveda(int cpaesEstructuraSirhIdn, short subbovedaIdn) {
        this.subBovedaPK = new SubBovedaPK(cpaesEstructuraSirhIdn, subbovedaIdn);
    }

    public SubBovedaPK getSubBovedaPK() {
        return subBovedaPK;
    }

    public void setSubBovedaPK(SubBovedaPK subBovedaPK) {
        this.subBovedaPK = subBovedaPK;
    }

    public String getSubbovedaDescripcion() {
        return subbovedaDescripcion;
    }

    public void setSubbovedaDescripcion(String subbovedaDescripcion) {
        this.subbovedaDescripcion = subbovedaDescripcion;
    }

    public String getSubbovedaCalleNum() {
        return subbovedaCalleNum;
    }

    public void setSubbovedaCalleNum(String subbovedaCalleNum) {
        this.subbovedaCalleNum = subbovedaCalleNum;
    }

    public String getSubbovedaColonia() {
        return subbovedaColonia;
    }

    public void setSubbovedaColonia(String subbovedaColonia) {
        this.subbovedaColonia = subbovedaColonia;
    }

    public String getSubbovedaPoblacion() {
        return subbovedaPoblacion;
    }

    public void setSubbovedaPoblacion(String subbovedaPoblacion) {
        this.subbovedaPoblacion = subbovedaPoblacion;
    }

    public String getSubbovedaCp() {
        return subbovedaCp;
    }

    public void setSubbovedaCp(String subbovedaCp) {
        this.subbovedaCp = subbovedaCp;
    }

    public String getSubbovedaEdo() {
        return subbovedaEdo;
    }

    public void setSubbovedaEdo(String subbovedaEdo) {
        this.subbovedaEdo = subbovedaEdo;
    }

    public String getSubbovedaBajaLogica() {
        return subbovedaBajaLogica;
    }

    public void setSubbovedaBajaLogica(String subbovedaBajaLogica) {
        this.subbovedaBajaLogica = subbovedaBajaLogica;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public Cpae getCpae() {
        return cpae;
    }

    public void setCpae(Cpae cpae) {
        this.cpae = cpae;
    }

    public Plaza getPlazaIdn() {
        return plazaIdn;
    }

    public void setPlazaIdn(Plaza plazaIdn) {
        this.plazaIdn = plazaIdn;
    }

    public List<Caja> getCajaList() {
        return cajaList;
    }

    public void setCajaList(List<Caja> cajaList) {
        this.cajaList = cajaList;
    }

    public List<Turno> getTurnoList() {
        return turnoList;
    }

    public void setTurnoList(List<Turno> turnoList) {
        this.turnoList = turnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subBovedaPK != null ? subBovedaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubBoveda)) {
            return false;
        }
        SubBoveda other = (SubBoveda) object;
        if ((this.subBovedaPK == null && other.subBovedaPK != null) || (this.subBovedaPK != null && !this.subBovedaPK.equals(other.subBovedaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda[subBovedaPK=" + subBovedaPK + "]";
    }

}
