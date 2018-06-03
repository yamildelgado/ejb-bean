/* Todos los Derechos Reservados 2013 BCM.
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
import javax.faces.bean.ViewScoped;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.BancoVO;


/**
 * @author JESUS CARBAJAL MONTES
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean
@ViewScoped
public class BancoGridMB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<BancoVO> listaBanco;
	
	@PostConstruct
	public void init(){
		// try {
			listaBanco=new ArrayList<BancoVO>();
			//listaBanco=this.catalogoFacade.getCatalogoBancoBO().consultBancos();
			BancoVO banco=new BancoVO();
			banco.setBancoIdn((short) 1);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("BANCO DE MEXICO");
			listaBanco.add(banco);
			banco=new BancoVO();
			banco.setBancoIdn((short) 2);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("BANCO NACIONAL DE MEXICO, S.A.");
			listaBanco.add(banco);
			banco=new BancoVO();
			banco.setBancoIdn((short) 3);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("BANCA SERFIN, S.A.");
			listaBanco.add(banco);
			banco=new BancoVO();
			banco.setBancoIdn((short) 4);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("BANCO DEL ATLANTICO, S.A.");
			listaBanco.add(banco);
			banco=new BancoVO();
			banco.setBancoIdn((short) 5);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("BANCO NACIONAL DE COMERCIO EXTERIOR,SNC.");
			listaBanco.add(banco);
			banco=new BancoVO();
			banco.setBancoIdn((short) 6);
			banco.setBancoBajaLogica("activo");
			banco.setBancoDescripcionLarga("CITY BANK, S.A.");
			listaBanco.add(banco);
			
			
		/*} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	/**
	 * @return the listaBanco
	 */
	public List<BancoVO> getListaBanco() {
		return listaBanco;
	}

	/**
	 * @param listaBanco the listaBanco to set
	 */
	public void setListaBanco(List<BancoVO> listaBanco) {
		this.listaBanco = listaBanco;
	}

	
}
