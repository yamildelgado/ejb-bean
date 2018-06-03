/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.io.Serializable;

import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
	
public class TipoMovimientoVO  {
	private static final long serialVersionUID = 1L;
	   private Short tipomovIdn;
	    private String tipomovDescripcion;
		/**
		 * @return the tipomovIdn
		 */
		public Short getTipomovIdn() {
			return tipomovIdn;
		}
		/**
		 * @param tipomovIdn the tipomovIdn to set
		 */
		public void setTipomovIdn(Short tipomovIdn) {
			this.tipomovIdn = tipomovIdn;
		}
		/**
		 * @return the tipomovDescripcion
		 */
		public String getTipomovDescripcion() {
			return tipomovDescripcion;
		}
		/**
		 * @param tipomovDescripcion the tipomovDescripcion to set
		 */
		public void setTipomovDescripcion(String tipomovDescripcion) {
			this.tipomovDescripcion = tipomovDescripcion;
		}
}
