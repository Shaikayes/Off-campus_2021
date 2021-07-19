package com.training.models;

import com.training.ifaces.Automobile;

public class BajajBike implements Automobile {

	@Override
	public String getColor() {
		return "Blue";
	}

	@Override
	public String getModel() {
		return "Pulsar";
	}

	@Override
	public double getPrice() {
		return 150000.00;
	}

}
