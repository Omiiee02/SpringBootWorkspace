package com.omiiee.sbeans;

import org.springframework.stereotype.Component;

@Component("bullent")
public class Bullet implements IVehicle {

	@Override
	public void start() {
	System.out.println("Bullet Started");

	}

	@Override
	public void stop() {
		System.out.println("Bullet Stopper");
		}

}
