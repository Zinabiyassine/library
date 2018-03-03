package org.sid.dao;

import java.util.List;

import org.sid.entities.Historique;

public interface IHistoriqueDao {
	public List <Historique> getall();
	public void add(Historique h);
	public List<Historique> getall(long id);
	
	
	
	

}
