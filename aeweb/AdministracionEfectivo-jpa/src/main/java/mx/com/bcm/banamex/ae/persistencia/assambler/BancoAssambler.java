/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.Banco;
import mx.com.bcm.banamex.ae.persistencia.vo.BancoVO;


/**
 * @author OCE-WCD JESUS CARBAJAL MONTES
 *
 */
public class BancoAssambler {
	/**
	 * @param bancos
	 * @return
	 */
	public static BancoVO getBancoVO(Banco bancos){
		BancoVO BancoVO=new BancoVO();
		BancoVO.setBancoIdn(bancos.getBancoIdn());
		BancoVO.setBancoDescripcionLarga(bancos.getBancoDescripcionLarga());
		BancoVO.setBancoAbrev(bancos.getBancoAbrev());
		BancoVO.setBancoDescripcionCorta(bancos.getBancoDescripcionCorta());
		BancoVO.setBancoDesPantalla(bancos.getBancoDesPantalla());
		if(bancos.getBancoBajaLogica().trim().equals("A"))
		BancoVO.setBancoBajaLogica("Activo");
		else
			BancoVO.setBancoBajaLogica("Inactivo");
		return BancoVO;
	}
}
