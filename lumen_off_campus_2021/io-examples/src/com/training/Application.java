package com.training;

import com.training.model.CreditCard;
import com.training.services.FileService;

import java.io.*;
public class Application {

	public static void printResult(boolean response) {
		
		if(response) {
			System.out.println("One Object Serialized");
		} else {
			System.out.println("Exception - Check");
		}	

	}
	public static void main(String[] args) {

		File txtFile = new File("card.txt");

		
		FileService service = new FileService();
		
		CreditCard card = new CreditCard(1010, "Ramesh", 700000, 47473734);
		
		System.out.println( card instanceof Serializable);
		
		File file = new File("card.ser");
		
		int key=4;
		
		switch (key) {
		case 1:
			boolean response =service.serialize(card, file);
			printResult(response);
			break;
		case 2:
			CreditCard obj = (CreditCard)service.deserialize(file);
			
			System.out.println("Card Holder Name:=" +obj.getCardHolderName());
			System.out.println("Card Number:="+obj.getCardNumber());
			System.out.println("Credit Limit:="+obj.getCreditLimit());
			System.out.println("Phone Number:="+obj.getPhoneNumber());
		case 3:
			CreditCard suresh = new CreditCard(2021, "Vishwa", 8000000, 84763734);
			

			 boolean result = service.writeToTextFile(suresh, txtFile);
			 
				printResult(result);	

			break;
		case 4:
   
			CreditCard[] cardList= service.readFromTextFile(txtFile);
			    
			   for(CreditCard eachCard:cardList) {
				   System.out.println(eachCard);
			   }
			    break;
		default:
			break;
		}
		
		
	}

}
