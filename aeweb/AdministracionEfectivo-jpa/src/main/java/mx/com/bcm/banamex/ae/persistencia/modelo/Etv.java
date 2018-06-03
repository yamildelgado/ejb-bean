/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "ETV")
@NamedQueries({
    @NamedQuery(name = "Etv.findAll", query = "SELECT e FROM Etv e"),
    @NamedQuery(name = "Etv.findByEtvIdn", query = "SELECT e FROM Etv e WHERE e.etvIdn = :etvIdn"),
    @NamedQuery(name = "Etv.findByIdnSubboveda", query = "SELECT e FROM Etv e WHERE e.idnSubboveda = :idnSubboveda"),
    @NamedQuery(name = "Etv.findByEtvNombreCorto", query = "SELECT e FROM Etv e WHERE e.etvNombreCorto = :etvNombreCorto"),
    @NamedQuery(name = "Etv.findByEtvCalle", query = "SELECT e FROM Etv e WHERE e.etvCalle = :etvCalle"),
    @NamedQuery(name = "Etv.findByEtvColonia", query = "SELECT e FROM Etv e WHERE e.etvColonia = :etvColonia"),
    @NamedQuery(name = "Etv.findByEtvCp", query = "SELECT e FROM Etv e WHERE e.etvCp = :etvCp"),
    @NamedQuery(name = "Etv.findByEtvDeleg", query = "SELECT e FROM Etv e WHERE e.etvDeleg = :etvDeleg"),
    @NamedQuery(name = "Etv.findByEtvContacto", query = "SELECT e FROM Etv e WHERE e.etvContacto = :etvContacto"),
    @NamedQuery(name = "Etv.findByEtvTipoServico", query = "SELECT e FROM Etv e WHERE e.etvTipoServico = :etvTipoServico"),
    @NamedQuery(name = "Etv.findByEtvBajaLogica", query = "SELECT e FROM Etv e WHERE e.etvBajaLogica = :etvBajaLogica"),
    @NamedQuery(name = "Etv.findByIdEstadoRepublica", query = "SELECT e FROM Etv e WHERE e.idEstadoRepublica = :idEstadoRepublica"),
    @NamedQuery(name = "Etv.findByEtvNombreLargo", query = "SELECT e FROM Etv e WHERE e.etvNombreLargo = :etvNombreLargo")})
public class Etv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ETV_IDN")
    private Short etvIdn;
    @Column(name = "IDN_SUBBOVEDA")
    private BigInteger idnSubboveda;
    @Column(name = "ETV_NOMBRE_CORTO")
    private String etvNombreCorto;
    @Column(name = "ETV_CALLE")
    private String etvCalle;
    @Column(name = "ETV_COLONIA")
    private String etvColonia;
    @Column(name = "ETV_CP")
    private Integer etvCp;
    @Column(name = "ETV_DELEG")
    private String etvDeleg;
    @Column(name = "ETV_CONTACTO")
    private String etvContacto;
    @Column(name = "ETV_TIPO_SERVICO")
    private Short etvTipoServico;
    @Column(name = "ETV_BAJA_LOGICA")
    private String etvBajaLogica;
    @Column(name = "ID_ESTADO_REPUBLICA")
    private Short idEstadoRepublica;
    @Column(name = "ETV_NOMBRE_LARGO")
    private String etvNombreLargo;
    @JoinTable(name = "PLAZA_ETV", joinColumns = {
        @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")}, inverseJoinColumns = {
        @JoinColumn(name = "PLAZA_IDN", referencedColumnName = "PLAZA_IDN")})
    @ManyToMany
    private List<Plaza> plazaList;
    @OneToMany(mappedBy = "etvIdn")
    private List<UnidadDeNegocio> unidadDeNegocioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etv")
    private List<Recepcion> recepcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etv")
    private List<Procesadora> procesadoraList;
    @OneToMany(mappedBy = "etvIdn")
    private List<SolicitudDotacion> solicitudDotacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etvIdn")
    private List<Atm> atmList;

    public Etv() {
    }

    public Etv(Short etvIdn) {
        this.etvIdn = etvIdn;
    }

    public Short getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(Short etvIdn) {
        this.etvIdn = etvIdn;
    }

    public BigInteger getIdnSubboveda() {
        return idnSubboveda;
    }

    public void setIdnSubboveda(BigInteger idnSubboveda) {
        this.idnSubboveda = idnSubboveda;
    }

    public String getEtvNombreCorto() {
        return etvNombreCorto;
    }

    public void setEtvNombreCorto(String etvNombreCorto) {
        this.etvNombreCorto = etvNombreCorto;
    }

    public String getEtvCalle() {
        return etvCalle;
    }

    public void setEtvCalle(String etvCalle) {
        this.etvCalle = etvCalle;
    }

    public String getEtvColonia() {
        return etvColonia;
    }

    public void setEtvColonia(String etvColonia) {
        this.etvColonia = etvColonia;
    }

    public Integer getEtvCp() {
        return etvCp;
    }

    public void setEtvCp(Integer etvCp) {
        this.etvCp = etvCp;
    }

    public String getEtvDeleg() {
        return etvDeleg;
    }

    public void setEtvDeleg(String etvDeleg) {
        this.etvDeleg = etvDeleg;
    }

    public String getEtvContacto() {
        return etvContacto;
    }

    public void setEtvContacto(String etvContacto) {
        this.etvContacto = etvContacto;
    }

    public Short getEtvTipoServico() {
        return etvTipoServico;
    }

    public void setEtvTipoServico(Short etvTipoServico) {
        this.etvTipoServico = etvTipoServico;
    }

    public String getEtvBajaLogica() {
        return etvBajaLogica;
    }

    public void setEtvBajaLogica(String etvBajaLogica) {
        this.etvBajaLogica = etvBajaLogica;
    }

    public Short getIdEstadoRepublica() {
        return idEstadoRepublica;
    }

    public void setIdEstadoRepublica(Short idEstadoRepublica) {
        this.idEstadoRepublica = idEstadoRepublica;
    }

    public String getEtvNombreLargo() {
        return etvNombreLargo;
    }

    public void setEtvNombreLargo(String etvNombreLargo) {
        this.etvNombreLargo = etvNombreLargo;
    }

    public List<Plaza> getPlazaList() {
        return plazaList;
    }

    public void setPlazaList(List<Plaza> plazaList) {
        this.plazaList = plazaList;
    }

    public List<UnidadDeNegocio> getUnidadDeNegocioList() {
        return unidadDeNegocioList;
    }

    public void setUnidadDeNegocioList(List<UnidadDeNegocio> unidadDeNegocioList) {
        this.unidadDeNegocioList = unidadDeNegocioList;
    }

    public List<Recepcion> getRecepcionList() {
        return recepcionList;
    }

    public void setRecepcionList(List<Recepcion> recepcionList) {
        this.recepcionList = recepcionList;
    }

    public List<Procesadora> getProcesadoraList() {
        return procesadoraList;
    }

    public void setProcesadoraList(List<Procesadora> procesadoraList) {
        this.procesadoraList = procesadoraList;
    }

    public List<SolicitudDotacion> getSolicitudDotacionList() {
        return solicitudDotacionList;
    }

    public void setSolicitudDotacionList(List<SolicitudDotacion> solicitudDotacionList) {
        this.solicitudDotacionList = solicitudDotacionList;
    }

    public List<Atm> getAtmList() {
        return atmList;
    }

    public void setAtmList(List<Atm> atmList) {
        this.atmList = atmList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etvIdn != null ? etvIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etv)) {
            return false;
        }
        Etv other = (Etv) object;
        if ((this.etvIdn == null && other.etvIdn != null) || (this.etvIdn != null && !this.etvIdn.equals(other.etvIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Etv[etvIdn=" + etvIdn + "]";
    }

}
