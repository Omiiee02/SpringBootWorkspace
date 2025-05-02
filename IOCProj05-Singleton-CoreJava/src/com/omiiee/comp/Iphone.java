package com.omiiee.comp;

public class Iphone {

	private static Iphone iphone;
	
	private Iphone() {}
	
	public static Iphone getInstance() {
		if(iphone==null)
			iphone = new Iphone();
		
		return iphone;
	}
}
