package com.training.models;

import com.training.ifaces.Automobile;

public class ToyotoCar implements Automobile{

	@Override
	public String getColor() {
		return "White";
	}

	@Override
	public String getModel() {
		return "etios";
	}

	@Override
	public double getPrice() {
		return 1200000;
	}

	
	
}
