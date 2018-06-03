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
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioDenominacionDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DenominacionesDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author:  OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */
 
@ManagedBean(name="denomDivisaGridMB")
@RequestScoped
public class DenominacionesDivisaGridMB implements Serializable {
	
	private static final long serialVersionUID = 1L;

			
	@EJB
	private CatalogoFacade catalogoFacade;  
	private CriterioDenominacionDivisaVO critDenominacionDivVO;
	private List<DivisaVO> listDivisasVO ;
	private List<DenominacionesDivisaVO> listDenoDivisa;
	private MensajeAewebVO mensaje;
	@PostConstruct
	public void init(){
		try {
			critDenominacionDivVO = new CriterioDenominacionDivisaVO();
			
			this.consultarDivisas();
			
			
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public List<DivisaVO> consultarDivisas() throws EfectivoAplicacionBOException{
		
		this.listDivisasVO = new ArrayList<DivisaVO>();
		DivisaVO divisaUno = new DivisaVO();
		DivisaVO divisaDos = new DivisaVO();
		DivisaVO divisaTres = new DivisaVO();
		DivisaVO divisaCuatro = new DivisaVO();
		
		divisaUno.setNombreCorto("MONEDA NACIONAL");
		divisaUno.setDivisaNumeroID((short)1);
		this.listDivisasVO.add(divisaUno);
		
		
		
		divisaDos.setNombreCorto("UNIDAD DE INVERSION");
		divisaDos.setDivisaNumeroID((short)2);
		this.listDivisasVO.add(divisaDos);
		
		divisaTres.setNombreCorto("DOLAR CANADIENSEL");
		divisaTres.setDivisaNumeroID((short)3);
		this.listDivisasVO.add(divisaTres);
		
		divisaCuatro.setNombreCorto("DOLAR AMERICANO");
		divisaCuatro.setDivisaNumeroID((short)4);
		this.listDivisasVO.add(divisaCuatro);
		
		
		
		
		//listDivisasVO = this.catalogoFacade.getCatalogoDenominaDivisaBO().consultaDivisas();
		
		
	
		return listDivisasVO;
	}
	public void consultarDenominacionDivisaPoIdDivisa(ActionEvent event) throws EfectivoAplicacionBOException{
		
		
		
		
		
		/*listDenoDivisa=this.catalogoFacade.getCatalogoDenominaDivisaBO().consultaDenomDivisaPorIdDivisa(this.critDenominacionDivVO);
		if(this.listDenoDivisa.isEmpty()){
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(	CodigoMensajeType.CONSULTA_VACIA.getValue());
			ErrorMessageHelper.addErrorMessage(mensaje.getMensajeDescripcion());
			
		}
		else{
			mensaje = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(
					CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO
					.getValue());
			ErrorMessageHelper.addSuccessMessage(mensaje.getMensajeDescripcion());
			
		}*/
		
	}
	/**
	 * @return the listDivisasVO
	 */
	public List<DivisaVO> getListDivisasVO() {
		
		return listDivisasVO;
	}

	/**
	 * @param listDivisasVO the listDivisasVO to set
	 */
	public void setListDivisasVO(List<DivisaVO> listDivisasVO) {
		this.listDivisasVO = listDivisasVO;
	}
	/**
	 * @return the critDenominacionDivVO
	 */
	public CriterioDenominacionDivisaVO getCritDenominacionDivVO() {
		return critDenominacionDivVO;
	}
	/**
	 * @param critDenominacionDivVO the critDenominacionDivVO to set
	 */
	public void setCritDenominacionDivVO(
			CriterioDenominacionDivisaVO critDenominacionDivVO) {
		this.critDenominacionDivVO = critDenominacionDivVO;
	}
	/**
	 * @return the listDenoDivisa
	 */
	public List<DenominacionesDivisaVO> getListDenoDivisa() {
		
		this.listDenoDivisa = new ArrayList<DenominacionesDivisaVO>();
		DenominacionesDivisaVO denominacionUno = new DenominacionesDivisaVO();
		DenominacionesDivisaVO denominacionDos = new DenominacionesDivisaVO();
		DenominacionesDivisaVO denominacionTres = new DenominacionesDivisaVO();
		DenominacionesDivisaVO denominacionCuatro = new DenominacionesDivisaVO();
		
		denominacionUno.setDenomNombreDenominacion("DIEZ");
		denominacionUno.setDenomTipoBillMon("BEA");
		denominacionUno.setDenomCirculacion((short)1);
		this.listDenoDivisa.add(denominacionUno);
		denominacionDos.setDenomNombreDenominacion("VEINTE");
		denominacionDos.setDenomTipoBillMon("BEA");
		denominacionDos.setDenomCirculacion((short)1);
		this.listDenoDivisa.add(denominacionDos);
		
		denominacionTres.setDenomNombreDenominacion("CINCUENTA");
		denominacionTres.setDenomTipoBillMon("BEA");
		denominacionTres.setDenomCirculacion((short)1);
		this.listDenoDivisa.add(denominacionTres);
		
		denominacionCuatro.setDenomNombreDenominacion("DOSCIENTOS");
		denominacionCuatro.setDenomTipoBillMon("BEA");
		denominacionCuatro.setDenomCirculacion((short)1);
		this.listDenoDivisa.add(denominacionCuatro);
		return listDenoDivisa;
	}
	/**
	 * @param listDenoDivisa the listDenoDivisa to set
	 */
	public void setListDenoDivisa(List<DenominacionesDivisaVO> listDenoDivisa) {
		this.listDenoDivisa = listDenoDivisa;
	}
	
	

 
}