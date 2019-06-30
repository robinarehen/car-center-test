package com.asesoftware.carcentertest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.carcentertest.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer>{

}
