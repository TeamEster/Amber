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
	
	public List<User> findByCardId(String cardId);
	
	public List<User> findByEmployeeId(String employeeId);
	
	public List<User> findByUsername(String username);

}
