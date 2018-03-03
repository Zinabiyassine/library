package org.sid.metier.Impl;

import java.util.List;

import org.sid.dao.IAdherentDao;
import org.sid.entities.Adherent;
import org.sid.entities.Livre;
import org.sid.metier.IAdherentMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdherentMetierImpl implements IAdherentMetier{
	
	@Autowired
	private IAdherentDao dao;
	
	public void setDao(IAdherentDao dao) {
		this.dao = dao;
	}
	@Transactional
	public Adherent addAdherent(Adherent obj) {
		// TODO Auto-generated method stub
		return dao.addAdherent(obj);
	}

	public void deleteAdherent(Long obj) {
		
		dao.deleteAdherent(obj);
		
	}

	public Adherent updateAdherent(Adherent obj) {
		// TODO Auto-generated method stub
		return dao.updateAdherent(obj);
	}

	public Adherent getAdherentById(Long idObj) {
		// TODO Auto-generated method stub
		return dao.getAdherentById(idObj);
	}

	public List<Adherent> getAll(boolean s) {
		// TODO Auto-generated method stub
		return dao.getAll(s);
	}

	public void DeleteAll() {
		dao.DeleteAll();
		
	}

	public int statAdherent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Adherent> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	public String PathPhoto(Long id) {
		// TODO Auto-generated method stub
		return dao.PathPhoto(id);
	}
	@Override
	public Adherent getAdherentByEmail(String idObj) {
		
		return dao.getAdherentByEmail(idObj);
	}
	@Override
	public void addFavoris(Livre l, long adherent) {
		dao.addFavoris(l, adherent);
		
	}
	@Override
	public List<Livre> getFavoris(long adherent) {
		// TODO Auto-generated method stub
		return dao.getFavoris(adherent);
	}
	@Override
	public void deleteFavoris(long adherent, long isbn) {
		dao.deleteFavoris(adherent, isbn);		
	}
	
	

	
	
}
