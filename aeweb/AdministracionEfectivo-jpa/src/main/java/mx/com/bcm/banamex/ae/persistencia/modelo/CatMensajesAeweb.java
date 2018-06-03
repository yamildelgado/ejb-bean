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
@Table(name = "CAT_MENSAJES_AEWEB")
@NamedQueries({
    @NamedQuery(name = "CatMensajesAeweb.findAll", query = "SELECT c FROM CatMensajesAeweb c"),
    @NamedQuery(name = "CatMensajesAeweb.findByMensajeCodigo", query = "SELECT c FROM CatMensajesAeweb c WHERE c.mensajeCodigo = :mensajeCodigo"),
    @NamedQuery(name = "CatMensajesAeweb.findByMensajeNombre", query = "SELECT c FROM CatMensajesAeweb c WHERE c.mensajeNombre = :mensajeNombre"),
    @NamedQuery(name = "CatMensajesAeweb.findByMensajeDescripcion", query = "SELECT c FROM CatMensajesAeweb c WHERE c.mensajeDescripcion = :mensajeDescripcion")})
public class CatMensajesAeweb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MENSAJE_CODIGO")
    private Integer mensajeCodigo;
    @Column(name = "MENSAJE_NOMBRE")
    private String mensajeNombre;
    @Column(name = "MENSAJE_DESCRIPCION")
    private String mensajeDescripcion;

    public CatMensajesAeweb() {
    }

    public CatMensajesAeweb(Integer mensajeCodigo) {
        this.mensajeCodigo = mensajeCodigo;
    }

    public Integer getMensajeCodigo() {
        return mensajeCodigo;
    }

    public void setMensajeCodigo(Integer mensajeCodigo) {
        this.mensajeCodigo = mensajeCodigo;
    }

    public String getMensajeNombre() {
        return mensajeNombre;
    }

    public void setMensajeNombre(String mensajeNombre) {
        this.mensajeNombre = mensajeNombre;
    }

    public String getMensajeDescripcion() {
        return mensajeDescripcion;
    }

    public void setMensajeDescripcion(String mensajeDescripcion) {
        this.mensajeDescripcion = mensajeDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mensajeCodigo != null ? mensajeCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatMensajesAeweb)) {
            return false;
        }
        CatMensajesAeweb other = (CatMensajesAeweb) object;
        if ((this.mensajeCodigo == null && other.mensajeCodigo != null) || (this.mensajeCodigo != null && !this.mensajeCodigo.equals(other.mensajeCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb[mensajeCodigo=" + mensajeCodigo + "]";
    }

}
