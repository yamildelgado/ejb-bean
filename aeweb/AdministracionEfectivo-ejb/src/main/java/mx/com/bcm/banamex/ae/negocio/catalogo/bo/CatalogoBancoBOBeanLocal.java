 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.BancoVO;


/**
 * @author JESUS CARBAJAL MONTES
 *
 */
public @Local interface CatalogoBancoBOBeanLocal {
	
	/**
	 * @return List<BancoVO> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<BancoVO> consultBancos() throws EfectivoAplicacionBOException;
	/**
	 * @param idBanco
	 * @return BancoVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract BancoVO consultBancosPorId(short idBanco) throws EfectivoAplicacionBOException;
	/**
	 * @param descripcionBanco
	 * @return BancoVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract BancoVO consultBancosPorDescripcion(String descripcionBanco) throws EfectivoAplicacionBOException;

}
