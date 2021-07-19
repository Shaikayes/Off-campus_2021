package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Invoice {
	
	Product product;
	Customer customer;
	
	@Autowired
	public Invoice(@Qualifier("tv") Product product, @Qualifier("ram") Customer customer) {
		super();
		this.product = product;
		this.customer = customer;
	}
	

}
