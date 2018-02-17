package com.byteslounge.spring.tx.user.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byteslounge.spring.tx.dao.IHistoriqueDao;
import com.byteslounge.spring.tx.dao.IReservationDao;
import com.byteslounge.spring.tx.model.Historique;
import com.byteslounge.spring.tx.model.Keyclass;
import com.byteslounge.spring.tx.model.Reservation;

import com.byteslounge.spring.tx.user.IReservationMetier;
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
		Historique h=new Historique(s.getKey().getIdLivre(), s.getKey().getIdAdherent(), s.getDateReservation(),s.getDateLimite());   
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
	public Reservation getReservationById(Keyclass id) {
		
		return dao.getReservationById(id);
	}

}
