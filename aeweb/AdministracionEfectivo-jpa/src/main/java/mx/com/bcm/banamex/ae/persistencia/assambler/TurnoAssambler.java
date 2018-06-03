/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;


import static mx.com.bcm.banamex.ae.persistencia.helper.HourFormateHelper.getHora;
import static mx.com.bcm.banamex.ae.persistencia.helper.HourFormateHelper.getStringHora;

/**
 * @author JESÚS AGUILAR LOPEZ 
 *
 */
public class TurnoAssambler {
	private static final String NA = "NA";
	/**
	 * @param turnos
	 * @return
	 */
	public static TurnoVO getTurnoVO(Turno turnos){
		TurnoVO turnoVO=new TurnoVO();
	
		turnoVO.setTurnoId(turnos.getTurnoId());
		turnoVO.setTurDescripcion(turnos.getTurnoDescrip());
		turnoVO.setTurHoraInicio(turnos.getTurnoHorIni()==null?NA:getHora(turnos.getTurnoHorIni()));
	    turnoVO.setTurHoraFin(turnos.getTurnoHorFin()==null?NA:getHora(turnos.getTurnoHorFin()));
	    
	    
	    turnoVO.setTurStatus((turnos.getTurnoStatus().equals("01"))?UtileriaHelper.CSTATUSOPEN:UtileriaHelper.CSTATUSCLOSE);
	     turnoVO.setTurBajaLogica(turnos.getTurnoBajaLogica());
	 
	    
	   
	    
		return turnoVO;
		
	}
	
	/**
	 * @param turnos
	 * @return
	 */
	public static TurnoVO getTurnoIniFinTurnoVO(Turno turnos){
		TurnoVO turnoVO=new TurnoVO();
	
		turnoVO.setTurnoId(turnos.getTurnoId());
		turnoVO.setTurDescripcion(turnos.getTurnoDescrip());
		turnoVO.setTurHoraInicio(turnos.getTurnoHorIni()==null?NA:getHora(turnos.getTurnoHorIni()));
	    turnoVO.setTurHoraFin(turnos.getTurnoHorFin()==null?NA:getHora(turnos.getTurnoHorFin()));
	    
	    
	    turnoVO.setTurStatus((turnos.getTurnoStatus().equals("01"))?UtileriaHelper.CSTATUSOPEN:UtileriaHelper.CSTATUSCLOSE);
	     turnoVO.setTurBajaLogica(turnos.getTurnoBajaLogica());
	     turnoVO.setSeleccionar(turnos.getTurnoStatus().equals("01")?true:false);
	    
	   
	    
		return turnoVO;
		
	}
	
	

	/**
	 * @param turnoVO
	 * @return
	 */
	public static Turno  getTurno(TurnoVO turnoVO){
		Turno turno=new Turno();
		
		turno.setTurnoDescrip(turnoVO.getTurDescripcion());
		turno.setTurnoHorIni(getStringHora(turnoVO.getTurHoraInicio()));
	    turno.setTurnoHorFin(getStringHora(turnoVO.getTurHoraFin()));
		turno.setTurnoStatus(turnoVO.getTurStatus().equals("Abierta")? UtileriaHelper.ABIERTA:UtileriaHelper.CERRADA);
		turno.setTurnoBajaLogica(turnoVO.getTurBajaLogica());
		turno.setTurnoId(turnoVO.getTurnoId());
		
	
		return turno;
	}

}