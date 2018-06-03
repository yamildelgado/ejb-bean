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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoAtmDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CatalogoAtmDAOTest {

	private static Context ctx;

	 private static  final String jndi ="CatalogoAtmDAOImplBeanLocalLocal";
	 
	    @BeforeClass
	    public static void setUpClass() throws Exception {
	    
	    	Properties props = AdminEfectivoEmbeddableContainer.getEJBContainer();
	        // campo accesible desde los métodos del test unitario, se utilizará 
	        
	         ctx = new InitialContext(props);  
	    }
	 
	    @AfterClass
	    public static void tearDownClassjm() throws Exception {
	        // Shutdown the embeddable container
	        ctx.close();
	    }

	    @Test
	    public void testConsultaAtms() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoAtmDAOBeanLocal catAtmDAO =(CatalogoAtmDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",catAtmDAO);
	        List<Atm> consultaAtmList = catAtmDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaAtmList);
	        for(Atm elemento:consultaAtmList){
		        System.out.println("Nombre:"+elemento.getAtmBajaLogica());  //   getEtvNombre());
		        }
	        System.out.println("todo bien ");
	    }
}
