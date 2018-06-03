package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//import javax.faces.context.FacesContext;
//import javax.servlet.ServletContextEvent;

//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;

//import com.mx.bcm.banamex.ea.negocio.catalogo.bo.ActualizarCatalogosBOBeanLocal;
//import com.mx.bcm.banamex.ea.persistencia.dao.impl.ActualizarCatalogosDAOImplBean;
//
//public class ActualizarCatalogosBOImplBean implements ActualizarCatalogosBOBeanLocal{
//	
//	public ActualizarCatalogosDAOImplBean actualizarCatalogosDAOImplBean;
//
//	@Override
//	public void execute(JobExecutionContext jobExecutionContext)
//			throws JobExecutionException {
//		
//		/*actualizarCatalogosDAOImplBean = new ActualizarCatalogosDAOImplBean();
//		actualizarCatalogosDAOImplBean.lecturaDeArchivo("E000181.txt");
//		System.out.println("¡Hola, mundo! :D" + jobExecutionContext.getTrigger());*/
//		
//		/*try{
//            // Abrimos el archivo			
//            FileInputStream fstream = new FileInputStream("C:/nuevo-repositorio/AdministracionEfectivo/AdministracionEfectivo-web/src/main/webapp/WEB-INF/Carga/E000181.txt");
//            // Creamos el objeto de entrada
//            DataInputStream entrada = new DataInputStream(fstream);
//            // Creamos el Buffer de Lectura
//            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
//            String strLinea;
//            // Leer el archivo linea por linea
//            while ((strLinea = buffer.readLine()) != null)   {
//                // Imprimimos la línea por pantalla
//                System.out.println (strLinea);
//            }
//            // Cerramos el archivo
//            entrada.close();
//        }catch (Exception e){ //Catch de excepciones
//            //System.err.println("Ocurrio un error: " + e.getMessage());
//            e.printStackTrace();
//        }*/
//		
//	}	
//
//}
