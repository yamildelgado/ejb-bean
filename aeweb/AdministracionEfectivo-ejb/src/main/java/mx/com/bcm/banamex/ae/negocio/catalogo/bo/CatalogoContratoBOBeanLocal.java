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
import mx.com.bcm.banamex.ae.persistencia.vo.ContratoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Local
public interface CatalogoContratoBOBeanLocal { 
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ContratoVO> consultaContrato() throws EfectivoAplicacionBOException;
	
	/**
	 * @param criterioContratoVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ContratoVO> consultaContratoPorId(CriterioContratoVO criterioContratoVO ) throws EfectivoAplicacionBOException;
	/**
	 * @param criterioContratoVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract  ContratoVO consultaContratoPorNumeroContrato(CriterioContratoVO criterioContratoVO ) throws EfectivoAplicacionBOException;
}
