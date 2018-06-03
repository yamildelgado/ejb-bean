/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
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

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "TIPO_DE_ERROR")
@NamedQueries({
    @NamedQuery(name = "TipoDeError.findAll", query = "SELECT t FROM TipoDeError t"),
    @NamedQuery(name = "TipoDeError.findByErrId", query = "SELECT t FROM TipoDeError t WHERE t.errId = :errId"),
    @NamedQuery(name = "TipoDeError.findByErroDescripcion", query = "SELECT t FROM TipoDeError t WHERE t.erroDescripcion = :erroDescripcion"),
    @NamedQuery(name = "TipoDeError.findByErrSistema", query = "SELECT t FROM TipoDeError t WHERE t.errSistema = :errSistema")})
public class TipoDeError implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ERR_ID")
    private String errId;
    @Column(name = "ERRO_DESCRIPCION")
    private String erroDescripcion;
    @Column(name = "ERR_SISTEMA")
    private String errSistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "errId")
    private List<MovimientosS711> movimientosS711List;
    @OneToMany(mappedBy = "errId")
    private List<MovimientosS500> movimientosS500List;
    @OneToMany(mappedBy = "errId")
    private List<MovimientosS018> movimientosS018List;
    @OneToMany(mappedBy = "errId")
    private List<MovimientosS019> movimientosS019List;

    public TipoDeError() {
    }

    public TipoDeError(String errId) {
        this.errId = errId;
    }

    public String getErrId() {
        return errId;
    }

    public void setErrId(String errId) {
        this.errId = errId;
    }

    public String getErroDescripcion() {
        return erroDescripcion;
    }

    public void setErroDescripcion(String erroDescripcion) {
        this.erroDescripcion = erroDescripcion;
    }

    public String getErrSistema() {
        return errSistema;
    }

    public void setErrSistema(String errSistema) {
        this.errSistema = errSistema;
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

    public List<MovimientosS018> getMovimientosS018List() {
        return movimientosS018List;
    }

    public void setMovimientosS018List(List<MovimientosS018> movimientosS018List) {
        this.movimientosS018List = movimientosS018List;
    }

    public List<MovimientosS019> getMovimientosS019List() {
        return movimientosS019List;
    }

    public void setMovimientosS019List(List<MovimientosS019> movimientosS019List) {
        this.movimientosS019List = movimientosS019List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (errId != null ? errId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeError)) {
            return false;
        }
        TipoDeError other = (TipoDeError) object;
        if ((this.errId == null && other.errId != null) || (this.errId != null && !this.errId.equals(other.errId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeError[errId=" + errId + "]";
    }

}
