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
@Table(name = "LOTE")
@NamedQueries({
    @NamedQuery(name = "Lote.findAll", query = "SELECT l FROM Lote l"),
    @NamedQuery(name = "Lote.findByLoteIdn", query = "SELECT l FROM Lote l WHERE l.loteIdn = :loteIdn"),
    @NamedQuery(name = "Lote.findByLoteStatus", query = "SELECT l FROM Lote l WHERE l.loteStatus = :loteStatus"),
    @NamedQuery(name = "Lote.findByLoteCajaId", query = "SELECT l FROM Lote l WHERE l.loteCajaId = :loteCajaId")})
public class Lote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOTE_IDN")
    private Integer loteIdn;
    @Column(name = "LOTE_STATUS")
    private String loteStatus;
    @Column(name = "LOTE_CAJA_ID")
    private Long loteCajaId;
    @OneToMany(mappedBy = "loteIdn")
    private List<Comprobante> comprobanteList;

    public Lote() {
    }

    public Lote(Integer loteIdn) {
        this.loteIdn = loteIdn;
    }

    public Integer getLoteIdn() {
        return loteIdn;
    }

    public void setLoteIdn(Integer loteIdn) {
        this.loteIdn = loteIdn;
    }

    public String getLoteStatus() {
        return loteStatus;
    }

    public void setLoteStatus(String loteStatus) {
        this.loteStatus = loteStatus;
    }

    public Long getLoteCajaId() {
        return loteCajaId;
    }

    public void setLoteCajaId(Long loteCajaId) {
        this.loteCajaId = loteCajaId;
    }

    public List<Comprobante> getComprobanteList() {
        return comprobanteList;
    }

    public void setComprobanteList(List<Comprobante> comprobanteList) {
        this.comprobanteList = comprobanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loteIdn != null ? loteIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lote)) {
            return false;
        }
        Lote other = (Lote) object;
        if ((this.loteIdn == null && other.loteIdn != null) || (this.loteIdn != null && !this.loteIdn.equals(other.loteIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Lote[loteIdn=" + loteIdn + "]";
    }

}
