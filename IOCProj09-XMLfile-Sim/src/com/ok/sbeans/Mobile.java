package com.ok.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Autowired
	@Qualifier("sim")
	private ISim sim;
	
	public void insertSim() {
		sim.call("+91 7769963188");
		System.out.println();
		sim.sms("+91 9175451717", "Hello how are you...");
		System.out.println();
		sim.vc("+91 9019765829");
	}

}
