/** 
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */


package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;


import static mx.com.bcm.banamex.ae.persistencia.constantes.NumeroFormatoType.FORMATO_ENTERO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoEstaticosBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.constantes.CatalogoEstaticos;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.EstaticosVO;


/*
 * 
 * @author TINAJERO
 * 
 */
public @Stateless class CatalogoEstaticosBOImplBean implements CatalogoEstaticosBOBeanLocal{

	

	
	@Override
	public EstaticosVO consultaPorTipoInstrumento(int id) throws EfectivoAplicacionBOException{
		EstaticosVO estaticosVO = new EstaticosVO();
		String clave;
		clave=String.format(FORMATO_ENTERO.getFormato(),id);
		
		Iterator<Entry<String, String>> iterador = CatalogoEstaticos.getTipoInstrumento().entrySet().iterator();
		
		while (iterador.hasNext()) {
			 Entry<String, String> e=iterador.next();
	        if(e.getKey().equals(clave)){
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        }
	    }
		
		return estaticosVO;
	}

	
	
	@Override
	public EstaticosVO consultaPorIndicadorAsociado(int id)
			throws EfectivoAplicacionBOException {
		
		EstaticosVO estaticosVO = new EstaticosVO();
		
		String clave;
		clave=String.format(FORMATO_ENTERO.getFormato(),id);
		
		for (Entry<String, String> e: CatalogoEstaticos.getIndicadorAsociado().entrySet()) {
	        if(e.getKey().equals(clave)){
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        }
	        	
	    } 
		
		return estaticosVO;
	}

	
	
	@Override
	public EstaticosVO consultaPorTipoUsoCuenta(int id)
			throws EfectivoAplicacionBOException {
		
		EstaticosVO estaticosVO = new EstaticosVO();
		
		String clave;
		clave=String.format(FORMATO_ENTERO.getFormato(),id);
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoUsoCuenta().entrySet()) {
	        if(e.getKey().equals(clave)){
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        }
	        	
	    }
		
		return estaticosVO;
	}

	
	
	@Override
	public EstaticosVO consultaPorTipoCuenta(int id)
			throws EfectivoAplicacionBOException {
		
		EstaticosVO estaticosVO = new EstaticosVO();
		
		String clave;
		clave=String.format(FORMATO_ENTERO.getFormato(),id);
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoCuenta().entrySet()) {
	        if(e.getKey().equals(clave)){
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        }
	    }
		
		return estaticosVO;
	}

	
	
	@Override
	public EstaticosVO consultaPorTipoReferenciaCuenta(int id)
			throws EfectivoAplicacionBOException {
		
		EstaticosVO estaticosVO = new EstaticosVO();
		
		String clave;
		clave=String.format(FORMATO_ENTERO.getFormato(),id);
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoReferenciaCuenta().entrySet()) {
	        if(e.getKey().equals(clave)){
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        }
	    }
		return estaticosVO;
	}


	@Override
	public List<EstaticosVO> consultTipoInstrumento()
			throws EfectivoAplicacionBOException {
		List<EstaticosVO> listEstaticosVO = new ArrayList<EstaticosVO>();
		EstaticosVO estaticosVO = new EstaticosVO();
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoInstrumento().entrySet()) {
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        	listEstaticosVO.add(estaticosVO);
	    }
		
		return listEstaticosVO;
	}


	@Override
	public List<EstaticosVO> consultIndicadorAsociado()
			throws EfectivoAplicacionBOException {
		List<EstaticosVO> listEstaticosVO = new ArrayList<EstaticosVO>();
		EstaticosVO estaticosVO = new EstaticosVO();
		
		for (Entry<String, String> e: CatalogoEstaticos.getIndicadorAsociado().entrySet()) {
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        	listEstaticosVO.add(estaticosVO);
	    }
		
		return listEstaticosVO;
	}


	@Override
	public List<EstaticosVO> consultTipoUsoCuenta()
			throws EfectivoAplicacionBOException {
		List<EstaticosVO> listEstaticosVO = new ArrayList<EstaticosVO>();
		EstaticosVO estaticosVO = new EstaticosVO();
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoUsoCuenta().entrySet()) {
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        	listEstaticosVO.add(estaticosVO);
	    }
		
		return listEstaticosVO;
	}


	@Override
	public List<EstaticosVO> consultTipoCuenta()
			throws EfectivoAplicacionBOException {
		List<EstaticosVO> listEstaticosVO = new ArrayList<EstaticosVO>();
		EstaticosVO estaticosVO = new EstaticosVO();
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoCuenta().entrySet()) {
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        	listEstaticosVO.add(estaticosVO);
	    }
		
		return listEstaticosVO;
	}


	@Override
	public List<EstaticosVO> consultSubBovedasTipoReferenciaCuenta()
			throws EfectivoAplicacionBOException {
		List<EstaticosVO> listEstaticosVO = new ArrayList<EstaticosVO>();
		EstaticosVO estaticosVO = new EstaticosVO();
		
		for (Entry<String, String> e: CatalogoEstaticos.getTipoReferenciaCuenta().entrySet()) {
	        	estaticosVO.setId(e.getKey());
	        	estaticosVO.setDesc(e.getValue());
	        	listEstaticosVO.add(estaticosVO);
	    }
		
		return listEstaticosVO;
	}
	
}
