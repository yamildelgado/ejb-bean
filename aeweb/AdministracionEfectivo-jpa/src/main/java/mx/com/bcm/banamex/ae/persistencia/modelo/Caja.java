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
@Table(name = "CAJA")
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c"),
    @NamedQuery(name = "Caja.findByCajaIdn", query = "SELECT c FROM Caja c WHERE c.cajaIdn = :cajaIdn"),
    @NamedQuery(name = "Caja.findByCajaModeloEquipoBill", query = "SELECT c FROM Caja c WHERE c.cajaModeloEquipoBill = :cajaModeloEquipoBill"),
    @NamedQuery(name = "Caja.findByCajaIpAddress", query = "SELECT c FROM Caja c WHERE c.cajaIpAddress = :cajaIpAddress"),
    @NamedQuery(name = "Caja.findByCajaEquip", query = "SELECT c FROM Caja c WHERE c.cajaEquip = :cajaEquip"),
    @NamedQuery(name = "Caja.findByCajaModeloEquipoMon", query = "SELECT c FROM Caja c WHERE c.cajaModeloEquipoMon = :cajaModeloEquipoMon"),
    @NamedQuery(name = "Caja.findByCajaBajaLogica", query = "SELECT c FROM Caja c WHERE c.cajaBajaLogica = :cajaBajaLogica")})
public class Caja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAJA_IDN")
    private Short cajaIdn;
    @Column(name = "CAJA_MODELO_EQUIPO_BILL")
    private String cajaModeloEquipoBill;
    @Column(name = "CAJA_IP_ADDRESS")
    private String cajaIpAddress;
    @Column(name = "CAJA_EQUIP")
    private String cajaEquip;
    @Column(name = "CAJA_MODELO_EQUIPO_MON")
    private String cajaModeloEquipoMon;
    @Column(name = "CAJA_BAJA_LOGICA")
    private String cajaBajaLogica;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumns({
        @JoinColumn(name = "SUBBOVEDA_IDN", referencedColumnName = "SUBBOVEDA_IDN"),
        @JoinColumn(name = "CPAES_ESTRUCTURA_SIRH_IDN", referencedColumnName = "CPAES_ESTRUCTURA_SIRH_IDN")})
    @ManyToOne(optional = false)
    private SubBoveda subBoveda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caja")
    private List<CajasDeTurno> cajasDeTurnoList;

    public Caja() {
    }

    public Caja(Short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public Short getCajaIdn() {
        return cajaIdn;
    }

    public void setCajaIdn(Short cajaIdn) {
        this.cajaIdn = cajaIdn;
    }

    public String getCajaModeloEquipoBill() {
        return cajaModeloEquipoBill;
    }

    public void setCajaModeloEquipoBill(String cajaModeloEquipoBill) {
        this.cajaModeloEquipoBill = cajaModeloEquipoBill;
    }

    public String getCajaIpAddress() {
        return cajaIpAddress;
    }

    public void setCajaIpAddress(String cajaIpAddress) {
        this.cajaIpAddress = cajaIpAddress;
    }

    public String getCajaEquip() {
        return cajaEquip;
    }

    public void setCajaEquip(String cajaEquip) {
        this.cajaEquip = cajaEquip;
    }

    public String getCajaModeloEquipoMon() {
        return cajaModeloEquipoMon;
    }

    public void setCajaModeloEquipoMon(String cajaModeloEquipoMon) {
        this.cajaModeloEquipoMon = cajaModeloEquipoMon;
    }

    public String getCajaBajaLogica() {
        return cajaBajaLogica;
    }

    public void setCajaBajaLogica(String cajaBajaLogica) {
        this.cajaBajaLogica = cajaBajaLogica;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public SubBoveda getSubBoveda() {
        return subBoveda;
    }

    public void setSubBoveda(SubBoveda subBoveda) {
        this.subBoveda = subBoveda;
    }

    public List<CajasDeTurno> getCajasDeTurnoList() {
        return cajasDeTurnoList;
    }

    public void setCajasDeTurnoList(List<CajasDeTurno> cajasDeTurnoList) {
        this.cajasDeTurnoList = cajasDeTurnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaIdn != null ? cajaIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.cajaIdn == null && other.cajaIdn != null) || (this.cajaIdn != null && !this.cajaIdn.equals(other.cajaIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Caja[cajaIdn=" + cajaIdn + "]";
    }

}
