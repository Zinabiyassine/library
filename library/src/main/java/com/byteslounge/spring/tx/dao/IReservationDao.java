package com.byteslounge.spring.tx.dao;

import java.util.List;

import com.byteslounge.spring.tx.model.Keyclass;
import com.byteslounge.spring.tx.model.Reservation;

public interface IReservationDao {
	public void addReservation(Reservation r);
	public void deleteReservation(Keyclass id);
	public Reservation updateRerservation(Reservation r);
	public  List<Reservation> getAll();
	public  Reservation getReservationById(Keyclass id);

}
