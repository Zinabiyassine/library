package com.byteslounge.spring.tx.user;

import java.util.List;

import com.byteslounge.spring.tx.model.Livre;



public interface ILivreMetier {
	  public  Livre addLivre(Livre obj);
	  public  void deleteLivre(Long obj);
	  public  Livre updateLivre(Livre obj);
	  public  Livre getLivreById(Long idObj);
	  public  List<Livre> getAll();
	  public  void DeleteAll();
	  public int statLivre();
}
