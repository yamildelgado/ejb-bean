/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAeweb;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatGeneralAewebPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CatGeneralAewebVO;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class CatGeneralAewebAssambler {
	/**
	 * @param CatGeneralAewebVO
	 * @return
	 */
	public static CatGeneralAewebVO getCatGeneralAewebVO (CatGeneralAeweb catGeneralAeweb){
		
		CatGeneralAewebVO catGeneralAewebVO = new CatGeneralAewebVO();
		
		catGeneralAewebVO.setAewebcatgralDescripcion(catGeneralAeweb.getAewebcatgralDescripcion());
		catGeneralAewebVO.setAewebcatgralIdn(catGeneralAeweb.getCatGeneralAewebPK().getAewebcatgralIdn());
		catGeneralAewebVO.setAgrupadorIdn(catGeneralAeweb.getCatGeneralAewebPK().getAgrupadorIdn());
		
		return catGeneralAewebVO;
		
	}
	/**
	 * @param CatGeneralAewebVO
	 * @return
	 */
	public static CatGeneralAeweb getCatGeneralAeweb (CatGeneralAewebVO catGeneralAewebVO){
		CatGeneralAeweb catGeneralAeweb = new CatGeneralAeweb();
		CatGeneralAewebPK catGeneralAewebPK = new CatGeneralAewebPK();
		
		catGeneralAeweb.setAewebcatgralDescripcion(catGeneralAewebVO.getAewebcatgralDescripcion());
		catGeneralAewebPK.setAewebcatgralIdn(catGeneralAewebVO.getAewebcatgralIdn());
		catGeneralAewebPK.setAgrupadorIdn(catGeneralAewebVO.getAgrupadorIdn());
		
		return catGeneralAeweb;	
	}
}
