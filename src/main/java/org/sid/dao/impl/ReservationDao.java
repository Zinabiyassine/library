package org.sid.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.dao.IReservationDao;
import org.sid.entities.Adherent;
import org.sid.entities.Keyclass;
import org.sid.entities.Livre;
import org.sid.entities.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReservationDao implements IReservationDao {
	@PersistenceContext
	protected EntityManager em;
	
	@Transactional
	public void addReservation(Reservation obj) {
		if (obj != null && true == this.NotExiste(obj.getKey())) {
			em.persist(obj);
			
	}
	}
	@Transactional
	public void deleteReservation(Keyclass id) {
		Reservation r = this.getReservationById(id);
		System.out.println(r);
		if (r != null) {
			 em.remove(r);
		}
			
		}
		
	
	@Transactional
	public Reservation updateRerservation(Reservation r) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Reservation> getAll() {
		
		return em.createQuery("select r from Reservation as r").getResultList();
	}
	@Transactional

	public List<Reservation> getAll(long id) {
		
		return em.createQuery("select r from Reservation as r where adherent="+id).getResultList();
	}
	@Transactional
	public boolean NotExiste(Keyclass k) {
		Query q = em.createQuery("select a from Reservation a where a.key=:x");
		q.setParameter("x",k);

		if (q.getResultList().isEmpty()) {
			return true;
		} else
			return false;
	}
	
	public Reservation getReservationById(Keyclass id) {
		Reservation r = em.find(Reservation.class, id);
		
		if (r != null) {
			return r;
		}
		return null;
		
	}
	@Override
	public List<Reservation> getRetardByAdherent(long id) {
		return em.createQuery("select r from Reservation as r where dateLimite<CURDATE() and fk_adherent="+id).getResultList();

	}
	@Transactional
	public void updateRese(Reservation res) {
		System.out.println("dao class "+res);
			em.merge(res);
	}
	

}
