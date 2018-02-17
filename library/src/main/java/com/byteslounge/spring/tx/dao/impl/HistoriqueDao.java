package com.byteslounge.spring.tx.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.byteslounge.spring.tx.dao.IHistoriqueDao;
import com.byteslounge.spring.tx.model.Historique;


@Repository
public class HistoriqueDao implements IHistoriqueDao {
	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public List<Historique> getall() {
		Query query = em.createQuery("select l from Historique as l");
		return(List<Historique>)query.getResultList();
	}

	@Override
	public void add(Historique h) {
		em.persist(h);
	}
	
	
	
}
