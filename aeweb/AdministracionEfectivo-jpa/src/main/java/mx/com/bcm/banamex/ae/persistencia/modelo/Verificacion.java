/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "VERIFICACION")
@NamedQueries({
    @NamedQuery(name = "Verificacion.findAll", query = "SELECT v FROM Verificacion v"),
    @NamedQuery(name = "Verificacion.findByCajaIdn", query = "SELECT v FROM Verificacion v WHERE v.verificacionPK.cajaIdn = :cajaIdn"),
    @NamedQuery(name = "Verificacion.findByVerifnFecHrIni", query = "SELECT v FROM Verificacion v WHERE v.verificacionPK.verifnFecHrIni = :verifnFecHrIni"),
    @NamedQuery(name = "Verificacion.findByVerifnFecHrFin", query = "SELECT v FROM Verificacion v WHERE v.verifnFecHrFin = :verifnFecHrFin"),
    @NamedQuery(name = "Verificacion.findByVerifnFecContableVerifn", query = "SELECT v FROM Verificacion v WHERE v.verifnFecContableVerifn = :verifnFecContableVerifn")})
public class Verificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VerificacionPK verificacionPK;
    @Column(name = "VERIFN_FEC_HR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date verifnFecHrFin;
    @Column(name = "VERIFN_FEC_CONTABLE_VERIFN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date verifnFecContableVerifn;
    @OneToMany(mappedBy = "verificacion")
    private List<HistDeVerificacion> histDeVerificacionList;
    @JoinColumns({
        @JoinColumn(name = "CAJA_IDN", referencedColumnName = "CAJA_IDN", insertable = false, updatable = false),
        @JoinColumn(name = "CAJAHAB_FEC_HR_HABILITA", referencedColumnName = "CAJAHAB_FEC_HR_HABILITA")})
    @ManyToOne(optional = false)
    private CajaHabilitadaPorTurno cajaHabilitadaPorTurno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "verificacion")
    private List<Comprobante> comprobanteList;

    public Verificacion() {
    }

    public Verificacion(VerificacionPK verificacionPK) {
        this.verificacionPK = verificacionPK;
    }

    public Verificacion(short cajaIdn, Date verifnFecHrIni) {
        this.verificacionPK = new VerificacionPK(cajaIdn, verifnFecHrIni);
    }

    public VerificacionPK getVerificacionPK() {
        return verificacionPK;
    }

    public void setVerificacionPK(VerificacionPK verificacionPK) {
        this.verificacionPK = verificacionPK;
    }

    public Date getVerifnFecHrFin() {
        return verifnFecHrFin;
    }

    public void setVerifnFecHrFin(Date verifnFecHrFin) {
        this.verifnFecHrFin = verifnFecHrFin;
    }

    public Date getVerifnFecContableVerifn() {
        return verifnFecContableVerifn;
    }

    public void setVerifnFecContableVerifn(Date verifnFecContableVerifn) {
        this.verifnFecContableVerifn = verifnFecContableVerifn;
    }

    public List<HistDeVerificacion> getHistDeVerificacionList() {
        return histDeVerificacionList;
    }

    public void setHistDeVerificacionList(List<HistDeVerificacion> histDeVerificacionList) {
        this.histDeVerificacionList = histDeVerificacionList;
    }

    public CajaHabilitadaPorTurno getCajaHabilitadaPorTurno() {
        return cajaHabilitadaPorTurno;
    }

    public void setCajaHabilitadaPorTurno(CajaHabilitadaPorTurno cajaHabilitadaPorTurno) {
        this.cajaHabilitadaPorTurno = cajaHabilitadaPorTurno;
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
        hash += (verificacionPK != null ? verificacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Verificacion)) {
            return false;
        }
        Verificacion other = (Verificacion) object;
        if ((this.verificacionPK == null && other.verificacionPK != null) || (this.verificacionPK != null && !this.verificacionPK.equals(other.verificacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Verificacion[verificacionPK=" + verificacionPK + "]";
    }

}
