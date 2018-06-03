/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "BITACORA")
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b"),
    @NamedQuery(name = "Bitacora.findByBitacCpae", query = "SELECT b FROM Bitacora b WHERE b.bitacoraPK.bitacCpae = :bitacCpae"),
    @NamedQuery(name = "Bitacora.findByBitacIdn", query = "SELECT b FROM Bitacora b WHERE b.bitacoraPK.bitacIdn = :bitacIdn"),
    @NamedQuery(name = "Bitacora.findByIdComprobante", query = "SELECT b FROM Bitacora b WHERE b.idComprobante = :idComprobante"),
    @NamedQuery(name = "Bitacora.findByBitacFecHrInicio", query = "SELECT b FROM Bitacora b WHERE b.bitacFecHrInicio = :bitacFecHrInicio"),
    @NamedQuery(name = "Bitacora.findByBitacFecHrFin", query = "SELECT b FROM Bitacora b WHERE b.bitacFecHrFin = :bitacFecHrFin"),
    @NamedQuery(name = "Bitacora.findByBitacModulo", query = "SELECT b FROM Bitacora b WHERE b.bitacModulo = :bitacModulo"),
    @NamedQuery(name = "Bitacora.findByBitacSubmod", query = "SELECT b FROM Bitacora b WHERE b.bitacSubmod = :bitacSubmod"),
    @NamedQuery(name = "Bitacora.findByBitacCajaId", query = "SELECT b FROM Bitacora b WHERE b.bitacCajaId = :bitacCajaId"),
    @NamedQuery(name = "Bitacora.findByBitacUsuarioNomina", query = "SELECT b FROM Bitacora b WHERE b.bitacUsuarioNomina = :bitacUsuarioNomina"),
    @NamedQuery(name = "Bitacora.findByBitacDescrip", query = "SELECT b FROM Bitacora b WHERE b.bitacDescrip = :bitacDescrip"),
    @NamedQuery(name = "Bitacora.findByBitacHistTurnoId", query = "SELECT b FROM Bitacora b WHERE b.bitacHistTurnoId = :bitacHistTurnoId"),
    @NamedQuery(name = "Bitacora.findByBitacSubboveda", query = "SELECT b FROM Bitacora b WHERE b.bitacSubboveda = :bitacSubboveda"),
    @NamedQuery(name = "Bitacora.findByBitacEtvId", query = "SELECT b FROM Bitacora b WHERE b.bitacEtvId = :bitacEtvId")})
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BitacoraPK bitacoraPK;
    @Column(name = "ID_COMPROBANTE")
    private String idComprobante;
    @Basic(optional = false)
    @Column(name = "BITAC_FEC_HR_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitacFecHrInicio;
    @Column(name = "BITAC_FEC_HR_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitacFecHrFin;
    @Column(name = "BITAC_MODULO")
    private String bitacModulo;
    @Column(name = "BITAC_SUBMOD")
    private String bitacSubmod;
    @Column(name = "BITAC_CAJA_ID")
    private BigInteger bitacCajaId;
    @Column(name = "BITAC_USUARIO_NOMINA")
    private Integer bitacUsuarioNomina;
    @Column(name = "BITAC_DESCRIP")
    private String bitacDescrip;
    @Column(name = "BITAC_HIST_TURNO_ID")
    private String bitacHistTurnoId;
    @Column(name = "BITAC_SUBBOVEDA")
    private Short bitacSubboveda;
    @Column(name = "BITAC_ETV_ID")
    private Short bitacEtvId;
    @JoinColumn(name = "EVENTO_IDN", referencedColumnName = "EVENTO_IDN")
    @ManyToOne
    private CatEventosBitacora eventoIdn;

    public Bitacora() {
    }

    public Bitacora(BitacoraPK bitacoraPK) {
        this.bitacoraPK = bitacoraPK;
    }

    public Bitacora(BitacoraPK bitacoraPK, Date bitacFecHrInicio) {
        this.bitacoraPK = bitacoraPK;
        this.bitacFecHrInicio = bitacFecHrInicio;
    }

    public Bitacora(short bitacCpae, long bitacIdn) {
        this.bitacoraPK = new BitacoraPK(bitacCpae, bitacIdn);
    }

    public BitacoraPK getBitacoraPK() {
        return bitacoraPK;
    }

    public void setBitacoraPK(BitacoraPK bitacoraPK) {
        this.bitacoraPK = bitacoraPK;
    }

    public String getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(String idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Date getBitacFecHrInicio() {
        return bitacFecHrInicio;
    }

    public void setBitacFecHrInicio(Date bitacFecHrInicio) {
        this.bitacFecHrInicio = bitacFecHrInicio;
    }

    public Date getBitacFecHrFin() {
        return bitacFecHrFin;
    }

    public void setBitacFecHrFin(Date bitacFecHrFin) {
        this.bitacFecHrFin = bitacFecHrFin;
    }

    public String getBitacModulo() {
        return bitacModulo;
    }

    public void setBitacModulo(String bitacModulo) {
        this.bitacModulo = bitacModulo;
    }

    public String getBitacSubmod() {
        return bitacSubmod;
    }

    public void setBitacSubmod(String bitacSubmod) {
        this.bitacSubmod = bitacSubmod;
    }

    public BigInteger getBitacCajaId() {
        return bitacCajaId;
    }

    public void setBitacCajaId(BigInteger bitacCajaId) {
        this.bitacCajaId = bitacCajaId;
    }

    public Integer getBitacUsuarioNomina() {
        return bitacUsuarioNomina;
    }

    public void setBitacUsuarioNomina(Integer bitacUsuarioNomina) {
        this.bitacUsuarioNomina = bitacUsuarioNomina;
    }

    public String getBitacDescrip() {
        return bitacDescrip;
    }

    public void setBitacDescrip(String bitacDescrip) {
        this.bitacDescrip = bitacDescrip;
    }

    public String getBitacHistTurnoId() {
        return bitacHistTurnoId;
    }

    public void setBitacHistTurnoId(String bitacHistTurnoId) {
        this.bitacHistTurnoId = bitacHistTurnoId;
    }

    public Short getBitacSubboveda() {
        return bitacSubboveda;
    }

    public void setBitacSubboveda(Short bitacSubboveda) {
        this.bitacSubboveda = bitacSubboveda;
    }

    public Short getBitacEtvId() {
        return bitacEtvId;
    }

    public void setBitacEtvId(Short bitacEtvId) {
        this.bitacEtvId = bitacEtvId;
    }

    public CatEventosBitacora getEventoIdn() {
        return eventoIdn;
    }

    public void setEventoIdn(CatEventosBitacora eventoIdn) {
        this.eventoIdn = eventoIdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bitacoraPK != null ? bitacoraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.bitacoraPK == null && other.bitacoraPK != null) || (this.bitacoraPK != null && !this.bitacoraPK.equals(other.bitacoraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Bitacora[bitacoraPK=" + bitacoraPK + "]";
    }

}
