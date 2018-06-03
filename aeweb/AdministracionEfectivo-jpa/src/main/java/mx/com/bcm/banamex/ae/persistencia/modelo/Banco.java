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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "BANCO")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByBancoIdn", query = "SELECT b FROM Banco b WHERE b.bancoIdn = :bancoIdn"),
    @NamedQuery(name = "Banco.findByBancoAbrev", query = "SELECT b FROM Banco b WHERE b.bancoAbrev = :bancoAbrev"),
    @NamedQuery(name = "Banco.findByBancoDescripcionLarga", query = "SELECT b FROM Banco b WHERE b.bancoDescripcionLarga = :bancoDescripcionLarga"),
    @NamedQuery(name = "Banco.findByBancoDescripcionCorta", query = "SELECT b FROM Banco b WHERE b.bancoDescripcionCorta = :bancoDescripcionCorta"),
    @NamedQuery(name = "Banco.findByBancoDesPantalla", query = "SELECT b FROM Banco b WHERE b.bancoDesPantalla = :bancoDesPantalla"),
    @NamedQuery(name = "Banco.findByBancoBajaLogica", query = "SELECT b FROM Banco b WHERE b.bancoBajaLogica = :bancoBajaLogica")})
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BANCO_IDN")
    private Short bancoIdn;
    @Column(name = "BANCO_ABREV")
    private String bancoAbrev;
    @Column(name = "BANCO_DESCRIPCION_LARGA")
    private String bancoDescripcionLarga;
    @Column(name = "BANCO_DESCRIPCION_CORTA")
    private String bancoDescripcionCorta;
    @Column(name = "BANCO_DES_PANTALLA")
    private String bancoDesPantalla;
    @Column(name = "BANCO_BAJA_LOGICA")
    private String bancoBajaLogica;
    @OneToMany(mappedBy = "bancoIdn")
    private List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList;

    public Banco() {
    }

    public Banco(Short bancoIdn) {
        this.bancoIdn = bancoIdn;
    }

    public Short getBancoIdn() {
        return bancoIdn;
    }

    public void setBancoIdn(Short bancoIdn) {
        this.bancoIdn = bancoIdn;
    }

    public String getBancoAbrev() {
        return bancoAbrev;
    }

    public void setBancoAbrev(String bancoAbrev) {
        this.bancoAbrev = bancoAbrev;
    }

    public String getBancoDescripcionLarga() {
        return bancoDescripcionLarga;
    }

    public void setBancoDescripcionLarga(String bancoDescripcionLarga) {
        this.bancoDescripcionLarga = bancoDescripcionLarga;
    }

    public String getBancoDescripcionCorta() {
        return bancoDescripcionCorta;
    }

    public void setBancoDescripcionCorta(String bancoDescripcionCorta) {
        this.bancoDescripcionCorta = bancoDescripcionCorta;
    }

    public String getBancoDesPantalla() {
        return bancoDesPantalla;
    }

    public void setBancoDesPantalla(String bancoDesPantalla) {
        this.bancoDesPantalla = bancoDesPantalla;
    }

    public String getBancoBajaLogica() {
        return bancoBajaLogica;
    }

    public void setBancoBajaLogica(String bancoBajaLogica) {
        this.bancoBajaLogica = bancoBajaLogica;
    }

    public List<DetalleInterfaceProcesadora> getDetalleInterfaceProcesadoraList() {
        return detalleInterfaceProcesadoraList;
    }

    public void setDetalleInterfaceProcesadoraList(List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList) {
        this.detalleInterfaceProcesadoraList = detalleInterfaceProcesadoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bancoIdn != null ? bancoIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.bancoIdn == null && other.bancoIdn != null) || (this.bancoIdn != null && !this.bancoIdn.equals(other.bancoIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Banco[bancoIdn=" + bancoIdn + "]";
    }

}
