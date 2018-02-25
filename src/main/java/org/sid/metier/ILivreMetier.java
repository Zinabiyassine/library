package org.sid.metier;

import java.util.List;

import org.sid.entities.Livre;



public interface ILivreMetier {
	  public  Livre addLivre(Livre obj);
	  public  void deleteLivre(Long obj);
	  public  Livre updateLivre(Livre obj);
	  public  Livre getLivreById(Long idObj);
	  public  List<Livre> getAll();
	  public  void DeleteAll();
	  public int statLivre();
}
