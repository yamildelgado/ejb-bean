package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;



/**
 * @author : Marco Antonio Abitia G.
 *
 */
@Local
public  interface CatalogoFechasContablesBOBeanLocal {
	
	/**
	 * @return Date
	 * @throws EfectivoAplicacionBOException
	 * 
	 */
	
	public abstract  FechaContableVO consultaFechaContablePorid(Date date) throws EfectivoAplicacionBOException;
	
	/**
	 * @return List FechasContables
	 * @throws EfectivoAplicacionBOException
	 * 
	 */
	public abstract List<FechaContableVO> consultaFechasContables() throws EfectivoAplicacionBOException;
}
