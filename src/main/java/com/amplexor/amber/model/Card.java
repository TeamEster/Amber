package com.amplexor.amber.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "card")
public class Card {

	@Id
	private String id;
	
	private String cardId;
	
	private String cardType;
	
	//default constructor			
	public Card() {}
	
	public Card(String cardId, String cardType) {
		this.cardId = cardId;
		this.cardType = cardType;
	}
	
	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
}
