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
@Table(name = "CAJA_HABILITADA_POR_TURNO")
@NamedQueries({
    @NamedQuery(name = "CajaHabilitadaPorTurno.findAll", query = "SELECT c FROM CajaHabilitadaPorTurno c"),
    @NamedQuery(name = "CajaHabilitadaPorTurno.findByCajaIdn", query = "SELECT c FROM CajaHabilitadaPorTurno c WHERE c.cajaHabilitadaPorTurnoPK.cajaIdn = :cajaIdn"),
    @NamedQuery(name = "CajaHabilitadaPorTurno.findByCajahabFecHrHabilita", query = "SELECT c FROM CajaHabilitadaPorTurno c WHERE c.cajaHabilitadaPorTurnoPK.cajahabFecHrHabilita = :cajahabFecHrHabilita"),
    @NamedQuery(name = "CajaHabilitadaPorTurno.findByCajahabCompbtesPendientes", query = "SELECT c FROM CajaHabilitadaPorTurno c WHERE c.cajahabCompbtesPendientes = :cajahabCompbtesPendientes"),
    @NamedQuery(name = "CajaHabilitadaPorTurno.findByCajahabFecHrDeshabilitada", query = "SELECT c FROM CajaHabilitadaPorTurno c WHERE c.cajahabFecHrDeshabilitada = :cajahabFecHrDeshabilitada"),
    @NamedQuery(name = "CajaHabilitadaPorTurno.findByCajahabNivelDeDificultad", query = "SELECT c FROM CajaHabilitadaPorTurno c WHERE c.cajahabNivelDeDificultad = :cajahabNivelDeDificultad")})
public class CajaHabilitadaPorTurno implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajaHabilitadaPorTurnoPK cajaHabilitadaPorTurnoPK;
    @Column(name = "CAJAHAB_COMPBTES_PENDIENTES")
    private Short cajahabCompbtesPendientes;
    @Column(name = "CAJAHAB_FEC_HR_DESHABILITADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cajahabFecHrDeshabilitada;
    @Column(name = "CAJAHAB_NIVEL_DE_DIFICULTAD")
    private Short cajahabNivelDeDificultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajaHabilitadaPorTurno")
    private List<Recepcion> recepcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajaHabilitadaPorTurno")
    private List<Verificacion> verificacionList;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "EMP_NOMINA", referencedColumnName = "EMP_NOMINA")
    @ManyToOne
    private Empleado empNomina;
    @JoinColumns({
        @JoinColumn(name = "HIST_FEC_HR_INI", referencedColumnName = "HIST_FEC_HOR_INI"),
        @JoinColumn(name = "TURNO_ID", referencedColumnName = "TURNO_ID")})
    @ManyToOne(optional = false)
    private HistTurnoEnOperacion histTurnoEnOperacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajaHabilitadaPorTurno")
    private List<Transferencia> transferenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajaHabilitadaPorTurno")
    private List<Corte> corteList;

    public CajaHabilitadaPorTurno() {
    }

    public CajaHabilitadaPorTurno(CajaHabilitadaPorTurnoPK cajaHabilitadaPorTurnoPK) {
        this.cajaHabilitadaPorTurnoPK = cajaHabilitadaPorTurnoPK;
    }

    public CajaHabilitadaPorTurno(short cajaIdn, Date cajahabFecHrHabilita) {
        this.cajaHabilitadaPorTurnoPK = new CajaHabilitadaPorTurnoPK(cajaIdn, cajahabFecHrHabilita);
    }

    public CajaHabilitadaPorTurnoPK getCajaHabilitadaPorTurnoPK() {
        return cajaHabilitadaPorTurnoPK;
    }

    public void setCajaHabilitadaPorTurnoPK(CajaHabilitadaPorTurnoPK cajaHabilitadaPorTurnoPK) {
        this.cajaHabilitadaPorTurnoPK = cajaHabilitadaPorTurnoPK;
    }

    public Short getCajahabCompbtesPendientes() {
        return cajahabCompbtesPendientes;
    }

    public void setCajahabCompbtesPendientes(Short cajahabCompbtesPendientes) {
        this.cajahabCompbtesPendientes = cajahabCompbtesPendientes;
    }

    public Date getCajahabFecHrDeshabilitada() {
        return cajahabFecHrDeshabilitada;
    }

    public void setCajahabFecHrDeshabilitada(Date cajahabFecHrDeshabilitada) {
        this.cajahabFecHrDeshabilitada = cajahabFecHrDeshabilitada;
    }

    public Short getCajahabNivelDeDificultad() {
        return cajahabNivelDeDificultad;
    }

    public void setCajahabNivelDeDificultad(Short cajahabNivelDeDificultad) {
        this.cajahabNivelDeDificultad = cajahabNivelDeDificultad;
    }

    public List<Recepcion> getRecepcionList() {
        return recepcionList;
    }

    public void setRecepcionList(List<Recepcion> recepcionList) {
        this.recepcionList = recepcionList;
    }

    public List<Verificacion> getVerificacionList() {
        return verificacionList;
    }

    public void setVerificacionList(List<Verificacion> verificacionList) {
        this.verificacionList = verificacionList;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public Empleado getEmpNomina() {
        return empNomina;
    }

    public void setEmpNomina(Empleado empNomina) {
        this.empNomina = empNomina;
    }

    public HistTurnoEnOperacion getHistTurnoEnOperacion() {
        return histTurnoEnOperacion;
    }

    public void setHistTurnoEnOperacion(HistTurnoEnOperacion histTurnoEnOperacion) {
        this.histTurnoEnOperacion = histTurnoEnOperacion;
    }

    public List<Transferencia> getTransferenciaList() {
        return transferenciaList;
    }

    public void setTransferenciaList(List<Transferencia> transferenciaList) {
        this.transferenciaList = transferenciaList;
    }

    public List<Corte> getCorteList() {
        return corteList;
    }

    public void setCorteList(List<Corte> corteList) {
        this.corteList = corteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaHabilitadaPorTurnoPK != null ? cajaHabilitadaPorTurnoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajaHabilitadaPorTurno)) {
            return false;
        }
        CajaHabilitadaPorTurno other = (CajaHabilitadaPorTurno) object;
        if ((this.cajaHabilitadaPorTurnoPK == null && other.cajaHabilitadaPorTurnoPK != null) || (this.cajaHabilitadaPorTurnoPK != null && !this.cajaHabilitadaPorTurnoPK.equals(other.cajaHabilitadaPorTurnoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurno[cajaHabilitadaPorTurnoPK=" + cajaHabilitadaPorTurnoPK + "]";
    }

}
