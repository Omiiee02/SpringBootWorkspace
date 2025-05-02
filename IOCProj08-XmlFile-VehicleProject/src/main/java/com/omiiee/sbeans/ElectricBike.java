package com.omiiee.sbeans;

import org.springframework.stereotype.Component;

@Component("eBike")
public class ElectricBike implements IVehicle{

	@Override
	public void start() {
		System.out.println("Electric bike started");
	}
	
	@Override
	public void stop() {
	System.out.println("Electric bike stopped...");	
	}
}
