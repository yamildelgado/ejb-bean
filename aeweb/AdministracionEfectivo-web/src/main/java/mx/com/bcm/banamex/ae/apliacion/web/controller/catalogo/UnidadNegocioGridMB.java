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
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.UnidadDeNegocioVO;

/**
 * @author YAMIL OMAR DELGADO GONZALEZ 
 * Describe : 
 */
@ManagedBean(name="unidadNegocioGridMB")
@RequestScoped
public class UnidadNegocioGridMB implements Serializable{
	
	/**
	 *  Variables miembro propias de Unidad de NegocioGridMB
	 */
	private static final long serialVersionUID = 1L;
	@EJB	private CatalogoFacade catalogoFacade;
	private List<UnidadDeNegocioVO> listaUnidadNegocioVO;
	private  UnidadDeNegocioVO unidadNegocioVO;
	private CriteriaUnidadNegocioVO criteriaUnidadNegocioVO;
	private MensajeAewebVO mensajeError;
	
	
	
	 
	/**
	 * @return the listaUnidadNegocioVO
	 */
	public List<UnidadDeNegocioVO> getListaUnidadNegocioVO() {
		return listaUnidadNegocioVO;
	}
	/**
	 * @return the unidadNegocioVO
	 */
	public UnidadDeNegocioVO getUnidadNegocioVO() {
		return unidadNegocioVO;
	}
	
	/**
	 * @throws EfectivoAplicacionBOException 
	 * 
	 */
	@PostConstruct
	public void init() {
		try {
			this.criteriaUnidadNegocioVO=new CriteriaUnidadNegocioVO();
			this.unidadNegocioVO=new UnidadDeNegocioVO();
			this.listaUnidadNegocioVO=this.catalogoFacade.getCatalogoUnidadNegocioBO().consultaUnidadNegocio();
		} catch (EfectivoAplicacionBOException e) {
			try {
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CODIGO_NO_ENCONTRATO.getValue());
			} catch (EfectivoAplicacionBOException e1) {
				
			}
			ErrorMessageHelper.addErrorMessage (mensajeError.getMensajeDescripcion());
		}
		
		
	}


	/**
	 * @param listaUnidadNegocioVO the listaUnidadNegocioVO to set
	 */
	public void setListaUnidadNegocioVO(List<UnidadDeNegocioVO> listaUnidadNegocioVO) {
		this.listaUnidadNegocioVO = listaUnidadNegocioVO;
	}


	/**
	 * @param unidadNegocioVO the unidadNegocioVO to set
	 */
	public void setUnidadNegocioVO(UnidadDeNegocioVO unidadNegocioVO) {
		this.unidadNegocioVO = unidadNegocioVO;
	}


	/**
	 * @return the criteriaUnidadNegocioVO
	 */
	public CriteriaUnidadNegocioVO getCriteriaUnidadNegocioVO() {
		return criteriaUnidadNegocioVO;
	}


	/**
	 * @param criteriaUnidadNegocioVO the criteriaUnidadNegocioVO to set
	 */
	public void setCriteriaUnidadNegocioVO(
			CriteriaUnidadNegocioVO criteriaUnidadNegocioVO) {
		this.criteriaUnidadNegocioVO = criteriaUnidadNegocioVO;
	}



	public void consultaUnidadNegocio(ActionEvent event) throws EfectivoAplicacionBOException {
		
		try {
			this.listaUnidadNegocioVO =this.catalogoFacade.getCatalogoUnidadNegocioBO().consultaContratosUnidadNegocioPorCriterio(this.criteriaUnidadNegocioVO);
		} catch (EfectivoAplicacionBOException e) {
			 try {
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CODIGO_NO_ENCONTRATO.getValue());
			} catch (EfectivoAplicacionBOException e1) {
				
			}
			 throw new EfectivoAplicacionBOException(mensajeError);
			
		}finally{
		this.criteriaUnidadNegocioVO=new CriteriaUnidadNegocioVO();
		
		}
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
	}
	
	
	public String consultaVerUnidadNegocio() throws EfectivoAplicacionBOException{
		
		  String contrato=UtileriaHelper.getParam("contrato").trim();
		  String sirh=UtileriaHelper.getParam("sirh").trim();
		  String unidadNegocio=UtileriaHelper.getParam("unidadNegocio").trim();

		  this.unidadNegocioVO=this.catalogoFacade.getCatalogoUnidadNegocioBO().consultaContratosUnidadNegocio(contrato,sirh,unidadNegocio);
		  return "unidadNegocioView";
	}
	
	
	

}
