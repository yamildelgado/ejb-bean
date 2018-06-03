/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DIFERENCIA")
@NamedQueries({
    @NamedQuery(name = "Diferencia.findAll", query = "SELECT d FROM Diferencia d"),
    @NamedQuery(name = "Diferencia.findByDiferenciaIdn", query = "SELECT d FROM Diferencia d WHERE d.diferenciaIdn = :diferenciaIdn"),
    @NamedQuery(name = "Diferencia.findByDiferenciaMonto", query = "SELECT d FROM Diferencia d WHERE d.diferenciaMonto = :diferenciaMonto"),
    @NamedQuery(name = "Diferencia.findByDiferenciaTipo", query = "SELECT d FROM Diferencia d WHERE d.diferenciaTipo = :diferenciaTipo"),
    @NamedQuery(name = "Diferencia.findByDiferenciaAutorizoNoimina", query = "SELECT d FROM Diferencia d WHERE d.diferenciaAutorizoNoimina = :diferenciaAutorizoNoimina"),
    @NamedQuery(name = "Diferencia.findByDiferenciaSuc", query = "SELECT d FROM Diferencia d WHERE d.diferenciaSuc = :diferenciaSuc"),
    @NamedQuery(name = "Diferencia.findByDiferenciaCuenta", query = "SELECT d FROM Diferencia d WHERE d.diferenciaCuenta = :diferenciaCuenta"),
    @NamedQuery(name = "Diferencia.findByDiferenciaEstatus", query = "SELECT d FROM Diferencia d WHERE d.diferenciaEstatus = :diferenciaEstatus"),
    @NamedQuery(name = "Diferencia.findByDiferenciaNumAutorizacion", query = "SELECT d FROM Diferencia d WHERE d.diferenciaNumAutorizacion = :diferenciaNumAutorizacion"),
    @NamedQuery(name = "Diferencia.findByDiferenciaError", query = "SELECT d FROM Diferencia d WHERE d.diferenciaError = :diferenciaError"),
    @NamedQuery(name = "Diferencia.findByDiferenciaErrorTxt", query = "SELECT d FROM Diferencia d WHERE d.diferenciaErrorTxt = :diferenciaErrorTxt")})
public class Diferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DIFERENCIA_IDN")
    private Integer diferenciaIdn;
    @Column(name = "DIFERENCIA_MONTO")
    private Double diferenciaMonto;
    @Column(name = "DIFERENCIA_TIPO")
    private Short diferenciaTipo;
    @Column(name = "DIFERENCIA_AUTORIZO_NOIMINA")
    private Integer diferenciaAutorizoNoimina;
    @Column(name = "DIFERENCIA_SUC")
    private Short diferenciaSuc;
    @Column(name = "DIFERENCIA_CUENTA")
    private Long diferenciaCuenta;
    @Column(name = "DIFERENCIA_ESTATUS")
    private Short diferenciaEstatus;
    @Column(name = "DIFERENCIA_NUM_AUTORIZACION")
    private Integer diferenciaNumAutorizacion;
    @Column(name = "DIFERENCIA_ERROR")
    private Short diferenciaError;
    @Column(name = "DIFERENCIA_ERROR_TXT")
    private String diferenciaErrorTxt;
    @JoinColumns({
        @JoinColumn(name = "COMPBTE_ID", referencedColumnName = "COMPBTE_ID"),
        @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN")})
    @ManyToOne(optional = false)
    private Comprobante comprobante;

    public Diferencia() {
    }

    public Diferencia(Integer diferenciaIdn) {
        this.diferenciaIdn = diferenciaIdn;
    }

    public Integer getDiferenciaIdn() {
        return diferenciaIdn;
    }

    public void setDiferenciaIdn(Integer diferenciaIdn) {
        this.diferenciaIdn = diferenciaIdn;
    }

    public Double getDiferenciaMonto() {
        return diferenciaMonto;
    }

    public void setDiferenciaMonto(Double diferenciaMonto) {
        this.diferenciaMonto = diferenciaMonto;
    }

    public Short getDiferenciaTipo() {
        return diferenciaTipo;
    }

    public void setDiferenciaTipo(Short diferenciaTipo) {
        this.diferenciaTipo = diferenciaTipo;
    }

    public Integer getDiferenciaAutorizoNoimina() {
        return diferenciaAutorizoNoimina;
    }

    public void setDiferenciaAutorizoNoimina(Integer diferenciaAutorizoNoimina) {
        this.diferenciaAutorizoNoimina = diferenciaAutorizoNoimina;
    }

    public Short getDiferenciaSuc() {
        return diferenciaSuc;
    }

    public void setDiferenciaSuc(Short diferenciaSuc) {
        this.diferenciaSuc = diferenciaSuc;
    }

    public Long getDiferenciaCuenta() {
        return diferenciaCuenta;
    }

    public void setDiferenciaCuenta(Long diferenciaCuenta) {
        this.diferenciaCuenta = diferenciaCuenta;
    }

    public Short getDiferenciaEstatus() {
        return diferenciaEstatus;
    }

    public void setDiferenciaEstatus(Short diferenciaEstatus) {
        this.diferenciaEstatus = diferenciaEstatus;
    }

    public Integer getDiferenciaNumAutorizacion() {
        return diferenciaNumAutorizacion;
    }

    public void setDiferenciaNumAutorizacion(Integer diferenciaNumAutorizacion) {
        this.diferenciaNumAutorizacion = diferenciaNumAutorizacion;
    }

    public Short getDiferenciaError() {
        return diferenciaError;
    }

    public void setDiferenciaError(Short diferenciaError) {
        this.diferenciaError = diferenciaError;
    }

    public String getDiferenciaErrorTxt() {
        return diferenciaErrorTxt;
    }

    public void setDiferenciaErrorTxt(String diferenciaErrorTxt) {
        this.diferenciaErrorTxt = diferenciaErrorTxt;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diferenciaIdn != null ? diferenciaIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diferencia)) {
            return false;
        }
        Diferencia other = (Diferencia) object;
        if ((this.diferenciaIdn == null && other.diferenciaIdn != null) || (this.diferenciaIdn != null && !this.diferenciaIdn.equals(other.diferenciaIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.Diferencia[diferenciaIdn=" + diferenciaIdn + "]";
    }

}
