/** 
 * Todos los Derechos Reservados 2013 BCM.
*  Bufete Consultor Mexicano
*
*  Este software contiene informacion propiedad exclusiva del BCM considerada
*  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
*  parcial o total.
*  
*/
package mx.com.bcm.banamex.ae.negocio.captura.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CambioDeLaFechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;




/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */
public @Local interface CambioDeLaFechaContableBOBeanLocal {
	
	
	
	public abstract void execute();
	/**
	 * @param subBoveda
	 * @return
	 */
	public abstract  List<TurnoVO> obtenerTurnorPorSubBoveda(int subBoveda) ;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 * @throws EfectivoAplicacionDAOException
	 */
	public abstract FechaContableVO obtenerFechaContableActual()	throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException ;
	
	public abstract List<CambioDeLaFechaContableVO> obtenerFechas()throws EfectivoAplicacionBOException;
	public CambioDeLaFechaContableVO obtenerEmpleado() throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException;
}

