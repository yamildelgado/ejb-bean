/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;


/**
 * 
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 *
 */
@Local
public interface CatalogoDivisaDAOBeanLocal extends Dao<Divisa> {
	

	

	/**
	 * @param divisaVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Divisa> consultaDivisaPorNum(DivisaVO divisaVO) throws EfectivoAplicacionDAOException;
	
	/**
	 * @param divisaVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<Divisa> consultaDivisaPorParametros(DivisaVO divisaVO)	throws EfectivoAplicacionDAOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public Divisa consultaDivisa(Integer idDivisa) throws EfectivoAplicacionDAOException ;
	
	
	/**
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public Divisa consultaDivisa(Short idDivisa) throws EfectivoAplicacionDAOException ;
}
