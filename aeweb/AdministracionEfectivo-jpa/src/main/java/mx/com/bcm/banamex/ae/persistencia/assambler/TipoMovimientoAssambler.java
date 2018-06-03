/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;
import mx.com.bcm.banamex.ae.persistencia.modelo.TipoMovimiento;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
public class TipoMovimientoAssambler {

	/**
	 * @param tipoMovimiento
	 * @return tipoMovimientoVO
	 */
	public static TipoMovimientoProcesadorasVO getTipoMovimientoVO(TipoMovimiento tipoMovimiento){
		TipoMovimientoProcesadorasVO tipoMovimientoVO= new TipoMovimientoProcesadorasVO();
		tipoMovimientoVO.setNombreMovimiento(tipoMovimiento.getTipomovDescripcion());
		tipoMovimientoVO.setTipoMovimiento(tipoMovimiento.getTipomovIdn());
		return tipoMovimientoVO;
	}

}