package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoBancoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.BancoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoBancoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Banco;
import mx.com.bcm.banamex.ae.persistencia.vo.BancoVO;


public @Stateless class CatalogoBancoBOImplBean implements CatalogoBancoBOBeanLocal{
	
	@EJB private CatalogoBancoDAOBeanLocal bancoDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<BancoVO> consultBancos() throws EfectivoAplicacionBOException {
		 List<BancoVO> listaBancoVO=new ArrayList<BancoVO>();
		 List<Banco> listaBancos = this.bancoDAO.findAll();
		 for(Banco elemento:listaBancos){
			 BancoVO bancoVO=BancoAssambler.getBancoVO(elemento);
			 listaBancoVO.add(bancoVO);
		 }
	   
		return listaBancoVO;
	}
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public BancoVO consultBancosPorId(short idBanco)
			throws EfectivoAplicacionBOException {
		 
		return null;
	}
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public BancoVO consultBancosPorDescripcion(String descripcionBanco)
			throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		return null;
	}

}
