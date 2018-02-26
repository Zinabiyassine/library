package org.sid.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.dao.IAdherentDao;
import org.sid.entities.Adherent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdherentDao implements IAdherentDao {

	@PersistenceContext
	protected EntityManager em;
	@Transactional
	public Adherent addAdherent(Adherent obj) {
		if (obj != null ) {
			em.persist(obj);
			return obj;
		/*	if (!this.NotExiste(obj.getEmail())) {
				return this.getAdherentByEmail(obj.getEmail());
			}
			return null;*/
		} else
			return null;
	}



	@Transactional
	public void deleteAdherent(Long idobj) {
		Adherent a = this.getAdherentById(idobj);
		if (a != null) {
			 em.remove(a);
			
		
			
		}
	}
@Transactional
	public Adherent updateAdherent(Adherent obj) {
		Adherent a = this.getAdherentById(obj.getId());
		if (a != null) {
			return em.merge(obj);
		}
		return obj;
	}
@Transactional
	public Adherent getAdherentById(Long idObj) {
		Adherent a = em.find(Adherent.class, idObj);
		if (a != null) {
			return a;
		}
		return null;
	}
@Transactional
	public Adherent getAdherentByEmail(String idObj) {
	try {
		Query q = em.createQuery("select a from Adherent a where a.email=:x");
		q.setParameter("x", idObj);
		Adherent a = (Adherent) q.getSingleResult();
		
			return a;
		}
	catch (NoResultException nre){
		return null;
	}
	}
@Transactional
	public void DeleteAll() {
		List<Adherent> adherents = this.getAll();
	 for(Adherent a:adherents){
		 this.deleteAdherent(a.getId());
		 }
	}
@Transactional
	public boolean NotExiste(String email) {
		Query q = em.createQuery("select a from Adherent a where a.email=:x");
		q.setParameter("x", email);

		if (q.getResultList().isEmpty()) {
			return true;
		} else
			return false;
	}
@Transactional
	public List<Adherent> getAll() {
		Query query = em.createQuery("select a from Adherent as a");
		return query.getResultList();
	}

	public String PathPhoto(Long id) {

		return null;
	}
	@Transactional
	public List<Adherent> getAll(boolean s) {
		Query query = em.createQuery("select a from Adherent as a where a.statut=:x");
		query.setParameter("x", s);
		return query.getResultList();
	}
	public void flushclear() {
		em.flush();
		em.clear();
	}

}
