/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion;
import mx.com.bcm.banamex.ae.persistencia.modelo.RecepcionPK;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class RecepcionAssambler {
	
	public static Recepcion getRecepcion(RecepcionVO recepcionVO)
	{
		Recepcion recepcion=new Recepcion();
		RecepcionPK rece=new RecepcionPK();
		rece.setCajaIdn(recepcionVO.getCajaIdn());
		recepcion.setRecepcionPK(rece);
		
		recepcion.setCntrtoNum(recepcionVO.getCntrtoNum());
		recepcion.setCpaesEstructuraSirhIdn(recepcionVO.getCpaesEstructuraSirhIdn());
		recepcion.setRecepEnvases(recepcionVO.getRecepEnvases());
		recepcion.setRecepFecHrFin(recepcionVO.getRecepFecHrFin());
		recepcion.setRecepNumCamionetv(recepcionVO.getRecepNumCamionetv());
		recepcion.setUnegId(recepcionVO.getUnegId());
		
		return recepcion;
	}
	
	public static RecepcionVO getRecepcionVO(Recepcion recepcion)
	{
		RecepcionVO recepcionVO=new RecepcionVO();
		
		return recepcionVO;
		
	}

}
