/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.constantes;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public enum NumeroFormatoType {
    FORMATO_ENTERO("%02d");
     
    private NumeroFormatoType(String formato){
    	this.formato=formato;
    }
    private String formato;
	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}
	/**
	 * @param formato the formato to set
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
    
}
