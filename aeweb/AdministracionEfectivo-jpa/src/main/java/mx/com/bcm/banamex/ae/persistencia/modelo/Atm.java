/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "ATM")
@NamedQueries({
    @NamedQuery(name = "Atm.findAll", query = "SELECT a FROM Atm a"),
    @NamedQuery(name = "Atm.findByCpaesEstructuraSirhIdn", query = "SELECT a FROM Atm a WHERE a.atmPK.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "Atm.findByAtmIdn", query = "SELECT a FROM Atm a WHERE a.atmPK.atmIdn = :atmIdn"),
    @NamedQuery(name = "Atm.findByAtmNumCtaUnicaAsoc", query = "SELECT a FROM Atm a WHERE a.atmNumCtaUnicaAsoc = :atmNumCtaUnicaAsoc"),
    @NamedQuery(name = "Atm.findByAtmTipoOficina", query = "SELECT a FROM Atm a WHERE a.atmTipoOficina = :atmTipoOficina"),
    @NamedQuery(name = "Atm.findByAtmTipoInmueble", query = "SELECT a FROM Atm a WHERE a.atmTipoInmueble = :atmTipoInmueble"),
    @NamedQuery(name = "Atm.findByAtmDescripcion", query = "SELECT a FROM Atm a WHERE a.atmDescripcion = :atmDescripcion"),
    @NamedQuery(name = "Atm.findByAtmDescripcionAbrev", query = "SELECT a FROM Atm a WHERE a.atmDescripcionAbrev = :atmDescripcionAbrev"),
    @NamedQuery(name = "Atm.findByAtmBajaLogica", query = "SELECT a FROM Atm a WHERE a.atmBajaLogica = :atmBajaLogica")})
public class Atm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtmPK atmPK;
    @Column(name = "ATM_NUM_CTA_UNICA_ASOC")
    private Short atmNumCtaUnicaAsoc;
    @Column(name = "ATM_TIPO_OFICINA")
    private String atmTipoOficina;
    @Column(name = "ATM_TIPO_INMUEBLE")
    private String atmTipoInmueble;
    @Column(name = "ATM_DESCRIPCION")
    private String atmDescripcion;
    @Column(name = "ATM_DESCRIPCION_ABREV")
    private String atmDescripcionAbrev;
    @Column(name = "ATM_BAJA_LOGICA")
    private String atmBajaLogica;
    @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cpae cpae;
    @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")
    @ManyToOne(optional = false)
    private Etv etvIdn;

    public Atm() {
    }

    public Atm(AtmPK atmPK) {
        this.atmPK = atmPK;
    }

    public Atm(int cpaesEstructuraSirhIdn, short atmIdn) {
        this.atmPK = new AtmPK(cpaesEstructuraSirhIdn, atmIdn);
    }

    public AtmPK getAtmPK() {
        return atmPK;
    }

    public void setAtmPK(AtmPK atmPK) {
        this.atmPK = atmPK;
    }

    public Short getAtmNumCtaUnicaAsoc() {
        return atmNumCtaUnicaAsoc;
    }

    public void setAtmNumCtaUnicaAsoc(Short atmNumCtaUnicaAsoc) {
        this.atmNumCtaUnicaAsoc = atmNumCtaUnicaAsoc;
    }

    public String getAtmTipoOficina() {
        return atmTipoOficina;
    }

    public void setAtmTipoOficina(String atmTipoOficina) {
        this.atmTipoOficina = atmTipoOficina;
    }

    public String getAtmTipoInmueble() {
        return atmTipoInmueble;
    }

    public void setAtmTipoInmueble(String atmTipoInmueble) {
        this.atmTipoInmueble = atmTipoInmueble;
    }

    public String getAtmDescripcion() {
        return atmDescripcion;
    }

    public void setAtmDescripcion(String atmDescripcion) {
        this.atmDescripcion = atmDescripcion;
    }

    public String getAtmDescripcionAbrev() {
        return atmDescripcionAbrev;
    }

    public void setAtmDescripcionAbrev(String atmDescripcionAbrev) {
        this.atmDescripcionAbrev = atmDescripcionAbrev;
    }

    public String getAtmBajaLogica() {
        return atmBajaLogica;
    }

    public void setAtmBajaLogica(String atmBajaLogica) {
        this.atmBajaLogica = atmBajaLogica;
    }

    public Cpae getCpae() {
        return cpae;
    }

    public void setCpae(Cpae cpae) {
        this.cpae = cpae;
    }

    public Etv getEtvIdn() {
        return etvIdn;
    }

    public void setEtvIdn(Etv etvIdn) {
        this.etvIdn = etvIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atmPK != null ? atmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atm)) {
            return false;
        }
        Atm other = (Atm) object;
        if ((this.atmPK == null && other.atmPK != null) || (this.atmPK != null && !this.atmPK.equals(other.atmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Atm[atmPK=" + atmPK + "]";
    }

}
