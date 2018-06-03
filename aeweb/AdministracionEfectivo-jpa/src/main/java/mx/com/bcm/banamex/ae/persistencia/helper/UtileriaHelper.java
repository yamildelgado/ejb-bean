/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.helper;


import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;

/**
 * @author OCE-WCD AND OCJP- SE AND OCJA YAMIL OMAR DELGADO GONZALEZ Clase de Utilerias
 * @author OCJP-SE DAVID FERNANDO RUIZ 
 * @author OCE-WCD AND OCJP- SE AND OCA DBA SALUD JUAN MANUEL HERNANDEZ
 */
public class UtileriaHelper {
	private static final String COMA=",";
	private static final String ARROBA="@";
	private static final String CORCHETE_ABIERTO="[";
	private static final String CORCHETE_CERRADO="]";
	private static final String PUNTO=".";
	private static final String NULL="null";
	public static final String COMILLAS="\''";
	public static final String VACIO="";

	public static final int RECEPTORA = 1;
	public static final int VERIFICADORA_BILLETES = 2;
	public static final int VERIFICADORA_MONEDAS = 3;
	public static final int PICO_MONEA = 4;
	public static final int PICO_BILLETES = 5;
	public static final int ATENCION_CLIENTES = 6;
	public static final int OTROS = 7;
	
	public static final String QUITAR = "quitar";
	public static final String AGREGAR = "asignar";
	
	public static final String CERRADA = "00";
	public static final String ABIERTA = "01";
	public static final String CSTATUSOPEN = "Abierta";
	public static final String CSTATUSCLOSE = "Cerrada";
	
	/**
	 * @param item
	 * @return
	 */
	private static String analizadorTrama(String item){
		
		/**
		 * Marca el inicio y un final de los siguientes caracteres []
		 */
		int startIndex=-1;int endIndex=-1;
		 String trama =null;
		/**
		 * Valida que la cadena este instanciada
		 */
		if(item==null ){
			throw new IllegalArgumentException("Argumento ilegal");
		}
		if(item.contains(ARROBA)){
			throw new IllegalArgumentException("Usted necesita sobreescribir el toString de ViewObject");
		}
		
		
		/**
		 * Valida la presencia de [] en la sequencia de caracteres 
		 */
		if(item.startsWith(CORCHETE_ABIERTO) && item.endsWith(CORCHETE_CERRADO)  && !item.contains(COMA)){
			throw new IllegalArgumentException("Argumento ilegal-Se esperaba [ ] los siguientes caracteres en la cadena");
		}
		
		 String query=item.trim();
		 startIndex = query.indexOf(CORCHETE_ABIERTO)+1;
		 endIndex=query.indexOf(CORCHETE_CERRADO);
		 
		 if(startIndex<0 || endIndex<0 )
			 throw new IllegalArgumentException("Los atributos del ViewObject todos son nullos");
		 trama = query.substring(startIndex, endIndex);
		 return trama;
		 
		
	}
	
	/** Metodo que permite  generar un JPQL dado una expresion  
	 * @param trama es que ToString del VO Generado por Eclipse
	 * @param operadorType AND o OR  
	 * @param alias   Alias de la tabla
	 * @return JPA QUERY 
	 */
	/**
	 * @param trama
	 * @param operadorType
	 * @param alias
	 * @return
	 */
	public static String getFiltroDeAtributos(String trama,final OperadorLogicoType operadorType,final char alias){
		int startIndex=-1;
		int endIndex=-1;
		String filtrado=analizadorTrama(trama);
		
		
		
		String[] filtradoSplit = filtrado.split(COMA);
		StringBuilder subQuery=new StringBuilder();
		for(String elemento:filtradoSplit){
			filtrado=elemento.contains(NULL)||elemento.contains(COMILLAS) ?filtrado.replace(elemento, VACIO):filtrado.replace(elemento, alias+PUNTO+elemento.trim());
			
		}
		
		
		
		filtradoSplit = filtrado.split(COMA);
        for(String elemento:filtradoSplit){
			
		     startIndex=elemento.indexOf("=");
		
		   if(startIndex<0 || elemento.substring(startIndex+1).trim().equals(VACIO)){
			    	  continue;
			}
		     
			if( !elemento.isEmpty()){
			    subQuery.append(elemento.trim());
			    subQuery.append(" ");
			    subQuery.append(operadorType);
			    subQuery.append(" ");
			 
			}
		}
        
       
       if(subQuery.length()>0){ 
        startIndex = subQuery.lastIndexOf(operadorType.name());
        endIndex=subQuery.length()-1;
        if(startIndex<0 || endIndex<0 )
			 throw new IllegalArgumentException("Los atributos del ViewObject todos son nullos o vacios "+trama);
 
        subQuery.delete(startIndex,endIndex);
       }
		return subQuery.toString();
	}
	
}
