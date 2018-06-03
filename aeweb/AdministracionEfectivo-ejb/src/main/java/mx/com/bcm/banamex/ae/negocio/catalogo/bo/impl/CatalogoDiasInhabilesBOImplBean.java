 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoDiasInhabilesBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.DiasInhabilesAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoDiasInhabilesDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.DiasInhabiles;
import mx.com.bcm.banamex.ae.persistencia.vo.DiasInhabilesVO;


public  @Stateless class CatalogoDiasInhabilesBOImplBean implements CatalogoDiasInhabilesBOBeanLocal{
	@EJB private CatalogoDiasInhabilesDAOBeanLocal diasInhabilesDAO;
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<DiasInhabilesVO> consultaDiasInhabiles() throws EfectivoAplicacionBOException {
		 List<DiasInhabilesVO> listaDiasInhabilesVO=new ArrayList<DiasInhabilesVO>();
		 List<DiasInhabiles> listaDiasInhabiles = this.diasInhabilesDAO.findAll();
		 for(DiasInhabiles elemento:listaDiasInhabiles){
			 DiasInhabilesVO diasInhabilesVO=DiasInhabilesAssambler.getDiasInhabilesVO(elemento);
			 listaDiasInhabilesVO.add(diasInhabilesVO);
		 }
		return listaDiasInhabilesVO;
	}

}
