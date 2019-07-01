package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.RolModel;

public interface RolModelRepository extends JpaRepository<RolModel, Integer> {

	RolModel findByNombre(String nombre);
}
