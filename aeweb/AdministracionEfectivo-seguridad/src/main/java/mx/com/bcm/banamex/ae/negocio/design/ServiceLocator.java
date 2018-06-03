package mx.com.bcm.banamex.ae.negocio.design;

import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class ServiceLocator {
	
	
	private InitialContext context;
	private static Map<String, Object> service;
	private static ServiceLocator me;

	  static {
	    me = new ServiceLocator();
	    service=new Hashtable<String, Object>();
	  }
	    
	  private ServiceLocator() {}

	  // returns the Service Locator instance 
	  static public ServiceLocator getInstance() { 
	    return me;
	  }
	

	

  public   Class remoteloockUp(String jndiName,Class a){
			Object obje=loockUp(jndiName);
			return (Class)PortableRemoteObject.narrow(obje, a);
		
  }
  
  private  Hashtable<Object, Object>  getConnection(){
	   Hashtable<Object, Object> properties = new Hashtable<Object, Object>();
	   properties.put(Context.INITIAL_CONTEXT_FACTORY,  "com.ibm.websphere.naming.WsnInitialContextFactory"); 
	   properties.put(Context.PROVIDER_URL, "iiop://localhost:2809");
	   return properties;
  }

   public Object loockUp(String jndiName){
	   Object obj = null ;
	   Hashtable<Object, Object> properties=getConnection();
	   
	   if(this.service.containsKey(jndiName)){
		   return this.service.get(jndiName);
	   }
	  
	   try {
		   context = new InitialContext(properties);
	       obj = context.lookup(jndiName);
	     }catch (NamingException namingE) {
	               System.out.println("Naming Exception occurred :");
	               namingE.printStackTrace();
	           }
	   this.service.put(jndiName, obj);
	   return obj ;
	   }
   
   
   }


