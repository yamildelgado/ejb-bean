/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.bean;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.MessageBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.common.EmailMessageBeanLocal;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 * Describe : La clase muestra un ejemplo claro de como consumir servicios 
 * y concatena el valor de  una cadena.
 */
@ManagedBean
@SessionScoped
public class PersonaMB implements Serializable {

	/**
	 *  Servicio  MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private MessageBOBeanLocal messageBO;
	
	@EJB private EmailMessageBeanLocal emailBeanLocal;

	/**
	 * Variable miembro nombre de la clase
	 */
	public String nombre;
	/**
	 * 
	 */
	public String apellidos;

	
	/*
	 * Constructor sin argumentos
	 */
	public PersonaMB() {
		super();

	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Ejemplo metodoo de guardado 
	 * @return String
	 */
	public String guardar() {
	
		this.nombre += this.messageBO.getMessage();
		
		
		return "resultado";
	}

}
