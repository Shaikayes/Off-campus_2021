package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component("inv2")
@NoArgsConstructor
@Getter
@ToString

public class InvoicewithSetterDI {
	private Customer customer;
	@Autowired
	private Product product;
	@Autowired
	public void setCustomer(@Qualifier("raheem") Customer customer) {
		this.customer = customer;
	}


}
