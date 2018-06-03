package mx.com.bcm.banamex.ae.apliacion.web.controller.helper;

import java.util.Map;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  final class UtileriaHelper {
	
	
	/* Singleton de Utilerias Helper*/
	private UtileriaHelper() {
		super();
	}

	public  static String getParam(String parametro){
		
		   Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
			return  params.get(parametro);
	
	}
	/*metodo para refrescar una pagina
	 * */
	public void refresh() {
	    FacesContext context = FacesContext.getCurrentInstance();
	    Application application = context.getApplication();
	    ViewHandler viewHandler = application.getViewHandler();
	    UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
	    context.setViewRoot(viewRoot);
	    context.renderResponse(); 
	     
	 }
	/**
	 * @param ip
	 * @return
	 */
	public static boolean ipAddress(String ip) {
		
		String ipPattern= "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		Pattern pattern = Pattern.compile(ipPattern);
		Matcher matcher = pattern.matcher(ip);
		return matcher.matches();
		
		}
}
	
