/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao;



import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Contrato;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public interface CatalogoContratoDAOBeanLocal extends Dao<Contrato> {
	
	/**
	 * @param contratoVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public Contrato getContratoPorId(CriterioContratoVO contratoVO) throws EfectivoAplicacionDAOException;
	

}
