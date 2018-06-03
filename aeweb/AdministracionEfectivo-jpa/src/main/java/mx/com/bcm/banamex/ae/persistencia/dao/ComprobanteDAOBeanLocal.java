/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.dao;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.Comprobante;
import mx.com.bcm.banamex.ae.persistencia.vo.ComprobanteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioComprobanteVO;

/**
 * @author JESÚS CARBAJAL MONTES
 *
 */
@Local
public interface ComprobanteDAOBeanLocal {

	/**
	 * @param criterioComprobanteVO
	 * @return
	 */
	Comprobante obtieneComprobante(CriterioComprobanteVO criterioComprobanteVO);

}
