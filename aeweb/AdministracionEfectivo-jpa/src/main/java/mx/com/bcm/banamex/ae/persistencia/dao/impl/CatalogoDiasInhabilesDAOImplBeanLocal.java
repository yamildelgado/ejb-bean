/**Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import java.util.Date;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDiasInhabilesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.helper.DateFormateHelper;
import mx.com.bcm.banamex.ae.persistencia.modelo.DiasInhabiles;


/**
 * @author OCE-WCD Jesús Carbajal Montes
 *
 */
@Singleton
public class CatalogoDiasInhabilesDAOImplBeanLocal extends GlobalJpaDaoBean<DiasInhabiles> implements CatalogoDiasInhabilesDAOBeanLocal {

	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Verifica si la fecha es fecha inhabil
	 * @param fecha
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean getDiaInhabil(Date fecha) {
		System.out.println("Entro al dao "+ fecha);
		//Date fecha2 = DateFormateHelper.getFechaToFecha(fecha);
		Query query= this.em.createNamedQuery("DiasInhabiles.findByDdDfestivo",DiasInhabiles.class);
		//query.setParameter("ddDfestivo", fecha2);	
		//System.out.println(fecha2);
		List<DiasInhabiles> dias = query.getResultList();
		System.out.println(query.getResultList());
		if(dias.size()>0){
			System.out.println(":)");
			return true;		// Es fecha inhabil
		}
		return false;			// No es fecha inhabil
	}

}
