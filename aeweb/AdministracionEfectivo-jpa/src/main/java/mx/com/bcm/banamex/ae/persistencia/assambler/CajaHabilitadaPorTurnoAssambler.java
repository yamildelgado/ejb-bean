/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurno;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajaHabilitadaPorTurnoPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaHabilitadaPorTurnoVO;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CajaHabilitadaPorTurnoAssambler {
	
	
	public static CajaHabilitadaPorTurnoVO getCajaHabilitadaPorTurnoVO(CajaHabilitadaPorTurno cajaHabilitadaPorTurno){
		CajaHabilitadaPorTurnoVO cajaHabilitadaPorTurnoVO = new CajaHabilitadaPorTurnoVO(); 
		
		cajaHabilitadaPorTurnoVO.setCajahabCompbtesPendientes(cajaHabilitadaPorTurno.getCajahabCompbtesPendientes());
		cajaHabilitadaPorTurnoVO.setCajahabFecHrDeshabilitada(DateFormateHelper.getFechaHora(cajaHabilitadaPorTurno.getCajahabFecHrDeshabilitada()));
		
		cajaHabilitadaPorTurnoVO.setCajahabFecHrHabilita(DateFormateHelper.getFechaHora(cajaHabilitadaPorTurno.getCajaHabilitadaPorTurnoPK().getCajahabFecHrHabilita()));
		cajaHabilitadaPorTurnoVO.setCajaIdn(cajaHabilitadaPorTurno.getCajaHabilitadaPorTurnoPK().getCajaIdn());
		
		
		
		return cajaHabilitadaPorTurnoVO;
	}
	
	public static CajaHabilitadaPorTurno getCajaHabilitadaPorTurno(CajaHabilitadaPorTurnoVO cajaHabilitadaPorTurnoVO){
		CajaHabilitadaPorTurno cajaHabilitadaPorTurno = new CajaHabilitadaPorTurno(); 
		CajaHabilitadaPorTurnoPK  cajaHabilitadaPorTurnoPK = new CajaHabilitadaPorTurnoPK();
		
		cajaHabilitadaPorTurno.setCajahabCompbtesPendientes(cajaHabilitadaPorTurnoVO.getCajahabCompbtesPendientes());
		cajaHabilitadaPorTurno.setCajahabFecHrDeshabilitada(DateFormateHelper.getFechaHoraDate(cajaHabilitadaPorTurnoVO.getCajahabFecHrDeshabilitada()));
		
		cajaHabilitadaPorTurnoPK.setCajahabFecHrHabilita(DateFormateHelper.getFechaHoraDate(cajaHabilitadaPorTurnoVO.getCajahabFecHrHabilita()));
		cajaHabilitadaPorTurnoPK.setCajaIdn(cajaHabilitadaPorTurnoVO.getCajaIdn());
		
		
		
		return cajaHabilitadaPorTurno;
	}

}
