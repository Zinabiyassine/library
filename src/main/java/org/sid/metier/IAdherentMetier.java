package org.sid.metier;

import java.util.List;

import org.sid.entities.Adherent;

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
	  public Adherent getAdherentByEmail(String idObj);
}
