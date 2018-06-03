 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoOperacionesProcesadoraVO;

import java.util.List;

/**
 * @author JESUS CARBAJAL MONTES
 *
 */
public @Local interface TipoDeOperacionBOBeanLocal {
	/**
	 * @return List<> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<TipoOperacionesProcesadoraVO> consultaOperaciones()throws EfectivoAplicacionBOException;

	
}
