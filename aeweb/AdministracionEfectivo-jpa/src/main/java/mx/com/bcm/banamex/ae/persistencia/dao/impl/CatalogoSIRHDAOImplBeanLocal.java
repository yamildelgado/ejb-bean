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

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.constantes.OperadorLogicoType;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSIRHDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.helper.UtileriaHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.Estructura;
import mx.com.bcm.banamex.ae.persistencia.vo.EstructuraVO;


/**
 * @author OCJP-SE DAVID FERNANDO RUIZ MARTINEZ
 *
 */
@Stateless
public class CatalogoSIRHDAOImplBeanLocal extends GlobalJpaDaoBean<Estructura> 
implements CatalogoSIRHDAOBeanLocal {
	
		@PersistenceContext
		private EntityManager em;
	
		@EJB private CatalogoDivisaDAOBeanLocal sirhDAO;
	
		@SuppressWarnings("unchecked")
		@Override
	public List<Estructura> consultaSirhPorBoveda(EstructuraVO estructuraVO)throws EfectivoAplicacionDAOException {
		StringBuilder query = new StringBuilder();
		
		String queryFormateado = UtileriaHelper.getFiltroDeAtributos(estructuraVO.toString(), OperadorLogicoType.AND, 'o');
		
		if (queryFormateado.equals(UtileriaHelper.VACIO)) {
			query = new StringBuilder();
			queryFormateado = new String();
			return findAll();
		}
		query.append(" SELECT o FROM Estructura o ");
		query.append(" WHERE " + queryFormateado);
		
		
		Query criteria = em.createQuery(query.toString(), Estructura.class);
		query = new StringBuilder();
		
		return criteria.getResultList();

	}

}
