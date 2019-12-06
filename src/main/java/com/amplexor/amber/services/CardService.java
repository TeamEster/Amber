package com.amplexor.amber.services;

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

	public Boolean validateCard(String cardId) {
		
		boolean valid = false;
		
		User resolvedUser = userService.findUsersByCardId(cardId);
		Card resolvedCardId = cardRepository.findByCardId(cardId);
		
		if (resolvedCardId != null && resolvedUser != null) {
			valid = true;
		}
		
		return valid;
	}
	
	public void insertNewCard(Card card) {
		cardRepository.save(card);
	}
	
	public void deleteCard(Card card) {
		cardRepository.delete(cardRepository.findByCardId(card.getCardId()));
	}
}
