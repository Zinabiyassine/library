package com.byteslounge.spring.tx.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.byteslounge.spring.tx.dao.IlivreDao;
import com.byteslounge.spring.tx.model.Adherent;
import com.byteslounge.spring.tx.model.Livre;
@Repository
public class LivreDao implements IlivreDao {
	@PersistenceContext
	protected EntityManager em;


	@Transactional
	public Livre addLivre(Livre obj) {
		//if(!this.existe(obj.getIsbn())){
			em.persist(obj);
		/*	if(this.existe(obj.getIsbn())){
				return this.getLivreById(obj.getIsbn());
			}*/
		
		
		return null;
	}

	@Transactional
	public void deleteLivre(Long obj) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public Livre updateLivre(Livre obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Livre getLivreById(Long idObj) {
		Livre a = em.find(Livre.class, idObj);
		if (a != null) {
			return a;
		}
		return null;

	
	}

	@Transactional
	public List<Livre> getAll() {
		Query query = em.createQuery("select l from Livre as l");
		return(List<Livre>)query.getResultList();
		
	}

	@Transactional
	public void DeleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	 public boolean existe(Long id){
			if( this.getLivreById(id)!=null && id!=null){
				return true;
			}else
			return false;
		}

}
