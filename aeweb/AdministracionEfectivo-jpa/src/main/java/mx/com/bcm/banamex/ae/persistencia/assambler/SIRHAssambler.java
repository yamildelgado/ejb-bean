/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;



import mx.com.bcm.banamex.ae.persistencia.modelo.Estructura;
import mx.com.bcm.banamex.ae.persistencia.vo.EstructuraVO;

/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public class SIRHAssambler{
	
	public static  EstructuraVO getEstructuraVO (Estructura estructura){
		EstructuraVO estructuraVO = new EstructuraVO();
		
		estructuraVO.setEstructraBajaLogica(estructura.getEstructraBajaLogica());
		estructuraVO.setEstructraCalleNum(estructura.getEstructraCalleNum());
		estructuraVO.setEstructraColonia(estructura.getEstructraColonia());
		estructuraVO.setEstructraCp(estructura.getEstructraCp());
		estructuraVO.setEstructraEdo(estructura.getEstructraEdo());
		estructuraVO.setEstructraLada(estructura.getEstructraLada());
		estructuraVO.setEstructraNombreCorto(estructura.getEstructraNombreCorto());
		estructuraVO.setEstructraNombreLargo(estructura.getEstructraNombreLargo());
		estructuraVO.setEstructraPoblacion(estructura.getEstructraPoblacion());
		estructuraVO.setEstructraRpta(estructura.getEstructraRpta());
		estructuraVO.setEstructraTelefono(estructura.getEstructraTelefono());
		estructuraVO.setEstructraTipoSirh(estructura.getEstructraTipoSirh());
		estructuraVO.setEstructraSirhIdn(estructura.getEstructraSirhIdn());

		return estructuraVO;
	}
	


}