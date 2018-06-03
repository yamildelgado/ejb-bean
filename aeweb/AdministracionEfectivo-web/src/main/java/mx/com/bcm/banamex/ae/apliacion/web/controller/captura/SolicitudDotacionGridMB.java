/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.captura;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import static mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper.addErrorMessage;
import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DenominacionesDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DetalleDotacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SolicitudDotacionVO;

/**
 * @author Vázquez Reyes Eder Israel
 * @author Yamil Omar Delgado Gonzalez
 */


@ManagedBean(name = "solicitudDotacionGridMB")
@ViewScoped
public class SolicitudDotacionGridMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CapturaFacade captruaFacade;
	
	private CriteriaUnidadNegocioVO criteriaUnidadVO;
	private List<DenominacionesDivisaVO> listaDenominacion;
	private SolicitudDotacionVO solicitudDotacionVO;
	private List<DivisaVO> listaDivisa;
	private DetalleDotacionVO detalleDenominacionVO;

	@PostConstruct
	public void init() {
		this.criteriaUnidadVO = new CriteriaUnidadNegocioVO();
		this.solicitudDotacionVO = new SolicitudDotacionVO();

	}

	/**
	 * @return the criteriaUnidadVO
	 */
	public CriteriaUnidadNegocioVO getCriteriaUnidadVO() {
		return criteriaUnidadVO;
	}

	/**
	 * @param criteriaUnidadVO
	 *            the criteriaUnidadVO to set
	 */
	public void setCriteriaUnidadVO(CriteriaUnidadNegocioVO criteriaUnidadVO) {
		this.criteriaUnidadVO = criteriaUnidadVO;
	}

	/**
	 * Evento que se ejecuta cuando se hace Click sobre el boton Consulta,devuelve los datos Unidad de Negocio
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public String btnConsultaUnidadNegocio(){

		try {
			this.solicitudDotacionVO = this.captruaFacade.getSolicitudDotacionBOBeanLocal().consultaUnidadNegocio(this.criteriaUnidadVO);
		} catch (EfectivoAplicacionBOException e) {
			addErrorMessage(e, null);
		}
		return null;
	}

	/**
	 * Evento cuando la divisa fue seleccionada ,carga las denominaciones asociadas a la divisa ,unicamente BCA,MCA
	 * 
	 * @param event
	 */

	public void selectedListaDivisa(ActionEvent event) {

		Short idDivisa = (Short) event.getSource();

		DivisaVO divisaVO = new DivisaVO();
		divisaVO.setDivisaNumeroID(idDivisa);
		try {
			this.detalleDenominacionVO = this.captruaFacade.getSolicitudDotacionBOBeanLocal().consultaDenominacionDivisaById(divisaVO);
		} catch (EfectivoAplicacionBOException e) {
			addErrorMessage(e, null);
		}

	}

	/**
	 * @return the listaDenominacion
	 */
	public List<DenominacionesDivisaVO> getListaDenominacion() {
		return listaDenominacion;
	}

	/**
	 * @param listaDenominacion
	 *            the listaDenominacion to set
	 */
	public void setListaDenominacion(
			List<DenominacionesDivisaVO> listaDenominacion) {
		this.listaDenominacion = listaDenominacion;
	}

	

	/**
	 * @return the listaDivisa
	 */
	public List<DivisaVO> getListaDivisa() {
		return listaDivisa;
	}

	/**
	 * @param listaDivisa
	 *            the listaDivisa to set
	 */
	public void setListaDivisa(List<DivisaVO> listaDivisa) {
		this.listaDivisa = listaDivisa;
	}

	/**
	 * @return the solicitudDotacionVO
	 */
	public SolicitudDotacionVO getSolicitudDotacionVO() {
		return solicitudDotacionVO;
	}

	/**
	 * @param solicitudDotacionVO
	 *            the solicitudDotacionVO to set
	 */
	public void setSolicitudDotacionVO(SolicitudDotacionVO solicitudDotacionVO) {
		this.solicitudDotacionVO = solicitudDotacionVO;
	}

	/**
	 * @return the detalleDenominacionVO
	 */
	public DetalleDotacionVO getDetalleDenominacionVO() {
		return detalleDenominacionVO;
	}

	/**
	 * @param detalleDenominacionVO the detalleDenominacionVO to set
	 */
	public void setDetalleDenominacionVO(DetalleDotacionVO detalleDenominacionVO) {
		this.detalleDenominacionVO = detalleDenominacionVO;
	}

}
