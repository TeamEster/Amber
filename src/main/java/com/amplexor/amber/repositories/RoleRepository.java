package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	
	public List<Role> findAll(); 

	public List<Role> findById(String roleId);
	
}
