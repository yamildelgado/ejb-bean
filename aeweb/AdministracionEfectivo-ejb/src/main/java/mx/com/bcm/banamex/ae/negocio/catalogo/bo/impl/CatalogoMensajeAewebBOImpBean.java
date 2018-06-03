/**
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoMensajeAewebBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.MensajeAssambler;
import mx.com.bcm.banamex.ae.persistencia.constantes.CatalogoErrorType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoMensajeAewebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public @Stateless
class CatalogoMensajeAewebBOImpBean implements CatalogoMensajeAewebBOBeanLocal {

	@EJB
	private CatalogoMensajeAewebDAOBeanLocal mensajeAewebDAO;

	@Override
	public MensajeAewebVO consultaCatalogoMensajePorCodigo(Integer codigoMensaje)
			throws EfectivoAplicacionBOException {

		if (codigoMensaje == null) {

			CatMensajesAeweb mensaje = this.mensajeAewebDAO
					.findById(CatalogoErrorType.VALOR_NULO.getValue());
			MensajeAewebVO mensajeVO = MensajeAssambler.getMensajeVO(mensaje);
			throw new EfectivoAplicacionBOException(
					mensajeVO.getMensajeNombre());

		}
		CatMensajesAeweb mensaje = this.mensajeAewebDAO
				.findById(codigoMensaje);
		MensajeAewebVO mensajeVO = MensajeAssambler.getMensajeVO(mensaje);

		return mensajeVO;
	}

	@Override
	public Map<Integer, MensajeAewebVO> consultaMensajeAewebPorNum(
			List<Integer> listaMensajeCodigo)
			throws EfectivoAplicacionBOException {
		Map<Integer, MensajeAewebVO> mapaMensaje = new HashMap<Integer, MensajeAewebVO>();
		List<CatMensajesAeweb> listaMensaje = null;
		if (listaMensajeCodigo == null) {

			CatMensajesAeweb mensaje = this.mensajeAewebDAO
					.findById(CatalogoErrorType.VALOR_NULO.getValue());
			throw new EfectivoAplicacionBOException(mensaje.getMensajeNombre());

		}

		try {
			listaMensaje = this.mensajeAewebDAO
					.consultaCatalogoMensjaePorListaDeId(listaMensajeCodigo);
		} catch (EfectivoAplicacionDAOException e) {

			CatMensajesAeweb mensaje = this.mensajeAewebDAO
					.findById(CatalogoErrorType.VALOR_NO_ENCONTRADO.getValue());
			throw new EfectivoAplicacionBOException(mensaje.getMensajeNombre());
		}

		for (CatMensajesAeweb elemento : listaMensaje) {
			MensajeAewebVO mensajeVO = MensajeAssambler.getMensajeVO(elemento);
			mapaMensaje.put(mensajeVO.getMensajeCodigo(), mensajeVO);

		}

		return mapaMensaje;

	}

}
