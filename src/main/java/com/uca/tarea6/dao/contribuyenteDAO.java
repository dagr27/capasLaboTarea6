package com.uca.tarea6.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.tarea6.domain.contribuyente;

public interface contribuyenteDAO {
	public List<contribuyente> findAll() throws DataAccessException;
	
	public void insert(contribuyente contribuyente) throws DataAccessException;
}
