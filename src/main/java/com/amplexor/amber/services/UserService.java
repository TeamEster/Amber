package com.amplexor.amber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.User;
import com.amplexor.amber.repositories.UserRepository;
import com.google.common.collect.Lists;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public List<User> findUsersByRoleId(String roleId) {
		return userRepository.findByRoleId(roleId);
	}
	
	public List<User> findUsersByCardId(String cardId) {
		return userRepository.findByCardId(cardId);
	}
	
	public List<User> findByEmployeeId(String id) {
		return userRepository.findByEmployeeId(id);
	}
	
	public List<User> findSpecificUser(String userName) {
		List<User> result = Lists.newArrayList();
		
		result = userRepository.findByUsername(userName);
		
		return result;
	}
	
}
