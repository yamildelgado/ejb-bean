package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
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
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


@ManagedBean(name = "divisaGridMB")
@RequestScoped
public class DivisaGridMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<DivisaVO> listaDivisas;
	private MensajeAewebVO mensajeError;
	private DivisaVO divisaVO;

	@PostConstruct
	public void init() {
		try {

			this.divisaVO = new DivisaVO();
			this.listaDivisas = this.catalogoFacade.getCatalogoDivisaBO().consultDivisas();
		} catch (EfectivoAplicacionBOException e) {

			e.printStackTrace();
		}
	}
	
	
	 public void consultaDivisaPorParametro(ActionEvent event) throws EfectivoAplicacionBOException{
		 
		 
		 if(this.divisaVO.getDivisaNumeroID() > 0 ||
				 !this.divisaVO.getAbreviatura().toString().equals("") ||
				 !this.divisaVO.getNombreLargo().toString().equals("")){
			 
			 if (this.divisaVO.getDivisaNumeroID()==0){

				 this.divisaVO.setDivisaNumeroID(null);
			 }
			 
			 listaDivisas=this.catalogoFacade.getCatalogoDivisaBO().consultaDivisasPorParametros(divisaVO);
			 
			 if(listaDivisas.size()==0){
				 // mas errores por decifrar
				 
			 }
		 }else{
			 
			 this.divisaVO.setDivisaNumeroID(null);
			 mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.DIVISA_CLAVE_FILTRO.getValue());
			 ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
			 listaDivisas=this.catalogoFacade.getCatalogoDivisaBO().consultDivisas();
		}
	 }
	

	public void consultaDivisaPorNumero(ActionEvent event)
			throws EfectivoAplicacionBOException {
		this.listaDivisas = this.catalogoFacade.getCatalogoDivisaBO()
				.consultaDivisasPorNum(divisaVO);

	}

	public List<DivisaVO> getListaDivisas() {
		return listaDivisas;
	}

	public void setListaDivisas(List<DivisaVO> listaDivisas) {
		this.listaDivisas = listaDivisas;
	}

	public DivisaVO getDivisaVO() {
		return divisaVO;
	}

	
	public void setDivisaVO(DivisaVO divisaVO) {
		this.divisaVO = divisaVO;
	}

}