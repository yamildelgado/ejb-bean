/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class TotalesRecepcionVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroLotes;
	private int numerocomprobantes;
	private int numeroEnvases;
	private int importeTotal;
	/**
	 * @return the importeTotal
	 */
	public int getImporteTotal() {
		return importeTotal;
	}
	/**
	 * @param importeTotal the importeTotal to set
	 */
	public void setImporteTotal(int importeTotal) {
		this.importeTotal = importeTotal;
	}
	/**
	 * @return the numeroLotes
	 */
	public int getNumeroLotes() {
		return numeroLotes;
	}
	/**
	 * @param numeroLotes the numeroLotes to set
	 */
	public void setNumeroLotes(int numeroLotes) {
		this.numeroLotes = numeroLotes;
	}
	/**
	 * @return the numerocomprobantes
	 */
	public int getNumerocomprobantes() {
		return numerocomprobantes;
	}
	/**
	 * @param numerocomprobantes the numerocomprobantes to set
	 */
	public void setNumerocomprobantes(int numerocomprobantes) {
		this.numerocomprobantes = numerocomprobantes;
	}
	/**
	 * @return the numeroEnvases
	 */
	public int getNumeroEnvases() {
		return numeroEnvases;
	}
	/**
	 * @param numeroEnvases the numeroEnvases to set
	 */
	public void setNumeroEnvases(int numeroEnvases) {
		this.numeroEnvases = numeroEnvases;
	}
	
}
