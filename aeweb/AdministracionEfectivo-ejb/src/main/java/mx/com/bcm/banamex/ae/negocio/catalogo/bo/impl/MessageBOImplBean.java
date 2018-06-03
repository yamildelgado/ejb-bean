package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.MessageBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.MessageDAOBeanLocal;




public @Stateless class MessageBOImplBean implements MessageBOBeanLocal{

	
	@EJB private MessageDAOBeanLocal mensajeDAO;
	public String getMessage() {
		
		return this.mensajeDAO.getMessage();
	}

	
	
}
