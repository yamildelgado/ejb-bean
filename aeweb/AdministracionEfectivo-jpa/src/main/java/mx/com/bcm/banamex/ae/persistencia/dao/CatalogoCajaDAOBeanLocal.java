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
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public interface CatalogoCajaDAOBeanLocal extends Dao<Caja> {
	/**
	 * @param cajaVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
		public List<Caja> consultaCajaFiltros(CriterioCajaVO cCajaVO) throws EfectivoAplicacionDAOException;
		
		public List<Caja> buscarCajasPorSubBoveda(int subBovedaid) throws EfectivoAplicacionDAOException;
		
		public List<Caja> buscarCajasPorTurno(String turnoId) throws EfectivoAplicacionDAOException ;
}
