package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.vo.ContratoVO;


@ManagedBean(name="contratoMB")
@RequestScoped

public class ContratoMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade; 
	private ContratoVO contratoVO;
	

	

	/**
	 * @return the contratoVO
	 */
	public ContratoVO getContratoVO() {
		return contratoVO;
	}

	/**
	 * @param contratoVO the contratoVO to set
	 */
	public void setContratoVO(ContratoVO contratoVO) {
		this.contratoVO = contratoVO;
	}
	
		
	
	
}
