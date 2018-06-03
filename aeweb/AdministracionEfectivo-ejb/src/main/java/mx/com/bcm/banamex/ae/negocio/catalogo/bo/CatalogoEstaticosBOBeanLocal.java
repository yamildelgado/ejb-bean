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
import mx.com.bcm.banamex.ae.persistencia.vo.EstaticosVO;




/**
* 
* @author atinajero Abraham Alfonso Tinajero Sánchez
*/


public @Local interface CatalogoEstaticosBOBeanLocal {


		
	/**
	 * 
	 * @param idn
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<EstaticosVO> consultTipoInstrumento() throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<EstaticosVO> consultIndicadorAsociado() throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<EstaticosVO> consultTipoUsoCuenta() throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<EstaticosVO> consultTipoCuenta() throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<EstaticosVO> consultSubBovedasTipoReferenciaCuenta() throws EfectivoAplicacionBOException;
	

	/**
	 * @param id
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract EstaticosVO consultaPorTipoInstrumento(int id) throws EfectivoAplicacionBOException;
	
	/**
	 * @param id
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract EstaticosVO consultaPorIndicadorAsociado(int id) throws EfectivoAplicacionBOException;
	
	/**
	 * @param id
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract EstaticosVO consultaPorTipoUsoCuenta(int id) throws EfectivoAplicacionBOException;
	
	/**
	 * @param id
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract EstaticosVO consultaPorTipoCuenta(int id) throws EfectivoAplicacionBOException;
	
	/**
	 * @param id
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract EstaticosVO consultaPorTipoReferenciaCuenta(int id) throws EfectivoAplicacionBOException;
}




	
