/** 
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;




/**
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 *
 */
public class MensajeAssambler {
	
	/**
	 * Metodo que permite asamblar correctamente los elementos necesarios para
	 * mostrar un mensaje de error o de informacion del sistema
	 * 
	 * @param CatMensajesAeweb
	 * @return
	 */
	public static MensajeAewebVO getMensajeVO(CatMensajesAeweb CatMensajesAeweb){
		MensajeAewebVO mensajeAewebVO=new MensajeAewebVO();
		mensajeAewebVO.setMensajeCodigo(CatMensajesAeweb.getMensajeCodigo());
		mensajeAewebVO.setMensajeNombre(CatMensajesAeweb.getMensajeNombre());
		mensajeAewebVO.setMensajeDescripcion(CatMensajesAeweb.getMensajeDescripcion());
		return mensajeAewebVO;
		
	}

}
