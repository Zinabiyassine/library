package org.sid.web;

import org.sid.entities.Keyclass;
import org.sid.metier.IAdherentMetier;
import org.sid.metier.ILivreMetier;
import org.sid.metier.IReservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

public class ReservationAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	IReservationMetier iReservationMetier=(IReservationMetier) ctx.getBean("reservationMetierImpl");
	IAdherentMetier iadherentMetier = (IAdherentMetier) ctx.getBean("adherentMetierImpl");
	ILivreMetier iLivreMetier=(ILivreMetier) ctx.getBean("livreMetierImpl");
	
	
	public Long idlivre;
	public Long idadherent;
	public Keyclass key = new Keyclass(idadherent, idlivre);
	public Keyclass k;
	
	
	
	
	
	
	public String deleteReservation() {
	
		iReservationMetier.deleteReservation(key);
		System.out.println("DAZT!!!!!!!!!!!!!!!!!!!!!!");
		return SUCCESS;
	}

	
	
	
	

}
