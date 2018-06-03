/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;
import mx.com.bcm.banamex.ae.persistencia.modelo.DiasInhabiles;
import mx.com.bcm.banamex.ae.persistencia.vo.DiasInhabilesVO;


/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
public class DiasInhabilesAssambler {
	/**
	 * @param bancos
	 * @return
	 */
	public static DiasInhabilesVO getDiasInhabilesVO(DiasInhabiles diasInhabiles){
		DiasInhabilesVO diasInhabilesVO=new DiasInhabilesVO();
//		diasInhabilesVO.setDdDfestivo(diasInhabiles.getDdDfestivo());
//		diasInhabilesVO.setDdTipocal(diasInhabiles.getDdTipocal());
		return diasInhabilesVO;
	}
}
