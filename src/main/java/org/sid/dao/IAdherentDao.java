package org.sid.dao;

import java.util.List;

import org.sid.entities.Adherent;
import org.sid.entities.Livre;

public interface IAdherentDao {

	
	  public  Adherent addAdherent(Adherent obj);

	  public  void deleteAdherent(Long obj);
	  public  Adherent updateAdherent(Adherent obj);
	  public  Adherent getAdherentById(Long idObj);
	  public  Adherent getAdherentByEmail(String mail);
	  public  List<Adherent> getAll(boolean s);
	  public  void DeleteAll();
	  public  List<Adherent> getAll();
	  public String PathPhoto(Long id);
	  public void addFavoris(Livre l,long adherent);
	  public List<Livre> getFavoris(long adherent);
	  public void deleteFavoris(long adherent,long isbn);
}
