/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;


/**
 * @author JESÚS AGUILAR LÓPEZ 
 * 
 */


	public class TurnoVO extends ReporteAbstract implements Serializable{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String turnoId;
		private String turDescripcion; 
		private String turHoraInicio;
		private String turHoraFin;
		private String turStatus;
		private String turBajaLogica; 
		private String subvobeda; 
		private boolean seleccionar;
	
		/**
		 * @return the turDescripcion
		 */
		public String getTurDescripcion() {
			return turDescripcion;
		}
		/**
		 * @param turDescripcion the turDescripcion to set
		 */
		public void setTurDescripcion(String turDescripcion) {
			this.turDescripcion = turDescripcion;
		}
		

		/**
		 * @return the turStatus
		 */
		public String getTurStatus() {
			return turStatus;
		}
		/**
		 * @param turStatus the turStatus to set
		 */
		public void setTurStatus(String turStatus) {
			this.turStatus = turStatus;
		}
		public String getTurHoraInicio() {
			return turHoraInicio;
		}
		public void setTurHoraInicio(String turHoraInicio) {
			this.turHoraInicio = turHoraInicio;
		}
		public String getTurHoraFin() {
			return turHoraFin;
		}
		public void setTurHoraFin(String turHoraFin) {
			this.turHoraFin = turHoraFin;
		}
		public String getTurBajaLogica() {
			return turBajaLogica;
		}
		public void setTurBajaLogica(String turBajaLogica) {
			this.turBajaLogica = turBajaLogica;
		}
	
		
		public String getTurnoId() {
			return turnoId;
		}
		public void setTurnoId(String turnoId) {
			this.turnoId = turnoId;
		}
		public String getSubvobeda() {
			return subvobeda;
		}
		public void setSubvobeda(String subvobeda) {
			this.subvobeda = subvobeda;
		}
		/**
		 * @return the seleccionar
		 */
		public boolean isSeleccionar() {
			return seleccionar;
		}
		/**
		 * @param seleccionar the seleccionar to set
		 */
		public void setSeleccionar(boolean seleccionar) {
			this.seleccionar = seleccionar;
		}
	
		
		
		
		
	}