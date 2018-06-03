package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author JUAN MANUEL HERNANDEZ NAVARRO
 *
 */
@Local
public interface CatalogoMensajeAewebBOBeanLocal {
	/**
	 * @param codigoMensaje
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract MensajeAewebVO consultaCatalogoMensajePorCodigo(Integer codigoMensaje) throws EfectivoAplicacionBOException;
	/**
	 * @param listaMensjaes
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract Map<Integer,MensajeAewebVO> consultaMensajeAewebPorNum(List<Integer> listaMensjaes) throws EfectivoAplicacionBOException ;

}
