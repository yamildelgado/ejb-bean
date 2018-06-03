/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.Etv;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.SolicitudDotacionVO;


/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class SolicitudDotacionAssambler {

	
	/**
	 * @param SolicitudDotacionVO
	 * @return
	 */
	/**
	 * @param atmVO
	 * @return
	 */
	public static SolicitudDotacionVO getSolicitudVO(UnidadDeNegocio unineg){
		SolicitudDotacionVO solicitudDotacionVO=new SolicitudDotacionVO();
		
		solicitudDotacionVO.setCpaesEstructuraSirhIdn(unineg.getUnidadDeNegocioPK().getCpaesEstructuraSirhIdn());
		solicitudDotacionVO.setCntrtoNum(unineg.getUnidadDeNegocioPK().getCntrtoNum());
		solicitudDotacionVO.setUnegId(unineg.getUnidadDeNegocioPK().getUnegId());
		solicitudDotacionVO.setUnegNombre(unineg.getUnegNombre());
		
		return solicitudDotacionVO;
	
	
	}
	
	public static SolicitudDotacionVO getSolicitudEtvVO(Etv etv){
		SolicitudDotacionVO solicitudDotacionEtvVO=new SolicitudDotacionVO();
		
		solicitudDotacionEtvVO.setEtvIdn(etv.getEtvIdn());
		solicitudDotacionEtvVO.setEtvNombreLargo(etv.getEtvNombreLargo());
		
		
		return solicitudDotacionEtvVO;
	
	}

	public static SolicitudDotacionVO getSolicitudCuentaVO(Cuenta cuenta){
		SolicitudDotacionVO solicitudDotacionCuentaVO= new SolicitudDotacionVO();
		
		solicitudDotacionCuentaVO.setCtaSucursalId(cuenta.getCuentaPK().getCtaSucursalId());
		solicitudDotacionCuentaVO.setCtaCuenta(cuenta.getCuentaPK().getCtaCuenta());
		
		return solicitudDotacionCuentaVO;
	}
	
}