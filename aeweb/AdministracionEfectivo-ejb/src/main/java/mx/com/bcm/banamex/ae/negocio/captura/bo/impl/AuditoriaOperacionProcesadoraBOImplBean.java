package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.captura.bo.AuditoriaOperacionProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.ConsultasyReportesAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.ProcesadoraAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.TipoMovimientoAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.TiposDeOperacionAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoProcesadoraDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.ConsultasyReportesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.OperacionProcesadoraDTODAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.TipoDeMovimientoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.TipoDeOperacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadora;
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;
import mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeOperacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.TipoMovimiento;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesITDTablaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadorasListVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoOperacionesProcesadoraVO;



@Stateless
public class AuditoriaOperacionProcesadoraBOImplBean implements AuditoriaOperacionProcesadoraBOBeanLocal {

	@EJB private ConsultasyReportesDAOBeanLocal ReporteProcesadoraDAO;
	@EJB private OperacionProcesadoraDTODAOBeanLocal OperacionProcesadoraDTO;
	@EJB private CatalogoProcesadoraDAOBeanLocal catalogoProcesadoraDAOBeanLocal;
	@EJB private TipoDeOperacionDAOBeanLocal tipoOperacionDao;
	@Override
	public List<ConsultasyReportesProcesadoraVO> consultareporproc(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionBOException {
		 List<ConsultasyReportesProcesadoraVO> listaReporteProcesadoraVO=new ArrayList<ConsultasyReportesProcesadoraVO>();
		 List<DetalleInterfaceProcesadora> listaReporteProcesadora = new ArrayList<DetalleInterfaceProcesadora>();
		try {
			listaReporteProcesadora = this.ReporteProcesadoraDAO.consultaReporProcesadora(criterioConsultasyReportesProcesadoraVO);
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(DetalleInterfaceProcesadora elemento:listaReporteProcesadora){
			 ConsultasyReportesProcesadoraVO consultasyReportesProcesadoraVO=ConsultasyReportesAssambler.getReportproceVO(elemento);
			 listaReporteProcesadoraVO.add(consultasyReportesProcesadoraVO);
		 }
		return listaReporteProcesadoraVO;
	}
	@Override
	public List<ConsultasyReportesProcesadoraVO> consultaDetalleProcesadora(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionBOException {
		 List<ConsultasyReportesProcesadoraVO> listaReporteProcesadoraVO=new ArrayList<ConsultasyReportesProcesadoraVO>();
		 List<DetalleInterfaceProcesadora> listaReporteProcesadora = new ArrayList<DetalleInterfaceProcesadora>();
		try {
			listaReporteProcesadora = this.ReporteProcesadoraDAO.consultaReporProcesadora(criterioConsultasyReportesProcesadoraVO);
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(DetalleInterfaceProcesadora elemento:listaReporteProcesadora){
			 ConsultasyReportesProcesadoraVO consultasyReportesProcesadoraVO=ConsultasyReportesAssambler.getReportproceVO(elemento);
			 listaReporteProcesadoraVO.add(consultasyReportesProcesadoraVO);
		 }
		return listaReporteProcesadoraVO;
	}
	@Override
	public List<ConsultasyReportesProcesadoraVO> consProctodo() throws EfectivoAplicacionBOException {
		 List<ConsultasyReportesProcesadoraVO> listaReporteProcesadoraVO=new ArrayList<ConsultasyReportesProcesadoraVO>();
		 List<DetalleInterfaceProcesadora> listaReporteProcesadora = new ArrayList<DetalleInterfaceProcesadora>();
		listaReporteProcesadora = this.ReporteProcesadoraDAO.findAll();
		 for(DetalleInterfaceProcesadora elemento:listaReporteProcesadora){
			 ConsultasyReportesProcesadoraVO consultasyReportesProcesadoraVO=ConsultasyReportesAssambler.getReportproceVO(elemento);
			 listaReporteProcesadoraVO.add(consultasyReportesProcesadoraVO);
		 }
		return listaReporteProcesadoraVO;
	}
	@Override
	public List<ProcesadorasListVO> consProcesadoraList() throws EfectivoAplicacionBOException {
		 List<ProcesadorasListVO> listaReporteProcesadoraVO=new ArrayList<ProcesadorasListVO>();
		 List<OperacionProcesadoraDTO> listaReporteProcesadora = new ArrayList<OperacionProcesadoraDTO>();
		try {
			listaReporteProcesadora = this.OperacionProcesadoraDTO.consultaReporProcesadoraEtvSirh();
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(OperacionProcesadoraDTO elemento:listaReporteProcesadora){
			 ProcesadorasListVO procesadorasListVO=ConsultasyReportesAssambler.getProcesadoraListVO(elemento);
			 listaReporteProcesadoraVO.add(procesadorasListVO);
		 }
		return listaReporteProcesadoraVO;
	}
	
	@Override
	public List<ConsultasyReportesProcesadoraVO> consultaReporAudiOpProc(CriterioConsultasyReportesProcesadoraVO criterioConsultasyReportesProcesadoraVO) throws EfectivoAplicacionBOException {
		 List<ConsultasyReportesProcesadoraVO> listaReporteProcesadoraVO=new ArrayList<ConsultasyReportesProcesadoraVO>();
		 List<DetalleInterfaceProcesadora> listaReporteProcesadora = new ArrayList<DetalleInterfaceProcesadora>();
		try {
			listaReporteProcesadora = this.ReporteProcesadoraDAO.consultaAudtoriaProcesadora(criterioConsultasyReportesProcesadoraVO);
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(DetalleInterfaceProcesadora elemento:listaReporteProcesadora){
			 ConsultasyReportesProcesadoraVO consultasyReportesProcesadoraVO=ConsultasyReportesAssambler.getReportproceVO(elemento);
			 listaReporteProcesadoraVO.add(consultasyReportesProcesadoraVO);
		 }
	   
		return listaReporteProcesadoraVO;
	}
	
	
	
	public List<TipoOperacionesProcesadoraVO> consultaOperacionesTipo() throws EfectivoAplicacionBOException{
		List<TipoOperacionesProcesadoraVO> listaTipoOpVO=new ArrayList<TipoOperacionesProcesadoraVO>();
		List<TipoDeOperacion> listaTipoOperaciones=this.tipoOperacionDao.findAll();
		for(TipoDeOperacion elemento:listaTipoOperaciones){
			TipoOperacionesProcesadoraVO tipoOperacionVO=TiposDeOperacionAssambler.getTipoOperacionVO(elemento);
			listaTipoOpVO.add(tipoOperacionVO);
		}
		return listaTipoOpVO;
	}
	
	
	
	public List<ConsultasyReportesITDTablaVO> llenarTabla() throws EfectivoAplicacionBOException {
		 List<DetalleInterfaceProcesadora>  listaDetalleInterfaceProcesadora =this.ReporteProcesadoraDAO.findAll();
		 List<ConsultasyReportesITDTablaVO> listaConsultayReporteITD= new ArrayList<ConsultasyReportesITDTablaVO>();
		 ConsultasyReportesITDTablaVO  c = new ConsultasyReportesITDTablaVO();//3
		 ConsultasyReportesProcesadoraVO con = new ConsultasyReportesProcesadoraVO();//todo
		 for(DetalleInterfaceProcesadora elemento:listaDetalleInterfaceProcesadora){
			 con =  ConsultasyReportesAssambler.getReportproceVO(elemento);
			 c.setDenominacion(con.getDetprocDenominacion1());
			 c.setDenominacion(con.getDetprocDenominacion2());
			 c.setDenominacion(con.getDetprocDenominacion3());
			 c.setDenominacion(con.getDetprocDenominacion4());
			 c.setDenominacion(con.getDetprocDenominacion5());
			 c.setDenominacion(con.getDetprocDenominacion6());
			 c.setDenominacion(con.getDetprocDenominacion7());
			 c.setDenominacion(con.getDetprocDenominacion8());
			 c.setDenominacion(con.getDetprocDenominacion9());
			 c.setDenominacion(con.getDetprocDenominacion10());
			 c.setDenominacion(con.getDetprocDenominacion11());
			 c.setDenominacion(con.getDetprocDenominacion12());
			 c.setDenominacion(con.getDetprocDenominacion13());
			 c.setDenominacion(con.getDetprocDenominacion14());
			 c.setDenominacion(con.getDetprocDenominacion15());
			 c.setDenominacion(con.getDetprocDenominacion16());
			 c.setDenominacion(con.getDetprocDenominacion17());
			 c.setDenominacion(con.getDetprocDenominacion18());
			 c.setDenominacion(con.getDetprocDenominacion19());
			 c.setDenominacion(con.getDetprocDenominacion20());
			 c.setDenominacion(con.getDetprocDenominacion21());
			 c.setDenominacion(con.getDetprocDenominacion22());
			 c.setDenominacion(con.getDetprocDenominacion23());
			 c.setImporte(con.getDetprocImpte1());
			 c.setImporte(con.getDetprocImpte2());
			 c.setImporte(con.getDetprocImpte3());
			 c.setImporte(con.getDetprocImpte4());
			 c.setImporte(con.getDetprocImpte5());
			 c.setImporte(con.getDetprocImpte6());
			 c.setImporte(con.getDetprocImpte7());
			 c.setImporte(con.getDetprocImpte8());
			 c.setImporte(con.getDetprocImpte9());
			 c.setImporte(con.getDetprocImpte10());
			 c.setImporte(con.getDetprocImpte11());
			 c.setImporte(con.getDetprocImpte12());
			 c.setImporte(con.getDetprocImpte13());
			 c.setImporte(con.getDetprocImpte14());
			 c.setImporte(con.getDetprocImpte15());
			 c.setImporte(con.getDetprocImpte16());
			 c.setImporte(con.getDetprocImpte18());
			 c.setImporte(con.getDetprocImpte19());
			 c.setImporte(con.getDetprocImpte20());
			 c.setImporte(con.getDetprocImpte21());
			 c.setImporte(con.getDetprocImpte22());
			 c.setImporte(con.getDetprocImpte23());
			 c.setTipo(con.getDetprocTipoBill1());
			 c.setTipo(con.getDetprocTipoBill2());
			 c.setTipo(con.getDetprocTipoBill3());
			 c.setTipo(con.getDetprocTipoBill4());
			 c.setTipo(con.getDetprocTipoBill5());
			 c.setTipo(con.getDetprocTipoBill6());
			 c.setTipo(con.getDetprocTipoBill7());
			 c.setTipo(con.getDetprocTipoBill8());
			 c.setTipo(con.getDetprocTipoBill9());
			 c.setTipo(con.getDetprocTipoBill10());
			 c.setTipo(con.getDetprocTipoBill11());
			 c.setTipo(con.getDetprocTipoBill12());
			 c.setTipo(con.getDetprocTipoBill13());
			 c.setTipo(con.getDetprocTipoBill14());
			 c.setTipo(con.getDetprocTipoBill15());
			 c.setTipo(con.getDetprocTipoBill16());
			 c.setTipo(con.getDetprocTipoBill17());
			 c.setTipo(con.getDetprocTipoBill18());
			 c.setTipo(con.getDetprocTipoBill19());
			 c.setTipo(con.getDetprocTipoBill20());
			 c.setTipo(con.getDetprocTipoBill21());
			 c.setTipo(con.getDetprocTipoBill22());
			 c.setTipo(con.getDetprocTipoBill23());
			 
		 }
		 return listaConsultayReporteITD;
		 }
	
	
	
	
	
}
