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
	private String titre, auteur, categorie, theme, langue, description, motcle;
	private boolean disponibilite;
	private Date dateIdition;
	public Livre(String titre, String auteur, String categorie, String theme,
			String langue, String description, String motcle,
			boolean disponibilite, Date dateIdition) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.theme = theme;
		this.langue = langue;
		this.description = description;
		this.motcle = motcle;
		this.disponibilite = disponibilite;
		this.dateIdition = dateIdition;
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
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
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
	public Date getDateIdition() {
		return dateIdition;
	}
	public void setDateIdition(Date dateIdition) {
		this.dateIdition = dateIdition;
	}
	public long getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", categorie="
				+ categorie + ", theme=" + theme + ", langue=" + langue
				+ ", description=" + description + ", motcle=" + motcle
				+ ", disponibilite=" + disponibilite + ", dateIdition="
				+ dateIdition + "]";
	}
	
	
}
