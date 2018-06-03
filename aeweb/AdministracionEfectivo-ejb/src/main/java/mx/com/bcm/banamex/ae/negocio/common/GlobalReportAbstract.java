package mx.com.bcm.banamex.ae.negocio.common;

import java.io.IOException;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import mx.com.bcm.banamex.ae.persistencia.common.ReporteAbstract;

public   class GlobalReportAbstract {
	
	
	/**
	 * 
	 */
	private JasperPrint jasperPrint;
    
	
	
	/**
	 *  Metodo paramaetrizado para cualquier Value Object que herede 
	 *  Generar reporte para servicios Genericos.
	 * 
	 **/
	public void  prepararReporte(List<? extends ReporteAbstract> listaVO, String reportJasper) throws JRException{
        JRBeanCollectionDataSource beanCollectionDataSource=new JRBeanCollectionDataSource(listaVO);
        String  reportPath= FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF/jasperReporReporte/"+reportJasper);
        jasperPrint=JasperFillManager.fillReport(reportPath, null,beanCollectionDataSource);
    }
	
	 public void PDF(String nombreReporte) throws IOException {
	        
		 ServletOutputStream servletOutputStream = null;
		try {
			HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			httpServletResponse.addHeader("Content-disposition",
					"attachment; filename=" + nombreReporte + ".pdf");
			
			servletOutputStream = httpServletResponse.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
		      
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			 servletOutputStream.close();
		}
	       
	       
     
	  }
	

  
	

}
