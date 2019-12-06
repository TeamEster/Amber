package com.amplexor.amber.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Record;

@Repository
public interface RecordRepository extends MongoRepository<Record, Long> {
	
	public List<Record> findAll(); 

	public List<Record> findByCardId(String cardId);
	
	public List<Record> findByCardIdAndTimestampBetween(String cardId, Date from, Date to);
	
}
