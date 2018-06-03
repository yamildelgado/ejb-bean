 /**
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.negocio.constantes;

import java.util.HashMap;
import java.util.Map;



public class CatalogoEstaticos {
	
	private static   Map<String,String> tipoCuenta ;
	private static   Map<String,String> tipoInstrumento ;
	private static	 Map<String,String> indicadorAsociado;
	private static	 Map<String,String> tipoUsoCuenta;
	private static	 Map<String,String> tipoReferenciaCuenta;
	
	private CatalogoEstaticos(){
		
	}


	/**
	 * @return
	 */
	public static  synchronized Map<String, String> getTipoCuenta() {
	
		
		
		  if(tipoCuenta==null){
			  tipoCuenta =new HashMap<String,String>();
			  tipoCuenta.put("00","Normal");
			  tipoCuenta.put("01" ,"Linea Banamex");
			  tipoCuenta.put("02","Cobranza 707");

		  }
		  
		 
		return tipoCuenta;
	}

	/**
	 * @return
	 */
	public static synchronized  Map<String, String> getTipoInstrumento() {
		
		  if(tipoInstrumento==null){
			  tipoInstrumento  =new HashMap<String,String>();
			  tipoInstrumento .put("01","Dotacion");
			  tipoInstrumento .put("02" ,"Deposito");
			  tipoInstrumento .put("03","Ambos");
		  }
		return tipoInstrumento;
	}
	
	/**
	 * @return
	 */
	public static synchronized Map<String, String> getIndicadorAsociado(){
		
		if(indicadorAsociado==null){
			indicadorAsociado = new HashMap<String,String>();
			indicadorAsociado.put("00", "NO");
			indicadorAsociado.put("01", "SI");
			
		}
		
		return indicadorAsociado;
	}
	
	/**
	 * @return
	 */
	public static synchronized Map<String,String> getTipoUsoCuenta(){
		
		if(tipoUsoCuenta==null){
			tipoUsoCuenta = new HashMap<String,String>();
			tipoUsoCuenta.put("00","NORMAL (DEPOSITO DOTACIÓN)");
			tipoUsoCuenta.put("01","DIFERENCIAS CARGO");
			tipoUsoCuenta.put("02","DIFERENCIAS ABONO");
			tipoUsoCuenta.put("03","DIFERENCIAS AMBOS");
			
		}
		
		return tipoUsoCuenta;
	}
	
	/**
	 * @return
	 */
	public static synchronized Map<String,String> getTipoReferenciaCuenta(){
		
		if(tipoReferenciaCuenta==null){
			tipoReferenciaCuenta = new HashMap<String,String>();
			tipoReferenciaCuenta.put("01","SIN REFERENCIA");
			tipoReferenciaCuenta.put("02","NUMÉRICA");
			tipoReferenciaCuenta.put("03","ALFABETICA");
			tipoReferenciaCuenta.put("04","ALFANUMERICA");
			
		}
		
		return tipoReferenciaCuenta;
	}
	

}
