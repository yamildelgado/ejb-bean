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
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;



/**
 * @author JUAN MANUEL HERNANDEZ NAVARRO
 *
 */

public @Local interface CatalogoDivisaBOBeanLocal {
	
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<DivisaVO> consultDivisas() throws EfectivoAplicacionBOException;
		
	/**
	 * @param divisaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<DivisaVO> consultaDivisasPorNum(DivisaVO divisaVO) throws EfectivoAplicacionBOException ;
	
	/**
	 * @param divisaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<DivisaVO> consultaDivisasPorParametros(DivisaVO divisaVO) throws EfectivoAplicacionBOException;
	
}
