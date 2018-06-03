/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;
import java.util.Date;




/**
 * @author ING. SIST. COMP. OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public class HistTurnoEnOperacionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	   
	   /*
	    * HistTurnoEnOperacionPK
	    */
	   
	    private String turnoId;	   
	    private String histFecHorIni;
	    private String DescripcionTurno;
	    //
	    private String feccontIdn;
	   
	    private String histFecContInicial;
	    
	    private String histFecHorFin;
	   
	    private String histCambioFecCont;
	   
	    private String histStatus;
	    
	    private Integer histNominaIniciaTurno;
	    
	    private Integer histNominaTerminaTurno;

		/**
		 * @return the histFecContInicial
		 */
		public String getHistFecContInicial() {
			return histFecContInicial;
		}

		/**
		 * @param histFecContInicial the histFecContInicial to set
		 */
		public void setHistFecContInicial(String histFecContInicial) {
			this.histFecContInicial = histFecContInicial;
		}

		/**
		 * @return the histFecHorFin
		 */
		public String getHistFecHorFin() {
			return histFecHorFin;
		}

		/**
		 * @param histFecHorFin the histFecHorFin to set
		 */
		public void setHistFecHorFin(String histFecHorFin) {
			this.histFecHorFin = histFecHorFin;
		}

		/**
		 * @return the histCambioFecCont
		 */
		public String getHistCambioFecCont() {
			return histCambioFecCont;
		}

		/**
		 * @param histCambioFecCont the histCambioFecCont to set
		 */
		public void setHistCambioFecCont(String histCambioFecCont) {
			this.histCambioFecCont = histCambioFecCont;
		}

		/**
		 * @return the histStatus
		 */
		public String getHistStatus() {
			return histStatus;
		}

		/**
		 * @param histStatus the histStatus to set
		 */
		public void setHistStatus(String histStatus) {
			this.histStatus = histStatus;
		}

		/**
		 * @return the histNominaIniciaTurno
		 */
		public Integer getHistNominaIniciaTurno() {
			return histNominaIniciaTurno;
		}

		/**
		 * @param histNominaIniciaTurno the histNominaIniciaTurno to set
		 */
		public void setHistNominaIniciaTurno(Integer histNominaIniciaTurno) {
			this.histNominaIniciaTurno = histNominaIniciaTurno;
		}

		/**
		 * @return the histNominaTerminaTurno
		 */
		public Integer getHistNominaTerminaTurno() {
			return histNominaTerminaTurno;
		}

		/**
		 * @param histNominaTerminaTurno the histNominaTerminaTurno to set
		 */
		public void setHistNominaTerminaTurno(Integer histNominaTerminaTurno) {
			this.histNominaTerminaTurno = histNominaTerminaTurno;
		}

		/**
		 * @return the turnoId
		 */
		public String getTurnoId() {
			return turnoId;
		}

		/**
		 * @param turnoId the turnoId to set
		 */
		public void setTurnoId(String turnoId) {
			this.turnoId = turnoId;
		}

		/**
		 * @return the histFecHorIni
		 */
		public String getHistFecHorIni() {
			return histFecHorIni;
		}

		/**
		 * @param histFecHorIni the histFecHorIni to set
		 */
		public void setHistFecHorIni(String histFecHorIni) {
			this.histFecHorIni = histFecHorIni;
		}

		/**
		 * @return the feccontIdn
		 */
		public String getFeccontIdn() {
			return feccontIdn;
		}

		/**
		 * @param feccontIdn the feccontIdn to set
		 */
		public void setFeccontIdn(String feccontIdn) {
			this.feccontIdn = feccontIdn;
		}

		/**
		 * @return the descripcionTurno
		 */
		public String getDescripcionTurno() {
			return DescripcionTurno;
		}

		/**
		 * @param descripcionTurno the descripcionTurno to set
		 */
		public void setDescripcionTurno(String descripcionTurno) {
			DescripcionTurno = descripcionTurno;
		}
	    
	   
	    
	   
	

}
