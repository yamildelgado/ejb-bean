/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;


import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;

/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */

public class CambioDeLaFechaContableAssambler {



public static CambioDeLaFechaContableVO tabla(SubBoveda subBoveda,Turno turno,HistTurnoEnOperacion histTurnoEnOperacion){
	CambioDeLaFechaContableVO cambioDeLaFechaContableVO = new CambioDeLaFechaContableVO();
	cambioDeLaFechaContableVO.setSubboveda(subBoveda.getSubBovedaPK().getSubbovedaIdn());
	cambioDeLaFechaContableVO.setSirhIdnCpae(subBoveda.getSubBovedaPK().getCpaesEstructuraSirhIdn());
	cambioDeLaFechaContableVO.setSirhNombreCpae(subBoveda.getCpae().getSirhNombre());
	cambioDeLaFechaContableVO.setTurnoDes(turno.getTurnoDescrip());
	cambioDeLaFechaContableVO.setTurnoStatus(turno.getTurnoStatus());
	cambioDeLaFechaContableVO.setFecContIdn(histTurnoEnOperacion.getHistFecContInicial());
	cambioDeLaFechaContableVO.setHora(histTurnoEnOperacion.getHistFecHorFin());
	cambioDeLaFechaContableVO.setCadena(subBoveda.getSubBovedaPK().getCpaesEstructuraSirhIdn() +" "+subBoveda.getCpae().getSirhNombre().toString());
	return cambioDeLaFechaContableVO;
}
public static CambioDeLaFechaContableVO empleado(Empleado empleado,HistTurnoEnOperacion histTurnoEnOperacion ){
	CambioDeLaFechaContableVO cambioDeLaFechaContableVO = new CambioDeLaFechaContableVO();
	cambioDeLaFechaContableVO.setEmpNomb(empleado.getEmpNombre());
	cambioDeLaFechaContableVO.setEmpNomina(empleado.getEmpNomina());
	cambioDeLaFechaContableVO.setCadenaEmp(empleado.getEmpNombre().toString() + " " + empleado.getEmpNomina().toString());
	cambioDeLaFechaContableVO.setHorafin(histTurnoEnOperacion.getHistFecHorFin());
	cambioDeLaFechaContableVO.setHistFecContIni(histTurnoEnOperacion.getHistFecContInicial());
	cambioDeLaFechaContableVO.setHistCambFecCont(histTurnoEnOperacion.getHistCambioFecCont());
	return cambioDeLaFechaContableVO;
	
}

}