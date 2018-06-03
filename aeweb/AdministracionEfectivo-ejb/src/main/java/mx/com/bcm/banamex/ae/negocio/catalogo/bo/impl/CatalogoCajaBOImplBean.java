package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;
 
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCajaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CajaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCajaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CatGeneralAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaVO;

/**
 * @author INGRET AGUILAR VELAZQUEZ
 */
@Stateless
public class CatalogoCajaBOImplBean implements CatalogoCajaBOBeanLocal{
					
	@EJB private CatalogoCajaDAOBeanLocal CajaDAO;
	@EJB private CatalogoSubBovedaDAOBeanLocal SubBovedaDAO;
	
//---------------------------------------------------------------------------------
//1
	@Override
	public List<CajaVO> consultCajas() throws EfectivoAplicacionBOException {
		 List<CajaVO> listaCajaVO=new ArrayList<CajaVO>();
		 List<Caja> listaCajas = this.CajaDAO.findAll();
		 for(Caja elemento:listaCajas){
			 CajaVO cajaVO=CajaAssambler.getCajaVO(elemento);
			 listaCajaVO.add(cajaVO);
		 }
	   
		return listaCajaVO;
	}
//-----------------------------------------------------------------------------------
	
	@Override
	public void agregarCaja(CajaVO cajaVO){
		Caja caja = CajaAssambler.getCaja(cajaVO);		
		this.CajaDAO.persist(caja);
	}
	
//------------------------------------------------------------------------------
	
	public void editCaja(CajaVO cajaVO) throws EfectivoAplicacionBOException{
		
		Caja caja = CajaAssambler.getCaja(cajaVO);
		try{
			this.CajaDAO.merge(caja);
			}catch (Exception e){
			e.getMessage();
		}
		}
//-----------------------------------------------------------------------------
	@TransactionAttribute(TransactionAttributeType.REQUIRED)

	public CajaVO consultarPorIdnCaja (short idn) throws EfectivoAplicacionBOException{
		Caja cajas= new Caja();
		CajaVO cajaVO = new CajaVO();
		cajas=CajaDAO.findById(idn);
		cajaVO=CajaAssambler.getCajaVO(cajas);
		return cajaVO;
	}
//-----------------------------------------------------------------------------
		public List<CajaVO> consultaCajaFiltros (CriterioCajaVO cCajaVO) throws EfectivoAplicacionBOException{
 			List<CajaVO> listaCajaVO = new ArrayList<CajaVO>();
			List<Caja> listaCaja= new ArrayList<Caja>();
				try{
				listaCaja=this.CajaDAO.consultaCajaFiltros(cCajaVO);
				for(Caja elemento:listaCaja){
					CajaVO cajVO = CajaAssambler.getCajaVO(elemento);
					listaCajaVO.add(cajVO);
				}
			}catch (EfectivoAplicacionDAOException e) {
				throw new  EfectivoAplicacionBOException("Ocurrio un error ,favor de revisar el log ");
			}
				return (List<CajaVO>)listaCajaVO;
	}
//-----------------------------------------------------------------------------
		@Override
		public List<CatGeneralAewebVO> consultaTipoDeCaja()
				throws EfectivoAplicacionBOException {
			// TODO Auto-generated method stub
			return null;
		}

}