package com.amplexor.amber.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String employeeId;
	
	@OneToOne(targetEntity = Card.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "cardId")
	private Card card;
	
	@OneToOne(targetEntity = Role.class, cascade= CascadeType.ALL)
	@JoinColumn(name = "roleId")
	private Role role;
	
	public User() {}

	public User(String firstName, String lastName, String employeeId, Card card, Role role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.card = card;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
