/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.ModulosSistemaAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class ModuloSistemaAssambler {
	public static  ModuloSistemaVO getModuloSistemaVO (ModulosSistemaAeweb moduloSistema){

		ModuloSistemaVO moduloSistemaVO = new ModuloSistemaVO();
		
		moduloSistemaVO.setModsisBajaLogica(moduloSistema.getModsisBajaLogica());
		moduloSistemaVO.setModsisDescripcionMod(moduloSistema.getModsisDescripcionMod());
		//moduloSistemaVO.setModsisNivId(moduloSistema.getModsisNivId());
		moduloSistemaVO.setModsisStatus(moduloSistema.getModsisStatus());
	
		
		return moduloSistemaVO;
	}
}
