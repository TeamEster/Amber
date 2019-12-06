package com.amplexor.amber.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amplexor.amber.model.Card;
import com.amplexor.amber.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;

	public Boolean validateCard(String cardId) {
		boolean valid = false;
		
		Card resolvedCardId = cardRepository.findByCardId(cardId);
		if (resolvedCardId != null) {
			valid = cardId.equals(resolvedCardId.getCardId());
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
