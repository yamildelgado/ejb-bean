/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesITDTablaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadorasListVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;
import net.sf.jasperreports.engine.JRException;

/**
 * @author JESUS CARBAJAL MONTES
 * @author INGRET AGUILAR VELAZQUEZ
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name = "operProcGridMB")
@RequestScoped
public class ConsultayReportesProcesadoraGridMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private CriterioConsultasyReportesProcesadoraVO criterioVO;
	private List<TipoMovimientoProcesadorasVO> listaMovimientosVO;
	private List<ProcesadoraVO> listaProcesadoraVO;
	private List<ConsultasyReportesITDTablaVO> listaTablaVO;
	private String fechaAuditoria;
	private List<ConsultasyReportesProcesadoraVO> listaConsultayReportesProcesadoraVO;
	private List<ProcesadorasListVO> listaetvsirh;
	private ConsultasyReportesProcesadoraVO operacionVO;
	private GlobalReportAbstract reportConRepProc;
	private HashMap<Short,String> operPropiedades;
	
	@PostConstruct
	public void init() {
		listaConsultayReportesProcesadoraVO = new ArrayList<ConsultasyReportesProcesadoraVO>();
		ConsultasyReportesProcesadoraVO conRepProc =new ConsultasyReportesProcesadoraVO();
		conRepProc.setTipoMovimiento((short)201);
		listaConsultayReportesProcesadoraVO.add(conRepProc);
	
		
		

		/*this.operacionVO=new ConsultasyReportesProcesadoraVO();
		try {
			this.cargadescripcion();
			this.consultaTablaProcesadora();
			} catch (EfectivoAplicacionBOException e) {
			e.printStackTrace();
		}*/
	}
	

	public String  consDetalle() throws EfectivoAplicacionBOException{
		short to=this.operacionVO.getTipoMovimiento();
		return this.direccionaPagina((short)to);
	}
	public void consultaTablaProcesadora() throws EfectivoAplicacionBOException{
		this.listaTablaVO=this.catalogoFacade.getConsultayReportesProcesadoraBO().llenarTabla();
	}

	public void consultarOpracionesDeProcesadora() throws EfectivoAplicacionBOException{
		this.listaConsultayReportesProcesadoraVO=this.catalogoFacade.getConsultayReportesProcesadoraBO().consultareporproc(this.criterioVO);
	}
	
	public String regresar(){
		this.operacionVO = new ConsultasyReportesProcesadoraVO();
		return "operacionesprocesadoras"; 
	}
	
	/*public void generarRepore() throws JRException, IOException{
		this.reportOperProc=new GlobalReportAbstract();
		this.listaConsultayReportesProcesadoraVO.clear();
		this.listaConsultayReportesProcesadoraVO.add(this.operacionVO);

		String propiedades=this.operPropiedades.get(this.operacionVO.getTipomovIdn());
		String propReporte[]=propiedades.split("\\|");
		String reporte=propReporte[1];
		String nombreReporte=propReporte[2];
		this.reportOperProc.prepararReporte(this.listaConsultayReportesProcesadoraVO, reporte);
		this.reportOperProc.PDF(nombreReporte);
		//String propiedades1=this.operPropiedades.get(this.operacionVO.getTipomovIdn());
		//String propReporte[]=propiedades.split("\\|");
		//String reporte=propReporte[1];
		//String nombreReporte=propReporte[2];
	    this.reportOperProc.prepararReporte(this.listaConsultayReportesProcesadoraVO, reporte);
		this.reportOperProc.PDF(nombreReporte);
	}*/
	public String direccionaPagina(short tipoMovimiento)
	{
	String propiedades=this.operPropiedades.get(tipoMovimiento);
	String [] pagina=propiedades.split("\\|");
	return pagina[0];
	}
	
	public void cargadescripcion() throws EfectivoAplicacionBOException
	{
		this.operPropiedades=new HashMap<Short,String>();		 
		this.operPropiedades.put((short) 201,"depositoSeguro|DepositoSeguro.jasper|ReporteCatDepositoSeguro");
		this.operPropiedades.put((short) 202,"cargoPorFaltante|CargoPorFaltante.jasper|ReporteCatCargoPorFaltante");
		this.operPropiedades.put((short) 203,"abonoPorSobrante|AbonoPorSobrante.jasper|ReporteCatAbonoPorSobrante");
		this.operPropiedades.put((short) 204,"DepositoSeguroDolares|DepósitoSeguroDólares.jasper|ReporteCatDepositoSeguroDolares");
		this.operPropiedades.put((short) 205,"depositoSeguroChequesBmx|DepositoSeguroChequesBmx.jasper|ReporteCatDepositoSeguroChequesBmx");
		this.operPropiedades.put((short) 206,"depositoSeguroChequesBmxDolares|DepositoSeguroChequesBMxDolares.jasper|ReporteCatDepositoSeguroChequesBMxDolares");
		this.operPropiedades.put((short) 207,"depositoSeguroChequesSBC|DepositoSeguroChequesSBC.jasper|ReporteCatDepositoSeguroChequesSBC");
		this.operPropiedades.put((short) 208,"depositoSeguroChequesSBCDolares|DepositoSeguroChequesSBCDolares.jasper|ReporteCatDepositoSeguroChequesSBCDolares");
		this.operPropiedades.put((short) 209,"pemex|DepositosEfectivoPemex.jasper|ReporteCatDepositoEfectivoPemex");
		this.operPropiedades.put((short) 211,"depositoPrecapturaSef|DepositoPrecapturaSEF.jasper|ReporteCatDepositoPrecapturaSEF");
		this.operPropiedades.put((short) 251,"dotacionCliente|DotaciónClientes.jasper|ReporteCatDotacionCliente");
		this.operPropiedades.put((short) 252,"dotacionSucursales|DotaciónSucursales.jasper|ReporteCatDotacionSucursales");
		this.operPropiedades.put((short) 253,"dotacionAtms|DotaciónATMs.jasper|ReporteCatDotacionATMs");
		this.operPropiedades.put((short) 254,"TraspasoCPAE|TraspasoCPAE.jasper|ReporteCatTraspasoCPAE");
		this.operPropiedades.put((short) 255,"traspasoIntercajas|TraspasoIntercajas.jasper|ReporteCatTraspasoIntercajas");
		this.operPropiedades.put((short) 256,"dotacionBanxico|DotaciónBanxico.jasper|ReporteCatDotacionBanxico");
		this.operPropiedades.put((short) 257,"exportacionDeDivisas|ExportaciónDivisas.jasper|ReporteCatExportacionDivisas");
		this.operPropiedades.put((short) 258,"retiroBanxico|RetiroBanxico.jasper|ReporteCatRetiroBanxico");
		this.operPropiedades.put((short) 259,"concentracionSucursales|ConcentracionSucursales.jasper|ReporteCatConcentracionSucursales");
		this.operPropiedades.put((short) 260,"importacionDivisas|ImportaciónDivisas.jasper|ReporteCatImportacionDivisas");
		this.operPropiedades.put((short) 291,"rechazoEnvase|RechazoDelEnvase.jasper|ReporteCatRechazoDelEnvase");
		this.criterioVO=new  CriterioConsultasyReportesProcesadoraVO();
		this.listaConsultayReportesProcesadoraVO = this.catalogoFacade.getConsultayReportesProcesadoraBO().consProctodo();
		this.listaMovimientosVO= this.catalogoFacade.getTipoMovimientoProcesadorasBO().consultaOperacionesMov();
		this.listaProcesadoraVO= this.catalogoFacade.getCatalogoProcesadoraBO().consultaProcesadora();
	}
	public CriterioConsultasyReportesProcesadoraVO getCriterioVO() {
		return criterioVO;
	}
	public void setCriterioVO(CriterioConsultasyReportesProcesadoraVO criterioVO) {
		this.criterioVO = criterioVO;
	}
	public List<TipoMovimientoProcesadorasVO> getListaMovimientosVO() {
		return listaMovimientosVO;
	}
	public void setListaMovimientosVO(List<TipoMovimientoProcesadorasVO> listaMovimientosVO) {
		this.listaMovimientosVO = listaMovimientosVO;
	}
	public List<ConsultasyReportesProcesadoraVO> getListaConsultayReportesProcesadoraVO() {
		return listaConsultayReportesProcesadoraVO;
	}
	public void setListaConsultayReportesProcesadoraVO(
			List<ConsultasyReportesProcesadoraVO> listaConsultayReportesProcesadoraVO) {
		this.listaConsultayReportesProcesadoraVO = listaConsultayReportesProcesadoraVO;
	}

	public ConsultasyReportesProcesadoraVO getOperacionVO() {
		return operacionVO;
	}
	public void setOperacionVO(ConsultasyReportesProcesadoraVO operacionVO) {
		this.operacionVO = operacionVO;
	}
	public List<ProcesadorasListVO> getListaetvsirh() {
		return listaetvsirh;
	}
	public void setListaetvsirh(List<ProcesadorasListVO> listaetvsirh) {
		this.listaetvsirh = listaetvsirh;
	}

	/**
	 * @return the listaProcesadoraVO
	 */
	public List<ProcesadoraVO> getListaProcesadoraVO() {
		return listaProcesadoraVO;
	}

	/**
	 * @param listaProcesadoraVO the listaProcesadoraVO to set
	 */
	public void setListaProcesadoraVO(List<ProcesadoraVO> listaProcesadoraVO) {
		this.listaProcesadoraVO = listaProcesadoraVO;
	}
	
	
	
	

	/**
	 * @return the listaTablaVO
	 */
	public List<ConsultasyReportesITDTablaVO> getListaTablaVO() {
		return listaTablaVO;
	}


	/**
	 * @param listaTablaVO the listaTablaVO to set
	 */
	public void setListaTablaVO(List<ConsultasyReportesITDTablaVO> listaTablaVO) {
		this.listaTablaVO = listaTablaVO;
	}


	public String fechaActual(){
		
		Calendar fecha = new GregorianCalendar();
		int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        fechaAuditoria= dia + "/" + (mes+1) + "/" + anio;
        
		return fechaAuditoria;
	}
public void generarRepore() throws JRException, IOException{
		
		reportConRepProc = new  GlobalReportAbstract();
		reportConRepProc.prepararReporte(listaConsultayReportesProcesadoraVO,"MovimientosDeProcesadora.jasper");
		this.reportConRepProc.PDF("ReporteMovimientosDeProcesadora");
		


		
	}
}