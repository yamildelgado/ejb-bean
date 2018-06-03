/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Envase;
import mx.com.bcm.banamex.ae.persistencia.modelo.EnvasePK;
import mx.com.bcm.banamex.ae.persistencia.vo.EnvaseVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class EnvaseAssambler {
	
	public static Envase getEnvase(EnvaseVO envaseVO)
	{
		Envase envase=new Envase();
		
		EnvasePK env=new EnvasePK();
		env.setCompbteId(envaseVO.getCompbteId());
		env.setEnvcNumPlomo(envaseVO.getEnvcNumPlomo());
		
		envase.setEnvcExcedGrapa(envaseVO.getEnvcExcedGrapa());
		envase.setEnvcExcedMaxImpte(envaseVO.getEnvcExcedMaxImpte());
		envase.setEnvcFecAsign(envaseVO.getEnvcFecAsign());
		envase.setEnvcFecContable(envaseVO.getEnvcFecContable());
		envase.setEnvcFecTermino(envaseVO.getEnvcFecTermino());
		envase.setEnvcImpteDifMe(envaseVO.getEnvcImpteDifMe());
		envase.setEnvcImpteDifMn(envaseVO.getEnvcImpteDifMn());
		envase.setEnvcMezclaConcep(envaseVO.getEnvcMezclaConcep());
		envase.setEnvcNumDocsSbc(envaseVO.getEnvcNumDocsSbc());
		envase.setEnvcNumParciales(envaseVO.getEnvcNumParciales());
		envase.setEnvcReasign(envaseVO.getEnvcReasign());
		
		return envase;
		
	}

}
