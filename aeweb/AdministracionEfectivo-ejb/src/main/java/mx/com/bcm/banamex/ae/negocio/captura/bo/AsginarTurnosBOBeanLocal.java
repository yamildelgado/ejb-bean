package mx.com.bcm.banamex.ae.negocio.captura.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;


@Local
public interface AsginarTurnosBOBeanLocal {
	
	public abstract	List<SubBovedaVO> consultaSubovedaCPAE() throws EfectivoAplicacionBOException;
	
	public abstract	List<TurnoVO> consultaTurnoSubBoveda(int subBovedaId) throws EfectivoAplicacionBOException;
	
	public abstract	List<CajaVO> consultaCajaPorSubBoveda(int subBovedaId) throws EfectivoAplicacionBOException;
	
	public abstract void instertarTurnos(List<CajaVO> cajasSeleccionadas, List<TurnoVO> turnosSeleccionados);

}
