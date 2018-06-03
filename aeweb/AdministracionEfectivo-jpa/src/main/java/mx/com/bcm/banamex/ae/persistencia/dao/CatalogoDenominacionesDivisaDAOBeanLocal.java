/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioDenominacionDivisaVO;


/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */

@Local
public interface CatalogoDenominacionesDivisaDAOBeanLocal extends Dao<DenominacionDeDivisa> {
	
	/**
	 * @param critDenomiDivisas
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract List<DenominacionDeDivisa> consultaDenominacionesPorDivisaId(CriterioDenominacionDivisaVO critDenomiDivisas)	throws EfectivoAplicacionDAOException;
	
	/**
	 * @param idDivisa
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract List<DenominacionDeDivisa> consultaDenominacionById(Short idDivisa)throws EfectivoAplicacionDAOException ;

}
