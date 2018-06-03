/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEmpleadoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.EmpleadoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEmpleadosDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;


/**
 * @author DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@Stateless
public class CatalogoEmpleadoBOImplBean implements CatalogoEmpleadoBOBeanLocal{

	@EJB private CatalogoEmpleadosDAOBeanLocal empleadosDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override

	public List<EmpleadoVO> consultaEmpleados() throws EfectivoAplicacionBOException {
		
		List<EmpleadoVO> listaEmpleadosVO=new ArrayList<EmpleadoVO>();
		 
		 List<Empleado> listaEmpleados=new ArrayList<Empleado>();
		try {
			listaEmpleados= this.empleadosDAO.consultaEmpleado();
			 for(Empleado elemento:listaEmpleados){
				 EmpleadoVO empleadosVO=EmpleadoAssambler.getEmpleadosVO(elemento);//SIRHAssambler.getOficinasVO(elemento);
				 listaEmpleadosVO.add(empleadosVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaEmpleadosVO;
		
	}
	
	@Override
	public List<EmpleadoVO> consultaEmpleadosPorParametros(EmpleadoVO empleadoVO) throws EfectivoAplicacionBOException {
		List<EmpleadoVO> listaEmpleadosVO=new ArrayList<EmpleadoVO>();
		 
		 List<Empleado> listaEmpleados=new ArrayList<Empleado>();
		try {
			listaEmpleados= this.empleadosDAO.consultaEmpleadoPorParametros(empleadoVO);
			 for(Empleado elemento:listaEmpleados){
				 EmpleadoVO empleadosVO=EmpleadoAssambler.getEmpleadosVO(elemento);//SIRHAssambler.getOficinasVO(elemento);
				 listaEmpleadosVO.add(empleadosVO);
			 }
		} catch (EfectivoAplicacionDAOException e) {
			
			throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
		}
		return listaEmpleadosVO;
	}
	
	
}
