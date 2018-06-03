/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  */
package mx.com.bcm.banamex.ae.persistencia.dao;


import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAtmVO;


/**
 * @author OCE-WCD OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
 @Local
public interface CatalogoAtmDAOBeanLocal extends Dao<Atm> {

	 /**
	 * @param criterioAtmVO
	 * @return  List<Atm>
	 */
	public List<Atm> findByIdnAtm(CriterioAtmVO criterioAtmVO);
	 /**
	 * @return List<Atm>
	 */
	public List<Atm> findByAllAtm();
}




