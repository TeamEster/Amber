package com.amplexor.amber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.Role;
import com.amplexor.amber.repositories.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository repository;
	
	public List<Role> findAllRoles() {
		return repository.findAll();
	}

}
