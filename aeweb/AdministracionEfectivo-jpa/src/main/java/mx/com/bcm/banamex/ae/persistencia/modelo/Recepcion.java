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
@Table(name = "RECEPCION")
@NamedQueries({
    @NamedQuery(name = "Recepcion.findAll", query = "SELECT r FROM Recepcion r"),
    @NamedQuery(name = "Recepcion.findByCajaIdn", query = "SELECT r FROM Recepcion r WHERE r.recepcionPK.cajaIdn = :cajaIdn"),
    @NamedQuery(name = "Recepcion.findByRecepFecHrIni", query = "SELECT r FROM Recepcion r WHERE r.recepcionPK.recepFecHrIni = :recepFecHrIni"),
    @NamedQuery(name = "Recepcion.findByEtvIdn", query = "SELECT r FROM Recepcion r WHERE r.recepcionPK.etvIdn = :etvIdn"),
    @NamedQuery(name = "Recepcion.findByUnegId", query = "SELECT r FROM Recepcion r WHERE r.unegId = :unegId"),
    @NamedQuery(name = "Recepcion.findByCpaesEstructuraSirhIdn", query = "SELECT r FROM Recepcion r WHERE r.cpaesEstructuraSirhIdn = :cpaesEstructuraSirhIdn"),
    @NamedQuery(name = "Recepcion.findByCntrtoNum", query = "SELECT r FROM Recepcion r WHERE r.cntrtoNum = :cntrtoNum"),
    @NamedQuery(name = "Recepcion.findByRecepNumCamionetv", query = "SELECT r FROM Recepcion r WHERE r.recepNumCamionetv = :recepNumCamionetv"),
    @NamedQuery(name = "Recepcion.findByRecepFecHrFin", query = "SELECT r FROM Recepcion r WHERE r.recepFecHrFin = :recepFecHrFin"),
    @NamedQuery(name = "Recepcion.findByRecepEnvases", query = "SELECT r FROM Recepcion r WHERE r.recepEnvases = :recepEnvases")})
public class Recepcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecepcionPK recepcionPK;
    @Column(name = "UNEG_ID")
    private Short unegId;
    @Column(name = "CPAES_ESTRUCTURA_SIRH_IDN")
    private Integer cpaesEstructuraSirhIdn;
    @Column(name = "CNTRTO_NUM")
    private String cntrtoNum;
    @Column(name = "RECEP_NUM_CAMIONETV")
    private String recepNumCamionetv;
    @Column(name = "RECEP_FEC_HR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recepFecHrFin;
    @Column(name = "RECEP_ENVASES")
    private Short recepEnvases;
    @JoinColumns({
        @JoinColumn(name = "CAJA_IDN", referencedColumnName = "CAJA_IDN", insertable = false, updatable = false),
        @JoinColumn(name = "CAJAHAB_FEC_HR_HABILITA", referencedColumnName = "CAJAHAB_FEC_HR_HABILITA")})
    @ManyToOne(optional = false)
    private CajaHabilitadaPorTurno cajaHabilitadaPorTurno;
    @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etv etv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recepcion")
    private List<Comprobante> comprobanteList;

    public Recepcion() {
    }

    public Recepcion(RecepcionPK recepcionPK) {
        this.recepcionPK = recepcionPK;
    }

    public Recepcion(short cajaIdn, Date recepFecHrIni, short etvIdn) {
        this.recepcionPK = new RecepcionPK(cajaIdn, recepFecHrIni, etvIdn);
    }

    public RecepcionPK getRecepcionPK() {
        return recepcionPK;
    }

    public void setRecepcionPK(RecepcionPK recepcionPK) {
        this.recepcionPK = recepcionPK;
    }

    public Short getUnegId() {
        return unegId;
    }

    public void setUnegId(Short unegId) {
        this.unegId = unegId;
    }

    public Integer getCpaesEstructuraSirhIdn() {
        return cpaesEstructuraSirhIdn;
    }

    public void setCpaesEstructuraSirhIdn(Integer cpaesEstructuraSirhIdn) {
        this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
    }

    public String getCntrtoNum() {
        return cntrtoNum;
    }

    public void setCntrtoNum(String cntrtoNum) {
        this.cntrtoNum = cntrtoNum;
    }

    public String getRecepNumCamionetv() {
        return recepNumCamionetv;
    }

    public void setRecepNumCamionetv(String recepNumCamionetv) {
        this.recepNumCamionetv = recepNumCamionetv;
    }

    public Date getRecepFecHrFin() {
        return recepFecHrFin;
    }

    public void setRecepFecHrFin(Date recepFecHrFin) {
        this.recepFecHrFin = recepFecHrFin;
    }

    public Short getRecepEnvases() {
        return recepEnvases;
    }

    public void setRecepEnvases(Short recepEnvases) {
        this.recepEnvases = recepEnvases;
    }

    public CajaHabilitadaPorTurno getCajaHabilitadaPorTurno() {
        return cajaHabilitadaPorTurno;
    }

    public void setCajaHabilitadaPorTurno(CajaHabilitadaPorTurno cajaHabilitadaPorTurno) {
        this.cajaHabilitadaPorTurno = cajaHabilitadaPorTurno;
    }

    public Etv getEtv() {
        return etv;
    }

    public void setEtv(Etv etv) {
        this.etv = etv;
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
        hash += (recepcionPK != null ? recepcionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recepcion)) {
            return false;
        }
        Recepcion other = (Recepcion) object;
        if ((this.recepcionPK == null && other.recepcionPK != null) || (this.recepcionPK != null && !this.recepcionPK.equals(other.recepcionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion[recepcionPK=" + recepcionPK + "]";
    }

}
