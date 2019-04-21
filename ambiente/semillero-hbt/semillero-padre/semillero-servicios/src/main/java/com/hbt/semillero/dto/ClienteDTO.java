package com.hbt.semillero.dto;

import java.io.Serializable;
/**
 * DTO de la clase cliente implementa a serializable
 * @author Sisa
 *
 */
public class ClienteDTO  implements Serializable {
	
	/**
	 * atributos de la clase cliente
	 */
	private int clienteId;
	private String  clienteNombre;
	
	// GETTERS Y SETTERS *******	
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
	/**
	 * constructor
	 */
	public ClienteDTO(int clienteId, String clienteNombre) {
		super();
		this.clienteId = clienteId;
		this.clienteNombre = clienteNombre;
	}
	
	public ClienteDTO(String clienteNombre) {
		super();
		this.clienteNombre = clienteNombre;
	}
	/**
	 * constructor
	 */
	public ClienteDTO() {
		super();
	}

	
	


}
