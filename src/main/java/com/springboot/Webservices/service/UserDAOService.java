package com.springboot.Webservices.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.Webservices.entity.User;

//autowire get full control on other class. 
//ClassA, ClassB
//@AutoWired is used for the bean instantiation

@Repository
@Transactional
public class UserDAOService {
	//only things that are in persistanceContext are identified by entityManager
	@PersistenceContext
	private EntityManager entityManager;
	
	
	protected UserDAOService() {
		// TODO Auto-generated constructor stub
		
		
		
	}
//User jack=new User("jack", "admin");
	
	public long insert(User user) {
		//you will be able to save the data using entity manager
		//open transaction(some action to db)
		
		
		entityManager.persist(user);
		//close transaction
		return user.getId();
		
		
		
		
	}
	
}
