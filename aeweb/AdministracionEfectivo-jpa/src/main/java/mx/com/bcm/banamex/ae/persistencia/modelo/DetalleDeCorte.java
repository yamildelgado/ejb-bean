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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "DETALLE_DE_CORTE")
@NamedQueries({
    @NamedQuery(name = "DetalleDeCorte.findAll", query = "SELECT d FROM DetalleDeCorte d"),
    @NamedQuery(name = "DetalleDeCorte.findByCorteIdn", query = "SELECT d FROM DetalleDeCorte d WHERE d.detalleDeCortePK.corteIdn = :corteIdn"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteIdn", query = "SELECT d FROM DetalleDeCorte d WHERE d.detalleDeCortePK.detCorteIdn = :detCorteIdn"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteDivisa", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteDivisa = :detCorteDivisa"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteDenominacion", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteDenominacion = :detCorteDenominacion"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteTipoEfectivo", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteTipoEfectivo = :detCorteTipoEfectivo"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteNumEnfajillado", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteNumEnfajillado = :detCorteNumEnfajillado"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteImpteEnfajillado", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteImpteEnfajillado = :detCorteImpteEnfajillado"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteNumPicos", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteNumPicos = :detCorteNumPicos"),
    @NamedQuery(name = "DetalleDeCorte.findByDetCorteImptePicos", query = "SELECT d FROM DetalleDeCorte d WHERE d.detCorteImptePicos = :detCorteImptePicos")})
public class DetalleDeCorte implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleDeCortePK detalleDeCortePK;
    @Column(name = "DET_CORTE_DIVISA")
    private String detCorteDivisa;
    @Column(name = "DET_CORTE_DENOMINACION")
    private Integer detCorteDenominacion;
    @Column(name = "DET_CORTE_TIPO_EFECTIVO")
    private Character detCorteTipoEfectivo;
    @Column(name = "DET_CORTE_NUM_ENFAJILLADO")
    private Short detCorteNumEnfajillado;
    @Column(name = "DET_CORTE_IMPTE_ENFAJILLADO")
    private Integer detCorteImpteEnfajillado;
    @Column(name = "DET_CORTE_NUM_PICOS")
    private Short detCorteNumPicos;
    @Column(name = "DET_CORTE_IMPTE_PICOS")
    private String detCorteImptePicos;
    @JoinColumns({
        @JoinColumn(name = "CORTE_IDN", referencedColumnName = "CORTE_IDN_CORTE", insertable = false, updatable = false),
        @JoinColumn(name = "DET_CORTE_FEC_HR_CORTE", referencedColumnName = "CORTE_FEC_HR_CORTE")})
    @ManyToOne(optional = false)
    private Corte corte;

    public DetalleDeCorte() {
    }

    public DetalleDeCorte(DetalleDeCortePK detalleDeCortePK) {
        this.detalleDeCortePK = detalleDeCortePK;
    }

    public DetalleDeCorte(int corteIdn, short detCorteIdn) {
        this.detalleDeCortePK = new DetalleDeCortePK(corteIdn, detCorteIdn);
    }

    public DetalleDeCortePK getDetalleDeCortePK() {
        return detalleDeCortePK;
    }

    public void setDetalleDeCortePK(DetalleDeCortePK detalleDeCortePK) {
        this.detalleDeCortePK = detalleDeCortePK;
    }

    public String getDetCorteDivisa() {
        return detCorteDivisa;
    }

    public void setDetCorteDivisa(String detCorteDivisa) {
        this.detCorteDivisa = detCorteDivisa;
    }

    public Integer getDetCorteDenominacion() {
        return detCorteDenominacion;
    }

    public void setDetCorteDenominacion(Integer detCorteDenominacion) {
        this.detCorteDenominacion = detCorteDenominacion;
    }

    public Character getDetCorteTipoEfectivo() {
        return detCorteTipoEfectivo;
    }

    public void setDetCorteTipoEfectivo(Character detCorteTipoEfectivo) {
        this.detCorteTipoEfectivo = detCorteTipoEfectivo;
    }

    public Short getDetCorteNumEnfajillado() {
        return detCorteNumEnfajillado;
    }

    public void setDetCorteNumEnfajillado(Short detCorteNumEnfajillado) {
        this.detCorteNumEnfajillado = detCorteNumEnfajillado;
    }

    public Integer getDetCorteImpteEnfajillado() {
        return detCorteImpteEnfajillado;
    }

    public void setDetCorteImpteEnfajillado(Integer detCorteImpteEnfajillado) {
        this.detCorteImpteEnfajillado = detCorteImpteEnfajillado;
    }

    public Short getDetCorteNumPicos() {
        return detCorteNumPicos;
    }

    public void setDetCorteNumPicos(Short detCorteNumPicos) {
        this.detCorteNumPicos = detCorteNumPicos;
    }

    public String getDetCorteImptePicos() {
        return detCorteImptePicos;
    }

    public void setDetCorteImptePicos(String detCorteImptePicos) {
        this.detCorteImptePicos = detCorteImptePicos;
    }

    public Corte getCorte() {
        return corte;
    }

    public void setCorte(Corte corte) {
        this.corte = corte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleDeCortePK != null ? detalleDeCortePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDeCorte)) {
            return false;
        }
        DetalleDeCorte other = (DetalleDeCorte) object;
        if ((this.detalleDeCortePK == null && other.detalleDeCortePK != null) || (this.detalleDeCortePK != null && !this.detalleDeCortePK.equals(other.detalleDeCortePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDeCorte[detalleDeCortePK=" + detalleDeCortePK + "]";
    }

}
