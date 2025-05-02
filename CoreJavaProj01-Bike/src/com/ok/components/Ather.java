package com.ok.components;

public class Ather implements Bike {

	@Override
	public String drive() {
		return "You are driving Ather";
	}

	@Override
	public String engine() {
		return "Battery Vehicle";
	}

	@Override
	public String stop() {
		return "Ather Stopped";
	}

}
