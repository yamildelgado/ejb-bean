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
import mx.com.bcm.banamex.ae.persistencia.modelo.Estructura;
import mx.com.bcm.banamex.ae.persistencia.vo.EstructuraVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@Local
public interface CatalogoSIRHDAOBeanLocal extends Dao<Estructura>{
	public List<Estructura> consultaSirhPorBoveda(EstructuraVO estructuraVO) throws EfectivoAplicacionDAOException;
}
