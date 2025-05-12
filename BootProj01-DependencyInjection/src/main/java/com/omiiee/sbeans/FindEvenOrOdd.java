package com.omiiee.sbeans;

import org.springframework.stereotype.Component;

@Component("evenOdd")
public class FindEvenOrOdd {

	public void findNumberEO(int number) {
		if(number < 0) 
			throw new IllegalArgumentException("Enter Positive number...");
		
		if(number%2==0)
			System.out.println("Number is even.     ["+number+"]");
		else
			System.out.println("Number is odd.     ["+number+"]");
	}
}
