package mx.com.bcm.banamex.ae.persistencia.assambler;

import java.util.ArrayList;
import java.util.List;

import mx.com.bcm.banamex.ae.persistencia.modelo.Caja;
import mx.com.bcm.banamex.ae.persistencia.modelo.CajasDeTurno;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.CajasPorTurnoVO;


/**
 * @author OCE-WCD INGRET AGUILAR VELAZQUEZ
 *
 */
public class CajaAssambler {
	
	/**
	 * @param cajasVO
	 * @return
	 */
	public static CajaVO getCajaVO(Caja cajas){
		CajaVO cajaVO = new CajaVO();
		cajaVO.setCajaIdn(cajas.getCajaIdn());
		cajaVO.setCajaIpAddress(cajas.getCajaIpAddress());
		cajaVO.setCajaEquip(cajas.getCajaEquip());
		cajaVO.setCajaModeloEquipoBill(cajas.getCajaModeloEquipoBill());
		cajaVO.setCajaModeloEquipoMon(cajas.getCajaModeloEquipoMon());
		cajaVO.setCajaBajaLogica(cajas.getCajaBajaLogica());
		//cajaVO.setTipocajaId(cajas.getCatGeneralAeweb().getCatGeneralAewebPK().getAewebcatgralIdn());
		//cajaVO.setSubbovedaIdn(cajas.getSubbovedaIdn().getSubbovedaIdn());
		return cajaVO;
		
		
		
	}
	
	public static CajaVO getCajaVOTipoCaja(Caja cajas, List<CajasDeTurno> cajasDeTurnos){
		CajaVO cajaVO = new CajaVO();
		List<CajasPorTurnoVO> cajasTurno = new ArrayList<CajasPorTurnoVO>();
		cajaVO.setCajaIdn(cajas.getCajaIdn());
		cajaVO.setCajaIpAddress(cajas.getCajaIpAddress());
		cajaVO.setCajaEquip(cajas.getCajaEquip());
		cajaVO.setCajaModeloEquipoBill(cajas.getCajaModeloEquipoBill());
		cajaVO.setCajaModeloEquipoMon(cajas.getCajaModeloEquipoMon());
		cajaVO.setCajaBajaLogica(cajas.getCajaBajaLogica());
		cajaVO.setAewebcatgralIdn(cajas.getCatGeneralAeweb().getCatGeneralAewebPK().getAewebcatgralIdn());
		//cajaVO.setSubbovedaIdn(cajas.getSubbovedaIdn().getSubbovedaIdn());
		cajaVO.setAewebcatgralDescripcion(cajas.getCatGeneralAeweb().getAewebcatgralDescripcion());
		
		for(CajasDeTurno cajaDeTurno : cajasDeTurnos){
			CajasPorTurnoVO cajaTurnoVO = new CajasPorTurnoVO();
			//cajaTurnoVO.setCajaIdn(Integer.parseInt(cajaDeTurno.getCajasDeTurnoPK().getTurnoId()));
			cajaTurnoVO.setTurnoId(Integer.parseInt(cajaDeTurno.getTurno().getTurnoId()));
			cajaTurnoVO.setTurnoDescr(cajaDeTurno.getTurno().getTurnoDescrip());
			cajasTurno.add(cajaTurnoVO);
			
		}
		cajaVO.setCajasTurno(cajasTurno);
		return cajaVO;
		
		
		
	}
	

	public static CajaVO getCajaVOPorTurno(Caja cajas){
		CajaVO cajaVO = new CajaVO();
		List<CajasPorTurnoVO> cajasTurno = new ArrayList<CajasPorTurnoVO>();
		cajaVO.setCajaIdn(cajas.getCajaIdn());
		cajaVO.setCajaIpAddress(cajas.getCajaIpAddress());
		cajaVO.setCajaEquip(cajas.getCajaEquip());
		cajaVO.setCajaModeloEquipoBill(cajas.getCajaModeloEquipoBill());
		cajaVO.setCajaModeloEquipoMon(cajas.getCajaModeloEquipoMon());
		cajaVO.setCajaBajaLogica(cajas.getCajaBajaLogica());
		cajaVO.setAewebcatgralIdn(cajas.getCatGeneralAeweb().getCatGeneralAewebPK().getAewebcatgralIdn());
		//cajaVO.setSubbovedaIdn(cajas.getSubbovedaIdn().getSubbovedaIdn());
		cajaVO.setAewebcatgralDescripcion(cajas.getCatGeneralAeweb().getAewebcatgralDescripcion());
		
		
		cajaVO.setCajasTurno(cajasTurno);
		return cajaVO;
		
		
		
	}
	
	/**
	 * @param caja
	 * @return
	 */

	public static Caja  getCaja (CajaVO cajaVO){
		Caja caja= new Caja();
		caja.setCajaIdn(cajaVO.getCajaIdn());
		caja.setCajaIpAddress(cajaVO.getCajaIpAddress());
		caja.setCajaEquip(cajaVO.getCajaEquip());
		caja.setCajaModeloEquipoBill(cajaVO.getCajaModeloEquipoBill());
		caja.setCajaModeloEquipoMon(cajaVO.getCajaModeloEquipoMon());
		caja.setCajaBajaLogica(cajaVO.getCajaBajaLogica());
		//caja.setSubbovedaIdn(cajaVO.getSubbovedaIdn());
		return caja;
	}

}
