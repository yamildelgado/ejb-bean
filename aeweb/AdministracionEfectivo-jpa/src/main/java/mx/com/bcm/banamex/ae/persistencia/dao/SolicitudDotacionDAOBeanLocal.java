/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local 
public interface SolicitudDotacionDAOBeanLocal extends Dao<UnidadDeNegocio>{
	
	public abstract List<UnidadDeNegocio> consultaUnidadDeNegocio(CriteriaUnidadNegocioVO criteriaUnidadNegocioVO) throws EfectivoAplicacionDAOException;
	

}


