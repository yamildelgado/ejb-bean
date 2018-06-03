
/*  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.listener;

import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ 
 * Descripcion: Listener implementation class AeWebContextListener
 *
 */
@WebListener
public class AeWebContextListener implements ServletContextListener {
	//private ApplicationContext context ;
	
	private static  Logger logger ;
    /**
     * Default constructor. 
     */
    public AeWebContextListener() {
        super();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {

    	initializeLog4j( arg0);
    //	createApplicationContext();
    	
    	
    	
    }
  /*  private void createApplicationContext(){
    	    StringBuilder archivos=new StringBuilder();
    		archivos.append(Resource.class.getResource("applicationContext.xml").getPath());
    		archivos.append(",");
    		archivos.append(Resource.class.getResource("taskContext.xml").getPath());
    		context = new ClassPathXmlApplicationContext(archivos.toString().split(","));
    }
   */

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
    
    private synchronized void initializeLog4j(ServletContextEvent evt) {
    	
    	ServletContext sc =evt.getServletContext();
    	
    	
    	try {
			PropertyConfigurator.configure(sc.getResource("/WEB-INF/logConfig/Log4j.properties"));
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
			
		}
    	logger= Logger.getLogger(AeWebContextListener.class);
    	logger.info("*************************************");
    	logger.info("*                                   *");
    	logger.info("* ...     AE-WEB    INICIANDO ....   * ");
    	logger.info("*                                   *");
    	logger.info("*** BCM: AE-WEB     is running in DEVELOPMENT mode.             ***");
    	logger.info("***                                         ^^^^^^^^^^^         ***");
    	logger.info("*** Do NOT deploy to your live server(s) without changing this. ***");
    	logger.info("*** See YAMIL FRAMEWORK for more information.     ***");
    	logger.info("*******************************************************************");
	}
}
