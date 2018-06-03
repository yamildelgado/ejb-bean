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
import mx.com.bcm.banamex.ae.persistencia.modelo.Contrato;
import mx.com.bcm.banamex.ae.persistencia.vo.ContratoVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class ContratoAssambler {
	
	
	/** Metodo que permite  asamblar los registros necesarios para
	 *  mostrados en el GRID DE CONTRATOS
	 * @param contrato
	 * @return
	 */
	public static  ContratoVO getContratoVO(Contrato contrato){
	  ContratoVO  contratoVO=new ContratoVO();
	  contratoVO.setNum(contrato.getCntrtoNum()); 
	  contratoVO.setFecAltaDeposito(getFecha(contrato.getCntrtoFecAltaDeposito()));
	  contratoVO.setFecAltaDotacion(getFecha(contrato.getCntrtoFecAltaDotacion()));
	  return contratoVO;
	}
	
	
	/** Metodo que permite  asamblar los registros necesarios para
	 *  mostrados la ventana de consulta de Contratos
	 * @param contrato
	 * @return
	 */
	public static  ContratoVO getContratoVODetalle(Contrato contrato){
		  ContratoVO  contratoVO=new ContratoVO();
		  contratoVO.setNum(contrato.getCntrtoNum()); 
		  contratoVO.setFecAltaDeposito(getFecha(contrato.getCntrtoFecAltaDeposito()));
		  contratoVO.setFecAltaDotacion(getFecha(contrato.getCntrtoFecAltaDotacion()));
		  contratoVO.setFecCancCte(getFecha(contrato.getCntrtoFecCancCte()));
		  contratoVO.setFecVencContrato(getFecha(contrato.getCntrtoFecVencContrato()));
		 // contratoVO.setColonia(contrato.getCntrtoColonia());
		  contratoVO.setNombreCte(contrato.getCntrtoNombreCte());
		  contratoVO.setRfc(contrato.getCntrtoRfc());
		  contratoVO.setDifPermitida(contrato.getCntrtoDifPermitida());
		  contratoVO.setTel1(contrato.getCntrtoTel1());
		  contratoVO.setTel2(contrato.getCntrtoTel2());
		  contratoVO.setImpCshPolicy(contrato.getCntrtoImpCshPolicy());
		  contratoVO.setTipoProcBill(contrato.getCntrtoTipoProcBill());
		  contratoVO.setTipoProcMon(contrato.getCntrtoTipoProcMon());
		  contratoVO.setStatus(contrato.getCntrtoStatus());
		  contratoVO.setRfc(contrato.getCntrtoRfc());
		  contratoVO.setManejoProcPrevFich(contrato.getCntrtoManejoProcPrevFich());
		  contratoVO.setBajaLogica(contrato.getCntrtoBajaLogica());
		   return contratoVO;
		}


}
