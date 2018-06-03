/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeOperacion;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoOperacionesProcesadoraVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class TiposDeOperacionAssambler {
	/**
	 * @param tipoOperacion
	 * @return tipoOperacionVO
	 */
	public static TipoOperacionesProcesadoraVO getTipoOperacionVO(TipoDeOperacion tipoOperacion){
		TipoOperacionesProcesadoraVO tipoOperacionVO= new TipoOperacionesProcesadoraVO();
		tipoOperacionVO.setTipoOperacion(tipoOperacion.getTipoDeOperacionPK().getTipoperIdn());
		tipoOperacionVO.setNombreOperacion(tipoOperacion.getTipoperDescrip());
		return tipoOperacionVO;
	}

}
