package com.ok.main;

import com.ok.sbeans.PizzaShop;

public class Main {

	public static void main(String[] args) {
		PizzaShop s = new PizzaShop();
		String msg =s.createOrder("Omkar", "Pune","With Extra cheese");
		System.out.println(msg);
		
	}
}
