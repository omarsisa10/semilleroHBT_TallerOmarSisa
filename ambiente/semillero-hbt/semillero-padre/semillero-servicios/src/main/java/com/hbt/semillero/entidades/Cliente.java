package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Cliente
 * @author Sisa
 *
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "SEQ_COMUN", allocationSize = 1, name = "CUST_SEQ")
	@Column(name = "cliente_id")	
	private int clienteId;
	
	@Column(name = "cliente_nombre")
	private String clienteNombre;

	// GETTERS Y SETTERS *******
	/**
	 * @return the clienteId
	 */
	public int getClienteId() {
		return clienteId;
	}

	/**
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * @return the clienteNombre
	 */
	public String getClienteNombre() {
		return clienteNombre;
	}

	/**
	 * @param clienteNombre the clienteNombre to set
	 */
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	
}
