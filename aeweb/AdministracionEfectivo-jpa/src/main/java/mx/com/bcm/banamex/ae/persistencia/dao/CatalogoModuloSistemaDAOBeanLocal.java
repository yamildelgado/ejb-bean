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
import mx.com.bcm.banamex.ae.persistencia.modelo.ModulosSistemaAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@Local
public interface CatalogoModuloSistemaDAOBeanLocal extends Dao<ModulosSistemaAeweb>{
	
	/**
	 * @param moduloSistemaVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<ModulosSistemaAeweb> consultaModulosPorParametros(ModuloSistemaVO moduloSistemaVO)  throws EfectivoAplicacionDAOException;
	
}
