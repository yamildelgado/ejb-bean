package mx.com.banamex.ae.persistencia.dao.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

import mx.com.banamex.ae.persistencia.dao.common.test.AdminEfectivoEmbeddableContainer;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoPlazaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Plaza;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class CatalogoPlazaDAOTest {
	 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoPlazaDAOImplBeanLocalLocal";
	 								
	 
	    @BeforeClass
	    public static void setUpClass() throws Exception {
	    	Properties props = AdminEfectivoEmbeddableContainer.getEJBContainer();
	        
	         ctx = new InitialContext(props);  
	    }
	 
	    @AfterClass
	    public static void tearDownClass() throws Exception {
	        // Shutdown the embeddable container
	        ctx.close();
	    }

	    @Test
	    public void testConsultaPLaza() throws Exception {
	    	// Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoPlazaDAOBeanLocal catPlazaDAO =(CatalogoPlazaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",catPlazaDAO);
	        List<Plaza> consultaPlazaList = catPlazaDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaPlazaList);
	        for(Plaza elemento:consultaPlazaList){
		        System.out.println("Nombre:"+elemento.getPlazaNombre());
		        }
	        System.out.println("todo bien ");
	    }
}
