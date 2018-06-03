/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;


import java.util.List;
import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.PlazaVO;

/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 * 
 */
@Local
public interface CatalogoPlazaBOBeanLocal {

	/**
	 * @return List<PlazaVO>
	 * @throws EfectivoAplicacionBOException
	 */

	public abstract List<PlazaVO> consultaPlaza()
			throws EfectivoAplicacionBOException;

	/**
	 * @param plazaIdn
	 *            , plazaNombre
	 * @return List<PlazaVO>
	 * @throws EfectivoAplicacionBOException
	 */

	public abstract List<PlazaVO> consultPlazaPorId(long plazaIdn,
			String plazaNombre) throws EfectivoAplicacionBOException;
	/**
	 * @param plazaNombre
	 * @return List<PlazaVO>
	 * @throws EfectivoAplicacionBOException
	 */

}
