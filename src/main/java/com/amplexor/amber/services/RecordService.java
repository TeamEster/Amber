package com.amplexor.amber.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.Record;
import com.amplexor.amber.model.User;
import com.amplexor.amber.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private UserService userService;
	
	public List<Record> findAll() {
		return repository.findAll();
	}
	
	public List<Record> findByUser(String employeeId) {
		User user = userService.findByEmployeeId(employeeId);
		if (user != null) {
			return findByCardId(user.getCardId());
		}
		
		return null;
	}
	
	public List<Record> findByUserForPeriod(String employeeId, String from, String to) {
		User user = userService.findByEmployeeId(employeeId);
		if (user != null) {
			return findByCardIdForPeriod(user.getCardId(), from, to);
		}
		
		return null;
	}
	
	public List<Record> findByCardId(String cardId) {
		return repository.findByCardId(cardId);
	}
	
	public List<Record> findByCardIdForPeriod(String cardId, String from, String to) {
		Date fromDate = null;
		Date toDate = null;
		
		try {
			toDate = new SimpleDateFormat("dd/MM/yyyy").parse(to);
			fromDate = new SimpleDateFormat("dd/MM/yyyy").parse(from);  
		} catch (ParseException e) {
			//TODO
		} 
		
		return repository.findByCardIdAndTimestampBetween(cardId, fromDate, toDate);
	}

	public Record insertNewRecord(Record record) {
		return repository.insert(record);
	}
}
