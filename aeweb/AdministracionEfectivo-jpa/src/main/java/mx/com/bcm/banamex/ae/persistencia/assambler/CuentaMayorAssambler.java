package mx.com.bcm.banamex.ae.persistencia.assambler;
import mx.com.bcm.banamex.ae.persistencia.modelo.CuentasMayor;
import mx.com.bcm.banamex.ae.persistencia.vo.CuentaMayorVO;



/**
 * @author ABRAHAM DANIEL DIAZ KIM
 *
 */
public class CuentaMayorAssambler {
	
	/**
	 * @param cuentasMayorVO
	 * @return
	 */
	public static CuentaMayorVO getCuentasMayorVO(CuentasMayor cuemay){
		CuentaMayorVO cuentasMayorVO=new CuentaMayorVO();
		cuentasMayorVO.setConceptoId(cuemay.getConceptoId()); 
		cuentasMayorVO.setConceptoDescripcion(cuemay.getConceptoDescripcion());
		cuentasMayorVO.setConceptoXdivisa(cuemay.getConceptoXdivisa());
		cuentasMayorVO.setConceptoDoctoEfectivo(cuemay.getConceptoDoctoEfectivo());
		cuentasMayorVO.setConceptoBillMon(cuemay.getConceptoBillMon());
		cuentasMayorVO.setConceptoXtipoctto(cuemay.getConceptoXtipoctto());
		cuentasMayorVO.setConceptoReferencia(cuemay.getConceptoReferencia());
		cuentasMayorVO.setConceptoS018(cuemay.getConceptoS018());
			
		if(cuemay.getConceptoBajaLogica().trim().equals("A"))
			cuentasMayorVO.setBajaLogica("Activo");
			else
				cuentasMayorVO.setBajaLogica("Inactivo");
		
		
		return cuentasMayorVO;
		
	}
	
	/**
	 * @param cuentasMayor
	 * @return
	 */
	public static CuentasMayor getCuentasMayor(CuentaMayorVO cuemayVO){
		CuentasMayor cuentasMayor=new CuentasMayor();
		cuentasMayor.setConceptoId(cuemayVO.getConceptoId());
		cuentasMayor.setConceptoDescripcion(cuemayVO.getConceptoDescripcion());
		cuentasMayor.setConceptoXdivisa(cuemayVO.getConceptoXdivisa());
		cuentasMayor.setConceptoDoctoEfectivo(cuemayVO.getConceptoDoctoEfectivo());
		cuentasMayor.setConceptoBillMon(cuemayVO.getConceptoBillMon());
	    cuentasMayor.setConceptoXtipoctto(cuemayVO.getConceptoXtipoctto());
	    cuentasMayor.setConceptoReferencia(cuemayVO.getConceptoReferencia());
	    cuentasMayor.setConceptoS018(cuemayVO.getConceptoS018());
	    cuentasMayor.setConceptoBajaLogica(cuemayVO.getBajaLogica());
		return cuentasMayor;
	}

}
