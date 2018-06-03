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
@Table(name = "DIVISA")
@NamedQueries({
    @NamedQuery(name = "Divisa.findAll", query = "SELECT d FROM Divisa d"),
    @NamedQuery(name = "Divisa.findByDivisaId", query = "SELECT d FROM Divisa d WHERE d.divisaId = :divisaId"),
    @NamedQuery(name = "Divisa.findByDivisaNomCorto", query = "SELECT d FROM Divisa d WHERE d.divisaNomCorto = :divisaNomCorto"),
    @NamedQuery(name = "Divisa.findByDivisaNomLargo", query = "SELECT d FROM Divisa d WHERE d.divisaNomLargo = :divisaNomLargo"),
    @NamedQuery(name = "Divisa.findByDivisaAbreviatura", query = "SELECT d FROM Divisa d WHERE d.divisaAbreviatura = :divisaAbreviatura"),
    @NamedQuery(name = "Divisa.findByDivisaBajaLogica", query = "SELECT d FROM Divisa d WHERE d.divisaBajaLogica = :divisaBajaLogica")})
public class Divisa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DIVISA_ID")
    private Short divisaId;
    @Basic(optional = false)
    @Column(name = "DIVISA_NOM_CORTO")
    private String divisaNomCorto;
    @Column(name = "DIVISA_NOM_LARGO")
    private String divisaNomLargo;
    @Column(name = "DIVISA_ABREVIATURA")
    private String divisaAbreviatura;
    @Column(name = "DIVISA_BAJA_LOGICA")
    private String divisaBajaLogica;
    @OneToMany(mappedBy = "divisaId")
    private List<DetalleDeDivisaPorEnvase> detalleDeDivisaPorEnvaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "divisa")
    private List<DenominacionDeDivisa> denominacionDeDivisaList;
    @OneToMany(mappedBy = "divisaId")
    private List<Cuenta> cuentaList;

    public Divisa() {
    }

    public Divisa(Short divisaId) {
        this.divisaId = divisaId;
    }

    public Divisa(Short divisaId, String divisaNomCorto) {
        this.divisaId = divisaId;
        this.divisaNomCorto = divisaNomCorto;
    }

    public Short getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(Short divisaId) {
        this.divisaId = divisaId;
    }

    public String getDivisaNomCorto() {
        return divisaNomCorto;
    }

    public void setDivisaNomCorto(String divisaNomCorto) {
        this.divisaNomCorto = divisaNomCorto;
    }

    public String getDivisaNomLargo() {
        return divisaNomLargo;
    }

    public void setDivisaNomLargo(String divisaNomLargo) {
        this.divisaNomLargo = divisaNomLargo;
    }

    public String getDivisaAbreviatura() {
        return divisaAbreviatura;
    }

    public void setDivisaAbreviatura(String divisaAbreviatura) {
        this.divisaAbreviatura = divisaAbreviatura;
    }

    public String getDivisaBajaLogica() {
        return divisaBajaLogica;
    }

    public void setDivisaBajaLogica(String divisaBajaLogica) {
        this.divisaBajaLogica = divisaBajaLogica;
    }

    public List<DetalleDeDivisaPorEnvase> getDetalleDeDivisaPorEnvaseList() {
        return detalleDeDivisaPorEnvaseList;
    }

    public void setDetalleDeDivisaPorEnvaseList(List<DetalleDeDivisaPorEnvase> detalleDeDivisaPorEnvaseList) {
        this.detalleDeDivisaPorEnvaseList = detalleDeDivisaPorEnvaseList;
    }

    public List<DenominacionDeDivisa> getDenominacionDeDivisaList() {
        return denominacionDeDivisaList;
    }

    public void setDenominacionDeDivisaList(List<DenominacionDeDivisa> denominacionDeDivisaList) {
        this.denominacionDeDivisaList = denominacionDeDivisaList;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (divisaId != null ? divisaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Divisa)) {
            return false;
        }
        Divisa other = (Divisa) object;
        if ((this.divisaId == null && other.divisaId != null) || (this.divisaId != null && !this.divisaId.equals(other.divisaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Divisa[divisaId=" + divisaId + "]";
    }

}
