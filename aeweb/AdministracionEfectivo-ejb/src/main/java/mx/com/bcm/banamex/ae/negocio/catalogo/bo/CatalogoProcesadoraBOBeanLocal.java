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
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadoraVO;





/**
 * @author OCE-WCD  CARLOS MONTIEL GUTIÉRREZ
 *
 */
public @Local interface CatalogoProcesadoraBOBeanLocal {
 
	
	/**
	 * @return List<ProcesadoraVO> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ProcesadoraVO> consultaProcesadora() throws EfectivoAplicacionBOException;
	
	
	/**
	 * @param sirhIdn
	 * @return ProcesadoraVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<ProcesadoraVO> consultaProcesadoraPorCriterioBusqueda(CriterioProcesadoraVO criterioProcesadoraVO) throws EfectivoAplicacionBOException;
	
	/**
	 * @param procesadoraVO
	 * 
	 * @throws EfectivoAplicacionBOException
	 */
	public void addProcesadora(ProcesadoraVO procesadoraVO)throws EfectivoAplicacionBOException;
	
	/**
	 * @param procesadoraVO
	 * 
	 * @throws EfectivoAplicacionBOException
	 * */
	public void editProcesadora(ProcesadoraVO procesadoraVO) throws EfectivoAplicacionBOException;

	
	

}
