/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CriteriaCuentaVO {

	 
	    private Integer cpaesEstructuraSirhIdn;
	    
	    private String cntrtoNum;
	   
	    private Short unegId;
	   
	    private Short ctaSucursalId;
	    
	    private Long ctaCuenta;

		
		/**
		 * @return the cpaesEstructuraSirhIdn
		 */
		public Integer getCpaesEstructuraSirhIdn() {
			return cpaesEstructuraSirhIdn;
		}


		/**
		 * @param cpaesEstructuraSirhIdn the cpaesEstructuraSirhIdn to set
		 */
		public void setCpaesEstructuraSirhIdn(Integer cpaesEstructuraSirhIdn) {
			this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
		}


		/**
		 * @return the cntrtoNum
		 */
		public String getCntrtoNum() {
			return cntrtoNum;
		}


		/**
		 * @param cntrtoNum the cntrtoNum to set
		 */
		public void setCntrtoNum(String cntrtoNum) {
			this.cntrtoNum = cntrtoNum;
		}


		/**
		 * @return the unegId
		 */
		public Short getUnegId() {
			return unegId;
		}


		/**
		 * @param unegId the unegId to set
		 */
		public void setUnegId(Short unegId) {
			this.unegId = unegId;
		}


		/**
		 * @return the ctaSucursalId
		 */
		public Short getCtaSucursalId() {
			return ctaSucursalId;
		}


		/**
		 * @param ctaSucursalId the ctaSucursalId to set
		 */
		public void setCtaSucursalId(Short ctaSucursalId) {
			this.ctaSucursalId = ctaSucursalId;
		}


		/**
		 * @return the ctaCuenta
		 */
		public Long getCtaCuenta() {
			return ctaCuenta;
		}


		/**
		 * @param ctaCuenta the ctaCuenta to set
		 */
		public void setCtaCuenta(Long ctaCuenta) {
			this.ctaCuenta = ctaCuenta;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "CriteriaCuentaVO [cuentasPK.cpaesEstructuraSirhIdn="
					+ cpaesEstructuraSirhIdn + ", cuentasPK.cntrtoNum='" + cntrtoNum
					+ "', cuentasPK.unegId=" + unegId + ", cuentasPK.ctaSucursalId=" + ctaSucursalId
					+ ", cuentasPK.ctaCuenta=" + ctaCuenta + "]";
		}
	    
	    
	    

}
