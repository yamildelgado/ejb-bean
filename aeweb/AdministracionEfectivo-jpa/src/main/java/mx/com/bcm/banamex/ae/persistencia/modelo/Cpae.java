/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "CPAE")
@NamedQueries({
    @NamedQuery(name = "Cpae.findAll", query = "SELECT c FROM Cpae c"),
    @NamedQuery(name = "Cpae.findByCpaesEstructuraSirhIdn", query = "SELECT c FROM Cpae c WHERE c.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "Cpae.findBySirhNombre", query = "SELECT c FROM Cpae c WHERE c.sirhNombre = :sirhNombre"),
    @NamedQuery(name = "Cpae.findBySirhHorContable", query = "SELECT c FROM Cpae c WHERE c.sirhHorContable = :sirhHorContable"),
    @NamedQuery(name = "Cpae.findBySirhNumCompLote", query = "SELECT c FROM Cpae c WHERE c.sirhNumCompLote = :sirhNumCompLote"),
    @NamedQuery(name = "Cpae.findBySirhNumCompAsignaXCajero", query = "SELECT c FROM Cpae c WHERE c.sirhNumCompAsignaXCajero = :sirhNumCompAsignaXCajero"),
    @NamedQuery(name = "Cpae.findBySirhMontMinDifImprActa", query = "SELECT c FROM Cpae c WHERE c.sirhMontMinDifImprActa = :sirhMontMinDifImprActa"),
    @NamedQuery(name = "Cpae.findBySirhNumCopiasActas", query = "SELECT c FROM Cpae c WHERE c.sirhNumCopiasActas = :sirhNumCopiasActas"),
    @NamedQuery(name = "Cpae.findBySirhHorEnvaseCritico", query = "SELECT c FROM Cpae c WHERE c.sirhHorEnvaseCritico = :sirhHorEnvaseCritico"),
    @NamedQuery(name = "Cpae.findBySirhLimPiso", query = "SELECT c FROM Cpae c WHERE c.sirhLimPiso = :sirhLimPiso"),
    @NamedQuery(name = "Cpae.findBySirhSemaforoAsigComp", query = "SELECT c FROM Cpae c WHERE c.sirhSemaforoAsigComp = :sirhSemaforoAsigComp"),
    @NamedQuery(name = "Cpae.findBySirhMontoMinimoCobroDifs", query = "SELECT c FROM Cpae c WHERE c.sirhMontoMinimoCobroDifs = :sirhMontoMinimoCobroDifs"),
    @NamedQuery(name = "Cpae.findBySirhBajaLogica", query = "SELECT c FROM Cpae c WHERE c.sirhBajaLogica = :sirhBajaLogica")})
public class Cpae implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private Integer cpaesEstructuraSirhIdn;
    @Column(name = "SIRH_NOMBRE")
    private String sirhNombre;
    @Column(name = "SIRH_HOR_CONTABLE")
    private Short sirhHorContable;
    @Column(name = "SIRH_NUM_COMP_LOTE")
    private Short sirhNumCompLote;
    @Column(name = "SIRH_NUM_COMP_ASIGNA_X_CAJERO")
    private Short sirhNumCompAsignaXCajero;
    @Column(name = "SIRH_MONT_MIN_DIF_IMPR_ACTA")
    private BigDecimal sirhMontMinDifImprActa;
    @Column(name = "SIRH_NUM_COPIAS_ACTAS")
    private Short sirhNumCopiasActas;
    @Column(name = "SIRH_HOR_ENVASE_CRITICO")
    private Short sirhHorEnvaseCritico;
    @Column(name = "SIRH_LIM_PISO")
    private BigDecimal sirhLimPiso;
    @Column(name = "SIRH_SEMAFORO_ASIG_COMP")
    private String sirhSemaforoAsigComp;
    @Column(name = "SIRH_MONTO_MINIMO_COBRO_DIFS")
    private BigDecimal sirhMontoMinimoCobroDifs;
    @Column(name = "SIRH_BAJA_LOGICA")
    private String sirhBajaLogica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpae")
    private List<UnidadDeNegocio> unidadDeNegocioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpae")
    private List<Procesadora> procesadoraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpae")
    private List<SubBoveda> subBovedaList;
    @OneToMany(mappedBy = "cpaesEstructuraSirhIdn")
    private List<Empleado> empleadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpae")
    private List<Atm> atmList;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "ESTRUCTRA_SIRH_IDN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Estructura estructura;

    public Cpae() {
    }

    public Cpae(Integer cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public Integer getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(Integer cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public String getSirhNombre() {
        return sirhNombre;
    }

    public void setSirhNombre(String sirhNombre) {
        this.sirhNombre = sirhNombre;
    }

    public Short getSirhHorContable() {
        return sirhHorContable;
    }

    public void setSirhHorContable(Short sirhHorContable) {
        this.sirhHorContable = sirhHorContable;
    }

    public Short getSirhNumCompLote() {
        return sirhNumCompLote;
    }

    public void setSirhNumCompLote(Short sirhNumCompLote) {
        this.sirhNumCompLote = sirhNumCompLote;
    }

    public Short getSirhNumCompAsignaXCajero() {
        return sirhNumCompAsignaXCajero;
    }

    public void setSirhNumCompAsignaXCajero(Short sirhNumCompAsignaXCajero) {
        this.sirhNumCompAsignaXCajero = sirhNumCompAsignaXCajero;
    }

    public BigDecimal getSirhMontMinDifImprActa() {
        return sirhMontMinDifImprActa;
    }

    public void setSirhMontMinDifImprActa(BigDecimal sirhMontMinDifImprActa) {
        this.sirhMontMinDifImprActa = sirhMontMinDifImprActa;
    }

    public Short getSirhNumCopiasActas() {
        return sirhNumCopiasActas;
    }

    public void setSirhNumCopiasActas(Short sirhNumCopiasActas) {
        this.sirhNumCopiasActas = sirhNumCopiasActas;
    }

    public Short getSirhHorEnvaseCritico() {
        return sirhHorEnvaseCritico;
    }

    public void setSirhHorEnvaseCritico(Short sirhHorEnvaseCritico) {
        this.sirhHorEnvaseCritico = sirhHorEnvaseCritico;
    }

    public BigDecimal getSirhLimPiso() {
        return sirhLimPiso;
    }

    public void setSirhLimPiso(BigDecimal sirhLimPiso) {
        this.sirhLimPiso = sirhLimPiso;
    }

    public String getSirhSemaforoAsigComp() {
        return sirhSemaforoAsigComp;
    }

    public void setSirhSemaforoAsigComp(String sirhSemaforoAsigComp) {
        this.sirhSemaforoAsigComp = sirhSemaforoAsigComp;
    }

    public BigDecimal getSirhMontoMinimoCobroDifs() {
        return sirhMontoMinimoCobroDifs;
    }

    public void setSirhMontoMinimoCobroDifs(BigDecimal sirhMontoMinimoCobroDifs) {
        this.sirhMontoMinimoCobroDifs = sirhMontoMinimoCobroDifs;
    }

    public String getSirhBajaLogica() {
        return sirhBajaLogica;
    }

    public void setSirhBajaLogica(String sirhBajaLogica) {
        this.sirhBajaLogica = sirhBajaLogica;
    }

    public List<UnidadDeNegocio> getUnidadDeNegocioList() {
        return unidadDeNegocioList;
    }

    public void setUnidadDeNegocioList(List<UnidadDeNegocio> unidadDeNegocioList) {
        this.unidadDeNegocioList = unidadDeNegocioList;
    }

    public List<Procesadora> getProcesadoraList() {
        return procesadoraList;
    }

    public void setProcesadoraList(List<Procesadora> procesadoraList) {
        this.procesadoraList = procesadoraList;
    }

    public List<SubBoveda> getSubBovedaList() {
        return subBovedaList;
    }

    public void setSubBovedaList(List<SubBoveda> subBovedaList) {
        this.subBovedaList = subBovedaList;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Atm> getAtmList() {
        return atmList;
    }

    public void setAtmList(List<Atm> atmList) {
        this.atmList = atmList;
    }

    public Estructura getEstructura() {
        return estructura;
    }

    public void setEstructura(Estructura estructura) {
        this.estructura = estructura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpaesEstructuraSirhIdn != null ? cpaesEstructuraSirhIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cpae)) {
            return false;
        }
        Cpae other = (Cpae) object;
        if ((this.cpaesEstructuraSirhIdn == null && other.cpaesEstructuraSirhIdn != null) || (this.cpaesEstructuraSirhIdn != null && !this.cpaesEstructuraSirhIdn.equals(other.cpaesEstructuraSirhIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Cpae[cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn + "]";
    }

}
