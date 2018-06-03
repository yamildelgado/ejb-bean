/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb;


/**
 * @author OCE-WCD JUAN MANUEL HERNANDEZ NAVARRO
 * @author OCE-WDE EE 6 YAMIL OMAR DELGADO GONZALEZ
 *
 */

@Local
public interface CatalogoMensajeAewebDAOBeanLocal extends Dao<CatMensajesAeweb> {
	
	/**
	 * @param listaCodigoMensjae
	 * @return
	 * @throws EfectivoAplicacionDAOException
	 */
	public  List<CatMensajesAeweb>  consultaCatalogoMensjaePorListaDeId(List<Integer> listaCodigoMensjae)  throws EfectivoAplicacionDAOException;

}
