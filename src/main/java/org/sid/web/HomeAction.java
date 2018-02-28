package org.sid.web;

import java.sql.Date;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.sid.entities.Adherent;
import org.sid.entities.Keyclass;
import org.sid.entities.Livre;
import org.sid.entities.Reservation;
import org.sid.metier.IAdherentMetier;
import org.sid.metier.ILivreMetier;
import org.sid.metier.IReservationMetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	IReservationMetier iReservationMetier=(IReservationMetier) ctx.getBean("reservationMetierImpl");
	IAdherentMetier iadherentMetier = (IAdherentMetier) ctx.getBean("adherentMetierImpl");
	ILivreMetier iLivreMetier=(ILivreMetier) ctx.getBean("livreMetierImpl");

	public long keyL;
	public Long keyA;
	public Keyclass k;
	//livre
	public long isbn;
	
	
	
	//SESSION
	private Map<String, Object> session;
	
	
	
	//table
	public List<Livre> allLivre;
	public List<Adherent> allAdherent;
	public List<Reservation> allReservation;
	
	//les 10 derniers
	public List<Livre> derniersLivre;
	public List<Adherent> derniersAdherent;
	public List<Livre> derniersReservation;
	
	
	//authentification adherent
	public String nom;
	public String prenom;
	public Date naissance;
	public String email;
	public String password;
	public String telephone;
	public String photo;
	public String sexe;
	
	
	
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
	public boolean logged;

	public String login() {
		Adherent t=iadherentMetier.getAdherentByEmail(email);
		
		session.put("id", t.getId());
		session.put("email", email);
		session.put("logged",true);
		System.out.println("YASSINE"+session);
		return SUCCESS;
	}
	public String index(){
		System.out.println(session.get("logged"));
		System.out.println(session);
		if(session.containsKey("logged")&& session.get("logged").toString()=="true") {
		System.out.println("hada test diali"+(long)session.get("id"));
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
		else return "redirect";
		
	}
	public String deleteReservation() {
		k=new Keyclass(keyA, keyL);
		iReservationMetier.deleteReservation(k);
		return SUCCESS;
	}
	
	public String retard(){
		this.pagetitle="retard";
		return SUCCESS;
	}
	public String addAdherent() {
		Adherent a=new Adherent(email, nom, prenom, null, password, sexe, telephone, photo,true);
		a.setDateInscription(new java.util.Date());
	if(iadherentMetier.getAdherentByEmail(email)==null) {
		iadherentMetier.addAdherent(a);
		return SUCCESS;}
	else return ERROR;
	}

	public String addReservation() {
		if(session.get("id")!=null) {
		Reservation r=new Reservation();
		Keyclass p=new Keyclass();
		p.setIdLivre(isbn);
		
		p.setIdAdherent((long)session.get("id"));
		
		r.setKey(p);
		iReservationMetier.addReservation(r);
		return SUCCESS;
		}
		else return ERROR;
		
		
		
		
	}
	
	//SESSION
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}

	

	
	
	
	
}
