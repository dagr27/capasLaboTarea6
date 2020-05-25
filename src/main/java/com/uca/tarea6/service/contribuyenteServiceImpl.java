package com.uca.tarea6.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.tarea6.dao.contribuyenteDAO;
import com.uca.tarea6.domain.contribuyente;

@Service
public class contribuyenteServiceImpl implements contribuyenteService {
	@Autowired
	private contribuyenteDAO contribuyenteDAO;
	
	@Override
	public List<contribuyente> findAll() throws DataAccessException {
		return contribuyenteDAO.findAll();
	}

	@Override
	@Transactional
	public void save(contribuyente contribuyente) throws DataAccessException {
		contribuyenteDAO.insert(contribuyente);
	}
}
