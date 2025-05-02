package com.ok.sbeans;

import org.springframework.stereotype.Component;

@Component("vi")
public class VI implements ISim {

	@Override
	public void call(String number) {
		System.out.println("Calling to "+number);
	}

	@Override
	public void sms(String number,String msg) {
		System.out.println("Sending  sms to "+number+" => "+msg);
	}

	@Override
	public void vc(String number) {
		System.out.println("Video calling to "+number);
	}

}
