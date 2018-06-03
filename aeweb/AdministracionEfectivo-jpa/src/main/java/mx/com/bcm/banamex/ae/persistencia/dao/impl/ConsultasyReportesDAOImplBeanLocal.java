/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;
import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.ConsultasyReportesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;



/**
 * @author OCE-WCD JESÚS CARBAJAL MONTES
 *
 */
@Stateless
public class ConsultasyReportesDAOImplBeanLocal extends GlobalJpaDaoBean<DetalleInterfaceProcesadora> implements ConsultasyReportesDAOBeanLocal{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleInterfaceProcesadora> consultaReporProcesadora(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)throws EfectivoAplicacionDAOException{
	
	Query query=this.em.createNamedQuery("DetalleInterfaceProcesadora.findAllbyCriterio");
	query.setParameter("tipomovIdn", criterioConsultasyReportesProcesadoraVO.getTipomovIdn());
	query.setParameter("estructraSirh", criterioConsultasyReportesProcesadoraVO.getEstructraSirh());
	query.setParameter("hdInterprocFecContableIn", criterioConsultasyReportesProcesadoraVO.getFechaInicial());
	query.setParameter("hdInterprocFecContableFin", criterioConsultasyReportesProcesadoraVO.getFechaFinal());
	return query.getResultList();
}
	
	@SuppressWarnings("unchecked")
	@Override
public List<DetalleInterfaceProcesadora> consultaAudtoriaProcesadora(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)throws EfectivoAplicacionDAOException{
	
	Query query=this.em.createNamedQuery("DetalleInterfaceProcesadora.findAllbyAuditoriaOpProc");
	query.setParameter("tipoperIdn", criterioConsultasyReportesProcesadoraVO.getTipoperIdn());
	query.setParameter("estructraSirh", criterioConsultasyReportesProcesadoraVO.getEstructraSirh());
	query.setParameter("etvIdn", criterioConsultasyReportesProcesadoraVO.getEtvIdn());
	query.setParameter("hdInterprocFecContable", criterioConsultasyReportesProcesadoraVO.getHdInterprocFecContable());
	return query.getResultList();
}
	
		
	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleInterfaceProcesadora> consultaReporProcesadoraporId(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO)throws EfectivoAplicacionDAOException{
	
	Query query=this.em.createNamedQuery("DetalleInterfaceProcesadora.findAllbyPK");
	query.setParameter("hdInterprocNumCorte", criterioConsultasyReportesProcesadoraVO.getHdInterprocNumCorte());
	query.setParameter("tipoperIdn", criterioConsultasyReportesProcesadoraVO.getTipoperIdn());
	query.setParameter("tipomovIdn", criterioConsultasyReportesProcesadoraVO.getTipomovIdn());
	query.setParameter("estructraSirh", criterioConsultasyReportesProcesadoraVO.getEstructraSirh());
	query.setParameter("etvIdn", criterioConsultasyReportesProcesadoraVO.getEtvIdn());
	query.setParameter("hdInterprocFecContable", criterioConsultasyReportesProcesadoraVO.getHdInterprocFecContable());

	return query.getResultList();
	}
}