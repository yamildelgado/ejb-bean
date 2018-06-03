package mx.com.bcm.banamex.ae.negocio.catalogo.bo;
import java.util.List;
import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.DiasInhabilesVO;

/**
 * @author : JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface CatalogoDiasInhabilesBOBeanLocal {

	/**
	 * @return List DiasInhabiles
	 * @throws EfectivoAplicacionBOException
	 * 
	 */
	public abstract List<DiasInhabilesVO> consultaDiasInhabiles() throws EfectivoAplicacionBOException;

}
