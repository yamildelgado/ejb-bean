/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;


/**
 * @author:  Marco Antonio Abitia G.
 *
 */
public class FechaContableAssambler {

	public static FechaContableVO getFechaContableVO(FechaContable fechaContable){
		FechaContableVO fechaContableVO = new FechaContableVO();
		fechaContableVO.setFecContId(fechaContable.getFeccontIdn());
		fechaContableVO.setFeccontStatus(fechaContable.getFeccontStatus());
		return fechaContableVO ;
	} 
	
}
