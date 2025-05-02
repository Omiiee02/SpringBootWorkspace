package com.ok.components;

public class BMW implements Bike {

	@Override
	public String drive() {
		return "You are driving BMW";
	}

	@Override
	public String engine() {
		return "Petrol Engine";
	}

	@Override
	public String stop() {
		return "BMW Stopped";
	}

}
