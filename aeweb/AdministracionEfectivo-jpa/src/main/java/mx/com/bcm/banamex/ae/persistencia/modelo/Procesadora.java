/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "PROCESADORA")
@NamedQueries({
    @NamedQuery(name = "Procesadora.findAll", query = "SELECT p FROM Procesadora p"),
    @NamedQuery(name = "Procesadora.findByCpaesEstructuraSirhIdn", query = "SELECT p FROM Procesadora p WHERE p.procesadoraPK.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "Procesadora.findByEtvIdn", query = "SELECT p FROM Procesadora p WHERE p.procesadoraPK.etvIdn = :etvIdn"),
    @NamedQuery(name = "Procesadora.findByProcesadoraFreciaBusqueda", query = "SELECT p FROM Procesadora p WHERE p.procesadoraFreciaBusqueda = :procesadoraFreciaBusqueda"),
    @NamedQuery(name = "Procesadora.findByProcesadoraCarpetaIntelar", query = "SELECT p FROM Procesadora p WHERE p.procesadoraCarpetaIntelar = :procesadoraCarpetaIntelar"),
    @NamedQuery(name = "Procesadora.findByProcesadoraBajaLogica", query = "SELECT p FROM Procesadora p WHERE p.procesadoraBajaLogica = :procesadoraBajaLogica")})
public class Procesadora implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcesadoraPK procesadoraPK;
    @Column(name = "PROCESADORA_FRECIA_BUSQUEDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procesadoraFreciaBusqueda;
    @Column(name = "PROCESADORA_CARPETA_INTELAR")
    private String procesadoraCarpetaIntelar;
    @Column(name = "PROCESADORA_BAJA_LOGICA")
    private String procesadoraBajaLogica;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cpae cpae;
    @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etv etv;

    public Procesadora() {
    }

    public Procesadora(ProcesadoraPK procesadoraPK) {
        this.procesadoraPK = procesadoraPK;
    }

    public Procesadora(int cpaesEstructuraSirhIdn, short etvIdn) {
        this.procesadoraPK = new ProcesadoraPK(cpaesEstructuraSirhIdn, etvIdn);
    }

    public ProcesadoraPK getProcesadoraPK() {
        return procesadoraPK;
    }

    public void setProcesadoraPK(ProcesadoraPK procesadoraPK) {
        this.procesadoraPK = procesadoraPK;
    }

    public Date getProcesadoraFreciaBusqueda() {
        return procesadoraFreciaBusqueda;
    }

    public void setProcesadoraFreciaBusqueda(Date procesadoraFreciaBusqueda) {
        this.procesadoraFreciaBusqueda = procesadoraFreciaBusqueda;
    }

    public String getProcesadoraCarpetaIntelar() {
        return procesadoraCarpetaIntelar;
    }

    public void setProcesadoraCarpetaIntelar(String procesadoraCarpetaIntelar) {
        this.procesadoraCarpetaIntelar = procesadoraCarpetaIntelar;
    }

    public String getProcesadoraBajaLogica() {
        return procesadoraBajaLogica;
    }

    public void setProcesadoraBajaLogica(String procesadoraBajaLogica) {
        this.procesadoraBajaLogica = procesadoraBajaLogica;
    }

    public Cpae getCpae() {
        return cpae;
    }

    public void setCpae(Cpae cpae) {
        this.cpae = cpae;
    }

    public Etv getEtv() {
        return etv;
    }

    public void setEtv(Etv etv) {
        this.etv = etv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procesadoraPK != null ? procesadoraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesadora)) {
            return false;
        }
        Procesadora other = (Procesadora) object;
        if ((this.procesadoraPK == null && other.procesadoraPK != null) || (this.procesadoraPK != null && !this.procesadoraPK.equals(other.procesadoraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora[procesadoraPK=" + procesadoraPK + "]";
    }

}
