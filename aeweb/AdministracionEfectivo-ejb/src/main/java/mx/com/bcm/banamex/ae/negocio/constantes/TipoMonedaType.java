package mx.com.bcm.banamex.ae.negocio.constantes;

public enum TipoMonedaType {
	BCA("BCA"),MCA("MCA");
	private String value;
	
	   private TipoMonedaType(String value) {
		this.value=value;
	   }

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
