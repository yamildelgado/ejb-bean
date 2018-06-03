package mx.com.bcm.banamex.ae.apliacion.web.controller.helper;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author  YAMIL OMAR DELGADO GONZALEZ
 *
 */

public class ErrorMessageHelper {
	
	
	 /**
	 * @param ex
	 * @param defaultMsg
	 */
	public static void addErrorMessage(Exception ex, String defaultMsg) {
	        String msg = ex.getLocalizedMessage();
	        if (msg != null && msg.length() > 0) {
	            addErrorMessage(msg);
	        } else {
	            addErrorMessage(defaultMsg);
	        }
	    }
	    
	    /**
	     * @param messages
	     */
	    public static void addErrorMessages(List<String> messages) {
	        for (String message : messages) {
	            addErrorMessage(message);
	        }
	    }

	    /**
	     * @param msg
	     */
	    public static void addErrorMessage(String msg) {
	        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
	        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
	    }

	    /**
	     * @param msg
	     */
	    public static void addSuccessMessage(String msg) {
	        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
	        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
	    }
	    
	    /**
	     * @param key
	     * @return
	     */
	    public static String getRequestParameter(String key) {
	        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
	    }
	    
	   

}
