package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoFechasContablesBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.FechaContableAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoFechasContablesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;


@Stateless
public class CatalogoFechasContablesBOImplBean implements CatalogoFechasContablesBOBeanLocal {
	@EJB private CatalogoFechasContablesDAOBeanLocal fechaContableDAO;
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public FechaContableVO consultaFechaContablePorid(Date date)throws EfectivoAplicacionBOException {
		// TODO Auto-generated method stub
		FechaContable fechaContable = this.fechaContableDAO.findById(date);
		FechaContableVO fechaVO=new FechaContableVO();
		fechaVO=FechaContableAssambler.getFechaContableVO(fechaContable);
		return fechaVO;
	}
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<FechaContableVO> consultaFechasContables()throws EfectivoAplicacionBOException {
		List<FechaContableVO> listFechasContablesVO=new ArrayList<FechaContableVO>();
		List<FechaContable> fechasContables=this.fechaContableDAO.findAll();
		for(FechaContable elemento:fechasContables)
		{
			FechaContableVO fechaContableVO=FechaContableAssambler.getFechaContableVO(elemento);
			listFechasContablesVO.add(fechaContableVO);
		}
		return listFechasContablesVO;
	}
}
