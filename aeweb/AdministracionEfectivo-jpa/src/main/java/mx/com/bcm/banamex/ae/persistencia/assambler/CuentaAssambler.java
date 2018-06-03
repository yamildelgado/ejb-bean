/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaVO;




/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class CuentaAssambler {
	
	/**
	 * @param cajas
	 * @return
	 */
	public static CuentaVO getCuentaVO(Cuenta cuenta){
		CuentaVO cuentaVO=new CuentaVO();
		cuentaVO.setCuentaPK(cuenta.getCuentaPK());
		return cuentaVO;
	}
	
	/**
	 * @param cajas
	 * @return
	 */
	public static CuentaVO getCuentaVODetalle(Cuenta cuenta){
		
		CuentaVO cuentaVO=new CuentaVO();
		cuentaVO.setClaveOperativaDePagos(cuenta.getCtaClaveOperativaDePagos());
		cuentaVO.setContratoId(cuenta.getCuentaPK().getCtaCuenta());
		cuentaVO.setCuentaPK(cuenta.getCuentaPK());
		cuentaVO.setReferencia1Mascara(cuenta.getCtaReferencia1Mascara());
		cuentaVO.setReferencia2Mascara(cuenta.getCtaReferencia1Mascara());
		cuentaVO.setReferencia3Mascara(cuenta.getCtaReferencia1Mascara());
		cuentaVO.setReferencia4Mascara(cuenta.getCtaReferencia1Mascara());
		cuentaVO.setClaveOperativaDePagos(cuenta.getCtaClaveOperativaDePagos());
		cuentaVO.setIdCuentaAsociado(cuenta.getCtaIndicadorAsociado());
		cuentaVO.setUsoCuenta(cuenta.getCtaTipoUsoCuenta());
		cuentaVO.setIndicadorAsociado(cuenta.getCtaIndicadorAsociado());
		cuentaVO.setDivisaMonedaId(cuenta.getDivisaId().getDivisaNomLargo());
	    cuentaVO.setBajaLogica(cuenta.getCtaBajaLogica());
		return cuentaVO;
		
	}
	
	

}
