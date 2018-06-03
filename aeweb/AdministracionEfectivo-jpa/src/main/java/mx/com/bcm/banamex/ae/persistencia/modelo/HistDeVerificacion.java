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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "HIST_DE_VERIFICACION")
@NamedQueries({
    @NamedQuery(name = "HistDeVerificacion.findAll", query = "SELECT h FROM HistDeVerificacion h"),
    @NamedQuery(name = "HistDeVerificacion.findByHistverificnIdn", query = "SELECT h FROM HistDeVerificacion h WHERE h.histverificnIdn = :histverificnIdn"),
    @NamedQuery(name = "HistDeVerificacion.findByHistverificnFecHrFin", query = "SELECT h FROM HistDeVerificacion h WHERE h.histverificnFecHrFin = :histverificnFecHrFin"),
    @NamedQuery(name = "HistDeVerificacion.findByHistverificnFecCntbleVerfc", query = "SELECT h FROM HistDeVerificacion h WHERE h.histverificnFecCntbleVerfc = :histverificnFecCntbleVerfc")})
public class HistDeVerificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HISTVERIFICN_IDN")
    private Long histverificnIdn;
    @Column(name = "HISTVERIFICN_FEC_HR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date histverificnFecHrFin;
    @Column(name = "HISTVERIFICN_FEC_CNTBLE_VERFC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date histverificnFecCntbleVerfc;
    @JoinColumns({
        @JoinColumn(name = "CAJA_IDN", referencedColumnName = "CAJA_IDN"),
        @JoinColumn(name = "VERIFN_FEC_HR_INI", referencedColumnName = "VERIFN_FEC_HR_INI")})
    @ManyToOne
    private Verificacion verificacion;

    public HistDeVerificacion() {
    }

    public HistDeVerificacion(Long histverificnIdn) {
        this.histverificnIdn = histverificnIdn;
    }

    public Long getHistverificnIdn() {
        return histverificnIdn;
    }

    public void setHistverificnIdn(Long histverificnIdn) {
        this.histverificnIdn = histverificnIdn;
    }

    public Date getHistverificnFecHrFin() {
        return histverificnFecHrFin;
    }

    public void setHistverificnFecHrFin(Date histverificnFecHrFin) {
        this.histverificnFecHrFin = histverificnFecHrFin;
    }

    public Date getHistverificnFecCntbleVerfc() {
        return histverificnFecCntbleVerfc;
    }

    public void setHistverificnFecCntbleVerfc(Date histverificnFecCntbleVerfc) {
        this.histverificnFecCntbleVerfc = histverificnFecCntbleVerfc;
    }

    public Verificacion getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(Verificacion verificacion) {
        this.verificacion = verificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (histverificnIdn != null ? histverificnIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistDeVerificacion)) {
            return false;
        }
        HistDeVerificacion other = (HistDeVerificacion) object;
        if ((this.histverificnIdn == null && other.histverificnIdn != null) || (this.histverificnIdn != null && !this.histverificnIdn.equals(other.histverificnIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.HistDeVerificacion[histverificnIdn=" + histverificnIdn + "]";
    }

}
