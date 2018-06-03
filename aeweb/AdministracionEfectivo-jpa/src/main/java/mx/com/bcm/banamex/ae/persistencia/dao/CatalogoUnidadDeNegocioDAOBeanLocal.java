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
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Local
public interface CatalogoUnidadDeNegocioDAOBeanLocal extends Dao<UnidadDeNegocio> {
	
	
	
	
	
	/**
	 * @param idUnidadNegocio
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract   UnidadDeNegocio consultaUnidadNegocioById(Short idUnidadNegocio)throws EfectivoAplicacionDAOException;
	
	/**
	 * @param criterioVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract  List<UnidadDeNegocio> consultaUnidadCriteriosDinamicos(CriteriaUnidadNegocioVO criterioVO)throws EfectivoAplicacionDAOException;
	
	/**
	 * @param unidadPK
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract  UnidadDeNegocio  consultaUnidadNegocioPk(UnidadDeNegocioPK unidadPK)throws EfectivoAplicacionDAOException;
	
	
	/**
	 * @param criterioVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract  UnidadDeNegocio  consultaUnidadNegocioDinamico(CriteriaUnidadNegocioVO criterioVO)throws EfectivoAplicacionDAOException;

}
