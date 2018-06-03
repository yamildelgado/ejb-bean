package mx.com.bcm.banamex.ae.persistencia.vo;
import java.io.Serializable;
/**
 * @author INGRET AGUILAR VELAZQUEZ
 */

public class CriterioCajaVO implements Serializable{
	
private static final long serialVersionUID = 1L;
private Short cajaIdn;
private String cajaIpAddress;
/**
 * @return the cajaIdn
 */
public Short getCajaIdn() {
	return cajaIdn;
}
/**
 * @param cajaIdn the cajaIdn to set
 */
public void setCajaIdn(Short cajaIdn) {
	this.cajaIdn = cajaIdn;
}
/**
 * @return the cajaIpAddress
 */
public String getCajaIpAddress() {
	return cajaIpAddress;
}
/**
 * @param cajaIpAddress the cajaIpAddress to set
 * @return 
 */
public void setCajaIpAddress(String cajaIpAddress) {
	this.cajaIpAddress = cajaIpAddress;
}
/**
 * @return the subBovedasIdn
 */
public Short getSubbovedaIdn() {
	return subbovedaIdn;
}
/**
 * @param subBovedasIdn the subBovedasIdn to set
 */
public void setSubbovedaIdn(Short subbovedaIdn) {
	this.subbovedaIdn = subbovedaIdn;
}
/**
 * @return the tipocajaIdn
 */
public Short getTipocajaId() {
	return tipocajaId;
}
/**
 * @param tipocajaIdn the tipocajaIdn to set
 */
public void setTipocajaId(Short tipocajaId) {
	this.tipocajaId = tipocajaId;
}
private Short subbovedaIdn;
private Short tipocajaId;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "CriterioCajaVO [cajaIdn=" + cajaIdn + ", cajaIpAddress=\'"
			+ cajaIpAddress + "\', subbovedaIdn.subbovedaIdn=" + subbovedaIdn
			+ ", tipocajaId.tipocajaId=" + tipocajaId + "]";
}
}