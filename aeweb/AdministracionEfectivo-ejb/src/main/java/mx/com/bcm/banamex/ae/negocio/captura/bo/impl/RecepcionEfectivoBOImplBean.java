package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.captura.bo.RecepcionEfectivoBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.ComprobanteAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.DivisaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.EnvaseAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.EtvAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.RecepcionAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CajaHabilitadaPorTurnoDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatGeneralAeWebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoEtvDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.ComprobanteDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.DivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.EnvaseDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.EtvDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.RecepcionDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dto.DivisaDTO;
import mx.com.bcm.banamex.ae.persistencia.dto.EtvDTO;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.Comprobante;
import mx.com.bcm.banamex.ae.persistencia.modelo.Envase;
import mx.com.bcm.banamex.ae.persistencia.modelo.Recepcion;
import mx.com.bcm.banamex.ae.persistencia.vo.ComprobanteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaHabilitadaPorTurnoVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCatGeneralAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioComprobanteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioRecepcionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaIdNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EnvaseVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvIdnNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

/**
 * @author JESUS CARBAJAL MONTES
 *
 */
@Stateless
public class RecepcionEfectivoBOImplBean implements RecepcionEfectivoBOBeanLocal{
	
	@EJB private EtvDAOBeanLocal etvIdnNombreDTODAO;
	@EJB private DivisaDAOBeanLocal divisaIdNombreDAO;
	@EJB private CatalogoEtvDAOBeanLocal  EtvDAO;
	@EJB private CajaHabilitadaPorTurnoDAOBeanLocal cajPorTurnoDAO;
	@EJB private RecepcionDAOBeanLocal recepcionEfectivoDAO;
	@EJB private EnvaseDAOBeanLocal envaseDAO;
	@EJB private ComprobanteDAOBeanLocal comprobanteDAO;
	@EJB private CatGeneralAeWebDAOBeanLocal catGeneralDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<EtvIdnNombreVO> consultaEtvIdnNombre()
	{
		List<EtvIdnNombreVO> listaEtvidnNombreVO=new ArrayList<EtvIdnNombreVO>();
		List<EtvDTO> litEtvIdnNombre=new ArrayList<EtvDTO>();
		try {
			litEtvIdnNombre=this.etvIdnNombreDTODAO.consultaEtvIdnNombre();
		} catch (EfectivoAplicacionDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(EtvDTO elemento:litEtvIdnNombre)
		{
			EtvIdnNombreVO obj=EtvAssambler.getEtvIdnNombreVO(elemento);
			listaEtvidnNombreVO.add(obj);
		}
		return listaEtvidnNombreVO;
	}
		
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override 
	public List<DivisaIdNombreVO> consultaDivisaIdNombre()
	{
		List<DivisaIdNombreVO> listDivisaIdNombreVO=new ArrayList<DivisaIdNombreVO>();
		List<DivisaDTO> listDivisaIdNombreDTO=new ArrayList<DivisaDTO>();
		listDivisaIdNombreDTO=this.divisaIdNombreDAO.consultaDivisaIdNombre();
		for(DivisaDTO elemento:listDivisaIdNombreDTO)
		{
			DivisaIdNombreVO obj=DivisaAssambler.getDivisaIdNombreVO(elemento);
			listDivisaIdNombreVO.add(obj);
		}
		
		return listDivisaIdNombreVO;
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void agregarRecepcion(RecepcionVO recepcionVO)
	{
		Recepcion recepcion=RecepcionAssambler.getRecepcion(recepcionVO);
			
		CriterioCajaHabilitadaPorTurnoVO criterioCajaTurnoVO=new CriterioCajaHabilitadaPorTurnoVO(); 
		criterioCajaTurnoVO.setCajaIdn(recepcionVO.getEtvIdn());
		criterioCajaTurnoVO.setCajahabFecHrHabilita(recepcionVO.getCajahabFecHrHabilita());
		
		recepcion.setEtv(this.EtvDAO.findById(recepcionVO.getEtvIdn()));
		recepcion.setCajaHabilitadaPorTurno(this.cajPorTurnoDAO.obtieneCajaPorId(criterioCajaTurnoVO));
		this.recepcionEfectivoDAO.persist(recepcion);
		
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void modificarRecepcion(RecepcionVO recepcionVO)
	{
		Recepcion recepcion=RecepcionAssambler.getRecepcion(recepcionVO);
			
		CriterioCajaHabilitadaPorTurnoVO criterioCajaTurnoVO=new CriterioCajaHabilitadaPorTurnoVO(); 
		criterioCajaTurnoVO.setCajaIdn(recepcionVO.getEtvIdn());
		criterioCajaTurnoVO.setCajahabFecHrHabilita(recepcionVO.getCajahabFecHrHabilita());
		//fatla actualizar , incrementa el numero de  comprobantes 
		recepcion.setEtv(this.EtvDAO.findById(recepcionVO.getEtvIdn()));
		recepcion.setCajaHabilitadaPorTurno(this.cajPorTurnoDAO.obtieneCajaPorId(criterioCajaTurnoVO));
		this.recepcionEfectivoDAO.merge(recepcion);
		
	}
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void agregaComprobante(ComprobanteVO comprobanteVO)
	{
		Comprobante comprobante=ComprobanteAssambler.getComprobante(comprobanteVO);
		
		CriterioCatGeneralAewebVO critCatGeneralVO=new CriterioCatGeneralAewebVO();
		critCatGeneralVO.setAewebcatgralIdn((short) 11234);//identificadorcatgeneral
		critCatGeneralVO.setAgrupadorIdn((short) 1);//identificador agrupador
		comprobante.setCatGeneralAeweb(this.catGeneralDAO.obtieneCatGeneralAeweb(critCatGeneralVO));
		 	CriterioRecepcionVO critRecVO=new CriterioRecepcionVO();
		 	critRecVO.setCajaIdn(comprobanteVO.getCajaIdn());
		 	critRecVO.setEtvIdn(comprobanteVO.getEtvIdn());
		 	critRecVO.setRecepFecHrIni(comprobanteVO.getRecepFecHrIni());
		comprobante.setRecepcion(this.recepcionEfectivoDAO.obtieneRecepcion(critRecVO));
		//comprobante.s tipo de operacion
		
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void agregaEnvase(EnvaseVO envaseVO)
	{
		Envase envase=EnvaseAssambler.getEnvase(envaseVO);
		
		CriterioCatGeneralAewebVO critCatGeneralVO=new CriterioCatGeneralAewebVO();
		critCatGeneralVO.setAewebcatgralIdn((short) 11234);//identificadorcatgeneral
		critCatGeneralVO.setAgrupadorIdn((short) 1);//identificador agrupador
		envase.setCatGeneralAeweb(this.catGeneralDAO.obtieneCatGeneralAeweb(critCatGeneralVO));
		
		CriterioComprobanteVO critCoprobanteVO=new CriterioComprobanteVO(); 
		envase.setComprobante(this.comprobanteDAO.obtieneComprobante(critCoprobanteVO));
		
		this.envaseDAO.persist(envase);
	}
	
}
