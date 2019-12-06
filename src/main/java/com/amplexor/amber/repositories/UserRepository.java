package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	public List<User> findAll(); 

	public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	public List<User> findByRoleId(String roleId);
	
	public User findByCardId(String cardId);
	
	public User findByEmployeeId(String employeeId);
	
	public User findByUsername(String username);
	
	public User findByUsernameAndEmployeeId(String username, String employeeId);

}
