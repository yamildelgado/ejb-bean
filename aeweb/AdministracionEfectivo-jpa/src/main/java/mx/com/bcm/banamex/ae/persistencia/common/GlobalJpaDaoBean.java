/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.common;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 * @param <E>
 */
public abstract class GlobalJpaDaoBean<E> implements Dao<E> {

	protected final Class<E> entityClass;

	@PersistenceContext(unitName="AEWeb-unit")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	protected GlobalJpaDaoBean() {
		super();
		entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * @param query
	 * @return
	 */
	protected E getSingleResult(final CriteriaQuery<E> query) {
		return this.<E> getTypedSingleResult(query);
	}

	/**
	 * @param query
	 * @return
	 */
	protected <T> T getTypedSingleResult(final CriteriaQuery<T> query) {
		try {
			return em.createQuery(query).getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @param query
	 * @return
	 */
	protected List<E> getResultList(final CriteriaQuery<E> query) {
		return em.createQuery(query).getResultList();
	}

	/**
	 * @param query
	 * @param maxresults
	 * @param firstresult
	 * @return
	 */
	protected List<E> getResultList(final CriteriaQuery<E> query,
			int maxresults, int firstresult) {
		return em.createQuery(query).setMaxResults(maxresults)
				.setFirstResult(firstresult).getResultList();
	}

	/**
	 * @return
	 */
	protected CriteriaBuilder getCriteriaBuilder() {
		return em.getCriteriaBuilder();
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#persist(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#persist(java.lang.Object)
	 */
	@Override
	public void persist(E instance) {
		this.em.persist(instance);
		this.em.flush();
		this.em.refresh(instance);
		
		
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#findById(long)
	 */
	@Override
	public E findById(final Object id) {
		return em.find(this.entityClass, id);
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@Override
	public void remove(Object id) {
		
		E element = this.em.getReference(this.entityClass, id);
		//boolean contains = em.contains(instance);
		//E remove = instance;
		//if (!contains) {
		//	remove = find(instance.getId());
		//}
		em.remove(element);
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#merge(java.lang.Object)
	 */
	@Override
	public E merge(final E instance) {
		E merge = em.merge(instance);
		em.flush();
		return merge;
	}

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#findAll()
	 */
	@Override
	public List<E> findAll() {
		CriteriaBuilder builder = getCriteriaBuilder();
		CriteriaQuery<E> query = builder.createQuery(entityClass);
		query.from(entityClass);
		return getResultList(query);
	}
	
	/**
     * Removes the number of entries from a table
     * @param <E>
     * @param items
     * @return
     */
	
	@Override
    public boolean deleteItems(E[] items) {
        for (E item : items) {
            em.remove(em.merge(item));
        }
        return true;
    }
    /**
     * Returns the number of records that will be used with lazy loading / pagination
     * @param namedQueryName
     * @param start
     * @param end
     * @return List
     */
	
	@Override
    public List<E> findWithNamedQuery(String namedQueryName, int start, int end) {
        Query query = this.em.createNamedQuery(namedQueryName);
        query.setMaxResults(end - start);
        query.setFirstResult(start);
        return query.getResultList();
    }
    
   /**
    * Returns the number of records that meet the criteria with parameter map and
    * result limit
    * @param namedQueryName
    * @param parameters
    * @param resultLimit
    * @return List
    */
	
	@Override
   public List<E> findWithNamedQuery(String namedQueryName, Map parameters, int resultLimit) {
       Set<Map.Entry<String, Object>> rawParameters = parameters.entrySet();
       Query query = this.em.createNamedQuery(namedQueryName);
       if (resultLimit > 0) {
           query.setMaxResults(resultLimit);
       }
       for (Map.Entry<String, Object> entry : rawParameters) {
           query.setParameter(entry.getKey(), entry.getValue());
       }
       return query.getResultList();
   }
   /**
    * Returns the number of records that meet the criteria
    * @param <T>
    * @param sql
    * @param type
    * @return List
    */
	
	@SuppressWarnings("unchecked")
	@Override
   public List<E> findByNativeQuery(String sql) {
       return this.em.createNativeQuery(sql, this.entityClass).getResultList();
   }
   /**
    * Returns the number of records with result limit
    * @param queryName
    * @param resultLimit
    * @return List
    */
	
	@SuppressWarnings("rawtypes")
	@Override
   public List<E> findWithNamedQuery(String queryName, int resultLimit) {
       return this.em.createNamedQuery(queryName).
               setMaxResults(resultLimit).
               getResultList();
   }
	
	


}

