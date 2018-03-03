package org.sid.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.dao.IAgentDao;
import org.sid.entities.Adherent;
import org.sid.entities.Agent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AgentDao implements IAgentDao {
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public Agent addAgent(Agent obj) {
		
		return null;
	}

	@Override
	public Agent updateAgent(Agent obj) {
		
		return em.merge(obj);
	}
	@Transactional
	@Override
	public Agent getAgentById(Long idObj) {
		Agent a = em.find(Agent.class, idObj);
		if (a != null) {
			return a;
		}
		return null;
	}
	@Transactional
	@Override
	public Agent getAgentByEmail(String mail) {
		try {
			Query q = em.createQuery("select a from Agent a where a.email=:x");
			q.setParameter("x", mail);
			Agent a = (Agent) q.getSingleResult();
			
				return a;
			}
		catch (NoResultException nre){
			return null;
		}
		
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
