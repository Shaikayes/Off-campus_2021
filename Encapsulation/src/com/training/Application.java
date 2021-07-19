package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice tv = new Invoice();
		tv.setRatePerUnit(20000.00);
		tv.setInvoiceNumber(101);
		tv.setQuantity(9);
		System.out.println("Price:=" + tv.calculate());
		
		Invoice fridge = new Invoice();
		fridge.setRatePerUnit(-12000.00);
		fridge.setInvoiceNumber(102);
		fridge.setQuantity(1);
		System.out.println("Price:=" + fridge.calculate());
		
	}

}
