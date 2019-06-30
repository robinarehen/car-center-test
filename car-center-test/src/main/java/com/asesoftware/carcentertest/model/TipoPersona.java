package com.asesoftware.carcentertest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOS_PERSONA")
public class TipoPersona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoPersona;
	@Column(unique = true, nullable = false, length = 50)
	private String nombre;
	private String descripcion;

	public TipoPersona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdTipoPersona() {
		return idTipoPersona;
	}

	public void setIdTipoPersona(Integer idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
