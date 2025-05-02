package com.ok.main;

import java.util.Scanner;

import com.ok.components.Bike;
import com.ok.factory.BikeFactory;

public class CustomerBooking {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Bike bike = null;
		
		System.out.println("Welcome to Bike ShowRoom");
		System.out.println("==========================");
		System.out.println("Choose your bike\n1. Ather\n2. BMW\n3.R15");
		
		System.out.println("Select an option :");
		int choice = scn.nextInt();
		
		if(choice == 1) {
			bike = BikeFactory.createBike("ather");
			System.out.println(bike.drive()+"\n"+bike.engine()+"\n"+bike.stop());
		} else if(choice == 2) {
			bike = BikeFactory.createBike("bmw");
			System.out.println(bike.drive()+"\n"+bike.engine()+"\n"+bike.stop());
		}else if(choice == 3) {
			bike = BikeFactory.createBike("r15");
			System.out.println(bike.drive()+"\n"+bike.engine()+"\n"+bike.stop());
		}
		
	}
}
