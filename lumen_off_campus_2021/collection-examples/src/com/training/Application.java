package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.DataAccess;
import com.training.model.CreditCard;
import com.training.model.Customer;
import com.training.services.CreditCardService;
import com.training.utils.CardHolderNameComparator;

public class Application {

	public static void display(DataAccess<?> list ) {
		
		System.out.println(list.get());
		
	}
	
 
	public static void print(List<?> cardList) {
		
			
             for(Object eachObject:cardList) {
			
            	  if(eachObject instanceof CreditCard) {
            		  
			      System.out.println((CreditCard)eachObject);
             }
            	  if(eachObject instanceof Customer) {
            		  
    			      System.out.println((Customer)eachObject);
                 }
		}
		
		
		
	}
	
	public static void main(String[] args) {

		CreditCardService service = new CreditCardService();
		
		CreditCard card1 = new CreditCard(1010, "Ramesh", 700000, 47473734);
		
		
		service.addCard(card1);
		
		System.out.println(service.getCardList());
		
		
		CreditCard card2 = new CreditCard(7010, "Zahir", 705000, 4747754);
		CreditCard card3 = new CreditCard(3010, "Anand", 800000, 4747734);
		CreditCard card4 = new CreditCard(4010, "Chandru", 1700000, 4773934);
		
		
		service.addCard(card2,card3,card4);
		
		// Solution 
		
		List<CreditCard> list = service.getCardList();
		                                         
		//CreditCard[] listToArray =  (CreditCard[]) list.toArray(list);
		
		// Solution -2
     //  Object[] rawTypeListToArray =   list.toArray();
       
       //   Solution - 1
		CreditCard[] rawTypeListToArray =list.toArray(new CreditCard[list.size()]);
       

		
		System.out.println("Printing List to Array");
		for(Object eachCard: rawTypeListToArray) {
			
			CreditCard card = (CreditCard)eachCard;
			System.out.println(card);
			
		}
		
		
	List<CreditCard> arrayToList =Arrays.asList(new CreditCard(84848, "priya", 7474747, 985673722),new CreditCard(84848, "shiny", 474747, 975673722));
		
		System.out.println(arrayToList);
				
		System.out.println("Sort by Card Number");
		 Collections.sort(list);
		 
			print(list);
		System.out.println("Sort By Card Holder Name");
		
		Collections.sort(list,new CardHolderNameComparator());
		
		print(list);
		
		 
		
	}

}
