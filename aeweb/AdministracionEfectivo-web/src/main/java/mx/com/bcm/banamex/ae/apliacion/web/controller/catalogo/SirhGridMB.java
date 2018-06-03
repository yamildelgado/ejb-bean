/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.EstructuraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@ManagedBean(name="SirhGridMB")
@RequestScoped
public class SirhGridMB implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<EstructuraVO> listaEstructura;
	private EstructuraVO estructuraVO;
	private MensajeAewebVO mensajeError;
	
	@PostConstruct
	public void init(){

			 
			 this.estructuraVO=new EstructuraVO();

			 try {
				listaEstructura=this.catalogoFacade.getCatalogoSIRHBO().consultaEstructura();
			} catch (EfectivoAplicacionBOException e) {

				e.printStackTrace();
			}

		
	}
	
	public void consultaSirhPorParametro(ActionEvent event) throws EfectivoAplicacionBOException{
		if(estructuraVO.getEstructraSirhIdn() > 0 ||
				estructuraVO.getEstructraPoblacion() != null ||
				estructuraVO.getEstructraTipoSirh() != null ||
				estructuraVO.getEstructraEdo() != null ||
				estructuraVO.getEstructraRpta() > 0)
		{
			 if (this.estructuraVO.getEstructraSirhIdn()==0)
				 this.estructuraVO.setEstructraSirhIdn(null);
			 if (this.estructuraVO.getEstructraRpta()==0)
				 this.estructuraVO.setEstructraRpta(null);
			listaEstructura=this.catalogoFacade.getCatalogoSIRHBO().consultaSirhPorBoveda(estructuraVO);
			
			if(this.listaEstructura.size() == 0){
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONSULTA_VACIA.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			}
		}else{
			this.estructuraVO.setEstructraSirhIdn(null);
			this.estructuraVO.setEstructraRpta(null);
			listaEstructura=this.catalogoFacade.getCatalogoSIRHBO().consultaEstructura();
		}
		
	}
	
	public String consultaEditSirh() throws EfectivoAplicacionBOException{
		
		String estructraCalleNum = UtileriaHelper.getParam("estructraCalleNum");
		String estructraColonia = UtileriaHelper.getParam("estructraColonia");
		String estructraCp = UtileriaHelper.getParam("estructraCp");
		String estructraEdo = UtileriaHelper.getParam("estructraEdo");
		String estructraLada = UtileriaHelper.getParam("estructraLada");
		String estructraNombreCorto = UtileriaHelper.getParam("estructraNombreCorto");
		String estructraNombreLargo = UtileriaHelper.getParam("estructraNombreLargo");
		String estructraPoblacion = UtileriaHelper.getParam("estructraPoblacion");
		String estructraRpta = UtileriaHelper.getParam("estructraRpta");
		String estructraSirhIdn = UtileriaHelper.getParam("estructraSirhIdn");
		String estructraTelefono = UtileriaHelper.getParam("estructraTelefono");
		String estructraTipoSirh = UtileriaHelper.getParam("estructraTipoSirh");
		
		this.estructuraVO.setEstructraCalleNum(estructraCalleNum.toString());
		this.estructuraVO.setEstructraColonia(estructraColonia.toString());
		this.estructuraVO.setEstructraCp(estructraCp.toString());
		this.estructuraVO.setEstructraEdo(estructraEdo.toString());
		this.estructuraVO.setEstructraLada(estructraLada.toString());
		this.estructuraVO.setEstructraNombreCorto(estructraNombreCorto.toString());
		this.estructuraVO.setEstructraNombreLargo(estructraNombreLargo.toString());
		this.estructuraVO.setEstructraPoblacion(estructraPoblacion.toString());
		this.estructuraVO.setEstructraRpta(new Short(estructraRpta.toString()));
		this.estructuraVO.setEstructraSirhIdn(new Integer(estructraSirhIdn.toString()));
		this.estructuraVO.setEstructraTelefono(estructraTelefono.toString());
		this.estructuraVO.setEstructraTipoSirh(estructraTipoSirh.toString());
		
		return "actualizaSIRHEdit";
	}
	
	public void refresh() {
	    FacesContext context = FacesContext.getCurrentInstance();
	    Application application = context.getApplication();
	    ViewHandler viewHandler = application.getViewHandler();
	    UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
	    context.setViewRoot(viewRoot);
	    context.renderResponse();  
	 }
	
	public String regresarListSirh() throws EfectivoAplicacionBOException{
		this.estructuraVO.setEstructraCalleNum(null);
		this.estructuraVO.setEstructraColonia(null);
		this.estructuraVO.setEstructraCp(null);
		this.estructuraVO.setEstructraEdo(null);
		this.estructuraVO.setEstructraLada(null);
		this.estructuraVO.setEstructraNombreCorto(null);
		this.estructuraVO.setEstructraNombreLargo(null);
		this.estructuraVO.setEstructraPoblacion(null);
		this.estructuraVO.setEstructraRpta(null);
		this.estructuraVO.setEstructraSirhIdn(null);
		this.estructuraVO.setEstructraTelefono(null);
		this.estructuraVO.setEstructraTipoSirh(null);
		return "actualizaSIRHList";
	}
	

	public List<EstructuraVO> getListaEstructura() {
		return listaEstructura;
	}

	public void setListaEstructura(List<EstructuraVO> listaEstructura) {
		this.listaEstructura = listaEstructura;
	}

	public EstructuraVO getEstructuraVO() {
		return estructuraVO;
	}

	public void setEstructuraVO(EstructuraVO estructuraVO) {
		this.estructuraVO = estructuraVO;
	}
	


}
