package com.training;

import java.util.*;

import com.training.model.CreditCard;
import com.training.services.NioFileService;

public class UsingNioFileService {

	public static void main(String[] args) {

		
		
		NioFileService service = new NioFileService();
		
		List<CreditCard> cardList = Arrays.asList(
				  new CreditCard(1010, "Ramesh", 700000, 47473734),
				  new CreditCard(2010, "Suresh", 800000, 57476734),
				  new CreditCard(3010, "Magesh", 900000, 67475734));
				  
	
		boolean result = service.writeToFile("creditCard.txt", cardList);
		
		if(result) {
			System.out.println("File Created");
		} else {
			
			System.out.println("Exception - Try again");
		}
		
		
		List<CreditCard> list = service.readFromFile("creditcard.txt");
		
		System.out.println(list);
		

		List<String> list2 = service.usingReadAllLines("creditcard.txt");
		
		System.out.println(list2);
		
	}

}
