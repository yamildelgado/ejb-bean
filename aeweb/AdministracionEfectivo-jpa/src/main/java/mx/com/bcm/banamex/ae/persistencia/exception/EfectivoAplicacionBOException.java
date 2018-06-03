/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.exception;

import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class EfectivoAplicacionBOException extends EfectivoAplicacionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public EfectivoAplicacionBOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public EfectivoAplicacionBOException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public EfectivoAplicacionBOException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param arg0
	 */
	public EfectivoAplicacionBOException(MensajeAewebVO mensaje) {
		super(mensaje.getMensajeDescripcion());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public EfectivoAplicacionBOException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
