package com.byteslounge.spring.tx.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.byteslounge.spring.tx.dao.IHistoriqueDao;
import com.byteslounge.spring.tx.model.Historique;
import com.byteslounge.spring.tx.user.IHistoriqueMetier;

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
