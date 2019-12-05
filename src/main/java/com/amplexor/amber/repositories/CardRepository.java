package com.amplexor.amber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amplexor.amber.model.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
	
	public List<Card> findAll(); 

	public List<Card> findByCardId(String cardId);
	
}
