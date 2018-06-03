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
import mx.com.bcm.banamex.ae.persistencia.vo.EmpleadoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */

@ManagedBean(name="empleadoGridMB")
@ViewScoped
public class EmpleadoGridMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<EmpleadoVO> listaEmpleado;
	private EmpleadoVO empleadoVO;
	private MensajeAewebVO mensajeError;
	
	@PostConstruct
	public void init(){
		 try {
			 this.empleadoVO=new EmpleadoVO();
			 listaEmpleado=this.catalogoFacade.getCatalogoEmpleadoBO().consultaEmpleados();
		} catch (EfectivoAplicacionBOException e) {
			e.printStackTrace();
		}
	}
		 
		 public void consultaEmpleadoPorParametro(ActionEvent event) throws EfectivoAplicacionBOException{

			 if(this.empleadoVO.getEmpNomina() > 0 ||
					 this.empleadoVO.getEmpPerfil() > 0 ||
					 this.empleadoVO.getEmpNombre().toString() != null || 
					 this.empleadoVO.getEmpPaterno().toString() != null ||
					 this.empleadoVO.getEmpPaterno().toString() != null)
			 {
				 
			 if (this.empleadoVO.getEmpNomina()==0)
				 this.empleadoVO.setEmpNomina(null);	
			 if(this.empleadoVO.getEmpPerfil()==0)
				 this.empleadoVO.setEmpPerfil(null);
				 
				 this.listaEmpleado=this.catalogoFacade.getCatalogoEmpleadoBO().consultaEmpleadosPorParametros(empleadoVO);
				 
				 if(this.listaEmpleado.size() == 0){
						mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO().consultaCatalogoMensajePorCodigo(CodigoMensajeType.CONSULTA_VACIA.getValue());
						ErrorMessageHelper.addErrorMessage(mensajeError.getMensajeDescripcion());
				}
				 
			 }else{
				 listaEmpleado=this.catalogoFacade.getCatalogoEmpleadoBO().consultaEmpleados();
			 }
		 }
	
	
	public List<EmpleadoVO> getListaEmpleado() {
		return listaEmpleado;
	}
	public void setListaEmpleado(List<EmpleadoVO> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}
	public EmpleadoVO getEmpleadoVO() {
		return empleadoVO;
	}
	public void setEmpleadoVO(EmpleadoVO empleadoVO) {
		this.empleadoVO = empleadoVO;
	}

	
}
