/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.modelo.AgrupadorAeweb;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
public class AgrupadorAewebVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Short agrupadorIdn;
	private String agrupadorDescripcion;
	/**
	 * @return the agrupadorIdn
	 */
	public Short getAgrupadorIdn() {
		return agrupadorIdn;
	}
	/**
	 * @param agrupadorIdn the agrupadorIdn to set
	 */
	public void setAgrupadorIdn(Short agrupadorIdn) {
		this.agrupadorIdn = agrupadorIdn;
	}
	/**
	 * @return the agrupadorDescripcion
	 */
	public String getAgrupadorDescripcion() {
		return agrupadorDescripcion;
	}
	/**
	 * @param agrupadorDescripcion the agrupadorDescripcion to set
	 */
	public void setAgrupadorDescripcion(String agrupadorDescripcion) {
		this.agrupadorDescripcion = agrupadorDescripcion;
	}
	
}
