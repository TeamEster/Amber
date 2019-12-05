package com.amplexor.amber.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.services.CardService;
import com.google.gson.JsonObject;
import com.sun.istack.NotNull;

@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardService cardService;
	
	@RequestMapping(value = "/validate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String validateCard(@PathVariable("id") String cardId) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("result", cardService.validateCard(cardId));
		
		return jsonObject.toString();
	}
}
