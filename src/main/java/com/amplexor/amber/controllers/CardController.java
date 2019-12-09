package com.amplexor.amber.controllers;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.dto.cards.CardValidationResponse;
import com.amplexor.amber.model.Card;
import com.amplexor.amber.services.CardService;


@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardService cardService;
	
	@RequestMapping(value = "/validate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CardValidationResponse> validateCard(@RequestParam("id") @NotNull String cardId) {
		boolean valid = cardService.validateCard(cardId);
		CardValidationResponse response = new CardValidationResponse();
		if (valid) {
			response.setResult("valid");
			response.setStatus("200");
		} else {
			response.setResult("invalid");
			response.setStatus("404");
		}
		return new ResponseEntity<>(response, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Card>> findAll() {
		return new ResponseEntity<>(cardService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertNewCard(@RequestBody Card card) {
		cardService.insertNewCard(card);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCard(@RequestParam String cardId) {
		cardService.deleteCard(cardId);
	}
	
}
