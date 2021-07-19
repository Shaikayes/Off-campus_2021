package com.training.services;

import java.util.HashSet;
import java.util.List;

import com.training.ifaces.Invoice;

public class Application {

	public static void main(String[] args) {
		Invoice tv = new Invoice();
		tv.setRatePerUnit(20000.00);
		tv.setInvoiceNumber(101);
		tv.setQuantity(9);
		System.out.println("Price:=" + tv.calculate());
		
		Invoice fridge = new Invoice();
		fridge.setRatePerUnit(12000.00);
		fridge.setInvoiceNumber(102);
		fridge.setQuantity(1);
		System.out.println("Price:=" + fridge.calculate());
		
		InvoiceServices service= new InvoiceServices();
		service.save(tv);
		service.save(fridge);
		
		List<Invoice> list = service.findAll();
		for(Invoice eachElement:list)
		{
			System.out.println(eachElement);
		}
		
		HashSet<Invoice> set= new HashSet<>();
		System.out.println(set.add(fridge));
		System.out.println(set.add(tv));

		System.out.println(set.add(fridge));

		System.out.println(set);
		System.out.println("size:=" + set.size());


		
	}

}
