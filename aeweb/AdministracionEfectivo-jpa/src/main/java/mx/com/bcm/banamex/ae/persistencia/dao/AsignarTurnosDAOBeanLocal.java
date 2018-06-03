/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
@Local
public interface AsignarTurnosDAOBeanLocal extends Dao<SubBoveda>{
	
	public abstract List<SubBoveda> buscarBobedasPorCPAE(int cpaePk);

}
