package com.amplexor.amber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.model.User;
import com.amplexor.amber.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers() {
		return userService.findAllUsers();
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getSpecificUser(@RequestBody User user) {
		return userService.findSpecificUser(user);
	}
	
	@RequestMapping(value = "/userWithEmployeeId/{employeeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserByEmyployeeId(@PathVariable("employeeId") String employeeId) {
		return userService.findByEmployeeId(employeeId);
	}
	
	@RequestMapping(value = "/usersInRole/{roleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsersInRole(@PathVariable("roleId") String roleId) {
		return userService.findUsersByRoleId(roleId);
	}
	
}