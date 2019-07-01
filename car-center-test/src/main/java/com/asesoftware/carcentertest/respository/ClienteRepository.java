package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.Cliente;
import com.asesoftware.carcentertest.model.DatosPersona;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Cliente findByDatosPersona(DatosPersona datosPersona);
}
