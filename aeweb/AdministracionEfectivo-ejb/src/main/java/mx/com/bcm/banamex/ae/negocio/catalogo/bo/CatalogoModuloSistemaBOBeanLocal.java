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
import mx.com.bcm.banamex.ae.persistencia.vo.ModuloSistemaVO;


/**
 * @author DAVID FERNANDO RUIZ MARTINEZ
 *
 */
public @Local interface CatalogoModuloSistemaBOBeanLocal {
	
	/**
	 * @param moduloSistemaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ModuloSistemaVO> consultaModulosPorParametros(ModuloSistemaVO moduloSistemaVO) throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ModuloSistemaVO> consultaModulos() throws EfectivoAplicacionBOException;
}
