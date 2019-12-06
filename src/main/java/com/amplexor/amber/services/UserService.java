package com.amplexor.amber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.dto.UserDTO;
import com.amplexor.amber.model.Card;
import com.amplexor.amber.model.Role;
import com.amplexor.amber.model.User;
import com.amplexor.amber.repositories.UserRepository;
import com.google.common.base.Strings;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	CardService cardService;
	
	@Autowired
	RoleService roleService;
	
	public List<User> findAllUsers() {
		return userRepository.findAll(); 
	}
	
	public List<User> findUsersByRoleId(String roleId) {
		return userRepository.findByRoleId(roleId);
	}
	
	public User findUsersByCardId(String cardId) {
		return userRepository.findByCardId(cardId);
	}
	
	public User findByEmployeeId(String id) {
		return userRepository.findByEmployeeId(id);
	}
	
	public User findUserByUsername(String userName) {
		User result = null;
		
		if (!Strings.isNullOrEmpty(userName)) {
			result = userRepository.findByUsername(userName);
		}
				
		return result;
	}
	
	public User assignCard(UserDTO userData) {
		User user = userRepository.findByEmployeeId(userData.getEmployeeId());
		
		if (user != null && userData.getCardId() != null) {
			Card card = cardService.findCardbyId(userData.getCardId());
				if(card != null) {
					user.setCardId(userData.getCardId());
					User updatedUser = userRepository.save(user);
					
					return updatedUser;
			}
		}
		
		return user;
	}
	
	public User assignRole(UserDTO userData) {
		User user = userRepository.findByEmployeeId(userData.getEmployeeId());
		
		if (user != null && userData.getRoleId() != null) {
			Role role = roleService.findByRoleId(userData.getRoleId());
			
				if(role != null) {
					user.setRoleId(userData.getRoleId());
					User updatedUser = userRepository.save(user);
					
					return updatedUser;
			}
		}
		
		return user;
	}
	
	public User insertNew(UserDTO userData) {
		//Questionable transformation ??
		return userRepository.save(userData);
	}
	
}
