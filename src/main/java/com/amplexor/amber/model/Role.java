package com.amplexor.amber.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "role")
public class Role {
	
	@Id
	private String id;
	
	private String roleId;
	
	private String roleDescription;
	
	//default constructor
	public Role() {}

	public Role(String roleId, String description) {
		this.roleId = roleId;
		this.roleDescription = description;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String description) {
		this.roleDescription = description;
	}
}
