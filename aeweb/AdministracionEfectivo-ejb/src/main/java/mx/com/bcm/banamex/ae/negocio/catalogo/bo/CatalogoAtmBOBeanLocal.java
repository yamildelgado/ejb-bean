
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
import mx.com.bcm.banamex.ae.persistencia.vo.AtmVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAtmVO;

/**
 * @author OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
public @Local interface CatalogoAtmBOBeanLocal {
	

	/**
	 * @return List<AtmVO> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<AtmVO> consultAtms() throws EfectivoAplicacionBOException;
	/**
	 * @param sirhAsoc
	 * @return AtmVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<AtmVO> consultAtmPorIdAtms(CriterioAtmVO criterioAtmVO) throws EfectivoAplicacionBOException;
	
	
	
	
	
}




