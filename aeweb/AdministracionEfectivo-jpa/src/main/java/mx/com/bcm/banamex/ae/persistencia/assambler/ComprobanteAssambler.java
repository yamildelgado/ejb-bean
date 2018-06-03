/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Comprobante;
import mx.com.bcm.banamex.ae.persistencia.modelo.ComprobantePK;
import mx.com.bcm.banamex.ae.persistencia.vo.ComprobanteVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class ComprobanteAssambler {
	
	public static Comprobante getComprobante(ComprobanteVO comprobanteVO)
	{
		Comprobante comprobante=new Comprobante();
		ComprobantePK comp=new ComprobantePK();
		comp.setCompbteId(comprobanteVO.getCompbteId());
		comp.setEtvIdn(comprobanteVO.getEtvIdn());
		comprobante.setCompbteFecAsign(comprobanteVO.getCompbteFecAsign());
		comprobante.setCompbteFecHrVerificacion(comprobanteVO.getCompbteFecHrVerificacion());
		comprobante.setCompbteImpteTot(comprobanteVO.getCompbteImpteTot());
		comprobante.setCompbteNivelDificultad(comprobanteVO.getCompbteNivelDificultad());
		comprobante.setCompbteNumEnvases(comprobanteVO.getCompbteNumEnvases());
		comprobante.setCompbteReasignado(comprobanteVO.getCompbteReasignado());
			
		return comprobante;
	}

}
