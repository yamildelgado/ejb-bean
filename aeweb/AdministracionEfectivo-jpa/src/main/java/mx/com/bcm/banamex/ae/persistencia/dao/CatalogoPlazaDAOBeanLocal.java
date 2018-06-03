 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */


package mx.com.bcm.banamex.ae.persistencia.dao;


import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.common.Dao;
import mx.com.bcm.banamex.ae.persistencia.modelo.Plaza;
import mx.com.bcm.banamex.ae.persistencia.vo.CriterioPlazaVO;



/**
 * @author MARIO ALBERTO VELAZQUEZ DIEZ BARROSO
 *
 */
@Local
public  interface CatalogoPlazaDAOBeanLocal extends Dao<Plaza>{
	public List<Plaza> findByIdnPlaza(CriterioPlazaVO criterioPlazaVO);
	public List<Plaza> findByNombrePlaza(CriterioPlazaVO criterioPlazaVO);
	public List<Plaza> findByAllPlaza();

}
