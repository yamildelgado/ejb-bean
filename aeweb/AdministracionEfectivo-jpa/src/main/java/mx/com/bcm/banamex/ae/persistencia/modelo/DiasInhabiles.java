/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "DIAS_INHABILES")
@NamedQueries({
    @NamedQuery(name = "DiasInhabiles.findAll", query = "SELECT d FROM DiasInhabiles d"),
    @NamedQuery(name = "DiasInhabiles.findByDdDfestivo", query = "SELECT d FROM DiasInhabiles d WHERE d.ddDfestivo = :ddDfestivo"),
    @NamedQuery(name = "DiasInhabiles.findByDdTipocal", query = "SELECT d FROM DiasInhabiles d WHERE d.ddTipocal = :ddTipocal")})
public class DiasInhabiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DD_DFESTIVO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ddDfestivo;
    @Column(name = "DD_TIPOCAL")
    private String ddTipocal;

    public DiasInhabiles() {
    }

    public DiasInhabiles(Date ddDfestivo) {
        this.ddDfestivo = ddDfestivo;
    }

    public Date getDdDfestivo() {
        return ddDfestivo;
    }

    public void setDdDfestivo(Date ddDfestivo) {
        this.ddDfestivo = ddDfestivo;
    }

    public String getDdTipocal() {
        return ddTipocal;
    }

    public void setDdTipocal(String ddTipocal) {
        this.ddTipocal = ddTipocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ddDfestivo != null ? ddDfestivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiasInhabiles)) {
            return false;
        }
        DiasInhabiles other = (DiasInhabiles) object;
        if ((this.ddDfestivo == null && other.ddDfestivo != null) || (this.ddDfestivo != null && !this.ddDfestivo.equals(other.ddDfestivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DiasInhabiles[ddDfestivo=" + ddDfestivo + "]";
    }

}
