
/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.captura.bo;


import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriteriaUnidadNegocioVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DetalleDotacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SolicitudDotacionVO;


/**
 * @author Yamil Omar Delgado Gonzalez
 *
 */
public interface SolicitudDotacionBOBeanLocal {
	
	/**
	 * @param idDivisa
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract DivisaVO getDivisaById(DivisaVO divisaVO) throws EfectivoAplicacionBOException;
	/**
	 * @param divisaVO
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract DetalleDotacionVO consultaDenominacionDivisaById(DivisaVO divisaVO) throws EfectivoAplicacionBOException; 
    /**
     * @param criterioUnidadVO
     * @return
     * @throws EfectivoAplicacionBOException
     */
    public abstract SolicitudDotacionVO consultaUnidadNegocio(CriteriaUnidadNegocioVO criterioUnidadVO) throws EfectivoAplicacionBOException; 
}
