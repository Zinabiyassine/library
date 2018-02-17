package com.byteslounge.spring.tx.user;

import java.util.List;

import com.byteslounge.spring.tx.model.Adherent;

public interface IAdherentMetier {
	  public  Adherent addAdherent(Adherent obj);
	  public  void deleteAdherent(Long obj);
	  public  Adherent updateAdherent(Adherent obj);
	  public  Adherent getAdherentById(Long idObj);
	  public  List<Adherent> getAll(boolean s);
	  public  void DeleteAll();
	  public int statAdherent();
	  public  List<Adherent> getAll();
	  public String PathPhoto(Long id);
}
