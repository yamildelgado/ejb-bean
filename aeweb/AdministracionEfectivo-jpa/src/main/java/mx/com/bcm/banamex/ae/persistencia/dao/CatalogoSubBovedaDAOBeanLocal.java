/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;

/**
 * @author atinajero ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 * 
 */
@Local
public interface CatalogoSubBovedaDAOBeanLocal extends Dao<SubBoveda> {
	
	public abstract SubBoveda obtenerSubBoveda(short subBovedaIdn)		throws EfectivoAplicacionDAOException ;
	
	public List<SubBoveda> obtenerSubBovedas() throws EfectivoAplicacionDAOException ;
}
