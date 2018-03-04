package org.sid.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom, prenom, adresse, email, mdp, sexe, telephone;
	private Date dateNaissance;
	private String photo;
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(String nom, String prenom, String adresse, String email, String mdp, String sexe, String telephone,
			Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.mdp = mdp;
		this.sexe = sexe;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.photo="assets/img/faces/abdo.png";
	}

	public long getId() {
		return id;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email=" + email
				+ ", mdp=" + mdp + ", sexe=" + sexe + ", telephone=" + telephone + ", dateNaissance=" + dateNaissance
				+ "]";
	}
	
}
