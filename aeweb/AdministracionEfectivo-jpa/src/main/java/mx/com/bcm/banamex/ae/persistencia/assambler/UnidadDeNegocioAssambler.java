/** 
 * Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;

import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocioPK;
import mx.com.bcm.banamex.ae.persistencia.vo.SolicitudDotacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.UnidadDeNegocioVO;


import static mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper.getFecha;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public class UnidadDeNegocioAssambler {

	 /**
	 * @param unidadDeNegocio
	 * @return
	 */
	public static UnidadDeNegocioVO getUnidadDeNegocioVO(UnidadDeNegocio unidadDeNegocio){
		 UnidadDeNegocioVO unidadDeNegocioVO=new UnidadDeNegocioVO();
		 unidadDeNegocioVO.setUnidadDeNegocioPK(unidadDeNegocio.getUnidadDeNegocioPK());
		 unidadDeNegocioVO.setNombre(unidadDeNegocio.getUnegNombre());
		 unidadDeNegocioVO.setUnidadDeNegocioPK(unidadDeNegocio.getUnidadDeNegocioPK());
		 return unidadDeNegocioVO;
	 }
	 
	 /**
	 * @param unidadDeNegocio
	 * @return
	 */
	public static UnidadDeNegocioVO getUnidadDeNegocioVODetalle(UnidadDeNegocio unidadDeNegocio){
		 
		    UnidadDeNegocioVO unidadDeNegocioVO=new UnidadDeNegocioVO();
		 	unidadDeNegocioVO.setUnidadDeNegocioPK(unidadDeNegocio.getUnidadDeNegocioPK());
		 	unidadDeNegocioVO.setCalle(unidadDeNegocio.getUnegCalleNum());
		 	unidadDeNegocioVO.setColonia(unidadDeNegocio.getUnegColonia());
		 	unidadDeNegocioVO.setCp(unidadDeNegocio.getUnegColonia());
		 	unidadDeNegocioVO.setDeleg(unidadDeNegocio.getUnegDeleg());
		 	unidadDeNegocioVO.setNombre(unidadDeNegocio.getUnegNombre());
		 	unidadDeNegocioVO.setNombreCliente(unidadDeNegocio.getContrato().getCntrtoNombreCte());
		 	unidadDeNegocioVO.setFecAltaDep(getFecha(unidadDeNegocio.getContrato().getCntrtoFecAltaDeposito()));
		 	unidadDeNegocioVO.setFecAltaDot(getFecha(unidadDeNegocio.getContrato().getCntrtoFecAltaDotacion()));
		 	unidadDeNegocioVO.setFecCancel(getFecha(unidadDeNegocio.getContrato().getCntrtoFecCancCte()));
		 	unidadDeNegocioVO.setFecVenc(getFecha(unidadDeNegocio.getContrato().getCntrtoFecVencContrato()));
		 	unidadDeNegocioVO.setTipProcBill(unidadDeNegocio. getContrato().getCntrtoTipoProcBill());
		 	unidadDeNegocioVO.setTipProcMon(unidadDeNegocio. getContrato().getCntrtoDifPermitida());
		 	unidadDeNegocioVO.setDifsPermitidas((unidadDeNegocio.getContrato().getCntrtoDifPermitida()));
		 	unidadDeNegocioVO.setNivDificultad(unidadDeNegocio.getUnegNivDificultad());
		 	unidadDeNegocioVO.setNumContrato((unidadDeNegocio.getContrato().getCntrtoNum()));
		 	unidadDeNegocioVO.setSirhIdn(unidadDeNegocio.getCpae().getCpaesEstructuraSirhIdn());
		 	unidadDeNegocioVO.setHorarioRecepcion(unidadDeNegocio.getUnegHorarioRecepcion());
		 	unidadDeNegocioVO.setEntregaFichas(unidadDeNegocio.getUnegEntregaFichas());
		 	unidadDeNegocioVO.setSucursalFicha(unidadDeNegocio.getUnegSucEntregaFichas());
		
		 return unidadDeNegocioVO;
	 }
	
	

	
}
