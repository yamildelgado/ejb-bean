package mx.com.bcm.banamex.ae.negocio.backgroud.bo.impl;


import mx.com.bcm.banamex.ae.negocio.backgroud.bo.JobCambioFechaContableBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.captura.bo.CambioDeLaFechaContableBOBeanLocal;
import mx.com.bcm.banamex.ae.negocio.design.ServiceLocator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class JobCambioFechaContableBOImplBeanLocal implements JobCambioFechaContableBOBeanLocal{

	private ServiceLocator serviceLocator;
	
	private CambioDeLaFechaContableBOBeanLocal cambioFechaContableBO;
	
	
	
	@Scheduled(cron="*/5 * * * * ?")
	@Override
	public void run() {
		
		System.out.println( "mensaje"+new java.util.Date()+"");
		this.serviceLocator=ServiceLocator.getInstance();
		this.cambioFechaContableBO=(CambioDeLaFechaContableBOBeanLocal)this.serviceLocator.loockUp("comp/env/cambioFechaContableBO");
		this.cambioFechaContableBO.execute();
		
	}




	
	

}
