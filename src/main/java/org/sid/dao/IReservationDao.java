package org.sid.dao;

import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.Keyclass;
import org.sid.entities.Reservation;

public interface IReservationDao {
	public void addReservation(Reservation r);
	public void deleteReservation(Keyclass id);
	public Reservation updateRerservation(Reservation r);
	public  List<Reservation> getAll();
	public  List<Reservation> getAll(long a);
	public  Reservation getReservationById(Keyclass id);
	public List<Reservation> getRetardByAdherent(long id);
	public void updateRese(Reservation res);

}
