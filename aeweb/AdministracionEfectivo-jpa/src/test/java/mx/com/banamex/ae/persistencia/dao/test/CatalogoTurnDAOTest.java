/**
 * 
 */
package mx.com.banamex.ae.persistencia.dao.test;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

import mx.com.banamex.ae.persistencia.dao.common.test.AdminEfectivoEmbeddableContainer;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoContratoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Contrato;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public class CatalogoTurnDAOTest {
	private static Context ctx;

	private static final String jndi = "CatalogoTurnoDAOImplBeanLocalLocal";

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

	@Test
	public void testConsultaCatalogoContrato() throws Exception {
		// Retrieve a reference to the session bean using a portable
		// global JNDI name
		CatalogoTurnoDAOBeanLocal turnoDAO = (CatalogoTurnoDAOBeanLocal) ctx.lookup(jndi);
		assertNotNull("no inyecto el Servicio", turnoDAO);
		List<Turno> turnoList = turnoDAO.findAll();
		assertNotNull("la lista viene vacia", turnoList);
		for (Turno elemento : turnoList) {
			System.out.println("Descripcion:" + elemento.getTurnoDescrip());
		}
		System.out.println("todo bien ");
	}

	
}
