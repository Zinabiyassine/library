package org.sid.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.dao.IAdherentDao;
import org.sid.dao.IlivreDao;
import org.sid.entities.Adherent;
import org.sid.entities.Livre;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdherentDao implements IAdherentDao {
	IlivreDao livre;
	@PersistenceContext
	protected EntityManager em;
	
	@Transactional
	public Adherent addAdherent(Adherent obj) {
		if(NotExiste(obj.getEmail())){
			em.persist(obj);
			return this.getAdherentByEmail(obj.getEmail());
		}
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
		return (Adherent) q.getSingleResult();
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
		return (List<Adherent>)query.getResultList();
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



	@Override
	public void addFavoris(Livre l,long adherent) {
			if(this.getAdherentById(adherent)!=null&& l!=null){
				this.getAdherentById(adherent).getFavoris().add(l);
			}
		
	}



	@Override
	public List<Livre> getFavoris(long adherent) {
		// TODO Auto-generated method stub
		return this.getAdherentById(adherent).getFavoris();
	}



	@Override
	public void deleteFavoris(long adherent, long isbn) {
		if(this.getAdherentById(adherent)!=null){
			if(livre.getLivreById(isbn)!=null){
				if(this.getAdherentById(adherent).getFavoris().contains(livre.getLivreById(isbn))){
					this.getAdherentById(adherent).getFavoris().remove(livre.getLivreById(isbn));
				}
			}
			
		}
		
	}

}
