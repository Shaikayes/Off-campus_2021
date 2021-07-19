package com.training.models;

import com.training.ifaces.Automobile;

public class ShowRoom {

	// Factory Method
	
	public Automobile  getProduct(int key) {
	
		switch (key) {
		case 1:
			
			return new BajajBike();
		case 2:
			 return new YamahaBike();
		default:
			return null;
		}
		
		
	}
	
	
	public void printQuote(Automobile auto) {
		
		System.out.println(Automobile.NAME);

		System.out.println(auto.getModel());
		System.out.println(auto.getColor());
		System.out.println(auto.getPrice());
		
	}
	
}
