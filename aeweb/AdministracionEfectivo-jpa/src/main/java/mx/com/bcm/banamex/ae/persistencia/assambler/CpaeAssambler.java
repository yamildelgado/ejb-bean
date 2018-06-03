/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Cpae;
import mx.com.bcm.banamex.ae.persistencia.vo.CpaeVO;


/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 *
 */
public class CpaeAssambler {
	
	/**
	 * @param cpae
	 * @return
	 */
	public static CpaeVO getCpaeVO(Cpae cpaes){
		CpaeVO cpaeVO=new CpaeVO();
		
		
		cpaeVO.setCpaesEstructuraSirhIdn(cpaes.getCpaesEstructuraSirhIdn());
		cpaeVO.setSirhNombre(cpaes.getSirhNombre());
		cpaeVO.setSirhHorContable(cpaes.getSirhHorContable());
		cpaeVO.setSirhNumCompLote(cpaes.getSirhNumCompLote());
		cpaeVO.setSirhNumCompAsignaXCajero(cpaes.getSirhNumCompAsignaXCajero());
		cpaeVO.setSirhMontMinDifImprActa(cpaes.getSirhMontMinDifImprActa());
		cpaeVO.setSirhNumCopiasActas(cpaes.getSirhNumCopiasActas());
		cpaeVO.setSirhHorEnvaseCritico(cpaes.getSirhHorEnvaseCritico());
		cpaeVO.setSirhLimPiso(cpaes.getSirhLimPiso());
			
		return cpaeVO;		
	}
	
	/**
	 * @param cpaeVO
	 * @return
	 */
	public static Cpae  getCpaes(CpaeVO cpaeVO){
		Cpae cpaes=new Cpae();
		
		cpaes.setCpaesEstructuraSirhIdn(cpaeVO.getCpaesEstructuraSirhIdn());
		cpaes.setSirhNombre(cpaeVO.getSirhNombre());
		cpaes.setSirhHorContable(cpaeVO.getSirhHorContable());
		cpaes.setSirhNumCompLote(cpaeVO.getSirhNumCompLote());
		cpaes.setSirhNumCompAsignaXCajero(cpaeVO.getSirhNumCompAsignaXCajero());
		cpaes.setSirhMontMinDifImprActa(cpaeVO.getSirhMontMinDifImprActa());
		cpaes.setSirhNumCopiasActas(cpaeVO.getSirhNumCopiasActas());
		cpaes.setSirhHorEnvaseCritico(cpaeVO.getSirhHorEnvaseCritico());
		cpaes.setSirhLimPiso(cpaeVO.getSirhLimPiso());
		
		return cpaes;
	}

}
