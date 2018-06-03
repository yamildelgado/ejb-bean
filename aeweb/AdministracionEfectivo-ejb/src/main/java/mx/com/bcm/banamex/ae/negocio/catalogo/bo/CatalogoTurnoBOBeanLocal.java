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
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;



/**
 * @author JESÚS AGUILAR LÓPEZ 
 *
 */
public @Local interface CatalogoTurnoBOBeanLocal {
 
	
	/**
	 * @return List<TurnoVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<TurnoVO> consultaTurnos() throws EfectivoAplicacionBOException;
	
	/**
	 * @param turnoVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract boolean agregarTurno(TurnoVO turnoVO) throws EfectivoAplicacionBOException;
	
    /**
     * @param turnoVO
     * @return
     * @throws EfectivoAplicacionBOException
     */
    public abstract boolean editTurno(TurnoVO turnoVO) throws EfectivoAplicacionBOException;
	
	
	
}