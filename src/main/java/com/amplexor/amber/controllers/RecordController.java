package com.amplexor.amber.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.services.RecordService;

@RestController
@RequestMapping("/records")
public class RecordController {
	
	@Autowired
	private RecordService service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String findAll() {
		
		return null;
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String findForUser(@PathVariable("userId") String userId) {
		
		return null;
	}
	
	@RequestMapping(value = "/{userId}?from&to", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String findForUserAndPeriod(@PathVariable("userId") String userId, @RequestParam String from, @RequestParam String to) {
		
		return null;
	}

	@RequestMapping(value = "/{cardId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String findForCard(@PathVariable("cardId") String cardId) {
		
		return null;
	}
	
	@RequestMapping(value = "/{cardId}?from&to", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String findForCardAndPeriod(@PathVariable("cardId") String cardId, @RequestParam String from, @RequestParam String to) {
		
		return null;
	}
}
