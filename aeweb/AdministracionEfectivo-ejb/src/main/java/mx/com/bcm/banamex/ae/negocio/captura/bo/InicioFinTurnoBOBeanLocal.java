package mx.com.bcm.banamex.ae.negocio.captura.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionDAOException;
import mx.com.bcm.banamex.ae.persistencia.vo.CajaVO;
import mx.com.bcm.banamex.ae.persistencia.vo.FechaContableVO;
import mx.com.bcm.banamex.ae.persistencia.vo.HistTurnoEnOperacionVO;
import mx.com.bcm.banamex.ae.persistencia.vo.TurnoVO;

/**
 * @author ING. SIST. COMP. OMAR ARTURO LOPEZ RODRIGUEZ
 *
 */

public @Local interface InicioFinTurnoBOBeanLocal {
	
	/**
	 * 
	 * @return List<TurnoVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<TurnoVO> obtenerTurnorPorSubBoveda(int subBoveda)throws EfectivoAplicacionBOException;
	
	/**
	 * @param turnoId
	 * @return  List<HistTurnoEnOperacionVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<HistTurnoEnOperacionVO> obtenerHistTurnoEnOperacion(TurnoVO turnoVO)throws EfectivoAplicacionBOException;
	/**
	 * @param turnoId
	 * @return   List<HistTurnoEnOperacionVO>
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract List<HistTurnoEnOperacionVO> obtnerHistTurno(List<TurnoVO> listaTurnoVO) throws EfectivoAplicacionBOException;
	/**
	 * @param turnoId
	 * @return   FechaContableVO 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract FechaContableVO obtenerFechaContableActual() throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException;
	
	/**
	 * @param HistTurnoEnOperacionVO
	 
	 * @throws EfectivoAplicacionBOException
	 */
	public abstract void addHistTurnoEnOperacion(HistTurnoEnOperacionVO histTurnoEnOperacion) throws EfectivoAplicacionBOException ;
	
	/**
	 * @param HistTurnoEnOperacionVO
	 
	 * @throws EfectivoAplicacionBOException
	 */	
	public abstract void editHistTurnoEnOperacion(HistTurnoEnOperacionVO histTurnoEnOperacionVO) throws EfectivoAplicacionBOException ;
	/**
	 * @param turnoVO
	 
	 * @throws EfectivoAplicacionBOException
	 */	
	public abstract void editTurno(TurnoVO turnoVO, Short susboBovedaId) throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException;
	/**
	 * @param turnoVO
	 
	 * @throws EfectivoAplicacionBOException
	 */	
	public abstract List<CajaVO> getCajasPorTurnoVO(String turnoId) throws EfectivoAplicacionBOException, EfectivoAplicacionDAOException;


}
