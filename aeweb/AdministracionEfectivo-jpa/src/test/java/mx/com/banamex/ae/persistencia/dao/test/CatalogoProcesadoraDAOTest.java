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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoProcesadoraDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
public class CatalogoProcesadoraDAOTest {
 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoProcesadoraDAOImplBeanLocalLocal";
	 
	    @BeforeClass
	    public static void setUpClass() throws Exception {
	    	Properties props = new Properties();  
	    	
	    	props=AdminEfectivoEmbeddableContainer.getEJBContainer();
	        // campo accesible desde los métodos del test unitario, se utilizará 
	        
	         ctx = new InitialContext(props);  
	    }
	 
	    @AfterClass
	    public static void tearDownClassjm() throws Exception {
	        // Shutdown the embeddable container
	        ctx.close();
	    }

	    @Test
	    public void testConsultaCatalogoProcesadora() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoProcesadoraDAOBeanLocal procesadoraDAO =(CatalogoProcesadoraDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",procesadoraDAO);
	        List<Procesadora> consultaList = procesadoraDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaList);
	        for(Procesadora elemento:consultaList){
		        System.out.println("IdnProcesadora:"+elemento.getCpae());
		        }
	        System.out.println("todo bien ");
	    }
	    
}
