/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "FECHA_CONTABLE")
@NamedQueries({
    @NamedQuery(name = "FechaContable.findAll", query = "SELECT f FROM FechaContable f"),
    @NamedQuery(name = "FechaContable.findByFeccontIdn", query = "SELECT f FROM FechaContable f WHERE f.feccontIdn = :feccontIdn"),
    @NamedQuery(name = "FechaContable.findByFeccontStatus", query = "SELECT f FROM FechaContable f WHERE f.feccontStatus = :feccontStatus")})
public class FechaContable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FECCONT_IDN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feccontIdn;
    @Column(name = "FECCONT_STATUS")
    private String feccontStatus;
    @OneToMany(mappedBy = "feccontIdn")
    private List<HistTurnoEnOperacion> histTurnoEnOperacionList;

    public FechaContable() {
    }

    public FechaContable(Date feccontIdn) {
        this.feccontIdn = feccontIdn;
    }

    public Date getFeccontIdn() {
        return feccontIdn;
    }

    public void setFeccontIdn(Date feccontIdn) {
        this.feccontIdn = feccontIdn;
    }

    public String getFeccontStatus() {
        return feccontStatus;
    }

    public void setFeccontStatus(String feccontStatus) {
        this.feccontStatus = feccontStatus;
    }

    public List<HistTurnoEnOperacion> getHistTurnoEnOperacionList() {
        return histTurnoEnOperacionList;
    }

    public void setHistTurnoEnOperacionList(List<HistTurnoEnOperacion> histTurnoEnOperacionList) {
        this.histTurnoEnOperacionList = histTurnoEnOperacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feccontIdn != null ? feccontIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechaContable)) {
            return false;
        }
        FechaContable other = (FechaContable) object;
        if ((this.feccontIdn == null && other.feccontIdn != null) || (this.feccontIdn != null && !this.feccontIdn.equals(other.feccontIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable[feccontIdn=" + feccontIdn + "]";
    }

}
