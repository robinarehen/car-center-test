package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
