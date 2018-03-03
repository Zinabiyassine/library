package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Livre implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long isbn;
	private String titre, auteur, categorie, langue, description, motcle;

	private boolean disponibilite;
	public Livre(String titre, String auteur, String categorie, 
			boolean disponibilite,String motcle,String description,String langue) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.langue = langue;
		this.description = description;
		this.motcle = motcle;
		this.disponibilite = disponibilite;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMotcle() {
		return motcle;
	}
	public void setMotcle(String motcle) {
		this.motcle = motcle;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public long getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", categorie="
				+ categorie + ", langue=" + langue
				+ ", description=" + description + ", motcle=" + motcle
				+ ", disponibilite=" + disponibilite + "]";
	}
	
	
}
