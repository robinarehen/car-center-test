package com.asesoftware.carcentertest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TIPOS_ESTADO", uniqueConstraints = @UniqueConstraint(columnNames = { "nombreTabla", "nombre" }))
public class TipoEstado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoEstado;
	@Column(nullable = false, length = 50)
	private String nombreTabla;
	@Column(nullable = false, length = 50)
	private String nombre;
	private String descripcion;

	public TipoEstado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoEstado(String nombreTabla, String nombre) {
		super();
		this.nombreTabla = nombreTabla;
		this.nombre = nombre;
	}

	public Integer getIdTipoEstado() {
		return idTipoEstado;
	}

	public void setIdTipoEstado(Integer idTipoEstado) {
		this.idTipoEstado = idTipoEstado;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
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
