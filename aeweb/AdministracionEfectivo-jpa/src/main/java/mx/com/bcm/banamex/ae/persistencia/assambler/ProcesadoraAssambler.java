/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;


import static mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper.getFecha;
import static mx.com.bcm.banamex.ae.persistencia.helper.HourFormateHelper.getStringHora;
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;
import mx.com.bcm.banamex.ae.persistencia.modelo.ProcesadoraPK;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;


/**
 * @author OCE-WCD CARLOS MONTIEL GUTIÉRREZ
 *
 */
public class ProcesadoraAssambler {
	
	/**
	 * @param   procesadora
	 * @return
	 */
	
	public static ProcesadoraVO getProcesadoraVO(Procesadora procesadora){	
		
		ProcesadoraVO procesadoraVO=new ProcesadoraVO();
		procesadoraVO.setProcesadoraPK(procesadora.getProcesadoraPK());
		procesadoraVO.setProcesadoraEtvId(procesadora.getProcesadoraPK().getEtvIdn());
		procesadoraVO.setProcesadoraSirhId(procesadora.getProcesadoraPK().getCpaesEstructuraSirhIdn());
		procesadoraVO.setFrecBusqueda(getFecha(procesadora.getProcesadoraFreciaBusqueda()));
		procesadoraVO.setProcesadoraBajaLogica(procesadora.getProcesadoraBajaLogica());
		procesadoraVO.setProcesadoraIntelar(procesadora.getProcesadoraCarpetaIntelar());
		procesadoraVO.setNombreSirh(procesadora.getCpae().getSirhNombre());
		procesadoraVO.setEtvNombre(procesadora.getEtv().getEtvNombreCorto());
		procesadoraVO.setProcesadoraCpae(String.valueOf(procesadora.getProcesadoraPK().getCpaesEstructuraSirhIdn())+"|"+procesadora.getCpae().getSirhNombre()+"|"+procesadora.getProcesadoraPK().getEtvIdn()+"|"+procesadora.getEtv().getEtvNombreCorto());
		
		return procesadoraVO;
		
	}
	
	
	
/**
 * @param procesadoraVO
 * @return
 */
public static Procesadora getProcesadora(ProcesadoraVO procesadoraVO){	
	
		Procesadora procesadora=new Procesadora();
		ProcesadoraPK procesadoraPK = new ProcesadoraPK(procesadoraVO.getProcesadoraSirhId(), procesadoraVO.getProcesadoraEtvId());
		procesadoraPK.setEtvIdn(procesadoraVO.getProcesadoraEtvId());
		procesadoraPK.setCpaesEstructuraSirhIdn(procesadoraVO.getProcesadoraSirhId());
		procesadora.setProcesadoraPK(procesadoraPK);		
		procesadora.setProcesadoraFreciaBusqueda(getStringHora(procesadoraVO.getFrecBusqueda() ) );
		procesadora.setProcesadoraBajaLogica(procesadoraVO.getProcesadoraBajaLogica());
		procesadora.setProcesadoraCarpetaIntelar(procesadoraVO.getProcesadoraIntelar());
		return procesadora;
		
	}
	
	
}
