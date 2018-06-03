/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "COMPROBANTE_DE_DOTACION")
@NamedQueries({
    @NamedQuery(name = "ComprobanteDeDotacion.findAll", query = "SELECT c FROM ComprobanteDeDotacion c"),
    @NamedQuery(name = "ComprobanteDeDotacion.findByCompdotacionNumComprobante", query = "SELECT c FROM ComprobanteDeDotacion c WHERE c.compdotacionNumComprobante = :compdotacionNumComprobante"),
    @NamedQuery(name = "ComprobanteDeDotacion.findByCompdotacionCodigoImpresion", query = "SELECT c FROM ComprobanteDeDotacion c WHERE c.compdotacionCodigoImpresion = :compdotacionCodigoImpresion"),
    @NamedQuery(name = "ComprobanteDeDotacion.findByCompdotacionFechaHrImpr", query = "SELECT c FROM ComprobanteDeDotacion c WHERE c.compdotacionFechaHrImpr = :compdotacionFechaHrImpr"),
    @NamedQuery(name = "ComprobanteDeDotacion.findByCompdotacionNomina", query = "SELECT c FROM ComprobanteDeDotacion c WHERE c.compdotacionNomina = :compdotacionNomina")})
public class ComprobanteDeDotacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMPDOTACION_NUM_COMPROBANTE")
    private Long compdotacionNumComprobante;
    @Column(name = "COMPDOTACION_CODIGO_IMPRESION")
    private Short compdotacionCodigoImpresion;
    @Column(name = "COMPDOTACION_FECHA_HR_IMPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compdotacionFechaHrImpr;
    @Column(name = "COMPDOTACION_NOMINA")
    private Integer compdotacionNomina;
    @JoinColumn(name = "COMPDOTACION_NUM_COMPROBANTE", referencedColumnName = "SOLICITUD_IDN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SolicitudDotacion solicitudDotacion;

    public ComprobanteDeDotacion() {
    }

    public ComprobanteDeDotacion(Long compdotacionNumComprobante) {
        this.compdotacionNumComprobante = compdotacionNumComprobante;
    }

    public Long getCompdotacionNumComprobante() {
        return compdotacionNumComprobante;
    }

    public void setCompdotacionNumComprobante(Long compdotacionNumComprobante) {
        this.compdotacionNumComprobante = compdotacionNumComprobante;
    }

    public Short getCompdotacionCodigoImpresion() {
        return compdotacionCodigoImpresion;
    }

    public void setCompdotacionCodigoImpresion(Short compdotacionCodigoImpresion) {
        this.compdotacionCodigoImpresion = compdotacionCodigoImpresion;
    }

    public Date getCompdotacionFechaHrImpr() {
        return compdotacionFechaHrImpr;
    }

    public void setCompdotacionFechaHrImpr(Date compdotacionFechaHrImpr) {
        this.compdotacionFechaHrImpr = compdotacionFechaHrImpr;
    }

    public Integer getCompdotacionNomina() {
        return compdotacionNomina;
    }

    public void setCompdotacionNomina(Integer compdotacionNomina) {
        this.compdotacionNomina = compdotacionNomina;
    }

    public SolicitudDotacion getSolicitudDotacion() {
        return solicitudDotacion;
    }

    public void setSolicitudDotacion(SolicitudDotacion solicitudDotacion) {
        this.solicitudDotacion = solicitudDotacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compdotacionNumComprobante != null ? compdotacionNumComprobante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprobanteDeDotacion)) {
            return false;
        }
        ComprobanteDeDotacion other = (ComprobanteDeDotacion) object;
        if ((this.compdotacionNumComprobante == null && other.compdotacionNumComprobante != null) || (this.compdotacionNumComprobante != null && !this.compdotacionNumComprobante.equals(other.compdotacionNumComprobante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.ComprobanteDeDotacion[compdotacionNumComprobante=" + compdotacionNumComprobante + "]";
    }

}
