/** Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cuenta;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentaPK;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaCuentaVO;


/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */

@Stateless
public class CatalogoCuentaDAOImplBeanLocal extends GlobalJpaDaoBean<Cuenta>
		implements CatalogoCuentaDAOBeanLocal {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Cuenta> consultaCuentaPorid(CuentaPK cuentaPK) throws EfectivoAplicacionDAOException {
		List<Cuenta> listaCuenta = null;
		Query query = em
				.createNamedQuery("Cuenta.findByUnegId", Cuenta.class);
		query.setParameter("unegId", cuentaPK.getUnegId());
		listaCuenta = query.getResultList();
		return listaCuenta;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoCuentaDAOBeanLocal#
	 * consultaCuentaParametrizada
	 * (com.mx.bcm.banamex.ea.persistencia.modelo.CuentaPK)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Cuenta> consultaCuentaParametrizada(CriteriaCuentaVO criteriaCuentaVO)
			throws EfectivoAplicacionDAOException {

		StringBuilder query = new StringBuilder();
		String queryFormateado = UtileriaHelper.getFiltroDeAtributos(criteriaCuentaVO.toString(), OperadorLogicoType.AND, 'c');
		if (queryFormateado.equals(UtileriaHelper.VACIO)) {
			query = new StringBuilder();
			queryFormateado = new String();
			return consultaCuenta();
		}
		query.append(" SELECT c FROM Cuenta c JOIN FETCH c.divisaId ");
		query.append(" WHERE " + queryFormateado);

		Query criteria = em.createQuery(query.toString(), Cuenta.class);
		query = new StringBuilder();
		
		return criteria.getResultList();
	}

	
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.CatalogoCuentaDAOBeanLocal#consultaCuenta()
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	
	public List<Cuenta> consultaCuenta()
			throws EfectivoAplicacionDAOException {
		StringBuilder query = new StringBuilder();
		query.append(" SELECT c FROM Cuenta c JOIN FETCH c.divisaId ");
		
		Query criteria = em.createQuery(query.toString(), Cuenta.class);
		query = new StringBuilder();
		
		return criteria.getResultList();
		
	}
	

}
