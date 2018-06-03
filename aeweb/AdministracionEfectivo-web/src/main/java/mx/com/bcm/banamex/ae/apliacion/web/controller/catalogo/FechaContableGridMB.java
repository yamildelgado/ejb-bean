package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;


@ManagedBean(name="fechaContableGridMB")
@ViewScoped
public class FechaContableGridMB implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private CatalogoFacade catalogoFacade;
	private FechaContableVO fechaContableVO; 
	private List<FechaContableVO> fechasContablesVO;
	/**
	 * @return the fechasContables
	 */
	public List<FechaContableVO> getFechasContables() {
		return fechasContablesVO;
	}
	/**
	 * @param fechasContables the fechasContables to set
	 */
	public void setFechasContables(List<FechaContableVO> fechasContablesVO) {
		this.fechasContablesVO = fechasContablesVO;
	}
	private Date fechaCalendar;
	/**
	 * @return the fechaCalendar
	 */
	public Date getFechaCalendar() {
		return fechaCalendar;
	}
	/**
	 * @param fechaCalendar the fechaCalendar to set
	 */
	public void setFechaCalendar(Date fechaCalendar) {
		this.fechaCalendar = fechaCalendar;
	}
	@PostConstruct
	public void init() {
		this.fechaContableVO=new FechaContableVO();
		
		this.fechasContablesVO=new ArrayList<FechaContableVO>();
		try {
			
			this.fechasContablesVO=this.catalogoFacade.getCatalogoFechasContablesBO().consultaFechasContables();
			
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0;i<this.fechasContablesVO.size();i++){
            
		}
		
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
	public void consultaFechaContablePorIds(ActionEvent event) throws EfectivoAplicacionBOException{
	
		this.fechaContableVO=this.catalogoFacade.getCatalogoFechasContablesBO().consultaFechaContablePorid(this.getFechaCalendar());
	}

	public boolean diasContables(Date date)
	{
		
		FechaContableVO fechaC=new FechaContableVO();
		for(int i = 0;i<this.fechasContablesVO.size();i++){
            //System.out.println(array.get(i));
			fechaC=this.fechasContablesVO.get(i);
			if(0==fechaC.getFecContId().compareTo(date))
				return false;
            }
		return true;
	}
	
	
	
}
