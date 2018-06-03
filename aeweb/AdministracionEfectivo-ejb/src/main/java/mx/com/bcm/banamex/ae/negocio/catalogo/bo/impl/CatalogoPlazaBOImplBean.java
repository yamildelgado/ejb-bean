package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoPlazaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.PlazaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoPlazaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Plaza;
import mx.com.bcm.banamex.ae.persistencia.vo.PlazaVO;



@Stateless
public class CatalogoPlazaBOImplBean implements CatalogoPlazaBOBeanLocal {

	
	@EJB private CatalogoPlazaDAOBeanLocal plazaDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<PlazaVO> consultaPlaza() throws EfectivoAplicacionBOException{
	       List<PlazaVO> listaPlazaVO=new ArrayList<PlazaVO>();
	       List<Plaza> listaPlaza = this.plazaDAO.findAll();
	    for(Plaza elemento:listaPlaza){
	    		PlazaVO plazaVO = PlazaAssambler.getPlazaVO(elemento);
	    	
	    		listaPlazaVO.add(plazaVO);
	    }
		
	    return listaPlazaVO;
	}

	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<PlazaVO> consultPlazaPorId(long plazaIdn, String plazaNombre)
			throws EfectivoAplicacionBOException {
		
				List<PlazaVO> listaPlazaVO = new ArrayList<PlazaVO>();		
				PlazaVO PlazaVO = new PlazaVO();
					long id = plazaIdn;
					String nom=plazaNombre;
					
					
					
					if (id == 0 && (nom.equals(null) || nom.isEmpty())){
							listaPlazaVO.addAll(this.consultaPlaza()); 
				
					}else {
						if(id==0 && (!nom.equals(null) || !nom.isEmpty())){
														
							listaPlazaVO.clear();
							List<PlazaVO> aux = this.consultaPlaza();
							for(PlazaVO elemento:aux){
								
					    		if(elemento.getPlazaNombre().equals(nom)){
					    			
					    			listaPlazaVO.add(elemento);
					    			break;
					    			}
					    		else
					    			continue;
								}
							
						}else{
							if(id!=0 && (nom.equals(null) || nom.isEmpty())){
							listaPlazaVO.clear();
							Plaza plaza = this.plazaDAO.findById(id);
							PlazaVO= PlazaAssambler.getPlazaVO(plaza);
							listaPlazaVO.add(PlazaVO);
							}
						}
						}
					
					
					
					
					
				
				return listaPlazaVO;
	}


		
	}



