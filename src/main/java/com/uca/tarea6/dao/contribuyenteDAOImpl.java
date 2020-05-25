package com.uca.tarea6.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.tarea6.domain.contribuyente;

@Repository
public class contribuyenteDAOImpl implements contribuyenteDAO {
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<contribuyente> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.contribuyente");
		Query query = entityManager.createNativeQuery(sb.toString(),contribuyente.class);
		List<contribuyente> resultset= query.getResultList();
		return resultset;
		
	}

	@Override
	@Transactional
	public void insert(contribuyente contribuyente) throws DataAccessException {
		entityManager.persist(contribuyente);
		
	}
}
