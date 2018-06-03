package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesITDTablaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadorasListVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;

public interface ConsultasyReportesProcesadoraBOBeanLocal {

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
	 * @return tipomovIdn y  tipomovDescripcion
	 * @throws EfectivoAplicacionBOException
	 */
	public List<TipoMovimientoProcesadorasVO> consultaOperacionesMov() throws EfectivoAplicacionBOException;
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	
	public List<ConsultasyReportesITDTablaVO> llenarTabla() throws EfectivoAplicacionBOException ;
		
}

