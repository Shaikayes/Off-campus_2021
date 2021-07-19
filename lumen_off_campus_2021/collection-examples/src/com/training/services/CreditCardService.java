package com.training.services;

import java.util.*;

import com.training.model.CreditCard;
public class CreditCardService {

	private ArrayList<CreditCard> cardList ;

	public CreditCardService() {
		super();
		this.cardList = new ArrayList<>();
	}

	public CreditCardService(ArrayList<CreditCard> cardList) {
		super();
		this.cardList = cardList;
	}
	
	public boolean addCard(CreditCard card) {
		
		return this.cardList.add(card);
	}
	
	// TODO  return appropirate values 
	public void  addCard(CreditCard ...cards) {
		
		for(CreditCard eachCard:cards) {
			addCard(eachCard);
		}
	}

	public ArrayList<CreditCard> getCardList() {
		return cardList;
	}


	
}