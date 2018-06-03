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
@Table(name = "CAT_EVENTOS_BITACORA")
@NamedQueries({
    @NamedQuery(name = "CatEventosBitacora.findAll", query = "SELECT c FROM CatEventosBitacora c"),
    @NamedQuery(name = "CatEventosBitacora.findByEventoIdn", query = "SELECT c FROM CatEventosBitacora c WHERE c.eventoIdn = :eventoIdn"),
    @NamedQuery(name = "CatEventosBitacora.findByEventoDescripcion", query = "SELECT c FROM CatEventosBitacora c WHERE c.eventoDescripcion = :eventoDescripcion"),
    @NamedQuery(name = "CatEventosBitacora.findByEventoAgrupador", query = "SELECT c FROM CatEventosBitacora c WHERE c.eventoAgrupador = :eventoAgrupador")})
public class CatEventosBitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EVENTO_IDN")
    private Short eventoIdn;
    @Column(name = "EVENTO_DESCRIPCION")
    private String eventoDescripcion;
    @Column(name = "EVENTO_AGRUPADOR")
    private String eventoAgrupador;
    @OneToMany(mappedBy = "eventoIdn")
    private List<Bitacora> bitacoraList;

    public CatEventosBitacora() {
    }

    public CatEventosBitacora(Short eventoIdn) {
        this.eventoIdn = eventoIdn;
    }

    public Short getEventoIdn() {
        return eventoIdn;
    }

    public void setEventoIdn(Short eventoIdn) {
        this.eventoIdn = eventoIdn;
    }

    public String getEventoDescripcion() {
        return eventoDescripcion;
    }

    public void setEventoDescripcion(String eventoDescripcion) {
        this.eventoDescripcion = eventoDescripcion;
    }

    public String getEventoAgrupador() {
        return eventoAgrupador;
    }

    public void setEventoAgrupador(String eventoAgrupador) {
        this.eventoAgrupador = eventoAgrupador;
    }

    public List<Bitacora> getBitacoraList() {
        return bitacoraList;
    }

    public void setBitacoraList(List<Bitacora> bitacoraList) {
        this.bitacoraList = bitacoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventoIdn != null ? eventoIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEventosBitacora)) {
            return false;
        }
        CatEventosBitacora other = (CatEventosBitacora) object;
        if ((this.eventoIdn == null && other.eventoIdn != null) || (this.eventoIdn != null && !this.eventoIdn.equals(other.eventoIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CatEventosBitacora[eventoIdn=" + eventoIdn + "]";
    }

}
