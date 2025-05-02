package com.omiiee.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("motor")
	private IVehicle vehicle;
	
		public void startJourney(String start, String destination) {
			vehicle.start();
			System.out.println("Journey start from "+start);
			vehicle.stop();
			System.out.println("Journey ended at "+destination);
		}
}
