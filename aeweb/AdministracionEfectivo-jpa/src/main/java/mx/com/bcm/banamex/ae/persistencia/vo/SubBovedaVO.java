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

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;


/**
 * @author atinajero ABRAHAM ALFONSO TINAJERO SÁNCEHZ
 * 
 */
public class SubBovedaVO extends ReporteAbstract implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short idnSubBoveda;
	private String subBovedaDescripcion;
	private String subBovedaCalleNum;
	private String subBovedaColonia;
	private String subBovedaPoblacion;
	private String subBovedaCp;
	private String subBovedaEdo;
	private String subBovedaBajaLogica;
	private long plazaIdn;
	private int sirhIdn;
	private String subBovedaNombreCpae;
	private String nombrePlaza;

	/**
	 * @return the subBovedaCalleNum
	 */
	public String getSubBovedaCalleNum() {
		return subBovedaCalleNum;
	}

	/**
	 * @param subBovedaCalleNum
	 *            the subBovedaCalleNum to set
	 */
	public void setSubBovedaCalleNum(String subBovedaCalleNum) {
		this.subBovedaCalleNum = subBovedaCalleNum;
	}

	/**
	 * @return the subBovedaColonia
	 */
	public String getSubBovedaColonia() {
		return subBovedaColonia;
	}

	/**
	 * @param subBovedaColonia
	 *            the subBovedaColonia to set
	 */
	public void setSubBovedaColonia(String subBovedaColonia) {
		this.subBovedaColonia = subBovedaColonia;
	}

	/**
	 * @return the subBovedaPoblacion
	 */
	public String getSubBovedaPoblacion() {
		return subBovedaPoblacion;
	}

	/**
	 * @param subBovedaPoblacion
	 *            the subBovedaPoblacion to set
	 */
	public void setSubBovedaPoblacion(String subBovedaPoblacion) {
		this.subBovedaPoblacion = subBovedaPoblacion;
	}

	/**
	 * @return the subBovedaCp
	 */
	public String getSubBovedaCp() {
		return subBovedaCp;
	}

	/**
	 * @param subBovedaCp
	 *            the subBovedaCp to set
	 */
	public void setSubBovedaCp(String subBovedaCp) {
		this.subBovedaCp = subBovedaCp;
	}

	/**
	 * @return the subBovedaEdo
	 */
	public String getSubBovedaEdo() {
		return subBovedaEdo;
	}

	/**
	 * @param subBovedaEdo
	 *            the subBovedaEdo to set
	 */
	public void setSubBovedaEdo(String subBovedaEdo) {
		this.subBovedaEdo = subBovedaEdo;
	}

	/**
	 * @return the subBovedaBajaLogica
	 */
	public String getSubBovedaBajaLogica() {
		return subBovedaBajaLogica;
	}

	/**
	 * @param subBovedaBajaLogica
	 *            the subBovedaBajaLogica to set
	 */
	public void setSubBovedaBajaLogica(String subBovedaBajaLogica) {
		this.subBovedaBajaLogica = subBovedaBajaLogica;
	}

	/**
	 * @return the plazaIdn
	 */
	public long getPlazaIdn() {
		return plazaIdn;
	}

	/**
	 * @param plazaIdn
	 *            the plazaIdn to set
	 */
	public void setPlazaIdn(long plazaIdn) {
		this.plazaIdn = plazaIdn;
	}

	/**
	 * @return the sirhIdn
	 */
	public int getSirhIdn() {
		return sirhIdn;
	}

	/**
	 * @param sirhIdn
	 *            the sirhIdn to set
	 */
	public void setSirhIdn(int sirhIdn) {
		this.sirhIdn = sirhIdn;
	}

	/**
	 * @return the subBovedaNombreCpae
	 */
	public String getSubBovedaNombreCpae() {
		return subBovedaNombreCpae;
	}

	/**
	 * @param subBovedaNombreCpae
	 *            the subBovedaNombreCpae to set
	 */
	public void setSubBovedaNombreCpae(String subBovedaNombreCpae) {
		this.subBovedaNombreCpae = subBovedaNombreCpae;
	}

	/**
	 * @return the idnSubBoveda
	 */
	public short getIdnSubBoveda() {
		return idnSubBoveda;
	}

	/**
	 * @param idnSubBoveda
	 *            the idnSubBoveda to set
	 */
	public void setIdnSubBoveda(short idnSubBoveda) {
		this.idnSubBoveda = idnSubBoveda;
	}

	/**
	 * @return the subBovedaDescripcion
	 */
	public String getSubBovedaDescripcion() {
		return subBovedaDescripcion;
	}

	/**
	 * @param subBovedaDescripcion
	 *            the subBovedaDescripcion to set
	 */
	public void setSubBovedaDescripcion(String subBovedaDescripcion) {
		this.subBovedaDescripcion = subBovedaDescripcion;
	}

	public String getNombrePlaza() {
		return nombrePlaza;
	}

	public void setNombrePlaza(String nombrePlaza) {
		this.nombrePlaza = nombrePlaza;
	}

}
