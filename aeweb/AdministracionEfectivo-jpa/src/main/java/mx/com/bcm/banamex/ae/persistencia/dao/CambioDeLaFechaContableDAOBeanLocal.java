 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */


package mx.com.bcm.banamex.ae.persistencia.dao;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.FechaContable;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;



/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *s
 */
@Local
public  interface CambioDeLaFechaContableDAOBeanLocal extends Dao<FechaContable>{
	/**
	 * @param fechaContableVO
	 * @return
	 */
	public List<FechaContable> consultaFechaContable(FechaContableVO fechaContableVO);
	
	/**
	 * @param fecCont
	 */
	public void insertNewFecCont( Date fecCont );
	
}
