package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoProcesadoraBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.ProcesadoraAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCpaeDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEtvDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoProcesadoraDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Procesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;









@Stateless
public  class CatalogoProcesadoraBOImplBean implements CatalogoProcesadoraBOBeanLocal{
	
	@EJB private CatalogoProcesadoraDAOBeanLocal  ProcesadoraDAO;
	
	@EJB private CatalogoCpaeDAOBeanLocal  CpaeDAO;
	@EJB private CatalogoEtvDAOBeanLocal  EtvDAO;
	
	
	
	
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<ProcesadoraVO> consultaProcesadora() throws EfectivoAplicacionBOException {
		
		 List<ProcesadoraVO> listaProcesadoraVO=new ArrayList<ProcesadoraVO>();
		 List<Procesadora> listaProcesadora = this.ProcesadoraDAO.findAll();	 
		 
		 for(Procesadora elemento:listaProcesadora){
			
			 ProcesadoraVO procesadoraVO=ProcesadoraAssambler.getProcesadoraVO(elemento);
			 listaProcesadoraVO.add(procesadoraVO);
		 }
	   
		return listaProcesadoraVO;
	}
	
	
	
	
	/*
	 * consulta por sirhId
	 * */
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	
	@Override
	public List<ProcesadoraVO> consultaProcesadoraPorCriterioBusqueda(CriterioProcesadoraVO criterioProcesadoraVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		List<ProcesadoraVO> listaProcesadoraVO = new ArrayList<ProcesadoraVO>();
		List<Procesadora> listaProcesadora = new ArrayList<Procesadora>();
			
			if(criterioProcesadoraVO.getProcesadoraSirhId() != 0 && criterioProcesadoraVO.getProcesadoraEtvId() == 0){
				listaProcesadora = this.ProcesadoraDAO.findBySirhIdnProcesadora(criterioProcesadoraVO);
				listaProcesadoraVO = this.getProcesadoraAssamblerVO(listaProcesadora);
				
				 
			}else if(criterioProcesadoraVO.getProcesadoraSirhId() == 0 && criterioProcesadoraVO.getProcesadoraEtvId() != 0){
				listaProcesadora = this.ProcesadoraDAO.findByEtvIdnProcesadora(criterioProcesadoraVO);
				listaProcesadoraVO = getProcesadoraAssamblerVO(listaProcesadora);
				
				 
				
			}else{
				listaProcesadora = this.ProcesadoraDAO.findByEtvIdnAndSirhIdnProcesadora(criterioProcesadoraVO) ;
				listaProcesadoraVO = getProcesadoraAssamblerVO(listaProcesadora);
				
			}
			
		return listaProcesadoraVO;
		
	}
	
	
	
	
	
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void addProcesadora(ProcesadoraVO procesadoraVO) throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		Procesadora procesadora = ProcesadoraAssambler.getProcesadora(procesadoraVO);
		procesadora.setCpae(this.CpaeDAO.findById(procesadoraVO.getProcesadoraSirhId()));
		procesadora.setEtv(this.EtvDAO.findById(procesadoraVO.getProcesadoraEtvId()));
		this.ProcesadoraDAO.persist(procesadora);
			
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editProcesadora(ProcesadoraVO procesadoraVO)
			throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		Procesadora procesadora = ProcesadoraAssambler.getProcesadora(procesadoraVO);
		procesadora.setCpae(this.CpaeDAO.findById(procesadoraVO.getProcesadoraSirhId()));
		procesadora.setEtv(this.EtvDAO.findById(procesadoraVO.getProcesadoraEtvId()));
		
		this.ProcesadoraDAO.merge(procesadora);
		
	}



	private   List<ProcesadoraVO> getProcesadoraAssamblerVO(List<Procesadora> procesadora){
		   
		   List<ProcesadoraVO> listaProcesadoraVO = new ArrayList<ProcesadoraVO>();
		   for(Procesadora elemento :  procesadora)
			{
			ProcesadoraVO	procesadoraVO = ProcesadoraAssambler.getProcesadoraVO(elemento);
				
				listaProcesadoraVO.add(procesadoraVO);
			}
		   
		   return listaProcesadoraVO;
	   }
	




	
	
	

}               
