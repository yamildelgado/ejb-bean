/**
 * 
 */
package mx.com.banamex.ae.persistencia.dao.test;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import mx.com.banamex.ae.persistencia.dao.common.test.AdminEfectivoEmbeddableContainer;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CatalogoUnidadNegocioDAOTest {
 private static Context ctx;
	 
	 private static  final String jndi ="CatalogoUnidadNegocioDAOImpBeanLocalLocal";
	 
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
/*
	    @Test
	    public void testConsultaCatalogoCuenta() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoUnidadDeNegocioDAOBeanLocal unidadNegocioDAO =(CatalogoUnidadDeNegocioDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",unidadNegocioDAO);
	        List<UnidadDeNegocio> unidadNegocioList =unidadNegocioDAO.findAll();
	        assertNotNull( "la lista viene vacia",unidadNegocioList);
	        for(UnidadDeNegocio elemento:unidadNegocioList){
		        System.out.println("CtaCpaeId:"+elemento.getUnegCp());
		        }
	        System.out.println("todo bien ");
	    }*/
	    
	    @Test
	    public void testConsultaCatalogoPorIdCuenta() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoUnidadDeNegocioDAOBeanLocal unidadNegocioDAO =(CatalogoUnidadDeNegocioDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",unidadNegocioDAO);
	       
	        UnidadDeNegocioPK unidadPK=new UnidadDeNegocioPK(1, "1", (short)1);
			unidadNegocioDAO.consultaUnidadNegocioPk(unidadPK);
	        //System.out.println("Referencia:"+cuenta.getCtaReferencia1Tipo());
	    }
	    
	    @Test
	    public void testConsultaDinamica() throws Exception {
	        // Retrieve a reference to the session bean using a portable
	        // global JNDI name
	    	CatalogoUnidadDeNegocioDAOBeanLocal unidadNegocioDAO =(CatalogoUnidadDeNegocioDAOBeanLocal)ctx.lookup(jndi);
	        assertNotNull("no inyecto el Servicio",unidadNegocioDAO);
	       
	        CriteriaUnidadNegocioVO criterioVO=new CriteriaUnidadNegocioVO();
	        criterioVO.setUnegId((short)1);
			UnidadDeNegocio unidad = unidadNegocioDAO.consultaUnidadNegocioDinamico(criterioVO);
			System.out.println(unidad);
			
	        //System.out.println("Referencia:"+cuenta.getCtaReferencia1Tipo());
	    }
}
