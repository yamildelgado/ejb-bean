/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.dto.EtvDTO;
import mx.com.bcm.banamex.ae.persistencia.modelo.Etv;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvIdnNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */

public class EtvAssambler {
	
	public static  EtvVO getEtvVO (Etv etv){
		EtvVO etvVO = new EtvVO();
		
		etvVO.setEtvBajaLogica(etv.getEtvBajaLogica());
		etvVO.setEtvCalle(etv.getEtvCalle());
		etvVO.setEtvColonia(etv.getEtvColonia());
		etvVO.setEtvContacto(etv.getEtvContacto());
		etvVO.setEtvCp(etv.getEtvCp());
		etvVO.setEtvDeleg(etv.getEtvDeleg());
		etvVO.setEtvIdn(etv.getEtvIdn());
		etvVO.setEtvNombreCorto(etv.getEtvNombreCorto());
		etvVO.setEtvNombreLargo(etv.getEtvNombreLargo());
		etvVO.setEtvTipoServico(etv.getEtvTipoServico());
		etvVO.setIdEstadoRepublica(etv.getIdEstadoRepublica());
		etvVO.setIdnSubboveda(etv.getIdnSubboveda());
		
		return etvVO;
	}
	

	/**
	 * @param objeto EtvIdnNombreDTO
	 * @return objetoEtvIdnNombreVO
	 */
	public static EtvIdnNombreVO getEtvIdnNombreVO(EtvDTO elemento) {
		EtvIdnNombreVO obj=new EtvIdnNombreVO();
		obj.setEtvIdn(elemento.getEtvIdn());
		obj.setEtvNombreLargo(elemento.getEtvNombreLargo());
		return obj;
	}
	
}
