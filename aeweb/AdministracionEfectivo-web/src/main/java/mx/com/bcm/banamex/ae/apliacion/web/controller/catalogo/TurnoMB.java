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
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;


/**
 * @author JESÚS AGUILAR LÓPEZ 
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="turnoMB")
@RequestScoped
public class TurnoMB implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private TurnoVO turnoVO;
	
	
	public TurnoMB(){
		turnoVO=new TurnoVO();
	}
	
	public void consultaTurnos() throws EfectivoAplicacionBOException{
		this.catalogoFacade.getCatalogoTurnoBO().consultaTurnos();
		
	}
	
	//public void consultaTurnoPorId() throws EfectivoAplicacionBOException {
	//		this.catalogoFacade.getCatalogoTurnoBO().consultaTurnoPorId(turnoVO);
						
	//}
	
//	public TurnoVO consultaTurnoPorId(String idTurno) throws EfectivoAplicacionBOException {
//		turnoVO = this.catalogoFacade.getCatalogoTurnoBO().consultaTurnoPorId(idTurno);
//		return turnoVO;
//		
//	}
	
	

	/**
	 * @return the turnoVO
	 */
	public TurnoVO getTurnoVO() {
		return turnoVO;
	}

	/**
	 * @param turnoVO the turnoVO to set
	 */
	public void setTurnoVO(TurnoVO turnoVO) {
		this.turnoVO = turnoVO;
	}
}

	
	
	