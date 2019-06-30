package com.asesoftware.carcentertest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.TipoGenero;
import com.asesoftware.carcentertest.respository.TipoGeneroRepository;

@Service
@Transactional(readOnly = true)
public class TipoGeneroService {

	private TipoGeneroRepository repository;

	public TipoGeneroService(TipoGeneroRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<TipoGenero> getFindAll(){
		return this.repository.findAll();
	}
}
