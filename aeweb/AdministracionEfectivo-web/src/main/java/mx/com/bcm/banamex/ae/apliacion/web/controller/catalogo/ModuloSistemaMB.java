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

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@ManagedBean(name="moduloSistemaMB")
@RequestScoped
public class ModuloSistemaMB implements Serializable {
	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private ModuloSistemaVO moduloSistemaVO;
	
	@PostConstruct
	public void consultaModuloSistema() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoModuloSistemaBO().consultaModulosPorParametros(moduloSistemaVO);
	}
	
	public ModuloSistemaVO getModuloSistemaVO() {
		return moduloSistemaVO;
	}
	public void setModuloSistemaVO(ModuloSistemaVO moduloSistemaVO) {
		this.moduloSistemaVO = moduloSistemaVO;
	}
}
