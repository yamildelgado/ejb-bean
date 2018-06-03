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

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "TRANSFERENCIA")
@NamedQueries({
    @NamedQuery(name = "Transferencia.findAll", query = "SELECT t FROM Transferencia t"),
    @NamedQuery(name = "Transferencia.findByTransIdn", query = "SELECT t FROM Transferencia t WHERE t.transferenciaPK.transIdn = :transIdn"),
    @NamedQuery(name = "Transferencia.findByTransFecHr", query = "SELECT t FROM Transferencia t WHERE t.transferenciaPK.transFecHr = :transFecHr"),
    @NamedQuery(name = "Transferencia.findByVerifnIdn", query = "SELECT t FROM Transferencia t WHERE t.verifnIdn = :verifnIdn"),
    @NamedQuery(name = "Transferencia.findByTransConcepto", query = "SELECT t FROM Transferencia t WHERE t.transConcepto = :transConcepto"),
    @NamedQuery(name = "Transferencia.findByTransImpte", query = "SELECT t FROM Transferencia t WHERE t.transImpte = :transImpte"),
    @NamedQuery(name = "Transferencia.findByEmpNominaOperador", query = "SELECT t FROM Transferencia t WHERE t.empNominaOperador = :empNominaOperador"),
    @NamedQuery(name = "Transferencia.findByEmpNominaSupervisor", query = "SELECT t FROM Transferencia t WHERE t.empNominaSupervisor = :empNominaSupervisor")})
public class Transferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransferenciaPK transferenciaPK;
    @Column(name = "VERIFN_IDN")
    private Long verifnIdn;
    @Column(name = "TRANS_CONCEPTO")
    private Short transConcepto;
    @Column(name = "TRANS_IMPTE")
    private Integer transImpte;
    @Column(name = "EMP_NOMINA_OPERADOR")
    private Integer empNominaOperador;
    @Column(name = "EMP_NOMINA_SUPERVISOR")
    private Integer empNominaSupervisor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transferencia")
    private List<DetalleTransferencia> detalleTransferenciaList;
    @JoinColumns({
        @JoinColumn(name = "CAJA_IDN", referencedColumnName = "CAJA_IDN"),
        @JoinColumn(name = "FEC_HR_HABILITA", referencedColumnName = "CAJAHAB_FEC_HR_HABILITA")})
    @ManyToOne(optional = false)
    private CajaHabilitadaPorTurno cajaHabilitadaPorTurno;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;

    public Transferencia() {
    }

    public Transferencia(TransferenciaPK transferenciaPK) {
        this.transferenciaPK = transferenciaPK;
    }

    public Transferencia(int transIdn, Date transFecHr) {
        this.transferenciaPK = new TransferenciaPK(transIdn, transFecHr);
    }

    public TransferenciaPK getTransferenciaPK() {
        return transferenciaPK;
    }

    public void setTransferenciaPK(TransferenciaPK transferenciaPK) {
        this.transferenciaPK = transferenciaPK;
    }

    public Long getVerifnIdn() {
        return verifnIdn;
    }

    public void setVerifnIdn(Long verifnIdn) {
        this.verifnIdn = verifnIdn;
    }

    public Short getTransConcepto() {
        return transConcepto;
    }

    public void setTransConcepto(Short transConcepto) {
        this.transConcepto = transConcepto;
    }

    public Integer getTransImpte() {
        return transImpte;
    }

    public void setTransImpte(Integer transImpte) {
        this.transImpte = transImpte;
    }

    public Integer getEmpNominaOperador() {
        return empNominaOperador;
    }

    public void setEmpNominaOperador(Integer empNominaOperador) {
        this.empNominaOperador = empNominaOperador;
    }

    public Integer getEmpNominaSupervisor() {
        return empNominaSupervisor;
    }

    public void setEmpNominaSupervisor(Integer empNominaSupervisor) {
        this.empNominaSupervisor = empNominaSupervisor;
    }

    public List<DetalleTransferencia> getDetalleTransferenciaList() {
        return detalleTransferenciaList;
    }

    public void setDetalleTransferenciaList(List<DetalleTransferencia> detalleTransferenciaList) {
        this.detalleTransferenciaList = detalleTransferenciaList;
    }

    public CajaHabilitadaPorTurno getCajaHabilitadaPorTurno() {
        return cajaHabilitadaPorTurno;
    }

    public void setCajaHabilitadaPorTurno(CajaHabilitadaPorTurno cajaHabilitadaPorTurno) {
        this.cajaHabilitadaPorTurno = cajaHabilitadaPorTurno;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferenciaPK != null ? transferenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transferencia)) {
            return false;
        }
        Transferencia other = (Transferencia) object;
        if ((this.transferenciaPK == null && other.transferenciaPK != null) || (this.transferenciaPK != null && !this.transferenciaPK.equals(other.transferenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Transferencia[transferenciaPK=" + transferenciaPK + "]";
    }

}
