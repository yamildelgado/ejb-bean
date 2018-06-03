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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author OCE-WCD ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 *
 */
public class CatalogoSubBovedasDAOTest {
 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoSubBovedaDAOImplBeanLocalLocal";
	 
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
	    public void testConsultaCatalogoSubBoveda() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoSubBovedaDAOBeanLocal subBovedaDAO =(CatalogoSubBovedaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",subBovedaDAO);
	        List<SubBoveda> consultaList = subBovedaDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaList);
	        for(SubBoveda elemento:consultaList){
		       // System.out.println("IdnSubBoveda:"+elemento.getBovedaIdnBoveda());
		        //System.out.println("IdnSubBoveda:"+elemento.getOficinaS018().getOficinaS018());
		        //System.out.println("IdnSubBoveda:"+elemento.getSubbovedaIdn());
		        System.out.println("IdnSubBoveda:"+elemento.getSubbovedaDescripcion());
		        
		        }
	        System.out.println("todo bien ");
	    }
	    
	    
}
