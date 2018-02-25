package org.sid.metier.Impl;

import java.util.List;

import org.sid.dao.IlivreDao;
import org.sid.entities.Livre;
import org.sid.metier.ILivreMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class LivreMetierImpl implements ILivreMetier{
	@Autowired
	private IlivreDao dao;
	
	public void setDao(IlivreDao dao) {
		this.dao = dao;
	}

	@Transactional
	public Livre addLivre(Livre obj) {
		// TODO Auto-generated method stub
		return dao.addLivre(obj);
	}

	
	public void deleteLivre(Long obj) {
		dao.deleteLivre(obj);
	}

	
	public Livre updateLivre(Livre obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Livre getLivreById(Long idObj) {
		// TODO Auto-generated method stub
		return dao.getLivreById(idObj);
	}

	
	public List<Livre> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
	public void DeleteAll() {
		dao.DeleteAll();
	}

	
	public int statLivre() {
		
		return 0;
	}

	

	
	
}
