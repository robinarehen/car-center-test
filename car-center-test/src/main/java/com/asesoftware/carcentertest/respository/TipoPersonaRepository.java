package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.TipoPersona;

public interface TipoPersonaRepository extends JpaRepository<TipoPersona, Integer> {

	TipoPersona findByNombre(String nombre);
}
