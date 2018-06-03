/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEmpleadosDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaHabilitadaPorTurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;


/**
 * @author OCE-WCD DAVID FERNANDO RUIZ MARTINEZ
 *
 */


@Stateless
public class CatalogoEmpleadosDAOImplBeanLocal extends GlobalJpaDaoBean<Empleado> 
implements CatalogoEmpleadosDAOBeanLocal {
	
			@PersistenceContext
			private EntityManager em;
		
	
		
		public List<Empleado> consultaEmpleadoPorParametros(EmpleadoVO empleadoVO) throws EfectivoAplicacionDAOException {
			StringBuilder query = new StringBuilder();
			
			String queryFormateado = UtileriaHelper.getFiltroDeAtributos(empleadoVO.toString(), OperadorLogicoType.AND, 'o');
			if (queryFormateado.equals(UtileriaHelper.VACIO)) {
				query = new StringBuilder();
				queryFormateado = new String();
				return findAll();
			}
			query.append(" SELECT o FROM Empleado o ");
			query.append(" WHERE " + queryFormateado);
			query.append("ORDER BY o.empPaterno ASC, o.empMaterno ASC");
			Query criteria = em.createQuery(query.toString(), Empleado.class);
			query = new StringBuilder();
			
			return criteria.getResultList();
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Empleado> consultaEmpleado() throws EfectivoAplicacionDAOException {
			StringBuilder query = new StringBuilder();
			query.append(" SELECT o FROM Empleado o ORDER BY o.empPaterno ASC, o.empMaterno ASC");
			Query criteria = em.createQuery(query.toString(), Empleado.class);
			query = new StringBuilder();
			return criteria.getResultList();
		}


		/* (non-Javadoc)
		 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEmpleadosDAOBeanLocal#consultaEmpleadoNomina(mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO)
		 */
		@Override
		public List<Empleado> consultaEmpleadoNomina(
				CambioDeLaFechaContableVO cambioDeLaFechaContableVO)
				throws EfectivoAplicacionDAOException {
			// TODO Auto-generated method stub
			return null;
		}

		/* (non-Javadoc)
		 * @see mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEmpleadosDAOBeanLocal#obtenerEmpleado(mx.com.bcm.banamex.ae.persistencia.vo.CajaHabilitadaPorTurnoVO)
		 */
		@Override
		public Empleado obtenerEmpleadoPorNomina(	CajaHabilitadaPorTurnoVO cajaHabilitadaPorTurnoVO)
				throws EfectivoAplicacionDAOException {
			// TODO Auto-generated method stub
			StringBuilder query = new StringBuilder();
			query.append("SELECT e FROM Empleado e WHERE e.empNomina = :empNomina");
			Query criteria = this.em.createQuery(query.toString(),Empleado.class);
			criteria.setParameter("empNomina", cajaHabilitadaPorTurnoVO.getNominaEmpleado());
			
			Empleado empleado = (Empleado) criteria.getSingleResult();
			
			return empleado;
		}
		
		
		
		
	
			
					
}
