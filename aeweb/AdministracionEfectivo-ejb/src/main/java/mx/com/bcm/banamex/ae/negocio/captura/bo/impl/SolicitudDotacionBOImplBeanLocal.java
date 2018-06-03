/*  
 *  Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */

package mx.com.bcm.banamex.ae.negocio.captura.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import static mx.com.bcm.banamex.ae.negocio.constantes.TipoMonedaType.BCA;
import static mx.com.bcm.banamex.ae.negocio.constantes.TipoMonedaType.MCA;
import static mx.com.bcm.banamex.ae.persistencia.assambler.SolicitudDotacionAssambler.getSolicitudVO;
import static mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType.DATO_INCORRECTO;
import mx.com.bcm.banamex.ae.negocio.captura.bo.SolicitudDotacionBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.DivisaAssambler;
import mx.com.bcm.banamex.ae.persistencia.assambler.MonedaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDenominacionesDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDivisaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoMensajeAewebDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoUnidadDeNegocioDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.CatMensajesAeweb;
import mx.com.bcm.banamex.ae.persistencia.modelo.DenominacionDeDivisa;
import mx.com.bcm.banamex.ae.persistencia.modelo.Divisa;
import mx.com.bcm.banamex.ae.persistencia.modelo.UnidadDeNegocio;
import mx.com.bcm.banamex.ae.persistencia.vo.BilleteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DetalleDotacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.MonedaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SolicitudDotacionVO;




/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * @author JUAN MANUEL HERNANDEZ N
 * @author EDER
 */
@Stateless
public class SolicitudDotacionBOImplBeanLocal implements SolicitudDotacionBOBeanLocal{
	

	/**
	 *  Mensajes de Error
	 */
	private CatMensajesAeweb catMensaje;
	

	/**
	 *  Servicios de implemtentacion logica de negocio
	 */
	@EJB private CatalogoDivisaDAOBeanLocal divisaDAO;
	@EJB private CatalogoUnidadDeNegocioDAOBeanLocal unidadNegocioDAO;
	@EJB private CatalogoDenominacionesDivisaDAOBeanLocal denominacionDAO;
	@EJB private CatalogoMensajeAewebDAOBeanLocal mensajeDAO;
	
	
	/** 
	 * Metodo devuelve una deivisa apartir de IdDivisa
	 * @see mx.com.bcm.banamex.ae.negocio.captura.bo.SolicitudDotacionBOBeanLocal#getDivisaById(mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO)
	 */
	@Override
	public DivisaVO getDivisaById(DivisaVO divisaVO) throws EfectivoAplicacionBOException {
		
		
		DivisaVO divisaVOreturn=new DivisaVO();
		Divisa  Divisa=null;
		
		try {
			Divisa=this.divisaDAO.consultaDivisa(divisaVO.getDivisaNumeroID());
		} catch (EfectivoAplicacionDAOException e) {
			this.catMensaje=this.mensajeDAO.findById(DATO_INCORRECTO.getValue());
			throw new EfectivoAplicacionBOException(this.catMensaje.getMensajeDescripcion());
		}
		divisaVOreturn=DivisaAssambler.getDivisaVO(Divisa);
		return divisaVOreturn;
	
	}

	@Override
	public  DetalleDotacionVO consultaDenominacionDivisaById(DivisaVO divisaVO) throws EfectivoAplicacionBOException {
	 
		DetalleDotacionVO detalleDotacionVO=new DetalleDotacionVO();
		List<DenominacionDeDivisa> listaDenominacion =null;
		List<MonedaVO>  listaMonedaVO=new ArrayList<MonedaVO>();
		List<BilleteVO> listaBilleteVO=new ArrayList<BilleteVO>();
		
		
		try {
			listaDenominacion= this.denominacionDAO.consultaDenominacionById(divisaVO.getDivisaNumeroID());
		} catch (EfectivoAplicacionDAOException e) {
			 this.catMensaje=this.mensajeDAO.findById(DATO_INCORRECTO.getValue());
			 throw new EfectivoAplicacionBOException(this.catMensaje.getMensajeDescripcion());
		}
		for(DenominacionDeDivisa elemento:listaDenominacion ){
			
			if(elemento.getDenomNombreDenominacion().equals(BCA.getValue())){
				BilleteVO billete = MonedaAssambler.getBilleteVO(elemento);
				listaBilleteVO.add(billete);
              
			}else if(elemento.getDenomNombreDenominacion().equals(MCA.getValue())){
				   MonedaVO moneda = MonedaAssambler.getMonedaVO(elemento);
	               listaMonedaVO.add(moneda);
			}else{
				 this.catMensaje=this.mensajeDAO.findById(DATO_INCORRECTO.getValue());
				 throw new EfectivoAplicacionBOException(this.catMensaje.getMensajeDescripcion());
			}
		}
		detalleDotacionVO.setListaMonedaVO(listaMonedaVO);
		detalleDotacionVO.setListaBilleteVO(listaBilleteVO);
		return detalleDotacionVO;
	}

	/* (non-Javadoc)
	 * @see mx.com.bcm.banamex.ae.negocio.captura.bo.SolicitudDotacionBOBeanLocal#consultaUnidadNegocio(mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO)
	 */
	@Override
	public SolicitudDotacionVO consultaUnidadNegocio(CriteriaUnidadNegocioVO criterioUnidadVO) throws EfectivoAplicacionBOException {
		SolicitudDotacionVO solicitudVO=null;
		UnidadDeNegocio unidad=null;
		try {
		  unidad=this.unidadNegocioDAO.consultaUnidadNegocioDinamico(criterioUnidadVO);
		} catch (EfectivoAplicacionDAOException e) {
		  this.catMensaje=this.mensajeDAO.findById(DATO_INCORRECTO.getValue());
		  throw new EfectivoAplicacionBOException(this.catMensaje.getMensajeDescripcion());
		}

		solicitudVO=getSolicitudVO(unidad);
		return solicitudVO;
	}
	 
}
