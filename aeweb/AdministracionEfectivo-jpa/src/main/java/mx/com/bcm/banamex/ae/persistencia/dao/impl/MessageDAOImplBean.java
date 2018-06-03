package mx.com.bcm.banamex.ae.persistencia.dao.impl;

import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.persistencia.dao.MessageDAOBeanLocal;



/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 *
 */
public @Stateless class MessageDAOImplBean implements MessageDAOBeanLocal{

	/* (non-Javadoc)
	 * @see com.mx.bcm.banamex.ea.persistencia.dao.MessageDAOBeanLocal#getMessage()
	 */
	@Override
	public String getMessage() {
		
		return "Hola este es un mensaje de prueba";
	}

}
