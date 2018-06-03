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

import mx.com.bcm.banamex.ae.negocio.catalogo.bo.CatalogoSubBovedaBOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.assambler.SubBovedaAssambler;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoCpaeDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoPlazaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.dao.CatalogoSubBovedaDAOBeanLocal;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.modelo.SubBoveda;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;


/**
 * 
 * @author atinajero ABRAHAM ALFONSO TINAJERO SÁNCHEZ
 * 
 */

public @Stateless
class CatalogoSubBovedaBOImplBean implements CatalogoSubBovedaBOBeanLocal {

	@EJB
	private CatalogoSubBovedaDAOBeanLocal subBovedaDAO;
	@EJB
	private CatalogoCpaeDAOBeanLocal cpaeDAO;
	@EJB
	private CatalogoPlazaDAOBeanLocal plazaDAO;

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	@Override
	public List<SubBovedaVO> consultSubBovedas()
			throws EfectivoAplicacionBOException {

		List<SubBovedaVO> listaSubBovedaVO = new ArrayList<SubBovedaVO>();
		List<SubBoveda> listaSubBoveda = this.subBovedaDAO.findAll();

		for (SubBoveda elemento : listaSubBoveda) {
			SubBovedaVO subBovedaVO = SubBovedaAssambler
					.getSubBovedaVO(elemento);
			listaSubBovedaVO.add(subBovedaVO);

		}

		return listaSubBovedaVO;

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void addSubBovedas(SubBovedaVO subBovedaVO)
			throws EfectivoAplicacionBOException {
		SubBoveda subBovedas = SubBovedaAssambler.getSubBovedas(subBovedaVO);
		// Mandamos los valores de las llaves foraneas ya existentes
		subBovedas.setPlazaIdn(plazaDAO.findById(subBovedaVO.getPlazaIdn()));
		//subBovedas.setCpaesEstructuraSirhIdn(cpaeDAO.findById(subBovedaVO.getSirhIdn()));
		subBovedas.setSubbovedaBajaLogica("A");

		// Convertimos el Vo a Entity para realizar la persistencia
		this.subBovedaDAO.persist(subBovedas);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void editSubBovedas(SubBovedaVO subBovedaVO)
			throws EfectivoAplicacionBOException {

		// Mandamos los valores de las llaves foraneas ya existentes
		// subBovedaVO.setIdnPlaza(plazaDAO.findById(subBovedaVO.getIdnPlaza()).getPlazaIdn());
		// subBovedaVO.setSirhCpae(cpaeDAO.findById((short)subBovedaVO.getSirhCpae()).getSirhIdn());

		// Convertimos el Vo a Entity para realizar la persistencia
		SubBoveda subBovedas = SubBovedaAssambler.getSubBovedas(subBovedaVO);
		subBovedas.setPlazaIdn(this.plazaDAO.findById(subBovedaVO.getPlazaIdn()));
		//subBovedas.setCpaesEstructuraSirhIdn(cpaeDAO.findById(subBovedaVO.getSirhIdn()));

		this.subBovedaDAO.merge(subBovedas);

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public SubBovedaVO consultarPorIdnSubBoveda(short idn)
			throws EfectivoAplicacionBOException {
		SubBoveda subBovedas = new SubBoveda();
		SubBovedaVO subBovedaVO = new SubBovedaVO();

		subBovedas = subBovedaDAO.findById(idn);

		subBovedaVO = SubBovedaAssambler.getSubBovedaVO(subBovedas);
		return subBovedaVO;
	}
	/*
	 * @Override public void addSubBovedas(SubBovedaVO subBovedaVO) throws
	 * EfectivoAplicacionBOException { SubBovedas subBovedas=
	 * SubBovedaAssambler.getSubBovedas(subBovedaVO);
	 * subBovedas.setPlazaIdn(plazaDAO.findById(subBovedaVO.getPlazaIdn()));
	 * subBovedas
	 * .setCpaesEstructuraSirhIdn(cpaeDAO.findById(subBovedaVO.getSirhIdn()));
	 * 
	 * this.subBovedaDAO.merge(subBovedas);
	 * 
	 * }
	 */

}
