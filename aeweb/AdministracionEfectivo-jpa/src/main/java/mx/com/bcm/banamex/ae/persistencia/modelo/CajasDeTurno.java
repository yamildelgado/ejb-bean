/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "CAJAS_DE_TURNO")
@NamedQueries({
    @NamedQuery(name = "CajasDeTurno.findAll", query = "SELECT c FROM CajasDeTurno c"),
    @NamedQuery(name = "CajasDeTurno.findByCajaIdn", query = "SELECT c FROM CajasDeTurno c WHERE c.cajasDeTurnoPK.cajaIdn = :cajaIdn"),
    @NamedQuery(name = "CajasDeTurno.findByTurnoId", query = "SELECT c FROM CajasDeTurno c WHERE c.cajasDeTurnoPK.turnoId = :turnoId"),
    @NamedQuery(name = "CajasDeTurno.findByCajaxturnoBajaLogica", query = "SELECT c FROM CajasDeTurno c WHERE c.cajaxturnoBajaLogica = :cajaxturnoBajaLogica")})
public class CajasDeTurno implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajasDeTurnoPK cajasDeTurnoPK;
    @Column(name = "CAJAXTURNO_BAJA_LOGICA")
    private String cajaxturnoBajaLogica;
    @JoinColumn(name = "CAJA_IDN", referencedColumnName = "CAJA_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Caja caja;
    @JoinColumn(name = "TURNO_ID", referencedColumnName = "TURNO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Turno turno;

    public CajasDeTurno() {
    }

    public CajasDeTurno(CajasDeTurnoPK cajasDeTurnoPK) {
        this.cajasDeTurnoPK = cajasDeTurnoPK;
    }

    public CajasDeTurno(short cajaIdn, String turnoId) {
        this.cajasDeTurnoPK = new CajasDeTurnoPK(cajaIdn, turnoId);
    }

    public CajasDeTurnoPK getCajasDeTurnoPK() {
        return cajasDeTurnoPK;
    }

    public void setCajasDeTurnoPK(CajasDeTurnoPK cajasDeTurnoPK) {
        this.cajasDeTurnoPK = cajasDeTurnoPK;
    }

    public String getCajaxturnoBajaLogica() {
        return cajaxturnoBajaLogica;
    }

    public void setCajaxturnoBajaLogica(String cajaxturnoBajaLogica) {
        this.cajaxturnoBajaLogica = cajaxturnoBajaLogica;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajasDeTurnoPK != null ? cajasDeTurnoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajasDeTurno)) {
            return false;
        }
        CajasDeTurno other = (CajasDeTurno) object;
        if ((this.cajasDeTurnoPK == null && other.cajasDeTurnoPK != null) || (this.cajasDeTurnoPK != null && !this.cajasDeTurnoPK.equals(other.cajasDeTurnoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurno[cajasDeTurnoPK=" + cajasDeTurnoPK + "]";
    }

}
