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
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.vo.DotacionVO;



/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */


@ManagedBean(name="solicitudDotacionGridMB")
@RequestScoped
public class SolicitudDotacionGridMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<DotacionVO> listadotacionBillete;
	private List<DotacionVO> listadotacionMoneda;

	
	@PostConstruct
	public void init(){
		this.listadotacionBillete=new ArrayList<DotacionVO>();
		this.listadotacionBillete.add(DotacionVO("1000","1000","","$ 1,000,000.00"));
		this.listadotacionBillete.add(DotacionVO("500","500","","$ 250,000.00"));
		this.listadotacionBillete.add(DotacionVO("200","200","","$ 40,000.00"));
		this.listadotacionBillete.add(DotacionVO("100","100","","$ 100,000.00"));
		this.listadotacionBillete.add(DotacionVO("50","50","","$ 5,000.00"));
		this.listadotacionBillete.add(DotacionVO("20","20","","$ 2,000.00"));
		this.listadotacionBillete.add(DotacionVO("10","10","","$ 1,000.00"));
		this.listadotacionBillete.add(DotacionVO("5","5","","$ 500.00"));
		this.listadotacionBillete.add(DotacionVO("2","2","","$ 200.00"));
		this.listadotacionBillete.add(DotacionVO("1","1","","$ 100.00"));
		
		this.listadotacionMoneda=new ArrayList<DotacionVO>();
		this.listadotacionMoneda.add(DotacionVO("100","","20","$ 2,000.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","10","$ 1,000.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","5","$ 500.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","2","$ 200.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","1","$ 100.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","0.5","$ 50.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","0.2","$ 20.00"));
		this.listadotacionMoneda.add(DotacionVO("100","","0.1","$ 10.00"));

	}


	private DotacionVO DotacionVO(String cantidad, String billete, String moneda,String subtotal) {
		DotacionVO  Dotacion = new DotacionVO();
		Dotacion.setBillete(billete);
		Dotacion.setCantidad(cantidad);
		Dotacion.setSubtotal(subtotal);
		Dotacion.setMoneda(moneda);
		return Dotacion;

	}


	/**
	 * @return the listadotacionBillete
	 */
	public List<DotacionVO> getListadotacionBillete() {
		return listadotacionBillete;
	}

	/**
	 * @param listadotacionBillete the listadotacionBillete to set
	 */
	public void setListadotacionBillete(List<DotacionVO> listadotacionBillete) {
		this.listadotacionBillete = listadotacionBillete;
	}


	/**
	 * @return the listadotacionMoneda
	 */
	public List<DotacionVO> getListadotacionMoneda() {
		return listadotacionMoneda;
	}


	/**
	 * @param listadotacionMoneda the listadotacionMoneda to set
	 */
	public void setListadotacionMoneda(List<DotacionVO> listadotacionMoneda) {
		this.listadotacionMoneda = listadotacionMoneda;
	}

}

