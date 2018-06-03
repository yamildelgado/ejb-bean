/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "MODULO_POR_PERFIL_USUARIO")
@NamedQueries({
    @NamedQuery(name = "ModuloPorPerfilUsuario.findAll", query = "SELECT m FROM ModuloPorPerfilUsuario m"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModIdnMod", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modIdnMod = :modIdnMod"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModDescripcion", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modDescripcion = :modDescripcion"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModSubmoduloId", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modSubmoduloId = :modSubmoduloId"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModNivelClave", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modNivelClave = :modNivelClave"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModNivelDescripcion", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modNivelDescripcion = :modNivelDescripcion"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModStatus", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modStatus = :modStatus"),
    @NamedQuery(name = "ModuloPorPerfilUsuario.findByModBajaLogica", query = "SELECT m FROM ModuloPorPerfilUsuario m WHERE m.modBajaLogica = :modBajaLogica")})
public class ModuloPorPerfilUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOD_IDN_MOD")
    private Short modIdnMod;
    @Column(name = "MOD_DESCRIPCION")
    private String modDescripcion;
    @Column(name = "MOD_SUBMODULO_ID")
    private Short modSubmoduloId;
    @Column(name = "MOD_NIVEL_CLAVE")
    private Short modNivelClave;
    @Column(name = "MOD_NIVEL_DESCRIPCION")
    private String modNivelDescripcion;
    @Column(name = "MOD_STATUS")
    private Character modStatus;
    @Column(name = "MOD_BAJA_LOGICA")
    private String modBajaLogica;

    public ModuloPorPerfilUsuario() {
    }

    public ModuloPorPerfilUsuario(Short modIdnMod) {
        this.modIdnMod = modIdnMod;
    }

    public Short getModIdnMod() {
        return modIdnMod;
    }

    public void setModIdnMod(Short modIdnMod) {
        this.modIdnMod = modIdnMod;
    }

    public String getModDescripcion() {
        return modDescripcion;
    }

    public void setModDescripcion(String modDescripcion) {
        this.modDescripcion = modDescripcion;
    }

    public Short getModSubmoduloId() {
        return modSubmoduloId;
    }

    public void setModSubmoduloId(Short modSubmoduloId) {
        this.modSubmoduloId = modSubmoduloId;
    }

    public Short getModNivelClave() {
        return modNivelClave;
    }

    public void setModNivelClave(Short modNivelClave) {
        this.modNivelClave = modNivelClave;
    }

    public String getModNivelDescripcion() {
        return modNivelDescripcion;
    }

    public void setModNivelDescripcion(String modNivelDescripcion) {
        this.modNivelDescripcion = modNivelDescripcion;
    }

    public Character getModStatus() {
        return modStatus;
    }

    public void setModStatus(Character modStatus) {
        this.modStatus = modStatus;
    }

    public String getModBajaLogica() {
        return modBajaLogica;
    }

    public void setModBajaLogica(String modBajaLogica) {
        this.modBajaLogica = modBajaLogica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modIdnMod != null ? modIdnMod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModuloPorPerfilUsuario)) {
            return false;
        }
        ModuloPorPerfilUsuario other = (ModuloPorPerfilUsuario) object;
        if ((this.modIdnMod == null && other.modIdnMod != null) || (this.modIdnMod != null && !this.modIdnMod.equals(other.modIdnMod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.ModuloPorPerfilUsuario[modIdnMod=" + modIdnMod + "]";
    }

}
