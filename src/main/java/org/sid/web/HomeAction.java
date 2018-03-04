package org.sid.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.sid.entities.Adherent;
import org.sid.entities.Agent;
import org.sid.entities.Historique;
import org.sid.entities.Keyclass;
import org.sid.entities.Livre;
import org.sid.entities.Reservation;
import org.sid.metier.IAdherentMetier;
import org.sid.metier.IAgentMetier;
import org.sid.metier.IHistoriqueMetier;
import org.sid.metier.ILivreMetier;
import org.sid.metier.IReservationMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	IReservationMetier iReservationMetier = (IReservationMetier) ctx
			.getBean("reservationMetierImpl");
	IAdherentMetier iadherentMetier = (IAdherentMetier) ctx
			.getBean("adherentMetierImpl");
	ILivreMetier iLivreMetier = (ILivreMetier) ctx.getBean("livreMetierImpl");
	
	IAgentMetier iAgentMetier = (IAgentMetier) ctx.getBean("agentMetierImpl");

	IHistoriqueMetier ihistoryMetier = (IHistoriqueMetier) ctx.getBean("historiqueMetierImpl");
	public long keyL;
	public Long keyA;
	public Keyclass k;
	// SESSION
	private Map<String, Object> session;

	// table
	public List<Livre> allLivre;
	public List<Adherent> allAdherent;
	public List<Reservation> allReservation;
	public List<Reservation> allReservationAdherent;

	public List<Historique> allhitory;
	public List<Historique> allhitoryAdherent;
	public List<Reservation> allRetard;

	// les 10 derniers
	public List<Livre> currentLivre;
	public List<Adherent> derniersAdherent;
	public List<Livre> derniersReservation;

	// authentification adherent
	public String nom;
	public String prenom;
	public Date naissance,create,finAbonnement;
	public String email;
	public String password;
	public String telephone,adresse;
	public String photo;
	public String sexe;

	// addreservation
	public long codeadherent;
	public long isbn;
	public int index;
	// add Livre

	public String titre, auteur, categorie, description, motcles;
	public Date dateedition;
	public String langue;
	// Entity
	public Adherent adherent;
	public Livre livre;
	// state
	public float prcentReservation;
	public float tauxReservation;
	public float prcentAdherent;
	public int tauxRetardAdherent;
	public int tauxRetardLivre;
	public float adherentActive;
	public int retard;
	public int allAdherents, allLivres;
	public int reservations,history;
	public String pagetitle;
	public boolean logged;
	public String message_r = "", message_s = "";
	public long adherentid;
	public int indexAdherent = 0;
	public int retardAgent;
	public String nomComplet;

	public String login() {
		if(session.containsKey("logged")&&(boolean)this.session.get("logged")){
			return "index";
		}else{
		Adherent t = iadherentMetier.getAdherentByEmail(email);
		if(t!=null){
			if(t.getEmail().equals(email)&&t.getMdp().equals(password)){
		session.put("id", t.getId());
		session.put("email", email);
		session.put("logged", true);
		session.put("statut", 2);
		session.put("index", "");
		session.put("name", t.getNom()+"."+t.getPrenom().toUpperCase().charAt(1));
		session.put("path",t.getPhoto());
		return SUCCESS;
			}else return "auth";
		}else{
				Agent a=iAgentMetier.getAgentByEmail(email);
				if(a!=null){
					if(a.getEmail().equals(email)&&a.getMdp().equals(password)){
						System.out.println(a);
						session.put("id", a.getId());
						session.put("email", email);
						session.put("logged", true);
						session.put("statut", 1);
						session.put("index", "");
						session.put("name", a.getNom()+"."+a.getPrenom().toUpperCase().charAt(1));
						session.put("path",a.getPhoto());
						return SUCCESS;
					}else return "auth";
				}else return "auth";
			}
	
		}
	}

	public String index() {
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			this.allAdherent = iadherentMetier.getAll();
			this.allLivre = iLivreMetier.getAll();
			this.allLivres = this.allLivre.size();
			this.allReservation = this.iReservationMetier.getAll();
			this.allReservationAdherent = this.iReservationMetier
					.getAll((long) this.session.get("id"));
			this.allAdherents = this.allAdherent.size();
			this.prcentAdherent = 23;
			this.prcentAdherent = 23;
			this.tauxRetardLivre = 23;
			this.tauxRetardAdherent = 0;
			this.reservations = this.allReservation.size();

			this.pagetitle = "accueil";
			this.allhitory = ihistoryMetier.getall();
			this.allhitoryAdherent = ihistoryMetier.getall((long) session
					.get("id"));
			this.allRetard = iReservationMetier
					.getRetardByAdherent((long) session.get("id"));
			this.retard = this.allRetard.size();
			if (this.reservations > 0 && this.retard > 0
					&& this.iadherentMetier.getAll().size() > 0) {
				this.tauxReservation = (this.allLivres * 100 / this.reservations);
				this.adherentActive = (this.iadherentMetier.getAll(true).size() * 100 / this.iadherentMetier
						.getAll().size());
				this.tauxRetardAdherent = this.allReservationAdherent.size()
						* 100 / this.retard;

			}
			return SUCCESS;
		} else
			return "redirect";

	}

	public String deleteReservation() {
		k = new Keyclass(keyA, keyL);
		iReservationMetier.deleteReservation(k);
		return SUCCESS;
	}

	public String prolonger() {

		Calendar cal = Calendar.getInstance();

		k = new Keyclass(keyA, keyL);
		Reservation res = iReservationMetier.getReservationById(k);
		cal.setTime(res.getDateLimite());
		cal.add(Calendar.DATE, 07);
		res.setDateLimite(cal.getTime());
		System.out.println(res.getDateLimite());
		iReservationMetier.updateRese(res);
		System.out.println(iReservationMetier.getReservationById(k)
				.getDateLimite());

		return SUCCESS;
	}

	public String addAdherent() {
		Calendar cal = Calendar.getInstance();
		Calendar call = Calendar.getInstance();

		cal.setTime(new Date());
		this.create=cal.getTime();
		cal.add(Calendar.DATE, 365);
		this.finAbonnement=cal.getTime();
//		call.setTime(this.naissance);
//		this.naissance=call.getTime();
		Adherent a = new Adherent(nom, prenom, adresse, email, password, sexe, telephone, finAbonnement);
		a.setDateInscription(create);
		System.out.println(a);

		if (iadherentMetier.getAdherentByEmail(email) == null&&iAgentMetier.getAgentByEmail(email)==null) {
			iadherentMetier.addAdherent(a);
			System.out.println("inscription");

			return SUCCESS;
		} else
			return ERROR;
	}

	public String reserver() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 90);
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			Livre livre = iLivreMetier.getLivreById(this.isbn);
			if (livre != null) {
				Reservation r = new Reservation();
				r.setDateReservation(new Date());
				r.setDateLimite(cal.getTime());
				Keyclass p = new Keyclass();
				p.setIdLivre(isbn);
				p.setIdAdherent((long) session.get("id"));
				r.setKey(p);
				iReservationMetier.addReservation(r);
				this.message_s = "La reservation a été bien enregistré<br/>Bon lecture!";
				return SUCCESS;
			} else {
				this.message_r = "Votre reservation n'a pas abouti .. veuillez ré-essayer svp!!";
				return ERROR;
			}
		} else {
			return "auth";
		}

	}

	public String addReservation() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 90);
		if (iadherentMetier.getAdherentById((long) codeadherent) != null) {
			if (iLivreMetier.getLivreById(isbn) != null) {
				Reservation r = new Reservation();
				r.setDateReservation(new Date());
				r.setDateLimite(cal.getTime());
				Keyclass p = new Keyclass();

				p.setIdLivre(isbn);
				p.setIdAdherent((long) codeadherent);
				r.setKey(p);
				iReservationMetier.addReservation(r);
				return SUCCESS;
			}
			return ERROR;
		}

		else
			return ERROR;
	}

	public String livreInfo() {
		session.remove("index");
		session.put("index", index);
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			return SUCCESS;
		} else
			return "auth";
	}

	public String adherentInfo() {
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			this.indexAdherent = this.allAdherent.indexOf(this.iadherentMetier
					.getAdherentById(this.adherentid));
			System.out.println(this.iadherentMetier
					.getAdherentById(this.adherentid));
			return SUCCESS;
		}

		return "auth";
	}

	public String livres() {
		this.currentLivre = new ArrayList<Livre>();
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			this.allLivre = iLivreMetier.getAll();
			this.pagetitle = "livres";

			return SUCCESS;
		} else
			return "auth";
	}

	public String favory() {
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			iadherentMetier.addFavoris(iLivreMetier.getLivreById(isbn),
					(long) session.get("id"));
			return SUCCESS;
		} else
			return ERROR;

	}

	public String addlivre() {
		if (session.containsKey("logged") && (boolean) session.get("logged")
				&& (int) session.get("statut") == 1) {
			this.iLivreMetier.addLivre(new Livre(titre, auteur, categorie,
					true, motcles, description, langue));
			return SUCCESS;
		}
		return "auth";
	}

	public String deletelivre() {
		if (session.containsKey("logged") && (boolean) session.get("logged")
				&& (int) session.get("statut") == 1) {

			if (this.iLivreMetier.getLivreById(this.isbn) != null) {
				this.iLivreMetier.deleteLivre(this.isbn);
				return SUCCESS;
			} else {
				return "error";
			}
		}

		return "auth";
	}

	public String profil() {
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			this.pagetitle = "profil";
			if((int)this.session.get("statut")==1){
				System.out.println("id agent"+(long)this.session.get("id"));
				Agent agent=iAgentMetier.getAgentById((long)this.session.get("id"));
				this.sexe=agent.getSexe();	
				this.email=agent.getEmail();
				this.nom=agent.getNom();	this.prenom=agent.getPrenom();
				this.adresse=agent.getAdresse();	
				this.telephone=agent.getTelephone();
				this.password=agent.getMdp();
				this.photo=agent.getPhoto();

			}else{
				Adherent a= iadherentMetier.getAdherentById((long)this.session.get("id"));
				this.sexe=a.getSexe();	this.email=a.getEmail();
				this.nom=a.getNom();	this.prenom=a.getPrenom();
				this.adresse=a.getAdresse();	
				this.telephone=a.getTelephone();
				this.photo=a.getPhoto();
				this.create=a.getDateInscription();
				this.finAbonnement=a.getFinAbonnement();
				this.password=a.getMdp();
				this.retard=iReservationMetier.getRetardByAdherent((long)this.session.get("id")).size();
				this.reservations= iReservationMetier.getAll((long)this.session.get("id")).size();
				this.history=ihistoryMetier.getall((long)this.session.get("id")).size();
			}
			return SUCCESS;
		}else
		return "auth";
	}
	
	public String updateProfil(){
		if (session.containsKey("logged") && (boolean) session.get("logged")) {
			long id= (long)this.session.get("id");
			if((int)session.get("statut")==1){
				Agent a = iAgentMetier.getAgentById(id);
				a.setAdresse(adresse);
				a.setEmail(email);
				a.setMdp(password);
				a.setNom(nom);
				a.setPrenom(prenom);
				a.setSexe(sexe);
				a.setTelephone(telephone);
				session.put("name", a.getNom()+"."+a.getPrenom().toUpperCase().charAt(1));
				iAgentMetier.updateAgent(a);
				if(!photo.equals("")){
					a.setPhoto(photo);
				}
			}else{
				Adherent a = iadherentMetier.getAdherentById(id);
				a.setAdresse(adresse);
				a.setEmail(email);
				a.setMdp(password);
				a.setNom(nom);
				a.setPrenom(prenom);
				session.put("name", a.getNom()+"."+a.getPrenom().toUpperCase().charAt(1));
				session.put("path",a.getPhoto());
				iadherentMetier.updateAdherent(a);
				if(!photo.equals("")){
					a.setPhoto(photo);
				}
			}
			return SUCCESS;
		}else
		return "auth";
	}

	public String logout() {
		this.session.clear();
		return SUCCESS;
	}
	
	public String adherents(){
		if (session.containsKey("logged") && (boolean) session.get("logged")&&(int)session.get("statut")==1){
				this.allAdherent = iadherentMetier.getAll();
				this.pagetitle="adherents";
				return SUCCESS;
			}else{
				return "auth";
			}
		
	}
	
	public String deleteAdherent(){
		if (session.containsKey("logged") && (boolean) session.get("logged")&&(int)session.get("statut")==1){
			try{
			this.iadherentMetier.deleteAdherent(this.codeadherent);
			}catch(Exception e){
				System.out.println(e);
			}
			if(this.iadherentMetier.getAdherentById(this.codeadherent)==null){
				return "error";
			}
			else{
				return SUCCESS;
			}
		}
		return "auth";
	}

	// SESSION
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
