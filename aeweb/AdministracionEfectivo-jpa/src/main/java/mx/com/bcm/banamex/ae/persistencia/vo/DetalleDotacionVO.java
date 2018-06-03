/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class DetalleDotacionVO extends ReporteAbstract implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Long solicitudIdn;
    private Short detlldenomIdn;
    private Integer cantidad;
    private Short divisaId;
    private String denomTipoBillMon;
    private BigDecimal denomDenominacion;
    private List<MonedaVO> listaMonedaVO;
    private List<BilleteVO> listaBilleteVO;
    
	/**
	 * @return the solicitudIdn
	 */
	public Long getSolicitudIdn() {
		return solicitudIdn;
	}
	/**
	 * @param solicitudIdn the solicitudIdn to set
	 */
	public void setSolicitudIdn(Long solicitudIdn) {
		this.solicitudIdn = solicitudIdn;
	}
	/**
	 * @return the detlldenomIdn
	 */
	public Short getDetlldenomIdn() {
		return detlldenomIdn;
	}
	/**
	 * @param detlldenomIdn the detlldenomIdn to set
	 */
	public void setDetlldenomIdn(Short detlldenomIdn) {
		this.detlldenomIdn = detlldenomIdn;
	}
	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the divisaId
	 */
	public Short getDivisaId() {
		return divisaId;
	}
	/**
	 * @param divisaId the divisaId to set
	 */
	public void setDivisaId(Short divisaId) {
		this.divisaId = divisaId;
	}
	/**
	 * @return the denomTipoBillMon
	 */
	public String getDenomTipoBillMon() {
		return denomTipoBillMon;
	}
	/**
	 * @param denomTipoBillMon the denomTipoBillMon to set
	 */
	public void setDenomTipoBillMon(String denomTipoBillMon) {
		this.denomTipoBillMon = denomTipoBillMon;
	}
	/**
	 * @return the denomDenominacion
	 */
	public BigDecimal getDenomDenominacion() {
		return denomDenominacion;
	}
	/**
	 * @param denomDenominacion the denomDenominacion to set
	 */
	public void setDenomDenominacion(BigDecimal denomDenominacion) {
		this.denomDenominacion = denomDenominacion;
	}
	/**
	 * @return the listaMonedaVO
	 */
	public List<MonedaVO> getListaMonedaVO() {
		return listaMonedaVO;
	}
	/**
	 * @param listaMonedaVO the listaMonedaVO to set
	 */
	public void setListaMonedaVO(List<MonedaVO> listaMonedaVO) {
		this.listaMonedaVO = listaMonedaVO;
	}
	/**
	 * @return the listaBilleteVO
	 */
	public List<BilleteVO> getListaBilleteVO() {
		return listaBilleteVO;
	}
	/**
	 * @param listaBilleteVO the listaBilleteVO to set
	 */
	public void setListaBilleteVO(List<BilleteVO> listaBilleteVO) {
		this.listaBilleteVO = listaBilleteVO;
	}
	
    
    
}
