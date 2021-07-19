package com.training.services;

import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.*;
import  static java.util.stream.Collectors.*;

import com.training.model.CreditCard;

public class CreditCardServices {
	private List<CreditCard> cards;
	
	public void setCards(List<CreditCard> cards) {
		this.cards = cards;
	}
		
	public CreditCardServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public List<CreditCard> getCards() {
		return cards;
	}

	public void usingFilterAndMap() {
		
		//using Filter Alone - only one intermediate operator and terminal.
		
		List<CreditCard> creditLimitMoreThan5Lakh = 
				
				this.cards.stream()
				.filter((card) -> card.getCreditLimit()>500000)
				.collect(toList());
		       System.out.println("Credit Limit More than 5 lakh");
		
		        creditLimitMoreThan5Lakh.forEach(System.out::println);

	//using Filter and Map - two intermediate operator and terminal.
	
	   List<String> namesOfMoreThan5Lakh =
			   this.cards.stream()
			   .filter(card -> card.getCreditLimit()<500000)
			   .map(card -> card.getCardHolderName())
			   .collect(toList());
	   
	          System.out.println("Credit Limit Less than 5 Lakh");
	          namesOfMoreThan5Lakh.forEach(System.out::println);
	}

		
		//collect to map

		public void collectingToUtilMap() {
			
			Map<String,Long> teleCallingList = this.cards.stream()
					.filter(card -> card.getCreditLimit()<500000)
					.collect(toMap(CreditCard::getCardHolderName, CreditCard::getPhoneNumber));
	
		}
}