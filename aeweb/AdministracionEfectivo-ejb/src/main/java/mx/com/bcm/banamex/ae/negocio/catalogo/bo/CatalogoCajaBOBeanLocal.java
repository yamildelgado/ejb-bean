 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CatGeneralAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioCajaVO;



/**
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */
@Local 
public interface CatalogoCajaBOBeanLocal {
 
	
	/**
	 * @return List<CajaVO> 
	 * @throws EfectivoAplicacionBOException
	 */
	
	public abstract List<CajaVO> consultCajas() throws EfectivoAplicacionBOException;
	
	/**
	 * @param cajaVO
	 * 
	 * @throws EfectivoAplicacionBOException
	 */
	public void agregarCaja(CajaVO cajaVO) throws EfectivoAplicacionBOException;
	/**
	 * @param cCajaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<CajaVO> consultaCajaFiltros (CriterioCajaVO cCajaVO)  throws EfectivoAplicacionBOException ;
	/**
	 * @param CajaVO
	 * @throws EfectivoAplicacionBOException
	 */
	public void editCaja(CajaVO CajaVO) throws EfectivoAplicacionBOException;
	/**
	 * @param CatGeneralAewebVO
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<CatGeneralAewebVO> consultaTipoDeCaja() throws EfectivoAplicacionBOException;
		
}

