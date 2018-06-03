/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Plaza;
import mx.com.bcm.banamex.ae.persistencia.vo.PlazaVO;


/**
 * 
 *@author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 */
public class PlazaAssambler {
	
	
	public static PlazaVO getPlazaVO(Plaza plaza){
		PlazaVO plazaVO =new PlazaVO();
		plazaVO.setPlazaIdn(plaza.getPlazaIdn());
		plazaVO.setPlazaNombre(plaza.getPlazaNombre());
		plazaVO.setBajaLogica(plaza.getPlazaBajaLogica());
				return plazaVO;
	
	}
	
	public static Plaza getPlaza(PlazaVO plazaVO){
		Plaza plaza =new Plaza();
		plaza.setPlazaIdn(plazaVO.getPlazaIdn());
		plaza.setPlazaNombre(plazaVO.getPlazaNombre());
		plaza.setPlazaBajaLogica(plazaVO.getBajaLogica());
		return plaza;
	
	}

}
