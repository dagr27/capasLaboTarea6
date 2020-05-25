package com.uca.tarea6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.tarea6.dao.importanciaDAO;
import com.uca.tarea6.domain.importancia;

@Service
public class importanciaServiceImpl implements importanciaService {
	@Autowired
	private importanciaDAO importanciaDao;
	
	@Override
	public List<importancia> findAll() throws DataAccessException {
		return importanciaDao.findAll();
	}

	@Override
	public importancia findOne(Integer id) throws DataAccessException {
		return importanciaDao.findOne(id);
	}

}
