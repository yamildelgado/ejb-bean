package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoCuentaMayorBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.CuentaMayorAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaMayorDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentasMayor;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaMayorVO;







public @Stateless class CatalogoCuentaMayorBOImplBean implements CatalogoCuentaMayorBOBeanLocal{

	
	@EJB private CatalogoCuentaMayorDAOBeanLocal cuentaMayorDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	
	@Override
	public List<CuentaMayorVO> consultaCuentaMayor() throws EfectivoAplicacionBOException {
		List<CuentaMayorVO> listaCuentaMayorVO=new ArrayList<CuentaMayorVO>();
		 List<CuentasMayor> listaCuentaMayor = this.cuentaMayorDAO.findAll();
		 for(CuentasMayor elemento:listaCuentaMayor){
			 CuentaMayorVO cuentaMayorVO=CuentaMayorAssambler.getCuentasMayorVO(elemento);
			 listaCuentaMayorVO.add(cuentaMayorVO);
		 }
	   
		return listaCuentaMayorVO;
	}
	
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editCuentaMayor(CuentaMayorVO cuentaMayorVO)
			throws EfectivoAplicacionBOException{
		CuentasMayor cuemay = CuentaMayorAssambler.getCuentasMayor(cuentaMayorVO);
		this.cuentaMayorDAO.merge(cuemay);
		
	}
	
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	
	public CuentaMayorVO consultaCuentaMayorPorId(short cuentaMayorId) throws EfectivoAplicacionBOException{
		 CuentasMayor cuemay = this.cuentaMayorDAO.findById(cuentaMayorId);
		 CuentaMayorVO cuentaMayorVO = new CuentaMayorVO(); 
		 cuentaMayorVO.setConceptoId(cuemay.getConceptoId());
		 cuentaMayorVO.setConceptoDescripcion(cuemay.getConceptoDescripcion());
		 cuentaMayorVO.setConceptoDoctoEfectivo(cuemay.getConceptoDoctoEfectivo());
		 cuentaMayorVO.setConceptoBillMon(cuemay.getConceptoBillMon());
		 cuentaMayorVO.setConceptoXdivisa(cuemay.getConceptoXdivisa());
		 cuentaMayorVO.setConceptoXtipoctto(cuemay.getConceptoXtipoctto());
		 cuentaMayorVO.setConceptoReferencia(cuemay.getConceptoReferencia());
		 cuentaMayorVO.setConceptoS018(cuemay.getConceptoS018());
		 cuentaMayorVO.setBajaLogica(cuemay.getConceptoBajaLogica());
		
		return cuentaMayorVO;
	}
		
}
