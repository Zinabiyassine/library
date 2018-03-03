package org.sid.metier.Impl;


import java.util.Date;
import java.util.List;

import org.sid.dao.IHistoriqueDao;
import org.sid.dao.IReservationDao;
import org.sid.entities.Adherent;
import org.sid.entities.Historique;
import org.sid.entities.Keyclass;
import org.sid.entities.Reservation;
import org.sid.metier.IReservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ReservationMetierImpl implements IReservationMetier {
	@Autowired
	public IReservationDao dao;
	@Autowired
	public IHistoriqueDao daoh;
	
	@Transactional
	public void addReservation(Reservation r) {
		dao.addReservation(r);
		
	}
	@Transactional
	public void deleteReservation(Keyclass id) {
		Reservation s=dao.getReservationById(id);
		Historique h=new Historique(s.getKey().getIdLivre(), s.getKey().getIdAdherent(), s.getDateReservation(),new Date());   
		daoh.add(h);
		dao.deleteReservation(id);
		
	}
	@Transactional
	public Reservation updateRerservation(Reservation r) {
		
		return dao.updateRerservation(r);
	}
	@Transactional
	public List<Reservation> getAll() {
		
		return dao.getAll();
	}
	
	@Transactional
	public List<Reservation> getAll(long a) {
		
		return dao.getAll(a);
	}
	@Transactional
	public Reservation getReservationById(Keyclass id) {
		
		return dao.getReservationById(id);
	}
	@Override
	public List<Reservation> getRetardByAdherent(long id) {
		// TODO Auto-generated method stub
		return dao.getRetardByAdherent(id);
	}
	@Override
	public void updateRese(Reservation res) {
		dao.updateRese(res);
	}

}
