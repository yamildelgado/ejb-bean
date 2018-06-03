package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;



@ManagedBean(name="fechaContableMB")
@RequestScoped
public class FechaContableMB implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade; 
	private FechaContableVO fechaContableVO;
	public FechaContableMB() {
		this.fechaContableVO = new FechaContableVO();
	}
	/**
	 * @return the fechaContableVO
	 */
	public FechaContableVO getFechaContableVO() {
		return fechaContableVO;
	}
	/**
	 * @param fechaContableVO the fechaContableVO to set
	 */
	public void setFechaContableVO(FechaContableVO fechaContableVO) {
		this.fechaContableVO = fechaContableVO;
	}
	public void consultaFechaContablePorId(Date date) throws EfectivoAplicacionBOException{
	this.catalogoFacade.getCatalogoFechasContablesBO().consultaFechaContablePorid(date);
	}
}
