/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.persistencia.common;

import java.util.List;
import java.util.Map;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 * @param <E>
 */
public interface Dao<E> {

	/**
	 * @param instance
	 */
	public abstract void persist(E instance);

	/**
	 * @param id
	 * @return
	 */
	public abstract E findById(Object id);

	/**
	 * @param instance
	 */
	public abstract void remove(E instance);

	/**
	 * @param instance
	 * @return
	 */
	public abstract E merge(E instance);

	/**
	 * @return
	 */
	public abstract List<E> findAll();

	/**
	 * @param queryName
	 * @param resultLimit
	 * @return
	 */
	public abstract List<E> findWithNamedQuery(String queryName, int resultLimit);

	/**
	 * @param sql
	 * @return
	 */
	public abstract List<E> findByNativeQuery(String sql);

	/**
	 * @param namedQueryName
	 * @param parameters
	 * @param resultLimit
	 * @return
	 */
	public abstract List<E> findWithNamedQuery(String namedQueryName, Map parameters,
			int resultLimit);

	/**
	 * @param namedQueryName
	 * @param start
	 * @param end
	 * @return
	 */
	public abstract List<E> findWithNamedQuery(String namedQueryName, int start, int end);

	/**
	 * @param items
	 * @return
	 */
	public abstract boolean deleteItems(E[] items);

}
