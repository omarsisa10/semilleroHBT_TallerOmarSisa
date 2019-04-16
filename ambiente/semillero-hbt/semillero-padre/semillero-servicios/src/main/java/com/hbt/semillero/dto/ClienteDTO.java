package com.hbt.semillero.dto;

import java.io.Serializable;

public class ClienteDTO  implements Serializable {
	private int clienteId;
	private String  clienteNombre;
	
	
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getClienteNombre() {
		return clienteNombre;
	}
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	public ClienteDTO(int clienteId, String clienteNombre) {
		super();
		this.clienteId = clienteId;
		this.clienteNombre = clienteNombre;
	}
	public ClienteDTO() {
		super();
	}

	
	


}
