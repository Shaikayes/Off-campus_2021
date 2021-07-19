package com.training.models;

import com.training.ifaces.Automobile;

public class YamahaBike implements Automobile {

	@Override
	public String getColor() {
		return "Orange";
	}

	@Override
	public String getModel() {
		return "mt15";
	}

	@Override
	public double getPrice() {
		return 1750000.00;
	}

}
