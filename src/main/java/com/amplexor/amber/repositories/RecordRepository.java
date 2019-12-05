package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Card;
import com.amplexor.amber.model.Record;

@Repository
public interface RecordRepository extends CrudRepository<Record, Long> {
	
	public List<Record> findAll(); 

	//public List<Record> findByCard(Card card);
	
}
