package mx.com.bcm.banamex.ae.apliacion.web.controller.captura;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import net.sf.jasperreports.engine.JRException;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.HistTurnoEnOperacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DiasInhabilesVO;
import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
@ManagedBean(name = "cambioDeLaFechaContableGridMB")
@RequestScoped
public class CambioDeLaFechaContableGridMB {
	@EJB	CapturaFacade capturaFacade;
	@EJB	CatalogoFacade catalogoFacade;
	private List<TurnoVO> listaTurnoVO;
	private Map<String, Boolean> checked = new HashMap<String, Boolean>();
	private List<HistTurnoEnOperacionVO> listHistTurnoVO;
	private GlobalReportAbstract reportCambioDeFechaCont;
	private List<DiasInhabilesVO> listaDdfestVO;
	private CambioDeLaFechaContableVO cambioDeLaFechaContableVO;
    private List<CambioDeLaFechaContableVO> listaFechaCont;
	
    @PostConstruct

	public void init()  {

		try {
			this.obtenerTurnos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

    
	public void obtenerTurnos() throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException {
//		System.out.println("Entro al metodo");
//		listaFechaCont = capturaFacade.getCambioDeLaFechaContableBOBeanLocal().obtenerFechas();
//		cambioDeLaFechaContableVO = capturaFacade.getCambioDeLaFechaContableBOBeanLocal().obtenerEmpleado();

	}


	public void generarReportes() throws JRException, IOException{
		
		
		reportCambioDeFechaCont = new  GlobalReportAbstract();
		listaFechaCont = new ArrayList<CambioDeLaFechaContableVO>();
		listaFechaCont.addAll(listaFechaCont);
		reportCambioDeFechaCont.prepararReporte(listaFechaCont ,"Cpaes.jasper");
		reportCambioDeFechaCont.PDF("ReporteCatCambioDeFechaContable");
	
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<TurnoVO> getListaTurnoVO() {
		return listaTurnoVO;
	}
	public void setListaTurnoVO(List<TurnoVO> listaTurnoVO) {
		this.listaTurnoVO = listaTurnoVO;
	}
	public Map<String, Boolean> getChecked() {
		return checked;
	}
	public void setChecked(Map<String, Boolean> checked) {
		this.checked = checked;
	}

	public List<HistTurnoEnOperacionVO> getListHistTurnoVO() {
		return listHistTurnoVO;
	}

	public void setListHistTurnoVO(List<HistTurnoEnOperacionVO> listHistTurnoVO) {
		this.listHistTurnoVO = listHistTurnoVO;
	}


	public List<DiasInhabilesVO> getListaDdfestVO() {
		return listaDdfestVO;
	}


	public void setListaDdfestVO(List<DiasInhabilesVO> listaDdfestVO) {
		this.listaDdfestVO = listaDdfestVO;
	}

	public CambioDeLaFechaContableVO getCambioDeLaFechaContableVO() {
		return cambioDeLaFechaContableVO;
	}

	public void setCambioDeLaFechaContableVO(CambioDeLaFechaContableVO cambioDeLaFechaContableVO) {
		this.cambioDeLaFechaContableVO = cambioDeLaFechaContableVO;
	}


	public GlobalReportAbstract getReportCambioDeFechaCont() {
		return reportCambioDeFechaCont;
	}


	public void setReportCambioDeFechaCont(GlobalReportAbstract reportCambioDeFechaCont) {
		this.reportCambioDeFechaCont = reportCambioDeFechaCont;
	}


	public List<CambioDeLaFechaContableVO> getListaFechaCont() {
		CambioDeLaFechaContableVO objectUno = new CambioDeLaFechaContableVO();
		CambioDeLaFechaContableVO objectDos = new CambioDeLaFechaContableVO();
		this.listaFechaCont = new ArrayList<CambioDeLaFechaContableVO>();
	    
	    objectUno.setFecContIdn(DateFormateHelper.getFechaDate("28/01/2014"));
	    objectUno.setHora(DateFormateHelper.getFechaHoraDate("16:30:08"));
	    objectUno.setCadena("01 CPAE LEON");
	    objectUno.setSubboveda((short)1);
	    objectUno.setTurnoStatus("ACTIVO");
	    objectUno.setTurnoDes("VESPERTINO 28/01/2014 16:30:08");
	    objectUno.setStatusCamb("ACTUALIZADO");
	    this.listaFechaCont.add(objectUno);
	    
	    objectDos.setFecContIdn(DateFormateHelper.getFechaDate("28/01/2014"));
	    objectDos.setHora(DateFormateHelper.getFechaHoraDate("16:30:08"));
	    objectDos.setCadena("01 CPAE LEON");
	    objectDos.setSubboveda((short)2);
	    objectDos.setTurnoStatus("ACTIVO");
	    objectDos.setTurnoDes("VESPERTINO 28/01/2014 16:30:08");
	    objectDos.setStatusCamb("ACTUALIZADO");
	    this.listaFechaCont.add(objectDos);
	    
		return listaFechaCont;
	}


	public void setListaFechaCont(List<CambioDeLaFechaContableVO> listaFechaCont) {
		this.listaFechaCont = listaFechaCont;
	}

	
}