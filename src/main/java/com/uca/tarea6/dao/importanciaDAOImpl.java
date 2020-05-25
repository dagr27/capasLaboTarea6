package com.uca.tarea6.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.tarea6.domain.importancia;

@Repository
public class importanciaDAOImpl implements importanciaDAO {
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<importancia> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.importancia");
		Query query = entityManager.createNativeQuery(sb.toString(), importancia.class);
		List<importancia> resultset= query.getResultList();
		
		return resultset;
	}

	@Override
	public importancia findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		importancia element = entityManager.find(importancia.class, id);
		return element;
	}
	
}
