/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.AgrupadorAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.AgrupadorAewebVO;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class AgrupadorAewebAssambler {
	/**
	 * @param    agrupadorAeweb
	 * @return
	 */
	public static AgrupadorAewebVO getAgrupadorAewebVO(AgrupadorAeweb agrupadorAeweb){
	AgrupadorAewebVO agrupadorAewebVO = new AgrupadorAewebVO();
	
	agrupadorAewebVO.setAgrupadorDescripcion(agrupadorAeweb.getAgrupadorDescripcion());
	agrupadorAewebVO.setAgrupadorIdn(agrupadorAeweb.getAgrupadorIdn());
	
	return agrupadorAewebVO;
	}
	/**
	 * @param agrupadorAewebVO
	 * @return
	 */
	public static  AgrupadorAeweb getAgrupadorAeweb(AgrupadorAewebVO  agrupadorAewebVO){
		AgrupadorAeweb agrupadorAeweb = new AgrupadorAeweb();
		
		agrupadorAeweb.setAgrupadorDescripcion(agrupadorAewebVO.getAgrupadorDescripcion());
		agrupadorAeweb.setAgrupadorIdn(agrupadorAewebVO.getAgrupadorIdn());
		
		return agrupadorAeweb;
	}
}
