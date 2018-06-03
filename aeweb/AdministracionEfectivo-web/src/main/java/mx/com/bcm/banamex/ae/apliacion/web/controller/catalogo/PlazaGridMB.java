package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.PlazaVO;

/**
 * @author VELAZQUEZ DIEZ BARROSO MARIO ALBERTO
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean (name="plazaGridMB")
@RequestScoped
public class PlazaGridMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<PlazaVO> listaPlaza;
	private PlazaVO plazaVO;
	
		 private long plazaIdn;
	 
		 private String plazaNombre;
		 private MensajeAewebVO mensaje;
		 
	/**
	 * @return the plazaIdn
	 */
	public long getPlazaIdn() {
		return plazaIdn;
	}
	/**
	 * @return the plazaNombre
	 */
	public String getPlazaNombre() {
		return plazaNombre;
	}
	/**
	 * @param plazaIdn the plazaIdn to set
	 */
	public void setPlazaIdn(long plazaIdn) {
		this.plazaIdn = plazaIdn;
	}
	/**
	 * @param plazaNombre the plazaNombre to set
	 */
	public void setPlazaNombre(String plazaNombre) {
		this.plazaNombre = plazaNombre;
	}
	@PostConstruct
	public void init(){
		this.setPlazaVO(new PlazaVO());
		
	}
	
	public void consultaPlazaIdn(ActionEvent event) throws EfectivoAplicacionBOException{
		
		this.listaPlaza=this.catalogoFacade.getCatalogoPlazaBO().consultPlazaPorId(this.plazaVO.getPlazaIdn(), this.plazaVO.getPlazaNombre());
		if(this.listaPlaza.isEmpty()){
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(
					CodigoMensajeType.CONSULTA_VACIA.getValue());
			ErrorMessageHelper.addErrorMessage(mensaje.getMensajeDescripcion());
			
		}
		else{
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(
					CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO
					.getValue());
			ErrorMessageHelper.addSuccessMessage(mensaje.getMensajeDescripcion());
			
		}
	}


	public List<PlazaVO> getListaPlaza() {
	
		return listaPlaza;
	}

	public void setListaPlaza(List<PlazaVO> listaPlaza) {
		this.listaPlaza = listaPlaza;
	}
	public PlazaVO getPlazaVO() {
		return plazaVO;
	}
	public void setPlazaVO(PlazaVO plazaVO) {
		this.plazaVO = plazaVO;
	}

}


