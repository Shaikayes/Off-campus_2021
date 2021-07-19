package com.training;

import com.training.ifaces.Automobile;
import com.training.models.NewShowRoom;
import com.training.models.ShowRoom;

import java.util.*;
public class Application {

	public static void main(String[] args) {

		
		ShowRoom saimotor = new NewShowRoom();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for bajaj 2 for yamaha 3 for maruti car");
		
		int key = sc.nextInt();
		
		
		  Automobile auto =saimotor.getProduct(key);
		  
		  if(auto!=null) {
		    saimotor.printQuote(auto);
		  } else {
			  System.out.println("Invalid choice");
		  }
		sc.close();
	}

}
