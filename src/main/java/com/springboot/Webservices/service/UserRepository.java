package com.springboot.Webservices.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Webservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
//JpaRepository<entity, id's data type>
//you can use this instead of the UserDAOService
//it has everything like @Repository, @PersistanceContext, @Transactional. etc. 
}
