/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;




/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */

public class CajaVO extends ReporteAbstract implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Short cajaIdn;
    private String cajaIpAddress;
    private String cajaEquip;
    private String cajaModeloEquipoBill;
    private String cajaModeloEquipoMon;
    private String cajaBajaLogica;
    private Short subbovedaIdn;
    private Short sirhIdn;
    private String seleccion;
	private short aewebcatgralIdn;
	private String aewebcatgralDescripcion;

	private boolean apartar;
	private boolean quitar;
	private List<CajasPorTurnoVO> cajasTurno;


	/**
	 * @return the sirhIdn
	 */
	public Short getSirhIdn() {
		return sirhIdn;
	}

	/**
	 * @param sirhIdn the sirhIdn to set
	 */
	public void setSirhIdn(Short sirhIdn) {
		this.sirhIdn = sirhIdn;
	}

	/**
	 * @return the subbovedaIdn
	 */
	public Short getSubbovedaIdn() {
		return subbovedaIdn;
	}

	/**
	 * @param subbovedaIdn the subbovedaIdn to set
	 */
	public void setSubbovedaIdn(Short subbovedaIdn) {
		this.subbovedaIdn = subbovedaIdn;
	}

	/**
	 * @return the cajaIdn
	 */
	public Short getCajaIdn() {
		return cajaIdn;
	}
	/**
	 * @param cajaIdn the cajaIdn to set
	 */
	public void setCajaIdn(Short cajaIdn) {
		this.cajaIdn = cajaIdn;
	}
	/**
	 * @return the cajaIpAddress
	 */
	public String getCajaIpAddress() {
		return cajaIpAddress;
	}
	/**
	 * @param cajaIpAddress the cajaIpAddress to set
	 */
	public void setCajaIpAddress(String cajaIpAddress) {
		this.cajaIpAddress = cajaIpAddress;
	}
	/**
	 * @return the cajaEquip
	 */
	public String getCajaEquip() {
		return cajaEquip;
	}

	/**
	 * @param cajaEquip the cajaEquip to set
	 */
	public void setCajaEquip(String cajaEquip) {
		this.cajaEquip = cajaEquip;
	}

	/**
	 * @return the cajaModeloEquipoBill
	 */
	public String getCajaModeloEquipoBill() {
		return cajaModeloEquipoBill;
	}
	/**
	 * @param cajaModeloEquipoBill the cajaModeloEquipoBill to set
	 */
	public void setCajaModeloEquipoBill(String cajaModeloEquipoBill) {
		this.cajaModeloEquipoBill = cajaModeloEquipoBill;
	}
	/**
	 * @return the cajaModeloEquipoMon
	 */
	public String getCajaModeloEquipoMon() {
		return cajaModeloEquipoMon;
	}
	/**
	 * @param cajaModeloEquipoMon the cajaModeloEquipoMon to set
	 */
	public void setCajaModeloEquipoMon(String cajaModeloEquipoMon) {
		this.cajaModeloEquipoMon = cajaModeloEquipoMon;
	}
	/**
	 * @return the cajaBajaLogica
	 */
	public String getCajaBajaLogica() {
		return cajaBajaLogica;
	}
	/**
	 * @param cajaBajaLogica the cajaBajaLogica to set
	 */
	public void setCajaBajaLogica(String cajaBajaLogica) {
		this.cajaBajaLogica = cajaBajaLogica;
	}

	/**
	 * @return the apartar
	 */
	public boolean isApartar() {
		return apartar;
	}

	/**
	 * @param apartar the apartar to set
	 */
	public void setApartar(boolean apartar) {
		this.apartar = apartar;
	}

	/**
	 * @return the cajasTurno
	 */
	public List<CajasPorTurnoVO> getCajasTurno() {
		return cajasTurno;
	}

	/**
	 * @param cajasTurno the cajasTurno to set
	 */
	public void setCajasTurno(List<CajasPorTurnoVO> cajasTurno) {
		this.cajasTurno = cajasTurno;
	}

	/**
	 * @return the quitar
	 */
	public boolean isQuitar() {
		return quitar;
	}

	/**
	 * @param quitar the quitar to set
	 */
	public void setQuitar(boolean quitar) {
		this.quitar = quitar;
	}

	/**
	 * @return the seleccion
	 */
	public String getSeleccion() {
		return seleccion;
	}

	/**
	 * @param seleccion the seleccion to set
	 */
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
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

}
