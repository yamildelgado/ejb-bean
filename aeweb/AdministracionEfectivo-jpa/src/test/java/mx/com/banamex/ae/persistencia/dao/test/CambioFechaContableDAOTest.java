/**
 * 
 */
package mx.com.banamex.ae.persistencia.dao.test;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

import mx.com.banamex.ae.persistencia.dao.common.test.AdminEfectivoEmbeddableContainer;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDiasInhabilesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CambioDeLaFechaContableDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.DiasInhabiles;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public class CambioFechaContableDAOTest {
	private static Context ctx;

	private static final String jndi = "CambioDeLaFechaContableDAOImplBeanLocalLocal";//cambiar

	@BeforeClass
	public static void setUpClass() throws Exception {
		Properties props = AdminEfectivoEmbeddableContainer.getEJBContainer();

		ctx = new InitialContext(props);
	}

	@AfterClass
	public static void tearDownClassjm() throws Exception {
		// Shutdown the embeddable container
		ctx.close();
	}

//	@Test
//	public void testConsultaFechaContable() throws Exception {
//		// Retrieve a reference to the session bean using a portable
//		// global JNDI name
//		 CambioDeLaFechaContableDAOBeanLocal fechaContableDAO = ( CambioDeLaFechaContableDAOBeanLocal) ctx.lookup(jndi); //interfazz
//		assertNotNull("no inyecto el Servicio", fechaContableDAO);
//		List<FechaContable> fechaContableList = fechaContableDAO.findAll();
//		assertNotNull("la lista viene vacia", fechaContableList);
//		for (FechaContable elemento : fechaContableList) {
//			System.out.println("Descripcion:" + elemento.getFeccontIdn());
//		}
//		System.out.println("todo bien ");
//	}

//	@Test
//	public void testDiasInhabiles() throws Exception {
//		// Retrieve a reference to the session bean using a portable
//		// global JNDI name
//		CatalogoDiasInhabilesDAOBeanLocal diasInhabilesDAO = ( CatalogoDiasInhabilesDAOBeanLocal) ctx.lookup(jndi); //interfazz
//		assertNotNull("no inyecto el Servicio", diasInhabilesDAO);
//		List<DiasInhabiles> diasInhabilesList = diasInhabilesDAO.findAll();
//		assertNotNull("la lista viene vacia", diasInhabilesList);
//		for (DiasInhabiles elemento : diasInhabilesList) {
//			System.out.println("Descripcion:" + elemento.getDdDfestivo());
//		}
//		System.out.println("todo bien ");
//	}
	@Test
	public void testConsultaFechContable() throws Exception {
		// Retrieve a reference to the session bean using a portable
		// global JNDI name
		 CambioDeLaFechaContableDAOBeanLocal fechaContableDAO = ( CambioDeLaFechaContableDAOBeanLocal) ctx.lookup(jndi); //interfazz
		assertNotNull("no inyecto el Servicio", fechaContableDAO);
		FechaContable instance = new FechaContable();
		instance.setFeccontIdn(new Date());
		instance.setFeccontStatus("01");
		
		
		fechaContableDAO.merge(instance);
		System.out.println("todo bien ");
	}

}
