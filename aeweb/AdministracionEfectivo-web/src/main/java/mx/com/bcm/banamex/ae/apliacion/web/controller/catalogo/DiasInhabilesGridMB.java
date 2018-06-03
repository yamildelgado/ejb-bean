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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.DiasInhabilesVO;

import org.primefaces.event.SelectEvent;


/**
 * @author JESUS CARBAJAL MONTES
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name="diasInhabilesGridMB")
@ViewScoped
public class DiasInhabilesGridMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<DiasInhabilesVO> listaDiasInhabiles;
	private List<Date> listafechas;
	private Date [] fechascont;
	private Date fec;
	
	/**
	 * @return the fec
	 */
	public Date getFec() {
		return fec;
	}


	/**
	 * @param fec the fec to set
	 */
	public void setFec(Date fec) {
		this.fec = fec;
	}


	@PostConstruct
	public void init(){
		fec=new Date();
		this.listaDiasInhabiles=new ArrayList<DiasInhabilesVO>();
		this.listafechas=new ArrayList<Date>();
		System.out.print(" entro init "+fec.toString());
		 try {
			 System.out.print(" entro try ");
			 this.listaDiasInhabiles=this.catalogoFacade.getCatalogoDiasInhabilesBO().consultaDiasInhabiles();
			 System.out.print(" entro try 1");
			 this.fechascont=new Date[this.listaDiasInhabiles.size()];
			 for(int i=0;i<this.listaDiasInhabiles.size();i++){
				 this.listafechas.add(this.listaDiasInhabiles.get(i).getDdDfestivo());
				 Date fc=new Date();
				 System.out.print(" entro for");
				 fc=this.listaDiasInhabiles.get(i).getDdDfestivo();
				 this.fechascont[i]=this.listafechas.get(i);
				
			 }
			 
			 System.out.print("entro try fin");
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fechaSeleccionada(SelectEvent event) {  
        FacesContext facesContext = FacesContext.getCurrentInstance();  
        SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");  
        Date fechain=new Date();
        fechain=(Date)event.getObject();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Dia Inhabil", format.format(fechain)));  
    } 
	public List<DiasInhabilesVO> getListaDiasInhabiles() {
		return listaDiasInhabiles;
	}
	public void setListaDiasInhabiles(List<DiasInhabilesVO> listaDiasInhabiles) {
		this.listaDiasInhabiles = listaDiasInhabiles;
	}


	public List<Date> getListafechas() {
		return listafechas;
	}


	public void setListafechas(List<Date> listafechas) {
		this.listafechas = listafechas;
	}


	public Date [] getFechascont() {
		return fechascont;
	}


	public void setFechascont(Date [] fechascont) {
		this.fechascont = fechascont;
	}
	

}
