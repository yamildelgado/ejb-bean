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
import mx.com.bcm.banamex.ae.persistencia.dao.OperacionProcesadoraDTODAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.impl.OperacionProcesadoraDTODAOImplBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class OperacionesProcesadoraDTOTest {

	private static Context ctx;

	 private static  final String jndi ="OperacionProcesadoraDTODAOImplBeanLocalLocal";
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
	    public void testConsultaOperacioneProcesadoras() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	OperacionProcesadoraDTODAOBeanLocal operProcDAO =(OperacionProcesadoraDTODAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",operProcDAO);
	        List<OperacionProcesadoraDTO> consultaOperProcList = operProcDAO.consultaReporProcesadoraEtvSirh();
	        assertNotNull( "la lista viene vacia",consultaOperProcList);
	        for(OperacionProcesadoraDTO elemento:consultaOperProcList){
		        System.out.println("Nombre:"+elemento.getEstructraSirh());  //   getEtvNombre());
		        }
	        System.out.println("todo bien ");
	    }
}
