/** 
 * Todos los Derechos Reservados 2013 BCM.
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
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */ 
public class CriteriaUnidadNegocioVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Short sh;
	private String unegNombre; 
	private String cntrtoNum;
	private Short unegId;
    private Integer cpaesEstructuraSirhIdn;

	
	
	/**
	 * @return the cpaesEstructuraSirhIdn
	 */
	public int getCpaesEstructuraSirhIdn() {
		return cpaesEstructuraSirhIdn;
	}




	/**
	 * @param cpaesEstructuraSirhIdn the cpaesEstructuraSirhIdn to set
	 */
	public void setCpaesEstructuraSirhIdn(int cpaesEstructuraSirhIdn) {
		this.cpaesEstructuraSirhIdn = cpaesEstructuraSirhIdn;
	}




	/**
	 * @return the unegNombre
	 */
	public String getUnegNombre() {
		return unegNombre;
	}




	/**
	 * @param unegNombre the unegNombre to set
	 */
	public void setUnegNombre(String unegNombre) {
		this.unegNombre = unegNombre;
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
	 * 
	 */
	public CriteriaUnidadNegocioVO() {
		super();
	}
	
	
	
	










	/**
	 * @return the sh
	 */
	public Short getSh() {
		return sh;
	}


	
	


	/**
	 * @param sh the sh to set
	 */
	public void setSh(Short sh) {
		this.sh = sh;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CriteriaUnidadNegocioVO [sh=" + sh + ", unegNombre="
				+ unegNombre + ", unidadDeNegocioPK.cntrtoNum=" + cntrtoNum + ", unidadDeNegocioPK.unegId="
				+ unegId + ", unidadDeNegocioPK.cpaesEstructuraSirhIdn=" + cpaesEstructuraSirhIdn
				+ "]";
	}




	
	
	
	

}
