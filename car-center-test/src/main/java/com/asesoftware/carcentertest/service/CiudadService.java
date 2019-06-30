package com.asesoftware.carcentertest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.Ciudad;
import com.asesoftware.carcentertest.respository.CiudadRepository;

@Service
@Transactional(readOnly = true)
public class CiudadService {

	private CiudadRepository repository;

	public CiudadService(CiudadRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Ciudad> getFindAll(){
		return this.repository.findAll();
	}
}
