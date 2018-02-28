package org.sid.dao;

import java.util.List;

import org.sid.entities.Agent;

public interface IAgentDao {
	 public  Agent addAgent(Agent obj);
	  public  Agent updateAgent(Agent obj);
	  public  Agent getAgentById(Long idObj);
	  public  Agent getAgentByEmail(String mail);
	  
	  
	  public  List<Agent> getAll();
	  public String PathPhoto(Long id);
}

	  
