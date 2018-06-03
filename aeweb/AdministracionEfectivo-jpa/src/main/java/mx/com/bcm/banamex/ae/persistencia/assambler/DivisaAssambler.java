/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;


import mx.com.bcm.banamex.ae.persistencia.dto.DivisaDTO;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaIdNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;


/**
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 * @author JESÚS CARBAJAL MONTES
 *
 */
public class DivisaAssambler {

	/**
	 * @param Divisa
	 * @return DivisaVO
	 */
	public static DivisaVO getDivisaVO(Divisa Divisa){
		DivisaVO DivisaVO=new DivisaVO();
		DivisaVO.setDivisaNumeroID(new Short(Divisa.getDivisaId()));
		DivisaVO.setNombreCorto(Divisa.getDivisaNomCorto());
		DivisaVO.setNombreLargo(Divisa.getDivisaNomLargo());
		DivisaVO.setAbreviatura(Divisa.getDivisaAbreviatura());
		return DivisaVO;
		
	}
	/**
	 * @param Divisa
	 * @return DivisaIdNombreVO
	 */
	public static DivisaIdNombreVO getDivisaIdNombreVO(DivisaDTO Divisa)
	{
		DivisaIdNombreVO divisaIDNombreVO=new DivisaIdNombreVO();
		divisaIDNombreVO.setDivisaId(Divisa.getDivisa_Id());
		divisaIDNombreVO.setDivisaNomLargo(Divisa.getDivisaNombreCorto());
		
		return divisaIDNombreVO;
		
	}
	
}
