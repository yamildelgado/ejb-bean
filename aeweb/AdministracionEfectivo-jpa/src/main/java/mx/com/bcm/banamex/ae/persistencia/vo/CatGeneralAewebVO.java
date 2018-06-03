/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
public class CatGeneralAewebVO  implements Serializable{
	private static final long serialVersionUID = 1L;	
    private String aewebcatgralDescripcion;
    private short agrupadorIdn;
    private short aewebcatgralIdn;
	/**
	 * @return the aewebcatgralDescripcion
	 */
	public String getAewebcatgralDescripcion() {
		return aewebcatgralDescripcion;
	}
	/**
	 * @param aewebcatgralDescripcion the aewebcatgralDescripcion to set
	 */
	public void setAewebcatgralDescripcion(String aewebcatgralDescripcion) {
		this.aewebcatgralDescripcion = aewebcatgralDescripcion;
	}
	/**
	 * @return the agrupadorIdn
	 */
	public short getAgrupadorIdn() {
		return agrupadorIdn;
	}
	/**
	 * @param agrupadorIdn the agrupadorIdn to set
	 */
	public void setAgrupadorIdn(short agrupadorIdn) {
		this.agrupadorIdn = agrupadorIdn;
	}
	/**
	 * @return the aewebcatgralIdn
	 */
	public short getAewebcatgralIdn() {
		return aewebcatgralIdn;
	}
	/**
	 * @param aewebcatgralIdn the aewebcatgralIdn to set
	 */
	public void setAewebcatgralIdn(short aewebcatgralIdn) {
		this.aewebcatgralIdn = aewebcatgralIdn;
	}
    
}
