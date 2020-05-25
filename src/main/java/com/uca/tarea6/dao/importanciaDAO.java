package com.uca.tarea6.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.tarea6.domain.importancia;

public interface importanciaDAO {
	public List<importancia> findAll() throws DataAccessException;
	
	public importancia findOne(Integer id) throws DataAccessException;
}
