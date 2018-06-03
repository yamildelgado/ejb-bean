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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

public class DateFormateHelper {
	
	private static final String PATRON="dd/MM/yyyy";
	private static final String PATRON2="dd/MM/yyyy hh:mm:ss";
	/**
	 * @param fecha
	 * @return
	 */
	public static String getFecha(Date fecha){
		
		SimpleDateFormat formato=new SimpleDateFormat(PATRON);
		return formato.format(fecha);
		
	
	}
public static String getFechaHora(Date fecha){
		
		SimpleDateFormat formato=new SimpleDateFormat(PATRON2);
		return formato.format(fecha);
		
	
	}
	
public static Date getFechaHoraDate(String fecha){
	Date fechaDate = null;
		
		SimpleDateFormat formato=new SimpleDateFormat(PATRON2);
		try {
			 fechaDate = formato.parse(fecha);
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return fechaDate;
	}
public static Date getFechaDate(String fecha){
	Date fechaDate = null;
		
		SimpleDateFormat formato=new SimpleDateFormat(PATRON);
		try {
			 fechaDate = formato.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fechaDate;
	}
	
public static Date sumarFechasDias(Date fch, int dias) {
    Calendar cal = new GregorianCalendar();
    cal.setTimeInMillis(fch.getTime());
    cal.add(Calendar.DATE, dias);
    fch = new Date(cal.getTimeInMillis());
    return fch;
    }

}
