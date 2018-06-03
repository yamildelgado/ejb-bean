/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.DetalleDotacionVO;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleDotacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;

/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class DetalleDotacionAssambler {

	
	public static DetalleDotacionVO getDetalleDotaciondivisaVO(DenominacionDeDivisa Dendivisa){
		DetalleDotacionVO detalleDotaciondivisaVO=new DetalleDotacionVO();
		
		detalleDotaciondivisaVO.setDivisaId(Dendivisa.getDenominacionDeDivisaPK().getDivisaId());
		detalleDotaciondivisaVO.setDenomTipoBillMon(Dendivisa.getDenominacionDeDivisaPK().getDenomTipoBillMon());
		detalleDotaciondivisaVO.setDenomDenominacion(Dendivisa.getDenominacionDeDivisaPK().getDenomDenominacion());
		
		return detalleDotaciondivisaVO;
	
	
	}
	
	public static DetalleDotacionVO getDetalleDotacionVO(DetalleDotacionVO detalle){
		DetalleDotacionVO detalleDotacionVO= new DetalleDotacionVO();
		
		detalleDotacionVO.setSolicitudIdn(detalle.getSolicitudIdn());
		detalleDotacionVO.setDetlldenomIdn(detalle.getDetlldenomIdn());
		
		return detalleDotacionVO;
	}
	
	public static DetalleDotacion getDetalleDotacion(DetalleDotacion importe){
		
		DetalleDotacion detalleDotacion= new DetalleDotacion();
		
		detalleDotacion.setCantidad(importe.getCantidad());
		
		return detalleDotacion;
	}
	
}
