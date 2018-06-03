/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.bcm.banamex.ae.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jcarbajal
 */
@Entity
@Table(name = "DETALLE_INTERFACE_PROCESADORA")
@NamedQueries({
    @NamedQuery(name = "DetalleInterfaceProcesadora.findAll", query = "SELECT d FROM DetalleInterfaceProcesadora d"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDetallprocIdn", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.detprocDetallprocIdn = :detprocDetallprocIdn"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByTipomovIdn", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.tipomovIdn = :tipomovIdn"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByEstructraSirh", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.estructraSirh = :estructraSirh"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByEtvIdn", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.etvIdn = :etvIdn"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByHdInterprocNumCorte", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.hdInterprocNumCorte = :hdInterprocNumCorte"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByHdInterprocFecContable", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detalleInterfaceProcesadoraPK.hdInterprocFecContable = :hdInterprocFecContable"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByAtmIdn", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.atmIdn = :atmIdn"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoRegistro", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoRegistro = :detprocTipoRegistro"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocIdentificadorMovto", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocIdentificadorMovto = :detprocIdentificadorMovto"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocEtvTraslado", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocEtvTraslado = :detprocEtvTraslado"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocSirhCpaeSirhOrigen", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocSirhCpaeSirhOrigen = :detprocSirhCpaeSirhOrigen"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocSirhDestinoIdAtm", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocSirhDestinoIdAtm = :detprocSirhDestinoIdAtm"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFolioS018", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFolioS018 = :detprocFolioS018"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocRecoleccion", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocRecoleccion = :detprocRecoleccion"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocRecepcionEnEtv", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocRecepcionEnEtv = :detprocRecepcionEnEtv"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocVerificacion", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocVerificacion = :detprocVerificacion"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocAcreditacionEnBnmx", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocAcreditacionEnBnmx = :detprocAcreditacionEnBnmx"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocInstruccionEtv", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocInstruccionEtv = :detprocInstruccionEtv"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocPreparacionEtv", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocPreparacionEtv = :detprocPreparacionEtv"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocEntregaATraslado", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocEntregaATraslado = :detprocEntregaATraslado"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocEntregaFORetrnoEtv", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocEntregaFORetrnoEtv = :detprocEntregaFORetrnoEtv"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocCopmisoEntrgUsrio", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocCopmisoEntrgUsrio = :detprocCopmisoEntrgUsrio"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocNumDeComprobante", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocNumDeComprobante = :detprocNumDeComprobante"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDiceContener", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDiceContener = :detprocDiceContener"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocNumUneg", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocNumUneg = :detprocNumUneg"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocContratoEfectivo", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocContratoEfectivo = :detprocContratoEfectivo"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocUnegSefEnvase", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocUnegSefEnvase = :detprocUnegSefEnvase"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocGloblParclContendor", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocGloblParclContendor = :detprocGloblParclContendor"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocPenalizacion1", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocPenalizacion1 = :detprocPenalizacion1"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocPenalizacion2", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocPenalizacion2 = :detprocPenalizacion2"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocPenalizacion3", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocPenalizacion3 = :detprocPenalizacion3"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocPenalizacion4", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocPenalizacion4 = :detprocPenalizacion4"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDivisa", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDivisa = :detprocDivisa"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocNumCliente", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocNumCliente = :detprocNumCliente"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFolioDeposDolares", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFolioDeposDolares = :detprocFolioDeposDolares"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocUnegPemex", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocUnegPemex = :detprocUnegPemex"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocSuc", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocSuc = :detprocSuc"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocCuenta", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocCuenta = :detprocCuenta"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpteDeposDotacion", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpteDeposDotacion = :detprocImpteDeposDotacion"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocRefNumerica1", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocRefNumerica1 = :detprocRefNumerica1"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferenciaAlf2", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferenciaAlf2 = :detprocReferenciaAlf2"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferencia3", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferencia3 = :detprocReferencia3"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferencia4", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferencia4 = :detprocReferencia4"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocComprobServSef", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocComprobServSef = :detprocComprobServSef"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill1", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill1 = :detprocTipoBill1"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion1", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion1 = :detprocDenominacion1"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte1", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte1 = :detprocImpte1"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill2", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill2 = :detprocTipoBill2"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion2", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion2 = :detprocDenominacion2"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte2", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte2 = :detprocImpte2"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill3", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill3 = :detprocTipoBill3"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion3", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion3 = :detprocDenominacion3"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte3", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte3 = :detprocImpte3"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill4", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill4 = :detprocTipoBill4"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion4", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion4 = :detprocDenominacion4"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte4", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte4 = :detprocImpte4"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill5", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill5 = :detprocTipoBill5"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion5", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion5 = :detprocDenominacion5"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte5", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte5 = :detprocImpte5"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill6", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill6 = :detprocTipoBill6"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion6", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion6 = :detprocDenominacion6"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte6", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte6 = :detprocImpte6"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill7", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill7 = :detprocTipoBill7"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion7", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion7 = :detprocDenominacion7"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte7", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte7 = :detprocImpte7"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill8", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill8 = :detprocTipoBill8"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion8", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion8 = :detprocDenominacion8"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte8", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte8 = :detprocImpte8"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill9", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill9 = :detprocTipoBill9"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion9", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion9 = :detprocDenominacion9"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte9", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte9 = :detprocImpte9"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill10", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill10 = :detprocTipoBill10"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion10", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion10 = :detprocDenominacion10"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte10", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte10 = :detprocImpte10"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill11", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill11 = :detprocTipoBill11"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion11", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion11 = :detprocDenominacion11"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte11", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte11 = :detprocImpte11"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill12", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill12 = :detprocTipoBill12"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion12", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion12 = :detprocDenominacion12"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte12", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte12 = :detprocImpte12"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill13", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill13 = :detprocTipoBill13"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion13", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion13 = :detprocDenominacion13"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte13", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte13 = :detprocImpte13"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill14", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill14 = :detprocTipoBill14"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion14", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion14 = :detprocDenominacion14"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte14", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte14 = :detprocImpte14"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill15", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill15 = :detprocTipoBill15"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion15", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion15 = :detprocDenominacion15"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte15", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte15 = :detprocImpte15"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill16", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill16 = :detprocTipoBill16"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion16", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion16 = :detprocDenominacion16"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte16", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte16 = :detprocImpte16"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill17", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill17 = :detprocTipoBill17"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion17", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion17 = :detprocDenominacion17"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte17", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte17 = :detprocImpte17"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill18", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill18 = :detprocTipoBill18"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion18", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion18 = :detprocDenominacion18"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte18", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte18 = :detprocImpte18"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill19", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill19 = :detprocTipoBill19"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion19", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion19 = :detprocDenominacion19"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte19", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte19 = :detprocImpte19"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill20", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill20 = :detprocTipoBill20"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion20", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion20 = :detprocDenominacion20"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte20", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte20 = :detprocImpte20"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill21", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill21 = :detprocTipoBill21"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion21", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion21 = :detprocDenominacion21"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte21", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte21 = :detprocImpte21"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill22", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill22 = :detprocTipoBill22"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion22", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion22 = :detprocDenominacion22"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte22", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte22 = :detprocImpte22"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTipoBill23", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTipoBill23 = :detprocTipoBill23"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacion23", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacion23 = :detprocDenominacion23"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpte23", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpte23 = :detprocImpte23"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpteCargoCheque", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpteCargoCheque = :detprocImpteCargoCheque"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocBanco", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocBanco = :detprocBanco"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocLineacapCodSeguridad", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocLineacapCodSeguridad = :detprocLineacapCodSeguridad"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocLineacapRutaTransito", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocLineacapRutaTransito = :detprocLineacapRutaTransito"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocLineacapNumCuenta", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocLineacapNumCuenta = :detprocLineacapNumCuenta"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocLineacapNumCheque", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocLineacapNumCheque = :detprocLineacapNumCheque"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFecHrRetencion", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFecHrRetencion = :detprocFecHrRetencion"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocCausaRetencion", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocCausaRetencion = :detprocCausaRetencion"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocImpteDiferencia", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocImpteDiferencia = :detprocImpteDiferencia"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFaltanteSobrante", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFaltanteSobrante = :detprocFaltanteSobrante"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocSuccargoAbonoDif", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocSuccargoAbonoDif = :detprocSuccargoAbonoDif"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocCntacargoAbonodif", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocCntacargoAbonodif = :detprocCntacargoAbonodif"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferenciaNumerica", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferenciaNumerica = :detprocReferenciaNumerica"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferenciaAlf", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferenciaAlf = :detprocReferenciaAlf"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferencia31", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferencia31 = :detprocReferencia31"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocReferencia41", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocReferencia41 = :detprocReferencia41"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocNumParcDif", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocNumParcDif = :detprocNumParcDif"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocDenominacionBpf", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocDenominacionBpf = :detprocDenominacionBpf"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocSerieBpf", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocSerieBpf = :detprocSerieBpf"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFolioBpf", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFolioBpf = :detprocFolioBpf"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocNombreCajeroEtv", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocNombreCajeroEtv = :detprocNombreCajeroEtv"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFecBpf", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFecBpf = :detprocFecBpf"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocFolioSam", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocFolioSam = :detprocFolioSam"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocEfectivoIntegrCaja", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocEfectivoIntegrCaja = :detprocEfectivoIntegrCaja"),
    @NamedQuery(name = "DetalleInterfaceProcesadora.findByDetprocTransmisionS500", query = "SELECT d FROM DetalleInterfaceProcesadora d WHERE d.detprocTransmisionS500 = :detprocTransmisionS500")})
public class DetalleInterfaceProcesadora implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleInterfaceProcesadoraPK detalleInterfaceProcesadoraPK;
    @Column(name = "ATM_IDN")
    private Short atmIdn;
    @Column(name = "DETPROC_TIPO_REGISTRO")
    private Short detprocTipoRegistro;
    @Column(name = "DETPROC_IDENTIFICADOR_MOVTO")
    private Short detprocIdentificadorMovto;
    @Column(name = "DETPROC_ETV_TRASLADO")
    private Short detprocEtvTraslado;
    @Column(name = "DETPROC_SIRH_CPAE_SIRH_ORIGEN")
    private Integer detprocSirhCpaeSirhOrigen;
    @Column(name = "DETPROC_SIRH_DESTINO_ID_ATM")
    private Integer detprocSirhDestinoIdAtm;
    @Column(name = "DETPROC_FOLIO_S018")
    private Long detprocFolioS018;
    @Column(name = "DETPROC_RECOLECCION")
    private Long detprocRecoleccion;
    @Column(name = "DETPROC_RECEPCION_EN_ETV")
    private Long detprocRecepcionEnEtv;
    @Column(name = "DETPROC_VERIFICACION")
    private Long detprocVerificacion;
    @Column(name = "DETPROC_ACREDITACION_EN_BNMX")
    private Long detprocAcreditacionEnBnmx;
    @Column(name = "DETPROC_INSTRUCCION_ETV")
    private Long detprocInstruccionEtv;
    @Column(name = "DETPROC_PREPARACION_ETV")
    private Long detprocPreparacionEtv;
    @Column(name = "DETPROC_ENTREGA_A_TRASLADO")
    private Long detprocEntregaATraslado;
    @Column(name = "DETPROC_ENTREGA_F_O_RETRNO_ETV")
    private Short detprocEntregaFORetrnoEtv;
    @Column(name = "DETPROC_COPMISO_ENTRG_USRIO")
    private Long detprocCopmisoEntrgUsrio;
    @Column(name = "DETPROC_NUM_DE_COMPROBANTE")
    private String detprocNumDeComprobante;
    @Column(name = "DETPROC_DICE_CONTENER")
    private BigDecimal detprocDiceContener;
    @Column(name = "DETPROC_NUM_UNEG")
    private Short detprocNumUneg;
    @Column(name = "DETPROC_CONTRATO_EFECTIVO")
    private Long detprocContratoEfectivo;
    @Column(name = "DETPROC_UNEG_SEF_ENVASE")
    private Long detprocUnegSefEnvase;
    @Column(name = "DETPROC_GLOBL_PARCL_CONTENDOR")
    private String detprocGloblParclContendor;
    @Column(name = "DETPROC_PENALIZACION_1")
    private Short detprocPenalizacion1;
    @Column(name = "DETPROC_PENALIZACION_2")
    private Short detprocPenalizacion2;
    @Column(name = "DETPROC_PENALIZACION_3")
    private Short detprocPenalizacion3;
    @Column(name = "DETPROC_PENALIZACION_4")
    private Short detprocPenalizacion4;
    @Column(name = "DETPROC_DIVISA")
    private Short detprocDivisa;
    @Column(name = "DETPROC_NUM_CLIENTE")
    private Long detprocNumCliente;
    @Column(name = "DETPROC_FOLIO_DEPOS_DOLARES")
    private Long detprocFolioDeposDolares;
    @Column(name = "DETPROC_UNEG_PEMEX")
    private Long detprocUnegPemex;
    @Column(name = "DETPROC_SUC")
    private Short detprocSuc;
    @Column(name = "DETPROC_CUENTA")
    private Integer detprocCuenta;
    @Column(name = "DETPROC_IMPTE_DEPOS_DOTACION")
    private BigDecimal detprocImpteDeposDotacion;
    @Column(name = "DETPROC_REF_NUMERICA_1")
    private Long detprocRefNumerica1;
    @Column(name = "DETPROC_REFERENCIA_ALF_2")
    private String detprocReferenciaAlf2;
    @Column(name = "DETPROC_REFERENCIA_3")
    private String detprocReferencia3;
    @Column(name = "DETPROC_REFERENCIA_4")
    private String detprocReferencia4;
    @Column(name = "DETPROC_COMPROB_SERV_SEF")
    private Integer detprocComprobServSef;
    @Column(name = "DETPROC_TIPO_BILL_1")
    private Short detprocTipoBill1;
    @Column(name = "DETPROC_DENOMINACION_1")
    private BigDecimal detprocDenominacion1;
    @Column(name = "DETPROC_IMPTE_1")
    private BigDecimal detprocImpte1;
    @Column(name = "DETPROC_TIPO_BILL_2")
    private Short detprocTipoBill2;
    @Column(name = "DETPROC_DENOMINACION_2")
    private BigDecimal detprocDenominacion2;
    @Column(name = "DETPROC_IMPTE_2")
    private BigDecimal detprocImpte2;
    @Column(name = "DETPROC_TIPO_BILL_3")
    private Short detprocTipoBill3;
    @Column(name = "DETPROC_DENOMINACION_3")
    private BigDecimal detprocDenominacion3;
    @Column(name = "DETPROC_IMPTE_3")
    private BigDecimal detprocImpte3;
    @Column(name = "DETPROC_TIPO_BILL_4")
    private Short detprocTipoBill4;
    @Column(name = "DETPROC_DENOMINACION_4")
    private BigDecimal detprocDenominacion4;
    @Column(name = "DETPROC_IMPTE_4")
    private BigDecimal detprocImpte4;
    @Column(name = "DETPROC_TIPO_BILL_5")
    private Short detprocTipoBill5;
    @Column(name = "DETPROC_DENOMINACION_5")
    private BigDecimal detprocDenominacion5;
    @Column(name = "DETPROC_IMPTE_5")
    private BigDecimal detprocImpte5;
    @Column(name = "DETPROC_TIPO_BILL_6")
    private Short detprocTipoBill6;
    @Column(name = "DETPROC_DENOMINACION_6")
    private BigDecimal detprocDenominacion6;
    @Column(name = "DETPROC_IMPTE_6")
    private BigDecimal detprocImpte6;
    @Column(name = "DETPROC_TIPO_BILL_7")
    private Short detprocTipoBill7;
    @Column(name = "DETPROC_DENOMINACION_7")
    private BigDecimal detprocDenominacion7;
    @Column(name = "DETPROC_IMPTE_7")
    private BigDecimal detprocImpte7;
    @Column(name = "DETPROC_TIPO_BILL_8")
    private Short detprocTipoBill8;
    @Column(name = "DETPROC_DENOMINACION_8")
    private BigDecimal detprocDenominacion8;
    @Column(name = "DETPROC_IMPTE_8")
    private BigDecimal detprocImpte8;
    @Column(name = "DETPROC_TIPO_BILL_9")
    private Short detprocTipoBill9;
    @Column(name = "DETPROC_DENOMINACION_9")
    private BigDecimal detprocDenominacion9;
    @Column(name = "DETPROC_IMPTE_9")
    private BigDecimal detprocImpte9;
    @Column(name = "DETPROC_TIPO_BILL_10")
    private Short detprocTipoBill10;
    @Column(name = "DETPROC_DENOMINACION_10")
    private BigDecimal detprocDenominacion10;
    @Column(name = "DETPROC_IMPTE_10")
    private BigDecimal detprocImpte10;
    @Column(name = "DETPROC_TIPO_BILL_11")
    private Short detprocTipoBill11;
    @Column(name = "DETPROC_DENOMINACION_11")
    private BigDecimal detprocDenominacion11;
    @Column(name = "DETPROC_IMPTE_11")
    private BigDecimal detprocImpte11;
    @Column(name = "DETPROC_TIPO_BILL_12")
    private Short detprocTipoBill12;
    @Column(name = "DETPROC_DENOMINACION_12")
    private BigDecimal detprocDenominacion12;
    @Column(name = "DETPROC_IMPTE_12")
    private BigDecimal detprocImpte12;
    @Column(name = "DETPROC_TIPO_BILL_13")
    private Short detprocTipoBill13;
    @Column(name = "DETPROC_DENOMINACION_13")
    private BigDecimal detprocDenominacion13;
    @Column(name = "DETPROC_IMPTE_13")
    private BigDecimal detprocImpte13;
    @Column(name = "DETPROC_TIPO_BILL_14")
    private Short detprocTipoBill14;
    @Column(name = "DETPROC_DENOMINACION_14")
    private BigDecimal detprocDenominacion14;
    @Column(name = "DETPROC_IMPTE_14")
    private BigDecimal detprocImpte14;
    @Column(name = "DETPROC_TIPO_BILL_15")
    private Short detprocTipoBill15;
    @Column(name = "DETPROC_DENOMINACION_15")
    private BigDecimal detprocDenominacion15;
    @Column(name = "DETPROC_IMPTE_15")
    private BigDecimal detprocImpte15;
    @Column(name = "DETPROC_TIPO_BILL_16")
    private Short detprocTipoBill16;
    @Column(name = "DETPROC_DENOMINACION_16")
    private BigDecimal detprocDenominacion16;
    @Column(name = "DETPROC_IMPTE_16")
    private BigDecimal detprocImpte16;
    @Column(name = "DETPROC_TIPO_BILL_17")
    private Short detprocTipoBill17;
    @Column(name = "DETPROC_DENOMINACION_17")
    private BigDecimal detprocDenominacion17;
    @Column(name = "DETPROC_IMPTE_17")
    private BigDecimal detprocImpte17;
    @Column(name = "DETPROC_TIPO_BILL_18")
    private Short detprocTipoBill18;
    @Column(name = "DETPROC_DENOMINACION_18")
    private BigDecimal detprocDenominacion18;
    @Column(name = "DETPROC_IMPTE_18")
    private BigDecimal detprocImpte18;
    @Column(name = "DETPROC_TIPO_BILL_19")
    private Short detprocTipoBill19;
    @Column(name = "DETPROC_DENOMINACION_19")
    private BigDecimal detprocDenominacion19;
    @Column(name = "DETPROC_IMPTE_19")
    private BigDecimal detprocImpte19;
    @Column(name = "DETPROC_TIPO_BILL_20")
    private Short detprocTipoBill20;
    @Column(name = "DETPROC_DENOMINACION_20")
    private BigDecimal detprocDenominacion20;
    @Column(name = "DETPROC_IMPTE_20")
    private BigDecimal detprocImpte20;
    @Column(name = "DETPROC_TIPO_BILL_21")
    private Short detprocTipoBill21;
    @Column(name = "DETPROC_DENOMINACION_21")
    private BigDecimal detprocDenominacion21;
    @Column(name = "DETPROC_IMPTE_21")
    private BigDecimal detprocImpte21;
    @Column(name = "DETPROC_TIPO_BILL_22")
    private Short detprocTipoBill22;
    @Column(name = "DETPROC_DENOMINACION_22")
    private BigDecimal detprocDenominacion22;
    @Column(name = "DETPROC_IMPTE_22")
    private BigDecimal detprocImpte22;
    @Column(name = "DETPROC_TIPO_BILL_23")
    private Short detprocTipoBill23;
    @Column(name = "DETPROC_DENOMINACION_23")
    private BigDecimal detprocDenominacion23;
    @Column(name = "DETPROC_IMPTE_23")
    private BigDecimal detprocImpte23;
    @Column(name = "DETPROC_IMPTE_CARGO_CHEQUE")
    private BigDecimal detprocImpteCargoCheque;
    @Column(name = "DETPROC_BANCO")
    private Short detprocBanco;
    @Column(name = "DETPROC_LINEACAP_COD_SEGURIDAD")
    private Short detprocLineacapCodSeguridad;
    @Column(name = "DETPROC_LINEACAP_RUTA_TRANSITO")
    private Integer detprocLineacapRutaTransito;
    @Column(name = "DETPROC_LINEACAP_NUM_CUENTA")
    private Long detprocLineacapNumCuenta;
    @Column(name = "DETPROC_LINEACAP_NUM_CHEQUE")
    private Integer detprocLineacapNumCheque;
    @Column(name = "DETPROC_FEC_HR_RETENCION")
    private Integer detprocFecHrRetencion;
    @Column(name = "DETPROC_CAUSA_RETENCION")
    private Short detprocCausaRetencion;
    @Column(name = "DETPROC_IMPTE_DIFERENCIA")
    private BigDecimal detprocImpteDiferencia;
    @Column(name = "DETPROC_FALTANTE_SOBRANTE")
    private String detprocFaltanteSobrante;
    @Column(name = "DETPROC_SUCCARGO_ABONO_DIF")
    private Short detprocSuccargoAbonoDif;
    @Column(name = "DETPROC_CNTACARGO_ABONODIF")
    private Integer detprocCntacargoAbonodif;
    @Column(name = "DETPROC_REFERENCIA_NUMERICA")
    private Long detprocReferenciaNumerica;
    @Column(name = "DETPROC_REFERENCIA_ALF")
    private String detprocReferenciaAlf;
    @Column(name = "DETPROC_REFERENCIA3")
    private String detprocReferencia31;
    @Column(name = "DETPROC_REFERENCIA4")
    private String detprocReferencia41;
    @Column(name = "DETPROC_NUM_PARC_DIF")
    private Short detprocNumParcDif;
    @Column(name = "DETPROC_DENOMINACION_BPF")
    private Integer detprocDenominacionBpf;
    @Column(name = "DETPROC_SERIE_BPF")
    private String detprocSerieBpf;
    @Column(name = "DETPROC_FOLIO_BPF")
    private String detprocFolioBpf;
    @Column(name = "DETPROC_NOMBRE_CAJERO_ETV")
    private String detprocNombreCajeroEtv;
    @Column(name = "DETPROC_FEC_BPF")
    private Integer detprocFecBpf;
    @Column(name = "DETPROC_FOLIO_SAM")
    private Integer detprocFolioSam;
    @Column(name = "DETPROC_EFECTIVO_INTEGR_CAJA")
    private Short detprocEfectivoIntegrCaja;
    @Column(name = "DETPROC_TRANSMISION_S500")
    private Short detprocTransmisionS500;
    @JoinColumn(name = "BANCO_IDN", referencedColumnName = "BANCO_IDN")
    @ManyToOne
    private Banco bancoIdn;
    @JoinColumns({
        @JoinColumn(name = "HD_INTERPROC_NUM_CORTE", referencedColumnName = "HD_INTERPROC_NUM_CORTE", insertable = false, updatable = false),
        @JoinColumn(name = "HD_INTERPROC_FEC_REAL", referencedColumnName = "HD_INTERPROC_FEC_REAL"),
        @JoinColumn(name = "HD_INTERPROC_FEC_CONTABLE", referencedColumnName = "HD_INTERPROC_FEC_CONTABLE", insertable = false, updatable = false),
        @JoinColumn(name = "HD_INTERPROC_HR_CORTE", referencedColumnName = "HD_INTERPROC_HR_CORTE"),
        @JoinColumn(name = "ETV_IDN", referencedColumnName = "ETV_IDN", insertable = false, updatable = false),
        @JoinColumn(name = "ESTRUCTRA_SIRH", referencedColumnName = "ESTRUCTRA_SIRH", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CabceraInterfProcdoraTotls cabceraInterfProcdoraTotls;
    @JoinColumns({
        @JoinColumn(name = "TIPOPER_IDN", referencedColumnName = "TIPOPER_IDN"),
        @JoinColumn(name = "TENTIDAD_IDN", referencedColumnName = "TENTIDAD_IDN")})
    @ManyToOne(optional = false)
    private TipoDeOperacion tipoDeOperacion;
    @JoinColumn(name = "TIPOMOV_IDN", referencedColumnName = "TIPOMOV_IDN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoMovimiento tipoMovimiento;

    public DetalleInterfaceProcesadora() {
    }

    public DetalleInterfaceProcesadora(DetalleInterfaceProcesadoraPK detalleInterfaceProcesadoraPK) {
        this.detalleInterfaceProcesadoraPK = detalleInterfaceProcesadoraPK;
    }

    public DetalleInterfaceProcesadora(int detprocDetallprocIdn, short tipomovIdn, int estructraSirh, short etvIdn, short hdInterprocNumCorte, Date hdInterprocFecContable) {
        this.detalleInterfaceProcesadoraPK = new DetalleInterfaceProcesadoraPK(detprocDetallprocIdn, tipomovIdn, estructraSirh, etvIdn, hdInterprocNumCorte, hdInterprocFecContable);
    }

    public DetalleInterfaceProcesadoraPK getDetalleInterfaceProcesadoraPK() {
        return detalleInterfaceProcesadoraPK;
    }

    public void setDetalleInterfaceProcesadoraPK(DetalleInterfaceProcesadoraPK detalleInterfaceProcesadoraPK) {
        this.detalleInterfaceProcesadoraPK = detalleInterfaceProcesadoraPK;
    }

    public Short getAtmIdn() {
        return atmIdn;
    }

    public void setAtmIdn(Short atmIdn) {
        this.atmIdn = atmIdn;
    }

    public Short getDetprocTipoRegistro() {
        return detprocTipoRegistro;
    }

    public void setDetprocTipoRegistro(Short detprocTipoRegistro) {
        this.detprocTipoRegistro = detprocTipoRegistro;
    }

    public Short getDetprocIdentificadorMovto() {
        return detprocIdentificadorMovto;
    }

    public void setDetprocIdentificadorMovto(Short detprocIdentificadorMovto) {
        this.detprocIdentificadorMovto = detprocIdentificadorMovto;
    }

    public Short getDetprocEtvTraslado() {
        return detprocEtvTraslado;
    }

    public void setDetprocEtvTraslado(Short detprocEtvTraslado) {
        this.detprocEtvTraslado = detprocEtvTraslado;
    }

    public Integer getDetprocSirhCpaeSirhOrigen() {
        return detprocSirhCpaeSirhOrigen;
    }

    public void setDetprocSirhCpaeSirhOrigen(Integer detprocSirhCpaeSirhOrigen) {
        this.detprocSirhCpaeSirhOrigen = detprocSirhCpaeSirhOrigen;
    }

    public Integer getDetprocSirhDestinoIdAtm() {
        return detprocSirhDestinoIdAtm;
    }

    public void setDetprocSirhDestinoIdAtm(Integer detprocSirhDestinoIdAtm) {
        this.detprocSirhDestinoIdAtm = detprocSirhDestinoIdAtm;
    }

    public Long getDetprocFolioS018() {
        return detprocFolioS018;
    }

    public void setDetprocFolioS018(Long detprocFolioS018) {
        this.detprocFolioS018 = detprocFolioS018;
    }

    public Long getDetprocRecoleccion() {
        return detprocRecoleccion;
    }

    public void setDetprocRecoleccion(Long detprocRecoleccion) {
        this.detprocRecoleccion = detprocRecoleccion;
    }

    public Long getDetprocRecepcionEnEtv() {
        return detprocRecepcionEnEtv;
    }

    public void setDetprocRecepcionEnEtv(Long detprocRecepcionEnEtv) {
        this.detprocRecepcionEnEtv = detprocRecepcionEnEtv;
    }

    public Long getDetprocVerificacion() {
        return detprocVerificacion;
    }

    public void setDetprocVerificacion(Long detprocVerificacion) {
        this.detprocVerificacion = detprocVerificacion;
    }

    public Long getDetprocAcreditacionEnBnmx() {
        return detprocAcreditacionEnBnmx;
    }

    public void setDetprocAcreditacionEnBnmx(Long detprocAcreditacionEnBnmx) {
        this.detprocAcreditacionEnBnmx = detprocAcreditacionEnBnmx;
    }

    public Long getDetprocInstruccionEtv() {
        return detprocInstruccionEtv;
    }

    public void setDetprocInstruccionEtv(Long detprocInstruccionEtv) {
        this.detprocInstruccionEtv = detprocInstruccionEtv;
    }

    public Long getDetprocPreparacionEtv() {
        return detprocPreparacionEtv;
    }

    public void setDetprocPreparacionEtv(Long detprocPreparacionEtv) {
        this.detprocPreparacionEtv = detprocPreparacionEtv;
    }

    public Long getDetprocEntregaATraslado() {
        return detprocEntregaATraslado;
    }

    public void setDetprocEntregaATraslado(Long detprocEntregaATraslado) {
        this.detprocEntregaATraslado = detprocEntregaATraslado;
    }

    public Short getDetprocEntregaFORetrnoEtv() {
        return detprocEntregaFORetrnoEtv;
    }

    public void setDetprocEntregaFORetrnoEtv(Short detprocEntregaFORetrnoEtv) {
        this.detprocEntregaFORetrnoEtv = detprocEntregaFORetrnoEtv;
    }

    public Long getDetprocCopmisoEntrgUsrio() {
        return detprocCopmisoEntrgUsrio;
    }

    public void setDetprocCopmisoEntrgUsrio(Long detprocCopmisoEntrgUsrio) {
        this.detprocCopmisoEntrgUsrio = detprocCopmisoEntrgUsrio;
    }

    public String getDetprocNumDeComprobante() {
        return detprocNumDeComprobante;
    }

    public void setDetprocNumDeComprobante(String detprocNumDeComprobante) {
        this.detprocNumDeComprobante = detprocNumDeComprobante;
    }

    public BigDecimal getDetprocDiceContener() {
        return detprocDiceContener;
    }

    public void setDetprocDiceContener(BigDecimal detprocDiceContener) {
        this.detprocDiceContener = detprocDiceContener;
    }

    public Short getDetprocNumUneg() {
        return detprocNumUneg;
    }

    public void setDetprocNumUneg(Short detprocNumUneg) {
        this.detprocNumUneg = detprocNumUneg;
    }

    public Long getDetprocContratoEfectivo() {
        return detprocContratoEfectivo;
    }

    public void setDetprocContratoEfectivo(Long detprocContratoEfectivo) {
        this.detprocContratoEfectivo = detprocContratoEfectivo;
    }

    public Long getDetprocUnegSefEnvase() {
        return detprocUnegSefEnvase;
    }

    public void setDetprocUnegSefEnvase(Long detprocUnegSefEnvase) {
        this.detprocUnegSefEnvase = detprocUnegSefEnvase;
    }

    public String getDetprocGloblParclContendor() {
        return detprocGloblParclContendor;
    }

    public void setDetprocGloblParclContendor(String detprocGloblParclContendor) {
        this.detprocGloblParclContendor = detprocGloblParclContendor;
    }

    public Short getDetprocPenalizacion1() {
        return detprocPenalizacion1;
    }

    public void setDetprocPenalizacion1(Short detprocPenalizacion1) {
        this.detprocPenalizacion1 = detprocPenalizacion1;
    }

    public Short getDetprocPenalizacion2() {
        return detprocPenalizacion2;
    }

    public void setDetprocPenalizacion2(Short detprocPenalizacion2) {
        this.detprocPenalizacion2 = detprocPenalizacion2;
    }

    public Short getDetprocPenalizacion3() {
        return detprocPenalizacion3;
    }

    public void setDetprocPenalizacion3(Short detprocPenalizacion3) {
        this.detprocPenalizacion3 = detprocPenalizacion3;
    }

    public Short getDetprocPenalizacion4() {
        return detprocPenalizacion4;
    }

    public void setDetprocPenalizacion4(Short detprocPenalizacion4) {
        this.detprocPenalizacion4 = detprocPenalizacion4;
    }

    public Short getDetprocDivisa() {
        return detprocDivisa;
    }

    public void setDetprocDivisa(Short detprocDivisa) {
        this.detprocDivisa = detprocDivisa;
    }

    public Long getDetprocNumCliente() {
        return detprocNumCliente;
    }

    public void setDetprocNumCliente(Long detprocNumCliente) {
        this.detprocNumCliente = detprocNumCliente;
    }

    public Long getDetprocFolioDeposDolares() {
        return detprocFolioDeposDolares;
    }

    public void setDetprocFolioDeposDolares(Long detprocFolioDeposDolares) {
        this.detprocFolioDeposDolares = detprocFolioDeposDolares;
    }

    public Long getDetprocUnegPemex() {
        return detprocUnegPemex;
    }

    public void setDetprocUnegPemex(Long detprocUnegPemex) {
        this.detprocUnegPemex = detprocUnegPemex;
    }

    public Short getDetprocSuc() {
        return detprocSuc;
    }

    public void setDetprocSuc(Short detprocSuc) {
        this.detprocSuc = detprocSuc;
    }

    public Integer getDetprocCuenta() {
        return detprocCuenta;
    }

    public void setDetprocCuenta(Integer detprocCuenta) {
        this.detprocCuenta = detprocCuenta;
    }

    public BigDecimal getDetprocImpteDeposDotacion() {
        return detprocImpteDeposDotacion;
    }

    public void setDetprocImpteDeposDotacion(BigDecimal detprocImpteDeposDotacion) {
        this.detprocImpteDeposDotacion = detprocImpteDeposDotacion;
    }

    public Long getDetprocRefNumerica1() {
        return detprocRefNumerica1;
    }

    public void setDetprocRefNumerica1(Long detprocRefNumerica1) {
        this.detprocRefNumerica1 = detprocRefNumerica1;
    }

    public String getDetprocReferenciaAlf2() {
        return detprocReferenciaAlf2;
    }

    public void setDetprocReferenciaAlf2(String detprocReferenciaAlf2) {
        this.detprocReferenciaAlf2 = detprocReferenciaAlf2;
    }

    public String getDetprocReferencia3() {
        return detprocReferencia3;
    }

    public void setDetprocReferencia3(String detprocReferencia3) {
        this.detprocReferencia3 = detprocReferencia3;
    }

    public String getDetprocReferencia4() {
        return detprocReferencia4;
    }

    public void setDetprocReferencia4(String detprocReferencia4) {
        this.detprocReferencia4 = detprocReferencia4;
    }

    public Integer getDetprocComprobServSef() {
        return detprocComprobServSef;
    }

    public void setDetprocComprobServSef(Integer detprocComprobServSef) {
        this.detprocComprobServSef = detprocComprobServSef;
    }

    public Short getDetprocTipoBill1() {
        return detprocTipoBill1;
    }

    public void setDetprocTipoBill1(Short detprocTipoBill1) {
        this.detprocTipoBill1 = detprocTipoBill1;
    }

    public BigDecimal getDetprocDenominacion1() {
        return detprocDenominacion1;
    }

    public void setDetprocDenominacion1(BigDecimal detprocDenominacion1) {
        this.detprocDenominacion1 = detprocDenominacion1;
    }

    public BigDecimal getDetprocImpte1() {
        return detprocImpte1;
    }

    public void setDetprocImpte1(BigDecimal detprocImpte1) {
        this.detprocImpte1 = detprocImpte1;
    }

    public Short getDetprocTipoBill2() {
        return detprocTipoBill2;
    }

    public void setDetprocTipoBill2(Short detprocTipoBill2) {
        this.detprocTipoBill2 = detprocTipoBill2;
    }

    public BigDecimal getDetprocDenominacion2() {
        return detprocDenominacion2;
    }

    public void setDetprocDenominacion2(BigDecimal detprocDenominacion2) {
        this.detprocDenominacion2 = detprocDenominacion2;
    }

    public BigDecimal getDetprocImpte2() {
        return detprocImpte2;
    }

    public void setDetprocImpte2(BigDecimal detprocImpte2) {
        this.detprocImpte2 = detprocImpte2;
    }

    public Short getDetprocTipoBill3() {
        return detprocTipoBill3;
    }

    public void setDetprocTipoBill3(Short detprocTipoBill3) {
        this.detprocTipoBill3 = detprocTipoBill3;
    }

    public BigDecimal getDetprocDenominacion3() {
        return detprocDenominacion3;
    }

    public void setDetprocDenominacion3(BigDecimal detprocDenominacion3) {
        this.detprocDenominacion3 = detprocDenominacion3;
    }

    public BigDecimal getDetprocImpte3() {
        return detprocImpte3;
    }

    public void setDetprocImpte3(BigDecimal detprocImpte3) {
        this.detprocImpte3 = detprocImpte3;
    }

    public Short getDetprocTipoBill4() {
        return detprocTipoBill4;
    }

    public void setDetprocTipoBill4(Short detprocTipoBill4) {
        this.detprocTipoBill4 = detprocTipoBill4;
    }

    public BigDecimal getDetprocDenominacion4() {
        return detprocDenominacion4;
    }

    public void setDetprocDenominacion4(BigDecimal detprocDenominacion4) {
        this.detprocDenominacion4 = detprocDenominacion4;
    }

    public BigDecimal getDetprocImpte4() {
        return detprocImpte4;
    }

    public void setDetprocImpte4(BigDecimal detprocImpte4) {
        this.detprocImpte4 = detprocImpte4;
    }

    public Short getDetprocTipoBill5() {
        return detprocTipoBill5;
    }

    public void setDetprocTipoBill5(Short detprocTipoBill5) {
        this.detprocTipoBill5 = detprocTipoBill5;
    }

    public BigDecimal getDetprocDenominacion5() {
        return detprocDenominacion5;
    }

    public void setDetprocDenominacion5(BigDecimal detprocDenominacion5) {
        this.detprocDenominacion5 = detprocDenominacion5;
    }

    public BigDecimal getDetprocImpte5() {
        return detprocImpte5;
    }

    public void setDetprocImpte5(BigDecimal detprocImpte5) {
        this.detprocImpte5 = detprocImpte5;
    }

    public Short getDetprocTipoBill6() {
        return detprocTipoBill6;
    }

    public void setDetprocTipoBill6(Short detprocTipoBill6) {
        this.detprocTipoBill6 = detprocTipoBill6;
    }

    public BigDecimal getDetprocDenominacion6() {
        return detprocDenominacion6;
    }

    public void setDetprocDenominacion6(BigDecimal detprocDenominacion6) {
        this.detprocDenominacion6 = detprocDenominacion6;
    }

    public BigDecimal getDetprocImpte6() {
        return detprocImpte6;
    }

    public void setDetprocImpte6(BigDecimal detprocImpte6) {
        this.detprocImpte6 = detprocImpte6;
    }

    public Short getDetprocTipoBill7() {
        return detprocTipoBill7;
    }

    public void setDetprocTipoBill7(Short detprocTipoBill7) {
        this.detprocTipoBill7 = detprocTipoBill7;
    }

    public BigDecimal getDetprocDenominacion7() {
        return detprocDenominacion7;
    }

    public void setDetprocDenominacion7(BigDecimal detprocDenominacion7) {
        this.detprocDenominacion7 = detprocDenominacion7;
    }

    public BigDecimal getDetprocImpte7() {
        return detprocImpte7;
    }

    public void setDetprocImpte7(BigDecimal detprocImpte7) {
        this.detprocImpte7 = detprocImpte7;
    }

    public Short getDetprocTipoBill8() {
        return detprocTipoBill8;
    }

    public void setDetprocTipoBill8(Short detprocTipoBill8) {
        this.detprocTipoBill8 = detprocTipoBill8;
    }

    public BigDecimal getDetprocDenominacion8() {
        return detprocDenominacion8;
    }

    public void setDetprocDenominacion8(BigDecimal detprocDenominacion8) {
        this.detprocDenominacion8 = detprocDenominacion8;
    }

    public BigDecimal getDetprocImpte8() {
        return detprocImpte8;
    }

    public void setDetprocImpte8(BigDecimal detprocImpte8) {
        this.detprocImpte8 = detprocImpte8;
    }

    public Short getDetprocTipoBill9() {
        return detprocTipoBill9;
    }

    public void setDetprocTipoBill9(Short detprocTipoBill9) {
        this.detprocTipoBill9 = detprocTipoBill9;
    }

    public BigDecimal getDetprocDenominacion9() {
        return detprocDenominacion9;
    }

    public void setDetprocDenominacion9(BigDecimal detprocDenominacion9) {
        this.detprocDenominacion9 = detprocDenominacion9;
    }

    public BigDecimal getDetprocImpte9() {
        return detprocImpte9;
    }

    public void setDetprocImpte9(BigDecimal detprocImpte9) {
        this.detprocImpte9 = detprocImpte9;
    }

    public Short getDetprocTipoBill10() {
        return detprocTipoBill10;
    }

    public void setDetprocTipoBill10(Short detprocTipoBill10) {
        this.detprocTipoBill10 = detprocTipoBill10;
    }

    public BigDecimal getDetprocDenominacion10() {
        return detprocDenominacion10;
    }

    public void setDetprocDenominacion10(BigDecimal detprocDenominacion10) {
        this.detprocDenominacion10 = detprocDenominacion10;
    }

    public BigDecimal getDetprocImpte10() {
        return detprocImpte10;
    }

    public void setDetprocImpte10(BigDecimal detprocImpte10) {
        this.detprocImpte10 = detprocImpte10;
    }

    public Short getDetprocTipoBill11() {
        return detprocTipoBill11;
    }

    public void setDetprocTipoBill11(Short detprocTipoBill11) {
        this.detprocTipoBill11 = detprocTipoBill11;
    }

    public BigDecimal getDetprocDenominacion11() {
        return detprocDenominacion11;
    }

    public void setDetprocDenominacion11(BigDecimal detprocDenominacion11) {
        this.detprocDenominacion11 = detprocDenominacion11;
    }

    public BigDecimal getDetprocImpte11() {
        return detprocImpte11;
    }

    public void setDetprocImpte11(BigDecimal detprocImpte11) {
        this.detprocImpte11 = detprocImpte11;
    }

    public Short getDetprocTipoBill12() {
        return detprocTipoBill12;
    }

    public void setDetprocTipoBill12(Short detprocTipoBill12) {
        this.detprocTipoBill12 = detprocTipoBill12;
    }

    public BigDecimal getDetprocDenominacion12() {
        return detprocDenominacion12;
    }

    public void setDetprocDenominacion12(BigDecimal detprocDenominacion12) {
        this.detprocDenominacion12 = detprocDenominacion12;
    }

    public BigDecimal getDetprocImpte12() {
        return detprocImpte12;
    }

    public void setDetprocImpte12(BigDecimal detprocImpte12) {
        this.detprocImpte12 = detprocImpte12;
    }

    public Short getDetprocTipoBill13() {
        return detprocTipoBill13;
    }

    public void setDetprocTipoBill13(Short detprocTipoBill13) {
        this.detprocTipoBill13 = detprocTipoBill13;
    }

    public BigDecimal getDetprocDenominacion13() {
        return detprocDenominacion13;
    }

    public void setDetprocDenominacion13(BigDecimal detprocDenominacion13) {
        this.detprocDenominacion13 = detprocDenominacion13;
    }

    public BigDecimal getDetprocImpte13() {
        return detprocImpte13;
    }

    public void setDetprocImpte13(BigDecimal detprocImpte13) {
        this.detprocImpte13 = detprocImpte13;
    }

    public Short getDetprocTipoBill14() {
        return detprocTipoBill14;
    }

    public void setDetprocTipoBill14(Short detprocTipoBill14) {
        this.detprocTipoBill14 = detprocTipoBill14;
    }

    public BigDecimal getDetprocDenominacion14() {
        return detprocDenominacion14;
    }

    public void setDetprocDenominacion14(BigDecimal detprocDenominacion14) {
        this.detprocDenominacion14 = detprocDenominacion14;
    }

    public BigDecimal getDetprocImpte14() {
        return detprocImpte14;
    }

    public void setDetprocImpte14(BigDecimal detprocImpte14) {
        this.detprocImpte14 = detprocImpte14;
    }

    public Short getDetprocTipoBill15() {
        return detprocTipoBill15;
    }

    public void setDetprocTipoBill15(Short detprocTipoBill15) {
        this.detprocTipoBill15 = detprocTipoBill15;
    }

    public BigDecimal getDetprocDenominacion15() {
        return detprocDenominacion15;
    }

    public void setDetprocDenominacion15(BigDecimal detprocDenominacion15) {
        this.detprocDenominacion15 = detprocDenominacion15;
    }

    public BigDecimal getDetprocImpte15() {
        return detprocImpte15;
    }

    public void setDetprocImpte15(BigDecimal detprocImpte15) {
        this.detprocImpte15 = detprocImpte15;
    }

    public Short getDetprocTipoBill16() {
        return detprocTipoBill16;
    }

    public void setDetprocTipoBill16(Short detprocTipoBill16) {
        this.detprocTipoBill16 = detprocTipoBill16;
    }

    public BigDecimal getDetprocDenominacion16() {
        return detprocDenominacion16;
    }

    public void setDetprocDenominacion16(BigDecimal detprocDenominacion16) {
        this.detprocDenominacion16 = detprocDenominacion16;
    }

    public BigDecimal getDetprocImpte16() {
        return detprocImpte16;
    }

    public void setDetprocImpte16(BigDecimal detprocImpte16) {
        this.detprocImpte16 = detprocImpte16;
    }

    public Short getDetprocTipoBill17() {
        return detprocTipoBill17;
    }

    public void setDetprocTipoBill17(Short detprocTipoBill17) {
        this.detprocTipoBill17 = detprocTipoBill17;
    }

    public BigDecimal getDetprocDenominacion17() {
        return detprocDenominacion17;
    }

    public void setDetprocDenominacion17(BigDecimal detprocDenominacion17) {
        this.detprocDenominacion17 = detprocDenominacion17;
    }

    public BigDecimal getDetprocImpte17() {
        return detprocImpte17;
    }

    public void setDetprocImpte17(BigDecimal detprocImpte17) {
        this.detprocImpte17 = detprocImpte17;
    }

    public Short getDetprocTipoBill18() {
        return detprocTipoBill18;
    }

    public void setDetprocTipoBill18(Short detprocTipoBill18) {
        this.detprocTipoBill18 = detprocTipoBill18;
    }

    public BigDecimal getDetprocDenominacion18() {
        return detprocDenominacion18;
    }

    public void setDetprocDenominacion18(BigDecimal detprocDenominacion18) {
        this.detprocDenominacion18 = detprocDenominacion18;
    }

    public BigDecimal getDetprocImpte18() {
        return detprocImpte18;
    }

    public void setDetprocImpte18(BigDecimal detprocImpte18) {
        this.detprocImpte18 = detprocImpte18;
    }

    public Short getDetprocTipoBill19() {
        return detprocTipoBill19;
    }

    public void setDetprocTipoBill19(Short detprocTipoBill19) {
        this.detprocTipoBill19 = detprocTipoBill19;
    }

    public BigDecimal getDetprocDenominacion19() {
        return detprocDenominacion19;
    }

    public void setDetprocDenominacion19(BigDecimal detprocDenominacion19) {
        this.detprocDenominacion19 = detprocDenominacion19;
    }

    public BigDecimal getDetprocImpte19() {
        return detprocImpte19;
    }

    public void setDetprocImpte19(BigDecimal detprocImpte19) {
        this.detprocImpte19 = detprocImpte19;
    }

    public Short getDetprocTipoBill20() {
        return detprocTipoBill20;
    }

    public void setDetprocTipoBill20(Short detprocTipoBill20) {
        this.detprocTipoBill20 = detprocTipoBill20;
    }

    public BigDecimal getDetprocDenominacion20() {
        return detprocDenominacion20;
    }

    public void setDetprocDenominacion20(BigDecimal detprocDenominacion20) {
        this.detprocDenominacion20 = detprocDenominacion20;
    }

    public BigDecimal getDetprocImpte20() {
        return detprocImpte20;
    }

    public void setDetprocImpte20(BigDecimal detprocImpte20) {
        this.detprocImpte20 = detprocImpte20;
    }

    public Short getDetprocTipoBill21() {
        return detprocTipoBill21;
    }

    public void setDetprocTipoBill21(Short detprocTipoBill21) {
        this.detprocTipoBill21 = detprocTipoBill21;
    }

    public BigDecimal getDetprocDenominacion21() {
        return detprocDenominacion21;
    }

    public void setDetprocDenominacion21(BigDecimal detprocDenominacion21) {
        this.detprocDenominacion21 = detprocDenominacion21;
    }

    public BigDecimal getDetprocImpte21() {
        return detprocImpte21;
    }

    public void setDetprocImpte21(BigDecimal detprocImpte21) {
        this.detprocImpte21 = detprocImpte21;
    }

    public Short getDetprocTipoBill22() {
        return detprocTipoBill22;
    }

    public void setDetprocTipoBill22(Short detprocTipoBill22) {
        this.detprocTipoBill22 = detprocTipoBill22;
    }

    public BigDecimal getDetprocDenominacion22() {
        return detprocDenominacion22;
    }

    public void setDetprocDenominacion22(BigDecimal detprocDenominacion22) {
        this.detprocDenominacion22 = detprocDenominacion22;
    }

    public BigDecimal getDetprocImpte22() {
        return detprocImpte22;
    }

    public void setDetprocImpte22(BigDecimal detprocImpte22) {
        this.detprocImpte22 = detprocImpte22;
    }

    public Short getDetprocTipoBill23() {
        return detprocTipoBill23;
    }

    public void setDetprocTipoBill23(Short detprocTipoBill23) {
        this.detprocTipoBill23 = detprocTipoBill23;
    }

    public BigDecimal getDetprocDenominacion23() {
        return detprocDenominacion23;
    }

    public void setDetprocDenominacion23(BigDecimal detprocDenominacion23) {
        this.detprocDenominacion23 = detprocDenominacion23;
    }

    public BigDecimal getDetprocImpte23() {
        return detprocImpte23;
    }

    public void setDetprocImpte23(BigDecimal detprocImpte23) {
        this.detprocImpte23 = detprocImpte23;
    }

    public BigDecimal getDetprocImpteCargoCheque() {
        return detprocImpteCargoCheque;
    }

    public void setDetprocImpteCargoCheque(BigDecimal detprocImpteCargoCheque) {
        this.detprocImpteCargoCheque = detprocImpteCargoCheque;
    }

    public Short getDetprocBanco() {
        return detprocBanco;
    }

    public void setDetprocBanco(Short detprocBanco) {
        this.detprocBanco = detprocBanco;
    }

    public Short getDetprocLineacapCodSeguridad() {
        return detprocLineacapCodSeguridad;
    }

    public void setDetprocLineacapCodSeguridad(Short detprocLineacapCodSeguridad) {
        this.detprocLineacapCodSeguridad = detprocLineacapCodSeguridad;
    }

    public Integer getDetprocLineacapRutaTransito() {
        return detprocLineacapRutaTransito;
    }

    public void setDetprocLineacapRutaTransito(Integer detprocLineacapRutaTransito) {
        this.detprocLineacapRutaTransito = detprocLineacapRutaTransito;
    }

    public Long getDetprocLineacapNumCuenta() {
        return detprocLineacapNumCuenta;
    }

    public void setDetprocLineacapNumCuenta(Long detprocLineacapNumCuenta) {
        this.detprocLineacapNumCuenta = detprocLineacapNumCuenta;
    }

    public Integer getDetprocLineacapNumCheque() {
        return detprocLineacapNumCheque;
    }

    public void setDetprocLineacapNumCheque(Integer detprocLineacapNumCheque) {
        this.detprocLineacapNumCheque = detprocLineacapNumCheque;
    }

    public Integer getDetprocFecHrRetencion() {
        return detprocFecHrRetencion;
    }

    public void setDetprocFecHrRetencion(Integer detprocFecHrRetencion) {
        this.detprocFecHrRetencion = detprocFecHrRetencion;
    }

    public Short getDetprocCausaRetencion() {
        return detprocCausaRetencion;
    }

    public void setDetprocCausaRetencion(Short detprocCausaRetencion) {
        this.detprocCausaRetencion = detprocCausaRetencion;
    }

    public BigDecimal getDetprocImpteDiferencia() {
        return detprocImpteDiferencia;
    }

    public void setDetprocImpteDiferencia(BigDecimal detprocImpteDiferencia) {
        this.detprocImpteDiferencia = detprocImpteDiferencia;
    }

    public String getDetprocFaltanteSobrante() {
        return detprocFaltanteSobrante;
    }

    public void setDetprocFaltanteSobrante(String detprocFaltanteSobrante) {
        this.detprocFaltanteSobrante = detprocFaltanteSobrante;
    }

    public Short getDetprocSuccargoAbonoDif() {
        return detprocSuccargoAbonoDif;
    }

    public void setDetprocSuccargoAbonoDif(Short detprocSuccargoAbonoDif) {
        this.detprocSuccargoAbonoDif = detprocSuccargoAbonoDif;
    }

    public Integer getDetprocCntacargoAbonodif() {
        return detprocCntacargoAbonodif;
    }

    public void setDetprocCntacargoAbonodif(Integer detprocCntacargoAbonodif) {
        this.detprocCntacargoAbonodif = detprocCntacargoAbonodif;
    }

    public Long getDetprocReferenciaNumerica() {
        return detprocReferenciaNumerica;
    }

    public void setDetprocReferenciaNumerica(Long detprocReferenciaNumerica) {
        this.detprocReferenciaNumerica = detprocReferenciaNumerica;
    }

    public String getDetprocReferenciaAlf() {
        return detprocReferenciaAlf;
    }

    public void setDetprocReferenciaAlf(String detprocReferenciaAlf) {
        this.detprocReferenciaAlf = detprocReferenciaAlf;
    }

    public String getDetprocReferencia31() {
        return detprocReferencia31;
    }

    public void setDetprocReferencia31(String detprocReferencia31) {
        this.detprocReferencia31 = detprocReferencia31;
    }

    public String getDetprocReferencia41() {
        return detprocReferencia41;
    }

    public void setDetprocReferencia41(String detprocReferencia41) {
        this.detprocReferencia41 = detprocReferencia41;
    }

    public Short getDetprocNumParcDif() {
        return detprocNumParcDif;
    }

    public void setDetprocNumParcDif(Short detprocNumParcDif) {
        this.detprocNumParcDif = detprocNumParcDif;
    }

    public Integer getDetprocDenominacionBpf() {
        return detprocDenominacionBpf;
    }

    public void setDetprocDenominacionBpf(Integer detprocDenominacionBpf) {
        this.detprocDenominacionBpf = detprocDenominacionBpf;
    }

    public String getDetprocSerieBpf() {
        return detprocSerieBpf;
    }

    public void setDetprocSerieBpf(String detprocSerieBpf) {
        this.detprocSerieBpf = detprocSerieBpf;
    }

    public String getDetprocFolioBpf() {
        return detprocFolioBpf;
    }

    public void setDetprocFolioBpf(String detprocFolioBpf) {
        this.detprocFolioBpf = detprocFolioBpf;
    }

    public String getDetprocNombreCajeroEtv() {
        return detprocNombreCajeroEtv;
    }

    public void setDetprocNombreCajeroEtv(String detprocNombreCajeroEtv) {
        this.detprocNombreCajeroEtv = detprocNombreCajeroEtv;
    }

    public Integer getDetprocFecBpf() {
        return detprocFecBpf;
    }

    public void setDetprocFecBpf(Integer detprocFecBpf) {
        this.detprocFecBpf = detprocFecBpf;
    }

    public Integer getDetprocFolioSam() {
        return detprocFolioSam;
    }

    public void setDetprocFolioSam(Integer detprocFolioSam) {
        this.detprocFolioSam = detprocFolioSam;
    }

    public Short getDetprocEfectivoIntegrCaja() {
        return detprocEfectivoIntegrCaja;
    }

    public void setDetprocEfectivoIntegrCaja(Short detprocEfectivoIntegrCaja) {
        this.detprocEfectivoIntegrCaja = detprocEfectivoIntegrCaja;
    }

    public Short getDetprocTransmisionS500() {
        return detprocTransmisionS500;
    }

    public void setDetprocTransmisionS500(Short detprocTransmisionS500) {
        this.detprocTransmisionS500 = detprocTransmisionS500;
    }

    public Banco getBancoIdn() {
        return bancoIdn;
    }

    public void setBancoIdn(Banco bancoIdn) {
        this.bancoIdn = bancoIdn;
    }

    public CabceraInterfProcdoraTotls getCabceraInterfProcdoraTotls() {
        return cabceraInterfProcdoraTotls;
    }

    public void setCabceraInterfProcdoraTotls(CabceraInterfProcdoraTotls cabceraInterfProcdoraTotls) {
        this.cabceraInterfProcdoraTotls = cabceraInterfProcdoraTotls;
    }

    public TipoDeOperacion getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(TipoDeOperacion tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleInterfaceProcesadoraPK != null ? detalleInterfaceProcesadoraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleInterfaceProcesadora)) {
            return false;
        }
        DetalleInterfaceProcesadora other = (DetalleInterfaceProcesadora) object;
        if ((this.detalleInterfaceProcesadoraPK == null && other.detalleInterfaceProcesadoraPK != null) || (this.detalleInterfaceProcesadoraPK != null && !this.detalleInterfaceProcesadoraPK.equals(other.detalleInterfaceProcesadoraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadora[detalleInterfaceProcesadoraPK=" + detalleInterfaceProcesadoraPK + "]";
    }

}
