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

/**
 * @author OCE-WCD JESUS CARBAJAL MONTES
 *
 */
public class BancoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short bancoIdn;
	private String bancoAbrev;
	private String bancoDescripcionLarga;
	private String bancoDescripcionCorta;
	private String bancoDesPantalla;
	private String bancoBajaLogica;
	/**
	 * @return the bancoAbrev
	 */
	public String getBancoAbrev() {
		return bancoAbrev;
	}
	/**
	 * @param bancoAbrev the bancoAbrev to set
	 */
	public void setBancoAbrev(String bancoAbrev) {
		this.bancoAbrev = bancoAbrev;
	}
	/**
	 * @return the bancoDescripcionLarga
	 */
	public String getBancoDescripcionLarga() {
		return bancoDescripcionLarga;
	}
	/**
	 * @param bancoDescripcionLarga the bancoDescripcionLarga to set
	 */
	public void setBancoDescripcionLarga(String bancoDescripcionLarga) {
		this.bancoDescripcionLarga = bancoDescripcionLarga;
	}
	/**
	 * @return the bancoDescripcionCorta
	 */
	public String getBancoDescripcionCorta() {
		return bancoDescripcionCorta;
	}
	/**
	 * @param bancoDescripcionCorta the bancoDescripcionCorta to set
	 */
	public void setBancoDescripcionCorta(String bancoDescripcionCorta) {
		this.bancoDescripcionCorta = bancoDescripcionCorta;
	}
	/**
	 * @return the bancoDesPantalla
	 */
	public String getBancoDesPantalla() {
		return bancoDesPantalla;
	}
	/**
	 * @param bancoDesPantalla the bancoDesPantalla to set
	 */
	public void setBancoDesPantalla(String bancoDesPantalla) {
		this.bancoDesPantalla = bancoDesPantalla;
	}
	/**
	 * @return the bancoBajaLogica
	 */
	public String getBancoBajaLogica() {
		return bancoBajaLogica;
	}
	/**
	 * @param bancoBajaLogica the bancoBajaLogica to set
	 */
	public void setBancoBajaLogica(String bancoBajaLogica) {
		this.bancoBajaLogica = bancoBajaLogica;
	}
	/**
	 * @return the banciIdn
	 */
	public Short getBancoIdn() {
		return bancoIdn;
	}
	/**
	 * @param banciIdn the banciIdn to set
	 */
	public void setBancoIdn(Short bancoIdn) {
		this.bancoIdn = bancoIdn;
	}
	
}
