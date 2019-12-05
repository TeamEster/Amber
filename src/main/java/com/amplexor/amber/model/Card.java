package com.amplexor.amber.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String cardId;
	
	//default constructor			
	public Card() {}
	
	public Card(String cardId) {
		this.cardId = cardId;
	}
	
	@Id
	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
}
