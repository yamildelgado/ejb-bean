/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "CAT_GENERAL_AEWEB")
@NamedQueries({
    @NamedQuery(name = "CatGeneralAeweb.findAll", query = "SELECT c FROM CatGeneralAeweb c"),
    @NamedQuery(name = "CatGeneralAeweb.findByAgrupadorIdn", query = "SELECT c FROM CatGeneralAeweb c WHERE c.catGeneralAewebPK.agrupadorIdn = :agrupadorIdn"),
    @NamedQuery(name = "CatGeneralAeweb.findByAewebcatgralIdn", query = "SELECT c FROM CatGeneralAeweb c WHERE c.catGeneralAewebPK.aewebcatgralIdn = :aewebcatgralIdn"),
    @NamedQuery(name = "CatGeneralAeweb.findByAewebcatgralDescripcion", query = "SELECT c FROM CatGeneralAeweb c WHERE c.aewebcatgralDescripcion = :aewebcatgralDescripcion")})
public class CatGeneralAeweb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CatGeneralAewebPK catGeneralAewebPK;
    @Column(name = "AEWEBCATGRAL_DESCRIPCION")
    private String aewebcatgralDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<MovimientosS711> movimientosS711List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<MovimientosS500> movimientosS500List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<SubBoveda> subBovedaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<Caja> cajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<Envase> envaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<Comprobante> comprobanteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<SolicitudDotacion> solicitudDotacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb1")
    private List<SolicitudDotacion> solicitudDotacionList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<Transferencia> transferenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<FichaDeposito> fichaDepositoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<MovimientosS018> movimientosS018List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<MovimientosS019> movimientosS019List;
    @JoinColumn(name = "AGRUPADOR_IDN", referencedColumnName = "AGRUPADOR_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgrupadorAeweb agrupadorAeweb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catGeneralAeweb")
    private List<Corte> corteList;

    public CatGeneralAeweb() {
    }

    public CatGeneralAeweb(CatGeneralAewebPK catGeneralAewebPK) {
        this.catGeneralAewebPK = catGeneralAewebPK;
    }

    public CatGeneralAeweb(short agrupadorIdn, short aewebcatgralIdn) {
        this.catGeneralAewebPK = new CatGeneralAewebPK(agrupadorIdn, aewebcatgralIdn);
    }

    public CatGeneralAewebPK getCatGeneralAewebPK() {
        return catGeneralAewebPK;
    }

    public void setCatGeneralAewebPK(CatGeneralAewebPK catGeneralAewebPK) {
        this.catGeneralAewebPK = catGeneralAewebPK;
    }

    public String getAewebcatgralDescripcion() {
        return aewebcatgralDescripcion;
    }

    public void setAewebcatgralDescripcion(String aewebcatgralDescripcion) {
        this.aewebcatgralDescripcion = aewebcatgralDescripcion;
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

    public List<SubBoveda> getSubBovedaList() {
        return subBovedaList;
    }

    public void setSubBovedaList(List<SubBoveda> subBovedaList) {
        this.subBovedaList = subBovedaList;
    }

    public List<CajaHabilitadaPorTurno> getCajaHabilitadaPorTurnoList() {
        return cajaHabilitadaPorTurnoList;
    }

    public void setCajaHabilitadaPorTurnoList(List<CajaHabilitadaPorTurno> cajaHabilitadaPorTurnoList) {
        this.cajaHabilitadaPorTurnoList = cajaHabilitadaPorTurnoList;
    }

    public List<Caja> getCajaList() {
        return cajaList;
    }

    public void setCajaList(List<Caja> cajaList) {
        this.cajaList = cajaList;
    }

    public List<Envase> getEnvaseList() {
        return envaseList;
    }

    public void setEnvaseList(List<Envase> envaseList) {
        this.envaseList = envaseList;
    }

    public List<Comprobante> getComprobanteList() {
        return comprobanteList;
    }

    public void setComprobanteList(List<Comprobante> comprobanteList) {
        this.comprobanteList = comprobanteList;
    }

    public List<SolicitudDotacion> getSolicitudDotacionList() {
        return solicitudDotacionList;
    }

    public void setSolicitudDotacionList(List<SolicitudDotacion> solicitudDotacionList) {
        this.solicitudDotacionList = solicitudDotacionList;
    }

    public List<SolicitudDotacion> getSolicitudDotacionList1() {
        return solicitudDotacionList1;
    }

    public void setSolicitudDotacionList1(List<SolicitudDotacion> solicitudDotacionList1) {
        this.solicitudDotacionList1 = solicitudDotacionList1;
    }

    public List<Transferencia> getTransferenciaList() {
        return transferenciaList;
    }

    public void setTransferenciaList(List<Transferencia> transferenciaList) {
        this.transferenciaList = transferenciaList;
    }

    public List<FichaDeposito> getFichaDepositoList() {
        return fichaDepositoList;
    }

    public void setFichaDepositoList(List<FichaDeposito> fichaDepositoList) {
        this.fichaDepositoList = fichaDepositoList;
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

    public AgrupadorAeweb getAgrupadorAeweb() {
        return agrupadorAeweb;
    }

    public void setAgrupadorAeweb(AgrupadorAeweb agrupadorAeweb) {
        this.agrupadorAeweb = agrupadorAeweb;
    }

    public List<Corte> getCorteList() {
        return corteList;
    }

    public void setCorteList(List<Corte> corteList) {
        this.corteList = corteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catGeneralAewebPK != null ? catGeneralAewebPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatGeneralAeweb)) {
            return false;
        }
        CatGeneralAeweb other = (CatGeneralAeweb) object;
        if ((this.catGeneralAewebPK == null && other.catGeneralAewebPK != null) || (this.catGeneralAewebPK != null && !this.catGeneralAewebPK.equals(other.catGeneralAewebPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAeweb[catGeneralAewebPK=" + catGeneralAewebPK + "]";
    }

}
