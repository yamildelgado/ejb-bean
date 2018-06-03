/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class TipoOperacionesProcesadoraVO {
	private String nombreOperacion;
	private Short tipoOperacion;
	public String getNombreOperacion() {
		return nombreOperacion;
	}
	public void setNombreOperacion(String nombreOperacion) {
		this.nombreOperacion = nombreOperacion;
	}
	public Short getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(Short tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

}
