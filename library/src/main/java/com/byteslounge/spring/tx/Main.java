package com.byteslounge.spring.tx;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byteslounge.spring.tx.model.Adherent;
import com.byteslounge.spring.tx.model.Keyclass;
import com.byteslounge.spring.tx.model.Livre;
import com.byteslounge.spring.tx.model.Reservation;
import com.byteslounge.spring.tx.user.IAdherentMetier;
import com.byteslounge.spring.tx.user.ILivreMetier;
import com.byteslounge.spring.tx.user.IReservationMetier;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		
		IAdherentMetier adherentMetier = (IAdherentMetier) ctx.getBean("adherentMetierImpl");
		ILivreMetier iLivreMetier=(ILivreMetier) ctx.getBean("livreMetierImpl");
		IReservationMetier iReservationMetier=(IReservationMetier) ctx.getBean("reservationMetierImpl");
		List<Adherent> list = adherentMetier.getAll();
		System.out.println("Adherent count: " + list.size());

		
		Adherent adherent = new Adherent();
		adherent.setAdresse("Adresse1");
		adherent.setNom("tiba");
		adherent.setPrenom("mohamed");
		adherent.setEmail("test24");
		adherent.setDateInscription(new Date());
		adherent.setDateNaissance(new Date());
		adherent.setSexe("M");
		adherent.setStatut(true);
		adherentMetier.addAdherent(adherent);
		
		System.out.println("Adherent count: " + list.size());
		
		
		Livre l=new Livre();
		
		l.setDisponibilite(true);
		l.setAuteur("yassine");
		
		iLivreMetier.addLivre(l);
		
		
		
		Keyclass key =new Keyclass((long)4,(long)30);
		System.out.println(iLivreMetier.getLivreById((long)30));
		System.out.println(adherentMetier.getAdherentById((long)4));
		Reservation r =new Reservation(key, null, null);
		
		
		iReservationMetier.addReservation(r);
		//iReservationMetier.deleteReservation(key);
		
	
		
		
		//System.out.println("Adherent count: " + list.size());
	//	Adherent adherent2=new Adherent();
		//adherent2=adherentMetier.getAdherentById((long)2 );
	//	System.out.println(adherent2);adherent2.toString();
		//adherentMetier.deleteAdherent(adherent2.getId());
		
	//	System.out.println(adherent2);adherent2.toString();
	
		

	}
}
