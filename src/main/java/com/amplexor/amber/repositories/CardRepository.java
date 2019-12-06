package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Card;

@Repository
public interface CardRepository extends MongoRepository<Card, Long> {
	
	public List<Card> findAll(); 

	public Card findByCardId(String cardId);
	
}
