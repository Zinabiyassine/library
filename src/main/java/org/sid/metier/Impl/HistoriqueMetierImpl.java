package org.sid.metier.Impl;

import java.util.List;

import org.sid.dao.IHistoriqueDao;
import org.sid.entities.Historique;
import org.sid.metier.IHistoriqueMetier;
import org.springframework.beans.factory.annotation.Autowired;

public class HistoriqueMetierImpl implements IHistoriqueMetier {
	@Autowired
	private IHistoriqueDao dao;
	
	@Override
	public List<Historique> getall() {
		// TODO Auto-generated method stub
		return dao.getall();
	}

	@Override
	public void add(Historique h) {
		dao.add(h);
		
	}

}
