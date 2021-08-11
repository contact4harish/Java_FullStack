package com.springboot.Webservices;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.Webservices.entity.User;
import com.springboot.Webservices.service.UserRepository;

//spring boot consider objects as a bean. 
//conponent vs service

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	private static final Logger logger=LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	//autowire bean -here interface userRepository
private UserRepository UserRepo;
	
	

	//methodName(dataType... array)
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("jill", "Admin", "10/09/1992");
		User updateUser = UserRepo.save(user);
		//updates the user. Jill. 
		//but doesn't create the new one
		logger.info(user+" is created");
		
		
		List<User> c = UserRepo.findAll();
		logger.info(c+" is retrieved");
		
//		userRepo.getById(user.getId());
		Optional<User> retrieveUser = UserRepo.findById(2L);
		logger.info(retrieveUser+" is retrieved");
		
		

		
	}
	
	

}
