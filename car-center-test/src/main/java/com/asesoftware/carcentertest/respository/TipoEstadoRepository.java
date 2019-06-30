package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.TipoEstado;

public interface TipoEstadoRepository extends JpaRepository<TipoEstado, Integer> {

	TipoEstado findByNombreTablaAndNombre(String nombreTabla, String nombre);
}
