package com.byteslounge.spring.tx.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byteslounge.spring.tx.dao.IAdherentDao;
import com.byteslounge.spring.tx.model.Adherent;
import com.byteslounge.spring.tx.user.IAdherentMetier;

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
		return null;
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
	
	

	
	
}
