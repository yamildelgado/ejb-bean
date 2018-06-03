/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDotacion;
import mx.com.bcm.banamex.ae.persistencia.vo.MonedaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.BilleteVO;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public class MonedaAssambler {

	public static MonedaVO getMonedaVO(DenominacionDeDivisa denominacionDivisa) {
		MonedaVO monedaVO = new MonedaVO();

		monedaVO.setNombre(denominacionDivisa.getDenomNombreDenominacion());
		monedaVO.setCantidad(denominacionDivisa.getDenominacionDeDivisaPK()
				.getDenomDenominacion());

		return monedaVO;

	}

	public static BilleteVO getBilleteVO(DenominacionDeDivisa denominacionDivisa) {
		BilleteVO billeteVO = new BilleteVO();

		billeteVO.setNombre(denominacionDivisa.getDenomNombreDenominacion());
		billeteVO.setCantidad(denominacionDivisa.getDenominacionDeDivisaPK().getDenomDenominacion());

		return billeteVO;
	}

}