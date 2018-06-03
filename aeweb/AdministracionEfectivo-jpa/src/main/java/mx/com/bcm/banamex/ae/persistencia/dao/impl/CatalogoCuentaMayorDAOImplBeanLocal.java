package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.persistencia.common.GlobalJpaDaoBean;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCuentaMayorDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentasMayor;


/**
 * @author ABRAHAM DANIEL DIAZ KIM
 *
 */
@Stateless
public class CatalogoCuentaMayorDAOImplBeanLocal  extends GlobalJpaDaoBean<CuentasMayor> implements
CatalogoCuentaMayorDAOBeanLocal{
	public  CatalogoCuentaMayorDAOImplBeanLocal(){
 	   super();
    }

}