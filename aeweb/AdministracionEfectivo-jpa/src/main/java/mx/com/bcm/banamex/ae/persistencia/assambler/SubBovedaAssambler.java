/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;


/**
 * @author atinajero ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 * 
 */
public class SubBovedaAssambler {

	/**
	 * @param atmVO
	 * @return
	 */

	public static SubBovedaVO getSubBovedaVO(SubBoveda subBovedas) {
		SubBovedaVO subBovedaVO = new SubBovedaVO();

		subBovedaVO.setIdnSubBoveda(subBovedas.getSubBovedaPK().getSubbovedaIdn());
		subBovedaVO.setSubBovedaDescripcion(subBovedas
				.getSubbovedaDescripcion());
		subBovedaVO.setSubBovedaCalleNum(subBovedas.getSubbovedaCalleNum());
		subBovedaVO.setSubBovedaColonia(subBovedas.getSubbovedaColonia());
		subBovedaVO.setSubBovedaPoblacion(subBovedas.getSubbovedaPoblacion());
		subBovedaVO.setSubBovedaCp(subBovedas.getSubbovedaCp());
		subBovedaVO.setSubBovedaEdo(subBovedas.getSubbovedaEdo());
		subBovedaVO.setNombrePlaza(subBovedas.getPlazaIdn().getPlazaNombre());
		subBovedaVO.setPlazaIdn(subBovedas.getPlazaIdn().getPlazaIdn());
		subBovedaVO.setSirhIdn(subBovedas.getCpae().getCpaesEstructuraSirhIdn());

		return subBovedaVO;

	}

	/**
	 * @param cpaeVO
	 * @return
	 */
	public static SubBoveda getSubBovedas(SubBovedaVO subBovedaVO) {

		SubBoveda subBovedas = new SubBoveda();

		subBovedas.getSubBovedaPK().setSubbovedaIdn(subBovedaVO.getIdnSubBoveda());
		subBovedas.setSubbovedaDescripcion(subBovedaVO
				.getSubBovedaDescripcion());
		subBovedas.setSubbovedaCalleNum(subBovedaVO.getSubBovedaCalleNum());
		subBovedas.setSubbovedaColonia(subBovedaVO.getSubBovedaColonia());
		subBovedas.setSubbovedaPoblacion(subBovedaVO.getSubBovedaPoblacion());
		subBovedas.setSubbovedaCp(subBovedaVO.getSubBovedaCp());
		subBovedas.setSubbovedaEdo(subBovedaVO.getSubBovedaEdo());

		return subBovedas;
	}

}
