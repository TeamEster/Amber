package com.amplexor.amber.dto.cards;

public class CardValidationResponse {

	public CardValidationResponse() {}
	
	private String status;
	private String result;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
