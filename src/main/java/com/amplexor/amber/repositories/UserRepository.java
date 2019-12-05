package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
	
	public List<User> findAll(); 

	public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	public List<User> findByRoleId(Long roleId);
	
	public List<User> findByCardId(Long cardId);
	
	public List<User> findByEmployeeId(String employeeId);
	
	public List<User> findByFirstNameOrLastNameOrEmployeeId(String firstName, String lastName, String employeeId);

}
