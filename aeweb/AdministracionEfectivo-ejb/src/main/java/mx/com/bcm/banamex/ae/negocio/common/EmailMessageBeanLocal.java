package mx.com.bcm.banamex.ae.negocio.common;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;


public interface EmailMessageBeanLocal {

	public void enviaMail() throws AddressException, MessagingException;

}
