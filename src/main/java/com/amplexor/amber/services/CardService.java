package com.amplexor.amber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.Card;
import com.amplexor.amber.model.User;
import com.amplexor.amber.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Autowired
	private UserService userService;

	public List<Card> findAll() {
		return cardRepository.findAll();
	}
	
	public Boolean validateCard(String cardId) {
		
		boolean valid = false;
		
		User resolvedUser = userService.findUsersByCardId(cardId);
		Card resolvedCardId = cardRepository.findByCardId(cardId);
		
		if (resolvedCardId != null && resolvedUser != null) {
			valid = true;
		}
		
		return valid;
	}
	
	public Card findCardbyId(String cardId) {
		return cardRepository.findByCardId(cardId);
	}
	
	public void insertNewCard(Card card) {
		cardRepository.save(card);
	}
	
	public void deleteCard(String cardId) {
		cardRepository.delete(cardRepository.findByCardId(cardId));
	}
}
