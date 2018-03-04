package org.sid.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity

public class Adherent implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String email;
	private String nom, prenom, adresse, mdp, sexe, telephone,photo;
	private Date dateInscription;
	private boolean statut;
	//@OneToMany(mappedBy = "adherent", cascade = CascadeType.ALL)
	//private List<Reservation> reservation;
	
	@OneToMany
	@JoinTable(name="favoris" )
	private List<Livre> favoris;
	//@OneToMany
	//@Where(clause="dateRestitutionReel<>null")
	//private List<Reservation> historique;
	//@OneToMany
	//@Where(clause="retard=true")
	//private List<Reservation> retards;*/
	private Date finAbonnement;
		
	public Adherent(String email, String nom, String prenom, String adresse, String mdp, String sexe, String telephone,
			String photo,Boolean statut) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mdp = mdp;
		this.sexe = sexe;
		this.telephone = telephone;
		this.photo = "assets/img/faces/abdo.png";
		this.statut=true;
	}

	public Adherent(String nom, String prenom, String adresse, String email,
			String mdp, String sexe, String telephone,
			Date finAbonnement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.mdp = mdp;
		this.sexe = sexe;
		this.telephone = telephone;
		this.finAbonnement = finAbonnement;
		this.dateInscription=new Date();
		this.statut=true;
		this.favoris=new ArrayList<Livre>();
		this.photo = "assets/img/faces/abdo.png";

//		this.historique=new ArrayList<Reservation>();
		
	}

	public List<Livre> getFavoris() {
		return favoris;
	}

	public void setFavoris(List<Livre> favoris) {
		this.favoris = favoris;
	}

	public Adherent() {
		super();
		this.statut=true;
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	

	public Date getFinAbonnement() {
		return finAbonnement;
	}

	public void setFinAbonnement(Date finAbonnement) {
		this.finAbonnement = finAbonnement;
	}

	

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", email=" + email + ", mdp=" + mdp + ", sexe="
				+ sexe + ", telephone=" + telephone + ", dateInscription="
				+ dateInscription
				+ ", statut=" + statut + ", finAbonnement=" + finAbonnement
				+  "]";
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
}