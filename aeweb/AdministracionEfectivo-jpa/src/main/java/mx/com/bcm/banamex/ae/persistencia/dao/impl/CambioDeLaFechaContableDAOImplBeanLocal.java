/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao.impl;


import java.util.Date;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CambioDeLaFechaContableDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;

/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */

@Singleton
public  class CambioDeLaFechaContableDAOImplBeanLocal extends GlobalJpaDaoBean<FechaContable> implements CambioDeLaFechaContableDAOBeanLocal {
   
	@PersistenceContext
	private EntityManager em;
	
	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.common.Dao#remove(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FechaContable> consultaFechaContable(FechaContableVO fechaContableVO) {
		// TODO Auto-generated method stub
		Query query= this.em.createNamedQuery("FechaContable.findByFeccontIdn");
		query	.setParameter("feccontIdn",fechaContableVO.getFecContId());
		query	.setParameter("feccontStatus",fechaContableVO.getFeccontStatus());
		List<FechaContable>listaFechaContable=query.getResultList();
		return listaFechaContable;
	}
	
	


	/**
	 * Se inserta nuevo registro de fecha contable.
	 * @param fecCont
	 * @return
	 */
	@Override
	public void insertNewFecCont(Date fecCont) {
		FechaContable fc = new FechaContable();
		fc.setFeccontIdn(fecCont);
		fc.setFeccontStatus("01");
		
		this.em.persist(fc);		
		
	}


}
