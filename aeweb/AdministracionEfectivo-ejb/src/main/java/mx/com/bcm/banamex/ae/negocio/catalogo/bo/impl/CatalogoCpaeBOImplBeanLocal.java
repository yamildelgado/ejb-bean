package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCpaeBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CpaeAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCpaeDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Cpae;
import mx.com.bcm.banamex.ae.persistencia.vo.CpaeVO;




public @Stateless class CatalogoCpaeBOImplBeanLocal implements CatalogoCpaeBOBeanLocal{

	
	@EJB private CatalogoCpaeDAOBeanLocal cpaeDAO;
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	
	public CpaeVO consultaCpaes(Integer id) throws EfectivoAplicacionBOException {
		 
		// TODO Auto-generated method stub
		
					
				CpaeVO cpaeVO = new CpaeVO();
				Cpae cpae = this.cpaeDAO.findById(id);
				
				if(cpae!=null){
					cpaeVO = CpaeAssambler.getCpaeVO(cpae);
				}
				else{
					Cpae cpae2= new Cpae();
					cpae2.setCpaesEstructuraSirhIdn((Integer)id);
					
					cpae2.setSirhNombre(null);
					cpae2.setSirhHorContable(null);
					cpae2.setSirhNumCompLote(null);
					cpae2.setSirhNumCompAsignaXCajero(null);
					cpae2.setSirhMontMinDifImprActa(null);
					cpae2.setSirhNumCopiasActas(null);
					cpae2.setSirhHorEnvaseCritico(null);
					cpae2.setSirhLimPiso(null);
					
					cpaeVO = CpaeAssambler.getCpaeVO(cpae2);

				}
										   
		return cpaeVO;
}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editCpaes(CpaeVO cpaeVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		Cpae cpae = CpaeAssambler.getCpaes(cpaeVO);
		this.cpaeDAO.merge(cpae);
}
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void addCpaes(CpaeVO cpaeVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		Cpae cpae = CpaeAssambler.getCpaes(cpaeVO);
		this.cpaeDAO.persist(cpae);
		
	}
	
}
