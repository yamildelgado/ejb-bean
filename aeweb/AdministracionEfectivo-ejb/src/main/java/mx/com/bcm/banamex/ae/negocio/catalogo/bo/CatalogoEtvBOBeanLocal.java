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
import mx.com.bcm.banamex.ae.persistencia.vo.EtvVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */


public @Local interface CatalogoEtvBOBeanLocal {
	
/**
 * @return
 * @throws EfectivoAplicacionBOException
 */
public List<EtvVO> consultaEtv() throws EfectivoAplicacionBOException;
	
	/**
	 * @param etvVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public List<EtvVO> consultaEtvPorParametros(EtvVO etvVO) throws EfectivoAplicacionBOException;

}
