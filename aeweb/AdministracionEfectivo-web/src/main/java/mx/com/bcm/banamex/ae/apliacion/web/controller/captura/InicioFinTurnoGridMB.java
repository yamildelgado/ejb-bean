package mx.com.bcm.banamex.ae.apliacion.web.controller.captura;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaHabilitadaPorTurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.HistTurnoEnOperacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;

@ManagedBean(name = "inicioFinTurnoGridMB")
@RequestScoped
public class InicioFinTurnoGridMB {
	@EJB
	CapturaFacade capturaFacade;
	@EJB
	CatalogoFacade catalogoFacade;
	private List<TurnoVO> listaTurnoVO;
	private List<HistTurnoEnOperacionVO> listHistTurnoVO;
	private List< CajaHabilitadaPorTurnoVO> listCajaTurnoVO;
	private Map<String, Boolean> checked = new HashMap<String, Boolean>();
	private String ocultar;

	

	@PostConstruct
	public void init() {
		try {
			this.obtenerTurnos();
			this.iniciarTurno();
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void obtenerTurnos() throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException {

		/*int idSubBoveda = 1;
		
		this.listaTurnoVO = this.capturaFacade.getInicioFinTurnoBOBeanLocal().obtenerTurnorPorSubBoveda(idSubBoveda);

		for (TurnoVO elemento : this.listaTurnoVO) {

			if (elemento.getTurStatus().equals("Abierta")) {
				this.setOcultar("hidden");
				this.checked.put(elemento.getTurnoId(), true);
				this.listHistTurnoVO = this.capturaFacade.getInicioFinTurnoBOBeanLocal().obtenerHistTurnoEnOperacion(elemento);
				this.listCajaTurnoVO = this.capturaFacade.getInicioFinTurnoBOBeanLocal().getCajasPorTurnoVO(elemento.getTurnoId());
			} else {
				this.checked.put(elemento.getTurnoId(), false);
			}

		}*/
		
		this.listaTurnoVO = new ArrayList<TurnoVO>();
		TurnoVO turnoUno = new TurnoVO();
		TurnoVO turnoDos = new TurnoVO();
		TurnoVO turnoTres = new TurnoVO();
		
		
		turnoUno.setTurDescripcion("MATUTINO");
		turnoUno.setTurHoraInicio("9:00");
		turnoUno.setTurHoraFin("14:00");
		turnoUno.setTurStatus("Cerrada");
		
		this.listaTurnoVO.add(turnoUno); 
		
		turnoDos.setTurDescripcion("VESPERTINO");
		turnoDos.setTurHoraInicio("15:00");
		turnoDos.setTurHoraFin("18:00");
		turnoDos.setTurStatus("Cerrada");
		
		this.listaTurnoVO.add(turnoDos);
		
		turnoTres.setTurDescripcion("NOCTURNO");
		turnoTres.setTurHoraInicio("19:00");
		turnoTres.setTurHoraFin("6:00");
		turnoTres.setTurStatus("Cerrada");
		
		this.listaTurnoVO.add(turnoTres);
		
		

	}

	public void seleccion(AjaxBehaviorEvent evt) {
		for (TurnoVO elemento : this.listaTurnoVO) {

			if (this.checked.get(elemento.getTurnoId())) {

			} else {
				this.checked.put(elemento.getTurnoId(), false);

			}
		}

	}

	public void iniciarTurno() throws EfectivoAplicacionBOException,	EfectivoAplicacionDAOException {
		HistTurnoEnOperacionVO turnoActivo = new HistTurnoEnOperacionVO();
		
		TurnoVO turnoVO = new TurnoVO();
		
		
		/*int idSubBoveda = 1;
		FechaContableVO fechaContableVO = this.capturaFacade.getInicioFinTurnoBOBeanLocal().obtenerFechaContableActual();
		HistTurnoEnOperacionVO turnoActivo = new HistTurnoEnOperacionVO();
		TurnoVO turnoVO = new TurnoVO();
		String seleccion = "";

		for (TurnoVO elemento : this.listaTurnoVO) {

			if (checked.get(elemento.getTurnoId())) {
				seleccion = elemento.getTurnoId();
				turnoVO = elemento;
				
				
			}
		}
		
		turnoVO.setTurStatus("Abierta");
		
		this.capturaFacade.getInicioFinTurnoBOBeanLocal().editTurno(turnoVO,(short)idSubBoveda);
		
		this.listCajaTurnoVO = this.capturaFacade.getInicioFinTurnoBOBeanLocal().getCajasPorTurnoVO(seleccion);
		turnoActivo.setTurnoId(seleccion);
		turnoActivo.setHistFecHorIni(this.obtenerFechaHora());
		turnoActivo.setFeccontIdn(DateFormateHelper.getFecha(fechaContableVO.getFecContId()));
		turnoActivo.setHistFecContInicial(DateFormateHelper.getFecha(fechaContableVO.getFecContId()));
		turnoActivo.setHistFecHorIni(this.obtenerFechaHora());
		turnoActivo.setHistCambioFecCont("00");
		turnoActivo.setHistStatus("Abierta");
		turnoActivo.setHistFecHorFin(this.obtenerFechaHora());
		turnoActivo.setHistNominaIniciaTurno(22);
		turnoActivo.setHistNominaTerminaTurno(22);
		turnoActivo.setDescripcionTurno(turnoVO.getTurDescripcion());

		// checked.clear(); // If necessary.

		
			
			  List<HistTurnoEnOperacionVO> listHistTurnoAuxVO = new	  ArrayList<HistTurnoEnOperacionVO>();
			  listHistTurnoAuxVO.add(turnoActivo); 
			  this.listHistTurnoVO =  listHistTurnoAuxVO;
			  
			  this.capturaFacade.getInicioFinTurnoBOBeanLocal().addHistTurnoEnOperacion(turnoActivo);
			 
		this.setOcultar("hidden");*/
		
		turnoActivo.setTurnoId("1");
		turnoActivo.setHistFecHorIni(this.obtenerFechaHora());
		turnoActivo.setFeccontIdn(DateFormateHelper.getFecha(DateFormateHelper.getFechaDate(this.obtenerFechaHora())));
		turnoActivo.setHistFecContInicial(DateFormateHelper.getFecha(DateFormateHelper.getFechaDate(this.obtenerFechaHora())));
		turnoActivo.setHistFecHorIni(this.obtenerFechaHora());
		turnoActivo.setHistCambioFecCont("00");
		turnoActivo.setHistStatus("Abierta");
		turnoActivo.setHistFecHorFin(this.obtenerFechaHora());
		turnoActivo.setHistNominaIniciaTurno(22);
		turnoActivo.setHistNominaTerminaTurno(22);
		turnoActivo.setDescripcionTurno(turnoVO.getTurDescripcion());
		 List<HistTurnoEnOperacionVO> listHistTurnoAuxVO = new	  ArrayList<HistTurnoEnOperacionVO>();
		  listHistTurnoAuxVO.add(turnoActivo); 
		  this.listHistTurnoVO = listHistTurnoAuxVO;
		  
		  CajaHabilitadaPorTurnoVO  cajaUno  = new CajaHabilitadaPorTurnoVO();
		  CajaHabilitadaPorTurnoVO cajaDos  = new CajaHabilitadaPorTurnoVO();
		  CajaHabilitadaPorTurnoVO cajaTres  = new CajaHabilitadaPorTurnoVO();
		  this.listCajaTurnoVO =new  ArrayList< CajaHabilitadaPorTurnoVO>();
		  
		  
		  cajaUno.setCajaIdn((short)1234);
		  cajaUno.setAewebcatgralDescripcion("Verificadora de Billete");
		  cajaUno.setStatus("Deshabilitada");
		  
		  this.listCajaTurnoVO.add(cajaUno);
		  
		  
		  
		  cajaDos.setCajaIdn((short)12);
		  cajaDos.setAewebcatgralDescripcion("Verificadora de Monedas");
		  cajaDos.setStatus("Deshabilitada");
		  this.listCajaTurnoVO.add(cajaDos);
		  
		  
		  cajaTres.setCajaIdn((short)1);
		  cajaTres.setAewebcatgralDescripcion("Verificadora Pico Billete");
		  cajaTres.setStatus("Deshabilitada");
		  this.listCajaTurnoVO.add(cajaTres);
		  
		 
		

	}

	public String obtenerFechaHora() {
		Date fecha = new Date();

		String fechaHora = DateFormateHelper.getFechaHora(fecha);

		return fechaHora;

	}

	/**
	 * @return the listaTurnoVO
	 */
	public List<TurnoVO> getListaTurnoVO() {
		return listaTurnoVO;
	}

	/**
	 * @param listaTurnoVO
	 *            the listaTurnoVO to set
	 */
	public void setListaTurnoVO(List<TurnoVO> listaTurnoVO) {
		this.listaTurnoVO = listaTurnoVO;
	}

	/**
	 * @return the listHistTurno
	 */
	public List<HistTurnoEnOperacionVO> getListHistTurno() {
		return listHistTurnoVO;
	}

	/**
	 * @param listHistTurno
	 *            the listHistTurno to set
	 */
	public void setListHistTurno(List<HistTurnoEnOperacionVO> listHistTurnoVO) {
		this.listHistTurnoVO = listHistTurnoVO;
	}

	/**
	 * @return the checked
	 */
	public Map<String, Boolean> getChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            the checked to set
	 */
	public void setChecked(Map<String, Boolean> checked) {
		this.checked = checked;
	}
	/**
	 * @return the ocultar
	 */
	public String getOcultar() {

		return ocultar;
	}

	/**
	 * @param ocultar
	 *            the ocultar to set
	 */
	public void setOcultar(String ocultar) {
		this.ocultar = ocultar;
	}

	/**
	 * @return the listCajaTurnoVO
	 */
	public List< CajaHabilitadaPorTurnoVO> getListCajaTurnoVO() {
		return listCajaTurnoVO;
	}

	/**
	 * @param listCajaTurnoVO the listCajaTurnoVO to set
	 */
	public void setListCajaTurnoVO(List< CajaHabilitadaPorTurnoVO> listCajaTurnoVO) {
		this.listCajaTurnoVO = listCajaTurnoVO;
	}
	

}
