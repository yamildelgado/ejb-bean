package mx.com.bcm.banamex.ae.negocio.captura.bo;

import java.util.List;

import javax.ejb.Local;

import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.ComprobanteVO;
import mx.com.bcm.banamex.ae.persistencia.vo.DivisaIdNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EnvaseVO;
import mx.com.bcm.banamex.ae.persistencia.vo.EtvIdnNombreVO;
import mx.com.bcm.banamex.ae.persistencia.vo.RecepcionVO;

/**
 * @author JESUS CARBAJAL MONTES
 *
 */
public @Local interface RecepcionEfectivoBOBeanLocal {

public abstract	List<EtvIdnNombreVO> consultaEtvIdnNombre() throws EfectivoAplicacionBOException;

public abstract List<DivisaIdNombreVO> consultaDivisaIdNombre() throws EfectivoAplicacionBOException;

public abstract void agregarRecepcion(RecepcionVO recepcionVO) throws EfectivoAplicacionBOException;

public abstract void modificarRecepcion(RecepcionVO recepcionVO) throws EfectivoAplicacionBOException;

public abstract void agregaEnvase(EnvaseVO envaseVO) throws EfectivoAplicacionBOException;

public abstract void agregaComprobante(ComprobanteVO comprobanteVO)throws EfectivoAplicacionBOException;




}
