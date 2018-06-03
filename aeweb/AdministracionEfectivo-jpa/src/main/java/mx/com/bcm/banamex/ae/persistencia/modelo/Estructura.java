/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "ESTRUCTURA")
@NamedQueries({
    @NamedQuery(name = "Estructura.findAll", query = "SELECT e FROM Estructura e"),
    @NamedQuery(name = "Estructura.findByEstructraSirhIdn", query = "SELECT e FROM Estructura e WHERE e.estructraSirhIdn = :estructraSirhIdn"),
    @NamedQuery(name = "Estructura.findByEstructraRpta", query = "SELECT e FROM Estructura e WHERE e.estructraRpta = :estructraRpta"),
    @NamedQuery(name = "Estructura.findByEstructraTipoSirh", query = "SELECT e FROM Estructura e WHERE e.estructraTipoSirh = :estructraTipoSirh"),
    @NamedQuery(name = "Estructura.findByEstructraNombreCorto", query = "SELECT e FROM Estructura e WHERE e.estructraNombreCorto = :estructraNombreCorto"),
    @NamedQuery(name = "Estructura.findByEstructraNombreLargo", query = "SELECT e FROM Estructura e WHERE e.estructraNombreLargo = :estructraNombreLargo"),
    @NamedQuery(name = "Estructura.findByEstructraCalleNum", query = "SELECT e FROM Estructura e WHERE e.estructraCalleNum = :estructraCalleNum"),
    @NamedQuery(name = "Estructura.findByEstructraColonia", query = "SELECT e FROM Estructura e WHERE e.estructraColonia = :estructraColonia"),
    @NamedQuery(name = "Estructura.findByEstructraPoblacion", query = "SELECT e FROM Estructura e WHERE e.estructraPoblacion = :estructraPoblacion"),
    @NamedQuery(name = "Estructura.findByEstructraCp", query = "SELECT e FROM Estructura e WHERE e.estructraCp = :estructraCp"),
    @NamedQuery(name = "Estructura.findByEstructraLada", query = "SELECT e FROM Estructura e WHERE e.estructraLada = :estructraLada"),
    @NamedQuery(name = "Estructura.findByEstructraTelefono", query = "SELECT e FROM Estructura e WHERE e.estructraTelefono = :estructraTelefono"),
    @NamedQuery(name = "Estructura.findByEstructraEdo", query = "SELECT e FROM Estructura e WHERE e.estructraEdo = :estructraEdo"),
    @NamedQuery(name = "Estructura.findByEstructraBajaLogica", query = "SELECT e FROM Estructura e WHERE e.estructraBajaLogica = :estructraBajaLogica")})
public class Estructura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ESTRUCTRA_SIRH_IDN")
    private Integer estructraSirhIdn;
    @Column(name = "ESTRUCTRA_RPTA")
    private Short estructraRpta;
    @Column(name = "ESTRUCTRA_TIPO_SIRH")
    private String estructraTipoSirh;
    @Column(name = "ESTRUCTRA_NOMBRE_CORTO")
    private String estructraNombreCorto;
    @Column(name = "ESTRUCTRA_NOMBRE_LARGO")
    private String estructraNombreLargo;
    @Column(name = "ESTRUCTRA_CALLE_NUM")
    private String estructraCalleNum;
    @Column(name = "ESTRUCTRA_COLONIA")
    private String estructraColonia;
    @Column(name = "ESTRUCTRA_POBLACION")
    private String estructraPoblacion;
    @Column(name = "ESTRUCTRA_CP")
    private String estructraCp;
    @Column(name = "ESTRUCTRA_LADA")
    private String estructraLada;
    @Column(name = "ESTRUCTRA_TELEFONO")
    private String estructraTelefono;
    @Column(name = "ESTRUCTRA_EDO")
    private String estructraEdo;
    @Column(name = "ESTRUCTRA_BAJA_LOGICA")
    private String estructraBajaLogica;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "estructura")
    private Cpae cpae;

    public Estructura() {
    }

    public Estructura(Integer estructraSirhIdn) {
        this.estructraSirhIdn = estructraSirhIdn;
    }

    public Integer getEstructraSirhIdn() {
        return estructraSirhIdn;
    }

    public void setEstructraSirhIdn(Integer estructraSirhIdn) {
        this.estructraSirhIdn = estructraSirhIdn;
    }

    public Short getEstructraRpta() {
        return estructraRpta;
    }

    public void setEstructraRpta(Short estructraRpta) {
        this.estructraRpta = estructraRpta;
    }

    public String getEstructraTipoSirh() {
        return estructraTipoSirh;
    }

    public void setEstructraTipoSirh(String estructraTipoSirh) {
        this.estructraTipoSirh = estructraTipoSirh;
    }

    public String getEstructraNombreCorto() {
        return estructraNombreCorto;
    }

    public void setEstructraNombreCorto(String estructraNombreCorto) {
        this.estructraNombreCorto = estructraNombreCorto;
    }

    public String getEstructraNombreLargo() {
        return estructraNombreLargo;
    }

    public void setEstructraNombreLargo(String estructraNombreLargo) {
        this.estructraNombreLargo = estructraNombreLargo;
    }

    public String getEstructraCalleNum() {
        return estructraCalleNum;
    }

    public void setEstructraCalleNum(String estructraCalleNum) {
        this.estructraCalleNum = estructraCalleNum;
    }

    public String getEstructraColonia() {
        return estructraColonia;
    }

    public void setEstructraColonia(String estructraColonia) {
        this.estructraColonia = estructraColonia;
    }

    public String getEstructraPoblacion() {
        return estructraPoblacion;
    }

    public void setEstructraPoblacion(String estructraPoblacion) {
        this.estructraPoblacion = estructraPoblacion;
    }

    public String getEstructraCp() {
        return estructraCp;
    }

    public void setEstructraCp(String estructraCp) {
        this.estructraCp = estructraCp;
    }

    public String getEstructraLada() {
        return estructraLada;
    }

    public void setEstructraLada(String estructraLada) {
        this.estructraLada = estructraLada;
    }

    public String getEstructraTelefono() {
        return estructraTelefono;
    }

    public void setEstructraTelefono(String estructraTelefono) {
        this.estructraTelefono = estructraTelefono;
    }

    public String getEstructraEdo() {
        return estructraEdo;
    }

    public void setEstructraEdo(String estructraEdo) {
        this.estructraEdo = estructraEdo;
    }

    public String getEstructraBajaLogica() {
        return estructraBajaLogica;
    }

    public void setEstructraBajaLogica(String estructraBajaLogica) {
        this.estructraBajaLogica = estructraBajaLogica;
    }

    public Cpae getCpae() {
        return cpae;
    }

    public void setCpae(Cpae cpae) {
        this.cpae = cpae;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estructraSirhIdn != null ? estructraSirhIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estructura)) {
            return false;
        }
        Estructura other = (Estructura) object;
        if ((this.estructraSirhIdn == null && other.estructraSirhIdn != null) || (this.estructraSirhIdn != null && !this.estructraSirhIdn.equals(other.estructraSirhIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Estructura[estructraSirhIdn=" + estructraSirhIdn + "]";
    }

}
