/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.vo;

import java.util.Date;

/**
 * @author OCE-WCD JESUS CARBAJAL MONTES
 *
 */
public class CriterioConsultasyReportesProcesadoraVO {

    private short tipoperIdn;
    private short tipomovIdn;
    private int estructraSirh;
    private short etvIdn;
    private short hdInterprocNumCorte;
    private Date hdInterprocFecContable;
	private Date fechaInicial;
	private Date fechaFinal;
	private String cadena;
	private boolean detalle;
	
	
	public void divideCadena()
	{
		String []campos=this.cadena.split("\\|");
		this.estructraSirh=Integer.parseInt(campos[0].toString());
		this.etvIdn=Short.parseShort(campos[2].toString());
	}
	/**
	 * @param tipoMovimiento
	 */
	public CriterioConsultasyReportesProcesadoraVO() {
		super();
		this.detalle=false;
		this.tipomovIdn = 2;
	}
	/**
	 * @return the tipoperIdn
	 */
	public short getTipoperIdn() {
		return tipoperIdn;
	}
	/**
	 * @param tipoperIdn the tipoperIdn to set
	 */
	public void setTipoperIdn(short tipoperIdn) {
		this.tipoperIdn = tipoperIdn;
	}
	/**
	 * @return the tipomovIdn
	 */
	public short getTipomovIdn() {
		return tipomovIdn;
	}
	/**
	 * @param tipomovIdn the tipomovIdn to set
	 */
	public void setTipomovIdn(short tipomovIdn) {
		this.tipomovIdn = tipomovIdn;
	}
	/**
	 * @return the estructraSirh
	 */
	public int getEstructraSirh() {
		return estructraSirh;
	}
	/**
	 * @param estructraSirh the estructraSirh to set
	 */
	public void setEstructraSirh(int estructraSirh) {
		this.estructraSirh = estructraSirh;
	}
	/**
	 * @return the etvIdn
	 */
	public short getEtvIdn() {
		return etvIdn;
	}
	/**
	 * @param etvIdn the etvIdn to set
	 */
	public void setEtvIdn(short etvIdn) {
		this.etvIdn = etvIdn;
	}
	/**
	 * @return the hdInterprocFecContable
	 */
	public Date getHdInterprocFecContable() {
		return hdInterprocFecContable;
	}
	/**
	 * @param hdInterprocFecContable the hdInterprocFecContable to set
	 */
	public void setHdInterprocFecContable(Date hdInterprocFecContable) {
		this.hdInterprocFecContable = hdInterprocFecContable;
	}
	/**
	 * @return the fechaInicial
	 */
	public Date getFechaInicial() {
		return fechaInicial;
	}
	/**
	 * @param fechaInicial the fechaInicial to set
	 */
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	/**
	 * @return the fechaFinal
	 */
	public Date getFechaFinal() {
		return fechaFinal;
	}
	/**
	 * @param fechaFinal the fechaFinal to set
	 */
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public boolean isDetalle() {
		return detalle;
	}
	public void setDetalle(boolean detalle) {
		this.detalle = detalle;
	}
	public short getHdInterprocNumCorte() {
		return hdInterprocNumCorte;
	}
	public void setHdInterprocNumCorte(short hdInterprocNumCorte) {
		this.hdInterprocNumCorte = hdInterprocNumCorte;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	

}
