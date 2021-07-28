package com.springboot.Webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.Webservices.entity.User;
import com.springboot.Webservices.service.UserDAOService;

//spring boot consider objects as a bean. 
//conponent vs service
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	private static final Logger logger=LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
private UserDAOService userDAO;
	
	

	//methodName(dataType... array)
	
	@Override
	public void run(String... args) throws Exception {
		User jack=new User("Jack", "Admin");
		long id = userDAO.insert(jack);
		logger.info(jack.toString());
		
		
	}
	
	

}
