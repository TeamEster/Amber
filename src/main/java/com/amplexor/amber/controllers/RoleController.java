package com.amplexor.amber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.model.Role;
import com.amplexor.amber.services.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Role>> getRoles() {
		return new ResponseEntity<>(roleService.findAllRoles(), HttpStatus.OK);
	}
	
}
