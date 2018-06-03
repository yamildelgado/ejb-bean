/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author OCE-WCD JESUS CARBAJAL MONTES
 *
 */
public class DiasInhabilesVO implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date ddDfestivo;
	 /**
	 * @return the ddDfestivo
	 */
	public Date getDdDfestivo() {
		return ddDfestivo;
	}
	/**
	 * @param ddDfestivo the ddDfestivo to set
	 */
	public void setDdDfestivo(Date ddDfestivo) {
		this.ddDfestivo = ddDfestivo;
	}
	/**
	 * @return the ddTipocal
	 */
	public String getDdTipocal() {
		return ddTipocal;
	}
	/**
	 * @param ddTipocal the ddTipocal to set
	 */
	public void setDdTipocal(String ddTipocal) {
		this.ddTipocal = ddTipocal;
	}
	private String ddTipocal;

}
