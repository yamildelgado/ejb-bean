package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;
import net.sf.jasperreports.engine.JRException;


/**
 * @author CARLOS MONTIEL GUTIÉRREZ Describe : La clase muestra un ejemplo claro
 *         de como consumir servicios y concatena el valor de una cadena.
 */

@ManagedBean(name = "procesadoraGridMB")
@RequestScoped
public class ProcesadoraGridMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private ProcesadoraVO procesadoraVO;
	private List<ProcesadoraVO> listaProcesadora;
	private List<ProcesadoraVO> listaProcesadoraEdit;
	private List<ProcesadoraVO> listarReportAUX;
	private MensajeAewebVO mensajeError;
	private CriterioProcesadoraVO criterioProcesadoraVO;
	private GlobalReportAbstract reportProcesadora;
	

@PostConstruct
	public void init() {
		procesadoraVO = new ProcesadoraVO();
		criterioProcesadoraVO = new CriterioProcesadoraVO();
		
		try {

			this.consultaProcesadora();

		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * hace una consulta de todos los registros
	 */
	public void consultaProcesadora() throws EfectivoAplicacionBOException {
		
		this.listaProcesadora = this.catalogoFacade.getCatalogoProcesadoraBO().consultaProcesadora();	

	}

	/*
	 * hace una consulta por criterio de busqueda
	 */

	public void consultaProcesadoraPorCriterioBusqueda(ActionEvent event)
			throws EfectivoAplicacionBOException {
		
		
		this.listaProcesadora = this.catalogoFacade.getCatalogoProcesadoraBO()
				.consultaProcesadoraPorCriterioBusqueda(criterioProcesadoraVO);		
		criterioProcesadoraVO = new CriterioProcesadoraVO();
		if (this.listaProcesadora.isEmpty()) {

			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.CONSULTA_VACIA.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError
					.getMensajeDescripcion());

		}

		else {
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO
									.getValue());
			ErrorMessageHelper.addSuccessMessage(mensajeError
					.getMensajeDescripcion());
		}

	}

	public String consultaEditProcesadoras()
			throws EfectivoAplicacionBOException {

		String idEtv = UtileriaHelper.getParam("procesadoraEtv");
		String idSirh = UtileriaHelper.getParam("procesadoraSirh");

		this.criterioProcesadoraVO.setProcesadoraEtvId(Short.parseShort(idEtv));
		this.criterioProcesadoraVO.setProcesadoraSirhId(Integer
				.parseInt(idSirh));
		this.listaProcesadoraEdit = this.catalogoFacade
				.getCatalogoProcesadoraBO()
				.consultaProcesadoraPorCriterioBusqueda(criterioProcesadoraVO);

		this.procesadoraVO = this.listaProcesadoraEdit.get(0);
		criterioProcesadoraVO = new CriterioProcesadoraVO();

		return "procesadorasEdit";
	}

	public void addProcesadoras(ActionEvent event)
			throws EfectivoAplicacionBOException {
		String hora = this.procesadoraVO.getFrecBusqueda();
		String RegExPattern = "^(([0-2]\\d)|(2[0-9])):(([0-5]\\d)|(2[0-9]))$";

		Pattern pattern = Pattern.compile(RegExPattern);
		Matcher matcher = pattern.matcher(hora);

		if (!matcher.matches()) {
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.HORA.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError
					.getMensajeDescripcion());
		}

		else {

			String carpeta = this.procesadoraVO.getProcesadoraIntelar();

			String RegExPatternurl = "^(/+[\\w\\s-.+\\/]+/+)$";
			Pattern pattern2 = Pattern.compile(RegExPatternurl);
			Matcher matcher2 = pattern2.matcher(carpeta);

			if (!matcher2.matches()) {
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.PATH.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError
						.getMensajeDescripcion());
			}

			else {
				procesadoraVO.setProcesadoraBajaLogica("A");
				this.catalogoFacade.getCatalogoProcesadoraBO().addProcesadora(
						procesadoraVO);
				this.consultaProcesadora();
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.ALTA_CATALOGO.getValue());
				ErrorMessageHelper.addSuccessMessage(mensajeError
						.getMensajeDescripcion());
			}
		}

	}

	public void editProcesadoras(ActionEvent event)
			throws EfectivoAplicacionBOException {
		String hora = this.procesadoraVO.getFrecBusqueda();
		String RegExPattern = "^(([0-2]\\d)|(2[0-9])):(([0-5]\\d)|(2[0-9]))$";
		Pattern pattern = Pattern.compile(RegExPattern);
		Matcher matcher = pattern.matcher(hora);
		if (!matcher.matches()) {
			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.HORA.getValue());
			ErrorMessageHelper.addErrorMessage(mensajeError
					.getMensajeDescripcion());
		}

		else {
			String carpeta = this.procesadoraVO.getProcesadoraIntelar();

			String RegExPatternurl = "^(/+[\\w\\s-.+\\/]+/+)$";
			Pattern pattern2 = Pattern.compile(RegExPatternurl);
			Matcher matcher2 = pattern2.matcher(carpeta);

			if (!matcher2.matches()) {
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.PATH.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError
						.getMensajeDescripcion());
			}

			else {

				this.catalogoFacade.getCatalogoProcesadoraBO().editProcesadora(
						procesadoraVO);
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.ACTUALIZACION_CATALOGO
										.getValue());
				ErrorMessageHelper.addSuccessMessage(mensajeError
						.getMensajeDescripcion());
			}
		}

	}
	public void generarRepore(ActionEvent event) throws EfectivoAplicacionBOException  {
			this.reportProcesadora = new GlobalReportAbstract();
			this.listarReportAUX = this.getListaProcesadora();
			
			try {
				
			
				this.reportProcesadora.prepararReporte(this.listarReportAUX,"Procesadoras.jasper");
				this.reportProcesadora.PDF("ReporteCatProcesadora");
			} catch (JRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		

	}
	
	
	

	/**
	 * @return the catalogoFacade
	 */
	public CatalogoFacade getCatalogoFacade() {
		return catalogoFacade;
	}

	/**
	 * @param catalogoFacade
	 *            the catalogoFacade to set
	 */
	public void setCatalogoFacade(CatalogoFacade catalogoFacade) {
		this.catalogoFacade = catalogoFacade;
	}

	/**
	 * @return the listaProcesadora
	 */
	public List<ProcesadoraVO> getListaProcesadora() {
		/*if(this.listaProcesadora == null){
			this.init();
		}*/
		return listaProcesadora;
	}

	/**
	 * @param listaProcesadora
	 *            the listaProcesadora to set
	 */
	public void setListaProcesadora(List<ProcesadoraVO> listaProcesadora) {
		this.listaProcesadora = listaProcesadora;
	}

	/**
	 * @return the procesadoraVO
	 */
	public ProcesadoraVO getProcesadoraVO() {
		return procesadoraVO;
	}

	/**
	 * @param procesadoraVO
	 *            the procesadoraVO to set
	 */
	public void setProcesadoraVO(ProcesadoraVO procesadoraVO) {
		this.procesadoraVO = procesadoraVO;
	}

	/**
	 * @return the criterioProcesadoraVO
	 */
	public CriterioProcesadoraVO getCriterioProcesadoraVO() {
		return criterioProcesadoraVO;
	}

	/**
	 * @param criterioProcesadoraVO
	 *            the criterioProcesadoraVO to set
	 */
	public void setCriterioProcesadoraVO(
			CriterioProcesadoraVO criterioProcesadoraVO) {
		this.criterioProcesadoraVO = criterioProcesadoraVO;
	}

	


}