 /** 
 *  Todos los Derechos Reservados 2013 BCM.
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

import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ContratoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioContratoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


@ManagedBean(name="contratoGridMB")
@RequestScoped

public class ContratoGridMB implements Serializable {
	
	/**
	 *  Seccion de variables miembro propias de la clase
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private ContratoVO contratoVO; 
	private CriterioContratoVO criterioContratoVO;
	private List<ContratoVO> listaContratoVO;
	private static String PARAMETRO="parametro";
	private MensajeAewebVO mensajeError;
	
	
	public String consultaContratoPorId() throws EfectivoAplicacionBOException{
		
		try {
			 this.listaContratoVO=this.catalogoFacade.getContratoBO().consultaContratoPorId(criterioContratoVO); 
			
		} catch (EfectivoAplicacionBOException e) {
			
		  mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CODIGO_NO_ENCONTRATO.getValue());
		  throw new EfectivoAplicacionBOException(mensajeError);
		}finally{
			criterioContratoVO=new CriterioContratoVO();
		}
		
		mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
		ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		
		
		return "contratoList";
	}
	
	public String consultaVerContrato() throws EfectivoAplicacionBOException{
		
		String idContrato=UtileriaHelper.getParam(PARAMETRO).trim();
	
		
		criterioContratoVO=new  CriterioContratoVO();
		criterioContratoVO.setNumContrato((idContrato));
		try {
			this.contratoVO=this.catalogoFacade.getContratoBO().consultaContratoPorNumeroContrato(criterioContratoVO);
		} catch (EfectivoAplicacionBOException e) {
			
			 mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CODIGO_NO_ENCONTRATO.getValue());
			 ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			 return null;
		}
		finally{
			criterioContratoVO=new  CriterioContratoVO();
		}
		
		
		return "contratoEdit";
	}

	/**
	 * @return the contratoVO
	 */
	public ContratoVO getContratoVO() {
		return contratoVO;
	}

	/**
	 * @return the criterioContratoVO
	 */
	public CriterioContratoVO getCriterioContratoVO() {
		return criterioContratoVO;
	}
	/**
	 * @return the listaContratoVO
	 */
	public List<ContratoVO> getListaContratoVO() {
		return listaContratoVO;
	}

	@PostConstruct
	public void init(){
		
		try {
			this.criterioContratoVO=new CriterioContratoVO();
			this.listaContratoVO=this.catalogoFacade.getContratoBO().consultaContrato();
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			try {
				mensajeError=this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO.getValue());
			} catch (EfectivoAplicacionBOException e1) {
				
				e1.printStackTrace();
			}
			ErrorMessageHelper.addSuccessMessage(mensajeError.getMensajeDescripcion());
		}
		
	}

	/**
	 * @param contratoVO the contratoVO to set
	 */
	public void setContratoVO(ContratoVO contratoVO) {
		this.contratoVO = contratoVO;
	}

	/**
	 * @param criterioContratoVO the criterioContratoVO to set
	 */
	public void setCriterioContratoVO(CriterioContratoVO criterioContratoVO) {
		this.criterioContratoVO = criterioContratoVO;
	}

	/**
	 * @param listaContratoVO the listaContratoVO to set
	 */
	public void setListaContratoVO(List<ContratoVO> listaContratoVO) {
		this.listaContratoVO = listaContratoVO;
	}
	
	
	
	
}
