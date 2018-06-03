package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;



import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.AtmVO;






@ManagedBean(name="atmMB")
@ViewScoped
public class AtmMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB private CatalogoFacade catalogoFacade;
	
	 private AtmVO atmVO;

	
	 
	
	public AtmMB(){
		
		
	}
	
	public void consultaAtm() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoAtmBO().consultAtms();
		
	}
	
	
	/**
	 * @return the atmVO
	 */
	public AtmVO getAtmVO() {
		if(atmVO==null){
			
			this.atmVO = new AtmVO();
		}
		return atmVO;
	}
	/**
	 * @param atmVO the atmVO to set
	 */
	public void setAtmVO(AtmVO atmVO) {
		this.atmVO = atmVO;
	}


		

}
