package org.sid.metier.Impl;

import java.util.List;

import org.sid.dao.IAdherentDao;
import org.sid.dao.IAgentDao;
import org.sid.entities.Agent;
import org.sid.metier.IAgentMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AgentMetierImpl implements IAgentMetier {
	@Autowired
	IAgentDao dao;
	public void setDao(IAgentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Agent addAgent(Agent obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent updateAgent(Agent obj) {
		// TODO Auto-generated method stub
		return dao.updateAgent(obj);
	}

	@Override
	public Agent getAgentById(Long idObj) {
		
		return dao.getAgentById(idObj);
	}

	@Override
	public Agent getAgentByEmail(String mail) {
		// TODO Auto-generated method stub
		return dao.getAgentByEmail(mail);
	}

	@Override
	public List<Agent> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String PathPhoto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
