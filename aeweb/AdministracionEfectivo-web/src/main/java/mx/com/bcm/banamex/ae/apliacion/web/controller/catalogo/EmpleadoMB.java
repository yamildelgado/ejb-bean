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

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;


/**
 * @author DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@ManagedBean(name="empleadoMB")
@RequestScoped
public class EmpleadoMB implements Serializable {

	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private EmpleadoVO empleadoVO;
	
	public void consultaEmpleado() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoEmpleadoBO().consultaEmpleados();
		
	}
	
	/**
	 * @return the empleadoVO
	 */
	public EmpleadoVO getEmpleadoVO() {
		
		return this.empleadoVO;
	}

	/**
	 * @param empleadoVO the empleadoVO to set
	 */
	public void setEmpleadoVO(EmpleadoVO empleadoVO) {
		this.empleadoVO = empleadoVO;
	}



}
