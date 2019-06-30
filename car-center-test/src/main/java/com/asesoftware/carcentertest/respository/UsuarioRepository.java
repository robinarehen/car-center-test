package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
