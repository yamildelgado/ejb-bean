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

/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class EstructuraVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 private Integer estructraSirhIdn;
	    private Short estructraRpta;
	    private String estructraTipoSirh;
	    private String estructraNombreCorto;
	    private String estructraNombreLargo;
	    private String estructraCalleNum;
	    private String estructraColonia;
	    private String estructraPoblacion;
	    private String estructraCp;
	    private String estructraLada;
	    private String estructraTelefono;
	    private String estructraEdo;
	    private String estructraBajaLogica;


	
	/**
		 * @return the estructraSirhIdn
		 */
		public Integer getEstructraSirhIdn() {
			return estructraSirhIdn;
		}



		/**
		 * @param estructraSirhIdn the estructraSirhIdn to set
		 */
		public void setEstructraSirhIdn(Integer estructraSirhIdn) {
			this.estructraSirhIdn = estructraSirhIdn;
		}



		/**
		 * @return the estructraRpta
		 */
		public Short getEstructraRpta() {
			return estructraRpta;
		}



		/**
		 * @param estructraRpta the estructraRpta to set
		 */
		public void setEstructraRpta(Short estructraRpta) {
			this.estructraRpta = estructraRpta;
		}



		/**
		 * @return the estructraTipoSirh
		 */
		public String getEstructraTipoSirh() {
			return estructraTipoSirh;
		}



		/**
		 * @param estructraTipoSirh the estructraTipoSirh to set
		 */
		public void setEstructraTipoSirh(String estructraTipoSirh) {
			this.estructraTipoSirh = estructraTipoSirh;
		}



		/**
		 * @return the estructraNombreCorto
		 */
		public String getEstructraNombreCorto() {
			return estructraNombreCorto;
		}



		/**
		 * @param estructraNombreCorto the estructraNombreCorto to set
		 */
		public void setEstructraNombreCorto(String estructraNombreCorto) {
			this.estructraNombreCorto = estructraNombreCorto;
		}



		/**
		 * @return the estructraNombreLargo
		 */
		public String getEstructraNombreLargo() {
			return estructraNombreLargo;
		}



		/**
		 * @param estructraNombreLargo the estructraNombreLargo to set
		 */
		public void setEstructraNombreLargo(String estructraNombreLargo) {
			this.estructraNombreLargo = estructraNombreLargo;
		}



		/**
		 * @return the estructraCalleNum
		 */
		public String getEstructraCalleNum() {
			return estructraCalleNum;
		}



		/**
		 * @param estructraCalleNum the estructraCalleNum to set
		 */
		public void setEstructraCalleNum(String estructraCalleNum) {
			this.estructraCalleNum = estructraCalleNum;
		}



		/**
		 * @return the estructraColonia
		 */
		public String getEstructraColonia() {
			return estructraColonia;
		}



		/**
		 * @param estructraColonia the estructraColonia to set
		 */
		public void setEstructraColonia(String estructraColonia) {
			this.estructraColonia = estructraColonia;
		}



		/**
		 * @return the estructraPoblacion
		 */
		public String getEstructraPoblacion() {
			return estructraPoblacion;
		}



		/**
		 * @param estructraPoblacion the estructraPoblacion to set
		 */
		public void setEstructraPoblacion(String estructraPoblacion) {
			this.estructraPoblacion = estructraPoblacion;
		}



		/**
		 * @return the estructraCp
		 */
		public String getEstructraCp() {
			return estructraCp;
		}



		/**
		 * @param estructraCp the estructraCp to set
		 */
		public void setEstructraCp(String estructraCp) {
			this.estructraCp = estructraCp;
		}



		/**
		 * @return the estructraLada
		 */
		public String getEstructraLada() {
			return estructraLada;
		}



		/**
		 * @param estructraLada the estructraLada to set
		 */
		public void setEstructraLada(String estructraLada) {
			this.estructraLada = estructraLada;
		}



		/**
		 * @return the estructraTelefono
		 */
		public String getEstructraTelefono() {
			return estructraTelefono;
		}



		/**
		 * @param estructraTelefono the estructraTelefono to set
		 */
		public void setEstructraTelefono(String estructraTelefono) {
			this.estructraTelefono = estructraTelefono;
		}



		/**
		 * @return the estructraEdo
		 */
		public String getEstructraEdo() {
			return estructraEdo;
		}



		/**
		 * @param estructraEdo the estructraEdo to set
		 */
		public void setEstructraEdo(String estructraEdo) {
			this.estructraEdo = estructraEdo;
		}



		/**
		 * @return the estructraBajaLogica
		 */
		public String getEstructraBajaLogica() {
			return estructraBajaLogica;
		}



		/**
		 * @param estructraBajaLogica the estructraBajaLogica to set
		 */
		public void setEstructraBajaLogica(String estructraBajaLogica) {
			this.estructraBajaLogica = estructraBajaLogica;
		}



	@Override
	public String toString() {
		return "EstructuraVO [estructraSirhIdn=" + estructraSirhIdn 
				+ ", estructraRpta="+ estructraRpta 
				+ ", estructraTipoSirh=\'" + estructraTipoSirh
				+ "\', estructraNombreCorto=\'" + estructraNombreCorto
				+ "\', estructraNombreLargo=\'" + estructraNombreLargo
				+ "\', estructraCalleNum=\'" + estructraCalleNum
				+ "\', estructraColonia=\'" + estructraColonia
				+ "\', estructraPoblacion=\'" + estructraPoblacion
				+ "\', estructraCp=\'" + estructraCp 
				+ "\', estructraLada=\'"+ estructraLada 
				+ "\', estructraTelefono=\'" + estructraTelefono
				+ "\', estructraEdo=\'" + estructraEdo 
				+ "\', estructraBajaLogica="
				+ estructraBajaLogica + "]";
	}
    
}
