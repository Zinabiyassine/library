package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "Reservation" )
public class Reservation  implements Serializable {
	@EmbeddedId
	private Keyclass key;
	@ManyToOne
	@JoinColumn(name ="fk_Livre", insertable = false, updatable = false)
	private Livre livre;
	@ManyToOne
	@JoinColumn(name ="fk_Adherent", insertable = false, updatable = false)
	private Adherent adherent;
	
	private Date dateReservation;
	private Date dateLimite;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	

	@Override
	public String toString() {
		return "Reservation [key=" + key + ", livre=" + livre + ", adherent=" + adherent + ", dateReservation="
				+ dateReservation + ", dateLimite=" + dateLimite + "]";
	}


	public Reservation(Keyclass key, Date dateReservation, Date dateLimite) {
		super();
		this.key = key;
		this.dateReservation = dateReservation;
		this.dateLimite = dateLimite;
	}


	public Keyclass getKey() {
		return key;
	}

	public void setKey(Keyclass key) {
		this.key = key;
	}

	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Date getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}
	
	
	
	
	
}
