 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.TipoDeOperacionBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.TiposDeOperacionAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.TipoDeOperacionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.TipoDeOperacion;
import mx.com.bcm.banamex.ae.persistencia.vo.TipoOperacionesProcesadoraVO;


/**
 * @author JESUS CARBAJAL MONTES
 *
 */
public  @Stateless class TipoDeOperacionBOImplBean implements TipoDeOperacionBOBeanLocal{
	
	@EJB private TipoDeOperacionDAOBeanLocal tipoOperacionDao;
	@EJB private TipoDeOperacionDAOBeanLocal tipoMovimientoDao;

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<TipoOperacionesProcesadoraVO> consultaOperaciones() throws EfectivoAplicacionBOException{
		List<TipoOperacionesProcesadoraVO> listaOperacionesVO=new ArrayList<TipoOperacionesProcesadoraVO>();
		List<TipoDeOperacion> listOperaciones=this.tipoOperacionDao.findAll();
		for(TipoDeOperacion elemento:listOperaciones){
			TipoOperacionesProcesadoraVO tipoOperacionVO=TiposDeOperacionAssambler.getTipoOperacionVO(elemento);
			listaOperacionesVO.add(tipoOperacionVO);
		 }
		return listaOperacionesVO;
	}

}
