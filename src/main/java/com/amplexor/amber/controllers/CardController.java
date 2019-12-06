package com.amplexor.amber.controllers;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.model.Card;
import com.amplexor.amber.services.CardService;


@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardService cardService;
	
	@RequestMapping(value = "/validate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> validateCard(@PathVariable("id") @NotNull String cardId) {
		
		boolean valid = cardService.validateCard(cardId);
		if (valid) {
			return new ResponseEntity<>("Ok", HttpStatus.OK); 
		} else {
			return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertNewCard(@RequestBody Card card) {
		cardService.insertNewCard(card);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCard(@RequestBody Card card) {
		cardService.deleteCard(card);
	}
	
}
