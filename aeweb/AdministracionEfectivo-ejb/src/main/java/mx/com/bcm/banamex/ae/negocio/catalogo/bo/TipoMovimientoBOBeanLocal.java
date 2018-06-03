package mx.com.bcm.banamex.ae.negocio.catalogo.bo;
import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;

import java.util.List;

/**
* @author INGRET AGUILAR VELAZQUEZ
*
*/
public @Local interface TipoMovimientoBOBeanLocal {
	/**
	 * @return List<> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<TipoMovimientoProcesadorasVO> consultaOperacionesMov()throws EfectivoAplicacionBOException;

	
}