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
	
	public List<User> findUserByRoleId(Long id) {
		return userRepository.findByRoleId(id);
	}
	
	public List<User> findUserByCardId(Long id) {
		return userRepository.findByCardId(id);
	}
	
	public List<User> findByEmployeeId(String id) {
		return userRepository.findByEmployeeId(id);
	}
	
	public List<User> findSpecificUser(User user) {
		List<User> result = Lists.newArrayList();
		
		result = userRepository.findByFirstNameOrLastNameOrEmployeeId(user.getFirstName(), user.getLastName(), user.getEmployeeId());
		
		return result;
	}
	
}
