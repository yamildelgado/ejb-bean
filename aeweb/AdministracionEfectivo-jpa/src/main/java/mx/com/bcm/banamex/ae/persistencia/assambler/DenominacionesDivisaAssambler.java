/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.vo.DenominacionesDivisaVO;


/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public class DenominacionesDivisaAssambler {

	public static DenominacionesDivisaVO getDenominacionesVO(DenominacionDeDivisa denominacionesDivisas){
	
	  
		    DenominacionesDivisaVO denominacionesDivisasVO = new DenominacionesDivisaVO();
		    
		    
		    denominacionesDivisasVO.setDivisaId(denominacionesDivisas.getDenominacionDeDivisaPK().getDivisaId());
		    denominacionesDivisasVO.setDenomTipoBillMon(denominacionesDivisas.getDenominacionDeDivisaPK().getDenomTipoBillMon());		    
		    denominacionesDivisasVO.setDenomNombreDenominacion(denominacionesDivisas.getDenomNombreDenominacion());
		    denominacionesDivisasVO.setDenomCirculacion(denominacionesDivisas.getDenomCirculacion());
		    denominacionesDivisasVO.setDenomBajaLogica(denominacionesDivisas.getDenomBajaLogica());
		    
		   
		
		
		return denominacionesDivisasVO;	
	} 
	
	
	
	
}
