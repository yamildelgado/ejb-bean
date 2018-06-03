/*  Todos los Derechos Reservados 2013 BCM.
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

import javax.faces.bean.ViewScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CpaeVO;



/**
 * @author Vázquez Reyes Eder Israel
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="cpaeMB")
@ViewScoped
public class CpaeMB implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private CpaeVO cpaeVO;
	
	
	public CpaeMB(){
		cpaeVO=new CpaeVO();
	}
	
	
	
	public void addCpaes(CpaeVO cpaeVO)throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoCpaeBO().addCpaes(cpaeVO);
				}
	
	public void editCpaes(CpaeVO cpaeVO)throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoCpaeBO().editCpaes(cpaeVO);
		
	}

	/**
	 * @return the cpaeVO
	 */
	public CpaeVO getCpaeVO() {
		return cpaeVO;
	}

	/**
	 * @param cpaeVO the cajaVO to set
	 */
	public void setCpaeVO(CpaeVO cpaeVO) {
		this.cpaeVO= cpaeVO;
	}

}
