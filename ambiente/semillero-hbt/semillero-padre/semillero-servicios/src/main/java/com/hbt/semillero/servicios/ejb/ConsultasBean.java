package com.hbt.semillero.servicios.ejb;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;

@Stateless
public class ConsultasBean implements IConsultasBeanLocal{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Cliente> consultarClientes() {
		return entityManager.createQuery("select cli FROM Cliente cli").getResultList();		
	}

	@Override
	public List<Factura> consultarFacturas(int idCliente) {
		return entityManager.createQuery("select fac FROM Factura fac where fac.cliente.id =:idCliente").setParameter("idCliente",idCliente ).getResultList();			
	}

	@Override
	public List<Bebida> consultarBebidas() {
		return entityManager.createQuery("select beb FROM Bebida beb").getResultList();			
	}

}
