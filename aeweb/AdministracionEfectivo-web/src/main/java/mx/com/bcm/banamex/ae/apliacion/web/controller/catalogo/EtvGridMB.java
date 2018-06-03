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
import java.math.BigInteger;
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
import mx.com.bcm.banamex.ae.persistencia.vo.EtvVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;



/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */


@ManagedBean(name="EtvGridMB")
@RequestScoped
public class EtvGridMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<EtvVO> listaEtv;
	private EtvVO etvVO;
	UtileriaHelper params;
	private MensajeAewebVO mensajeError;
	
	@PostConstruct
	public void init(){
		 try {
			 
			 this.etvVO=new EtvVO();
			listaEtv=this.catalogoFacade.getCatalogoEtvBO().consultaEtv();
		} catch (EfectivoAplicacionBOException e) {
			e.printStackTrace();
		}
	}
	
	public void consultaEtvPorParametro(ActionEvent event) throws EfectivoAplicacionBOException{

		if(etvVO.getEtvIdn() > 0 ||
				(Integer.parseInt(etvVO.getIdnSubboveda().toString())) > 0 ||
				etvVO.getEtvNombreCorto().toString() != null)
		{
			if(etvVO.getEtvIdn() == 0)
				etvVO.setEtvIdn(null);
			if((Integer.parseInt(etvVO.getIdnSubboveda().toString())) == 0)
				etvVO.setIdnSubboveda(null);

			listaEtv=this.catalogoFacade.getCatalogoEtvBO().consultaEtvPorParametros(etvVO);
			
			if(this.listaEtv.size() == 0){
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONSULTA_VACIA.getValue());
				ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			}
			
		}else{
			etvVO.setEtvIdn(null);
			etvVO.setIdnSubboveda(null);
			
			this.listaEtv=this.catalogoFacade.getCatalogoEtvBO().consultaEtv();
			
		}
	}
	
	public String consultaEdit() throws EfectivoAplicacionBOException{
		
		String etvNombreCorto = UtileriaHelper.getParam("etvNombreCorto");
		String etvNombreLargo = UtileriaHelper.getParam("etvNombreLargo");
		String etvColonia = UtileriaHelper.getParam("etvColonia");
		String etvCalle = UtileriaHelper.getParam("etvCalle");
		String etvContacto = UtileriaHelper.getParam("etvContacto");
		String etvCp = UtileriaHelper.getParam("etvCp");
		String etvDeleg = UtileriaHelper.getParam("etvDeleg");
		String etvIdn = UtileriaHelper.getParam("etvIdn");
		String etvTipoServicio = UtileriaHelper.getParam("etvTipoServicio");
		String idEstadoRepublica = UtileriaHelper.getParam("etvidEstadoRepublica");
		String etvidnSubboveda = UtileriaHelper.getParam("etvidnSubboveda");
		
		this.etvVO.setEtvNombreCorto(etvNombreCorto.toString());
		this.etvVO.setEtvNombreLargo(etvNombreLargo.toString());
		this.etvVO.setEtvColonia(etvColonia.toString());
		this.etvVO.setEtvCalle(etvCalle.toString());
		this.etvVO.setEtvContacto(etvContacto.toString());
		this.etvVO.setEtvDeleg(etvDeleg.toString());

		this.etvVO.setEtvCp(new Integer(etvCp));
		this.etvVO.setEtvIdn(new Short(etvIdn));
		this.etvVO.setEtvTipoServico(new Short(etvTipoServicio));
		this.etvVO.setIdEstadoRepublica(new Short(idEstadoRepublica));
		this.etvVO.setIdnSubboveda(BigInteger.valueOf(new Short(etvidnSubboveda)));
		return "etvsEdit";

	}
	
	public String regresarList() throws EfectivoAplicacionBOException{
		this.etvVO.setEtvNombreCorto(null);
		this.etvVO.setEtvNombreLargo(null);
		this.etvVO.setEtvColonia(null);
		this.etvVO.setEtvCalle(null);
		this.etvVO.setEtvContacto(null);
		this.etvVO.setEtvDeleg(null);
		this.etvVO.setEtvCp(null);
		this.etvVO.setEtvIdn(null);
		this.etvVO.setEtvTipoServico(null);
		this.etvVO.setIdEstadoRepublica(null);
		this.etvVO.setIdnSubboveda(null);
		return "etvsList";
	}

	public void refresh() {
	    FacesContext context = FacesContext.getCurrentInstance();
	    Application application = context.getApplication();
	    ViewHandler viewHandler = application.getViewHandler();
	    UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
	    context.setViewRoot(viewRoot);
	    context.renderResponse();  
	 }
	
	public List<EtvVO> getListaEtv() {
		return listaEtv;
	}

	public void setListaEtv(List<EtvVO> listaEtv) {
		this.listaEtv = listaEtv;
	}

	public EtvVO getEtvVO() {
		return etvVO;
	}

	public void setEtvVO(EtvVO etvVO) {
		this.etvVO = etvVO;
	}


	

}
