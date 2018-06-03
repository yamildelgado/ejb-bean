/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;


import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public interface ConsultasyReportesDAOBeanLocal extends Dao<DetalleInterfaceProcesadora> {
	public List<DetalleInterfaceProcesadora> consultaReporProcesadora(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionDAOException;

	/**
	 * @param criterioConsultasyReportesProcesadoraVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<DetalleInterfaceProcesadora> consultaReporProcesadoraporId(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionDAOException;

	/**
	 * @param criterioConsultasyReportesProcesadoraVO
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public List<DetalleInterfaceProcesadora> consultaAudtoriaProcesadora(
			CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)
			throws EfectivoAplicacionDAOException;
	
}









