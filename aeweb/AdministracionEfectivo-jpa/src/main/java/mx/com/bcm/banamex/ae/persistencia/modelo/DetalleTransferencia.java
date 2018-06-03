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
@Table(name = "DETALLE_TRANSFERENCIA")
@NamedQueries({
    @NamedQuery(name = "DetalleTransferencia.findAll", query = "SELECT d FROM DetalleTransferencia d"),
    @NamedQuery(name = "DetalleTransferencia.findByTransIdn", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalleTransferenciaPK.transIdn = :transIdn"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransIdn", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalleTransferenciaPK.detalltransIdn = :detalltransIdn"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransClaveConcepto", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransClaveConcepto = :detalltransClaveConcepto"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransImpte", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransImpte = :detalltransImpte"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransClavePlomo", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransClavePlomo = :detalltransClavePlomo"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransEtvIdn", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransEtvIdn = :detalltransEtvIdn"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransCantidad", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransCantidad = :detalltransCantidad"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransDenominacion", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransDenominacion = :detalltransDenominacion"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransDivisa", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransDivisa = :detalltransDivisa"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransTipoCambio", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransTipoCambio = :detalltransTipoCambio"),
    @NamedQuery(name = "DetalleTransferencia.findByDetalltransTipoTransferencia", query = "SELECT d FROM DetalleTransferencia d WHERE d.detalltransTipoTransferencia = :detalltransTipoTransferencia")})
public class DetalleTransferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleTransferenciaPK detalleTransferenciaPK;
    @Column(name = "DETALLTRANS_CLAVE_CONCEPTO")
    private Short detalltransClaveConcepto;
    @Column(name = "DETALLTRANS_IMPTE")
    private Integer detalltransImpte;
    @Column(name = "DETALLTRANS_CLAVE_PLOMO")
    private String detalltransClavePlomo;
    @Column(name = "DETALLTRANS_ETV_IDN")
    private Short detalltransEtvIdn;
    @Column(name = "DETALLTRANS_CANTIDAD")
    private Short detalltransCantidad;
    @Column(name = "DETALLTRANS_DENOMINACION")
    private Integer detalltransDenominacion;
    @Column(name = "DETALLTRANS_DIVISA")
    private String detalltransDivisa;
    @Column(name = "DETALLTRANS_TIPO_CAMBIO")
    private Integer detalltransTipoCambio;
    @Column(name = "DETALLTRANS_TIPO_TRANSFERENCIA")
    private Character detalltransTipoTransferencia;
    @JoinColumns({
        @JoinColumn(name = "DETALLTRANS_FEC_HR", referencedColumnName = "TRANS_FEC_HR"),
        @JoinColumn(name = "TRANS_IDN", referencedColumnName = "TRANS_IDN", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Transferencia transferencia;

    public DetalleTransferencia() {
    }

    public DetalleTransferencia(DetalleTransferenciaPK detalleTransferenciaPK) {
        this.detalleTransferenciaPK = detalleTransferenciaPK;
    }

    public DetalleTransferencia(int transIdn, short detalltransIdn) {
        this.detalleTransferenciaPK = new DetalleTransferenciaPK(transIdn, detalltransIdn);
    }

    public DetalleTransferenciaPK getDetalleTransferenciaPK() {
        return detalleTransferenciaPK;
    }

    public void setDetalleTransferenciaPK(DetalleTransferenciaPK detalleTransferenciaPK) {
        this.detalleTransferenciaPK = detalleTransferenciaPK;
    }

    public Short getDetalltransClaveConcepto() {
        return detalltransClaveConcepto;
    }

    public void setDetalltransClaveConcepto(Short detalltransClaveConcepto) {
        this.detalltransClaveConcepto = detalltransClaveConcepto;
    }

    public Integer getDetalltransImpte() {
        return detalltransImpte;
    }

    public void setDetalltransImpte(Integer detalltransImpte) {
        this.detalltransImpte = detalltransImpte;
    }

    public String getDetalltransClavePlomo() {
        return detalltransClavePlomo;
    }

    public void setDetalltransClavePlomo(String detalltransClavePlomo) {
        this.detalltransClavePlomo = detalltransClavePlomo;
    }

    public Short getDetalltransEtvIdn() {
        return detalltransEtvIdn;
    }

    public void setDetalltransEtvIdn(Short detalltransEtvIdn) {
        this.detalltransEtvIdn = detalltransEtvIdn;
    }

    public Short getDetalltransCantidad() {
        return detalltransCantidad;
    }

    public void setDetalltransCantidad(Short detalltransCantidad) {
        this.detalltransCantidad = detalltransCantidad;
    }

    public Integer getDetalltransDenominacion() {
        return detalltransDenominacion;
    }

    public void setDetalltransDenominacion(Integer detalltransDenominacion) {
        this.detalltransDenominacion = detalltransDenominacion;
    }

    public String getDetalltransDivisa() {
        return detalltransDivisa;
    }

    public void setDetalltransDivisa(String detalltransDivisa) {
        this.detalltransDivisa = detalltransDivisa;
    }

    public Integer getDetalltransTipoCambio() {
        return detalltransTipoCambio;
    }

    public void setDetalltransTipoCambio(Integer detalltransTipoCambio) {
        this.detalltransTipoCambio = detalltransTipoCambio;
    }

    public Character getDetalltransTipoTransferencia() {
        return detalltransTipoTransferencia;
    }

    public void setDetalltransTipoTransferencia(Character detalltransTipoTransferencia) {
        this.detalltransTipoTransferencia = detalltransTipoTransferencia;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleTransferenciaPK != null ? detalleTransferenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTransferencia)) {
            return false;
        }
        DetalleTransferencia other = (DetalleTransferencia) object;
        if ((this.detalleTransferenciaPK == null && other.detalleTransferenciaPK != null) || (this.detalleTransferenciaPK != null && !this.detalleTransferenciaPK.equals(other.detalleTransferenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleTransferencia[detalleTransferenciaPK=" + detalleTransferenciaPK + "]";
    }

}
