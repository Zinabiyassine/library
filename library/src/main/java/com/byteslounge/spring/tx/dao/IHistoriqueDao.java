package com.byteslounge.spring.tx.dao;

import java.util.List;

import com.byteslounge.spring.tx.model.Historique;

public interface IHistoriqueDao {
	public List <Historique> getall();
	public void add(Historique h);
	
	
	
	
	

}
