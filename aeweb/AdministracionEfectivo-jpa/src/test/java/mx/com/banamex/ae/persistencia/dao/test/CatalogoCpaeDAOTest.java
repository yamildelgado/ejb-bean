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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCpaeDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cpae;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class CatalogoCpaeDAOTest {
 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoCpaeDAOImplBeanLocalLocal";
	 
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
	    public void testConsultaCatalogoCpaes() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoCpaeDAOBeanLocal cpaeDAO =(CatalogoCpaeDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",cpaeDAO);
	        List<Cpae> consultaList = cpaeDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaList);
	        for(Cpae elemento:consultaList){
		        System.out.println("CpaeIdSirh:"+elemento.getCpaesEstructuraSirhIdn());
		        }
	        System.out.println("todo bien ");
	    }
	    
}
