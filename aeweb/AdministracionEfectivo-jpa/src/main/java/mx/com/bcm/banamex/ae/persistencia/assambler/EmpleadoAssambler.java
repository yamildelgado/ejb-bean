/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;


import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class EmpleadoAssambler {

	/**
	 * @param bancos
	 * @return
	 */
	public static EmpleadoVO getEmpleadosVO(Empleado empleados){

		EmpleadoVO empleadosVO=new EmpleadoVO();
	
		empleadosVO.setEmpBajaLogica(empleados.getEmpBajaLogica());
		empleadosVO.setEmpMaterno(empleados.getEmpMaterno());
		empleadosVO.setEmpNombre(empleados.getEmpNombre());
		empleadosVO.setEmpNomina(empleados.getEmpNomina());
		empleadosVO.setEmpPaterno(empleados.getEmpPaterno());
		empleadosVO.setEmpPerfil(empleados.getEmpPerfil());
		
		return empleadosVO;
		
	}
}
