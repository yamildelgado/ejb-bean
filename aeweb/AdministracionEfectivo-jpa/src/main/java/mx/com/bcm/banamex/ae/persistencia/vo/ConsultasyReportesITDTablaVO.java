/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.math.BigDecimal;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
public class ConsultasyReportesITDTablaVO {
	private static final long serialVersionUID = 1L;
	
	private Short tipo;
	private BigDecimal denominacion;
	private BigDecimal importe;
	
	/**
	 * @return the tipo
	 */
	public Short getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Short tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the denominacion
	 */
	public BigDecimal getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(BigDecimal denominacion) {
		this.denominacion = denominacion;
	}
	/**
	 * @return the importe
	 */
	public BigDecimal getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
}
