package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.TipoMovimientoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.TipoMovimientoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.TipoDeMovimientoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.TipoMovimiento;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoMovimientoProcesadorasVO;

/**
* @author INGRET AGUILAR VELAZQUEZ
*
*/
public @Stateless class TipoMovimientoBOImplBean implements TipoMovimientoBOBeanLocal {

	@EJB private TipoDeMovimientoDAOBeanLocal tipoMovimientoDao;

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)

	public List<TipoMovimientoProcesadorasVO> consultaOperacionesMov() throws EfectivoAplicacionBOException{
		List<TipoMovimientoProcesadorasVO> listaMovimientosVO=new ArrayList<TipoMovimientoProcesadorasVO>();
		List<TipoMovimiento> listaMovimientos=this.tipoMovimientoDao.findAll();
		for(TipoMovimiento elemento:listaMovimientos){
			TipoMovimientoProcesadorasVO tipoMovimientoVO=TipoMovimientoAssambler.getTipoMovimientoVO(elemento);
			listaMovimientosVO.add(tipoMovimientoVO);
		}
		return listaMovimientosVO;
	
	}

}