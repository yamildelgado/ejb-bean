/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JESÚS AGUILAR LÓPEZ 
 *
 */

public class HourFormateHelper {
	
	private static final String PATRON="HH:mm";
	/**
	 * @param hora
	 * @return
	 */
	public static String getHora(Date hora){
		
		SimpleDateFormat formato=new SimpleDateFormat(PATRON);
		return formato.format(hora);
		
	}
	
	public static Date getStringHora(String hora){
		SimpleDateFormat formato = new SimpleDateFormat(PATRON);
		Date date = null;
		try {
			date = formato.parse(hora);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date; 
		 
	}

}
