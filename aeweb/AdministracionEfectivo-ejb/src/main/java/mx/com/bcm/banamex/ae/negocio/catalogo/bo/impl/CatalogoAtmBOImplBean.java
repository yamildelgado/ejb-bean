package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;


import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoAtmBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.AtmAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoAtmDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Atm;
import mx.com.bcm.banamex.ae.persistencia.vo.AtmVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioAtmVO;


public  @Stateless class CatalogoAtmBOImplBean implements CatalogoAtmBOBeanLocal {

	
	@EJB private CatalogoAtmDAOBeanLocal atmDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<AtmVO> consultAtms() throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		
		List<AtmVO> listaAtmVO = new ArrayList<AtmVO>();
		List<Atm> listaAtms = this.atmDAO.findByAllAtm();
		for(Atm elemento: listaAtms){
			AtmVO atmVO = AtmAssambler.getAtmsVO(elemento);
			listaAtmVO.add(atmVO);
		}
		
		  
		return listaAtmVO;
		
		
		
	}



	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<AtmVO> consultAtmPorIdAtms(CriterioAtmVO criterioAtmVO)throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		List<AtmVO> listaAtmVO = new ArrayList<AtmVO>();		
		List<Atm> atms = new ArrayList<Atm>();
		AtmVO atmVO = new AtmVO();
		criterioAtmVO.setBajaLogica("01");
		short id  = criterioAtmVO.getAtmIdn();
			
			if (id != 0){
					
				 atms = this.atmDAO.findByIdnAtm(criterioAtmVO);
				 for(Atm elemento :  atms){
					 atmVO= AtmAssambler.getAtmsVO(elemento);
						listaAtmVO.add(atmVO);
				 }
				
		
			}else{
				listaAtmVO.addAll(this.consultAtms());
			}
		
		return listaAtmVO;
		
	}
	


}


	
	











