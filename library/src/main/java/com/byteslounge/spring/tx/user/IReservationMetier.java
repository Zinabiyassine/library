package com.byteslounge.spring.tx.user;


import java.util.List;

import com.byteslounge.spring.tx.model.Keyclass;
import com.byteslounge.spring.tx.model.Reservation;

public interface IReservationMetier {
	
	public void addReservation(Reservation r);
	public void deleteReservation(Keyclass id);
	public Reservation updateRerservation(Reservation r);
	public  List<Reservation> getAll();
	public  Reservation getReservationById(Keyclass id);

}

