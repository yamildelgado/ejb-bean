/* Todos los Derechos Reservados 2013 BCM.
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
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioProcesadoraVO;



/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
@Local
public interface CatalogoProcesadoraDAOBeanLocal extends Dao<Procesadora> {

	
	
	public abstract List<Procesadora> findBySirhIdnProcesadora(CriterioProcesadoraVO criterioProcesadoraVO);
	

	/**
	 * @param etvIdn
	 * @return
	 */
	
	public abstract List<Procesadora> findByEtvIdnProcesadora(CriterioProcesadoraVO criterioProcesadoraVO);
	
	/**
	 * @param etvIdn
	 * @return
	 * 
	 */
	
	public abstract List<Procesadora> findByEtvIdnAndSirhIdnProcesadora(CriterioProcesadoraVO criterioProcesadoraVO);
	/*fin montiel*/
	
	
	
}
