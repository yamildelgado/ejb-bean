/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class ModuloSistemaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private BigDecimal modsisNivId;
    private String modsisStatus;
    private String modsisDescripcionMod;
    private String modsisBajaLogica;
    

	public BigDecimal getModsisNivId() {
		return modsisNivId;
	}

	public void setModsisNivId(BigDecimal modsisNivId) {
		this.modsisNivId = modsisNivId;
	}

	public String getModsisStatus() {
		return modsisStatus;
	}

	public void setModsisStatus(String modsisStatus) {
		this.modsisStatus = modsisStatus;
	}

	public String getModsisDescripcionMod() {
		return modsisDescripcionMod;
	}

	public void setModsisDescripcionMod(String modsisDescripcionMod) {
		this.modsisDescripcionMod = modsisDescripcionMod;
	}
	public String getModsisBajaLogica() {
		return modsisBajaLogica;
	}

	public void setModsisBajaLogica(String modsisBajaLogica) {
		this.modsisBajaLogica = modsisBajaLogica;
	}



	@Override
	public String toString() {
		return "ModuloSistemaVO [modsisNivId=" + modsisNivId
				+ ", modsisStatus=\'" + modsisStatus 
				+ "\', modsisDescripcionMod=\'"+ modsisDescripcionMod 
				+ "\', modsisBajaLogica=\'" + modsisBajaLogica + "\']";
	}
    
	
}
