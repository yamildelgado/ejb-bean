package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoTurnoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.TurnoAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Turno;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;




@Stateless
public  class CatalogoTurnoBOImplBean implements CatalogoTurnoBOBeanLocal {

	
	@EJB private CatalogoTurnoDAOBeanLocal turnoDAO;

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<TurnoVO> consultaTurnos() throws EfectivoAplicacionBOException {
	List<TurnoVO> listaTurnoVO=new ArrayList<TurnoVO>();
	List<Turno> listaTurno = this.turnoDAO.findAll();
	 for(Turno elemento:listaTurno){
	   
	   
		   TurnoVO turnoVO = TurnoAssambler.getTurnoVO(elemento);
		   listaTurnoVO.add(turnoVO);   
	   
	   
	 }
		return listaTurnoVO;
	}
	
	@Override 
	public boolean agregarTurno(TurnoVO turnoVO) throws EfectivoAplicacionBOException {
		boolean validation = false;
		Turno tur = TurnoAssambler.getTurno( turnoVO);
		
		try{
		this.turnoDAO.persist(tur);
		validation = true;
		}catch (Exception e){
			e.getMessage();
			validation = false;
		}
		finally{}

		return validation;

	}
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public boolean editTurno(TurnoVO turnoVO) throws EfectivoAplicacionBOException  {
		boolean validation = false;
		Turno turn = TurnoAssambler.getTurno(turnoVO);
		
		try{
		this.turnoDAO.merge(turn);
		validation = true;
		}catch (Exception e){
			e.getMessage();
			validation = false;
		}
		finally{}
		return validation;
	}

}
