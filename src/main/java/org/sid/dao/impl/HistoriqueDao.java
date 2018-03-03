package org.sid.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.dao.IHistoriqueDao;
import org.sid.entities.Historique;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class HistoriqueDao implements IHistoriqueDao {
	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public List<Historique> getall() {
		Query query = em.createQuery("select l from Historique as l");
		return(List<Historique>)query.getResultList();
	}
	@Transactional
	public List<Historique> getall(long id) {
		Query query = em.createQuery("select l from Historique as l where idadherent="+id);
		return(List<Historique>)query.getResultList();
	}
	@Override
	public void add(Historique h) {
		em.persist(h);
	}
	
	
	
}
