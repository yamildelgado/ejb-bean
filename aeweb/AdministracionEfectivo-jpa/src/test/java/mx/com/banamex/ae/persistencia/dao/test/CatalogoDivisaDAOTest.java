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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;







/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CatalogoDivisaDAOTest {

	
	private static Context ctx;

	 private static  final String jndi ="CatalogoDivisaDAOImplBeanLocalLocal";
	 
	 
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
	    public void testConsultadivisa() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoDivisaDAOBeanLocal divisaDAO =(CatalogoDivisaDAOBeanLocal )ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",divisaDAO);
	        Divisa divisa = divisaDAO.consultaDivisa(1);
	        assertNotNull( "la lista viene vacia",divisa);
	        
	        System.out.println("todo bien "+divisa);
	    }
	    
	    @Test
	    public void testConsultadivisaDivisaById() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	//CatalogoDivisaDAOBeanLocal divisaDAO =(CatalogoDivisaDAOBeanLocal )ctx.lookup(jndi);
	    	CatalogoDivisaDAOBeanLocal divisaDAO=(CatalogoDivisaDAOBeanLocal )ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",divisaDAO);
	        Divisa divisa = divisaDAO.consultaDivisa(Short.parseShort("1"));
	        assertNotNull( "la lista viene vacia",divisa);
	        
	        System.out.println("todo bien "+divisa);
	    }
	    
	    
}
