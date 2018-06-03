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
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
public class CatalogoCajaDAOTest {

	private static Context ctx;

	 private static  final String jndi ="CatalogoCajaDAOImplBeanLocalLocal";
	 
	 
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
	    public void testConsultaCaja() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoCajaDAOBeanLocal catCajaDAO =(CatalogoCajaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",catCajaDAO);
	        List<Caja> consultaCajaList = catCajaDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaCajaList);
	        for(Caja elemento:consultaCajaList){
		        System.out.println("Nombre:"+elemento.getCajaModeloEquipoMon());  //   getEtvNombre());
		        }
	        System.out.println("todo bien ");
	    }
}
