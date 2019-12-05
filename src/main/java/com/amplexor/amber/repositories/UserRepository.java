package com.amplexor.amber.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	public List<User> findByRoleId(Long roleId);
	
	public List<User> findByCardId(Long cardId);
	
	
	
}
