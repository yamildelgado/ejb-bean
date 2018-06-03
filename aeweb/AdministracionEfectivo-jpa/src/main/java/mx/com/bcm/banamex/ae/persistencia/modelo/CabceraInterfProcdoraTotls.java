/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "CABCERA_INTERF_PROCDORA_TOTLS")
@NamedQueries({
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findAll", query = "SELECT c FROM CabceraInterfProcdoraTotls c"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByEstructraSirh", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.estructraSirh = :estructraSirh"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByEtvIdn", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.etvIdn = :etvIdn"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocNumCorte", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.hdInterprocNumCorte = :hdInterprocNumCorte"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocFecReal", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.hdInterprocFecReal = :hdInterprocFecReal"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocFecContable", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.hdInterprocFecContable = :hdInterprocFecContable"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocHrCorte", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.cabceraInterfProcdoraTotlsPK.hdInterprocHrCorte = :hdInterprocHrCorte"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocNumOperaciones", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdInterprocNumOperaciones = :hdInterprocNumOperaciones"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocImpteMn", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdInterprocImpteMn = :hdInterprocImpteMn"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdInterprocImpteMe", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdInterprocImpteMe = :hdInterprocImpteMe"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdCargaManual", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdCargaManual = :hdCargaManual"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdCargaMotivo", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdCargaMotivo = :hdCargaMotivo"),
    @NamedQuery(name = "CabceraInterfProcdoraTotls.findByHdStatus", query = "SELECT c FROM CabceraInterfProcdoraTotls c WHERE c.hdStatus = :hdStatus")})
public class CabceraInterfProcdoraTotls implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CabceraInterfProcdoraTotlsPK cabceraInterfProcdoraTotlsPK;
    @Column(name = "HD_INTERPROC_NUM_OPERACIONES")
    private Integer hdInterprocNumOperaciones;
    @Column(name = "HD_INTERPROC_IMPTE_MN")
    private BigDecimal hdInterprocImpteMn;
    @Column(name = "HD_INTERPROC_IMPTE_ME")
    private BigDecimal hdInterprocImpteMe;
    @Column(name = "HD_CARGA_MANUAL")
    private String hdCargaManual;
    @Column(name = "HD_CARGA_MOTIVO")
    private String hdCargaMotivo;
    @Column(name = "HD_STATUS")
    private String hdStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cabceraInterfProcdoraTotls")
    private List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList;

    public CabceraInterfProcdoraTotls() {
    }

    public CabceraInterfProcdoraTotls(CabceraInterfProcdoraTotlsPK cabceraInterfProcdoraTotlsPK) {
        this.cabceraInterfProcdoraTotlsPK = cabceraInterfProcdoraTotlsPK;
    }

    public CabceraInterfProcdoraTotls(int estructraSirh, short etvIdn, short hdInterprocNumCorte, Date hdInterprocFecReal, Date hdInterprocFecContable, Date hdInterprocHrCorte) {
        this.cabceraInterfProcdoraTotlsPK = new CabceraInterfProcdoraTotlsPK(estructraSirh, etvIdn, hdInterprocNumCorte, hdInterprocFecReal, hdInterprocFecContable, hdInterprocHrCorte);
    }

    public CabceraInterfProcdoraTotlsPK getCabceraInterfProcdoraTotlsPK() {
        return cabceraInterfProcdoraTotlsPK;
    }

    public void setCabceraInterfProcdoraTotlsPK(CabceraInterfProcdoraTotlsPK cabceraInterfProcdoraTotlsPK) {
        this.cabceraInterfProcdoraTotlsPK = cabceraInterfProcdoraTotlsPK;
    }

    public Integer getHdInterprocNumOperaciones() {
        return hdInterprocNumOperaciones;
    }

    public void setHdInterprocNumOperaciones(Integer hdInterprocNumOperaciones) {
        this.hdInterprocNumOperaciones = hdInterprocNumOperaciones;
    }

    public BigDecimal getHdInterprocImpteMn() {
        return hdInterprocImpteMn;
    }

    public void setHdInterprocImpteMn(BigDecimal hdInterprocImpteMn) {
        this.hdInterprocImpteMn = hdInterprocImpteMn;
    }

    public BigDecimal getHdInterprocImpteMe() {
        return hdInterprocImpteMe;
    }

    public void setHdInterprocImpteMe(BigDecimal hdInterprocImpteMe) {
        this.hdInterprocImpteMe = hdInterprocImpteMe;
    }

    public String getHdCargaManual() {
        return hdCargaManual;
    }

    public void setHdCargaManual(String hdCargaManual) {
        this.hdCargaManual = hdCargaManual;
    }

    public String getHdCargaMotivo() {
        return hdCargaMotivo;
    }

    public void setHdCargaMotivo(String hdCargaMotivo) {
        this.hdCargaMotivo = hdCargaMotivo;
    }

    public String getHdStatus() {
        return hdStatus;
    }

    public void setHdStatus(String hdStatus) {
        this.hdStatus = hdStatus;
    }

    public List<DetalleInterfaceProcesadora> getDetalleInterfaceProcesadoraList() {
        return detalleInterfaceProcesadoraList;
    }

    public void setDetalleInterfaceProcesadoraList(List<DetalleInterfaceProcesadora> detalleInterfaceProcesadoraList) {
        this.detalleInterfaceProcesadoraList = detalleInterfaceProcesadoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cabceraInterfProcdoraTotlsPK != null ? cabceraInterfProcdoraTotlsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabceraInterfProcdoraTotls)) {
            return false;
        }
        CabceraInterfProcdoraTotls other = (CabceraInterfProcdoraTotls) object;
        if ((this.cabceraInterfProcdoraTotlsPK == null && other.cabceraInterfProcdoraTotlsPK != null) || (this.cabceraInterfProcdoraTotlsPK != null && !this.cabceraInterfProcdoraTotlsPK.equals(other.cabceraInterfProcdoraTotlsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CabceraInterfProcdoraTotls[cabceraInterfProcdoraTotlsPK=" + cabceraInterfProcdoraTotlsPK + "]";
    }

}
