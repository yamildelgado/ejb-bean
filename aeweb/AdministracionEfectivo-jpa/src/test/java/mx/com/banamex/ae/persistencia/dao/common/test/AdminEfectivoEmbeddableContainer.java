/*
 *  Todos los Derechos Reservados 2014 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *
 */
package mx.com.banamex.ae.persistencia.dao.common.test;

import java.util.Properties;

import javax.naming.Context;

/**
 * @author OCE-WCD YAMIL OMAR DELGADO GONZALEZ
 * 
 */
public class AdminEfectivoEmbeddableContainer {

	private static Properties props;

	/**
	 * Singleton contructor
	 */
	 AdminEfectivoEmbeddableContainer() {
		super();
	}

	public static Properties getEJBContainer() {
		if (props == null) {
			props = new Properties();
			props.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.openejb.client.LocalInitialContextFactory");
			props.setProperty("openejb.altdd.prefix", "test");
			props.put("AEWeb-unit", "new://Resource?type=DataSource");
			props.put("AEWeb-unit.JdbcDriver", "oracle.jdbc.OracleDriver");
			props.put("AEWeb-unit.JdbcUrl","jdbc:oracle:thin:@192.168.3.247:1521:XE");
			props.put("AEWeb-unit.Username", "c018adm");
			props.put("AEWeb-unit.Password", "aeweb123mx");
		}
		return props;

	}

}
