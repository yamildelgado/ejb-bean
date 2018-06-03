/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import java.util.Date;

import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.helper.HourFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacionPK;
import mx.com.bcm.banamex.ae.persistencia.vo.HistTurnoEnOperacionVO;


/**
 * @author ING. SIST. COMP. OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public class HistTurnoEnOperacionAssambler {
	
	
	
	
	public static HistTurnoEnOperacionVO getHistTurnoEnOperacionVO(HistTurnoEnOperacion histTurnoEnOperacion){
		
		HistTurnoEnOperacionVO histTurnoEnOperacionVO = new HistTurnoEnOperacionVO();
		
		histTurnoEnOperacionVO.setFeccontIdn(DateFormateHelper.getFecha( histTurnoEnOperacion.getFeccontIdn().getFeccontIdn() ));
		histTurnoEnOperacionVO.setHistCambioFecCont(histTurnoEnOperacion.getHistCambioFecCont());
		histTurnoEnOperacionVO.setHistFecContInicial(DateFormateHelper.getFecha(histTurnoEnOperacion.getHistFecContInicial() ));
		histTurnoEnOperacionVO.setHistFecHorFin( DateFormateHelper.getFechaHora(histTurnoEnOperacion.getHistFecHorFin()));			
		histTurnoEnOperacionVO.setHistFecHorIni(DateFormateHelper.getFechaHora(histTurnoEnOperacion.getHistTurnoEnOperacionPK().getHistFecHorIni()));
		histTurnoEnOperacionVO.setHistNominaIniciaTurno(histTurnoEnOperacionVO.getHistNominaIniciaTurno());
		histTurnoEnOperacionVO.setHistNominaTerminaTurno(histTurnoEnOperacion.getHistNominaTerminaTurno());
		histTurnoEnOperacionVO.setHistStatus((histTurnoEnOperacion.getHistStatus().equals("01")) ? UtileriaHelper.CSTATUSOPEN: UtileriaHelper.CSTATUSCLOSE);
		histTurnoEnOperacionVO.setTurnoId(histTurnoEnOperacion.getHistTurnoEnOperacionPK().getTurnoId());
		
		return histTurnoEnOperacionVO;
	}
	
	
public static HistTurnoEnOperacion getHistTurnoEnOperacion(HistTurnoEnOperacionVO histTurnoEnOperacionVO){
		
		HistTurnoEnOperacion histTurnoEnOperacion = new HistTurnoEnOperacion();
				
		histTurnoEnOperacion.setHistCambioFecCont(histTurnoEnOperacionVO.getHistCambioFecCont());	
		
		HistTurnoEnOperacionPK histTurnoEnOperacionPK = new HistTurnoEnOperacionPK();
		
		histTurnoEnOperacionPK.setHistFecHorIni(DateFormateHelper.getFechaHoraDate(histTurnoEnOperacionVO.getHistFecHorIni()));
		
		histTurnoEnOperacionPK.setTurnoId(histTurnoEnOperacionVO.getTurnoId());
		histTurnoEnOperacion.setHistTurnoEnOperacionPK(histTurnoEnOperacionPK);
		
		histTurnoEnOperacion.setHistFecContInicial(DateFormateHelper.getFechaDate(histTurnoEnOperacionVO.getHistFecContInicial() ));
		histTurnoEnOperacion.setHistFecHorFin(DateFormateHelper.getFechaHoraDate(histTurnoEnOperacionVO.getHistFecHorFin()));
		
		
		
		
		histTurnoEnOperacion.setHistNominaIniciaTurno(histTurnoEnOperacionVO.getHistNominaIniciaTurno());
		histTurnoEnOperacion.setHistNominaTerminaTurno(histTurnoEnOperacionVO.getHistNominaTerminaTurno());
		histTurnoEnOperacion.setHistStatus((histTurnoEnOperacionVO.getHistStatus().equals(UtileriaHelper.CSTATUSOPEN)) ? UtileriaHelper.ABIERTA: UtileriaHelper.CERRADA);
		
		return histTurnoEnOperacion;
		
	}
	
	
	
	
	
	

}
