package org.sid.web;

import java.util.Date;
import java.util.List;

import org.sid.entities.Adherent;
import org.sid.metier.IAdherentMetier;
import org.sid.metier.ILivreMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class AdherentAction extends ActionSupport {
	@Autowired
	public  IAdherentMetier adherent;
	@Autowired
	public  ILivreMetier livre;
	public Long id;
	public String nom,prenom,mdp,email,adresse,photo;
	public List<Adherent> adherents;
	public int nb_user;
	public float pourcentage;
	public int nb_livre;
	public String pagetitle;
	public boolean active;
	
	public String index(){
		this.pagetitle="Les adherents";
		return SUCCESS;
	}
	public String delete(){
		adherent.deleteAdherent(this.id);
		this.adherents = adherent.getAll(true);
		return "redirect";
	}
	
	public String profil(){
		this.pagetitle="profil";
		return SUCCESS;
	}
	public String save(){
		Adherent a = new Adherent();
		a.setAdresse(adresse);
		a.setEmail(email);
		a.setNom(nom);
		a.setPrenom(prenom);
		a.setMdp(mdp);
		a.setDateInscription(new Date());
		a.setDateNaissance(new Date());
		a.setSexe("");
		System.out.println(a);
		adherent.addAdherent(a);
				
		return SUCCESS;
	}
	
	public String adherents(){
		this.pagetitle="adherents";
		this.adherents=this.adherent.getAll();
		return SUCCESS;
		
	}
}

