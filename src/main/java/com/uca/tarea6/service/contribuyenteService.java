package com.uca.tarea6.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.tarea6.domain.contribuyente;

public interface contribuyenteService {
	public List<contribuyente> findAll() throws DataAccessException;
	
	public void save(contribuyente contribuyente) throws DataAccessException;
}
