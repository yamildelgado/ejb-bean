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
@Table(name = "MODULOS_SISTEMA_AEWEB")
@NamedQueries({
    @NamedQuery(name = "ModulosSistemaAeweb.findAll", query = "SELECT m FROM ModulosSistemaAeweb m"),
    @NamedQuery(name = "ModulosSistemaAeweb.findByModsisNivId", query = "SELECT m FROM ModulosSistemaAeweb m WHERE m.modsisNivId = :modsisNivId"),
    @NamedQuery(name = "ModulosSistemaAeweb.findByModsisStatus", query = "SELECT m FROM ModulosSistemaAeweb m WHERE m.modsisStatus = :modsisStatus"),
    @NamedQuery(name = "ModulosSistemaAeweb.findByModsisDescripcionMod", query = "SELECT m FROM ModulosSistemaAeweb m WHERE m.modsisDescripcionMod = :modsisDescripcionMod"),
    @NamedQuery(name = "ModulosSistemaAeweb.findByModsisBajaLogica", query = "SELECT m FROM ModulosSistemaAeweb m WHERE m.modsisBajaLogica = :modsisBajaLogica")})
public class ModulosSistemaAeweb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MODSIS_NIV_ID")
    private Integer modsisNivId;
    @Column(name = "MODSIS_STATUS")
    private String modsisStatus;
    @Column(name = "MODSIS_DESCRIPCION_MOD")
    private String modsisDescripcionMod;
    @Column(name = "MODSIS_BAJA_LOGICA")
    private String modsisBajaLogica;

    public ModulosSistemaAeweb() {
    }

    public ModulosSistemaAeweb(Integer modsisNivId) {
        this.modsisNivId = modsisNivId;
    }

    public Integer getModsisNivId() {
        return modsisNivId;
    }

    public void setModsisNivId(Integer modsisNivId) {
        this.modsisNivId = modsisNivId;
    }

    public String getModsisStatus() {
        return modsisStatus;
    }

    public void setModsisStatus(String modsisStatus) {
        this.modsisStatus = modsisStatus;
    }

    public String getModsisDescripcionMod() {
        return modsisDescripcionMod;
    }

    public void setModsisDescripcionMod(String modsisDescripcionMod) {
        this.modsisDescripcionMod = modsisDescripcionMod;
    }

    public String getModsisBajaLogica() {
        return modsisBajaLogica;
    }

    public void setModsisBajaLogica(String modsisBajaLogica) {
        this.modsisBajaLogica = modsisBajaLogica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modsisNivId != null ? modsisNivId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModulosSistemaAeweb)) {
            return false;
        }
        ModulosSistemaAeweb other = (ModulosSistemaAeweb) object;
        if ((this.modsisNivId == null && other.modsisNivId != null) || (this.modsisNivId != null && !this.modsisNivId.equals(other.modsisNivId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.ModulosSistemaAeweb[modsisNivId=" + modsisNivId + "]";
    }

}
