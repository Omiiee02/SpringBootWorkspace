package com.ok.factory;

import com.ok.components.Ather;
import com.ok.components.BMW;
import com.ok.components.Bike;
import com.ok.components.R15;

public class BikeFactory {
	
	public static Bike createBike(String name) {
		Bike bike = null;
		if(name.equalsIgnoreCase("ather")) {
			bike = new Ather();
			System.out.println("You Selected "+name);
		} else if(name.equalsIgnoreCase("bmw")) {
			bike= new BMW();
			System.out.println("You selected "+ name);
		}else if(name.equalsIgnoreCase("r15")) {
			bike = new R15();
			System.out.println("You selected "+ name);			
		}else 
			throw new IllegalArgumentException("Bike Not found");
		
		return bike;
	}
}
