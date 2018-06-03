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

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;



/**
 * @author  JESÚS AGUILAR LÓPEZ 
 *
 */

@Local
public interface CatalogoTurnoDAOBeanLocal extends Dao<Turno> {
	
	public List<Turno> buscarTurnoPorSubBoveda(int subBovedaid);
	
	public void insertarTurnos(List<Turno> listaTurno);
	
}