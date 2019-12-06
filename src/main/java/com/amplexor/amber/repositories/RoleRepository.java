package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
	
	public List<Role> findAll(); 

	public Role findByRoleId(String roleId);
	
}
