package com.amplexor.amber.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "record")
public class Record {
	
	@Id
	private String id;
	
	private String cardId;
	
	private String timestamp;
	
	//default constructor	
	public Record () {}
	
	public Record (String cardId, String timestamp) {
		this.cardId = cardId;
		this.timestamp = timestamp;
	}

	public String getCard() {
		return cardId;
	}

	public void setCard(String cardId) {
		this.cardId = cardId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
}
