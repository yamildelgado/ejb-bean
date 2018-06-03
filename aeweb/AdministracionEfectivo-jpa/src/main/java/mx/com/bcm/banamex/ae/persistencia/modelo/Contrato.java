/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "CONTRATO")
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByCntrtoNum", query = "SELECT c FROM Contrato c WHERE c.cntrtoNum = :cntrtoNum"),
    @NamedQuery(name = "Contrato.findByCntrtoTipoInstrumento", query = "SELECT c FROM Contrato c WHERE c.cntrtoTipoInstrumento = :cntrtoTipoInstrumento"),
    @NamedQuery(name = "Contrato.findByCntrtoFecAltaDeposito", query = "SELECT c FROM Contrato c WHERE c.cntrtoFecAltaDeposito = :cntrtoFecAltaDeposito"),
    @NamedQuery(name = "Contrato.findByCntrtoFecAltaDotacion", query = "SELECT c FROM Contrato c WHERE c.cntrtoFecAltaDotacion = :cntrtoFecAltaDotacion"),
    @NamedQuery(name = "Contrato.findByCntrtoFecVencContrato", query = "SELECT c FROM Contrato c WHERE c.cntrtoFecVencContrato = :cntrtoFecVencContrato"),
    @NamedQuery(name = "Contrato.findByCntrtoFecCancCte", query = "SELECT c FROM Contrato c WHERE c.cntrtoFecCancCte = :cntrtoFecCancCte"),
    @NamedQuery(name = "Contrato.findByCntrtoRfc", query = "SELECT c FROM Contrato c WHERE c.cntrtoRfc = :cntrtoRfc"),
    @NamedQuery(name = "Contrato.findByCntrtoNombreCte", query = "SELECT c FROM Contrato c WHERE c.cntrtoNombreCte = :cntrtoNombreCte"),
    @NamedQuery(name = "Contrato.findByCntrtoTel1", query = "SELECT c FROM Contrato c WHERE c.cntrtoTel1 = :cntrtoTel1"),
    @NamedQuery(name = "Contrato.findByCntrtoTel2", query = "SELECT c FROM Contrato c WHERE c.cntrtoTel2 = :cntrtoTel2"),
    @NamedQuery(name = "Contrato.findByCntrtoCveCshPolicy", query = "SELECT c FROM Contrato c WHERE c.cntrtoCveCshPolicy = :cntrtoCveCshPolicy"),
    @NamedQuery(name = "Contrato.findByCntrtoImpCshPolicy", query = "SELECT c FROM Contrato c WHERE c.cntrtoImpCshPolicy = :cntrtoImpCshPolicy"),
    @NamedQuery(name = "Contrato.findByCntrtoManejoProcPrevFich", query = "SELECT c FROM Contrato c WHERE c.cntrtoManejoProcPrevFich = :cntrtoManejoProcPrevFich"),
    @NamedQuery(name = "Contrato.findByCntrtoStatus", query = "SELECT c FROM Contrato c WHERE c.cntrtoStatus = :cntrtoStatus"),
    @NamedQuery(name = "Contrato.findByCntrtoTipoProcBill", query = "SELECT c FROM Contrato c WHERE c.cntrtoTipoProcBill = :cntrtoTipoProcBill"),
    @NamedQuery(name = "Contrato.findByCntrtoTipoProcMon", query = "SELECT c FROM Contrato c WHERE c.cntrtoTipoProcMon = :cntrtoTipoProcMon"),
    @NamedQuery(name = "Contrato.findByCntrtoDifPermitida", query = "SELECT c FROM Contrato c WHERE c.cntrtoDifPermitida = :cntrtoDifPermitida"),
    @NamedQuery(name = "Contrato.findByCntrtoBajaLogica", query = "SELECT c FROM Contrato c WHERE c.cntrtoBajaLogica = :cntrtoBajaLogica")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTRTO_NUM")
    private String cntrtoNum;
    @Column(name = "CNTRTO_TIPO_INSTRUMENTO")
    private Short cntrtoTipoInstrumento;
    @Column(name = "CNTRTO_FEC_ALTA_DEPOSITO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cntrtoFecAltaDeposito;
    @Column(name = "CNTRTO_FEC_ALTA_DOTACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cntrtoFecAltaDotacion;
    @Column(name = "CNTRTO_FEC_VENC_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cntrtoFecVencContrato;
    @Column(name = "CNTRTO_FEC_CANC_CTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cntrtoFecCancCte;
    @Column(name = "CNTRTO_RFC")
    private String cntrtoRfc;
    @Column(name = "CNTRTO_NOMBRE_CTE")
    private String cntrtoNombreCte;
    @Column(name = "CNTRTO_TEL1")
    private Long cntrtoTel1;
    @Column(name = "CNTRTO_TEL2")
    private Long cntrtoTel2;
    @Column(name = "CNTRTO_CVE_CSH_POLICY")
    private Short cntrtoCveCshPolicy;
    @Column(name = "CNTRTO_IMP_CSH_POLICY")
    private BigDecimal cntrtoImpCshPolicy;
    @Column(name = "CNTRTO_MANEJO_PROC_PREV_FICH")
    private Short cntrtoManejoProcPrevFich;
    @Column(name = "CNTRTO_STATUS")
    private Short cntrtoStatus;
    @Column(name = "CNTRTO_TIPO_PROC_BILL")
    private Short cntrtoTipoProcBill;
    @Column(name = "CNTRTO_TIPO_PROC_MON")
    private Short cntrtoTipoProcMon;
    @Column(name = "CNTRTO_DIF_PERMITIDA")
    private BigDecimal cntrtoDifPermitida;
    @Column(name = "CNTRTO_BAJA_LOGICA")
    private String cntrtoBajaLogica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrato")
    private List<UnidadDeNegocio> unidadDeNegocioList;

    public Contrato() {
    }

    public Contrato(String cntrtoNum) {
        this.cntrtoNum = cntrtoNum;
    }

    public String getCntrtoNum() {
        return cntrtoNum;
    }

    public void setCntrtoNum(String cntrtoNum) {
        this.cntrtoNum = cntrtoNum;
    }

    public Short getCntrtoTipoInstrumento() {
        return cntrtoTipoInstrumento;
    }

    public void setCntrtoTipoInstrumento(Short cntrtoTipoInstrumento) {
        this.cntrtoTipoInstrumento = cntrtoTipoInstrumento;
    }

    public Date getCntrtoFecAltaDeposito() {
        return cntrtoFecAltaDeposito;
    }

    public void setCntrtoFecAltaDeposito(Date cntrtoFecAltaDeposito) {
        this.cntrtoFecAltaDeposito = cntrtoFecAltaDeposito;
    }

    public Date getCntrtoFecAltaDotacion() {
        return cntrtoFecAltaDotacion;
    }

    public void setCntrtoFecAltaDotacion(Date cntrtoFecAltaDotacion) {
        this.cntrtoFecAltaDotacion = cntrtoFecAltaDotacion;
    }

    public Date getCntrtoFecVencContrato() {
        return cntrtoFecVencContrato;
    }

    public void setCntrtoFecVencContrato(Date cntrtoFecVencContrato) {
        this.cntrtoFecVencContrato = cntrtoFecVencContrato;
    }

    public Date getCntrtoFecCancCte() {
        return cntrtoFecCancCte;
    }

    public void setCntrtoFecCancCte(Date cntrtoFecCancCte) {
        this.cntrtoFecCancCte = cntrtoFecCancCte;
    }

    public String getCntrtoRfc() {
        return cntrtoRfc;
    }

    public void setCntrtoRfc(String cntrtoRfc) {
        this.cntrtoRfc = cntrtoRfc;
    }

    public String getCntrtoNombreCte() {
        return cntrtoNombreCte;
    }

    public void setCntrtoNombreCte(String cntrtoNombreCte) {
        this.cntrtoNombreCte = cntrtoNombreCte;
    }

    public Long getCntrtoTel1() {
        return cntrtoTel1;
    }

    public void setCntrtoTel1(Long cntrtoTel1) {
        this.cntrtoTel1 = cntrtoTel1;
    }

    public Long getCntrtoTel2() {
        return cntrtoTel2;
    }

    public void setCntrtoTel2(Long cntrtoTel2) {
        this.cntrtoTel2 = cntrtoTel2;
    }

    public Short getCntrtoCveCshPolicy() {
        return cntrtoCveCshPolicy;
    }

    public void setCntrtoCveCshPolicy(Short cntrtoCveCshPolicy) {
        this.cntrtoCveCshPolicy = cntrtoCveCshPolicy;
    }

    public BigDecimal getCntrtoImpCshPolicy() {
        return cntrtoImpCshPolicy;
    }

    public void setCntrtoImpCshPolicy(BigDecimal cntrtoImpCshPolicy) {
        this.cntrtoImpCshPolicy = cntrtoImpCshPolicy;
    }

    public Short getCntrtoManejoProcPrevFich() {
        return cntrtoManejoProcPrevFich;
    }

    public void setCntrtoManejoProcPrevFich(Short cntrtoManejoProcPrevFich) {
        this.cntrtoManejoProcPrevFich = cntrtoManejoProcPrevFich;
    }

    public Short getCntrtoStatus() {
        return cntrtoStatus;
    }

    public void setCntrtoStatus(Short cntrtoStatus) {
        this.cntrtoStatus = cntrtoStatus;
    }

    public Short getCntrtoTipoProcBill() {
        return cntrtoTipoProcBill;
    }

    public void setCntrtoTipoProcBill(Short cntrtoTipoProcBill) {
        this.cntrtoTipoProcBill = cntrtoTipoProcBill;
    }

    public Short getCntrtoTipoProcMon() {
        return cntrtoTipoProcMon;
    }

    public void setCntrtoTipoProcMon(Short cntrtoTipoProcMon) {
        this.cntrtoTipoProcMon = cntrtoTipoProcMon;
    }

    public BigDecimal getCntrtoDifPermitida() {
        return cntrtoDifPermitida;
    }

    public void setCntrtoDifPermitida(BigDecimal cntrtoDifPermitida) {
        this.cntrtoDifPermitida = cntrtoDifPermitida;
    }

    public String getCntrtoBajaLogica() {
        return cntrtoBajaLogica;
    }

    public void setCntrtoBajaLogica(String cntrtoBajaLogica) {
        this.cntrtoBajaLogica = cntrtoBajaLogica;
    }

    public List<UnidadDeNegocio> getUnidadDeNegocioList() {
        return unidadDeNegocioList;
    }

    public void setUnidadDeNegocioList(List<UnidadDeNegocio> unidadDeNegocioList) {
        this.unidadDeNegocioList = unidadDeNegocioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntrtoNum != null ? cntrtoNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.cntrtoNum == null && other.cntrtoNum != null) || (this.cntrtoNum != null && !this.cntrtoNum.equals(other.cntrtoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Contrato[cntrtoNum=" + cntrtoNum + "]";
    }

}
