package org.sid.metier;


import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.Keyclass;
import org.sid.entities.Reservation;

public interface IReservationMetier {
	
	public void addReservation(Reservation r);
	public void deleteReservation(Keyclass id);
	public Reservation updateRerservation(Reservation r);
	public  List<Reservation> getAll();
	public  Reservation getReservationById(Keyclass id);
	public List<Reservation> getRetardByAdherent(long id);
	public  List<Reservation> getAll(long a);
	public void updateRese(Reservation res);


}

