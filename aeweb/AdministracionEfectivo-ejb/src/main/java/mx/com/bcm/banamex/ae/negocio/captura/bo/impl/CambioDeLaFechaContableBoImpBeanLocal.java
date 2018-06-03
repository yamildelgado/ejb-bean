/**
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;


import static mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper.sumarFechasDias;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.captura.bo.CambioDeLaFechaContableBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEmpleadosDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoFechasContablesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CambioDeLaFechaContableDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDiasInhabilesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.HistTurnoEnOperacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Empleado;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.modelo.HistTurnoEnOperacion;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;
import mx.com.bcm.banamex.ae.persistencia.assambler.CambioDeLaFechaContableAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.TurnoAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.FechaContableAssambler;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */

@Stateless( mappedName="cambioFechaContableBO")
public   class CambioDeLaFechaContableBoImpBeanLocal implements CambioDeLaFechaContableBOBeanLocal {
	
	
	
	/**
	 *  Servicios de consulta a BASE DE DE DATOS
	 */
	
	 private @EJB CatalogoDiasInhabilesDAOBeanLocal diasInhabilesDAO;
	 private @EJB CambioDeLaFechaContableDAOBeanLocal cambioFecContDAO;
	
	 @EJB private CatalogoTurnoDAOBeanLocal turnoDAO;
	 @EJB private CatalogoFechasContablesDAOBeanLocal fechaContable;
	 @EJB private CatalogoTurnoDAOBeanLocal turno;
	 @EJB private CatalogoSubBovedaDAOBeanLocal subBovedaDAO;
	 @EJB private HistTurnoEnOperacionDAOBeanLocal histDAO;
	 @EJB private CatalogoEmpleadosDAOBeanLocal empDAO;
	 
	 @TransactionAttribute(TransactionAttributeType.SUPPORTS)
	 @Override
	 public List<TurnoVO> obtenerTurnorPorSubBoveda(int subBoveda) {
			// TODO Auto-generated method stub
			List<Turno> listaTurno = new ArrayList<Turno>();
			List<TurnoVO> listaTurnoVO = new ArrayList<TurnoVO>();
			
			listaTurno = this.turnoDAO.buscarTurnoPorSubBoveda(subBoveda);
			 for(Turno elemento : listaTurno){
				 TurnoVO turnoVO = TurnoAssambler.getTurnoIniFinTurnoVO(elemento);
				 listaTurnoVO.add(turnoVO);
			 }			
			
			
			
			return listaTurnoVO;
		}
	
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
		public FechaContableVO obtenerFechaContableActual()	throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException {
		FechaContable fechaContable = new FechaContable();
			FechaContableVO fechaContableVO = new FechaContableVO();
						fechaContable = this.fechaContable.obtenerFechaContableActiva();
						fechaContableVO = FechaContableAssambler.getFechaContableVO(fechaContable);
						
			
			return fechaContableVO;
		}
	

	
	
	
	@Override
	public void execute()  {
		// TODO Auto-generated method stub
		
		Calendar fechaActualCalendar = Calendar.getInstance();
		Date date = new Date();
		Date fechaTemp = new Date();
		Integer dia = fechaActualCalendar.get(Calendar.DAY_OF_WEEK);
			  					
		switch(dia){
		
		case Calendar.SUNDAY:				// Domingo
			fechaTemp = sumarFechasDias(date, 1);
			System.out.println(sumarFechasDias(date, 1));

		break;
		case Calendar.SATURDAY:  // Sabado
			fechaTemp = sumarFechasDias(date, 2);
			System.out.println(sumarFechasDias(date, 2));
			break;

		case Calendar.FRIDAY:   // viernes
			fechaTemp = sumarFechasDias(date,Calendar.FRIDAY);
			System.out.println(sumarFechasDias(date, 3));
	     break;
	     
		default:
			fechaTemp = sumarFechasDias(date, 1);
			System.out.println(sumarFechasDias(date, 1));
			
        }
	     
		insertarFecha( fechaTemp );
		
		
	}
	
	
	private void insertarFecha(Date fecha){
		FechaContable fechaContable=new FechaContable();
		boolean isFechaInhabil = false;
	
			isFechaInhabil = this.diasInhabilesDAO.getDiaInhabil(fecha);
			
			// Solo debe entrar si es true (fecha inhabil), le suma uno a la fecha 
			if(isFechaInhabil){
				fecha = sumarFechasDias( fecha, 1 );
				fechaContable.setFeccontIdn(fecha);
				fechaContable.setFeccontStatus("01");
				this.cambioFecContDAO.persist(fechaContable);
				
			}
				
	}
	
	@Override
	public List<CambioDeLaFechaContableVO> obtenerFechas() throws EfectivoAplicacionBOException {
		List<CambioDeLaFechaContableVO> listaFechas = new ArrayList<CambioDeLaFechaContableVO>();
		
		try {
			
			System.out.println("Entro----");
			for(SubBoveda sub :  subBovedaDAO.obtenerSubBovedas()){
				System.out.println("Trae la subBoveda"+ sub.getSubbovedaDescripcion());
				System.out.println("Trae el Cpae" + sub.getCpae().getCpaesEstructuraSirhIdn());
				
				if(!sub.getTurnoList().isEmpty()){
					
					for(Turno turno : sub.getTurnoList()){
						
						System.out.println("Trae turnos" + turno.getTurnoDescrip());
						
						for(HistTurnoEnOperacion hist : histDAO.obtenerHist(Integer.parseInt(turno.getTurnoId()))){
							
							System.out.println("Trae historial" + hist.getFeccontIdn().getFeccontIdn());
							CambioDeLaFechaContableVO fechaVO = new CambioDeLaFechaContableVO();
							fechaVO = CambioDeLaFechaContableAssambler.tabla(sub,turno,hist);
							listaFechas.add(fechaVO);
						}
					}
				}
				
			}
			
			return listaFechas;
		
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return listaFechas;
	}

	public CambioDeLaFechaContableVO obtenerEmpleado() throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException{
		 
		CambioDeLaFechaContableVO cambio = new CambioDeLaFechaContableVO();
		Empleado emp = new Empleado();
		HistTurnoEnOperacion hist =	 new HistTurnoEnOperacion();
		
		hist=this.histDAO.obtenerhora();
		emp=this.empDAO.findById(90741180);
		cambio=CambioDeLaFechaContableAssambler.empleado(emp, hist);
		return cambio;
	}
	
	
}