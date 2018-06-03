/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "CUENTAS_MAYOR")
@NamedQueries({
    @NamedQuery(name = "CuentasMayor.findAll", query = "SELECT c FROM CuentasMayor c"),
    @NamedQuery(name = "CuentasMayor.findByConceptoId", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoId = :conceptoId"),
    @NamedQuery(name = "CuentasMayor.findByConceptoDescripcion", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoDescripcion = :conceptoDescripcion"),
    @NamedQuery(name = "CuentasMayor.findByConceptoXdivisa", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoXdivisa = :conceptoXdivisa"),
    @NamedQuery(name = "CuentasMayor.findByConceptoDoctoEfectivo", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoDoctoEfectivo = :conceptoDoctoEfectivo"),
    @NamedQuery(name = "CuentasMayor.findByConceptoBillMon", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoBillMon = :conceptoBillMon"),
    @NamedQuery(name = "CuentasMayor.findByConceptoXtipoctto", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoXtipoctto = :conceptoXtipoctto"),
    @NamedQuery(name = "CuentasMayor.findByConceptoReferencia", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoReferencia = :conceptoReferencia"),
    @NamedQuery(name = "CuentasMayor.findByConceptoS018", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoS018 = :conceptoS018"),
    @NamedQuery(name = "CuentasMayor.findByConceptoBajaLogica", query = "SELECT c FROM CuentasMayor c WHERE c.conceptoBajaLogica = :conceptoBajaLogica")})
public class CuentasMayor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONCEPTO_ID")
    private Short conceptoId;
    @Column(name = "CONCEPTO_DESCRIPCION")
    private String conceptoDescripcion;
    @Column(name = "CONCEPTO_XDIVISA")
    private Short conceptoXdivisa;
    @Column(name = "CONCEPTO_DOCTO_EFECTIVO")
    private Short conceptoDoctoEfectivo;
    @Column(name = "CONCEPTO_BILL_MON")
    private Short conceptoBillMon;
    @Column(name = "CONCEPTO_XTIPOCTTO")
    private Short conceptoXtipoctto;
    @Column(name = "CONCEPTO_REFERENCIA")
    private Short conceptoReferencia;
    @Column(name = "CONCEPTO_S018")
    private Short conceptoS018;
    @Column(name = "CONCEPTO_BAJA_LOGICA")
    private String conceptoBajaLogica;
    @OneToMany(mappedBy = "conceptoId")
    private List<FichaDeposito> fichaDepositoList;

    public CuentasMayor() {
    }

    public CuentasMayor(Short conceptoId) {
        this.conceptoId = conceptoId;
    }

    public Short getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(Short conceptoId) {
        this.conceptoId = conceptoId;
    }

    public String getConceptoDescripcion() {
        return conceptoDescripcion;
    }

    public void setConceptoDescripcion(String conceptoDescripcion) {
        this.conceptoDescripcion = conceptoDescripcion;
    }

    public Short getConceptoXdivisa() {
        return conceptoXdivisa;
    }

    public void setConceptoXdivisa(Short conceptoXdivisa) {
        this.conceptoXdivisa = conceptoXdivisa;
    }

    public Short getConceptoDoctoEfectivo() {
        return conceptoDoctoEfectivo;
    }

    public void setConceptoDoctoEfectivo(Short conceptoDoctoEfectivo) {
        this.conceptoDoctoEfectivo = conceptoDoctoEfectivo;
    }

    public Short getConceptoBillMon() {
        return conceptoBillMon;
    }

    public void setConceptoBillMon(Short conceptoBillMon) {
        this.conceptoBillMon = conceptoBillMon;
    }

    public Short getConceptoXtipoctto() {
        return conceptoXtipoctto;
    }

    public void setConceptoXtipoctto(Short conceptoXtipoctto) {
        this.conceptoXtipoctto = conceptoXtipoctto;
    }

    public Short getConceptoReferencia() {
        return conceptoReferencia;
    }

    public void setConceptoReferencia(Short conceptoReferencia) {
        this.conceptoReferencia = conceptoReferencia;
    }

    public Short getConceptoS018() {
        return conceptoS018;
    }

    public void setConceptoS018(Short conceptoS018) {
        this.conceptoS018 = conceptoS018;
    }

    public String getConceptoBajaLogica() {
        return conceptoBajaLogica;
    }

    public void setConceptoBajaLogica(String conceptoBajaLogica) {
        this.conceptoBajaLogica = conceptoBajaLogica;
    }

    public List<FichaDeposito> getFichaDepositoList() {
        return fichaDepositoList;
    }

    public void setFichaDepositoList(List<FichaDeposito> fichaDepositoList) {
        this.fichaDepositoList = fichaDepositoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conceptoId != null ? conceptoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasMayor)) {
            return false;
        }
        CuentasMayor other = (CuentasMayor) object;
        if ((this.conceptoId == null && other.conceptoId != null) || (this.conceptoId != null && !this.conceptoId.equals(other.conceptoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CuentasMayor[conceptoId=" + conceptoId + "]";
    }

}
