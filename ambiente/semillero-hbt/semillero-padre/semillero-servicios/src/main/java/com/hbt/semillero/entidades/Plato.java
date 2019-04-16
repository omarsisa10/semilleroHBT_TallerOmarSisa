package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Plato
 * @author Sisa
 *
 */
@Entity
@Table(name = "PLATO")
public class Plato {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name = "plato_id")
private int platoId;

@Column(name = "plato_nombre")
private String platoNombre;

@Column(name = "precio")
private  int precio;

@Column(name = "plato_descripcion")
private String platoDescripcion;


// GETTERS Y SETTERS ********************
public int getPlatoId() {
	return platoId;
}

public void setPlatoId(int platoId) {
	this.platoId = platoId;
}

public String getPlatoNombre() {
	return platoNombre;
}

public void setPlatoNombre(String platoNombre) {
	this.platoNombre = platoNombre;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public String getPlatoDescripcion() {
	return platoDescripcion;
}

public void setPlatoDescripcion(String platoDescripcion) {
	this.platoDescripcion = platoDescripcion;
}


}
