/** 
* Todos los Derechos Reservados 2013 BCM.
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
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.UnidadDeNegocioVO;




/**
 * @author  YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Local
public interface CatalogoUnidadNegocioBOBeanLocal {
    
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract  List<UnidadDeNegocioVO> consultaUnidadNegocio() throws EfectivoAplicacionBOException;
	/**
	 * @param unidadVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract UnidadDeNegocioVO consultaContratosUnidadNegocio(String contrato,String sirh,String unidadNegocio) throws EfectivoAplicacionBOException;
	
	/**
	 * @param unidadVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<UnidadDeNegocioVO> consultaContratosUnidadNegocioPorCriterio(CriteriaUnidadNegocioVO unidadVO) throws EfectivoAplicacionBOException;
}
