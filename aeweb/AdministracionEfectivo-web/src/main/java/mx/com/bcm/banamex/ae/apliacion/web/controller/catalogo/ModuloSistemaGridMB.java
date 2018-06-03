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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@ManagedBean(name="ModuloSistemaGridMB")

@ViewScoped
public class ModuloSistemaGridMB implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<ModuloSistemaVO> listaModuloSistema;
	private ModuloSistemaVO moduloSistemaVO;
	private MensajeAewebVO mensajeError;
	
	@PostConstruct
	public void init(){
		 try {
			 this.moduloSistemaVO=new ModuloSistemaVO();
			 listaModuloSistema=this.catalogoFacade.getCatalogoModuloSistemaBO().consultaModulos();
		} catch (EfectivoAplicacionBOException e) {
			e.printStackTrace();
		}
	}
		 
		 public void consultaModuloPorParametro(ActionEvent event) throws EfectivoAplicacionBOException{
			 if (moduloSistemaVO.getModsisNivId() != null ||
					 moduloSistemaVO.getModsisStatus() != null ||
					 moduloSistemaVO.getModsisDescripcionMod() != null)
			 {
				 
				 if (Integer.parseInt(this.moduloSistemaVO.getModsisNivId().toString()) == 0)
					 this.moduloSistemaVO.setModsisNivId(null);
				 
				 listaModuloSistema=this.catalogoFacade.getCatalogoModuloSistemaBO().consultaModulosPorParametros(moduloSistemaVO);
				 
				 if(this.listaModuloSistema.size() == 0){
						mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONSULTA_VACIA.getValue());
						ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
					}
				 
			 }else{
				 
				 this.moduloSistemaVO.setModsisNivId(null);
				 listaModuloSistema=this.catalogoFacade.getCatalogoModuloSistemaBO().consultaModulos();
			 }
		 }
		 
	public ModuloSistemaVO getModuloSistemaVO() {
		return moduloSistemaVO;
	}
	public void setModuloSistemaVO(ModuloSistemaVO moduloSistemaVO) {
		this.moduloSistemaVO = moduloSistemaVO;
	}

	public List<ModuloSistemaVO> getListaModuloSistema() {
		return listaModuloSistema;
	}

	public void setListaModuloSistema(List<ModuloSistemaVO> listaModuloSistema) {
		this.listaModuloSistema = listaModuloSistema;
	}
	
	
}
