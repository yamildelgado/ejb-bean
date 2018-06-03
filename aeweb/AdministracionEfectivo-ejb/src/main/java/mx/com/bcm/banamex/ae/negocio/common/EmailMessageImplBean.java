package mx.com.bcm.banamex.ae.negocio.common;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class EmailMessageImplBean implements EmailMessageBeanLocal {

	
	private Session session;
	
	@Override
	public void enviaMail() throws AddressException, MessagingException{
        
        session.setDebug(true);
        //Session.getInstance(null, null);
        String from =session.getProperty("mail.smtp.user")+"@gmail.com";
       

        Message message =null;
      
                
                message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("yamil.delgado@bcm.com.mx"));
                message.setSubject("Testing Subject");
                message.setText("Dear Mail Crawler,"+ "\n\n No spam to my email, please!");

                Transport.send(message);

               

        
    }
	
}
