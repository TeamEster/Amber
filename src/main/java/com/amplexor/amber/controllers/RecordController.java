package com.amplexor.amber.controllers;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amplexor.amber.model.Record;
import com.amplexor.amber.model.User;
import com.amplexor.amber.services.RecordService;
import com.amplexor.amber.services.UserService;

@RestController
@RequestMapping("/records")
public class RecordController {
	
	@Autowired
	private RecordService recordService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Record>> findAll() {
		List<Record> records = recordService.findAll();
		return new ResponseEntity<>(records, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user/{employeeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Record>> findForUser(@PathVariable("employeeId") String employeeId) {
		User user = userService.findByEmployeeId(employeeId);
		List<Record> records = recordService.findByUser(user);
		return new ResponseEntity<>(records, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user/{employeeId}/period", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Record>> findForUserAndPeriod(@PathVariable("employeeId") String employeeId, @RequestParam @NotNull String from, @RequestParam @NotNull String to) {
		List<Record> records = recordService.findByUserForPeriod(employeeId, from, to);
		return new ResponseEntity<>(records, HttpStatus.OK);
	}

	@RequestMapping(value = "/card/{cardId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Record>> findForCard(@PathVariable("cardId") String cardId) {
		List<Record> records = recordService.findByCardId(cardId);
		return new ResponseEntity<>(records, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/card/{cardId}/period", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Record>> findForCardAndPeriod(@PathVariable("cardId") String cardId, @NotNull @RequestParam String from, @NotNull @RequestParam String to) {
		List<Record> records = recordService.findByCardIdForPeriod(cardId, from, to);
		return new ResponseEntity<>(records, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Record> insertNewRecord(@RequestBody Record record) {
		Record newRecord = recordService.insertNewRecord(record);
		return new ResponseEntity<>(newRecord, HttpStatus.OK);
	}
}
