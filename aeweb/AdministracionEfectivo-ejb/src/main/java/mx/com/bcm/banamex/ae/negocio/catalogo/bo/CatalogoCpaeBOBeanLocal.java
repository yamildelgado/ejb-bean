 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;


import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CpaeVO;



/**
 * @author Vázquez Reyes Eder Israel
 *
 */
public @Local interface CatalogoCpaeBOBeanLocal {
	
	/**
	 * @return List<CpaeVO> 
	 * @throws EfectivoAplicacionBOException 
	 */
	
	public abstract CpaeVO consultaCpaes(Integer id) throws EfectivoAplicacionBOException;
	
	/**
	 * @param idCpae
	 * @return CpaeVO 
	 * @throws EfectivoAplicacionBOException
	 */

	public abstract void addCpaes(CpaeVO cpae) throws EfectivoAplicacionBOException;


	/**
	 * @param cpae
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract void editCpaes(CpaeVO cpae) throws EfectivoAplicacionBOException;
	

}
