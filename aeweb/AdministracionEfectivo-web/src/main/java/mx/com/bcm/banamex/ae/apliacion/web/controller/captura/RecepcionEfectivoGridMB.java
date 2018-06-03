package mx.com.bcm.banamex.ae.apliacion.web.controller.captura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

import mx.com.bcm.banamex.ae.negocio.facade.CapturaFacade;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaIdNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvIdnNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

/**
 * @author JESUS CARBAJAL MONTES
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean(name = "recepcionEfectivoGridMB")
@RequestScoped
public class RecepcionEfectivoGridMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB 
	private CapturaFacade capturaFacade;
	private List<EtvIdnNombreVO> listEtvIdnNombreVO;
	private List<DivisaIdNombreVO> listDivisa;
	private EtvIdnNombreVO etv;
	private RecepcionVO recepcionVO;
	private String camion;
	private short idcaja;
	private short turno;
	private String entidad;
	private String entidadCliente;
	private String entidadSucursal;
	private static String PARAMETRO="parametro";
	@PostConstruct
	public void init()
	{
		this.camion=new String("367480");
		this.idcaja=1999;
		this.turno=3;
		this.etv=new EtvIdnNombreVO();
		this.listEtvIdnNombreVO=new ArrayList<EtvIdnNombreVO>();
		
		EtvIdnNombreVO etv=new EtvIdnNombreVO();
		etv.setEtvIdn((short) 1);
		etv.setEtvNombreLargo("SERVICIO PANAMERICANO DE PROTECCION SA");
		listEtvIdnNombreVO.add(etv);
		etv=new EtvIdnNombreVO();
		etv.setEtvIdn((short) 2);
		etv.setEtvNombreLargo("COMPAÑÍA MEX DE TRASLADO DE VALORES SA");
		listEtvIdnNombreVO.add(etv);
		etv=new EtvIdnNombreVO();
		etv.setEtvIdn((short) 3);
		etv.setEtvNombreLargo("TRANSPORTES DE SERGURIDAD TECNICA SA");
		listEtvIdnNombreVO.add(etv);
		
		
		this.entidad=new String();
		this.entidadCliente=new String("");
		this.entidadSucursal=new String("");
		this.recepcionVO=new RecepcionVO();
		this.recepcionVO.setCajaIdn((short) 1234);
		this.recepcionVO.setCajahabFecHrHabilita(new Date());
		
		this.listDivisa=new ArrayList<DivisaIdNombreVO>();
		
		DivisaIdNombreVO divisa=new DivisaIdNombreVO();
		divisa.setDivisaId((short) 1);
		divisa.setDivisaNomLargo("MONEDA NACIONAL");
		this.listDivisa.add(divisa);
		divisa=new DivisaIdNombreVO();
		divisa.setDivisaId((short) 2);
		divisa.setDivisaNomLargo("CORONA SUECA");
		this.listDivisa.add(divisa);
		divisa=new DivisaIdNombreVO();
		divisa.setDivisaId((short) 3);
		divisa.setDivisaNomLargo("UNIDAD DE INVERSION");
		this.listDivisa.add(divisa);
		divisa=new DivisaIdNombreVO();
		divisa.setDivisaId((short) 4);
		divisa.setDivisaNomLargo("DOLAR CANADIENSE");
		this.listDivisa.add(divisa);
		divisa=new DivisaIdNombreVO();
		divisa.setDivisaId((short) 5);
		divisa.setDivisaNomLargo("DOLAR AMERICANO");
		this.listDivisa.add(divisa);
		
		/*try {
			
		//	this.listEtvIdnNombreVO=this.capturaFacade.getRecepcionEfectivoBOBeanLocal().consultaEtvIdnNombre();
			//this.listDivisa=this.capturaFacade.getRecepcionEfectivoBOBeanLocal().consultaDivisaIdNombre();
			System.out.println("##########entro try"+this.listEtvIdnNombreVO.size()+" "+this.listDivisa.size());
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("##########salio init");*/
	}
	
	public String iniciarRecepcion()  throws EfectivoAplicacionBOException
	{
		
		System.out.println(this.recepcionVO.toString());
		//.capturaFacade.getRecepcionEfectivoBOBeanLocal().agregarRecepcion(recepcionVO);
		System.out.println("####################### ");
		String cad=this.etv.getEtvNombreLargo();
		System.out.println("####################### ");
		System.out.println(cad);
		System.out.println(this.camion);
		
		return "recepcionEfectivoPantallaDos";
	}
	
	
	public void setEntidadS(AjaxBehaviorEvent event)
	{
		
		System.out.println("entro switcheo"+this.entidad);
		if(this.entidad.equals("1"))
		{
		this.setEntidadCliente("visible");
		this.setEntidadSucursal("hidden");
		System.out.println("entro switch 1");
		}
		else
		if(this.entidad.equals("2"))
		{
			this.setEntidadCliente("hidden");
			this.setEntidadSucursal("");
			System.out.println("entro switch 2");
		}
		else{System.out.println("entro switch 0");}
			
		
	}
	
	public List<EtvIdnNombreVO> getListEtvIdnNombreVO() {
		return listEtvIdnNombreVO;
	}
	public void setListEtvIdnNombreVO(List<EtvIdnNombreVO> listEtvIdnNombreVO) {
		this.listEtvIdnNombreVO = listEtvIdnNombreVO;
	}
	public EtvIdnNombreVO getEtv() {
		return etv;
	}
	public void setEtv(EtvIdnNombreVO etv) {
		this.etv = etv;
	}
	/**
	 * @return the camion
	 */
	public String getCamion() {
		return camion;
	}

	/**
	 * @param camion the camion to set
	 */
	public void setCamion(String camion) {
		this.camion = camion;
	}

	public short getIdcaja() {
		return idcaja;
	}

	public void setIdcaja(short idcaja) {
		this.idcaja = idcaja;
	}

	public short getTurno() {
		return turno;
	}

	public void setTurno(short turno) {
		this.turno = turno;
	}

	public List<DivisaIdNombreVO> getListDivisa() {
		return listDivisa;
	}

	public void setListDivisa(List<DivisaIdNombreVO> listDivisa) {
		this.listDivisa = listDivisa;
	}

	public String getEntidadSucursal() {
		return entidadSucursal;
	}

	public void setEntidadSucursal(String entidadSucursal) {
		this.entidadSucursal = entidadSucursal;
	}

	public String getEntidadCliente() {
		return entidadCliente;
	}

	public void setEntidadCliente(String entidadCliente) {
		this.entidadCliente = entidadCliente;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public RecepcionVO getRecepcionVO() {
		return recepcionVO;
	}

	public void setRecepcionVO(RecepcionVO recepcionVO) {
		this.recepcionVO = recepcionVO;
	}


}
