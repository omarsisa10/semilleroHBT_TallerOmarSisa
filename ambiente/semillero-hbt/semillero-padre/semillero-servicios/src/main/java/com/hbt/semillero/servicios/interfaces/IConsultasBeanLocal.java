package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;

@Local
public interface IConsultasBeanLocal {

	
	public List<Cliente> consultarClientes();
	public List<Factura> consultarFacturas(int idCliente);
	
}
