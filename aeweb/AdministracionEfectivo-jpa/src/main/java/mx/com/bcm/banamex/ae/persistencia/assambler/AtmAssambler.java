/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;
import mx.com.bcm.banamex.ae.persistencia.vo.AtmVO;



/**
 * @author ING. SIST. COMP. OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public class AtmAssambler {

	/**
	 * @param atmVO
	 * @return
	 */
	public static AtmVO getAtmsVO(Atm atm){
		AtmVO atmVO=new AtmVO();
		
			
		atmVO.setCpaesEstructuraSirhIdn(atm.getAtmPK().getCpaesEstructuraSirhIdn());
		atmVO.setAtmIdn(atm.getAtmPK().getAtmIdn());
		atmVO.setEtvsIdn(atm.getEtvIdn().getEtvIdn());
		
		atmVO.setAtmNumCtaUnicaAsoc(atm.getAtmNumCtaUnicaAsoc());
		atmVO.setAtmTipoOficina(atm.getAtmTipoOficina());
		atmVO.setAtmTipoInmueble(atm.getAtmTipoInmueble());
		atmVO.setAtmBajaLogica(atm.getAtmBajaLogica());
		atmVO.setAtmDescripcion(atm.getAtmDescripcion());

		
		return atmVO;
		
	}
}
