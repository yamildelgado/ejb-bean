/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class CriterioTipoOperacionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short tipoperIdn;
	private short tentidadIdn;
	/**
	 * @return the tipoperIdn
	 */
	public short getTipoperIdn() {
		return tipoperIdn;
	}
	/**
	 * @param tipoperIdn the tipoperIdn to set
	 */
	public void setTipoperIdn(short tipoperIdn) {
		this.tipoperIdn = tipoperIdn;
	}
	/**
	 * @return the tentidadIdn
	 */
	public short getTentidadIdn() {
		return tentidadIdn;
	}
	/**
	 * @param tentidadIdn the tentidadIdn to set
	 */
	public void setTentidadIdn(short tentidadIdn) {
		this.tentidadIdn = tentidadIdn;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
