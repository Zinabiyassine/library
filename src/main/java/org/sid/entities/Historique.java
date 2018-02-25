package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Historique  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idhistorique;
	private Long idlivre;
	private Long idadherent;
	private Date dateReservation;
	private Date dateLimite;
	public Historique(Long idlivre, Long idadherent, Date dateReservation, Date dateLimite) {
		super();
		this.idlivre = idlivre;
		this.idadherent = idadherent;
		this.dateReservation = dateReservation;
		this.dateLimite = dateLimite;
	}
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdlivre() {
		return idlivre;
	}
	public void setIdlivre(Long idlivre) {
		this.idlivre = idlivre;
	}
	public Long getIdadherent() {
		return idadherent;
	}
	public void setIdadherent(Long idadherent) {
		this.idadherent = idadherent;
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
