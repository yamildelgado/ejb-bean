/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "FICHA_DEPOSITO")
@NamedQueries({
    @NamedQuery(name = "FichaDeposito.findAll", query = "SELECT f FROM FichaDeposito f"),
    @NamedQuery(name = "FichaDeposito.findByFichaIdn", query = "SELECT f FROM FichaDeposito f WHERE f.fichaIdn = :fichaIdn"),
    @NamedQuery(name = "FichaDeposito.findByMovs500Idn", query = "SELECT f FROM FichaDeposito f WHERE f.movs500Idn = :movs500Idn"),
    @NamedQuery(name = "FichaDeposito.findByFichaSuc", query = "SELECT f FROM FichaDeposito f WHERE f.fichaSuc = :fichaSuc"),
    @NamedQuery(name = "FichaDeposito.findByFichaCuentaAbono", query = "SELECT f FROM FichaDeposito f WHERE f.fichaCuentaAbono = :fichaCuentaAbono"),
    @NamedQuery(name = "FichaDeposito.findByFichaMonto", query = "SELECT f FROM FichaDeposito f WHERE f.fichaMonto = :fichaMonto"),
    @NamedQuery(name = "FichaDeposito.findByFichaRef1", query = "SELECT f FROM FichaDeposito f WHERE f.fichaRef1 = :fichaRef1"),
    @NamedQuery(name = "FichaDeposito.findByFichaRef2", query = "SELECT f FROM FichaDeposito f WHERE f.fichaRef2 = :fichaRef2"),
    @NamedQuery(name = "FichaDeposito.findByFichaRef3", query = "SELECT f FROM FichaDeposito f WHERE f.fichaRef3 = :fichaRef3"),
    @NamedQuery(name = "FichaDeposito.findByFichaRef4", query = "SELECT f FROM FichaDeposito f WHERE f.fichaRef4 = :fichaRef4")})
public class FichaDeposito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FICHA_IDN")
    private Integer fichaIdn;
    @Column(name = "MOVS500_IDN")
    private Integer movs500Idn;
    @Column(name = "FICHA_SUC")
    private Short fichaSuc;
    @Column(name = "FICHA_CUENTA_ABONO")
    private Long fichaCuentaAbono;
    @Column(name = "FICHA_MONTO")
    private BigDecimal fichaMonto;
    @Column(name = "FICHA_REF1")
    private String fichaRef1;
    @Column(name = "FICHA_REF2")
    private String fichaRef2;
    @Column(name = "FICHA_REF3")
    private String fichaRef3;
    @Column(name = "FICHA_REF4")
    private String fichaRef4;
    @OneToMany(mappedBy = "fichaIdn")
    private List<MovimientosS711> movimientosS711List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fichaIdn")
    private List<MovimientosS500> movimientosS500List;
    @JoinColumns({
        @JoinColumn(name = "AEWEBCATGRAL_IDN", referencedColumnName = "AEWEBCATGRAL_IDN"),
        @JoinColumn(name = "AEWEBCATGRAL_AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN")})
    @ManyToOne(optional = false)
    private CatGeneralAeweb catGeneralAeweb;
    @JoinColumn(name = "CONCEPTO_ID", referencedColumnName = "CONCEPTO_ID")
    @ManyToOne
    private CuentasMayor conceptoId;
    @JoinColumns({
        @JoinColumn(name = "ENVC_NUM_PLOMO", referencedColumnName = "ENVC_NUM_PLOMO"),
        @JoinColumn(name = "COMPBTE_ID", referencedColumnName = "COMPBTE_ID")})
    @ManyToOne(optional = false)
    private Envase envase;

    public FichaDeposito() {
    }

    public FichaDeposito(Integer fichaIdn) {
        this.fichaIdn = fichaIdn;
    }

    public Integer getFichaIdn() {
        return fichaIdn;
    }

    public void setFichaIdn(Integer fichaIdn) {
        this.fichaIdn = fichaIdn;
    }

    public Integer getMovs500Idn() {
        return movs500Idn;
    }

    public void setMovs500Idn(Integer movs500Idn) {
        this.movs500Idn = movs500Idn;
    }

    public Short getFichaSuc() {
        return fichaSuc;
    }

    public void setFichaSuc(Short fichaSuc) {
        this.fichaSuc = fichaSuc;
    }

    public Long getFichaCuentaAbono() {
        return fichaCuentaAbono;
    }

    public void setFichaCuentaAbono(Long fichaCuentaAbono) {
        this.fichaCuentaAbono = fichaCuentaAbono;
    }

    public BigDecimal getFichaMonto() {
        return fichaMonto;
    }

    public void setFichaMonto(BigDecimal fichaMonto) {
        this.fichaMonto = fichaMonto;
    }

    public String getFichaRef1() {
        return fichaRef1;
    }

    public void setFichaRef1(String fichaRef1) {
        this.fichaRef1 = fichaRef1;
    }

    public String getFichaRef2() {
        return fichaRef2;
    }

    public void setFichaRef2(String fichaRef2) {
        this.fichaRef2 = fichaRef2;
    }

    public String getFichaRef3() {
        return fichaRef3;
    }

    public void setFichaRef3(String fichaRef3) {
        this.fichaRef3 = fichaRef3;
    }

    public String getFichaRef4() {
        return fichaRef4;
    }

    public void setFichaRef4(String fichaRef4) {
        this.fichaRef4 = fichaRef4;
    }

    public List<MovimientosS711> getMovimientosS711List() {
        return movimientosS711List;
    }

    public void setMovimientosS711List(List<MovimientosS711> movimientosS711List) {
        this.movimientosS711List = movimientosS711List;
    }

    public List<MovimientosS500> getMovimientosS500List() {
        return movimientosS500List;
    }

    public void setMovimientosS500List(List<MovimientosS500> movimientosS500List) {
        this.movimientosS500List = movimientosS500List;
    }

    public CatGeneralAeweb getCatGeneralAeweb() {
        return catGeneralAeweb;
    }

    public void setCatGeneralAeweb(CatGeneralAeweb catGeneralAeweb) {
        this.catGeneralAeweb = catGeneralAeweb;
    }

    public CuentasMayor getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(CuentasMayor conceptoId) {
        this.conceptoId = conceptoId;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fichaIdn != null ? fichaIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichaDeposito)) {
            return false;
        }
        FichaDeposito other = (FichaDeposito) object;
        if ((this.fichaIdn == null && other.fichaIdn != null) || (this.fichaIdn != null && !this.fichaIdn.equals(other.fichaIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.FichaDeposito[fichaIdn=" + fichaIdn + "]";
    }

}
