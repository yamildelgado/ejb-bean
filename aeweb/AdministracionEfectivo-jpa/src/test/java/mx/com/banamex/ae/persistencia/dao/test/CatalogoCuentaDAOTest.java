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
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CatalogoCuentaDAOTest {
 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoCuentaDAOImplBeanLocalLocal";
	 
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
	    public void testConsultaCatalogoCuenta() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoCuentaDAOBeanLocal cuentaDAO =(CatalogoCuentaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",cuentaDAO);
	        List<Cuenta> consultaList = cuentaDAO.findAll();
	        assertNotNull( "la lista viene vacia",consultaList);
	        for(Cuenta elemento:consultaList){
		        System.out.println("CtaReferencia1Mascara:"+elemento.getCtaReferencia1Mascara());
		        }
	        System.out.println("todo bien ");
	    }
	    
	    @Test
	    public void testConsultaCatalogoPorIdCuenta() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoCuentaDAOBeanLocal cuentaDAO =(CatalogoCuentaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",cuentaDAO);
	        CuentaPK cuentaPK =new CuentaPK();
	        cuentaPK.setCntrtoNum("1");
	        cuentaPK.setCtaCuenta(1L);
	        cuentaPK.setCtaSucursalId((short)1);
	        cuentaPK.setUnegId((short)1);
	        Cuenta cuenta = cuentaDAO.findById(cuentaPK);
	        assertNotNull("el objecto cuenta viene nullo:",cuenta);
	        System.out.println("Referencia:"+cuenta.getCtaReferencia1Tipo());
	    }
	    
	    
	    @Test
	    public void testConsultaDeCuentaDeUnidadDeNegocio() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoCuentaDAOBeanLocal cuentaDAO =(CatalogoCuentaDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",cuentaDAO);
	        CuentaPK cuentaPK =new CuentaPK();
	        cuentaPK.setUnegId((short)1);
	        List<Cuenta> listaCuenta = cuentaDAO.consultaCuentaPorid(cuentaPK);
	        assertNotNull("el objecto cuenta viene nullo:",listaCuenta);
	        for(Cuenta elemento:listaCuenta){
	        	System.out.println(elemento.getCtaReferencia1Mascara());
	        }
	        
	        //System.out.println("Referencia:"+cuenta.getCtaReferencia1Tipo());
	    }
}
