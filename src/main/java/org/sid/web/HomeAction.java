package org.sid.web;

import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.Keyclass;
import org.sid.entities.Livre;
import org.sid.entities.Reservation;
import org.sid.metier.IAdherentMetier;
import org.sid.metier.ILivreMetier;
import org.sid.metier.IReservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	IReservationMetier iReservationMetier=(IReservationMetier) ctx.getBean("reservationMetierImpl");
	IAdherentMetier iadherentMetier = (IAdherentMetier) ctx.getBean("adherentMetierImpl");
	ILivreMetier iLivreMetier=(ILivreMetier) ctx.getBean("livreMetierImpl");

	public long keyL;
	public Long keyA;
	
	public Keyclass k;
	//table
	public List<Livre> allLivre;
	public List<Adherent> allAdherent;
	public List<Reservation> allReservation;
	
	//les 10 derniers
	public List<Livre> derniersLivre;
	public List<Adherent> derniersAdherent;
	public List<Livre> derniersReservation;
	
	
	//state 
	public float prcentReservation;
	public int tauxReservation;
	public float prcentAdherent;
	public int tauxRetardAdherent;
	public int tauxRetardLivre;
	public float adherentActive;
	public int retard;
	public int allAdherents,allLivres;
	public int reservations;
	public String pagetitle;

	
	public String index(){
		this.allAdherent=iadherentMetier.getAll();
		this.allLivre=iLivreMetier.getAll();
		this.allLivres=this.allLivre.size();
		this.allReservation=this.iReservationMetier.getAll();
		this.allAdherents=this.allAdherent.size();
		this.retard=12;
		this.prcentAdherent=23;
		this.tauxReservation=23;
		this.prcentAdherent=23;
		this.tauxRetardLivre=23;
		this.tauxRetardAdherent=0;
		this.reservations=this.allReservation.size();
		this.pagetitle="accueil";
		return SUCCESS;
		
		
	}
	public String deleteReservation() {
		k=new Keyclass(keyA, keyL);
		iReservationMetier.deleteReservation(k);
		System.out.println("DAZT!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(k);
		System.out.println(keyA);
		System.out.println(keyL);
		return SUCCESS;
	}
	public String addReservation() {
		return null;
	}
	
	
	public String retard(){
		this.pagetitle="retard";
		return SUCCESS;
	}


	

	
	
	
	
}
