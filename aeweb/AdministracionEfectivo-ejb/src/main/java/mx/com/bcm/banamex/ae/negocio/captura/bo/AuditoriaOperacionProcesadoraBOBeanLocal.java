package mx.com.bcm.banamex.ae.negocio.captura.bo;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.Column;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesITDTablaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadorasListVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;



@Local
public interface AuditoriaOperacionProcesadoraBOBeanLocal {
	/**
	 * @param sirhAsoc
	 * @return ConsultasyReportesProcesadoraVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ConsultasyReportesProcesadoraVO> consultareporproc(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionBOException;

	/**
	 * @param criterioConsultasyReportesProcesadoraVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ConsultasyReportesProcesadoraVO> consultaDetalleProcesadora(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)throws EfectivoAplicacionBOException;

	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ConsultasyReportesProcesadoraVO> consProctodo() throws EfectivoAplicacionBOException;

	/**
	 * @return tevidn y sirh
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ProcesadorasListVO> consProcesadoraList() throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	
	public List<ConsultasyReportesITDTablaVO> llenarTabla() throws EfectivoAplicacionBOException ;
		
	public abstract List<ConsultasyReportesProcesadoraVO> consultaReporAudiOpProc(
			CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)
			throws EfectivoAplicacionBOException;



	
}
