/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "CORTE")
@NamedQueries({
    @NamedQuery(name = "Corte.findAll", query = "SELECT c FROM Corte c"),
    @NamedQuery(name = "Corte.findByCorteIdnCorte", query = "SELECT c FROM Corte c WHERE c.cortePK.corteIdnCorte = :corteIdnCorte"),
    @NamedQuery(name = "Corte.findByCorteFecHrCorte", query = "SELECT c FROM Corte c WHERE c.cortePK.corteFecHrCorte = :corteFecHrCorte"),
    @NamedQuery(name = "Corte.findByVerifnIdn", query = "SELECT c FROM Corte c WHERE c.verifnIdn = :verifnIdn"),
    @NamedQuery(name = "Corte.findByCorteFecHrContable", query = "SELECT c FROM Corte c WHERE c.corteFecHrContable = :corteFecHrContable"),
    @NamedQuery(name = "Corte.findByCorteNumCaja", query = "SELECT c FROM Corte c WHERE c.corteNumCaja = :corteNumCaja"),
    @NamedQuery(name = "Corte.findByCorteOperadorNomina", query = "SELECT c FROM Corte c WHERE c.corteOperadorNomina = :corteOperadorNomina"),
    @NamedQuery(name = "Corte.findByCorteTotalDepositos", query = "SELECT c FROM Corte c WHERE c.corteTotalDepositos = :corteTotalDepositos"),
    @NamedQuery(name = "Corte.findByCorteNumSobrante", query = "SELECT c FROM Corte c WHERE c.corteNumSobrante = :corteNumSobrante"),
    @NamedQuery(name = "Corte.findByCorteSobranteImpte", query = "SELECT c FROM Corte c WHERE c.corteSobranteImpte = :corteSobranteImpte"),
    @NamedQuery(name = "Corte.findByCorteSobranteSucursal", query = "SELECT c FROM Corte c WHERE c.corteSobranteSucursal = :corteSobranteSucursal"),
    @NamedQuery(name = "Corte.findByCorteSobranteSucursalImpte", query = "SELECT c FROM Corte c WHERE c.corteSobranteSucursalImpte = :corteSobranteSucursalImpte"),
    @NamedQuery(name = "Corte.findByCorteTransfRecBill", query = "SELECT c FROM Corte c WHERE c.corteTransfRecBill = :corteTransfRecBill"),
    @NamedQuery(name = "Corte.findByCorteTransfRecBillImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfRecBillImpte = :corteTransfRecBillImpte"),
    @NamedQuery(name = "Corte.findByCorteTransfRecMsv", query = "SELECT c FROM Corte c WHERE c.corteTransfRecMsv = :corteTransfRecMsv"),
    @NamedQuery(name = "Corte.findByCorteTransfRecMsvImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfRecMsvImpte = :corteTransfRecMsvImpte"),
    @NamedQuery(name = "Corte.findByCorteNumTransfRecGuard", query = "SELECT c FROM Corte c WHERE c.corteNumTransfRecGuard = :corteNumTransfRecGuard"),
    @NamedQuery(name = "Corte.findByCorteTransfRecGuardImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfRecGuardImpte = :corteTransfRecGuardImpte"),
    @NamedQuery(name = "Corte.findByCorteTransfGenBill", query = "SELECT c FROM Corte c WHERE c.corteTransfGenBill = :corteTransfGenBill"),
    @NamedQuery(name = "Corte.findByCorteTransfGenBillImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfGenBillImpte = :corteTransfGenBillImpte"),
    @NamedQuery(name = "Corte.findByCorteTransfGenMsv", query = "SELECT c FROM Corte c WHERE c.corteTransfGenMsv = :corteTransfGenMsv"),
    @NamedQuery(name = "Corte.findByCorteTransfGenMsvImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfGenMsvImpte = :corteTransfGenMsvImpte"),
    @NamedQuery(name = "Corte.findByCorteNumTransfGenGuard", query = "SELECT c FROM Corte c WHERE c.corteNumTransfGenGuard = :corteNumTransfGenGuard"),
    @NamedQuery(name = "Corte.findByCorteTransfGenGuardImpte", query = "SELECT c FROM Corte c WHERE c.corteTransfGenGuardImpte = :corteTransfGenGuardImpte"),
    @NamedQuery(name = "Corte.findByCorteNumFaltantes", query = "SELECT c FROM Corte c WHERE c.corteNumFaltantes = :corteNumFaltantes"),
    @NamedQuery(name = "Corte.findByCorteFaltantesImpte", query = "SELECT c FROM Corte c WHERE c.corteFaltantesImpte = :corteFaltantesImpte"),
    @NamedQuery(name = "Corte.findByCorteNumFaltanteSucursal", query = "SELECT c FROM Corte c WHERE c.corteNumFaltanteSucursal = :corteNumFaltanteSucursal"),
    @NamedQuery(name = "Corte.findByCorteFaltanteSucursalImpte", query = "SELECT c FROM Corte c WHERE c.corteFaltanteSucursalImpte = :corteFaltanteSucursalImpte"),
    @NamedQuery(name = "Corte.findByCorteNumComprobantesElimn", query = "SELECT c FROM Corte c WHERE c.corteNumComprobantesElimn = :corteNumComprobantesElimn"),
    @NamedQuery(name = "Corte.findByCorteComprobantesElimnImpte", query = "SELECT c FROM Corte c WHERE c.corteComprobantesElimnImpte = :corteComprobantesElimnImpte"),
    @NamedQuery(name = "Corte.findByCorteNumComprobantesAtent", query = "SELECT c FROM Corte c WHERE c.corteNumComprobantesAtent = :corteNumComprobantesAtent"),
    @NamedQuery(name = "Corte.findByCorteComprobantesAtentImpte", query = "SELECT c FROM Corte c WHERE c.corteComprobantesAtentImpte = :corteComprobantesAtentImpte"),
    @NamedQuery(name = "Corte.findByCorteNumComprobantesVerf", query = "SELECT c FROM Corte c WHERE c.corteNumComprobantesVerf = :corteNumComprobantesVerf"),
    @NamedQuery(name = "Corte.findByCorteComprobantesVerfImpte", query = "SELECT c FROM Corte c WHERE c.corteComprobantesVerfImpte = :corteComprobantesVerfImpte"),
    @NamedQuery(name = "Corte.findByCorteNumEnvasesVerf", query = "SELECT c FROM Corte c WHERE c.corteNumEnvasesVerf = :corteNumEnvasesVerf"),
    @NamedQuery(name = "Corte.findByCorteNumBillProcesados", query = "SELECT c FROM Corte c WHERE c.corteNumBillProcesados = :corteNumBillProcesados"),
    @NamedQuery(name = "Corte.findByCorteBillProcesadosImpte", query = "SELECT c FROM Corte c WHERE c.corteBillProcesadosImpte = :corteBillProcesadosImpte"),
    @NamedQuery(name = "Corte.findByCorteNumMonProcesados", query = "SELECT c FROM Corte c WHERE c.corteNumMonProcesados = :corteNumMonProcesados"),
    @NamedQuery(name = "Corte.findByCorteMonProcesadosImpte", query = "SELECT c FROM Corte c WHERE c.corteMonProcesadosImpte = :corteMonProcesadosImpte"),
    @NamedQuery(name = "Corte.findByCorteNumFichasCaptudas", query = "SELECT c FROM Corte c WHERE c.corteNumFichasCaptudas = :corteNumFichasCaptudas"),
    @NamedQuery(name = "Corte.findByCorteFichasCaptudasImpte", query = "SELECT c FROM Corte c WHERE c.corteFichasCaptudasImpte = :corteFichasCaptudasImpte"),
    @NamedQuery(name = "Corte.findByCorteNumFajllasProcesadas", query = "SELECT c FROM Corte c WHERE c.corteNumFajllasProcesadas = :corteNumFajllasProcesadas"),
    @NamedQuery(name = "Corte.findByCorteFajllasProcesadasImpte", query = "SELECT c FROM Corte c WHERE c.corteFajllasProcesadasImpte = :corteFajllasProcesadasImpte"),
    @NamedQuery(name = "Corte.findByCorteNumPicosProcesados", query = "SELECT c FROM Corte c WHERE c.corteNumPicosProcesados = :corteNumPicosProcesados"),
    @NamedQuery(name = "Corte.findByCortePicosProcesadasImpte", query = "SELECT c FROM Corte c WHERE c.cortePicosProcesadasImpte = :cortePicosProcesadasImpte"),
    @NamedQuery(name = "Corte.findByCorteNumBillDol", query = "SELECT c FROM Corte c WHERE c.corteNumBillDol = :corteNumBillDol"),
    @NamedQuery(name = "Corte.findByCorteBillDolImpte", query = "SELECT c FROM Corte c WHERE c.corteBillDolImpte = :corteBillDolImpte"),
    @NamedQuery(name = "Corte.findByCorteNumMonDol", query = "SELECT c FROM Corte c WHERE c.corteNumMonDol = :corteNumMonDol"),
    @NamedQuery(name = "Corte.findByCorteMonDolImpte", query = "SELECT c FROM Corte c WHERE c.corteMonDolImpte = :corteMonDolImpte"),
    @NamedQuery(name = "Corte.findByCorteNumPiezasDol", query = "SELECT c FROM Corte c WHERE c.corteNumPiezasDol = :corteNumPiezasDol"),
    @NamedQuery(name = "Corte.findByCortePiezasDolImpte", query = "SELECT c FROM Corte c WHERE c.cortePiezasDolImpte = :cortePiezasDolImpte"),
    @NamedQuery(name = "Corte.findByCorteFechaHrInicio", query = "SELECT c FROM Corte c WHERE c.corteFechaHrInicio = :corteFechaHrInicio"),
    @NamedQuery(name = "Corte.findByCorteFechaHrCorte", query = "SELECT c FROM Corte c WHERE c.corteFechaHrCorte = :corteFechaHrCorte"),
    @NamedQuery(name = "Corte.findByCorteNumComptesNoVerf", query = "SELECT c FROM Corte c WHERE c.corteNumComptesNoVerf = :corteNumComptesNoVerf"),
    @NamedQuery(name = "Corte.findByCorteComptesNoVerfImpte", query = "SELECT c FROM Corte c WHERE c.corteComptesNoVerfImpte = :corteComptesNoVerfImpte"),
    @NamedQuery(name = "Corte.findByCorteNumEnvasesNoVerf", query = "SELECT c FROM Corte c WHERE c.corteNumEnvasesNoVerf = :corteNumEnvasesNoVerf"),
    @NamedQuery(name = "Corte.findByCorteTotalDepositosDolares", query = "SELECT c FROM Corte c WHERE c.corteTotalDepositosDolares = :corteTotalDepositosDolares"),
    @NamedQuery(name = "Corte.findByCorteTotalDolaresComprados", query = "SELECT c FROM Corte c WHERE c.corteTotalDolaresComprados = :corteTotalDolaresComprados"),
    @NamedQuery(name = "Corte.findByCorteTotalDolaresVendidos", query = "SELECT c FROM Corte c WHERE c.corteTotalDolaresVendidos = :corteTotalDolaresVendidos")})
public class Corte implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CortePK cortePK;
    @Column(name = "VERIFN_IDN")
    private Long verifnIdn;
    @Column(name = "CORTE_FEC_HR_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date corteFecHrContable;
    @Column(name = "CORTE_NUM_CAJA")
    private Integer corteNumCaja;
    @Column(name = "CORTE_OPERADOR_NOMINA")
    private Integer corteOperadorNomina;
    @Column(name = "CORTE_TOTAL_DEPOSITOS")
    private Integer corteTotalDepositos;
    @Column(name = "CORTE_NUM_SOBRANTE")
    private Short corteNumSobrante;
    @Column(name = "CORTE_SOBRANTE_IMPTE")
    private Integer corteSobranteImpte;
    @Column(name = "CORTE_SOBRANTE_SUCURSAL")
    private Short corteSobranteSucursal;
    @Column(name = "CORTE_SOBRANTE_SUCURSAL_IMPTE")
    private Integer corteSobranteSucursalImpte;
    @Column(name = "CORTE_TRANSF_REC_BILL")
    private Short corteTransfRecBill;
    @Column(name = "CORTE_TRANSF_REC_BILL_IMPTE")
    private Integer corteTransfRecBillImpte;
    @Column(name = "CORTE_TRANSF_REC_MSV")
    private Short corteTransfRecMsv;
    @Column(name = "CORTE_TRANSF_REC_MSV_IMPTE")
    private Integer corteTransfRecMsvImpte;
    @Column(name = "CORTE_NUM_TRANSF_REC_GUARD")
    private Short corteNumTransfRecGuard;
    @Column(name = "CORTE_TRANSF_REC_GUARD_IMPTE")
    private Integer corteTransfRecGuardImpte;
    @Column(name = "CORTE_TRANSF_GEN_BILL")
    private Short corteTransfGenBill;
    @Column(name = "CORTE_TRANSF_GEN_BILL_IMPTE")
    private Integer corteTransfGenBillImpte;
    @Column(name = "CORTE_TRANSF_GEN_MSV")
    private Short corteTransfGenMsv;
    @Column(name = "CORTE_TRANSF_GEN_MSV_IMPTE")
    private Integer corteTransfGenMsvImpte;
    @Column(name = "CORTE_NUM_TRANSF_GEN_GUARD")
    private Short corteNumTransfGenGuard;
    @Column(name = "CORTE_TRANSF_GEN_GUARD_IMPTE")
    private Integer corteTransfGenGuardImpte;
    @Column(name = "CORTE_NUM_FALTANTES")
    private Short corteNumFaltantes;
    @Column(name = "CORTE_FALTANTES_IMPTE")
    private Integer corteFaltantesImpte;
    @Column(name = "CORTE_NUM_FALTANTE_SUCURSAL")
    private Short corteNumFaltanteSucursal;
    @Column(name = "CORTE_FALTANTE_SUCURSAL_IMPTE")
    private Integer corteFaltanteSucursalImpte;
    @Column(name = "CORTE_NUM_COMPROBANTES_ELIMN")
    private Short corteNumComprobantesElimn;
    @Column(name = "CORTE_COMPROBANTES_ELIMN_IMPTE")
    private Integer corteComprobantesElimnImpte;
    @Basic(optional = false)
    @Column(name = "CORTE_NUM_COMPROBANTES_ATENT")
    private short corteNumComprobantesAtent;
    @Column(name = "CORTE_COMPROBANTES_ATENT_IMPTE")
    private Integer corteComprobantesAtentImpte;
    @Basic(optional = false)
    @Column(name = "CORTE_NUM_COMPROBANTES_VERF")
    private short corteNumComprobantesVerf;
    @Column(name = "CORTE_COMPROBANTES_VERF_IMPTE")
    private Integer corteComprobantesVerfImpte;
    @Column(name = "CORTE_NUM_ENVASES_VERF")
    private Short corteNumEnvasesVerf;
    @Column(name = "CORTE_NUM_BILL_PROCESADOS")
    private Short corteNumBillProcesados;
    @Column(name = "CORTE_BILL_PROCESADOS_IMPTE")
    private Integer corteBillProcesadosImpte;
    @Column(name = "CORTE_NUM_MON_PROCESADOS")
    private Short corteNumMonProcesados;
    @Column(name = "CORTE_MON_PROCESADOS_IMPTE")
    private Integer corteMonProcesadosImpte;
    @Column(name = "CORTE_NUM_FICHAS_CAPTUDAS")
    private Short corteNumFichasCaptudas;
    @Column(name = "CORTE_FICHAS_CAPTUDAS_IMPTE")
    private Integer corteFichasCaptudasImpte;
    @Column(name = "CORTE_NUM_FAJLLAS_PROCESADAS")
    private Short corteNumFajllasProcesadas;
    @Column(name = "CORTE_FAJLLAS_PROCESADAS_IMPTE")
    private Integer corteFajllasProcesadasImpte;
    @Column(name = "CORTE_NUM_PICOS_PROCESADOS")
    private Short corteNumPicosProcesados;
    @Column(name = "CORTE_PICOS_PROCESADAS_IMPTE")
    private Integer cortePicosProcesadasImpte;
    @Column(name = "CORTE_NUM_BILL_DOL")
    private Short corteNumBillDol;
    @Column(name = "CORTE_BILL_DOL_IMPTE")
    private Integer corteBillDolImpte;
    @Column(name = "CORTE_NUM_MON_DOL")
    private Short corteNumMonDol;
    @Column(name = "CORTE_MON_DOL_IMPTE")
    private Integer corteMonDolImpte;
    @Column(name = "CORTE_NUM_PIEZAS_DOL")
    private Short corteNumPiezasDol;
    @Column(name = "CORTE_PIEZAS_DOL_IMPTE")
    private Integer cortePiezasDolImpte;
    @Column(name = "CORTE_FECHA_HR_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date corteFechaHrInicio;
    @Column(name = "CORTE_FECHA_HR_CORTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date corteFechaHrCorte;
    @Basic(optional = false)
    @Column(name = "CORTE_NUM_COMPTES_NO_VERF")
    private short corteNumComptesNoVerf;
    @Column(name = "CORTE_COMPTES_NO_VERF_IMPTE")
    private Integer corteComptesNoVerfImpte;
    @Basic(optional = false)
    @Column(name = "CORTE_NUM_ENVASES_NO_VERF")
    private short corteNumEnvasesNoVerf;
    @Column(name = "CORTE_TOTAL_DEPOSITOS_DOLARES")
    private Integer corteTotalDepositosDolares;
    @Column(name = "CORTE_TOTAL_DOLARES_COMPRADOS")
    private Integer corteTotalDolaresComprados;
    @Column(name = "CORTE_TOTAL_DOLARES_VENDIDOS")
    private Integer corteTotalDolaresVendidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corte")
    private List<DetalleDeCorte> detalleDeCorteList;
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

    public Corte() {
    }

    public Corte(CortePK cortePK) {
        this.cortePK = cortePK;
    }

    public Corte(CortePK cortePK, short corteNumComprobantesAtent, short corteNumComprobantesVerf, short corteNumComptesNoVerf, short corteNumEnvasesNoVerf) {
        this.cortePK = cortePK;
        this.corteNumComprobantesAtent = corteNumComprobantesAtent;
        this.corteNumComprobantesVerf = corteNumComprobantesVerf;
        this.corteNumComptesNoVerf = corteNumComptesNoVerf;
        this.corteNumEnvasesNoVerf = corteNumEnvasesNoVerf;
    }

    public Corte(int corteIdnCorte, Date corteFecHrCorte) {
        this.cortePK = new CortePK(corteIdnCorte, corteFecHrCorte);
    }

    public CortePK getCortePK() {
        return cortePK;
    }

    public void setCortePK(CortePK cortePK) {
        this.cortePK = cortePK;
    }

    public Long getVerifnIdn() {
        return verifnIdn;
    }

    public void setVerifnIdn(Long verifnIdn) {
        this.verifnIdn = verifnIdn;
    }

    public Date getCorteFecHrContable() {
        return corteFecHrContable;
    }

    public void setCorteFecHrContable(Date corteFecHrContable) {
        this.corteFecHrContable = corteFecHrContable;
    }

    public Integer getCorteNumCaja() {
        return corteNumCaja;
    }

    public void setCorteNumCaja(Integer corteNumCaja) {
        this.corteNumCaja = corteNumCaja;
    }

    public Integer getCorteOperadorNomina() {
        return corteOperadorNomina;
    }

    public void setCorteOperadorNomina(Integer corteOperadorNomina) {
        this.corteOperadorNomina = corteOperadorNomina;
    }

    public Integer getCorteTotalDepositos() {
        return corteTotalDepositos;
    }

    public void setCorteTotalDepositos(Integer corteTotalDepositos) {
        this.corteTotalDepositos = corteTotalDepositos;
    }

    public Short getCorteNumSobrante() {
        return corteNumSobrante;
    }

    public void setCorteNumSobrante(Short corteNumSobrante) {
        this.corteNumSobrante = corteNumSobrante;
    }

    public Integer getCorteSobranteImpte() {
        return corteSobranteImpte;
    }

    public void setCorteSobranteImpte(Integer corteSobranteImpte) {
        this.corteSobranteImpte = corteSobranteImpte;
    }

    public Short getCorteSobranteSucursal() {
        return corteSobranteSucursal;
    }

    public void setCorteSobranteSucursal(Short corteSobranteSucursal) {
        this.corteSobranteSucursal = corteSobranteSucursal;
    }

    public Integer getCorteSobranteSucursalImpte() {
        return corteSobranteSucursalImpte;
    }

    public void setCorteSobranteSucursalImpte(Integer corteSobranteSucursalImpte) {
        this.corteSobranteSucursalImpte = corteSobranteSucursalImpte;
    }

    public Short getCorteTransfRecBill() {
        return corteTransfRecBill;
    }

    public void setCorteTransfRecBill(Short corteTransfRecBill) {
        this.corteTransfRecBill = corteTransfRecBill;
    }

    public Integer getCorteTransfRecBillImpte() {
        return corteTransfRecBillImpte;
    }

    public void setCorteTransfRecBillImpte(Integer corteTransfRecBillImpte) {
        this.corteTransfRecBillImpte = corteTransfRecBillImpte;
    }

    public Short getCorteTransfRecMsv() {
        return corteTransfRecMsv;
    }

    public void setCorteTransfRecMsv(Short corteTransfRecMsv) {
        this.corteTransfRecMsv = corteTransfRecMsv;
    }

    public Integer getCorteTransfRecMsvImpte() {
        return corteTransfRecMsvImpte;
    }

    public void setCorteTransfRecMsvImpte(Integer corteTransfRecMsvImpte) {
        this.corteTransfRecMsvImpte = corteTransfRecMsvImpte;
    }

    public Short getCorteNumTransfRecGuard() {
        return corteNumTransfRecGuard;
    }

    public void setCorteNumTransfRecGuard(Short corteNumTransfRecGuard) {
        this.corteNumTransfRecGuard = corteNumTransfRecGuard;
    }

    public Integer getCorteTransfRecGuardImpte() {
        return corteTransfRecGuardImpte;
    }

    public void setCorteTransfRecGuardImpte(Integer corteTransfRecGuardImpte) {
        this.corteTransfRecGuardImpte = corteTransfRecGuardImpte;
    }

    public Short getCorteTransfGenBill() {
        return corteTransfGenBill;
    }

    public void setCorteTransfGenBill(Short corteTransfGenBill) {
        this.corteTransfGenBill = corteTransfGenBill;
    }

    public Integer getCorteTransfGenBillImpte() {
        return corteTransfGenBillImpte;
    }

    public void setCorteTransfGenBillImpte(Integer corteTransfGenBillImpte) {
        this.corteTransfGenBillImpte = corteTransfGenBillImpte;
    }

    public Short getCorteTransfGenMsv() {
        return corteTransfGenMsv;
    }

    public void setCorteTransfGenMsv(Short corteTransfGenMsv) {
        this.corteTransfGenMsv = corteTransfGenMsv;
    }

    public Integer getCorteTransfGenMsvImpte() {
        return corteTransfGenMsvImpte;
    }

    public void setCorteTransfGenMsvImpte(Integer corteTransfGenMsvImpte) {
        this.corteTransfGenMsvImpte = corteTransfGenMsvImpte;
    }

    public Short getCorteNumTransfGenGuard() {
        return corteNumTransfGenGuard;
    }

    public void setCorteNumTransfGenGuard(Short corteNumTransfGenGuard) {
        this.corteNumTransfGenGuard = corteNumTransfGenGuard;
    }

    public Integer getCorteTransfGenGuardImpte() {
        return corteTransfGenGuardImpte;
    }

    public void setCorteTransfGenGuardImpte(Integer corteTransfGenGuardImpte) {
        this.corteTransfGenGuardImpte = corteTransfGenGuardImpte;
    }

    public Short getCorteNumFaltantes() {
        return corteNumFaltantes;
    }

    public void setCorteNumFaltantes(Short corteNumFaltantes) {
        this.corteNumFaltantes = corteNumFaltantes;
    }

    public Integer getCorteFaltantesImpte() {
        return corteFaltantesImpte;
    }

    public void setCorteFaltantesImpte(Integer corteFaltantesImpte) {
        this.corteFaltantesImpte = corteFaltantesImpte;
    }

    public Short getCorteNumFaltanteSucursal() {
        return corteNumFaltanteSucursal;
    }

    public void setCorteNumFaltanteSucursal(Short corteNumFaltanteSucursal) {
        this.corteNumFaltanteSucursal = corteNumFaltanteSucursal;
    }

    public Integer getCorteFaltanteSucursalImpte() {
        return corteFaltanteSucursalImpte;
    }

    public void setCorteFaltanteSucursalImpte(Integer corteFaltanteSucursalImpte) {
        this.corteFaltanteSucursalImpte = corteFaltanteSucursalImpte;
    }

    public Short getCorteNumComprobantesElimn() {
        return corteNumComprobantesElimn;
    }

    public void setCorteNumComprobantesElimn(Short corteNumComprobantesElimn) {
        this.corteNumComprobantesElimn = corteNumComprobantesElimn;
    }

    public Integer getCorteComprobantesElimnImpte() {
        return corteComprobantesElimnImpte;
    }

    public void setCorteComprobantesElimnImpte(Integer corteComprobantesElimnImpte) {
        this.corteComprobantesElimnImpte = corteComprobantesElimnImpte;
    }

    public short getCorteNumComprobantesAtent() {
        return corteNumComprobantesAtent;
    }

    public void setCorteNumComprobantesAtent(short corteNumComprobantesAtent) {
        this.corteNumComprobantesAtent = corteNumComprobantesAtent;
    }

    public Integer getCorteComprobantesAtentImpte() {
        return corteComprobantesAtentImpte;
    }

    public void setCorteComprobantesAtentImpte(Integer corteComprobantesAtentImpte) {
        this.corteComprobantesAtentImpte = corteComprobantesAtentImpte;
    }

    public short getCorteNumComprobantesVerf() {
        return corteNumComprobantesVerf;
    }

    public void setCorteNumComprobantesVerf(short corteNumComprobantesVerf) {
        this.corteNumComprobantesVerf = corteNumComprobantesVerf;
    }

    public Integer getCorteComprobantesVerfImpte() {
        return corteComprobantesVerfImpte;
    }

    public void setCorteComprobantesVerfImpte(Integer corteComprobantesVerfImpte) {
        this.corteComprobantesVerfImpte = corteComprobantesVerfImpte;
    }

    public Short getCorteNumEnvasesVerf() {
        return corteNumEnvasesVerf;
    }

    public void setCorteNumEnvasesVerf(Short corteNumEnvasesVerf) {
        this.corteNumEnvasesVerf = corteNumEnvasesVerf;
    }

    public Short getCorteNumBillProcesados() {
        return corteNumBillProcesados;
    }

    public void setCorteNumBillProcesados(Short corteNumBillProcesados) {
        this.corteNumBillProcesados = corteNumBillProcesados;
    }

    public Integer getCorteBillProcesadosImpte() {
        return corteBillProcesadosImpte;
    }

    public void setCorteBillProcesadosImpte(Integer corteBillProcesadosImpte) {
        this.corteBillProcesadosImpte = corteBillProcesadosImpte;
    }

    public Short getCorteNumMonProcesados() {
        return corteNumMonProcesados;
    }

    public void setCorteNumMonProcesados(Short corteNumMonProcesados) {
        this.corteNumMonProcesados = corteNumMonProcesados;
    }

    public Integer getCorteMonProcesadosImpte() {
        return corteMonProcesadosImpte;
    }

    public void setCorteMonProcesadosImpte(Integer corteMonProcesadosImpte) {
        this.corteMonProcesadosImpte = corteMonProcesadosImpte;
    }

    public Short getCorteNumFichasCaptudas() {
        return corteNumFichasCaptudas;
    }

    public void setCorteNumFichasCaptudas(Short corteNumFichasCaptudas) {
        this.corteNumFichasCaptudas = corteNumFichasCaptudas;
    }

    public Integer getCorteFichasCaptudasImpte() {
        return corteFichasCaptudasImpte;
    }

    public void setCorteFichasCaptudasImpte(Integer corteFichasCaptudasImpte) {
        this.corteFichasCaptudasImpte = corteFichasCaptudasImpte;
    }

    public Short getCorteNumFajllasProcesadas() {
        return corteNumFajllasProcesadas;
    }

    public void setCorteNumFajllasProcesadas(Short corteNumFajllasProcesadas) {
        this.corteNumFajllasProcesadas = corteNumFajllasProcesadas;
    }

    public Integer getCorteFajllasProcesadasImpte() {
        return corteFajllasProcesadasImpte;
    }

    public void setCorteFajllasProcesadasImpte(Integer corteFajllasProcesadasImpte) {
        this.corteFajllasProcesadasImpte = corteFajllasProcesadasImpte;
    }

    public Short getCorteNumPicosProcesados() {
        return corteNumPicosProcesados;
    }

    public void setCorteNumPicosProcesados(Short corteNumPicosProcesados) {
        this.corteNumPicosProcesados = corteNumPicosProcesados;
    }

    public Integer getCortePicosProcesadasImpte() {
        return cortePicosProcesadasImpte;
    }

    public void setCortePicosProcesadasImpte(Integer cortePicosProcesadasImpte) {
        this.cortePicosProcesadasImpte = cortePicosProcesadasImpte;
    }

    public Short getCorteNumBillDol() {
        return corteNumBillDol;
    }

    public void setCorteNumBillDol(Short corteNumBillDol) {
        this.corteNumBillDol = corteNumBillDol;
    }

    public Integer getCorteBillDolImpte() {
        return corteBillDolImpte;
    }

    public void setCorteBillDolImpte(Integer corteBillDolImpte) {
        this.corteBillDolImpte = corteBillDolImpte;
    }

    public Short getCorteNumMonDol() {
        return corteNumMonDol;
    }

    public void setCorteNumMonDol(Short corteNumMonDol) {
        this.corteNumMonDol = corteNumMonDol;
    }

    public Integer getCorteMonDolImpte() {
        return corteMonDolImpte;
    }

    public void setCorteMonDolImpte(Integer corteMonDolImpte) {
        this.corteMonDolImpte = corteMonDolImpte;
    }

    public Short getCorteNumPiezasDol() {
        return corteNumPiezasDol;
    }

    public void setCorteNumPiezasDol(Short corteNumPiezasDol) {
        this.corteNumPiezasDol = corteNumPiezasDol;
    }

    public Integer getCortePiezasDolImpte() {
        return cortePiezasDolImpte;
    }

    public void setCortePiezasDolImpte(Integer cortePiezasDolImpte) {
        this.cortePiezasDolImpte = cortePiezasDolImpte;
    }

    public Date getCorteFechaHrInicio() {
        return corteFechaHrInicio;
    }

    public void setCorteFechaHrInicio(Date corteFechaHrInicio) {
        this.corteFechaHrInicio = corteFechaHrInicio;
    }

    public Date getCorteFechaHrCorte() {
        return corteFechaHrCorte;
    }

    public void setCorteFechaHrCorte(Date corteFechaHrCorte) {
        this.corteFechaHrCorte = corteFechaHrCorte;
    }

    public short getCorteNumComptesNoVerf() {
        return corteNumComptesNoVerf;
    }

    public void setCorteNumComptesNoVerf(short corteNumComptesNoVerf) {
        this.corteNumComptesNoVerf = corteNumComptesNoVerf;
    }

    public Integer getCorteComptesNoVerfImpte() {
        return corteComptesNoVerfImpte;
    }

    public void setCorteComptesNoVerfImpte(Integer corteComptesNoVerfImpte) {
        this.corteComptesNoVerfImpte = corteComptesNoVerfImpte;
    }

    public short getCorteNumEnvasesNoVerf() {
        return corteNumEnvasesNoVerf;
    }

    public void setCorteNumEnvasesNoVerf(short corteNumEnvasesNoVerf) {
        this.corteNumEnvasesNoVerf = corteNumEnvasesNoVerf;
    }

    public Integer getCorteTotalDepositosDolares() {
        return corteTotalDepositosDolares;
    }

    public void setCorteTotalDepositosDolares(Integer corteTotalDepositosDolares) {
        this.corteTotalDepositosDolares = corteTotalDepositosDolares;
    }

    public Integer getCorteTotalDolaresComprados() {
        return corteTotalDolaresComprados;
    }

    public void setCorteTotalDolaresComprados(Integer corteTotalDolaresComprados) {
        this.corteTotalDolaresComprados = corteTotalDolaresComprados;
    }

    public Integer getCorteTotalDolaresVendidos() {
        return corteTotalDolaresVendidos;
    }

    public void setCorteTotalDolaresVendidos(Integer corteTotalDolaresVendidos) {
        this.corteTotalDolaresVendidos = corteTotalDolaresVendidos;
    }

    public List<DetalleDeCorte> getDetalleDeCorteList() {
        return detalleDeCorteList;
    }

    public void setDetalleDeCorteList(List<DetalleDeCorte> detalleDeCorteList) {
        this.detalleDeCorteList = detalleDeCorteList;
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
        hash += (cortePK != null ? cortePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corte)) {
            return false;
        }
        Corte other = (Corte) object;
        if ((this.cortePK == null && other.cortePK != null) || (this.cortePK != null && !this.cortePK.equals(other.cortePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Corte[cortePK=" + cortePK + "]";
    }

}
