package org.sid.metier.Impl;

import java.util.List;

import org.sid.dao.IAdherentDao;
import org.sid.dao.IHistoriqueDao;
import org.sid.entities.Historique;
import org.sid.metier.IHistoriqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class HistoriqueMetierImpl implements IHistoriqueMetier {
	@Autowired
	private IHistoriqueDao dao;
	public void setDao(IHistoriqueDao dao) {
		this.dao = dao;
	}
	@Override
	public List<Historique> getall() {
		// TODO Auto-generated method stub
		return dao.getall();
	}

	@Override
	public void add(Historique h) {
		dao.add(h);
		
	}
	@Override
	public List<Historique> getall(long id) {
		// TODO Auto-generated method stub
		return dao.getall(id);
	}

}
