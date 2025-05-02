package com.ok.sbeans;

import java.time.LocalTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pizzaShop")
@Data
public class PizzaShop {

		private int orderId;
		private String name, adds, description, ETA;
		private LocalTime date;

	@Autowired
	private  LocalTime time;

	public String createOrder(String name, String adds,String des ) {
		System.out.println(time);
		int id = new Random().nextInt(200)*3;
		orderId = id;
		setName(name); setAdds(adds); setDescription(des);
		setETA("Your pizza will be delivered in 30 mins");
		setDate(time);
		setOrderId(id);
		return "Oder is recieved successfully, name: "+name+" will be delivered to "+adds+" and amt to paid is "+orderId+" | "+date;
		//return shop;
		
	}
}
