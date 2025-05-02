package com.omiiee.main;

import com.omiiee.comp.Iphone;

public class IphoneUser {

	public static void main(String[] args) {
		Iphone i = Iphone.getInstance();
		Iphone i2 = Iphone.getInstance();
		System.out.println(i.hashCode()+"   "+i2.hashCode());
		System.out.println("hascode=="+(i.hashCode()==i2.hashCode()));
	}
	
}
