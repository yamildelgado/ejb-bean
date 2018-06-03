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
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;



/**
 * @author ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 *
 */
public @Local interface CatalogoSubBovedaBOBeanLocal {
 
	
	/**
	 * @return List<SubBovedaVO> 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<SubBovedaVO> consultSubBovedas() throws EfectivoAplicacionBOException;
	
	/**
	 * @param subBoveda
	 * @throws EfectivoAplicacionBOException
	 */	
	public abstract void addSubBovedas(SubBovedaVO subBoveda) throws EfectivoAplicacionBOException;
	
	/**
	 * 
	 * @param subBoveda
	 * @throws EfectivoAplicacionBOException
	 */
	
	public abstract void editSubBovedas(SubBovedaVO subBoveda) throws EfectivoAplicacionBOException;
	
	
	/**
	 * 
	 * @param idn
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract SubBovedaVO consultarPorIdnSubBoveda(short idn) throws EfectivoAplicacionBOException;
}
