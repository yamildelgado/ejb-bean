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
@Table(name = "EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByEmpNomina", query = "SELECT e FROM Empleado e WHERE e.empNomina = :empNomina"),
    @NamedQuery(name = "Empleado.findByEmpNombre", query = "SELECT e FROM Empleado e WHERE e.empNombre = :empNombre"),
    @NamedQuery(name = "Empleado.findByEmpPaterno", query = "SELECT e FROM Empleado e WHERE e.empPaterno = :empPaterno"),
    @NamedQuery(name = "Empleado.findByEmpMaterno", query = "SELECT e FROM Empleado e WHERE e.empMaterno = :empMaterno"),
    @NamedQuery(name = "Empleado.findByEmpPerfil", query = "SELECT e FROM Empleado e WHERE e.empPerfil = :empPerfil"),
    @NamedQuery(name = "Empleado.findByEmpBajaLogica", query = "SELECT e FROM Empleado e WHERE e.empBajaLogica = :empBajaLogica"),
    @NamedQuery(name = "Empleado.findByEmpSubBoveda", query = "SELECT e FROM Empleado e WHERE e.empSubBoveda = :empSubBoveda")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMP_NOMINA")
    private Integer empNomina;
    @Column(name = "EMP_NOMBRE")
    private String empNombre;
    @Column(name = "EMP_PATERNO")
    private String empPaterno;
    @Column(name = "EMP_MATERNO")
    private String empMaterno;
    @Column(name = "EMP_PERFIL")
    private Short empPerfil;
    @Column(name = "EMP_BAJA_LOGICA")
    private String empBajaLogica;
    @Column(name = "EMP_SUB_BOVEDA")
    private Short empSubBoveda;
    @OneToMany(mappedBy = "empNomina")
    private List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN")
    @ManyToOne
    private Cpae cpaesEstructuraSirhIdn;

    public Empleado() {
    }

    public Empleado(Integer empNomina) {
        this.empNomina = empNomina;
    }

    public Integer getEmpNomina() {
        return empNomina;
    }

    public void setEmpNomina(Integer empNomina) {
        this.empNomina = empNomina;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpPaterno() {
        return empPaterno;
    }

    public void setEmpPaterno(String empPaterno) {
        this.empPaterno = empPaterno;
    }

    public String getEmpMaterno() {
        return empMaterno;
    }

    public void setEmpMaterno(String empMaterno) {
        this.empMaterno = empMaterno;
    }

    public Short getEmpPerfil() {
        return empPerfil;
    }

    public void setEmpPerfil(Short empPerfil) {
        this.empPerfil = empPerfil;
    }

    public String getEmpBajaLogica() {
        return empBajaLogica;
    }

    public void setEmpBajaLogica(String empBajaLogica) {
        this.empBajaLogica = empBajaLogica;
    }

    public Short getEmpSubBoveda() {
        return empSubBoveda;
    }

    public void setEmpSubBoveda(Short empSubBoveda) {
        this.empSubBoveda = empSubBoveda;
    }

    public List<CajaHabilitadaPorTurno> getCajaHabilitadaPorTurnoList() {
        return cajaHabilitadaPorTurnoList;
    }

    public void setCajaHabilitadaPorTurnoList(List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList) {
        this.cajaHabilitadaPorTurnoList = cajaHabilitadaPorTurnoList;
    }

    public Cpae getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(Cpae cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empNomina != null ? empNomina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.empNomina == null && other.empNomina != null) || (this.empNomina != null && !this.empNomina.equals(other.empNomina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Empleado[empNomina=" + empNomina + "]";
    }

}
