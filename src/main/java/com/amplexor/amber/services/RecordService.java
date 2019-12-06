package com.amplexor.amber.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.Card;
import com.amplexor.amber.model.Record;
import com.amplexor.amber.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	RecordRepository repository;
	
	public List<Record> findAll() {
		
		return null;
	}
	
	public List<Record> findByUser(String userId) {
		
		return null;
	}
	
	public List<Record> findByUserForPeriod(String userId, Date from, Date to) {
		
		return null;
	}
	
	public List<Record> findByCard(String cardId) {
		
		return null;
	}
	
	public List<Record> findByCardForPeriod(String cardId, Date from, Date to) {
		
		return null;
	}

	public boolean insertNewRecord(Record record) {
		repository.insert(record);
		return true;
	}
}
