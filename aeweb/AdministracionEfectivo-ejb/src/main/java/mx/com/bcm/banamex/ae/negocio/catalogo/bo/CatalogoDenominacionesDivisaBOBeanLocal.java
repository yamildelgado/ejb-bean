package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioDenominacionDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DenominacionesDivisaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaVO;




/**
 * @author  Marco Antonio Abitia G.
 *
 */@Local
public  interface CatalogoDenominacionesDivisaBOBeanLocal {
	
	/**
	 * @return 
	 * @throws EfectivoAplicacionBOException
	 */
	
	public abstract List<DenominacionesDivisaVO> consultaDenomDivisaPorIdDivisa(CriterioDenominacionDivisaVO criterioDenomDivisaVO) throws EfectivoAplicacionBOException;
	
	/**
	 * @return
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<DivisaVO> consultaDivisas() throws EfectivoAplicacionBOException;
	
}
 